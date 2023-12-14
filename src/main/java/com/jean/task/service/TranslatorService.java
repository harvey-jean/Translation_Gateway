package com.jean.task.service;

import com.jean.task.constant.CustomizedMessageProvider;
import com.jean.task.repository.TranslatorDataProvider;
import com.jean.task.entity.TranslatorKey;
import org.springframework.stereotype.Service;

@Service
public class TranslatorService {

    public String getTranslation(final int id, final String language){

        return TranslatorDataProvider
                .translationsStore
                .getOrDefault(new TranslatorKey(id, language), CustomizedMessageProvider.TRANSLATION_NOT_FOUND);
    }

}
