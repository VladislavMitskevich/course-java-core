package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.Collection;
import java.util.Iterator;

public class StringCollectionUtil {
    public Collection<String> resetWordsByLength(Collection<String> arrayOfWords, int wordLength) {
        String[] newArrayWords = arrayOfWords.toArray(new String[0]);
        arrayOfWords.clear();
        for (int i = 0; i < newArrayWords.length; i++) {
            if (newArrayWords[i].length() == wordLength) {
                newArrayWords[i] = "*";
            }
            arrayOfWords.add(newArrayWords[i]);
        }
        return arrayOfWords;
    }

    public Collection<String> removeWordsByLength(Collection<String> arrayOfWords, int wordLength){
        Iterator<String> i = arrayOfWords.iterator();
        while(i.hasNext()) {
            String word = i.next();
            if (word.length() == wordLength) {
                i.remove();
            }
        }
        return arrayOfWords;
    }
}
