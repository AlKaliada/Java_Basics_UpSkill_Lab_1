package com.epam.kaliada.strings.regextask2;

import java.util.regex.Pattern;

public class PatternMaker {
    private Pattern patternOfOpeningTag;

    public PatternMaker() {
        this.patternOfOpeningTag = makePatternOfTag();
    }

    public Pattern getPatternOfOpeningTag() {
        return patternOfOpeningTag;
    }

    private Pattern makePatternOfTag(){
        Pattern pattern = Pattern.compile("<((\\w+)[\\w\\s=\"]*)>");
        return pattern;
    }

    public Pattern makePatternOfClosingTag(String tagName){
        Pattern pattern = Pattern.compile("</" + tagName + ">");
        return pattern;
    }
}
