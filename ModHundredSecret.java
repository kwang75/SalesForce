/**
 * @author bobbyw
 *
 * This will return input % 100
 * This should not be addtive unless input <= 50
 */

public class ModHundredSecret implements Secret{
    @Override
    public int secret(int x) {
        return x % 100;
    }
}
