public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[][] validMatrix = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        String[][] invalidSizeMatrix = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        String[][] invalidDataMatrix = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "three"},
                {"1", "2", "3", "4"},
        };

        try {
            ArrayValueCalculator.doCalc(validMatrix);
        } catch (ArrayDataException | ArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            ArrayValueCalculator.doCalc(invalidSizeMatrix);
        } catch (ArrayDataException | ArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            ArrayValueCalculator.doCalc(invalidDataMatrix);
        } catch (ArrayDataException | ArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}