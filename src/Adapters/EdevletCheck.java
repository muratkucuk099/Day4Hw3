package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class EdevletCheck implements GamerCheckService {
    @Override
    public boolean CheckIfRealPerson(Gamer gamer) {
        if (gamer.getNationalityId() == 0) {
            return false;

        }else
            return true;

    }
}
