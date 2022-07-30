В данном репозитории разобран и переписан код с книги Герберт Шилдт - JAVA 8. Полное руководство. 9 издание.

Задание

/src/Thread/lesson1v5/PhaserVersion.java

Дан класс:
public class Foo {

public void first() { print("first"); }

public void second() { print("second"); }

public void third() { print("third"); }

}

Один и тот же экземпляр данного класса будет передан в 3 разных потока.

Поток А - будет вызывать метод first(). Поток B - second(). Поток С - third().

Необходимо реализовать механизм и изменить программу таким образом, что у всех потоков будут вызваны в правильном порядке.

Пример:

Вывод: "firstsecondthird"

Мы не знаем, в каком порядке будут вызваны методы, но должны гарантировать порядок.

/FizzBuzz.java
Необходимо написать программу, которая выводит строковое представление числа от 1 до N.
● Если число делится без остатка на 3, представление "fizz".

● Если число делится без остатка на 5, представление "buzz".

● Если число делится без остатка и на 3, и на 5, представление "fizzbuzz".

Пример, для n = 15 ,вывод будет: 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz .

Имеется код

class FizzBuzz {

public FizzBuzz(int n) { ... }

public void fizz(printFizz) { ... }

public void buzz(printBuzz) { ... }

public void fizzbuzz(printFizzBuzz) { ... }

public void number(printNumber) { ... }

}

Необходимо реализовать многопоточную версию данного класса для 4-х потоков. Один и тот же экземпляр будет передаваться в разные потоки.

Поток A вызывает fizz() для проверки деления без остатка на 3 и выводит fizz .
Поток B вызывает buzz() для проверки деления без остатка на 5 и выводит buzz .
Поток C вызывает fizzbuzz() для проверки деления без остатка на 3 и на 5 и выводит fizzbuzz .
Поток D вызывает number() который выводит только числа.