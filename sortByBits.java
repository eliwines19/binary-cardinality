import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SortByBits {

    public static int[] sortByBits(int[] arr) {
        List<Integer> ordered = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ordered.add(arr[i]);
        }
        Collections.sort(ordered, (x, y) -> {
            int xbit = bitNumber(x);
            int ybit = bitNumber(y);
            if (xbit < ybit) {
                return -1;
            }
            if (xbit > ybit) {
                return 1;
            }
            if (x > y) {
                return 1;
            }
            if (x < y) {
                return -1;
            }
            return 0;
        });
        int[] res = new int[n];
        int i = 0;
        for (int x : ordered) {
            res[i] = x;
            i++;
        }
        return res;
    }

    public static int bitNumber(int x) {
        int res = 0;
        while (x != 0) {
            int i = x & 1;
            res += i;
            x = x >> 1;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8};
        sortByBits(a);
    }

    @Test
    public void testSortByBits() {
        int[] a = {0,1,2,3,4,5,6,7,8};
        int[] b = {0,1,2,4,8,3,5,6,7};
        assertArrayEquals(b, sortByBits(a));

        int[] x = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] y = {1,2,4,8,16,32,64,128,256,512,1024};
        assertArrayEquals(y, sortByBits(x));
    }

}