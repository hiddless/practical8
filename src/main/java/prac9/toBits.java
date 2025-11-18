package prac9;

public class toBits {
    public static void main(String[] args) {
        int d=30;
        System.out.println("d="+d);
        System.out.println("bits: " + toBits(d));
        System.out.println("countones: "+countOnes(d));
        System.out.println("bit 2is one: "+isOne(d,2));
        System.out.println();
        System.out.println("reverse bit2:");
        reverseBit(d,2);
    }
    public static String toBits(int d) {
        StringBuilder sb = new StringBuilder();
        int mask = 1<<32;
        for (int i=0;i<32;i++){
            int b=d&mask;
            if (d > 0||d== Integer.MIN_VALUE) {
                sb.append('1');
            } else {
                sb.append('0');
            }
            mask >>>= 1;
            if ((i + 1) % 8 == 0) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static int countOnes(int d) {
        int count = 0;
        int mask = 1<<32;
        for (int i=0;i<32;i++){
            if ((d & mask) != 0) {
                count++;
            }
            mask >>>= 1;
        }
        return count;
    }
    public static boolean isOne(int d,int i) {
        if (i<0||i>32){
            throw new IllegalArgumentException("bits are betwen 0 and 32");
        }
        int mask = 1<<i;
        return (d&mask)!=0;
    }
    public static void reverseBit(int d,int i) {
        if (i<0||i>32){
            System.out.println("bits are betwen 0 and 32");
            return;
        }
        int mask = 1<<i;
        int result= d^mask;
        System.out.println("before: "+toBits(d));
        System.out.println("after: "+toBits(result));
        System.out.println("result: "+result);
    }

}
