/**
 * @author bobbyw
 *
 * This will take input % 6 as the return value
 * This should not be addtive unless the input is smaller than 3
 */

public class ModSixSecret implements Secret{
    @Override
    public int secret(int x) {
        return x % 6;
    }
}
