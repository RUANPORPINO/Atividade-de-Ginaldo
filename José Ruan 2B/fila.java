
import java.util.Queue;
import java.util.LinkedList;
public class fila {
public static void main (String[] args) {
  System.out.println("Fila de Pessoas");
Queue<String> Animais = new LinkedList<>(); 
Animais.add("Boi");
Animais.add("Gato");
Animais.add("Gorila");
Animais.add("Gaviao");

System.out.println("Ai o que está sua fila: " + Animais);
System.out.println("O primeiro da fila é: " + Animais.peek());
System.out.println("Primeiro da fila é retirado: " + Animais.poll());
System.out.println(Animais.isEmpty()?"A Fila está vazia": "Tem elementos na Fila");
System.out.println("Agora a fila está desse jeito" + Animais);
System.out.println("Fila de Animais");
 }
}