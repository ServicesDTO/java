package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static Date parseDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false); // Устанавливаем строгий режим проверки формата

        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Неверный формат даты рождения. Ожидается формат dd.mm.yyyy.");
        }
    }

    public static void main(String[] args) throws Exception {

        String name, middleName, gender, record, lastName;

        Integer num;
        Date dateOfBirth;

        System.out
                .println("Введите данные в следующем формате: \nФамилия Имя Отчество дата_рождения номер_телефона пол");

        try (Scanner scan = new Scanner(System.in);) {
            String inputString = scan.nextLine();
            String[] wordsArray = inputString.split(" ");

            if (wordsArray.length != 6) {
                System.out.println(wordsArray.length);
                throw new Exception("Недостаточно данных");
            } else {
                lastName = wordsArray[0];
                name = wordsArray[1];
                middleName = wordsArray[2];
                dateOfBirth = parseDate(wordsArray[3]);
                num = Integer.parseInt(wordsArray[4]);
                gender = wordsArray[5];
                if (!gender.equals("f") && !gender.equals("m")) {
                    throw new Exception("Неправильно указан пол!");
                }
                record = String.format("%s %s %s %s %s %s",
                        lastName, name, middleName, dateOfBirth, num, gender);
                WriteToFile.addToFile(lastName ,record);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.err.println(e);

        }

    }
}
