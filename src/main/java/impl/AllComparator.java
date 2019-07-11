package impl;


import javax.ws.rs.core.Response;

public class AllComparator implements IComparator{

    @Override
    public boolean compare(Object obj1, Object obj2){
        Response  response1 = (Response) obj1;
        Response  response2 = (Response) obj2;

        boolean isEqual = true;
        if((response1 == null || response2 == null)

           || (!(response1.getMediaType().getSubtype().equals((response2.getMediaType().getSubtype()))))){

            isEqual = false;

        }

        return isEqual;
    }


}
