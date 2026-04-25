public class Recur{
    static void recur(int a){
        if(a>5)
         return;

          a++;
       recur(a);
       System.out.println(a);
    }
      

    public static void main(String[]args){
        recur(1);
    }
}