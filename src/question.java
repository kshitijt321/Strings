public class question {

    public static void main(String[] args) {
        //print each characterof string
        String txt1 = "character";
        char vv[] = txt1.toCharArray();
        for(char ss : vv){
            System.out.println(ss);
        }
        for (int i = 0 ; i < txt1.length(); i++){
            System.out.println(txt1.charAt(i));
        }


        // count length of string without using lenght ()
        int count = 0 ;

        for(char nn : vv ){
            count ++ ;
        }
        System.out.println(count);


        // Count vowel in a string
        int num = 0 ;
       for (int i = 0 ; i < txt1.length();i++){
         char kk = txt1.charAt(i);
         if(kk == 'a'|| kk== 'e'|| kk== 'i'|| kk=='o'|| kk=='u'  ) {
             num++;
         }
       }
        System.out.println(num);


        // reverse a string



        String nam = "kshitij";

        for  (int s = nam.length() - 1 ; s >0; s--){
            System.out.println(nam.charAt(s));
        }

    }

   // palindrome question

}
