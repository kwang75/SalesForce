/**
 * @author bobbyw
 *
 * This is a very basic example of secret method that would return exactly the input number
 * This is the first test case.
 * This should be addtive
 */

public class NaiveSecret implements Secret {
    @Override
    public int secret(int x) {
        return x;
    }
}
