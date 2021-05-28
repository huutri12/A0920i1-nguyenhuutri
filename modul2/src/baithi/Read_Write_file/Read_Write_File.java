package baithi.Read_Write_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_File {
    public static void write_File(final String PATH, String data){
        FileWriter fileWriter;
        BufferedWriter bf;
        try {
            fileWriter = new FileWriter(PATH, true);
            bf = new BufferedWriter(fileWriter);
            bf.write(data);
            bf.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
