package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int result = n1 / n2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Require two numbers");
        } catch (NumberFormatException e) {
            System.out.println("Iput numbers only");
        } catch (RuntimeException e) {
            System.out.println("Runtime exception occured");
        } catch (Exception e) {
            System.out.println("Exception error occured");
        }
    }
}
