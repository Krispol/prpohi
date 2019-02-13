//Esimene kodutöö
//Mõõtude converterid
//in = mm * 0.039370
//in = 1/36 jard
//in = 1/12 jalg

public class moodud1{
  public static void main(String[] args) {
    System.out.println("1 Toll on Millimeetrites : "+TollMillimeetriks(1));
		System.out.println("1 Jalg on Millimeetrites : "+JalgMillimeetriks(1));
		System.out.println("1 Jard on Millimeetrites : "+JardMillimeetriks(1));

    System.out.println(" ");
    System.out.println("8 BITS TO BYTES: "+TollMillimeetriks(8));
    System.out.println("1024 BYTES TO KB: "+TollSentimeetriks(1024));
    System.out.println("1048576 BYTES TO MB: "+TollDetsimeetriks(1048576));
    System.out.println("1.073741824E9 BYTES TO GB: "+TollMeetriks(1.073741824E9));
    System.out.println("1.099511627776E12 BYTES TO TB: "+TollKilomeetriks(1.099511627776E12));
    }

    public static double BytesToBits(double bytes) { return bytes * 8; }
    public static double BitsToBytes(double bits) { return bits / 8; }

    public static double KilobytesToBytes(double bytes) { return bytes * Math.pow(2, 10); }
    public static double MegabyteToBytes(double bytes) { return bytes * Math.pow(2, 20); }
    public static double GigabyteToBytes(double bytes) { return bytes * Math.pow(2, 30); }
    public static double TerabyteToBytes(double bytes) { return bytes * Math.pow(2, 40); }
    public static double PetabyteToBytes(double bytes) { return bytes * Math.pow(2, 50); }

    public static double BytesToKilobytes(double bytes) { return Math.round(bytes * Math.pow(1000, -1)); }
    public static double BytesToMegabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -2)); }
    public static double BytesToGigabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -3)); }
    public static double BytesToTerabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -4)); }
    public static double BytesToPetabyte(double bytes) { return Math.round(bytes * Math.pow(1000, -5)); }
}
