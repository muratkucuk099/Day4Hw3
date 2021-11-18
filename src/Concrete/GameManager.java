package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

    public void add(Game game) {
        System.out.println(game.getName() + " oyunu eklendi.");
    }

    public void delete(Game game) {
        System.out.println(game.getName() + " oyun kaldırıldı.");
    }

    public void update(Game game) {
        System.out.println(game.getName() + " oyununa güncelleme geldi hemen yüklemelisin.");
    }
}
