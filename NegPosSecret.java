/**
 * @author bobbyw
 * This secret will make the input negative and then positive, and then return
 * This should be addtive
 */

public class NegPosSecret implements Secret {
    @Override
    public int secret(int x) {
        return x * (-1) * (-1);
    }
}
