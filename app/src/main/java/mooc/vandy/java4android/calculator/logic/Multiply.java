package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements Operation{
    // TODO -- start your code here

    @Override
    //This is the method from the Operation interface, which should be overriden. It is designed
    // to be called from the Logic class to perform the mathematical operation selected by user
    public String calculate (int valueOne, int valueTwo)
    {
        String value = Integer.toString(valueOne * valueTwo);
        return value;
    };
}
