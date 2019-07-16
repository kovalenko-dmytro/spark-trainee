package com.kovalenko.sparktrainee.controller.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadFormController {

    @GetMapping(value = "upload")
    public String upload() {
        return "upload/upload-form";
    }
}
