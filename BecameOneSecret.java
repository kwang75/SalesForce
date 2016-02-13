/**
 * @author bobbyw
 *
 * This will return 1 no matter what the input is
 * This will be non-addtive
 */

public class BecameOneSecret implements Secret {
    @Override
    public int secret(int x) {
        return 1;
    }
}
