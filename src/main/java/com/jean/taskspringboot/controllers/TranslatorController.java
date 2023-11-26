package com.jean.taskspringboot.controllers;

import com.jean.taskspringboot.services.TranslatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/translations")
public class TranslatorController {

    private final TranslatorService translatorService;

    public TranslatorController(TranslatorService translatorService){
        this.translatorService = translatorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTranslation(@PathVariable int id,
                                                 @RequestParam String language){
        String translatedText = translatorService.getTranslation(id, language);
        return ResponseEntity.ok().body(translatedText);
    }

}
