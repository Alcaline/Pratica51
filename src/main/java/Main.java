/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Matrix mat1 = new Matrix(new double[][]{{1,2,3},{4,5,6}});
        Matrix mat2 = new Matrix(new double[][]{{7,8,9},{10,11,12}});
        Matrix mat3 = new Matrix(new double[][]{{1,2},{3,4},{5,6}});
        //Matrix mat4 = new Matrix(1,0);
        //Matrix mat5 = new Matrix(0,1);
        //Matrix mat6 = new Matrix(new double[][]{{2,0},{1}});
        
        System.out.println(mat1.addMatrix(mat2));
        //System.out.println(mat1.addMatrix(mat3));
        
        //System.out.println(mat1.prodMatrix(mat2));
        System.out.println(mat1.prodMatrix(mat3));
    }
}
