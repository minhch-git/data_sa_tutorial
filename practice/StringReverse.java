
public class StringReverse {
  public static void main(String[] args) {
    String myString = "minh chiu";
    StringBuffer sb = new StringBuffer();
    StackCharacter myStack = new StackCharacter();

    for (char ch : myString.toCharArray())
      myStack.push(ch);
    myStack.show();
    
    while (!myStack.isEmpty()) {
      sb.append(myStack.pop());
    }
    System.out.println(sb);
  }
}
