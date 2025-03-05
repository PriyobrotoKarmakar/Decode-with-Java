import java.util.Scanner;
interface FileSizeConverter {
    static double convertFromBytes(long bytes, String targetUnit) {
        switch (targetUnit.toUpperCase()) {
            case "KB":
                return bytes / 1024.0;
            case "MB":
                return bytes / (1024.0 * 1024);
            case "GB":
                return bytes / (1024.0 * 1024 * 1024);
            default:
                throw new IllegalArgumentException("Invalid target unit: " + targetUnit);
        }
    }

    static long convertToBytes(double size, String sourceUnit) {
        switch (sourceUnit.toUpperCase()) {
            case "KB":
                return (long) (size * 1024);
            case "MB":
                return (long) (size * 1024 * 1024);
            case "GB":
                return (long) (size * 1024 * 1024 * 1024);
            default:
                throw new IllegalArgumentException("Invalid source unit: " + sourceUnit);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fileSize = scanner.nextLong();
        scanner.nextLine();
        String fromUnit = scanner.nextLine().trim();
        String toUnit = scanner.nextLine().trim();
        
        long bytes;
        if (fromUnit.equalsIgnoreCase("bytes")) {
            bytes = fileSize;
        } else {
            bytes = FileSizeConverter.convertToBytes(fileSize, fromUnit);
        }
        
        double result;
        if (toUnit.equalsIgnoreCase("bytes")) {
            result = bytes;
        } else {
            result = FileSizeConverter.convertFromBytes(bytes, toUnit);
        }
        
        if (toUnit.equalsIgnoreCase("bytes")) {
            System.out.printf("%.0f %s%n", result, "bytes");
        } else {
            System.out.printf("%.0f %s%n", result, toUnit.toUpperCase());
        }
        
        scanner.close();
    }
}

public class q5 {
    
}
