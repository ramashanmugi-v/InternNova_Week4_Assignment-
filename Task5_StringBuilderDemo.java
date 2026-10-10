public class Task5_StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello Java");

        System.out.println("Original Text: " + text);

        text.append(" Programming");
        System.out.println("After Append: " + text);

        text.insert(5, " World");
        System.out.println("After Insert: " + text);

        text.replace(0, 5, "Hi");
        System.out.println("After Replace: " + text);

        text.reverse();
        System.out.println("After Reverse: " + text);
    }
}
