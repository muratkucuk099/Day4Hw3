package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

import java.rmi.RemoteException;

public class GamerManager implements GamerService {

    GamerCheckService gamerCheckService;


    public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    public GamerManager() {

    }


    @Override
    public void add(Gamer gamer)  {
        if (gamerCheckService != null) {
            System.out.println(gamer.getName() + " " + gamer.getLastName() + " başarıyla kayıt oldu hadi oynayalım");
        } else {
            System.out.println("Malesef " + gamer.getName() + " " + gamer.getLastName() + " seni kaydedemedik lütfen daha sonra tekrar dene.");
        }

    }

    @Override
    public void delete(Gamer gamer)  {
        System.out.println("Hey " + gamer.getName() + " kaydını başarıyla sildik.");

    }

    @Override
    public void update(Gamer gamer)  {
        System.out.println(gamer.getName() + " " + gamer.getLastName() + " bilgilerini güncelledik hadi bir an önce oynamaya başlayalım");

    }
}
