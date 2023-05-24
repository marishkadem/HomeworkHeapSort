


    public class heapSort {
        public static void sort(int[] array) {
            for (int i = array.length / 2 - 1; i >= 0; i--)
                heapify(array, array.length, i);
            for (int i = array.length - 1; i >= 0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
            }
        }

        private static void heapify(int[] array, int heapSize, int rootIndex) {
            int largest = rootIndex;
            int left = 2 * rootIndex + 1;
            int right = 2 * rootIndex + 2;

            if (left < heapSize && array[left] > array[largest])
                largest = left;

            if (right < heapSize && array[right] > array[largest])
                largest = right;

            if (largest != rootIndex) {
                int temp = array[rootIndex];
                array[rootIndex] = array[largest];
                array[largest] = temp;

                heapify(array, heapSize, largest);
            }
        }
    }