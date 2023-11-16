package genericsProblem;

public class FloatMaximum {
    public static Float findMaximum(Float[] elements){
        Float max = elements[0];

        if (elements[1] > max){
            max = elements[1];
        }

        if  (elements[2] > max){
            max = elements[2];
        }

        return max;
    }

    public static void main(String[] args) {

        Float[] floatArray1 = {10.5f, 5.2f, 7.8f};
        Float result1 = findMaximum(floatArray1);
        System.out.println("Test Case 1: Max is " + result1);

        Float[] floatArray2 = {3.3f, 8.9f, 2.7f};
        Float result2 = findMaximum(floatArray2);
        System.out.println("Test Case 2: Max is " + result2);

        Float[] floatArray3 = {1.2f, 4.6f, 9.1f};
        Float result3 = findMaximum(floatArray3);
        System.out.println("Test Case 3: Max is " + result3);
    }
}
