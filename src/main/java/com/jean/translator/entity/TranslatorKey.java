package com.jean.translator.entity;


public record TranslatorKey(int id, String language) {

    public static TranslatorKey create(int id, String language){
        return new TranslatorKey(id, language);
    }
}
