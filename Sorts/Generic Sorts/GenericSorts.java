/**
* @author Charley Sheaffer
* @version 11/15/2017
*/

public class GenericSorts {
    
  
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        T temp;
        int largestLoc;
        for (int i=array.length-1; i>0; i--) {
            largestLoc = 0;
            for (int j=1; j<=i; j++) {
                if (array[j].compareTo(array[largestLoc]) > 0)
                    largestLoc = j;
            }
            temp = array[i];
            array[i] = array[largestLoc];
            array[largestLoc] = temp;
        }
    }
       
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        T current = null;
        for (int i=1; i<array.length; i++) {
            current = array[i];
            int j=i-1;
            while (j >= 0 && current.compareTo(array[j]) < 0) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        boolean swapMade = true;
        T temp = null;
        for (int i=1; i<array.length && swapMade; i++) {
            swapMade = false;
            for (int j=0; j<array.length-i; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapMade = true;
                }
            }
        }
    }
    
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        mergeSort(array, 0, array.length-1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array, int start, int end) {
         if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
         }
    }
    
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> 
      void merge(T[] array, int start, int mid, int end) {
        T[] tempArray = (T[]) new Comparable[array.length];
        int first1 = start;
        int last1 = mid;
        int first2 = mid+1;
        int last2 = end;
        int index = start;

        while (first1 <= last1 && first2 <= last2)
        {
            if (array[first1].compareTo(array[first2]) <= 0) {
                tempArray[index] = array[first1];
                first1++;
            }
            else {
                tempArray[index] = array[first2];
                first2++;
            }
            index++;
        }

        while (first1 <= last1) {
            tempArray[index] = array[first1];
            first1++;
            index++;
        }
       
        while (first2 <= last2) {
            tempArray[index] = array[first2];
            first2++;
            index++;
        }

        for (index=start; index<=end; index++)
            array[index] = tempArray[index];
    }

    public static <T extends Comparable<T>> void quickSort(T[] array) {
        quickSort(array, 0, array.length-1);
    }
    
    private static <T extends Comparable<T>> void quickSort(T[] array, int start, int end) {
        if (start < end) {
            int split = partition(array, start, end);
            quickSort(array, start, split-1);
            quickSort(array, split+1, end);
        }
    }
    
    private static <T extends Comparable<T>> int partition(T[] array, int start, int end) {
        T temp;
        int originalStart = start;
        T pivot = array[start];
        while (start < end) {
            while (array[start].compareTo(pivot) <= 0 && start < end) start++;
            while (array[end].compareTo(pivot) > 0 && start <= end) end--;
            if (start < end) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        temp = array[originalStart];
        array[originalStart] = array[end];
        array[end] = temp;
        return end;
    }
    
    public static <T> void printArray(T[] array) {
        if (array.length > 100 ){
            System.out.println("Array too large to print!");
        }
        else {
            System.out.print("[");
            for (int i=0; i<array.length-1; i++)
                System.out.print(array[i].toString() + ", ");
            System.out.println(array[array.length-1] + "]");
        }
    }
}