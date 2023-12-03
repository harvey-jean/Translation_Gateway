package com.jean.translator.constants;

import com.jean.translator.entities.Translator;
import java.util.HashMap;
import java.util.Map;

public class TranslatorDataProvider {

    public static final Map<Translator, String> translations = new HashMap<>();
    public static final String TRANSLATION_NOT_FOUND = "Translation not found";

    static {
        translations.put(new Translator(1,"en"), "Cat");
        translations.put(new Translator(1,"de"), "Katze");
        translations.put(new Translator(1,"it"), "Gatto");

        translations.put(new Translator(2,"en"), "Dog");
        translations.put(new Translator(2,"de"), "Hund");
        translations.put(new Translator(2,"it"), "Cane");

        translations.put(new Translator(3,"en"), "Horse");
        translations.put(new Translator(3,"de"), "Pferd");
        translations.put(new Translator(3,"it"), "Cavallo");
    }

}
