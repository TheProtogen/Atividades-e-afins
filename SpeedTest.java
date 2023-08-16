public class SpeedTest {
    public static void main(String[] args) {
        int[] vetor1000 = new int[1000];
        int[] vetor10000 = new int[10000];
        int[] vetor100000 = new int[100000];

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            vetor1000[i] = 0;
        }
        long endTime = System.nanoTime();
        double elapsedTime1000 = (endTime - startTime)/1e9;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            vetor10000[i] = 0;
        }
        endTime = System.nanoTime();
        double elapsedTime10000 = (endTime - startTime)/1e9;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            vetor100000[i] = 0;
        }
        endTime = System.nanoTime();
        double elapsedTime100000 = (endTime - startTime)/1e9;

        //Usando "1e9" pra facilitar as coisas...

        System.out.println("Tempo (1000): " + elapsedTime1000 + " s");
        System.out.println("Tempo (10000): " + elapsedTime10000 + " s");
        System.out.println("Tempo (100000): " + elapsedTime100000 + " s");
    }
}
