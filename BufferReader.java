package org.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class BufferReader {

    public static void main(String[] args)
    {

        Path p = Path.of("files/ko.txt");

        try(BufferedReader bfr = Files.newBufferedReader(p);) {

            String row = bfr.readLine();

            while (row != null) {

                System.out.println("row = " + row);

                row = bfr.readLine();


            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        try(BufferedReader bfr = Files.newBufferedReader(p);) {

            Stream<String> rows = bfr.lines();

            rows.forEach(System.out::println);



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
