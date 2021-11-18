package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager {



    public void gameSales(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(gamer.getName() + " " + gamer.getLastName() + " " + game.getName() +
                " oyununu %" + campaign.getDiscount() + " indirimle " + (game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100)) +
                " tl fiyatıyla satın aldı.");
    }
}
