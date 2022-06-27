public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        double[] list = {42, 33,12, 42, 123};
        double harmonicAverage = 0.0;
        double harmonicSum = 0.0;
        for (int i = 0; i < list.length; i++) {
            harmonicSum += (1/list[i]);
        }
        harmonicAverage = list.length/harmonicSum;
        System.out.println(harmonicAverage);

    }
}
