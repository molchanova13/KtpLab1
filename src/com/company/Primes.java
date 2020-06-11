package com.company;
import java.util.Scanner;
public class Primes {

    public static void main(String[] args) {
        System.out.print ("Введите любое положительное число: ");
        //считываем слово
        Scanner s = new Scanner(System.in);
        //вносим его в переменную n
        int n = s.nextInt();
        // выводим значения, которые IsPrime () посчитал простыми
        System.out.print("Список простых чисел " + "до " + n + ": ");
        for (int i =2; i<=n;i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    // проверяем, являются ли числа простыми
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
