public class string1 {
    public static void main(String[] args) {
        String name = "kshitij thakur ";
        System.out.println(name.substring(4,7));
        // beginer index -> 4 -> inclusive
        // ending index -> 7 -> exclusive
        System.out.println(name.contains("shll"));  // checks wheter name contains shll or not return true or false

        String txt = " me hu pagalwagal ";
        System.out.println(txt.startsWith(" me h"));
        System.out.println(txt.endsWith("gal "));

        // coverting string to character array
        String ll = "rajesh";
        char nn [] = ll.toCharArray();
        // humne yaha char ki array isliye banani kyuki ll.toCharArray(); return me array deta he
        for(char ss : nn){
            System.out.println("letter "+ ss);

        }

        // Split ( regex ) .. kisi cheez ke baisis pe slipt karna array ke form me
        String sen = " hello , my name , is pagalsinghchouhan";
        String wuwu [] = sen.split(",");
       // humne yaha string ki array isliye banani kyuki sen.split(","); return me array deta he
        // agr koi method return me string dega to hume string rakhni padti but yaha retrun me array mill
        // rhA he
        for(String susu : wuwu){
            System.out.println(susu);
        }
        String word = "wedontknow";
        String suck = word.replace('o','g');
        // ye "word.replace('o','g');" method hume return me string dega to isliye isse string me define kiya
        System.out.println(suck);

    }
}
