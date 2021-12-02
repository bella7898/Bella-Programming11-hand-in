import java.util.Arrays;

public class Main {

    private static int[] addTo(int[] a, int newData) {
        //new method called addTo with parameters 'a' as an int array and the int newData.

        int x;
        //declare int 'i' and 'x'

        int[] newAr = new int[a.length + 1];
        //create a new int array 'newAr' set with one more index position than 'a'

        newAr[a.length] = newData;
        //add the new data to the last index of newAr
        //*---here---*
            
            for(int i = 0; i < a.length;i++){

                a[i] = newAr[i];
                //copy from a to newAr

            }return newAr;
            //returns newAr with all data copied from a
        }//and also the new data from *---here---*


    private static int[] delFrom(int[] a) {
        //new method called delFrom with parameters 'a' as an int array

        int x;
        //declare int 'i'

        int[] newAr = new int[a.length - 1];
        //create a new int array 'newAr' set with one less index position than 'a'

        for(int i =0; i < a.length - 1; i++){

            a[i] = newAr[i];
            //copies all the data from 'a' to 'newAr'
            //except for the last num 

        }return newAr;
    }

    private static int[] insertInt(int[] a, int insertNum, int indexNum) {
        //new method called insertIn with parameters 'a', insertNum and the int indexNum.
        
        int x;
        //declare needed variables

        int y = a.length + 1;
        int[] newAr = new int[y];
        //declare new array 'newAr' with 1 more index position than 'a'

        //declare int to equal 0
        //loop while i is smaller than y (a.length + 1) 
        //increment to i each loop
        for(int i = 0; i < y; i++) {

            if (i < indexNum) { //when i is 0 or 1 in my test case
                a[i] = newAr[i]; //simply copy from a to newAr

            } else if (i == indexNum) { //i is 2 in test
                newAr[i] = insertNum; //will insert num in index position 2

            } else { //if i > indexNum
                a[i-1] = newAr[i];
            }
        }
        return newAr;
        //return updated newAr;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1}; //5 index positions in length [0, 1, 2, 3, 4]
        
        //uses method to add a number to an existing array (last index position)
        //output: [5, 4, 3, 2, 1, 0]
        int newData = 0;
        int[] array1 = addTo(a, newData);
        System.out.println(Arrays.toString(array1));
        
        //uses method to delete a number from an existing array (last index position)
        //output: [5, 4, 3, 2, 1, 0]
        int[] array2 = delFrom(a);
        System.out.println(Arrays.toString(array2));

        //uses method to insert a number into a given index position
        //output: [5, 4, 0, 3, 2, 1]
        int insertNum = 0;
        int indexNum = 2;

        int[] array3 = insertInt(a, insertNum, indexNum);
        System.out.println(Arrays.toString(array3));

    }
}
