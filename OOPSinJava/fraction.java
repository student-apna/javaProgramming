package OOPSinJava;

public class fraction {
    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
        }
    }
    public static void main(String[] args) {
       Fraction f1 = new Fraction(3,7);
        System.out.println(f1.num+"/"+ f1.den);
        Fraction f2 = new Fraction(7,5);
        System.out.println(f2.num+"/"+ f2.den);
    }
}
