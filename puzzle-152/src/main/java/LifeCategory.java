
public enum LifeCategory {

    STILL_IN_MAMAS_ARMS("Still in Mama's arms"),
    PRESCHOOL_MANIAC("Preschool Maniac"),
    ELEMENTARY_SCHOOL("Elementary school"),
    MIDDLE_SCHOOL("Middle school"),
    HIGH_SCHOOL("High school"),
    COLLEGE("College"),
    WORKING_FOR_THE_MAN("Working for the man"),
    THE_GOLDEN_YEARS("The Golden Years");

    LifeCategory(String theName) {
        this.name = theName;

    }

    public static String from(int age) {
        LifeCategory c = STILL_IN_MAMAS_ARMS;
        if (age >= 0 && age <= 2) {
            c = STILL_IN_MAMAS_ARMS;
        } else if (age >= 3 && age <= 4) {
            c = PRESCHOOL_MANIAC;
        } else if (age >= 5 && age <= 11) {
            c = ELEMENTARY_SCHOOL;
        } else if (age >= 12 && age <= 14) {
            c = MIDDLE_SCHOOL;
        } else if (age >= 15 && age <= 18) {
            c = HIGH_SCHOOL;
        } else if (age >= 19 && age <= 22) {
            c = COLLEGE;
        } else if (age >= 23 && age <= 65) {
            c = WORKING_FOR_THE_MAN;

        } else {
            c = THE_GOLDEN_YEARS;
        }

        return c.toString();

    }
    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
