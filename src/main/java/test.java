import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        char[] n = prime(new char[]{'s', 'd', 'v'});
        System.out.println(n);
        Animal dog = new Animal();
        Wen v1 = new Wen();
        System.out.println(v1.weight=1.43);
        v1.age=19;
        v1.name="12";
        dog.bark();

    }
    public static char [] prime(char[] arr) {
        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr2.length-1-i] = arr[i];
        }
        return (arr2);
    }
}

