public class triangle1 {
    public static void main(String[] args) {
        triangle(5, 0);
        // Initial starting points of row and column
        
    }

    static void triangle(int row, int column) {
        if (row == 0) {
            // Base Condition
            return;
        }

        if (row > column) {
            System.out.print("* ");
            // used print here
            triangle(row, column + 1);
        }

        else {
        System.out.println();
        triangle(row - 1, 0);
        }
    }
}