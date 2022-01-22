package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        if (money - price < 0) {
            size = 0;
        } else {
            for (int i = 0; i < coins.length; i++) {
                if (change == 0) {
                    break;
                }
                int bounder = change / coins[i];
                for (int j = 0; j < bounder; j++) {
                    rsl[size] = coins[i];
                    change = change - coins[i];
                    size++;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
