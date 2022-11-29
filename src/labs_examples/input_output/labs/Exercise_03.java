package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Byte Streams
 * //differentByteStream1and2();
 * 2) Demonstrate the usage of at least two additional Character Streams
 * //characterStreamPractice1And2()
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 * //bufferInput1and2()
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream
 */// DataInputDataOutPut1_2();


public class Exercise_03 {
    public static void main(String[] args) throws IOException {
        DataInputDataOutPut1_2();

    }

    public static void differentByteStream1and2() throws IOException {
        String file1 = "src/labs_examples/input_output/files/byte_data";
        String file2 = "src/labs_examples/input_output/files/byte_data.txt";


        try (
                FileInputStream in = new FileInputStream(file1);
                FileInputStream in2 = new FileInputStream(file2)) {
            int a;
            int b;

            do {
                a = in.read();
                b = in2.read();
                if (a != b)
                    break;
            } while (a != -1 && b != -1);


            if (a != b)
                System.out.println("they are not the same file ");

            else
                System.out.println(" we have the same file !!!!");
        } catch (IOException exc) {
            System.out.println(" error ");
            exc.printStackTrace();
        }

    }

    public static void characterStreamPractice1And2() throws IOException {
        FileReader file = new FileReader("src/labs_examples/input_output/files/byte_data");
        LineNumberReader ln = new LineNumberReader(file);

// print line by line from file.
        System.out.println(ln.readLine());
        System.out.println(ln.readLine());
        System.out.println(ln.readLine());
    }

    public static void bufferInput1and2() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("src/labs_examples/input_output/files/file_ex_3"));
            outputStream = new PrintWriter(new FileWriter("src/labs_examples/input_output/files/file_ex"));
            String a;
            while ((a = inputStream.readLine()) != null) {
                outputStream.println(a);
            }
        } catch (IOException exc) {
            System.out.println("An error occurred: " + exc.getMessage());
        } finally {

            try {
                assert inputStream != null;
                inputStream.close();
            } catch (IOException exc) {
                exc.printStackTrace();

                assert outputStream != null;
                outputStream.close();
            }
        }

    }

    public static void DataInputDataOutPut1_2() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("src/labs_examples/input_output/files/file_ex"));
        out.writeUTF("Hey there ");

        DataInputStream in = new DataInputStream(new DataInputStream(new FileInputStream("src/labs_examples/input_output/files/file_ex")));
        while (in.available() > 0) {
            String a = in.readUTF();
            System.out.println(a + " ");

        }

    }
}






