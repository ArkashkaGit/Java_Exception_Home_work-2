# Исключения в программировании и их обработка
## Home work 1

![java.jpg](java.jpg)

- 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.


- 2. Если необходимо, исправьте данный код

Код первый:
>try {<p>
   int d = 0<p>
   double catchedRes1 = intArray[8] / d;<p>
   System.out.println("catchedRes1 = " + catchedRes1);<p>
} catch (ArithmeticException e) {<p>
   System.out.println("Catching exception: " + e);<p>
}

Код второй:
>public static void main(String[] args) throws Exception {<p>
   try {<p>
       int a = 90;<p>
       int b = 3;<p>
       System.out.println(a / b);<p>
       printSum(23, 234);<p>
       int[] abc = { 1, 2 };<p>
       abc[3] = 9;<p>
   } catch (Throwable ex) {<p>
       System.out.println("Что-то пошло не так...");<p>
   } catch (NullPointerException ex) {<p>
       System.out.println("Указатель не может указывать на null!");<p>
   } catch (IndexOutOfBoundsException ex) {<p>
       System.out.println("Массив выходит за пределы своего размера!");<p>
   }<p>
}<p>
public static void printSum(Integer a, Integer b) throws FileNotFoundException {<p>
   System.out.println(a + b);<p>
}


- 3. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.