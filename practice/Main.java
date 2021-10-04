public class Main {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();

        String s = "[(({)(00)}))]";
        System.out.println(validParentheses.isValid(s));
    }
}
