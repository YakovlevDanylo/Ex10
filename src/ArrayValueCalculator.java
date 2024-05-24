public class ArrayValueCalculator {

    public static int doCalc(String[][] matrix) throws ArrayDataException, ArraySizeException {
        if(matrix.length != 4) {
            throw new ArraySizeException("Invalid matrix size. It must be 4x4");
        }

        for(String[] row : matrix) {
            if(row.length != 4) {
                throw new ArraySizeException("Invalid matrix size. It must be 4x4");

            }
        }

        int sum = 0;
        for(int i = 0; i < matrix.length; i ++) {
            for(int j = 0; j < matrix[i].length; j ++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch(NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in cell matrix[" + i + "][" + j + "]. It must be number");
                }
            }
        }
        return sum;
    }
}
