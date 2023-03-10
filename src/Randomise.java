import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Randomise {
    public static void main(String[] args) {
        /*Random rnd = new Random();
        for(int i = 0; i<=20; i++){
            int x = rnd.nextInt(10);
            System.out.println(x);
        }*/

        //class of 50
        //0,1,2,3....49 ids/rollNum
        // 30(inclusive) .... 49(include)
        //int x = rnd.nextInt(20) + 30;

        // office has 10 employees
        // empIds starts 1,2,3,4.....10


        int[] card = new int[10];
        int i=0;
        while(i<10){
            Random rnd = new Random();
            int num = rnd.nextInt(11);

            boolean contains = IntStream.of(card).anyMatch(x -> x == num);

            if(contains){
                System.out.println("NO to: " + num);
            }
            else{
                card[i] = num;
                System.out.println(Arrays.toString(card));
                i++;
            }
        }


    }
}
