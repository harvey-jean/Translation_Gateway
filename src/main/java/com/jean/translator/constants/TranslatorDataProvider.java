package com.jean.translator.constants;

import com.jean.translator.entities.Translator;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class TranslatorDataProvider {

    private final List<Translator> translations = new ArrayList<>();

    public List<Translator> tranlationsDatasInitializer(){
        translations.add(new Translator(1,"Cat","Katze","Gatto"));
        translations.add(new Translator(2, "Dog","Hund","Cane"));
        translations.add(new Translator(3,"Horse","Pferd","Cavallo"));

        return translations;
    }

}
