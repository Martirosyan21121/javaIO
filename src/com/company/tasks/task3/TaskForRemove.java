package com.company.tasks.task3;

import java.io.File;
import java.io.IOException;

public class TaskForRemove {

    public static void main(String[] args) throws IOException {
        try {

            File tempFile = File.createTempFile("temp", ".tmp");
            System.out.println(tempFile);

            boolean result = tempFile.delete();
            if (result) {
                System.out.println(tempFile.getName() + " is deleted!");
            } else {
                System.out.println("Sorry, unable to delete the file.");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
