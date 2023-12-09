package com.jean.translator.controller;

import com.jean.translator.service.TranslatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/translations")
@RequiredArgsConstructor
public class TranslatorController {

    private final TranslatorService translatorService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getTranslation(@PathVariable int id,
                                                 @RequestParam String language){
        String translatedText = translatorService.getTranslation(id, language);
        return ResponseEntity.ok().body(translatedText);
    }

}
