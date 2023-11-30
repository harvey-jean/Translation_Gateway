package com.jean.translator.services;

import com.jean.translator.constants.TranslatorDataProvider;
import com.jean.translator.entities.Translator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TranslatorService {

    private final TranslatorDataProvider translatorDataProvider;

    public String getTranslation(final int id, final String languageCode){

        final Translator translationForId = translatorDataProvider.tranlationsDatasInitializer()
                                                            .stream()
                                                            .filter(t -> t.getId() == id)
                                                            .findFirst()
                                                            .orElse(null);

        if(translationForId != null){
            return switch (languageCode) {
                case "en" -> translationForId.getTextInEnglish();
                case "de" -> translationForId.getTextInDeutch();
                case "it" -> translationForId.getTextInItalian();
                default -> "Language Code not found";
            };
        }

        return "ID not found";
    }

}
