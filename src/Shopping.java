import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//================== 1obj
        System.out.println("Enter Item: ");
        String str1 = sc.next();
        Item obj1 = new Item(str1);

        //System.out.println(what question to ask);
        obj1.quantity = sc.nextInt();
//================== 2obj
        System.out.println("Enter Item: ");
        String str2 = sc.next();
        Item obj2 = new Item(str2);

        //System.out.println(what question to ask);
        obj2.quantity = sc.nextInt();
//================== 3obj
        System.out.println("Enter Item: ");
        String str3 = sc.next();
        Item obj3 = new Item(str3);

        //System.out.println(what question to ask);
        obj3.quantity = sc.nextInt();

        //==========print bill
        System.out.println("==================================");
        obj1.printDetails();
        obj2.printDetails();
        obj3.printDetails();
        System.out.println("==================================");
        int amount = (obj1.total + obj2.total + obj3.total);
        System.out.println("Suma: "+ amount);
        System.out.println("==================================");

        System.out.println("How much are you paying?");
        int paid = sc.nextInt();

        System.out.println("Thankyou! Please collect the remaining " + (paid - amount) );


    }
}

class Item{
    String info;// milk, eggs, onions

    int quantity;//eg. 12Liters
    int price;// eg. 3Eur
    int total;// 12 x 3 = 36

    public Item(String info) {
        this.info = info;
        if(info.equals("milk")){

        }
        else if(info.equals("onions")){

        }
        else if(info.equals("eggs")){

        }

    }

    public void printDetails(){
        total = (quantity * price);
        System.out.println(info + "\t\t" + price + "\t\t" + quantity + "\t\t" + total);
    }
}
