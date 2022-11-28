package labs_examples.input_output.labs;


import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 * <p>
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 * <p>
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 * <p>
 *
 */


public class Exercise_02 {
    public static void main(String[] args) throws IOException {

        String read = "src/labs_examples/input_output/files/byte_data";
        String write = "src/labs_examples/input_output/files/byte_data.txt";


        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        try {
            fileIn = new FileInputStream(read);
            fileOut = new FileOutputStream(write);
            int a;{

                characterToCharacter(read);
                characterToCharacter(write);

                do {
                    a = fileIn.read();
                    if (a != -1)
                        if ((char) a == '.')
                            a = '7';
                    fileOut.write(a);
                } while (a != -1);

            }
        } finally {
            if (fileIn == null) {
                fileIn.close();
                if (fileOut == null) {
                    fileOut.close();
                }
            }}}





    public static void characterToCharacter(String path) throws IOException {
        FileReader fr = new FileReader(path);
        int a;
        while ((a = fr.read()) != -1);



        }
    }



