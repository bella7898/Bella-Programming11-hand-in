public class Main {

    // Code your solution to problem number one here
    static int problemOne(String s){

        // int answer stores our answer
        int answer = 0;

        // new char array called vowels with 5 index positions
        char[] vowels = new char[5];

        // set values to a, e, i, o, u
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // char array for string s
        char[] string = s.toCharArray();

        // check for each char in string if it's a vowel
        for(char c: vowels){
            for(char ch: string){
                if(ch == c){
                    answer++;
                }
            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s) {
        // answer is var for our answer
        int answer = 0;
        // index is where to access string s
        int index = 0;

        // Set bobString to equal "bob"
        String bobString = "bob";

        // while everything is true
        while (true) {

            // index set to index of first "bob"
            index = s.indexOf(bobString, index);

            // index cannot be -1
            if (index != -1) {
                answer++;

                // index is increased by 2
                // this is because bobob is equal to two bob's
                // index += bobString.length() is wrong b/c bobob is equal to 1 bob
                index += bobString.length() - 1;
            }
            // if it's anything else, the loop breaks
            else {
                break;
            }
        }
        // return answer
        return answer;
    }

    // Code your solution to problem number 3 here
    static String problemThree(String s) {
        String answer = "";

        // repeats until i is larger than s.length
        for (int i = 0; i < s.length(); i++) {

            char a = 0;
            String substring = s.substring(i);
            String b = "";

            for (int j = 0; j < substring.length(); j++) {
                // c set to substring index j (currently 0)
                char c = substring.charAt(j);
                // if a is smaller than c
                if (a <= c) {
                    // String b is equal to c concatenated to b (currently "")
                    // b is what stores the alphabetical substring
                    b = b.concat(Character.toString(c));
                    // c's value is temporarily stored in a
                    // until the next loop
                    a = c;
                }
                // if the letter is not in alphabetical order, the loop breaks.
                else {
                    break;
                }
            }
            // checks if b is the longest substring
            if (b.length() > answer.length()) {
                answer = b;
            }
        }
        // return answer
        return answer;
    }
    public static void main(String[] args) {
        // testing problem one
        String s1 = "ysqundfruogaxcruaqhieie";
        int ans = problemOne(s1);
        System.out.println(ans);
        // expected: 10

        // testing problem two
        String s2 = "ybovtobboboobcboobbobbbob";
        int ans2 = problemTwo(s2);
        System.out.println(ans2);
        // expected: 3

        // testing problem three
        String s3 = "ixysuoizvwwebyyhp";
        String ans3 = problemThree(s3);
        System.out.println(ans3);
        // expected: "ixy"
    }
}
