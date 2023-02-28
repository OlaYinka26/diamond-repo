package javaOperatorDemo;

import stringOperators.ReadingFile;

public class InputRunner {
    public static void main(String[] args) {
        //CreateFile createFile = new CreateFile();
        //createFile.createOurFirstFile();
        //createFile.writeIntoFile();

        ReadingFile readingFile = new ReadingFile();
        //readingFile.readPlainText();
        readingFile.readPropertiesText();
    }
}
