public class CallByValue{
   static void add(int a, double b, String msg){
        double c =a+b;
        System.out.println(c);
    }
    public static void main(String[]args){
        int a =10;
        double b =20.0;  
        String msg ="Hi";
        add(a,b,msg);
        System.out.println("a : " +a);
        System.out.println("b : " +b);
        System.out.println(msg);
    }
}