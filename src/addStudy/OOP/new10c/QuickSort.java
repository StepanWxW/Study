package addStudy.OOP.new10c;

public class QuickSort implements Sort {
    String name;

    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }

    public int[] sort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            sort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            sort(array, leftBorder, rightMarker);
        }
        return array;
    }

    @Override
    public String getName() {
        name ="Quick";
        return name;
    }

}