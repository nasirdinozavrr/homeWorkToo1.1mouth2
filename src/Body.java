public class Body extends Human{
    private int height;
    private Gender gender;

    public Body(String view, int height, Gender gender) {
        super(view);
        this.height = height;
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public Gender getGender() {
        return gender;
    }

    public String allInfo(String s) {
        return ("Human{" +
                " view='" + getView() + '\'' +
                " height=" + height + '\'' +
                ", gender='" + getGender() + '\'' +
                '}');
    }

    public final String allInfo(int height, Gender gender) {
        return ("Body{" +
                " height=" + this.height + '\'' +
                ", gender='" + getGender() +
                '}');

    }
}
