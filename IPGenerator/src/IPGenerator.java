import java.util.Scanner;

public class IPGenerator {
    // Calculates Max host and Max subnet


    // Converts Netmask into Wildcard
    public static String Wildcard(String subNet){
        int j = 0;
        int k = 1;
        String wildcard = "";
        for (int i = 8; i > 0; i--) {
            String Tempsub = subNet.substring(j, k);
            String Temp = "";
            if (Tempsub.equals("1"))
                Temp = ("0");
            else
                Temp = ("1");
            j++;
            k++;
            wildcard = (wildcard + Temp);
        }
        return wildcard;
    }

    // Calculates Network ID
    public static String NetworkID(String ip, String sub){
        int j = 0;
        int k = 1;
        String netID = "";
        for (int i = 8; i > 0; i--) {
            String Tempip = ip.substring(j, k);
            String Tempsub = sub.substring(j, k);
            String Temp = "";
            if ((Tempip.equals("1")) && (Tempsub.equals("1")))
                Temp = ("1");
            else if ((Tempip.equals("1")) && (Tempsub.equals("0")))
                Temp = ("0");
            else if ((Tempip.equals("0")) && (Tempsub.equals("1")))
                Temp = ("0");
            else if ((Tempip.equals("0")) && (Tempsub.equals("0")))
                Temp = ("0");
            j++;
            k++;
            netID = (netID + Temp);
        }
        return netID;
    }

    // Calculates Broadcast Address
    public static String BroadcastAddress(String net, String sub){
        int j = 0;
        int k = 1;
        String broadcast = "";
        for (int i = 8; i > 0; i--) {
            String Tempnet = net.substring(j, k);
            String Tempsub = sub.substring(j, k);
            String Temp = "";
            if ((Tempnet.equals("1")) && (Tempsub.equals("1")))
                Temp = ("1");
            else if ((Tempnet.equals("1")) && (Tempsub.equals("0")))
                Temp = ("1");
            else if ((Tempnet.equals("0")) && (Tempsub.equals("1")))
                Temp = ("0");
            else if ((Tempnet.equals("0")) && (Tempsub.equals("0")))
                Temp = ("1");
            j++;
            k++;
            broadcast = (broadcast + Temp);
        }
        return broadcast;
    }

