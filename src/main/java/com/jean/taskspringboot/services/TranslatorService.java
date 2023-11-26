package com.jean.taskspringboot.services;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class TranslatorService {

    private Map<Integer, Map<String, String>> translations = new HashMap<>();

    public TranslatorService(){
        Map<String, String> translationsForId1 = new HashMap<>();
        translationsForId1.put("en", "Cat");
        translationsForId1.put("de", "Katze");
        translationsForId1.put("it", "Gatto");
        translations.put(1, translationsForId1);

        Map<String, String> translationsForId2 = new HashMap<>();
        translationsForId2.put("en", "Dog");
        translationsForId2.put("de", "Hund");
        translationsForId2.put("it", "Cane");
        translations.put(2, translationsForId2);

        Map<String, String> translationsForId3 = new HashMap<>();
        translationsForId3.put("en", "Horse");
        translationsForId3.put("de", "Pferd");
        translationsForId3.put("it", "Cavallo");
        translations.put(3, translationsForId3);
    }

    public String getTranslation(final int id, final String languageCode){
        Map<String, String> translationsForId = translations.get(id);
        if (translationsForId != null) {
            return translationsForId.getOrDefault(languageCode, "Translation not found");
        }
        return "ID not found";
    }

}
