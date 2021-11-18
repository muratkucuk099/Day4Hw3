package Abstract;

import Entities.Gamer;

import java.rmi.RemoteException;

public interface GamerService {

    void add(Gamer gamer) throws NumberFormatException, RemoteException;

    void delete(Gamer gamer) throws NumberFormatException, RemoteException;

    void update(Gamer gamer) throws NumberFormatException, RemoteException;
}
