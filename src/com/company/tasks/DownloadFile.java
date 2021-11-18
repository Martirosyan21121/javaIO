package com.company.tasks;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadFile {
    public static void main(String[] args) {
        String urlLink = "http://example.com";
        String fileName = "src/com/company/tasks/file.html";

        FileOutputStream fileOutputStream = null;
        BufferedInputStream inputStream = null;

        try {
            inputStream = new BufferedInputStream(new URL(urlLink).openStream());
            fileOutputStream = new FileOutputStream(fileName);

            byte data[] = new byte[1024];
            int count;

            while ((count = inputStream.read(data, 0, 1024)) != -1) {

                fileOutputStream.write(data, 0, count);
                fileOutputStream.flush();

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException ee) {
            ee.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
