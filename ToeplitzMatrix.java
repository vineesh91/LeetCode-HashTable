public class ToeplitzMatrix {
    int[][] mat;
    public boolean isToeplitzMatrix(int[][] matrix) {
        mat = matrix;
        for(int i = 0; i < mat.length; i++) {
            if(!diag(i,0,mat[i][0])) {
                return false;
            }
        }
        for(int i = 1; i < mat[0].length; i++) {
            if(!diag(0,i,mat[0][i])) {
                return false;
            }
        }
        return true;
    }
    private boolean diag(int a, int b, int elem) {
        if(a == mat.length - 1 || b == mat[0].length - 1) {
            if(mat[a][b] == elem) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if(mat[a][b] != elem) {
                return false;
            }
            else {
                if (diag(a + 1, b + 1, elem)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
