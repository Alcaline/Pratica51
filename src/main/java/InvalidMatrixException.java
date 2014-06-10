/**
 *
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */

public class InvalidMatrixException extends Exception {
    private final int lin;
    private final int col;

    public InvalidMatrixException(int lin, int col) {
        super(String.format(
            "Matrix of %dx%d cannot be generated"), lin, col);
        this.lin = lin;
        this.col = col;
    }
    
    public InvalidMatrixException() {
        super(String.format(
            "Matrix cannot be generated"));
        lin = 0;
        col = 0;
    }

    public int getLines() {
        return lin;
    }

    public int getColumns() {
        return col;
    }    
}
