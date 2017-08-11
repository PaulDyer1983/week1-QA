import java.util.Arrays;

public class Paint {

    private final double[] cheapomax = {20, 19.99, 10};
    private final double[] averageJoes = {15, 17.99, 11};
    private final double[] duluxourousPaints = {10, 25, 20};


    public double[] getCheapomax(){
        return Arrays.copyOf(cheapomax, cheapomax.length);
    }

    public double[] getAverageJoes(){
        return Arrays.copyOf(averageJoes, averageJoes.length);
    }

    public double[] getDuluxourousPaints(){
        return Arrays.copyOf(duluxourousPaints, duluxourousPaints.length);
    }

}
