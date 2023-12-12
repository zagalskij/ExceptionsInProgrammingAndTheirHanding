package homework3.Data;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    public void save(Contact data){
        try(FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + "/src/main/java/homework3/" + data.getFio() + ".txt",true)){
            fileWriter.write(data.toString());
        }catch (IOException e){
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
