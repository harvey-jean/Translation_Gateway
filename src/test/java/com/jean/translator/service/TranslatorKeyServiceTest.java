package com.jean.translator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TranslatorKeyServiceTest {

    @ParameterizedTest
    @CsvSource({
            "1, en, Cat",
            "1, de, Katze",
            "1, it, Gatto",
            "2, en, Dog",
            "2, de, Hund",
            "2, it, Cane",
            "3, en, Horse",
            "3, de, Pferd",
            "3, it, Cavallo"
    })
    public void testTranslate_itShouldReturnCorrectTranslationsAsExpected(int id,
                                                                          String language,
                                                                          String expectedTranslation){
        //Given
        TranslatorService translatorService = new TranslatorService();
        //When
        String translatedTextResult = translatorService.getTranslation(id,language);
        //Then
        assertEquals(expectedTranslation, translatedTextResult);
    }

    @ParameterizedTest
    @CsvSource({
            "4, en, Translation not found",
            "5, de, Translation not found",
            "6, it, Translation not found"
    })
    public void testTranslate_itShouldReturnTranslationNotFound(int id,
                                                                String language,
                                                                String expectedTranslation){
        //Given
        TranslatorService translatorService = new TranslatorService();
        //When
        String translatedText = translatorService.getTranslation(id,language);
        //Then
        assertEquals(expectedTranslation, translatedText);

    }

}