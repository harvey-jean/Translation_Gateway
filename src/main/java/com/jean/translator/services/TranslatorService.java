package com.jean.translator.services;

import com.jean.translator.constants.TranslatorDataProvider;
import com.jean.translator.entities.Translator;
import org.springframework.stereotype.Service;

@Service
public class TranslatorService {

    public String getTranslation(final int id, final String language){

        return TranslatorDataProvider
                .translations
                .getOrDefault(new Translator(id, language), TranslatorDataProvider.TRANSLATION_NOT_FOUND);
    }

}
