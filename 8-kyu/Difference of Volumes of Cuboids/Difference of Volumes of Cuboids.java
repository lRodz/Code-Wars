public class CuboidVolumes {

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        int result = 1;

        for (int i = 0; i < firstCuboid.length; i++) {

            result *= firstCuboid[i];
        }

        int result2 = 1;

        for (int i = 0; i < secondCuboid.length; i++) {

            result2 *= secondCuboid[i];
        }

        return Math.abs(result - result2);
    }
}