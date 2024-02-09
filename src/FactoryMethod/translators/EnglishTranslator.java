package FactoryMethod.translators;

import FactoryMethod.dictionaries.Dictionary;
import FactoryMethod.dictionaries.EnglishDictionary;

public class EnglishTranslator extends Translator {
    @Override
    protected Dictionary getDictionary() {
        return new EnglishDictionary();
    }
}
