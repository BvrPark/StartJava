package bit.app.io;

import java.io.BufferedOutputStream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CharacterStreamEx {

    public void fileCopy() throws Exception {
        Scanner scanner = null;
        BufferedOutputStream bos = null;
        try {
            scanner = new Scanner(new File(""));
            bos = new BufferedOutputStream(new PrintStream(new File("")));
            while (scanner.hasNext()) {
                Thread.sleep(100);
                bos.write(scanner.nextLine().concat("\r\n").getBytes());
                bos.flush();
            }
            System.out.println("FileCopy Success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                if(scanner != null){
//                    scanner.close();
//                }if(bos != null){
//                    bos.close();
//                }
//            }catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
    }

    public void fileScanner() {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;
        String temp = "";

        try {
            System.out.println("Origin File");
            br = new BufferedReader(new FileReader(new File(scanner.nextLine().trim())));
            System.out.println("ChangeFile");
            bw = new BufferedWriter(new FileWriter(new File(scanner.nextLine().trim())));
            while ((temp = br.readLine()) != null) {
                bw.write(temp);
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if(bw != null){
                    bw.close();
                }
            }catch (Exception e2) {

            }
        }
    }

    public static void main(String[] args) throws Exception {
        CharacterStreamEx c = new CharacterStreamEx();
//        c.fileCopy();
        c.fileScanner();
    }
}
