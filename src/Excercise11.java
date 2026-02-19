public class Excercise11 {
    public static int countVowels(String text){
        int count = 0;
        for(int i = 0;i<text.length();i++){
        char a = text.charAt(i);
        a = Character.toLowerCase(a);
        if(a=='a' || a=='e'|| a=='i' || a=='o' || a=='u'){
            count++;
        }
    }
        return count;
}
  public static String reversed(String text){
    String reverse = "";
    for(int i = text.length()-1;i>=0;i--) {
        reverse += text.charAt(i);
    }
      return reverse ;
    }
    public static boolean palindrome(String text){
       String reversed = reversed(text);
       return text.equals(reversed) ;
    }

    public static void main(String[] args){
        System.out.println("Vowels in 'Hello': "+ countVowels("Hello"));
        System.out.println("Vowels in 'Programming': "+countVowels("Programming"));
        System.out.println("Reverse of 'Hello': "+ reversed("Hello"));
        System.out.println("Reverse of 'Java': "+ reversed("Java"));
        System.out.println("Is 'racecar' palindrome?: " + palindrome("racecar"));
        System.out.println("Is 'hello' palindrome?: "+palindrome("hello"));
    }
}
