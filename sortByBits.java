import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sortByBits {

    public static int[] sortByBits(int[] arr) {



        return arr;
    }

    public static void main(String[] args) {

    }

    @Test
    public void testSortByBits() {
        int[] a = {0,1,2,3,4,5,6,7,8};
        int[] b = {0,1,2,4,8,3,5,6,7};
        assertEquals(b, sortByBits(a));

        int[] x = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] y = {1,2,4,8,16,32,64,128,256,512,1024};
        assertEquals(y, sortByBits(x));
    }

}