package genericsProblem;

public class StringMaximum {
    public static String findMaximum(String[] elements) {
        String max = elements[0];

        if (elements[1].compareTo(max) > 0) {
            max = elements[1];
        }

        if (elements[2].compareTo(max) > 0) {
            max = elements[2];
        }

        return max;
    }

    public static void main(String[] args) {
        String[] stringArray1 = {"pomagranate", "Peach", "Banana"};
        String result1 = findMaximum(stringArray1);
        System.out.println("Test Case 1: Max is " + result1);

        String[] stringArray2 = {"Orange", "Peach", "Banana"};
        String result2 = findMaximum(stringArray2);
        System.out.println("Test Case 2: Max is " + result2);

        String[] stringArray3 = {"Orange", "Peach", "Pineapple"};
        String result3 = findMaximum(stringArray3);
        System.out.println("Test Case 3: Max is " + result3);
    }
}

