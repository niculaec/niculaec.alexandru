package mainproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    String folderName;
    String directory;

    public FileUtil(String folderName){

        directory = System.getProperty("user.home");
        this.folderName = folderName;
    }

    public void write(String subFolderName, String fileName, String fileContent){

        String dir = directory + File.separator + folderName + File.separator + subFolderName ;
        String absolutePath = dir + File.separator + fileName;
        new File(dir).mkdirs();
                // write the content in file 
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absolutePath))) {
            bufferedWriter.write(fileContent);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // exception handling
        }
    }

    public boolean readFolder(String subFolderName){

            String dirName = directory + File.separator + folderName + File.separator + subFolderName ;
            File folder = new File(dirName);
            System.out.println("index \t filename");
            int i = 0;

            if(!folder.exists()){
                System.out.println("No payslips for selected employee");
                return false;
            }

            for(File file : folder.listFiles()){
                System.out.println(i++ + " \t " + file.getName());
            }

            return true;
    }

    public void readFile(String subFolderName,int index){

        String dirName = directory + File.separator + folderName + File.separator + subFolderName ;
        File folder = new File(dirName);
        File file  = folder.listFiles()[index];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // exception handling
        }
    }
}