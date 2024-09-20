import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Omg {
    public static void main(String[] args) {
        Queue<String> carro = new LinkedList<>();


        System.out.println(carro.poll());
        carro.add("Jetta");
        System.out.println();
        System.out.println("Topo da lista esta vazio" + carro);
        //Queue<Integer> notas = new LinkedList<>();
    }
}
