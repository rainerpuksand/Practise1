public class Triangle1Loop {

    public static void main(String[] args) {

        int start, end, height;
        height = 6;
        start = height;
        end = start;




        //loop will end, when end==11
        // end will always be (height * 2) -1


        int i = 1;
        while (end <= (height *2) -1);
        {
            if (i < start) {
                System.out.print(" ");
            } else if (i > end) {
                start--;
                end++;
                System.out.println();
                i=0;

            } else {
                System.out.print("*");
            }
        }

        //System.out.print(i);

        i++;

    }


}
