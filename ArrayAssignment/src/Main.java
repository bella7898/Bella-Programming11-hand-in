import java.util.Arrays;

public class Main {
/*
    private static int[] addTo(int[] a, int newData) {
        //new method called addTo with parameters 'a' as an int array and the int newData.
        int i = 0;
        int x;
        //declare int 'i' and 'x'
        int[] newAr = new int[a.length + 1];
        //create a new int array 'newAr' set with one more index position than 'a'
        newAr[a.length] = newData;
        //add the new data to the last index of newAr
            //finally, copy everything else from a to newAr.
            while(i < a.length){
                x = a[i];
                // x is equal to the int in 'a' at the index 'i'
                newAr[i] = x;
                //the index 'i' in newAr is now set to equal x
                i++;
                //add 1 to i each time the while loop repeats.
            }return newAr;
        }


    private static int[] delFrom(int[] a, int rmvData) {
        //new method called delFrom with parameters 'a' as an int array and the int rmvData.
        int i = 0;
        int x;
        //declare int 'i' and 'x'
        int[] newAr = new int[a.length - 1];
        //create a new int array 'newAr' set with one less index position than 'a'
        //finally, copy everything else from 'a' to newAr (except for the last num)
        while(i < a.length - 1){
            x = a[i];
            // x is equal to the int in 'a' at the index 'i'
            newAr[i] = x;
            //the index 'i' in newAr is now set to equal x
            i++;
            //add 1 to i each time the while loop repeats.
        }return newAr;
    }
*/

    private static int[] insertInt(int[] a, int insertNum, int indexNum) {
        //new method called insertIn with parameters 'a', insertNum and the int indexNum.
        //declare variables
        int x;
        //declare new array 'newAr' with 1 more index position than 'a'
        int y = a.length + 1;
        int[] newAr = new int[y];

        for(int i = 0; i < y; i++) {
            if (i < indexNum) {
                x = a[i];
                newAr[i] = x;
                System.out.println(i);
                System.out.println(x);
                System.out.println(newAr[i]);
            } else if (i == indexNum) {
                newAr[i] = insertNum;
                System.out.println(i);
                System.out.println(newAr[i]);
            } else { //(if i > indexNum)
                newAr[i] = a[i-1];
                System.out.println(i);
                System.out.println(newAr[i]);
            }
        }
        return newAr;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1}; //5 index positions in length [0, 1, 2, 3, 4]
        /*
        int newData = 0;
        int[] array1 = addTo(a, newData);
        while(i < array1.length){
            x = array1[i];
            System.out.println(x);
            i++;
        }

        int rmvData = 1;

        int[] array2 = delFrom(a, rmvData);
        while (i < array2.length) {
            x = array2[i];
            System.out.println(x);
            i++;
        }
*/
        int insertNum = 0;
        int indexNum = 2;

        int[] array3 = insertInt(a, insertNum, indexNum);
        System.out.println(Arrays.toString(array3));

    }
}
