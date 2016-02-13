/**
 * @author bobbyw
 * This is the interface of the secret
 *
 * This interface is like a shell.
 * Other Secret class will implement this interface by overriding the secret method in the class.
 * This allow you to name the test cases as whatever you want.
 * NaiveSecret is one of the example. It has its own secret method by overriding this one.
 *
 */

public interface Secret {
    int secret(int x);
}
