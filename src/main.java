import Adapters.EdevletCheck;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.rmi.RemoteException;

public class main {
    public static void main(String[] args)  {

        SalesManager salesManager = new SalesManager();

        Gamer gamer = new Gamer(31564044872L,"Murat", "Küçük", 1999);
        Game game = new Game(25, 469, "Forza Horizon 5");
        Campaign campaign = new Campaign(5,"GamePass indirimi",10);


        GamerManager gamerManager = new GamerManager(new EdevletCheck());
        gamerManager.add(gamer);

        GameManager gameManager = new GameManager();
        gameManager.add(game);

        SalesManager salesManager1 = new SalesManager();
        salesManager1.gameSales(game,gamer,campaign);



    }
}
