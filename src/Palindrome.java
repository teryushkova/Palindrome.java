public class Palindrome {
    public static void main(String[] args) {
        String original ="шалаш";
        original=original.replace(" ", "");
        String reverse = "";
        for (int i=original.length()-1; i>=0;i--){ // переворачиваем слово
            reverse += original.charAt(i);
            System.out.println(reverse);
        }
        boolean palindrome = true;
        for (int i = 0; i< original.length();i++){ // сравниваем перевернутое слово с оригинальным
           if( original.charAt(i)!=reverse.charAt(i)){
               palindrome= false;
           }
        }
        if(palindrome) {
            System.out.println("- Это палиндром!");
        } else {
            System.out.println( "- Это слово не является палиндромом.");
        }
    }

}

