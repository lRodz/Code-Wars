public class Kata {

    public static String datingRange(int age) {

        int ageMin = age / 2 + 7;
        int ageMax = 2 * (age - 7);

        if (age <= 14) {
            ageMin = (int) Math.floor(age - (0.1 * age));
            ageMax = (int) Math.floor(age + (0.1 * age));
        }

        return ageMin + "-" + ageMax;
    }
}