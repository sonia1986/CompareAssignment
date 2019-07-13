package executor;

import bean.FileInfo;
import bean.Task;
import reader.FileReader;
import reader.PropertyReader;
import thread.ProcessTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComparatorTest {


    public static void startComparatorProcess(){
        try {
            FileReader.start();
            System.out.println("Info : Server is started.");

            FileInfo  fileInfo = FileInfo.getSingleton();
            System.out.println("Info : Have started compare process.");

            ExecutorService  executorService = Executors.newFixedThreadPool(100);
            for(int i = 0 ; i<fileInfo.getMinLength(); i++) {
                Task task = new Task(i , fileInfo.getUrlArray1()[i], fileInfo.getUrlArray2()[i]);
                executorService.submit(new ProcessTask(task));
            }
            executorService.shutdown();

        } catch (Exception e) {
            System.out.println("Exception : "+ e.getMessage());
        }


    }

    public static void main(String[] args) {
        startComparatorProcess();

    }


}
