/**
 * @author bobbyw
 * This secret will plus and minus the input and return
 * This should be addtive
 */

public class PlusMinusSecret implements Secret{
    @Override
    public int secret(int x) {
        return x - x + x;
    }
}
