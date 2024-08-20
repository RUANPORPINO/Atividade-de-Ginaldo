import java.util.Stack;
import java.util.LinkedList;
public class pilha {
    public static void main (String[] args) {
        System.out.println("Pilha de numeros");
        Stack<String> numeros = new Stack<>();
        numeros.push("12");
        numeros.push("40");
        numeros.push("20");
        System.out.println(" numero que estava no topo da pilha: " + numeros.pop());
        System.out.println("Foi colocado um novo elemento no topo: "  + numeros.peek());
        System.out.println("Agora a pilha está desse jeito: " + numeros);
          }
    }