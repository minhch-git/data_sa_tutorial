public class ValidParentheses {
    private boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }
    private boolean isRightBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }
    private boolean isValidBracket(char top, char ch) {
        return top == '(' && ch != ')' || top == '{' && ch != '}' || top == '[' && ch != ']';
    }

    public boolean isValid(String s) {
        StackCharacter stackCharacter = new StackCharacter();
        for (Character ch : s.toCharArray()) {
            if(isLeftBracket(ch))
                stackCharacter.push(ch);
            if (isRightBracket(ch)){
                if (stackCharacter.isEmpty()) return false;

                var top = stackCharacter.pop();
                if(isValidBracket(top, ch)) return false;

            }
                
        }
        return stackCharacter.isEmpty();
    }

}
