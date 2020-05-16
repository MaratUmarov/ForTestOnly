package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       File Dir=new File("D:\\Dir");
        File f = new File("D:\\Dir\\program.txt");
        System.out.println(Dir.mkdir());
        // Create new file

        // if it does not exist
        if (f.createNewFile())
        System.out.println("File created");
       else
            System.out.println("File already exists");

    }
}
