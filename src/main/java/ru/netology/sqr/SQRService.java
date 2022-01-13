package ru.netology.sqr;

public class SQRService {
    public int sqrCount(int minBorder, int maxBorder) {

        int count = 0;

        for(int i = 10; i <= 99; i++) {
            if ((i * i >= minBorder) && (i * i <= maxBorder)) {
                    //System.out.println("Квадрат числа " + i + " равен " + i * i + " и входит в диапазон от " + minBorder + " до " + maxBorder);
                    count++;
            }
        }

        return count;

    }
}
