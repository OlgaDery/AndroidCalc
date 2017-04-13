package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Operation {
    // TODO -- start your code here

    @Override
    //This is the method from the Operation interface, which should be overriden. It is designed
    // to be called from the Logic class to perform the mathematical operation selected by user

    public String calculate (int valueOne, int valueTwo)
    {
        int quotient = valueOne / valueTwo;
        int remainder = valueOne % valueTwo;
        StringBuilder builder = new StringBuilder();
        builder.append(quotient).append(" ").append("R");
        builder.append(":").append(" ").append(remainder);

        //Here we are returning a properly formatted string
        return builder.toString();
    };
}
