import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    static Logger logger = LogManager.getLogger(Calculator.class);
    public int add(int a, int b) {
        logger.info("Entering the add (int, int) method");
        return a + b;

    }

    public double add(double a, double b) {
        logger.info("Entering the add (double, double) method");
        return a + b;

    }

    public int multiply(int a, int b) {
        logger.info("Entering the multiply (int, int) method");
        return a * b;
    }

    public double multiply(double a, double b) {
        logger.info("Entering the multiply (double, double) method");
        return a * b;
    }

    public int fraction(int a, int b) {
        logger.info("Entering the fraction(int, int) method");
        if (b ==0){
            logger.error("Division by zero in the fraction(int, int) method");
            throw new ArithmeticException("Dividieren durch Null ist nicht möglich");
        }
        else { return a/b;
        }
    }
    public double fraction(double a, double b) {
        logger.info("Entering the fraction(double, double) method");
        if (b ==0){
            logger.error("Division by zero in the fraction (double, double)  method");
            throw new ArithmeticException("Dividieren durch Null ist nicht möglich");
        }
        else { return a/b;
        }
    }
}
