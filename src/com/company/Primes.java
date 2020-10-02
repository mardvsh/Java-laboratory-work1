package com.company;
// Определение простых чисел в диапазоне от 2 до 100
public class Primes
{
    // Передача чисел от 2 до 100 в метод isPrime, получение результата и вывод его в случае удовлетворения условиям
    public static void main(String[] args)
    {
        for (int i = 2; i < 100; i++)
        {
            boolean a = isPrime(i);
            if (a == true)
            {
                System.out.println("Число " + i + " является простым\n");
            }
        }
    }
    // Получение числа, проверка его делимости и возврат true/false в зависимости от резульата
    public static boolean isPrime(int n)
    {
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}