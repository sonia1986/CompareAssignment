package reader;

import bean.FileInfo;
import constant.Constants;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class FileReader {

    private final static String fileName1 =  PropertyReader.getProperty(Constants.FILE_NAME1);
    private final static String fileName2 =  PropertyReader.getProperty(Constants.FILE_NAME2);
    private static final FileInfo fileInfo = FileInfo.getSingleton();


    private static BufferedReader bufferedReader1;
    private static BufferedReader bufferedReader2;


    public static void loadFiles() throws  Exception{
        if(fileName1 == null || fileName2 == null){
            throw  new Exception("File name can not be empty");
        }

        bufferedReader1 = loadFile(fileName1);
        bufferedReader2 = loadFile(fileName2);

        System.out.println("Files have been loaded successfully");

    }

    public  static BufferedReader loadFile(String fileName) throws Exception{
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(new File(fileName)));
        }catch (FileNotFoundException fe){
            fe.getMessage();

        }
      return bufferedReader;
    }

    public static void countFilesLines(){
        fileInfo.setLineCount1(countLines(fileName1)).setLineCount2(countLines(fileName2));
        System.out.println("Total lines form each file is:");
    }

    public static int countLines(String fileName){
        Long lineCount = null;

        try {
            Path path = Paths.get(fileName);
            lineCount = Files.lines(path).count();

        } catch (Exception e){
            e.getMessage();

        }
        return  lineCount != null ? lineCount.intValue() : Integer.MAX_VALUE;

    }

    public static void loadUrlFromFiles() throws  Exception{
        if(fileInfo.getLineCount1() == 0 || fileInfo.getLineCount2() == 0){

            throw new Exception();
        }
        fileInfo.setUrlArray1(new String[fileInfo.getLineCount1()]).setUrlArray2(new String[fileInfo.getLineCount2()]);
        loadUrls(bufferedReader1, fileInfo.getUrlArray1());
        loadUrls(bufferedReader2, fileInfo.getUrlArray2());
        System.out.println("Url has been loaded in Array.");
    }

    public static void loadUrls(BufferedReader bufferedReader, String[] array){
        String str;
        int i = 0;
        try{
            while ((str = bufferedReader.readLine()) != null)
                array[i++] = str;

        } catch (Exception e){
            e.getMessage();

        }

    }

    public static void start(){
        try {
            loadFiles();
            countFilesLines();
            loadUrlFromFiles();
        }
        catch (Exception e){
            e.getMessage();

        }
    }

    public static void main(String[] argd){
    start();
    }
}
