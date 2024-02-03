import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {
        String file = readFile();
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("C:\\dev\\code\\mcc\\2024_winter_be_class_6\\Output.txt"));
            writer.write(file);
            writer.write("asdf World\n");
            writer.write("asdf World\n");
            writer.write("asdf World\n");
            writer.write("asdf World\n");
            writer.write("asdf World");
            String foo = "Evan Stohlmann";
            String[] names = foo.split(" ");
            String firstName = names[0];
            String lastName = names[1];
        } catch(IOException e){
            System.out.println("IO Exception");
        } finally {
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void exceptionHandle() throws FileNotFoundException{
        String[] testArray = new String[10];
        System.out.println("Before Try");
        try {
            System.out.println("Before Array Blow Up");
            testArray[10] = "Blow Up";
//            int foo = 8/0;
            System.out.println("After Array Blow Up");
        } catch(IndexOutOfBoundsException e){
            System.out.println("In Catch Before Stack Trace");
//            e.printStackTrace(); // Async.. Who knows when this will happen
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("GO ABOUT OUR LIFE");
    }

    private static String readFile(){
        boolean fileFound = Files.exists(Paths.get("C:\\dev\\code\\mcc\\2024_winter_be_class_6\\InputFileasdf.txt"));
        String file = "C:\\dev\\code\\mcc\\2024_winter_be_class_6\\InputFile.txt";
        Scanner scanner = null;
        StringBuilder contents = new StringBuilder();
        try {
            File inputFile = new File(file);
            scanner = new Scanner(inputFile);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                contents.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
        return contents.toString();
    }
}
