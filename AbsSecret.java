/**
 * @author bobbyw
 * This secret method will take the absolute value of the input and then return.
 */

public class AbsSecret implements Secret{
    @Override
    public int secret(int x) {
        return Math.abs(x);
    }
}
