package homework3;

import homework3.Data.Contact;
import homework3.Data.SaveToFile;

import java.util.HashMap;
import java.util.Map;

import static java.util.HashMap.newHashMap;

public class Presenter {
    View view = new View();
    SaveToFile save = new SaveToFile();
    Contact contact = new Contact();
    public void buttonAdd() {

        String userInput = view.getString("Enter the data in any order:\n");
        String[] inputArr = userInput.split(" ");
        contact.detectAndAddData(inputArr);
        view.print(contact,"");
    }
    public void buttonSave(){
        save.save(contact);
    }
}
