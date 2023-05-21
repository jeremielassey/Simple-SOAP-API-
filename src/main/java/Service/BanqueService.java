package Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.Date;
import java.util.List;


@WebService(serviceName = "BanqueService")

public class BanqueService {


    @WebMethod(operationName = "ServiceConversion")
    public double Conversion(@WebParam(name = "montant")double montant){
        return montant*10;
    }
    @WebMethod(operationName = "ServiceCompte")
    public Compte getCompte(@WebParam(name = "code") int id){

        return new Compte(id,Math.random()*97000,new Date());
    }
    @WebMethod(operationName = "ServiceComptes")
    public List<Compte> getAllCompte(){
        return List.of(
                new Compte(1,Math.random()*97000,new Date()),
                new Compte(1,Math.random()*97000,new Date()),
                new Compte(1,Math.random()*97000,new Date()));

    }

}
