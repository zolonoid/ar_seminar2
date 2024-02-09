package FactoryMethod.translators;

import FactoryMethod.dictionaries.Dictionary;

import java.util.ArrayList;
import java.util.List;

public abstract class Translator {
    public String translate(String text) {
        String[] words = text.split(" ");
        List<String> result = translateWords(words);
        return String.join(" ", result);
    }

    private List<String> translateWords(String[] words) {
        Dictionary dict = getDictionary();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String trans = dict.translateWord(word);
            result.add(trans);
        }
        return result;
    }

    // Фабричный метод.
    protected abstract Dictionary getDictionary();
}
