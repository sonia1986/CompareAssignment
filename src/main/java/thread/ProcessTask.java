package thread;

import bean.Task;
import client.RestClient;
import impl.ComparatorFactory;
import impl.IComparator;

import java.util.concurrent.Callable;

public class ProcessTask implements Callable {

    private Task task;

    public ProcessTask(Task task){this.task = task;}

    @Override
    public Object call(){
        process(task);
        return null;

    }


    public  void  process(Task task){
        IComparator comparator = ComparatorFactory.getComparator("ALL");
        boolean flag =  comparator.compare(new RestClient().invokeRequest(task.getUrl1()), new RestClient().invokeRequest(task.getUrl2()));
        String message = flag ? "equals" : "not equals";
        message = task.getIndex() + " - " +task.getUrl1() + " " + message + " " + task.getUrl2();
        System.out.println(message);

    }
}
