package genericsProblem;
public class RefactorMaximum<T extends Comparable<T>> {
    public T findMaximum(T[] elements) {
        T max = elements[0];

        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        String[] stringArray = {"Pomagranate", "Peach", "Banana"};
        RefactorMaximum<String> stringMaxFinder = new RefactorMaximum<>();
        String result1 = stringMaxFinder.findMaximum(stringArray);
        System.out.println("Maximum of string is " + result1);

        Integer[] intArray = {10, 55, 7};
        RefactorMaximum<Integer> intMaxFinder = new RefactorMaximum<>();
        Integer result2 = intMaxFinder.findMaximum(intArray);
        System.out.println("Maximum of integer is " + result2);

        Float[] floatArray = {1.2f, 4.6f, 9.1f};
        RefactorMaximum<Float> floatMaxFinder = new RefactorMaximum<>();
        Float result3 = floatMaxFinder.findMaximum(floatArray);
        System.out.println("Maximum of float is " + result3);
    }
}
