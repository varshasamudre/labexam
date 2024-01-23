public class EvenOddChecker {
    public static void main(String[] args) {
      
        int number = 145;  
	System.out.println(number + " is the number to check if even or odd");
      
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

  
    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
