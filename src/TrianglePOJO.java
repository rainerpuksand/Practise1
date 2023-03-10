public class TrianglePOJO {


        int start, end, height;

    public TrianglePOJO(int height) {
        this.height = height;
        end = height;
        start = height;
    }

    public void drawTriangle() {

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


