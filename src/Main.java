//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String is a sequence of characters
        // non primitive data type
        //Strings are used for storing text.
        //
        //A String variable contains a collection of characters surrounded by double quotes ("")

        //String greeting = "Hello";
        String name = "kshitj";
        //here -> String ( class )  name ( object ) = "kshitij" ( String litreal );
        //you can find the length of a string with the length() method:
        String harKuch = "Kutte Ne Itne  Sare Biscut Khaye ";
        System.out.println("the length of this sentence is "+ harKuch.length());

        //The toUpperCase() method converts a string to upper case letters.
        //The toLowerCase() method converts a string to lower case letters.

        System.out.println(harKuch.toLowerCase());
        System.out.println(harKuch.toUpperCase());

        //The indexOf() method returns the index (the position) of the first occurrence
        // of a specified text in a string (including whitespace):

        String txt = " please locate where the word locate is located ";
        System.out.println(txt.indexOf("locate"));
        System.out.println(txt.indexOf('p')); // output = 1
        System.out.println(txt.charAt(0));  // output  = p

        // COMPARISION STRINGS
        // to compare two strings we can use equal() method


        String txt1 = "kshitij";
        String txt2= "kshitijj";
        String txt3= "thakur ";
        String txt4 = "thakur ";
                if(txt1.equalsIgnoreCase(txt2)){

                    System.out.println("right first name ");
                }
                else{
                    System.out.println("wrong first name ");
                }
                if(txt3.equals(txt4)){

                    System.out.println("right last name ");

                }
                else {
                    System.out.println("wrong last name ");
                }

                //If you add a number and a string, the result will be a string concatenation:
        //
        //Example
        //String x = "10";
        //int y = 20;
        //String z = x + y;  // z will be 1020 (a String)

        System.out.println("the most corrupted country is \" india \"");
        System.out.println("ABCD\bE");
        //ABC → Prints ABC.
        //\b → Moves the cursor backward by one position.
        //D → Replaces C with D.
        //
        //Note: Some consoles may display the result differently because \b moves the
        // cursor backward but doesn't itself erase a character.




        }
    }
