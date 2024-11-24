import java.util.*;

public class ArrayStack implements Stack<T>{

	private ArrayList<T> list = new ArrayList<>();
	private int countElements = 0;

	public ArrayStack(){
	}

	@Override
	public void push(T element){
		list.add(element);
		countElements++;
	} // insere um elemento no topo da pilha.
	@Override
	public T peek(){
		return list.get(size() - 1);
	} // consulta o elemento que está no topo da pilha (caso exista). FIM ULTIMO
	@Override
	public T pop(){
		T result = peek();
		list.remove(size() - 1);
		countElements--;
		return result;
	} //remove (e devolve) o elemento que está no topo da pilha (caso exista). FIM ULTIMMO
	@Override
	public int size(){
		return countElements;
	} //devolve o número de elementos da pilha.
	@Override
	public boolean isEmpty(){
		return countElements == 0;
	} //devolve verdadeiro caso a pilha esteja vazia, falso caso
}