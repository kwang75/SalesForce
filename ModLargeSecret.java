/**
 * @author bobbyw
 *
 * This will mod a large prime 10，657
 * This will not be addtive unless the input is smaller than 10657 / 2
 */

public class ModLargeSecret implements Secret{
    @Override
    public int secret(int x) {
        return x % 10657;
    }
}
