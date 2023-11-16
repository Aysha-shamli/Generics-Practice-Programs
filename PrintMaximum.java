package genericsProblem;

import java.util.Arrays;

public class PrintMaximum<T extends Comparable<T>> {
    private T[] elements;
    public PrintMaximum(T... elements) {
        this.elements = elements;
    }
    public T findMaximum() {
        Arrays.sort(elements);

        return elements[elements.length - 1];
    }

    public static void main(String[] args) {

        PrintMaximum<String> stringMax = new PrintMaximum<>("pomagranate", "Peach", "Banana", "Orange", "Cherry");
        String result1 = stringMax.findMaximum();
        System.out.println("Maximum of string is " + result1);

        PrintMaximum<Integer> intMax = new PrintMaximum<>(10, 55, 75, 25, 45);
        Integer result2 = intMax.findMaximum();
        System.out.println("Maximum of integer is " + result2);

        PrintMaximum<Float> floatMax = new PrintMaximum<>(1.2f, 4.6f, 9.1f, 5.5f, 11.8f);
        Float result3 = floatMax.findMaximum();
        System.out.println("Maximum of float is " + result3);
    }
}
