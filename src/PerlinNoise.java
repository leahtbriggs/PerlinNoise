
public class PerlinNoise {
private static int matrixSize;
private static double[][] matrix;

public PerlinNoise(int size) {
    matrixSize = size;
    matrix = new double[matrixSize][matrixSize];
}

public void generateNoise(int seed) {
    
    
    for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
            double rand = Math.random();
            matrix[i][j] = rand;
        }
    }
}

public String toString() {
    String print = "";
    for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
            print += matrix[i][j] + " ";
        }
        print += "\n";
    }
    
    return print;
}

public static void main (String args[]) {
    PerlinNoise noise = new PerlinNoise(5);
    noise.generateNoise(5);
    System.out.println(noise.toString());
}
}
