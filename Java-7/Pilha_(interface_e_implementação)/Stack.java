
public interface Stack<E>{
	void push(E element); // insere um elemento no topo da pilha.
	E peek(); // consulta o elemento que está no topo da pilha (caso exista). FIM ULTIMO
	E pop(); //remove (e devolve) o elemento que está no topo da pilha (caso exista). FIM ULTIMMO
	int size(); //devolve o número de elementos da pilha.
	boolean isEmpty(); //devolve verdadeiro caso a pilha esteja vazia, falso caso
}