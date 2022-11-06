public class Worker {
    protected String name;
    protected int age;
    protected String title;
    protected String id;
    protected int exp;

    public Worker(String name, int age, String title, String id, int exp) {
        this.name = name;
        this.age = age;
        this.title = title;
        this.id = id;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
