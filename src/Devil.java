import java.util.Random;

public class Devil {
    public static void main(String[] args) {
        Random rnd = new Random();

        int d1=0, d2=0, d3=0, count=0;

        while(true){
            count++;
            int num = rnd.nextInt(20);

            if(num==6){
                if(d1!=6){
                    d1=num;
                }else if(d2!=6){
                    d2=num;
                }
                else if(d3!=6){
                    d3=num;
                }


            }

            if( (d1==6) && (d2==6) && (d3==6) ){
                System.out.println("devil in " + count);
                break;
            }

        }



    }
}
