package ru.zagalskij.api.seminar1.Task0;


import ru.zagalskij.api.seminar1.Task0.Data.MyArray;

public class Presenter {
    View view;

    public Presenter(View view) {
        this.view = view;
    }
    public void buttonClick() {

        int minArray = view.getValue("Enter the minimum length of the array: ");
        int findValue = view.getValue("Enter the desired number: ");
        MyArray array = new MyArray();
        int[] array1 = array.generateRandomArray();
        array1 =new int[] {0,0,0,0};

        int result = array.findValueIndex(array1,findValue,minArray);
        switch (result) {
            case -1:
                System.out.println("Error: The length of the array is less than the specified minimum.");
                break;
            case -2:
                System.out.println("The desired element was not found.");
                break;
            case -3:
                System.out.println("Error: null was passed instead of an array.");
            case -4:
                System.out.println("All elements of the array are zero");
                break;
            default:
                System.out.println("The desired element " + findValue+ " found by index: " + result);
                break;
        }
    }
}
