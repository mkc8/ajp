import java.rmi.*;

public interface Search extends Remote {
    public String query(String search) throws RemoteException;
}

class SearchQuery extends java.rmi.server.UnicastRemoteObject implements Search {
    SearchQuery() throws RemoteException {
        super();
    }

    public String query(String search) throws RemoteException {
        String result;
        if (search.equals("RMI LAB"))
            result = "Found";
        else
            result = "Not Found";
        return result;
    }
}

class SearchServer {
    public static void main(String args[]) {
        try {
            Search obj = new SearchQuery();
            java.rmi.registry.LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/geeksforgeeks", obj);
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}

class ClientRequest {
    public static void main(String args[]) {
        String answer, value = "RMI LAB";
        try {
            Search access = (Search) Naming.lookup("rmi://localhost:1900/geeksforgeeks");
            answer = access.query(value);
            System.out.println("Article on " + value + " " + answer);
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}