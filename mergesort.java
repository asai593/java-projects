package xyz;

public class mergesort {

   
    public void sort(int[] array, int left, int right) {
        if (left < right) {
            
            int middle = left + (right - left) / 2;

            
            sort(array, left, middle);
            sort(array, middle + 1, right);

            
            merge(array, left, middle, right);
        }
    }

    private void merge(int[] array, int left, int middle, int right) {
        
        int n1 = middle - left + 1;
        int n2 = right - middle;

        
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

       
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[middle + 1 + j];

       

        
        int i = 0, j = 0;

       
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    
    public void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7 };

        mergesort ms = new mergesort();
        System.out.println("Given Array:");
        ms.printArray(array);

        ms.sort(array, 0, array.length - 1);

        System.out.println("\nSorted Array:");
        ms.printArray(array);
    }
}
