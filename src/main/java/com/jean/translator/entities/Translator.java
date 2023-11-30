package com.jean.translator.entities;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Translator {
    private int id;
    private String textInEnglish;
    private String textInDeutch;
    private String textInItalian;
}
