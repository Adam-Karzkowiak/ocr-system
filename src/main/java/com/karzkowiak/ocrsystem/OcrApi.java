package com.karzkowiak.ocrsystem;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/ocr")
class OcrApi {

    private final OcrService ocrService;
    private final GraphicRepository repository;

    public OcrApi(OcrService ocrService, GraphicRepository repository) {
        this.ocrService = ocrService;
        this.repository = repository;
    }

    @PostMapping
    public String doOcr(@RequestParam String url) {
        String ocr = ocrService.doOCR(url);
        Graphic graphic = Graphic.create(url,ocr);
        System.out.println("Created graphic with id "+graphic.getId());
        repository.save(graphic);
        return ocr;
    }

    @GetMapping
    public Iterable<Graphic> getGraphic() {
        return repository.findAll();
    }

}
