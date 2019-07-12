package client;

import javax.ws.rs.core.Response;
import javax.ws.rs.client.ClientBuilder;

public class RestClient {
    public Response invokeRequest(String url){
        Response response = null;
        try {
            response = ClientBuilder.newClient().target(url).request().get();
        } catch (Exception e)
        {
            System.out.print("");
        }
      return response;
    }

    public static void main(String[] args){
        RestClient restClient = new RestClient();
        restClient.invokeRequest("https://regres.inn/api/users/3");
        System.out.print("Hello in RestClient");
    }
}
