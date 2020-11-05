package com.epam.kaliada.strings.regextask2;

public class NotepadXml {
    private String[][] nodes;

    public void parsingXmlDocument(String xmlDocument){
        XmlParser xmlParser = new XmlParser(xmlDocument);
        int numberOfTags = xmlParser.tagsCount();
        nodes = new String[numberOfTags][3];
        xmlParser.splitsIntoNodes(nodes);
    }

    public String[][] getNodes() {
        return nodes;
    }
}
