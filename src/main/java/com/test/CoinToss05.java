package com.test;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinToss05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many coin flips?:");
        int times = scanner.nextInt();
        int headers = toss(times);
        System.out.println("Number of Heads is : " + headers);
        System.out.println("Number of Tails is : " + (times - headers));
    }

    public static int toss(int times) {
        SecureRandom random = new SecureRandom();
        int headers = random.nextInt(times);
        return headers;
    }

}
