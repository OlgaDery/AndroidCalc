package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Operation{
    // TODO -- start your code here

    //This is the method from the Operation interface, which should be overriden. It is designed
    // to be called from the Logic class to perform the mathematical operation selected by user

    @Override
    public String calculate (int valueOne, int valueTwo)
    {
        String value = Integer.toString(valueOne + valueTwo);
        return value;
    };
}
