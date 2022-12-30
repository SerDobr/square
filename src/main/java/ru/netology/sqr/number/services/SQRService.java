
package ru.netology.sqr.number.services;
public class SQRService {
    public int calculateSQR(int min, int max) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    x = x + 1;
                }
            }
        }
        System.out.println(x);
        return x;
    }
}

