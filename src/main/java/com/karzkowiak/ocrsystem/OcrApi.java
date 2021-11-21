package com.karzkowiak.ocrsystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class OcrApi {

    private OcrService ocrService;

    public OcrApi(OcrService ocrService) {
        this.ocrService = ocrService;
    }

    @PostMapping("/api/ocr")
    public String doOcr(@RequestBody Graphic graphic) {
        return ocrService.doOCR(graphic.getUrl());
    }
}
