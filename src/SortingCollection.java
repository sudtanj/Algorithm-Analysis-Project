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
    
    public static <T extends Comparable<? super T>> void  shellSort(List<T> list){
        int n = list.size(),j;
        T temp=null;
        for (int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i += 1){
                temp = list.get(i);

                for (j = i; j >= gap && list.get(j-gap).compareTo(temp)>-1 ; j -= gap)
                	list.set(j, list.get(j-gap));
 
                list.set(j, temp);
            }
        }
    }
   public static <T extends Comparable<? super T>> void oyelamiSort(List<T> list,int size) {
	   int i=1,j=size-1;
	   while (i<j) {
		   if(list.get(i).compareTo(list.get(j))>-1) 
			   Collections.swap(list, i, j);
		   i++;
		   j--;
	   }
	   bidirectionalBubbleSort(list);
   }
    
    //Tools
    
    private static <T extends Comparable<? super T>> void bidirectionalBubbleSort(List<T> arr){
       int left = 0, right = arr.size()-1;
       while (left < right){
          for (int pos = left; pos < right; pos++)
          {
        	 if(arr.get(pos).compareTo(arr.get(pos+1))>-1)
        		 Collections.swap(arr, pos, pos+1);
                //swap(pos, pos+1);
          }
          right--;


          for (int pos = right; pos > left; pos--)
          {
        	 if(arr.get(pos).compareTo(arr.get(pos-1))<1)
        		 Collections.swap(arr, pos, pos-1);
        		 //if (a[pos] < a[pos-1])
               //swap(pos, pos-1);
          }
          left++;
       }
   }  

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