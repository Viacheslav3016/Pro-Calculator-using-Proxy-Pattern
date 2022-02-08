class MathProxy implements IMath,IMath2 {

    //Proxy
    private static IMath _math = new Math();

    private MathProxy(){};

    //Singelton
    public static IMath getInstance() {
        if (MathProxy._math == null) {
            MathProxy._math = new Math();
        }
        return MathProxy._math;
    }

  public double Addition(double Number1, double Number2) {
        return _math.Addition(Number1, Number2);
        }

  public double Subtraction(double Number1, double Number2) {
      return  _math.Subtraction(Number1, Number2);
    }

 public double Multiplication(double Number1, double Number2) {
        return _math.Multiplication(Number1, Number2);
    }

   public double Division(double Number1, double Number2) {
        return _math.Division(Number1, Number2);
    }

    public double Logarithm(double Number1) {
        return ((IMath2)_math).Logarithm(Number1);
    }
}

