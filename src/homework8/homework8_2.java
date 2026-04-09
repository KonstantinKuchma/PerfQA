package homework8;

import java.util.LinkedList;

public class homework8_2 {
    /*
   Задача 2:
   Создать класс, который будет хранить в себе коллекцию с названиями
   животных. Реализовать методы удаления и добавления животных по
   следующим правилам: добавляется всегда в начало коллекции, а удаляется
   всегда из конца. Показать работу объекта этого класса в main методе другого
   класса.
     */
    LinkedList<String> animals; // создали карту

    public homework8_2() { // создали конструктор
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animal) { // добавляем элемент в начало списка
        animals.addFirst(animal);
    }

    public void removeAnimal() { // удаляем элемент из конца списка
        animals.removeLast();
    }

    public void printCollection() {
        System.out.println("Коллекция животных состоит из: " + animals);
    }
}
