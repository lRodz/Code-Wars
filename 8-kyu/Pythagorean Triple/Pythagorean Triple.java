public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple) {

        int a = triple[0] * triple[0];
        int b = triple[1] * triple[1];
        int c = triple[2] * triple[2];

        return a + b == c ? 1 : a + c == b ? 1 : c + b == a ? 1 : 0;

    }

}