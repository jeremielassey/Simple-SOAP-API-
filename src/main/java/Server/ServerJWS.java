package Server;

import Service.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {

    public static void main(String args []){

        String url = "http://0.0.0.0:8084/";

        Endpoint.publish(url,new BanqueService());

        System.out.println("Service deployed on port " +url);
    }

}

