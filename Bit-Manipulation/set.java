// set 2nd bit position 1 of 0101 (5)
public class set {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask= 1<<pos;
        int newnum=bitmask|n;
        System.out.println(newnum);
    }
    
}
