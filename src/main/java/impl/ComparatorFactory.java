package impl;

public class ComparatorFactory {

    public static IComparator getComparator(String type){
        IComparator  comparator = null;

        if("JSON".equalsIgnoreCase(type)){
            comparator = new JSONComparator();

        } else if ("XML".equalsIgnoreCase(type)){
            comparator = new  XMLComparator();
        } else if ("ALL" .equalsIgnoreCase(type)){
            comparator = new AllComparator();
        }
        return  comparator;
    }
}
