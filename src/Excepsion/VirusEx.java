package Excepsion;

import java.io.File;

public class VirusEx {
    public static int cout=0;
    public static int ScanFile(File f){
        System.out.println(f.getAbsolutePath());
        if (f.isDirectory()){
            File[] lFile =f.listFiles();
            for (File file:lFile){
                VirusEx.ScanFile(file);
            }
        } else {
            String filename=f.getName();
            if (filename.endsWith(".exe")){
                cout+=1;
            }
        }
        return cout;
    }
    public static void main(String[] args) {
        File directory = new File("C:\\"); // Thay đổi đường dẫn tương ứng
        int numberOfExeFiles = ScanFile(directory);
        System.out.println("Number of .exe files found: " + numberOfExeFiles);
    }
}


