class FirstNonConsecutive {

    static Integer find(final int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1] - 1) {
                return array[i + 1];
            }
        }

        return null;
    }
}