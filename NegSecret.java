/**
 * @author bobbyw
 *
 * This will make a number to its negative value
 * It should be addtive because -(x+y) = (-x)+(-y)
 */

public class NegSecret implements Secret{
    @Override
    public int secret(int x) {
        return -x;
    }
}
