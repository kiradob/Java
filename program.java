/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         int i=123; double d=i;
//         System.out.println(i);
//         System.out.println(d);
//         d=3.1415; i=(int)d;
//         System.out.println(d);
//         System.out.println(i);
//         d=3.9415; i=(int)d;
//         System.out.println(d);
//         System.out.println(i);
//         byte b=Byte.parseByte("123");
//         System.out.println(b);
//         b=Byte.parseByte("1234");
//         System.out.println(b); // Value out of range. Value:"1234" Radix:10
//     }
// }

// Основы: типы данных
// Создание переменной
// <тип><идентификатор>
// <идентификатор>=<значение>
// main(String[])
// String s="2";
// System.out.println(s);
//
// short age=1; // - более мелкий тип данных, чем int
// int salary=123456; // численный тип данных
// Везественный числа
// float e=2.7f; // - f указывается
// double pi=3.1415;
// Тип данных char определяет отдельные символы
// char ch='1';
// Логический тип данных && || - или; ^ - дьзъюнекция - когда строго одно изи значений ИСТИНА
// boolean flag1=123<=234;
// boolean flag2=123>=234 || flag1;
// boolean flag3=flag1^flag2;
//
// Основы: типы данных *Строки не так просты
// Один символ занимает в памяти 2 байта

// Неявная типизация - используй, если забыл какой тип данных использовать
// var a=123;
// System.out.println(a);
// var d=123.456;
// System.out.println(d);
// System.out.println(getType(a));
// System.out.println(getType(d));
// далее необходимо задать метод getType
// static String getType(Object o){
// return o.getClass().getSimpleName();
// static - статический член класса
// Сам код
// public static void main(String[] args) {
//     var a=123;
//     System.out.println(a);
//     var d=123.456;
//     System.out.println(d);
//     System.out.println(getType(a));
//     System.out.println(getType(d));
// }
// static String getType(Object o){
//     return o.getClass().getSimpleName();
// }
// }
//
// Классы-обертки - нужны для предоставления информации и выбора операций, которые можно применить к данному классу
// примитив -  обертка
// int  -  Integer
// shot  -  Short
// long  -  Long
// byte  -  Byte
// float  -  Float
// double  -  Double
// char  -  Character
// boolean  -  Boolean
// System.out.println(Integer.MAX_VALUE);
// System.out.println(Integer.MIN_VALUE);
//
// Операции Java
// Присваивание: =
// Арифметические: *,/,+,-,%,++ инкремент,-- декремент
// Есть префиксный инкремент и простфиксный инкремент. Приоретет постфиксного инкремента ниже, чем вывод.
// Приоретет префиксного инкремента выше, чем вывод.
// public static void main(String[] args) {
// int a=123;
// System.out.println(++a);
// System.out.println(a++);
// System.out.println(a);
//
// Операции сравнения: <,>,==,!=,>=,<=
// boolean f=123>234;
// System.out.println(f);
// Логические операции: ||, &&, ^, ! // конъюнкция, дизъюнкция, разделительная дизъюнкция, инферсия
// Побитовые операции: <<,>>,&,|,^   // побитовые сдвиги: и, или, разделительное или
// int a=8;
// // 8 в побитовом виде будет выглядеть, как 1000. Далее двигаем на 1 бит влево
// // a=a<<1
// System.out.println(a<<1);
// Другие побитовые операции: или
// int a=5;
// int b=2;
// System.out.println(a|b);
// // 101
// // 010
// // 1 или 0 - 1
// // 0 или 1 - 1
// // 0 или 1 - 1
// // Ответ: 111 - это 7
// Другие побитовые операции: и
// int a=5;
// int b=2;
// System.out.println(a&b);
// // 101
// // 010
// // 1 и 0 - 0
// // 0 и 1 - 0
// // 1 и 0 - 0
// // Ответ: 000 - это 0
// Другие побитовые операции: разделительное или ^ (ИСТИНА тогда, когда одно из ИСТИНА)
// int a=5;
// int b=2;
// System.out.println(a^b);
// // 101
// // 010
// // 1 Рили 0 - 1
// // 0 Рили 1 - 1
// // 1 Рили 0 - 1
// // Ответ: 111 - это 7
// Другой пример:
// boolean a=true;
// boolean b=true;
// System.out.println(a&b);
// System.out.println(a&&b);
// Операция с двумя оперсантами - она так называемая "Быстрая операция"
// String s="qwerr1"; // 5, 0...4
// boolean b=s.length()>=5 && s.charAt(4)=='1';
// System.out.println(b);
//

