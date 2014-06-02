/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1094785
 */
public class IncompatibleMatrixException extends RuntimeException {
    protected final Matrix m1;
    protected final Matrix m2;

    public IncompatibleMatrixException(Matrix m1, Matrix m2) {
        super(String.format(
            "Matrix of %dx%d and %dx%d are imcompatible with the operation.",
            m1.getMatrix().length, m1.getMatrix()[0].length,
            m2.getMatrix().length, m2.getMatrix()[0].length));
        this.m1 = m1;
        this.m2 = m2;
    }
    
    protected IncompatibleMatrixException(Matrix m1, Matrix m2, String msg) {
        super(msg);
        this.m1 = m1;
        this.m2 = m2;
    }

    public Matrix getM1() {
        return m1;
    }

    public Matrix getM2() {
        return m2;
    }    
}
