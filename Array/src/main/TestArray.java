package com.company;

public class TestArray {
    public static void main(String[] args) {
        testDynamicArray();
    }

    private static void testDynamicArray() {
        Array<Integer> data = new ArrayImpl<>(4); // Изначально, мы положили в массив его размер(initialCapacity) 4 [0,1,2,3]
        data.add(5); // [0]
        data.add(4); // [1]
        data.add(3); // [2]
        data.add(2); // [3]
        data.add(1); // [4] тут происходит расширение массива на этом этапе, так как изначально у нас массив в размере 4 [0,1,2,3]
        System.out.println("Изначальный массив:");
        data.display();
        System.out.println();

        System.out.println("Удаление в массиве по индексу 2:");
        data.remove(2); // используем метод remove(index), который хотим удалить, то позиция в индексе 2 - это [0,1]
        data.display();
        System.out.println();

        System.out.println("Удаление в массиве по значению 1:");
        data.remove(Integer.valueOf(1)); // В этом методе remove(E value) тут надо именно создавать обёртку вот так в скобках: Integer.valueOf(какое-то значение), потому-то у нас не будет понимать, что мы удаляем объект или число, если бы это не сделаем
        data.display();
        System.out.println();

        System.out.println("Добавление в массив значение 7, в индекс 2:");
        data.insert(7, 2);
        data.display();
        System.out.println();

        System.out.println("Метод get(index) показывает нам значение в массиве, который индекс мы указали в get(ИНДЕКС)");
        System.out.println("data[1] = " + data.get(1));
        System.out.println();

        System.out.println("Метод contains(value-значение), это метод, говорит о том, если такой элемент в массиве, в который мы передаём или нет. Если есть, ответ true, если нет ответ false");
        System.out.println("Find 7: " + data.contains(7));
        System.out.println("Find 222: " + data.contains(222));
    }
}
