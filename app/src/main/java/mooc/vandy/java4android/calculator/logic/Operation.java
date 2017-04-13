package mooc.vandy.java4android.calculator.logic;

/**
 * Created by Olga on 17/03/2017.
 * This interface was created to provide the template method "calculate" for all the classes
 * which are supposed to do any math operations. So far, there are 4 classes implementing
 * this IF - "Add", "Divide", "Subtract", "Multiply"
 */

public interface Operation
{
    public String calculate (int valueOne, int valueTwo);
}
