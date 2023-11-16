package genericsProblem;


public class FindMaximum {
    public static Integer findMaximum(Integer[] elements) {
        Integer max = elements[0];

        if (elements[1] > max) {
            max = elements[1];
        }

        if (elements[2] > max) {
            max = elements[2];
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] intArray = {10, 5, 7};
        Integer result1 = findMaximum(intArray);
        System.out.println("Test Case 1: Max is " + result1);

        Integer[] intArray1 = {10, 55, 7};
        Integer result2 = findMaximum(intArray1);
        System.out.println("Test Case 2: Max is " + result2);

        Integer[] intArray2 = {10, 55, 75};
        Integer result3 = findMaximum(intArray2);
        System.out.println("Test Case 3: Max is " + result3);
    }
}
