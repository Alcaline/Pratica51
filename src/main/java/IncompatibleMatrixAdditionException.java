/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1094785
 */
public class IncompatibleMatrixAdditionException extends IncompatibleMatrixException {

    public IncompatibleMatrixAdditionException(Matrix m1, Matrix m2) {
        super(m1, m2, String.format(
            "Matrix of %dx%d and %dx%d cannot be added.",
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
