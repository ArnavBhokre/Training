import java.util.Scanner;
public class vending {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int trayNo ; 
    int total = 0;
   do{
  System.out.println("0. Exit"); 
  System.out.println("1. Tray1 | Beverages");  
  System.out.println("2. Tray2 | Snacks");  
  System.out.println("3. Tray3 | Chocolates\n");  

  System.out.println("Select your tray by using 0/1/2/3");
  trayNo = sc.nextInt(); 
  switch (trayNo) {
    case 1:{
        char stay;
        do{
            
        System.out.println("A . Sprite \tPrice $40");
        System.out.println("B . Diet Coke    \t Price $60");
        System.out.println("C . Red Bull     \t Price $120\n");

        System.out.println("Item to purchase (A/B/C)");
        char prod = sc.next().charAt(0);
        if(prod == 'A')
            total+= 40;
        else if(prod == 'B')
            total += 60;
        else if(prod == 'C')
            total += 120;
        System.out.println("Stay on Same Tray(y/n) :  ");
    stay = sc.next().charAt(0);
       }while(stay != 'n');
        break;
    } 
    case 2:
        {
        char stay;
        do{
            
        System.out.println("A . Lays      \tPrice $50");
        System.out.println("B . Kurkure    \t Price $60");
        System.out.println("C . Cream and Onion  \t Price $15\n");

        System.out.println("Item to purchase (A/B/C)");
        char prod = sc.next().charAt(0);
        if(prod == 'A')
            total+= 50;
        else if(prod == 'B')
            total += 60;
        else if(prod == 'C')
            total += 15;
        System.out.println("Stay on Same Tray(y/n) :  ");
    stay = sc.next().charAt(0);
       }while(stay != 'n');
        break;
    } 
    case 3:
        {
            char stay;
        do{
        
        System.out.println("A . Oreo \t Price $98");
        System.out.println("B . Temptation     \t Price $120");
        System.out.println("C . Brownie     \t Price $150\n");

        System.out.println("Item to purchase (A/B/C)");
        char prod = sc.next().charAt(0);
        if(prod == 'A')
            total+= 98;
        else if(prod == 'B')
            total += 120;
        else if(prod == 'C')
            total += 150;
        System.out.println("Stay on Same Tray(y/n) :  ");
    stay = sc.next().charAt(0);
       }while(stay != 'n');
        break;
    }
    case 0:
        break;

    default:
        break;
  }
}while(trayNo != 0);
System.out.println("Total Amount = $"+total);
}  

}