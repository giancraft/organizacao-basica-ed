package MetodosOrdenacao;

public class Ordenacao {
	
	public int[] bubbleSort(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public int[] selectionSort(int array[]) {
		int min, aux;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}
	
	public int[] insertionSort(int array[]) {
		int pivo, j;
		for (int i = 1; i < array.length; i++) {
			pivo = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > pivo) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = pivo;
		}
		return array;
	}
	
	public boolean verificaOrdem(int array[]) {
		boolean verificador = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					verificador = false;
				}
			}
		}
		return verificador;
	}
	
	public String[] bubbleSortStr(String array[]) {
		String temp = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareToIgnoreCase(array[j+1]) > 0) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public String[] selectionSortStr(String array[]) {
		int min;
		String aux;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareToIgnoreCase(array[min]) < 0) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}
	
	public String[] insertionSortStr(String array[]) {
		int j;
		String pivo;
		for (int i = 1; i < array.length; i++) {
			pivo = array[i];
			j = i - 1;
			while (j >= 0 && array[j].compareToIgnoreCase(pivo) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = pivo;
		}
		return array;
	}
	
	public int[] bubbleSortLim(int array[], int k) {
		int temp = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public int[] selectionSortLim(int array[], int k) {
		int min, aux;
		for (int i = 0; i < k - 1; i++) {
			min = i;
			for (int j = i + 1; j < k; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}
	
	public int[] insertionSortLim(int array[], int k) {
		int pivo, j;
		for (int i = 1; i < k; i++) {
			pivo = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > pivo) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = pivo;
		}
		return array;
	}
	
	
	
	
	
}
