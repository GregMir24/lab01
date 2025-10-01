class Mnclass{
    public static void main(String[] args){
        long[] w = singleArrLong();
        double[] x = singleArrDouble();
        double[][] w1 = doubleArrdouble(x, w);
        arrOut(w1, "%8.3f");

    }

    static long[] singleArrLong(){
        long[] w = new long[12];
        for(int i = 0; i < 12; ++i) w[i] = 2 * (i+1);
        return w;
    }

    static double[] singleArrDouble(){
        double[] x = new double[20];
        for(int i = 0; i < 20; ++i) x[i] = (Math.random() * (3.0 - (-9.0))) + -9.0;
        return x;
    }

    static double[][] doubleArrdouble(double[] x, long[] w){
        double[][] w1 = new double[12][20];
        for(int i = 0; i < 12; ++i)
            for(int j = 0; j < 20; ++j)
                w1[i][j] = calculateW1(w[i], x[j]); 
        return w1;
    }

    static double calculateW1(long wi, double xj){
        if (wi == 8) return Math.log(Math.sqrt(Math.pow(Math.abs(xj)/2.0, xj)));
        else if (wi == 2 || wi == 6 || wi == 10 ||
            wi == 18 || wi == 20 || wi == 22) return Math.atan(1.0/(Math.exp(Math.acos(Math.exp(-Math.abs(xj))))));
        else return Math.log(Math.sqrt(Math.pow(3.0*(Math.pow(Math.sin(xj), 2)), 2)));
    }
    static void arrOut(double[][] matrix, String format){
        for(double[] x: matrix){
            for(double y: x){
                System.out.printf(format, y);
            }
            System.out.println(" ");
        }
    }

}
 