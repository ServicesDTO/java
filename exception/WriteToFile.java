package exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public  class WriteToFile {
    public static void addToFile(String filename, String record) throws IOException {
        File file = new File(filename + ".txt");
        FileWriter fw;
        BufferedWriter bw;
        
        if (file.exists()) {
            // Если файл существует, добавляем запись в конец файла
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
        } else {
            // Если файла не существует, создаем новый файл и записываем в него данные
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(record +"\n");
            bw.close();
            return;
        }

        bw.write(record);
        bw.close();
    }
}
