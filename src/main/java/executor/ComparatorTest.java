package executor;

import bean.FileInfo;
import bean.Task;
import reader.FileReader;
import thread.ProcessTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ComparatorTest {
    public static void main(String[] args){
        FileReader.start();
        System.out.println("Server is started.");

        FileInfo  fileInfo = FileInfo.getSingleton();
        System.out.println("Have started compare process.");

        ExecutorService  executorService = Executors.newFixedThreadPool(100);
        for(int i = 0 ; i<fileInfo.getMinLength(); i++){
            Task task = new Task(i , fileInfo.getUrlArray1()[i], fileInfo.getUrlArray2()[i]);
            executorService.submit(new ProcessTask(task));

        }
        executorService.shutdown();

    }
}
