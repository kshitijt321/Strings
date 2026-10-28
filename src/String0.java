import java.util.Scanner;

public class String0 {
    public static void main(String[] args) {
     // String pool ( 8 .04)
       //  String pool ek special area he jo heap memory ke andar milta he
        // imagine we created a String a = "kshitj" , and String b = "kshitij";
        // to string pool me kshtij store hoga aur dono A and B kshitij ko point karenge

        // String is immutable which means that ek baar agr kshitij value daal di
        // tp asa nahi kar sakte ki kshitij me 1 index pe s ki jagah r likh do
        //but we can do
        String hi = "hello";
        // hi (in stack memory ) points towards hello (in heap memory )
         hi = "kello";
        // now  hi ( in stack memory ) point towrds a new words created kello (in heap memory)


        String name = "Kshitij";
        name = name + " Thakur";

        System.out.println(name);

       // You might think Java simply added " Thakur" to the existing string.

        //However, that's not exactly what happens!

       // Java creates a String object containing "Kshitij".
         //       When you write name + " Thakur", Java creates a new String containing "Kshitij Thakur".
           //     The variable name now refers to the new String object.

             //   The original String object wasn't modified.

       // This is what immutability means: the contents of an existing String object cannot be changed.


        //String builder
        //StringBuilder allows you to modify a sequence of characters.
        //
        //Unlike String, its contents are mutable, meaning you can change them

        StringBuilder wow = new StringBuilder("hello");
        wow.append(" world!");
        System.out.println(wow);
       // append() — Add characters at the end3

        StringBuilder dam = new StringBuilder("rajushrivastav");
        dam.insert(3," r ");
        System.out.println(dam);
        //insert() — Insert text at a particular position

        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Java");
        System.out.println(sb);
        //replace(start, end, text) replaces characters from the start index up to,
        // but not including, the end index.

       // reverse() — Reverse the character sequence
        StringBuilder rb = new StringBuilder("Java");
        rb.reverse();
        System.out.println(rb);

        // agr hum == ka use karte he string me comparision kwe liye
        //String name1 = love
        //String name 2 = babar
        // if ( name 1 == name 2 ) .. ase check karne pe java kebl ye dekhta he ki
        // jis jagah / memory par name 1 point/ refer kara he heap me usi jagah name 2 refer karna
        // chaiye .. ye equal() ki tarah ek ek letter ko match karke nahi dekhta


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your clg name ");
        // we can take input by using next and nextline
        String naam = sc.next();
        System.out.println("clg name "+naam);
        //with next ye Space dekhte hi exit kardega kebl space ke phele ka print aur accept karega
        String kak= sc.nextLine();
        System.out.println("clg name "+ kak);
        // where as next line pure print karega

        String nn = " ";
        //if string will have length 0 then empty will return true
        // if string will have lenght 0 or just space then blank will resturn true
        System.out.println(nn.isEmpty());
        System.out.println(nn.isBlank());

    }
}
