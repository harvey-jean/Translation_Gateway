package com.jean.translator.repository;

import com.jean.translator.entity.TranslatorKey;
import java.util.HashMap;
import java.util.Map;

public class TranslatorDataProvider {

    public static final Map<TranslatorKey, String> translationsStore = new HashMap<>();

    static {
        translationsStore.put(new TranslatorKey(1,"en"), "Cat");
        translationsStore.put(new TranslatorKey(1,"de"), "Katze");
        translationsStore.put(new TranslatorKey(1,"it"), "Gatto");

        translationsStore.put(new TranslatorKey(2,"en"), "Dog");
        translationsStore.put(new TranslatorKey(2,"de"), "Hund");
        translationsStore.put(new TranslatorKey(2,"it"), "Cane");

        translationsStore.put(new TranslatorKey(3,"en"), "Horse");
        translationsStore.put(new TranslatorKey(3,"de"), "Pferd");
        translationsStore.put(new TranslatorKey(3,"it"), "Cavallo");
    }

}
