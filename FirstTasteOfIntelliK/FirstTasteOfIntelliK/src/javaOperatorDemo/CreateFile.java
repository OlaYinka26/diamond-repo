package javaOperatorDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void createOurFirstFile() {
        String fileName = "\\src\\SecondNewClassNote.txt";
        String rootPath = System.getProperty("user.dir");       //C:\JavaExamples\ExampleA\FirstTasteOfIntelliK\FirstTasteOfIntelliK
        String filePath = rootPath + fileName;
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void writeIntoFile() {
        String fileName = "\\src\\ThirdNewClassNote.properties";
        String rootPath = System.getProperty("user.dir");  //C:\JavaExamples\ExampleA\FirstTasteOfIntelliK\FirstTasteOfIntelliK\src\
        String filePath = rootPath + fileName;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("This is our first file we are writing \n We are happy with the training");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


