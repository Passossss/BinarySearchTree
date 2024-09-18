import java.util.Stack;

public class Test {

    public static void main (String[] args) {
        Stack<Integer> notas = new Stack<>();
        notas.add(2);
        notas.add(3);
        notas.add(2);
        notas.add(2);
        notas.add(2);
        notas.add(7);
        notas.add(2);
        notas.add(2);

        System.out.println(notas);
        for(Integer n:notas){
            System.out.println(n);
        }
    }


}
