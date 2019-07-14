package bean;

public class Task {

    private long index;
    private String url1;
    private String url2;

    public Task(int index, String url1 , String url2){
        this.index = index;
        this.url1 = url1;
        this.url2 = url2;

    }

    public long getIndex(){
        return index;
    }

    public Task setIndex(long index){
        this.index = index;
        return this;

    }

    public String getUrl1(){return  url1;}

    public Task setUrl1(String url1){
        this.url1 = url1;
        return  this;

    }
    public String getUrl2(){return  url2;}

    public Task setUrl2(String url2) {
        this.url2 = url2;
        return this;

    }

}
