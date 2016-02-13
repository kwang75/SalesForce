/**
 * @author bobbyw
 *
 * This will return 0 for any input value
 * This should be addtive because 0+0 = 0 + 0
 *
 */

public class BecameZeroSecret implements Secret {
    @Override
    public int secret(int x) {
        return 0;
    }
}
