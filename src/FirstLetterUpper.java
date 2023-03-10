public class FirstLetterUpper {

    public static void main(String[] args) {

        String str ="this article will explain 3 different methods to generate a random number in java in range";

        char [] myChar = str.toCharArray();

        for (int i = 0; i < myChar.length; i++) {
            //System.out.print(ch);
            char ch = myChar [i];


            if (ch == ' ') {
                myChar [i+1] = Character.toUpperCase(myChar[i+1]);

            }

        }
        String ans = new String(myChar);
        System.out.println(ans);

        //char c = 65;
        //System.out.println(c);

    }


}
