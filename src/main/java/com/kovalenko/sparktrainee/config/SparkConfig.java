package com.kovalenko.sparktrainee.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkConfig {

    @Value("${spark.app.name}")
    private String appName;
    @Value("${spark.master}")
    private String master;

    @Bean
    private SparkConf sparkConf() {
        return new SparkConf().setAppName(appName).setMaster(master);
    }

    @Bean
    public JavaSparkContext sparkContext() {
        return new JavaSparkContext(sparkConf());
    }
}
