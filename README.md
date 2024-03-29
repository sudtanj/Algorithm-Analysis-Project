# Algorithm-Analysis-Project  [![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](https://github.com/sudtanj/OS-Project)
Algorithm Analysis Project at Universitas Pelita Harapan

## Project Member
| No | Profile Picture | Member Name | Github Userid | Student Id Number |
| ------ | ------ | ------ | ------ | ------ |
| 1. | <img src="https://avatars.githubusercontent.com/bryanchr" width=100 height=100 /> |Bryan Christofel Yehezkiel | <a title="@bryanchr" href="https://github.com/bryanchr">@bryanchr</a> | 00000016528 | 
| 2. | <img src="https://avatars.githubusercontent.com/feroniameimei" width=100 height=100/> | Feronia Meilinda | <a title="@feroniameimei" href="https://github.com/feroniameimei">@feroniameimei</a> |   00000012566 |
| 3. | <img src="https://avatars.githubusercontent.com/rickhenhermawan" width=100 height=100/> | Rickhen Hermawan | <a title="@rickhenhermawan" href="https://github.com/rickhenhermawan">@rickhenhermawan</a> |           00000012311 |
| 4. | <img src="https://avatars.githubusercontent.com/sudtanj" width=100 height=100/> | Sudono Tanjung | <a title="@sudtanj" href="https://github.com/sudtanj">@sudtanj</a> |              				 00000012273 |

## Report Document

### Paper
<a href="https://goo.gl/fjaodJ"><img src="https://www.orrasis.com/img/google/docs.png" width="100" height="100"/></a>
<a href="https://goo.gl/BDAA6V"><img src="http://clickhowto.com/wp-content/uploads/2017/10/Compatibility_Adobe_PDF_Logo.jpg" width="100" height="100"/></a>

### Sorting
<a href="https://goo.gl/PQmN3Z"><img src="https://lh3.ggpht.com/e3oZddUHSC6EcnxC80rl_6HbY94sM63dn6KrEXJ-C4GIUN-t1XM0uYA_WUwyhbIHmVMH=w300" width="100" height="100"/></a>

### Computer spec for testing purpose
```
Cpu     = Intel(R) Xeon(R) CPU @ 2.30GHz
Core    = 4 
Ram     = 512 MB
Storage = 2 GB
```

## Summary Of Algorithms Performance
<img src="https://docs.google.com/spreadsheets/d/e/2PACX-1vSgupUVVjq-4JxvbEpIkjXbonw2qpxtKtpSkYSri5iue5Qq0T_BRf-PjrGJslfYkoegxUVRKOOcU0ei/pubchart?oid=2000530860&format=image" width="1000" height="500"/>

## Pancake Sort Algorithm
<table border="0"><tr><td width=300>
<img src="https://rosettacode.org/mw/images/c/ce/Pancake.gif" width="300" height="300"/></td>
    <td>
<p align="justify"> &emsp; Pancake sorting is the colloquial term for the mathematical problem of sorting a disordered stack of pancakes in order of size when a spatula can be inserted at any point in the stack and used to flip all pancakes above it. A pancake number is the minimum number of flips required for a given number of pancakes. In this form, the problem was first discussed by American geometer Jacob E. Goodman. It is a variation of the sorting problem in which the only allowed operation is to reverse the elements of some prefix of the sequence. Unlike a traditional sorting algorithm, which attempts to sort with the fewest comparisons possible, the goal is to sort the sequence in as few reversals as possible. A variant of the problem is concerned with burnt pancakes, where each pancake has a burnt side and all pancakes must, in addition, end up with the burnt side on bottom.</p> 
    </td></tr></table>

### Pseudocode
```pseudo
PancakeFlipper(A[1 · · n])
if n > 1
Let k be the index if the largest pancake
Flip(A[1 · · k])
Flip(A[1 · · n])
PancakeFlipper(1 · · n − 1)
```

### Worst-case performance
- Run Time (based on flips): O(n<sup>2</sup>)
- Memory Required: O(n)

### Best-case performance
- Run Time (based on flips): O(n)
- Memory Required: O(n)


### Chart Result
<img src="./result/result_in_chart_HD/Pancake_Sort_300_DPI.png" width="1000" height="500"/>

## Shell Sort Algorithm
<table border="0"><tr><td width=300>
<img src="https://upload.wikimedia.org/wikipedia/commons/d/d8/Sorting_shellsort_anim.gif" width="300" height="300"/></td>
    <td>
<p align="justify"> &emsp; Shellsort, also known as Shell sort or Shell's method, is an in-place comparison sort. It can be seen as either a generalization of sorting by exchange (bubble sort) or sorting by insertion (insertion sort). The method starts by sorting pairs of elements far apart from each other, then progressively reducing the gap between elements to be compared. Starting with far apart elements, it can move some out-of-place elements into position faster than a simple nearest neighbor exchange. Donald Shell published the first version of this sort in 1959. The running time of Shellsort is heavily dependent on the gap sequence it uses. For many practical variants, determining their time complexity remains an open problem.</p>
    </td></tr></table>

