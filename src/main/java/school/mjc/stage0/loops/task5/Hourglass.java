package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height; j++) {

                if ((i < height - 1 && i > 0) || j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
}

