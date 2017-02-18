import java.math.*;

public class OneOneMap
{
    public static BigInteger f(BigInteger n){
        BigInteger TWO = new BigInteger("2");
        BigInteger rem = n.remainder(TWO);
        if(rem.equals(BigInteger.ZERO)){
            return n.divide(TWO);
        } else return ((n.subtract(BigInteger.ONE)).divide(TWO)).negate();
    }

    public static BigInteger g(BigInteger m){
        BigInteger TWO = new BigInteger("2");
        int s = m.signum();
        if(s==1) {
            return m.multiply(TWO);
        } else return (m.abs()).multiply(TWO).add(BigInteger.ONE);
    }
    public static void main(String[] args){
        BigInteger n1 = new BigInteger("-1001");
        BigInteger r1 = f(n1);
        System.out.println("r1 = " + r1);

        BigInteger m1 = new BigInteger("20002");
        BigInteger s1 = g(m1);
        System.out.println("s1 = " + s1);
        BigInteger m2 = new BigInteger("-20003");
        BigInteger s2 = g(m2);
        System.out.println("s2 = " + s2);
    }
}
