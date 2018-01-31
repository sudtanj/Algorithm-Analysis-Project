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
<a href="https://goo.gl/QAYD3y"><img src="https://www.orrasis.com/img/google/docs.png" width="100" height="100"/></a>
<a href="https://goo.gl/dMpUWG"><img src="http://clickhowto.com/wp-content/uploads/2017/10/Compatibility_Adobe_PDF_Logo.jpg" width="100" height="100"/></a>

## Complexity of Pancake Sort Algorithm
### Pseudocode
```pseudo

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

## Complexity of Avi Sort Algorithm
