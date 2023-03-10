public class TriangleBasic {

    public static void main(String[] args) {


        int start, end, height;
        height = 6;
        start = height;
        end = height;

        for(int j=1; j<=height; j++) {
            for (int i = 1; i <= end; i++) {

                if (i>=start)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }


            }//i
            start--; end ++;

            System.out.println();

        }//j
    }

}
