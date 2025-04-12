package pattern;

public class Pattern {


    public static void main(String[] args) {
                int waveHeight = 4;
                int waveLength = 4;

                int waveBase = waveHeight - 1;
                int x = waveBase;

                for (int i = 0; i <= waveBase; i++) {
                    for (int j = 0; j <= waveBase * waveLength * 2; j++) {
                        int left=j % (waveBase * 2);
                        int right= waveBase + i;
                        if (left== x || left==right) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    x--;  // decrement x after each row
                    System.out.println();  // move to the next line after each row is printed
                }

    }
}
