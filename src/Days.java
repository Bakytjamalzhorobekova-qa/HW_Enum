public enum Days {
    MONDAY("Дуйшонбу куну джава окуйм"),
    TUESDAY("Шейшемби куну ангис тилин окуйм"),
    WEDNESDAY("Шаршемби куну джава окуйм"),
    THURSDAY("Бейшемби куну джава практика кылам"),
    FRIDAY("Жуму куну джава окуйм"),
    SATURDAY("Ишемби куну джава практика кылам"),
    SUNDAY("Жекшемби куну эс алам");


    private String schedule;

    Days(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Days{" +
                "schedule='" + schedule + '\'' +
                '}';
    }
}
