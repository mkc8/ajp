import java.rmi.*;

interface one extends Remote {
    public int palin(String a) throws RemoteException;
}

class two extends java.rmi.server.UnicastRemoteObject implements one {

    public two() throws RemoteException { }

    public int palin(String a) throws RemoteException {

        System.out.println("Hello");

        StringBuffer str = new StringBuffer(a);
        String str1 = str.toString();

        System.out.println("Original: " + str1);

        StringBuffer str2 = str.reverse();

        System.out.println("Reversed: " + str2.toString());

        int b = str1.compareTo(str2.toString());

        if (b == 0)
            return 1;
        else
            return 0;
    }
}

class rmiserver {

    public static void main(String args[]) {

        try {
            two twox = new two();
            Naming.bind("palin", twox);
            System.out.println("Object registered");

        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}

class rmiclient {

    public static void main(String args[]) {

        try {
            String s1 = "rmi://localhost/palin";

            one onex = (one) Naming.lookup(s1);

            int m = onex.palin("madam");

            if (m == 1)
                System.out.println("The given string is a Palindrome");
            else
                System.out.println("The given string is not a Palindrome");

        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}