package impl;


import javax.ws.rs.core.Response;

public class AllComparator implements IComparator {

    @Override
    public boolean compare(Object obj1, Object obj2) {
        Response response1 = (Response) obj1;
        Response response2 = (Response) obj2;
        
        boolean isEqual = true;
        if (response1 == null) {
            isEqual = false;
        } else if (response2 == null) {
            isEqual = false;
        } else if (isEqual && (!(response1.getMediaType().getSubtype().equals((response2.getMediaType().getSubtype()))))) {
            isEqual = false;
        }
        System.out.println(response1 == null ? response1 : response1.getStatus());
        System.out.println(response2 == null ? response2 : response2.getStatus());

        return isEqual;
    }
}
