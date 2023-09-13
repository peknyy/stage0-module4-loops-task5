package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == 0) {
                    System.out.print(8);
                    continue;
                }
                if (i == sideLength - 1) {
                    System.out.print(8);
                    continue;
                }
                if (j == 0) {
                    System.out.print(8);
                    continue;
                }
                if (j == sideLength - 1) {
                    System.out.print(8);
                    continue;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
