package com.epam.kaliada.strings.regextask2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlParser {
    private String stringXml;

    public XmlParser(String stringXml) {
        this.stringXml = stringXml;
    }

    public void splitsIntoNodes(){
        PatternMaker patternMaker = new PatternMaker();
        Pattern pattern = patternMaker.getPatternOfTag();
        Matcher matcher = pattern.matcher(stringXml);
        while (matcher.find()){
            String tagName = matcher.group(2);
            String openingTag = matcher.group();
            System.out.println(openingTag);
            Pattern patternClosingTag = patternMaker.makePatternOfClosingTag(tagName);
            Matcher matcherClosingTag = patternClosingTag.matcher(stringXml);
            int firstIndexOfOpeningTagName = matcher.start();
            matcherClosingTag.find(firstIndexOfOpeningTagName);
            int firstIndexOfTagBody = matcher.end();
            int firstIndexOfClosingTag = matcherClosingTag.start();
            String tagBody = stringXml.substring(firstIndexOfTagBody, firstIndexOfClosingTag);
            System.out.println(tagBody);
            String closingTag = matcherClosingTag.group();
            System.out.println(closingTag);
            System.out.println("............................................");
        }
    }

}
