package org.reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class WithReader {
    public static void main(String[] args) {

        try(Reader r = new FileReader("files/ko.txt");) {
            //Reader r = new FileReader("files/ko.txt");

            char[] buff = new char[16];


            int read = r.read(buff);
            //System.out.println(read);

            StringBuilder b= new StringBuilder();

            while (read > 0) {

                b.append(buff, 0, read);
                //System.out.println(b);

                read = r.read(buff);
                //System.out.println(read);

            }

            System.out.println("sb = \n" + b);

            //r.close();



        } catch (IOException e) {
            e.printStackTrace();
        }




    }


}
