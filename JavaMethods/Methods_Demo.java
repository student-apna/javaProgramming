package JavaMethods;

public class Methods_Demo {
      int c =10;
    public static void main(String[] args) {
        System.out.println("Hello");
        Methods_Demo  m = new Methods_Demo();
        int a=10000;
        int b=9;
        //System.out.println(add(a,b));
       // System.out.println(m.sub(a,b));
        System.out.println();
        add(a,b);
        m.sub(a,b);


    }
    public static int add(int a, int b){
        Methods_Demo sc = new Methods_Demo();

        System.out.println(sc.c);
        return a+b;
    }
    public  int sub(int a,int b){
        Methods_Demo sc = new Methods_Demo();
        System.out.println(sc.c);
        return a-b;
    }
}
