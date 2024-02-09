package FactoryMethod.translators;

import FactoryMethod.dictionaries.Dictionary;
import FactoryMethod.dictionaries.SpanishDictionary;

public class SpanishTranslator extends Translator {
    @Override
    protected Dictionary getDictionary() {
        return new SpanishDictionary();
    }
}
