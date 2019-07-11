package bean;

public class FileInfo {
    private String[] urlArray1;
    private String[] urlArray2;


    private int lineCount1;
    private int lineCount2;

    private static FileInfo singleton = null;

    private FileInfo(){

    }

    public static FileInfo getSingleton(){
        if(singleton == null){
            singleton = new FileInfo();
        }
        return singleton;
    }

    public String[] getUrlArray1(){ return urlArray1; }

    public FileInfo setUrlArray1 (String[] urlArray1){
        this.urlArray1 = urlArray1;

        return this;
    }

    public String []  getUrlArray2(){ return  urlArray2; }

    public FileInfo setUrlArray2(String[] urlArray2 ){
        this.urlArray2 = urlArray2;

        return this;

    }

    public int getLineCount1(){ return lineCount1; }

    public FileInfo setLineCount1(int lineCount1){
        this.lineCount1 = lineCount1;

        return this;

    }
    public int getLineCount2(){ return lineCount2; }

    public FileInfo setLineCount2(int lineCount2){
        this.lineCount2 = lineCount2;

        return this;

    }

    public static int getMinLength(){
        if(singleton != null){

            if(singleton.lineCount1 >= singleton.lineCount2)
                return singleton.lineCount2;
            else
                return singleton.lineCount1;
        }
        return 0;
    }
}
