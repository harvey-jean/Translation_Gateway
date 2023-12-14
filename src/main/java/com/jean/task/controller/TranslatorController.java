package com.jean.task.controller;

import com.jean.task.service.TranslatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/translation")
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
