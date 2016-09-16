package com.example.util;

import com.example.model.Item;

import java.io.*;

/**
 * Created by levont on 16/09/2016.
 */
public class ItemControllerHelper {

    public static final String storageBasePath = "C:/storage";

    public static String storeFileInFileSystem(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            FileOutputStream fos = new FileOutputStream(storageBasePath);
            int i;
            byte[] buffer = new byte[4096];
            while ((i = fis.read()) != -1){
                fos.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
