package ExerciseFour;

public class QuickSort extends NumberList implements Sort {
	int[] arr = this.getList();
	public QuickSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
	public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
	@Override
	public void sort() {
        this.quickSort(arr, 0, arr.length - 1);
    }
}
