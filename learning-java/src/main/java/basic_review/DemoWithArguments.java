package basic_review;

// app that receives and process external arguments
public class DemoWithArguments {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
