public class Boss extends Worker{

    private int yearsInCharge;

    public Boss(String name, int age, String title, String id, int exp) {
        super(name, age, title, id, exp);
    }

    public int getYearsInCharge() {
        return yearsInCharge;
    }

    public void setYearsInCharge(int yearsInCharge) {
        this.yearsInCharge = yearsInCharge;
    }
}
