package com.jean.translator.service;

import com.jean.translator.constant.CustomizedMessageProvider;
import com.jean.translator.repository.TranslatorDataProvider;
import com.jean.translator.entity.TranslatorKey;
import org.springframework.stereotype.Service;

@Service
public class TranslatorService {

    public String getTranslation(final int id, final String language){

        return TranslatorDataProvider
                .translationsStore
                .getOrDefault(new TranslatorKey(id, language), CustomizedMessageProvider.TRANSLATION_NOT_FOUND);
    }

}
