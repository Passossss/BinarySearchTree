import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> notas = new LinkedList<>();

        notas.add(7);
        notas.add(8);
        notas.add(9);
        notas.add(6);
        notas.add(10);
        notas.add(2);

        System.out.println("Topo da fila: " +notas.peek());// elemento topo da pilha
        System.out.println(notas.poll());//retirar elemento da fila
        System.out.println(notas);
        System.out.println(notas.isEmpty()?"Fila vazia":"Fila com elementos");//operador um ou outro


    }



    /*public static void main (String[] args) {
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
    */
}