// Массивы
// Одномерные
// Сам код
// public static void main(String[] args) {
//     int[] arr=new int[10];
//     System.out.println(arr.length);

// arr=new int[] {1,2,3,4,5};
// System.out.println(arr.length);
// }
// }
//
// Массивы многомерные
// Сам код
// public static void main(String[] args) {
//     int[] arr[]=new int[3] [5];
//     for (int[] line:arr){
//          for (int item:line){
//              System.out.printf("%d", item);
//          }
//          System.out.println();
//      }
// }
// }
// Преобразования
// byte - short - int - long - double
// byte - short - int - double
// byte - short - int - long - float
// byte - short - int - float
// char - int - long - double
// char - int - double
// char - int - long - float
// char - int - float
//
// Код
// public static void main(String[] args) {
//     int i=123; double d=i;
//     System.out.println(i);
//     System.out.println(d);
//     d=3.1415; i=(int)d;
//     System.out.println(d);
//     System.out.println(i);
//     d=3.9415; i=(int)d;
//     System.out.println(d);
//     System.out.println(i);
//     byte b=Byte.parseByte("123"); // если записать число больше 255 - будет переполнение
//     System.out.println(b);
//     b=Byte.parseByte("1234");
//     System.out.println(b); // Value out of range. Value:"1234" Radix:10
// }
// }
// НО: у нас есть массивы
// public static void main(String[] args) {
//     int[] a=new int[10];
//     double[] d=a; // ИЗУЧАЕМ ковариантность и контравариантность
// }
// }
// Получение данных из терминала
// Строки
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner=new Scanner(System.in);
//         System.out.printf("name: ");
//         String name=iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }
// Некоторые примитивы
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }
// Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag); 
//         int i = iScanner.nextInt();
//         System.out.println(i); 
//         iScanner.close();
//     }
// }
// Форматированный вывод
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }
// Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, 
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений
// public class program {
//     public static void main(String[] args) {
 
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi); // 3,141500
//         System.out.printf("%.2f\n", pi); // 3,14
//         System.out.printf("%.3f\n", pi); // 3,141
//         System.out.printf("%e\n", pi); // 3,141500e+00
//         System.out.printf("%.2e\n", pi); // 3,14e+00
//         System.out.printf("%.3e\n", pi); // 3,141e+00
//     }
//    }
   
// Область видимости переменных
// У переменных существует поняте "обдасть видимости". Если переменную объявлили внутри некоторого блока фигурных скобок{},
// то снаружи этого блока переменная будет недоступна.
// public class program {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i); 
//         } 
//         System.out.println(i); // error: cannot find symbol
//     }
// }
// Функции и методы
// Функции и методы - это технически одно и то же. Функции могут не принадлежать классам, а методы принадлежат.
// В Java все функции являются методами.
// Описание
// Вызов
// Возвращаемое значение
// Рекурсия
// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     } 
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }
   
// Управляющие конструкции
// Управляющие конструкции: условный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;
//         System.out.println(c);
//     }
// }
// Управляющие конструкции: тернарный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }
// Оператор выбора
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
// // ...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }
// Циклы
// Цикл - это многократное выполнение одинаковой последовательности действий.
// В Java доступны следующие циклы: while; do while; for; for in
// Цикл while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }
// Цикл do while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }
// Циклы continue, break
// Операторы для управления циклами - continue и break.
// Выполнение следующей итерации цикла - continue.
// Прерывание текущей итерации цикла - break.
// *ближайшего к опреатору
// Оператор цикла for
// public class program {
//     public static void main(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }
// Вложенные циклы
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }
// for : Работает только для коллекций
// public class program {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }
// Работа с файлами
// создание и запись\дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } 
// }

// Работа с файлами
// Чтение, Вариант посимвольно
// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//         System.out.print(ch);
//     }
// }
// } 
// }
// Работа с файлами
// Вариант построчно
// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }