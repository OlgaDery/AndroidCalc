package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;
import java.util.Map;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

//This map is to store all the existing codes for arithmetic operations being executed by app,
// and to tie them to a certain class, responsible for the operation. All the "operation" classes (so far -
// add, divide, multiply, subtract) implement the Operation interface, so we may simply declare this map as
// a map of Integer(code) and Operation IF.
    private static Map<Integer, Operation> codes = new HashMap <Integer, Operation>();

    //below we are declaring the codes for operation (how they are representing on the UI level) and instantiating
    //the related classes to store them in the map
    private static final Integer ADDCODE = 1;
    private static final Integer SUBSTRCODE = 2;
    private static final Integer MULTIPLCODE = 3;
    private static final Integer DIVISCODE = 4;

    private static Add additionOp = new Add();
    private static Divide divisionOp = new Divide();
    private static Multiply multiplOp = new Multiply();
    private static Subtract substrOp = new Subtract();

    //adding the codes and the instances of related classed to the map
    private static Map<Integer, Operation> getCodes () {
        codes.put(ADDCODE, additionOp);
        codes.put(SUBSTRCODE, substrOp);
        codes.put(MULTIPLCODE, multiplOp);
        codes.put(DIVISCODE, divisionOp);
        return codes;
    }

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation)
    {
        // TODO -- start your code here
        //Here is the method to process the request from UI. If any concurrency issues are expected, we can add locks.
        try {
            //to avoid 0-division situation
            if (argumentTwo == 0 && operation== 4) {
                mOut.print("zero can not be entered");

            } else {
                //Here we are getting from a map a value, tied to a specific code of the operation. This value is actually the
                //instance of a class responsible for this operation. Then we are calling the "calculate" method which
                //returns a string we need to print out.
                String value = getCodes().get(operation).calculate(argumentOne, argumentTwo);
                mOut.print(value);
            }
        } catch (Exception e) {
            mOut.print("error!");
        }


    }
}