### Pseudocode
```pseudo
# Sort an array a[0...n-1].
gaps = [701, 301, 132, 57, 23, 10, 4, 1]

# Start with the largest gap and work down to a gap of 1
foreach (gap in gaps)
{
    # Do a gapped insertion sort for this gap size.
    # The first gap elements a[0..gap-1] are already in gapped order
    # keep adding one more element until the entire array is gap sorted
    for (i = gap; i < n; i += 1)
    {
        # add a[i] to the elements that have been gap sorted
        # save a[i] in temp and make a hole at position i
        temp = a[i]
        # shift earlier gap-sorted elements up until the correct location for a[i] is found
        for (j = i; j >= gap and a[j - gap] > temp; j -= gap)
        {
            a[j] = a[j - gap]
        }
        # put temp (the original a[i]) in its correct location
        a[j] = temp
    }
}
```

### Worst-case performance
- O(n<sup>2</sup>) (worst known gap sequence)
- O(n log<sup>2</sup>n) (best known gap sequence)

### Best-case performance
- O(n log n)

### Average performance
- depends on gap sequence

### Chart Result
<img src="./result/result_in_chart_HD/Shell_Sort_300_DPI.png" width="1000" height="500"/>

## Oyelami Sort Algorithm
<table border="0"><tr><td width=300>
<img src="./algorithm_animation/oyelami.gif" width="300" height="300"/></td>
    <td>
<p align="justify"> &emsp; Sorting involves rearranging information into either ascending or descending order. There are many
sorting algorithms, among which is Bubble Sort. Bubble Sort is not known to be a very good sorting
algorithm because it is beset with redundant comparisons. However, efforts have been made to
improve the performance of the algorithm. With Bidirectional Bubble Sort, the average number of
comparisons is slightly reduced and Batcher’s Sort similar to Shellsort also performs significantly
better than Bidirectional Bubble Sort by carrying out comparisons in a novel way so that no
propagation of exchanges is necessary. Bitonic Sort was also presented by Batcher and the strong
point of this sorting procedure is that it is very suitable for a hard-wired implementation using a sorting
network. This paper presents a meta algorithm called Oyelami’s Sort that combines the technique of
Bidirectional Bubble Sort with a modified diminishing increment sorting. The results from the
implementation of the algorithm compared with Batcher’s Odd-Even Sort and Batcher’s Bitonic Sort
showed that the algorithm performed better than the two in the worst case scenario. The implication is
that the algorithm is faster.</p> 
    </td></tr></table>

### Pseudocode
```pseudo
Begin
1. i = 1
2. j = size
3. while (i < j) do
begin
4. if array[i] > array[j] swap (array, i, j)
5. i = i + 1
6. j = j – 1
end
[Call Bidirectional Bubble Sort to sort the adjacent elements]
7. Bidirectional Bubble Sort (A, size:int)
End
```

### Worst-case performance
- The worst-case occurs in a sorting algorithm when the elements to be sorted are in reverse order.

### Best-case performance
- The best-case occurs when the elements are already sorted.

### Average performance
- The average–case may occur when part of the elements are already sorted or data randomly distributed in the list. The average case may not be easy to determine in that it may not be apparent what constitutes an ‘average’ input.

### Chart Result
<img src="./result/result_in_chart_HD/Oyelami_Sort_300_DPI.png" width="1000" height="500"/>

## Avi Sort Algorithm
<table border="0"><tr><td width=300>
<img src="./algorithm_animation/avi_sort.png" width="300" height="300"/></td>
    <td>
<p align="justify"> &emsp; In the case of rearranging an array with N elements
either in ascending or in descending order. We find that, sorting
algorithms such as the Bubble, Insertion and Selection Sort have
a quadratic time complexity. In this paper, we introduce Avi sort
– a new algorithm to sort an N elements array by exchanging
their specific alternate position. We evaluate time complexity
O(N2) of Avi sort theoretically and empirically. Our results show
a one more different way to sort the data elements in quadratic
time complexity and experimentally prove its actual time lies in
between insertion and selection sort.</p> 
    </td></tr></table>

### Pseudocode
```pseudo
Avi_Sort (A, N)
//Let A is a linear array with N elements i.e. A [1: N]
Step 1 Repeat steps 2, 3 and 4 for i = 1 to N-1
Step2 Repeat step 3 for j = 1 to N-1-i
Step 3 //Exchange Elements
if A[j]> A[j+2]
A[j] ↔ A [j+2]
//End of if statement
//End of step 2 for statement
Step 4 //Exchange Elements
if A[j]> A[j+1]
A[j] ↔ A [j+1]
//End of if statement
//End of step 1 for statement
Step 5 Exit
Fig.
```

### Worst-case performance
- O(N<sup>2</sup>)
- execution time lies in between selection and insertion sort

### Best-case performance
- O(N)

### Average performance
- Avi sort execution time is equal to insertion sort

### Chart Result
<img src="./result/result_in_chart_HD/Avi_Sort_300_DPI.png" width="1000" height="500"/>

## Reference 
- https://austingwalters.com/everyday-algorithms-pancake-sort/
