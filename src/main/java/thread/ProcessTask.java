package thread;

import bean.Task;
import client.RestClient;
import static constant.Constants.*;
import impl.ComparatorFactory;
import impl.IComparator;

public class ProcessTask implements Runnable {

    private Task task;

    public ProcessTask(Task task){this.task = task;}

    @Override
    public void run() {
        process(task);
     }

    public  void  process(Task task){
        IComparator comparator = ComparatorFactory.getComparator("ALL");
        boolean flag =  comparator.compare(new RestClient().invokeRequest(task.getUrl1()), new RestClient().invokeRequest(task.getUrl2()));
        String message = flag ? EQUALS : NOT_EQUALS;
        message = task.getIndex() + " - " +task.getUrl1() + " " + message + " " + task.getUrl2();
        System.out.println(message);

    }
}
