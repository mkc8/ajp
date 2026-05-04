
## 🔹 Files

* one.java 
* two.java 
* rmiserver.java
* rmiclient.java

# Java RMI Palindrome Checker

## one.java

``` java
import java.rmi.*;

public interface one extends Remote {
    public int palin(String a) throws RemoteException;
}
```

## two.java

``` java
import java.rmi.*;
import java.rmi.server.*;

public class two extends UnicastRemoteObject implements one {

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
```

## rmiserver.java

``` java
import java.rmi.*;

public class rmiserver {

    public static void main(String args[]) {

        try {
            two twox = new two();

            Naming.bind("rmi://localhost/palin", twox);

            System.out.println("Object registered");

        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
```

## rmiclient.java

``` java
import java.rmi.*;

public class rmiclient {

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
```

## 🔹 Steps to Run

### 1. Compile Project

Eclipse compiles automatically

### 2. Start RMI Registry

Open terminal in project folder:

```bash
rmiregistry
```

### 3. Run Server

Run:

```
rmiserver.java
```

Output:

```
Object registered
```

### 4. Run Client

Run:

```
rmiclient.java
```

## 🔹 Output

* Checks whether string is palindrome or not

## ⚠️ Common Errors

* Connection refused → registry not running
* NotBoundException → wrong binding name
