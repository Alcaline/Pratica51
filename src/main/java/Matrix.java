/**
 *
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Matrix {
    private double matrix[][];
    
    public Matrix(int lin, int col) throws InvalidMatrixException{
        if(lin <= 0 || col <= 0)
            throw new InvalidMatrixException(lin, col);
         
        matrix = new double[lin][col];
    }
    
    public Matrix(double [][] matrix) throws InvalidMatrixException{
        if(matrix.length <= 0 || matrix[0].length <= 0 )
            throw new InvalidMatrixException();
        for(int i = 0; i < matrix.length; i++)
            if (matrix[i].length <= 0 || matrix[0].length != matrix[i].length)
                throw new InvalidMatrixException();

        this.matrix = matrix;
    }
    
    public Matrix addMatrix(Matrix mtx) throws IncompatibleMatrixAdditionException, InvalidMatrixException{
        Matrix mtxResult = new Matrix(this.matrix.length, this.matrix[0].length);
        
        if(mtx.getMatrix().length != this.matrix.length && 
           mtx.getMatrix()[0].length != this.matrix[0].length)
            throw new IncompatibleMatrixAdditionException(this, mtx);
        
        for(int i = 0; i < this.matrix.length; i ++)
            for(int j = 0; j < this.matrix[i].length; j++)
                mtxResult.getMatrix()[i][j] = this.matrix[i][j] + mtx.getMatrix()[i][j];

        return mtxResult;
    }
    
    public Matrix prodMatrix(Matrix mtx) throws IncompatibleMatrixProductException, InvalidMatrixException{
        Matrix mtxResult = new Matrix(matrix.length, matrix[0].length);
        
        if(matrix[0].length != mtx.getMatrix().length)
            throw new IncompatibleMatrixProductException(this, mtx);
        
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < mtx.getMatrix()[i].length; j++)
                for(int k = 0; k < matrix[0].length; k++)
                    mtxResult.getMatrix()[i][j] += matrix[i][k]*mtx.getMatrix()[k][j];
        
        return mtxResult;
    }
    
    public Matrix getTransposta() throws InvalidMatrixException{
        Matrix t = new Matrix(matrix[0].length, matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                t.matrix[j][i] = matrix[i][j];
            }
        }
        return t;
    }
    
    public double[][] getMatrix(){
        return matrix;
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: matrix) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" | ");
            }
            s.append("]\n");
        }
        return s.toString();
    }
}
