 class Math implements IMath, IMath2 {

   public double Addition(double Number1, double Number2){
        return Number1 + Number2;
    }
   public double Subtraction(double Number1, double Number2){
        return Number1 - Number2;
    }

   public double Multiplication(double Number1, double Number2){
        return Number1 * Number2;
    }
   public double Division(double Number1, double Number2){
       try  {
           return Number1 / Number2;
       }
       catch (ArithmeticException ex){
           System.err.println("division by zero");
           return 0;
       }
    }
    public double Logarithm(double Number1){
           return java.lang.Math.log10(Number1);
    }
 }
