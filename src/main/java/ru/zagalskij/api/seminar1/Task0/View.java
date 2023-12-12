package ru.zagalskij.api.seminar1.Task0;

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
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
