package net.training_support;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1 {

    public static void main(String[] args) throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("./src/main/java/net/training_support/example.csv"));
        List<String[]> records = reader.readAll();
        System.out.println("Total number of rows are: " + records.size());
        for (String[] str : records) {
            System.out.print("Values are: ");
            for (String s : str) {
                System.out.print(" " + s);
            }
            System.out.println(" ");
        }
        reader.close();
    }
}
