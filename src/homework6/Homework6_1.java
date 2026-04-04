package homework6;

/*
Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */
public class Homework6_1 {

    public void onecatch() { // 1 метод c try-catch
        try { // код который приводит к исключению
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) { // тип исключения к которому может привести код
            System.out.println("Произошла арифметическая ошибка");
        }
        System.out.println("Программа все равно продолжила работать");
    }

    public void twocatch() { // 2 метод c try-catch с несколькими catch
        try { // код который приводит к исключению
            int[] num = {1, 2, 3};
            int a = 10 / 0;
            System.out.println(num[10]);
        } catch (ArithmeticException e) { // тип исключения к которому может привести код
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) { // тип исключения к которому может привести код
            System.out.println("Выход за пределы массива");
        }
        System.out.println("Программа все равно продолжила работать");
    }

    public void multicatch() { // 3 метод c multicatch
        try { // код который приводит к исключению
            int[] num = {1, 2, 3};
            int a = 10 / 0;
            System.out.println(num[10]);
        } catch (ArithmeticException |
                 ArrayIndexOutOfBoundsException e) { // тип исключения к которому может привести код
            System.out.println("Произошла типовая ошибка");
        }
        System.out.println("Программа все равно продолжила работать");
    }

    public void catchfinally() { // 4 метод c try-catch-finally
        try { // код который приводит к исключению
            int[] num = {1, 2, 3};
            System.out.println(num[10]);
        } catch (ArrayIndexOutOfBoundsException e) { // тип исключения к которому может привести код
            System.out.println("Произошла типовая ошибка");
        } finally {
            System.out.println("Finally выводится несмотря на то, что была ошибка");
        }
        System.out.println("Программа все равно продолжила работать");
    }
}
