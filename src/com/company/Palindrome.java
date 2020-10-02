package com.company;
//Нахождение слов - палиндромов из введенных
public class Palindrome
{
    // Получение аргументов, передача из значений в метод isPalindrome и вывод результата
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            String s = args[i];
            System.out.println(s + " является палиндромом?");
            System.out.println("Ответ:" + isPalindrome(s) + "\n");
        }
    }
    // Создание новой строки и запись в нее перевернутого содержимого начальной строки, которое далее передается
    public static String reverseString(String s)
    {
        String reversed="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reversed=reversed+s.charAt(i);
        }
        return reversed;
    }
    // Создание копии перевернутой строки и сравнение ее с оригинальной, а также передача значений true/false в зависимости от результата сравнения
    public static boolean isPalindrome(String s)
    {
        String reversed=reverseString(s);
        if(s.equals(reversed))
        {
            return true;
        }
        return false;
    }
}
