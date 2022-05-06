package org.reader;



import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WithWriter {

    public static void main(String[] args){

        try(Writer w = new FileWriter("files/wo.txt")){

            w.write("Hello world!");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
