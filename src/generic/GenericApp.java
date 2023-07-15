package generic;

public class GenericApp {

    public static void main(String[] args) {
        System.out.println(doOp("Elvin"));
        System.out.println(doOp(2));
        System.out.println(doOp(Integer.MAX_VALUE));
    }

    private static <E> Box<String> doOp(E input) {
        final String result = input.toString() + " -> " + input.getClass().getName();
        return new Box<>(result);
    }
}