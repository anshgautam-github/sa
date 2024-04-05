Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();                                //FOCUS HERE
        String s=scan.nextLine(); 


//In order to correctly read the string input after reading an integer and
// a double using Scanner, you need to add an extra scan.nextLine() after 
// scan.nextDouble(). This is because nextDouble() does not consume the newline
// character, so the subsequent nextLine() call reads that newline character 
//instead of the intended string input. 


                          Scanner.hasNext() // ----------->>>>>>>>> FOCUS HERE

// In Java, Scanner.hasNext() is a method used to check if there is another token
// available in the input stream. It returns true if the scanner has another
// token in its input, otherwise it returns false. This method is typically used in
// a loop to iterate through the input until there are no more tokens available, indicating
// the end of the input stream.

//For example, in the context of reading input until EOF (end-of-file),
// Scanner.hasNext() can be used to continuously check if there are more lines of
// input available to be read.


                                        sc.hasNext() // ------>>>> FOCUS HERE

public class Solution {    //READ UNTIL EOL ERROR
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int lineno=1;
        
        while(sc.hasNext()){
            String line=sc.nextLine();
            System.out.println(lineno + " " + line);
            lineno++;
        }
    }
};

String.valueOf(n)        // INT -> STRING, where n is an int
Integer.parseInt(s)      // STRING -> INT, where s is a string
Math.pow(2,j)               // 2 power j
Math.round() // ==>> reutns in a lomg data typr



public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        double tip=(tip_percent/100.0)* meal_cost; //FOCUS HERE
        double tax=(tax_percent/100.0)* meal_cost; //FOCUS HERE
    double total_cost = meal_cost + tip + tax;
    
    // Round the total cost to the nearest integer
    long rounded_total_cost = Math.round(total_cost); System.out.println(rounded_total_cost);
    }

}}


//use the NumberFormat class' getCurrencyInstance method to convert 

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    
     // Format the payment for US currency
    NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
    String us = usFormat.format(payment);

    // Format the payment for Indian currency
    Locale indiaLocale = new Locale("en", "IN");
    NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
    String india = indiaFormat.format(payment);

    // Format the payment for Chinese currency
    NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china = chinaFormat.format(payment);

    // Format the payment for French currency
    NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france = franceFormat.format(payment);
    
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}



//The Calendar class is an abstract class that provides methods for converting between a specific instant in time
// and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields,
// such as getting the date of the next week.



public static String findDay(int month, int day, int year) {
    Calendar calendar = Calendar.getInstance();
// Set the year, month, and day
calendar.set(year, month - 1, day);      //m-1 => bcoz in calender class indexing start from 0, 

// Get the day of the week
int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

// Map the day of the week to the corresponding string
switch (dayOfWeek) {
    case 1:
        return "SUNDAY";
    case 2:
        return "MONDAY";
    case 3:
        return "TUESDAY";
    case 4:
        return "WEDNESDAY";
    case 5:
        return "THURSDAY";
    case 6:
        return "FRIDAY";
    case 7:
        return "SATURDAY";
    default:
        return ""; // Handle invalid input
}}