package com.keerti.springmvc.controller;

import java.io.File;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/images")
public class ImageController {

    private static final String UPLOAD_DIR = "uploads/";

    @GetMapping("/{filename:.+}")
    public FileSystemResource getImage(@PathVariable String filename) {
        return new FileSystemResource(new File(UPLOAD_DIR + filename));
    }
}