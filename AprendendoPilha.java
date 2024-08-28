import java.util.Stack;
public class AprendendoPilha {
    public static void main(String [] args){
        Stack<String> pilha = new Stack();
        
        System.out.println(pilha.size()); //
        System.out.println(pilha.isEmpty()); //A lista esta vazia? True ou false
        
        
        pilha.push("banana");
        pilha.push("manga");
        pilha.push("sapoti");
        pilha.push("maça");
        
        System.out.println(pilha.size());
        System.out.println(pilha.peek()); //ele só olha, vai retornar um elemento sem retira-lo
        
        System.out.println(pilha.pop()); // irá excluir o "maça", sendo do ultimo para o primeiro.
        System.out.println(pilha.pop()); //irá excluir o "sapoti"
        System.out.println(pilha.pop()); //irá excluir a "manga"
        
        System.out.println(pilha.size()); //retorna quantos itens tem dentro da pilha.
        
    }
}
