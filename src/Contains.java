import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {

        String[] arr = {"Abc", "def", "ghi","jkl","mno", "pqr", "stuv", "wxyz"};
        String strCheck = "ghi";

        boolean contains=false;
        for(String str : arr){
            System.out.println(str);
            if(str.equals(strCheck)){
                System.out.println("Got it: " + str);

                contains=true;
                break;
            }
        }

        if(contains) {
            System.out.println("Yes it contains " + strCheck);
        }
        else{
            System.out.println("NO it doesnt contain " +strCheck);
        }




    }
}
