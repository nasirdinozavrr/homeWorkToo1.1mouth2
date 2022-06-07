import java.util.Arrays;

public class Person extends Body {
    private String name;
    private int [] date;

    public Person(String view, int height, Gender gender, String name, int[] date) {
        super(view, height, gender);
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int[] getDate() {
        return date;
    }


    public String allInfo() {
            return ( "Human{" +
                    " view='" + getView() + '\'' +
                    ", height=" + getHeight() + '\'' +
                    ", gender='" + getGender() + '\'' +
                    ", name=" + name + '\'' +
                    ", date=" + Arrays.toString(date) +
                    '}');
        }


}
