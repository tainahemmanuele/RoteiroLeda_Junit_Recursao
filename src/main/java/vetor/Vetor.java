package vetor;

import java.util.Comparator;

/**
 * Implementação de um vetor de objetos simples para exercitar os conceitos de Generics.
 * @author Adalberto
 *
 */
public class Vetor<T extends Comparable <T>>{
	
	//O array interno onde os objetos manipulados são guardados
	private T[] arrayInterno;
	
	//O tamanho que o array interno terá
	private int tamanho;
	
	//Indice que guarda a proxima posição vazia do array interno
	private int indice;
	
	//O Comparators a serem utilizados
	private Comparator<T> comparadorMaximo;
	private Comparator<T> comparadorMinimo;
	
	
	public Vetor(int tamanho) {
		this.arrayInterno = (T[]) new Comparable[tamanho];
		//super();
		this.tamanho = tamanho;
		this.indice = 0;
	}
	
	public void setComparadorMaximo(Comparator comparadorMaximo) {
		this.comparadorMaximo = comparadorMaximo;
	}

	public void setComparadorMinimo(Comparator comparadorMinimo) {
		this.comparadorMinimo = comparadorMinimo;
	}


	//Insere um objeto no vetor
	public void inserir(T o){
		if (!isCheio()){
			arrayInterno[indice]=o;
			indice++;
		}
		
	}
	
	//Remove um objeto do vetor
	public void remover(T o){
		int indice = procurar(o);
		for (int i = indice; i < arrayInterno.length-1; i++) {
			arrayInterno[i]= arrayInterno[i+1];
		}
		arrayInterno[tamanho-1] = null;
		this.indice--;
	}
	
	//Procura um elemento no vetor
	public int procurar(T o){
		for (int i=0; i < arrayInterno.length; i++){
			if (arrayInterno[i].compareTo(o) == 0){
				return i;
			}
		}
		return -1;
	}
	
	//Diz se o vetor está vazio
	public boolean isVazio(){
		return false;
	}
	
	//Diz se o vetor está cheio
	public boolean isCheio(){
		return false;
	}
	
	public T compara(Comparator <T> comparador){
		T max = arrayInterno[0];
		for (int i = 1; i < indice; i++) {
			if (comparador.compare(max, arrayInterno[i])== -1);
			max = arrayInterno[i];
			
		}
		return max;
	}
	
	public T maximo(){
		return compara(comparadorMaximo);
	}
	
	public T minimo(){
		return compara(comparadorMinimo);
	}

	public int size() {
		return arrayInterno.length;
	}
	 
}
