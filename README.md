# Algorithm-Analysis-Project  [![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](https://github.com/sudtanj/OS-Project)
Algorithm Analysis Project at Universitas Pelita Harapan

## Project Member
| No | Profile Picture | Member Name | Github Userid | Student Id Number |
| ------ | ------ | ------ | ------ | ------ |
| 1. | <img src="https://avatars.githubusercontent.com/bryanchr" width=100 height=100 /> |Bryan Christofel Yehezkiel | <a title="@bryanchr" href="https://github.com/bryanchr">@bryanchr</a> | 00000016528 | 
| 2. | <img src="https://avatars.githubusercontent.com/feroniameimei" width=100 height=100/> | Feronia Meilinda | <a title="@feroniameimei" href="https://github.com/feroniameimei">@feroniameimei</a> |   00000012566 |
| 3. | <img src="https://avatars.githubusercontent.com/rickhenhermawan" width=100 height=100/> | Rickhen Hermawan | <a title="@rickhenhermawan" href="https://github.com/rickhenhermawan">@rickhenhermawan</a> |           00000012311 |
| 4. | <img src="https://avatars.githubusercontent.com/sudtanj" width=100 height=100/> | Sudono Tanjung | <a title="@sudtanj" href="https://github.com/sudtanj">@sudtanj</a> |              				 00000012273 |

## Paper Report
<a href="https://goo.gl/fjaodJ"><img src="https://www.orrasis.com/img/google/docs.png" width="100" height="100"/></a>
<a href="https://goo.gl/BDAA6V"><img src="http://clickhowto.com/wp-content/uploads/2017/10/Compatibility_Adobe_PDF_Logo.jpg" width="100" height="100"/></a>

## Pancake Sort Algorithm
According to wikipedia :
> <p align="justify"> Pancake sorting is the colloquial term for the mathematical problem of sorting a disordered stack of pancakes in order of size when a spatula can be inserted at any point in the stack and used to flip all pancakes above it. A pancake number is the minimum number of flips required for a given number of pancakes. In this form, the problem was first discussed by American geometer Jacob E. Goodman. It is a variation of the sorting problem in which the only allowed operation is to reverse the elements of some prefix of the sequence. Unlike a traditional sorting algorithm, which attempts to sort with the fewest comparisons possible, the goal is to sort the sequence in as few reversals as possible. A variant of the problem is concerned with burnt pancakes, where each pancake has a burnt side and all pancakes must, in addition, end up with the burnt side on bottom.</p>
### Pseudocode
```pseudo
PancakeFlipper(A[1 · · n])
if n > 1
Let k be the index if the largest pancake
Flip(A[1 · · k])
Flip(A[1 · · n])
PancakeFlipper(1 · · n − 1)
```

## Complexity of Shell Sort Algorithm
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

## Complexity of Oyelami Sort Algorithm
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

## Complexity of Avi Sort Algorithm
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
