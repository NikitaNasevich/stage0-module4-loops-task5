package school.mjc.stage0.loops.task5;

public class Hourglass {
   public void printHourglassOfGivenSize(int height) {

       for (int i = 0; i < height + 1; i++) {
           boolean b = height % 2 != 0 && i == height / 2 + 1 || height % 2 == 0 && i == height / 2;
           if (b) continue;
            for (int j = 0; j < height; j++) {
                if (b) continue;

                System.out.print(j >= Math.min(i, height - i) && j < Math.max(i, height - i) ? "8" : " ");
            }
            System.out.println();
        }
    }
}
