package impl;

import org.json.JSONObject;

public class JSONComparator implements IComparator {

    @Override
    public boolean compare(Object obj1, Object obj2){
        if(obj1 == null && obj2 == null)
            System.out.println("Response is empty");

         if(obj1 instanceof JSONObject && obj2 instanceof JSONObject){
             System.out.println("Compare of JSON");

             return true;

         } else {
             System.out.println("Response is not in JSON. hence going to check XML.");
         }

         return  false;
    }
}
