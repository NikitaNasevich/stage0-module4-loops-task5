package school.mjc.stage0.loops.task5;

public class Hourglass {
   public void printHourglassOfGivenSize(int height) {
        int x = height;

        for (int i = 0; i < x + 1; i++) {
            if (height % 2 != 0 && i == height / 2 + 1) continue;
            if (height % 2 == 0 && i == height / 2) continue;
            for (int j = 0; j < x; j++) {
                if (height % 2 != 0 && i == height / 2 + 1) continue;
                if (height % 2 == 0 && i == height / 2) continue;

                System.out.print(j >= Math.min(i, x - i) && j < Math.max(i, x - i) ? "8" : " ");
            }
            System.out.println();
        }
    }
}
