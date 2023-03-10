public class PrimesSimple {
    public static void main(String[] args) {
        int count=0;
        for(int num = 2; num<100; num++){
            for(int divider=2; divider<num; divider++){

                if(num%divider==0){
                    break;
                }
                else if(divider+1 == num){
                    count++;
                    System.out.println(num);
                }


            }
        }
        System.out.println(count);




    }
}