    // Method to convert Subnet from binary to Dotted decimal
    public static int binaryToDecimal(String str){
        double j = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '1'){
                j = j + Math.pow(2, str.length() - 1 - i);
            }
        }
        return (int)j;
    }

    // Method to convert the IP Address and Subnet into binary
    public static String intToBinary(int n){
        String s = "";
        int i = 8;
        while (n > 0) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n /= 2;
            i--;
        }
        while (s.length() != 8)
            s = ("0" + s);
        return s;
    }

    public static void main(String[] args) {
        // Set Vaules
        int subnetCIDR = 0;
        String ipClass = "";
        int j = 0;
        int k = 1;
        String sIPO1 = "";
        String sIPO2 = "";
        String sIPO3 = "";
        String sIPO4 = "";
        String subnetBin = "";

        // Generates the octets for the IP Address and IP Address as a whole
        int o1 = (int) (Math.random() * 224);
        int o2 = (int) (Math.random() * 256);
        int o3 = (int) (Math.random() * 256);
        int o4 = (int) (Math.random() * 256);
        String ipAddress = (o1 + "." + o2 + "." + o3 + "." + o4);

        // Generates Subnet in CIDR based on first octet and its class
        if (o1 < 127) {
            subnetCIDR = 8 + (int) (Math.random() * 23);
            ipClass = "Class A";
        } else if ((o1 >= 128) && (o1 < 192)) {
            subnetCIDR = 16 + (int) (Math.random() * 15);
            ipClass = "Class B";
        } else if ((o1 >= 192) && (o1 < 224)) {
            subnetCIDR = 24 + (int) (Math.random() * 7);
            ipClass = "Class C";
        } else {
            ipClass = "Loopback Address";
        }

        // Converts subnet in CIDR to Binary
        switch (subnetCIDR) {
            case 8:
                subnetBin = "11111111.00000000.00000000.00000000";
                break;
            case 9:
                subnetBin = "11111111.10000000.00000000.00000000";
                break;
            case 10:
                subnetBin = "11111111.11000000.00000000.00000000";
                break;
            case 11:
                subnetBin = "11111111.11100000.00000000.00000000";
                break;
            case 12:
                subnetBin = "11111111.11110000.00000000.00000000";
                break;
            case 13:
                subnetBin = "11111111.11111000.00000000.00000000";
                break;
            case 14:
                subnetBin = "11111111.11111100.00000000.00000000";
                break;
            case 15:
                subnetBin = "11111111.11111110.00000000.00000000";
                break;
            case 16:
                subnetBin = "11111111.11111111.00000000.00000000";
                break;
            case 17:
                subnetBin = "11111111.11111111.10000000.00000000";
                break;
            case 18:
                subnetBin = "11111111.11111111.11000000.00000000";
                break;
            case 19:
                subnetBin = "11111111.11111111.11100000.00000000";
                break;
            case 20:
                subnetBin = "11111111.11111111.11110000.00000000";
                break;
            case 21:
                subnetBin = "11111111.11111111.11111000.00000000";
                break;
            case 22:
                subnetBin = "11111111.11111111.11111100.00000000";
                break;
            case 23:
                subnetBin = "11111111.11111111.11111110.00000000";
                break;
            case 24:
                subnetBin = "11111111.11111111.11111111.00000000";
                break;
            case 25:
                subnetBin = "11111111.11111111.11111111.10000000";
                break;
            case 26:
                subnetBin = "11111111.11111111.11111111.11000000";
                break;
            case 27:
                subnetBin = "11111111.11111111.11111111.11100000";
                break;
            case 28:
                subnetBin = "11111111.11111111.11111111.11110000";
                break;
            case 29:
                subnetBin = "11111111.11111111.11111111.11111000";
                break;
            case 30:
                subnetBin = "11111111.11111111.11111111.11111100";
                break;
            case 31:
                subnetBin = "11111111.11111111.11111111.11111110";
                break;
            case 32:
                subnetBin = "11111111.11111111.11111111.11111111";
                break;

        }

        // Converts IP into Binary
        String bO1 = intToBinary(o1);
        String bO2 = intToBinary(o2);
        String bO3 = intToBinary(o3);
        String bO4 = intToBinary(o4);
        String ipAddressBinary = (bO1 + "." + bO2 + "." + bO3 + "." + bO4);

        // Converts Subnet from binary to Dotted decimal
        String sO1 = subnetBin.substring(0, 8);
        String sO2 = subnetBin.substring(9, 17);
        String sO3 = subnetBin.substring(18, 26);
        String sO4 = subnetBin.substring(27, 35);
        String subnetDot = (binaryToDecimal(sO1) + "." + binaryToDecimal(sO2) + "." + binaryToDecimal(sO3) + "." + binaryToDecimal(sO4));

        // Creates NetworkID
        String netID1 = NetworkID(bO1, sO1);
        String netID2 = NetworkID(bO2, sO2);
        String netID3 = NetworkID(bO3, sO3);
        String netID4 = NetworkID(bO4, sO4);
        String networkID = (binaryToDecimal(netID1) + "." + binaryToDecimal(netID2) + "." + binaryToDecimal(netID3) + "." + binaryToDecimal(netID4));

        // Creates Broadcast address
        String broadcast1 = BroadcastAddress(netID1, sO1);
        String broadcast2 = BroadcastAddress(netID2, sO2);
        String broadcast3 = BroadcastAddress(netID3, sO3);
        String broadcast4 = BroadcastAddress(netID4, sO4);
        String broadcastBinary = (broadcast1 + "." + broadcast2 + "." + broadcast3 + "." + broadcast4);
        String broadcast = (binaryToDecimal(broadcast1) + "." + binaryToDecimal(broadcast2) + "." + binaryToDecimal(broadcast3) + "." + binaryToDecimal(broadcast4));

        // Creates Wildcard mask
        String netMaskBin1 = Wildcard(sO1);
        String netMaskBin2 = Wildcard(sO2);
        String netMaskBin3 = Wildcard(sO3);
        String netMaskBin4 = Wildcard(sO4);
        String netMaskBin = (netMaskBin1 + "." + netMaskBin2 + "." + netMaskBin3 + "." + netMaskBin4);

        // Converts Wildcard mask into Decimal
        int netMask1 = binaryToDecimal(netMaskBin1);
        int netMask2 = binaryToDecimal(netMaskBin2);
        int netMask3 = binaryToDecimal(netMaskBin3);
        int netMask4 = binaryToDecimal(netMaskBin4);
        String netmask = (netMask1 + "." + netMask2 + "." + netMask3 + "." + netMask4);

        // Creates Minimum Host address
        int minHostCal = (binaryToDecimal(netID4) + 1);
        String minHost = (binaryToDecimal(netID1) + "." + binaryToDecimal(netID2) + "." + binaryToDecimal(netID3) + "." + minHostCal);

        // Converts Minimum Host address to binary
        String minHostCalB = (intToBinary(minHostCal));
        String minHostBinary = (netID1 + "." + netID2 + "." + netID3 + "." + minHostCalB);

        // Creates Maximum Host address
        int maxHostCal = (binaryToDecimal(broadcast4) - 1);
        String maxHost = (binaryToDecimal(broadcast1) + "." + binaryToDecimal(broadcast2) + "." + binaryToDecimal(broadcast3) + "." + maxHostCal);

        // Converts Maximum Host address to binary
        String maxHostCalB = (intToBinary(maxHostCal));
        String maxHostBinary = (broadcast1 + "." + broadcast2 + "." + broadcast3 + "." + maxHostCalB);

        // Sets everything to string and formats
        String str1 = (subnetDot + " = " + subnetCIDR);
        String str2 = (ipAddress + "/" + subnetCIDR);

        // Calculates Max number of Hosts
        String hostsBitsBinary = (netMaskBin1 + netMaskBin2 + netMaskBin3 + netMaskBin4);
        int hosts = (binaryToDecimal(hostsBitsBinary) - 1);

        // Calculates Max number of Subnets
        int subnets = 0;
        if (o1 < 127) {
            String subnetBitsBinary1 = (Wildcard(netMaskBin2) + Wildcard(netMaskBin3) + Wildcard(netMaskBin4));
            String subnetBitsBinary2 = subnetBitsBinary1.replace("0", "");
            subnets = (binaryToDecimal(subnetBitsBinary2) + 1);
        } else if ((o1 >= 128) && (o1 < 192)) {
            String subnetBitsBinary1 = (Wildcard(netMaskBin3) + Wildcard(netMaskBin4));
            String subnetBitsBinary2 = subnetBitsBinary1.replace("0", "");
            subnets = (binaryToDecimal(subnetBitsBinary2) + 1);
        } else if ((o1 >= 192) && (o1 < 224)) {
            String subnetBitsBinary1 = (Wildcard(netMaskBin4));
            String subnetBitsBinary2 = subnetBitsBinary1.replace("0", "");
            subnets = (binaryToDecimal(subnetBitsBinary2) + 1);
        }


        // Prints everything out
        System.out.println(str2);
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.printf("%-12s %-26s %36s \n", "Address:", ipAddress, ipAddressBinary);
        System.out.printf("%-12s %-26s %36s \n", "Netmask:", str1, subnetBin);
        System.out.printf("%-12s %-26s %36s \n", "Wildcard:", netmask, netMaskBin);
        System.out.printf("%-12s %-26s %36s \n", "Network:", str2, subnetBin);
        System.out.printf("%-12s %-26s %36s \n", "Host Min:", minHost, maxHostBinary);
        System.out.printf("%-12s %-26s %36s \n", "Host Max:", maxHost, maxHostBinary);
        System.out.printf("%-12s %-26s %36s \n", "Broadcast", broadcast, broadcastBinary);
        System.out.printf("%-12s %-26s \n", "Class:", ipClass);
        System.out.printf("%-12s %-26d \n", "Max Hosts:", hosts);
        System.out.printf("%-12s %-26d \n", "Max Subnets", subnets);
    }
}

