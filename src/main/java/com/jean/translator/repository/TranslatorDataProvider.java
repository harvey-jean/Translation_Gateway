package com.jean.translator.repository;

import com.jean.translator.entity.TranslatorKey;
import java.util.HashMap;
import java.util.Map;

public class TranslatorDataProvider {

    public static final Map<TranslatorKey, String> translationsStore = new HashMap<>();

    static {
        translationsStore.put(TranslatorKey.create(1,"en"), "Cat");
        translationsStore.put(TranslatorKey.create(1,"de"), "Katze");
        translationsStore.put(TranslatorKey.create(1,"it"), "Gatto");

        translationsStore.put(TranslatorKey.create(2,"en"), "Dog");
        translationsStore.put(TranslatorKey.create(2,"de"), "Hund");
        translationsStore.put(TranslatorKey.create(2,"it"), "Cane");

        translationsStore.put(TranslatorKey.create(3,"en"), "Horse");
        translationsStore.put(TranslatorKey.create(3,"de"), "Pferd");
        translationsStore.put(TranslatorKey.create(3,"it"), "Cavallo");
    }

}
