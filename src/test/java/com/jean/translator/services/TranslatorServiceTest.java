package com.jean.translator.services;

import com.jean.translator.constants.TranslatorDataProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TranslatorServiceTest {

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
                                                                          String languageCode,
                                                                          String expectedText){
        //Given
        TranslatorDataProvider translatorDataProvider= new TranslatorDataProvider();
        TranslatorService translatorService = new TranslatorService(translatorDataProvider);
        //When
        String translatedText = translatorService.getTranslation(id,languageCode);
        //Then
        assertEquals(expectedText, translatedText);
    }

    @ParameterizedTest
    @CsvSource({
            "4, en, ID not found",
            "5, de, ID not found",
            "6, it, ID not found"
    })
    public void testTranslate_itShouldReturnIdNotFound(int id,
                                                       String languageCode,
                                                       String expectedText){
        //Given
        TranslatorDataProvider translatorDataProvider= new TranslatorDataProvider();
        TranslatorService translatorService = new TranslatorService(translatorDataProvider);
        //When
        String translatedText = translatorService.getTranslation(id,languageCode);
        //Then
        assertEquals(expectedText, translatedText);

    }

    @ParameterizedTest
    @CsvSource({
            "1, fr, Language Code not found",
            "2, ru, Language Code not found",
            "3, cn, Language Code not found"
    })
    public void testTranslate_itShouldReturnLanguageCodeNotFound(int id,
                                                                 String languageCode,
                                                                 String expectedText){
        //Given
        TranslatorDataProvider translatorDataProvider= new TranslatorDataProvider();
        TranslatorService translatorService = new TranslatorService(translatorDataProvider);
        //When
        String translatedText = translatorService.getTranslation(id,languageCode);
        //Then
        assertEquals(expectedText, translatedText);

    }

}