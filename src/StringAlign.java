import java.util.Scanner;

public class StringAlign {
    public static void main(String[] args) {
        String[] str = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        str[0] = sc.next();

        System.out.println("Enter 2nd String: ");
        str[1] = sc.next();

        System.out.println("Enter 3rd String: ");
        str[2] = sc.next();

        //find longest
        int longest=0;
        int arrlen = str.length;
        for(int i=0; i<arrlen; i++){
            if(str[i].length()>=longest){
                longest = str[i].length();
            }
        }
        //System.out.println("Longest: " + longest);

        //for final print
        for(int i=0; i<arrlen; i++){
            if(str[i].length()< longest){
                int diff = longest - str[i].length();


                String addedSpaces="";
                while(addedSpaces.length()<diff){//why not <=diff ?
                     addedSpaces.concat(" ");//coded mistake!?
                }
                System.out.println(addedSpaces+str[i]);
            }
            else{
                System.out.println(str[i]);
            }
        }//for



    }
}
