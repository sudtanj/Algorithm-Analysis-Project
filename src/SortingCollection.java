import java.util.Collections;
import java.util.List;

public class SortingCollection {
    public static <T extends Comparable<? super T>> void pancakeSort(List<T> list){
        int mi=0;
        for (int curr_size = list.size(); curr_size > 1; --curr_size){
            mi = findMax(list, curr_size);
            if (mi != curr_size-1){
                flip(list, mi);
                flip(list, curr_size-1);
            }
        }
    }
    
    //Tools
    
    private static <T extends Comparable<? super T>> void flip(List<T> arr, int i){
        T temp;
		int start = 0;
        while (start < i)
        {
            temp = arr.get(start);
            arr.set(start, arr.get(i));
            arr.set(i, temp);
            start++;
            i--;
        }
    }
    private static <T extends Comparable<? super T>> int findMax(List<T> list, int n)
    {
        int mi, i;
        for (mi = 0, i = 0; i < n; ++i)
            if (list.get(i).compareTo(list.get(mi)) > -1)
                mi = i;
        return mi;
    }
}