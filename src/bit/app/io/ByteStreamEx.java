package bit.app.io;

import java.io.*;
import java.io.Serializable;

//byteStream
public class ByteStreamEx {

    public void streamEx1() throws IOException {
        System.out.println("Data:");
        byte[] contens = new byte[100];
//        System.out.println(System.in);
        int rc = System.in.read(contens);
//        System.out.println("rc = " + rc);
//        for(byte b:contens){
//            System.out.print(b + " ");
//        }
        System.out.println(new String(contens).trim());
    }

    public void fileCopy() throws IOException {
        BufferedReader br = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int size = 0;
        int temp=0;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("FileOrigin");
            fis = new FileInputStream(new File(br.readLine().trim()));
            System.out.println("FileOrigin");
            fos = new FileOutputStream(br.readLine().trim());
            while ((temp = fis.read())!=-1){
                fos.write(temp);
                size++;
            }
            System.out.println(size+"byte FileCopy Success!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(br != null) {
                    br.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }catch (Exception e){

            }
        }
    }

    public void fileCopy(String origin, String change){
        try(FileInputStream fis = new FileInputStream(origin)) {
            FileOutputStream fos = new FileOutputStream(change);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fileBufferCopy(String origin, String change){
        byte[] cp = new byte[1500];
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(origin)))){
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(change)));
            bis.read(cp);
            bos.write(new String(cp).trim().getBytes());

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ByteStreamEx b = new ByteStreamEx();
        b.fileCopy();
    }
}
