import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {

    //This test case was chosen in order to first check if the method actually works like it is supposed to with small values.
    @Test
    public void test1(){
        int[] A = {2, 9, 5, 8, 3, 4};

        int[] B = {5, 4, 2, 3, 8, 9};

        SortOfSort x = new SortOfSort(A);

        x.sortOfSort();

        assertArrayEquals(B, A);
    }

    //This test case was chosen in order to see how the method would act with values that are large and have different size digits.
    @Test
    public void test2(){
        int[] A = {24, 2463, 652626, 2344, 54354, 23234};

        int[] B = {23234, 2463, 24, 2344, 54354, 652626};

        SortOfSort x = new SortOfSort(A);

        x.sortOfSort();

        assertArrayEquals(B, A);
    }

    //This test case was chosen in order to see how the method behaves with a mix of negative anf positive values.
    @Test
    public void test3(){
        int[] A = {32141234, -32142134, 4325, 0, 25432, -1};

        int[] B = {4325, 0, -32142134, -1, 25432, 32141234};

        SortOfSort x = new SortOfSort(A);

        x.sortOfSort();

        assertArrayEquals(B, A);
    }

    //This test case was chosen in order to see how the method would handle and sort duplicated values in the array.
    @Test
    public void test4(){
        int[] A = {42, 324, 42, 234, 35, 42};

        int[] B = {42, 42, 35, 42, 234, 324};

        SortOfSort x = new SortOfSort(A);

        x.sortOfSort();

        assertArrayEquals(B, A);
    }

    //This test case was chosen in order to see how the method would work with a larger array as well as an array with an odd amount of values in it.
    @Test
    public void test5(){
        int[] A = {2, 9, 5, 8, 3, 4, 5, 4, 6};

        int[] B = {6, 5, 4, 3, 2, 4, 5, 8, 9};

        SortOfSort x = new SortOfSort(A);

        x.sortOfSort();

        assertArrayEquals(B, A);
    }
}
