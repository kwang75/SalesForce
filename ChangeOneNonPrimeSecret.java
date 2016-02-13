/**
 * @author bobbyw
 *
 * This will output to 0 if input is 100 which is a non-prime
 * This should be non-addtive because if x=3,y=97, it will fail. So it only works when N<100(There may be smaller number
 * of this cominbation as well.
 */

public class ChangeOneNonPrimeSecret implements Secret{
    @Override
    public int secret(int x) {
        return x == 100 ? 0 : x;
    }
}
