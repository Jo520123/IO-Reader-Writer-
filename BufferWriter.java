package org.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.io.Writer;

public class BufferWriter {

    public static void main(String[] args)
    {

        Path p = Path.of("files/wo1.txt");

        try(FileWriter fw = new FileWriter("files/wo1.txt");
            //BufferedWriter bfw = new BufferedWriter(fw);)
            BufferedWriter bfw = Files.newBufferedWriter(p);)
        {

            
            //Files.newBufferedWriter(p);

            //BufferedWriter bfw = new BufferedWriter(fw);

            bfw.write("Buffer writer");
            //bfw.flush();



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
