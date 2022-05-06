package org.reader;

import java.io.IOException;
import java.io.StringWriter;

public class WithStringWriter {

    public static void main(String[] args)
    {

        try(StringWriter sw = new StringWriter();)
        {

            sw.write("Hi J");

            sw.flush();

            StringBuffer buff = sw.getBuffer();
            String str = sw.toString();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
