// This interface should have only one method
// In Python, this corresponds to: lambda x:x 
interface StringFunction{
    String run(String str);
}

public class Main {

    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + " !";
        StringFunction ask = (s) -> s + " ?";
        addChar("Hello world", ask);
    }
    public static void addChar(String text, StringFunction str){
        String rsl = str.run(text);
        System.out.println(rsl);
    }
}
