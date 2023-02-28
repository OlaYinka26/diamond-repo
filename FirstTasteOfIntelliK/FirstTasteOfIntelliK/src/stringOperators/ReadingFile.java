package stringOperators;

import java.io.*;
import java.util.Properties;

public class ReadingFile {
    public void readPlainText(){
        String rootPath = System.getProperty("user.dir");
        String fileName = "\\src\\Note";
        String fullFilePath = rootPath + fileName;
        String line = null;

        try {
            FileReader fileReader = new FileReader(fullFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null ) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void readPropertiesText(){


        String rootPath = System.getProperty("user.dir");
        String fileName = "\\src\\ThirdNewClassNote.properties";
        String fullFilePath = rootPath + fileName;
    try {
        FileInputStream fiss = new FileInputStream(fullFilePath);
        Properties prop = new Properties();
        prop.load (fiss);
        System.out.println(prop);
    } catch (FileNotFoundException e)  {
        e.printStackTrace();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }

}
