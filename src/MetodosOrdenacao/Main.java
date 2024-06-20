package MetodosOrdenacao;

public class Main {

	public static void main(String[] args) {
		int[] array = {18,64,92,28,49,83,56,70,38};
		String[] arrayStr = {"g", "i", "Pedro", "Igor", "Ana", "b"};
		Ordenacao ordenar = new Ordenacao();
		/*ordenar.bubbleSort(array);
		for (int i : array)
			System.out.println(i);
		*/
		/*System.out.println();
		ordenar.selectionSorte(array);
		for (int i : array)
			System.out.println(i);
		 */
		/*ordenar.insertionSort(array);
		for (int i : array)
			System.out.println(i);
		System.out.println();
		System.out.println(ordenar.verificaOrdem(array));
		*/
		//ordenar.bubbleSortStr(arrayStr);
		//ordenar.selectionSortStr(arrayStr);
		//ordenar.insertionSortStr(arrayStr);
		//ordenar.bubbleSortLim(array, 4);
		//ordenar.selectionSortLim(array, 4);
		ordenar.insertionSortLim(array, 4);
		for (int i : array)
			System.out.println(i);
	}
}
