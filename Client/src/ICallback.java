import java.rmi.*;
public interface ICallback extends Remote {
// interface de l�objet callback
public void doCallback(String message) throws RemoteException;
} /* s'ex�cute sur le client (sur demande du serveur) et affiche une
cha�ne */