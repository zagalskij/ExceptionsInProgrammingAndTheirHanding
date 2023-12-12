package homework3;

import homework3.Data.Contact;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }
    public String getString(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }
    public String getChar(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }

    // print(f'{title} = {data}')
    public void print(Contact data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
