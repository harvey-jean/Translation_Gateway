package com.jean.taskspringboot.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TranslatorServiceTest {

    TranslatorService translatorService = new TranslatorService();

    @Test
    public void testTranslate_ReturnsCorrectTranslationsAsExpected(){

        assertEquals("Cat", translatorService.getTranslation(1,"en"));
        assertEquals("Hund", translatorService.getTranslation(2,"de"));
        assertEquals("Cavallo", translatorService.getTranslation(3,"it"));
    }

    @Test
    public void testTranslate_ReturnsIdNotFound(){
        assertEquals("ID not found", translatorService.getTranslation(4,"en"));
    }

    @Test
    public void testTranslate_Returns(){
        assertEquals("", translatorService.getTranslation(1,"fr"));
    }

}