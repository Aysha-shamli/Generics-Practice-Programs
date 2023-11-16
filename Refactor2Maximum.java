package genericsProblem;

public class Refactor2Maximum<T extends Comparable<T>> {
    private T var1;
    private T var2;
    private T var3;
    public Refactor2Maximum(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public T findMaximum() {
        return Refactor2Maximum.findMaximum(var1, var2, var3);
    }

    public static <T extends Comparable<T>> T findMaximum(T var1, T var2, T var3) {
        T max = var1;

        if (var2.compareTo(max) > 0) {
            max = var2;
        }

        if (var3.compareTo(max) > 0) {
            max = var3;
        }

        return max;
    }

    public static void main(String[] args) {

        Refactor2Maximum<String> stringMaxFinder = new Refactor2Maximum<>("pomagranate", "Peach", "Banana");
        String result1 = stringMaxFinder.findMaximum();
        System.out.println("Maximum of string is " + result1);

        Refactor2Maximum<Integer> intMaxFinder = new Refactor2Maximum<>(10, 55, 7);
        Integer result2 = intMaxFinder.findMaximum();
        System.out.println("Maximum of integer is " + result2);

        Refactor2Maximum<Float> floatMaxFinder = new Refactor2Maximum<>(1.2f, 4.6f, 9.1f);
        Float result3 = floatMaxFinder.findMaximum();
        System.out.println("Maximum of float is " + result3);
    }
}
