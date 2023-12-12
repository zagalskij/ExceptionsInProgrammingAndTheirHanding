package homework3.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public static boolean isLastName(String input) {
        // Регулярное выражение для ФИО
        String regex = "^[А-Яа-яЁё\\-]+$";

        // Создаем Pattern и Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Проверка совпадения
        return matcher.matches();
    }
    public static boolean isValidPhoneNumber(String input) {
        // Проверка, что строка состоит только из цифр и не начинается с нуля
        return input.matches("[1-9]\\d*");
    }
    public static boolean isDateOfBirth(String input) {
        // Указываем ожидаемый формат даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        dateFormat.setLenient(false); // Устанавливаем строгий режим

        try {
            Date date = dateFormat.parse(input);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    public static boolean isValidGender(String input) {
        // Проверка, равна ли строка "m" или "f"
        return input.equalsIgnoreCase("m") || input.equalsIgnoreCase("f");
    }
}

