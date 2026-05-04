import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExp6 {
    public static void main(String[] args) {
        try {
            // Get InetAddress of local host
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);

            // Get InetAddress of named host
            InetAddress namedHost = InetAddress.getByName("www.google.com");
            System.out.println("Named Host (Google): " + namedHost);

            // Get all addresses for a named host
            InetAddress[] allAddresses = InetAddress.getAllByName("www.google.com");
            System.out.println("All Addresses for Google:");
            for (InetAddress address : allAddresses) {
                System.out.println(address);
            }

            // Get raw IP address
            byte[] ipAddress = localHost.getAddress();
            System.out.print("Raw IP Address of Local Host: ");
            for (byte b : ipAddress) {
                System.out.print((b & 0xFF) + ".");
            }
        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}