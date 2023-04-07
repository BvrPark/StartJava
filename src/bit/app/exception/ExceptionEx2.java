package bit.app.exception;

import java.io.*;

public class ExceptionEx2 {

    public void interruptedException() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);     //프로세스를 휴면상태로 전환
                if (i % 7 == 0) {
                    System.out.println();
                }
                System.out.printf("%5d", i);
                if (i % 5 == 0) {
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException...");
                e.printStackTrace();
            }
        }
    }

    public void iOException() {
        FileInputStream fis = null;

        try {
//            System.out.println("Data");
//            File file = new File("d:\\abc");
//            file.mkdir();
//            file.createNewFile();

            fis = new FileInputStream(new File("d:\\java\\study\\startjava\\src\\bit\\app\\exception\\ExceptionEx1.java"));
            int temp = 0;
            while ((temp = fis.read()) != -1) {
                Thread.sleep(100);
                System.out.print((char) temp);
            }
            System.out.println(System.in.read());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {

        } catch (Throwable t) {

        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        ExceptionEx2 e = new ExceptionEx2();
//        e.interruptedException();
        e.iOException();
        // new RuntimeException(e2);
    }
}
