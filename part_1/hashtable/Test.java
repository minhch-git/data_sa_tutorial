import java.util.Hashtable;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Hashtable<String, String> myDictionary = new Hashtable<>();
        myDictionary.put("python", "Python is an interpreted high-level general-purpose programming language.");
        myDictionary.put("java",
                "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        myDictionary.put("node",
                "Node.js is an open-source, cross-platform, back-end JavaScript runtime environment that runs on the V8 engine and executes JavaScript code outside a web browser");
        for (String key : myDictionary.keySet()) {
            String value = myDictionary.get(key);
            System.out.println(key + " - HAS THE MEANING - " + value);
        }
    }
}