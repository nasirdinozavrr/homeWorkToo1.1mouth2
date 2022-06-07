public class Main {
    public static void main(String[] args) {
        int[] date = {22, 05, 2001};
        Person person = new Person("Homo-Sapiens", 169, Gender.MAN, "Yrysbek", date);
        System.out.println(person.allInfo());
        person.allInfo();

        int[] date1 = {15, 04, 2018};
        Person person1 = new Person("Homo-Sapiens", 173, Gender.MAN, "Venedict", date1);
        System.out.println(person1.allInfo());
        person1.allInfo();

        int[] date2 = {19, 08, 1999};
        Person person2 = new Person("Homo-Sapiens", 183, Gender.MAN, "Genadyi", date2);
        System.out.println(person2.allInfo());
        person2.allInfo();

    }

}