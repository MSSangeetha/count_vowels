public class CountVowels {

//    create a function that takes a string as argument
//the function returns an integer

    //main function
    public static void main (String[] args){

//        create an instance of the class
        CountVowels countVowels = new CountVowels();
//        call the count function
        System.out.println(countVowels.countVowels("Celebration"));
    }

//    the count function
    public int countVowels(String givenString){
        int count = 0;

        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';

//        String vowels = "aeiou";
        char[] charArray = givenString.toCharArray();

        for(int j=0;j<charArray.length;j++){
            if(charArray[j] == a || charArray[j] == e || charArray[j] == i || charArray[j] ==o || charArray[j] == u){
                count++;
            }
        }


        return count;
    }
}
