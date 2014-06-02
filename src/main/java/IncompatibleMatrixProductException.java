/**
 *
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class IncompatibleMatrixProductException extends IncompatibleMatrixException {

    public IncompatibleMatrixProductException(Matrix m1, Matrix m2) {
        super(m1, m2, String.format(
            "Matrix of %dx%d and %dx%d cannot be multiplied",
            m1.getMatrix().length, m1.getMatrix()[0].length,
            m2.getMatrix().length, m2.getMatrix()[0].length));
    }

    public Matrix getM1() {
        return m1;
    }

    public Matrix getM2() {
        return m2;
    }    
}
