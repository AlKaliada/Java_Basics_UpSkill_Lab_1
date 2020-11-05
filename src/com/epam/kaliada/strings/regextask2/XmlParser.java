package com.epam.kaliada.strings.regextask2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlParser {
    private String xmlDocument;

    public XmlParser(String stringXml) {
        this.xmlDocument = stringXml;
    }

    public void splitsIntoNodes(String[][] nodes){
        PatternMaker patternMaker = new PatternMaker();
        Pattern patternOfOpeningTag = new PatternMaker().getPatternOfOpeningTag();
        Matcher matcherOfOpeningTag = patternOfOpeningTag.matcher(xmlDocument);
        int i = 0;
        while (matcherOfOpeningTag.find()){
            String tagName = matcherOfOpeningTag.group(2);
            String openingTag = matcherOfOpeningTag.group();
            nodes[i][0] = openingTag;
            Pattern patternClosingTag = patternMaker.makePatternOfClosingTag(tagName);
            Matcher matcherClosingTag = patternClosingTag.matcher(xmlDocument);
            int firstIndexOfOpeningTagName = matcherOfOpeningTag.start();
            matcherClosingTag.find(firstIndexOfOpeningTagName);
            int firstIndexOfTagBody = matcherOfOpeningTag.end();
            int firstIndexOfClosingTag = matcherClosingTag.start();
            String tagBody = xmlDocument.substring(firstIndexOfTagBody, firstIndexOfClosingTag);
            nodes[i][1] = tagBody;
            String closingTag = matcherClosingTag.group();
            nodes[i][2] = closingTag;
            i++;
        }
    }

    public int tagsCount(){
        Pattern patternOfOpeningTag = new PatternMaker().getPatternOfOpeningTag();
        Matcher matcherOfOpeningTag = patternOfOpeningTag.matcher(xmlDocument);
        int count = 0;
        while (matcherOfOpeningTag.find()){
            count++;
        }
        return count;
    }

}
