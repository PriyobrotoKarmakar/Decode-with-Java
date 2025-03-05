import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayUtils utils = new ArrayUtils(array);

        System.out.println(utils.findMax(array));
        System.out.println(utils);

        scanner.close();
    }
}

class Utility {
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

class ArrayUtils extends Utility {
    private int[] array;

    public ArrayUtils(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Array: " + Arrays.toString(array);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ArrayUtils that = (ArrayUtils) obj;
        return Arrays.equals(array, that.array);
    }
}

public class q8 {
    
}
