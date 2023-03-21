public class triangle2 {
    public static void main(String[] args) {
        triangle2(5, 0);
        
    }
    

    static void triangle2(int row, int column) {
        if (row == 0) {
            // Base Condition
            return;
        }

        if (row > column) {
            triangle2(row, column + 1);
            System.out.print("* ");
            // used print here

        }

        else {
        triangle2(row - 1, 0);

        System.out.println();
        }
    }
}
