package com.company.tasks.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TaskForCSV {

    public static void main(String[] args) {

        String file = "src/com/company/tasks/task2/file.csv";
        BufferedReader reader;
        String line = " ";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null){
                String[] strings = line.split(",");

                for (String s : strings){
                    System.out.printf("%-10s%n", s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }


    }
}
