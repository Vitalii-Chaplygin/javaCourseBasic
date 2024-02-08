package tranningJava;

public class ForLoop {
    public static void main(String[] args) {
        firstLoop:
        for (int h = 0; h < 6; h++) {
            secondLoop:
            for (int m = 0; m <= 60; m++) {
                if (h > 1 && m % 10 == 0) {
                    break firstLoop;
                }
                thirdLoop:
                for (int s = 0; s <= 60; s++) {
                    if ((s * h) > m) {
                        continue secondLoop;
                    }
                    System.out.println(h + ";" + s + ";" + m);

                }

            }


        }


    }


}
