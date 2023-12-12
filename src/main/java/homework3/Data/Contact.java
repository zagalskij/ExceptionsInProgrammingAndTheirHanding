package homework3.Data;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Contact {
    private String fio;
    private String dateOfBirth;
    private long phoneNumber;
    private char sex;
    private boolean thePresenceOfFio = false;
    private boolean thePresenceOfDateOfBirth= false;
    private boolean thePresenceOfPhoneNumber = false;
    private boolean thePresenceOfSex = false;

    public Contact(String fio, String dateOfBirth, int phoneNumber, char sex) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getFio() {
        return fio;
    }

    public Contact() {
    }

    public void detectAndAddData(String[] inputArr) throws MoreThanOneFieldException{
        if (inputArr.length != 6) {
            throw new RuntimeException("Error: Incorrect amount of data. Enter all the necessary parameters.");
        }
        for (int i = 0; i < inputArr.length; i++) {
            String data = inputArr[i];

            if (Checker.isLastName(data)) {
                if (!thePresenceOfFio){
            this.fio = data +" "+inputArr[i+1]+" "+inputArr[i+2];
            i=i+2;
                continue;}else throw new MoreThanOneFieldException("fio");}

            if (Checker.isValidPhoneNumber(data)){
                if (!thePresenceOfPhoneNumber){

            try {
                this.phoneNumber = Long.parseLong(data);
                thePresenceOfPhoneNumber = true;
                continue;
            }
            catch (Exception e)
            {
                System.err.println("Ошибка: " + e.getMessage());
            }
            }else throw new MoreThanOneFieldException("phoneNumber");}
            if (Checker.isDateOfBirth(data))
                if(!thePresenceOfDateOfBirth)
                {
            this.dateOfBirth = data;
                continue;}
                else throw new MoreThanOneFieldException("dateOfBirth");
         if (Checker.isValidGender(data)){
             if (!thePresenceOfSex) {
                 this.sex = data.charAt(0);
                 continue;
             }
             throw new MoreThanOneFieldException("sex");

    }
}}

    @Override
    public String toString() {
        return "fio='" + fio + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", sex=" + sex + "\n";
    }
}
