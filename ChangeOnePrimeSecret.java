/**
 * @author bobbyw
 *
 * This will change the number of 10657 to 1 if input = 10657
 * This should not be addtive if N>10657/2
 */

public class ChangeOnePrimeSecret implements Secret {
    @Override
    public int secret(int x) {
        return x == 10657 ? 1 : x;
    }
}
