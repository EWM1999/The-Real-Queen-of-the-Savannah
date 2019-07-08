public class Hyena extends Animal{
    //attributes
    private int rank;
    //constructors
    public Hyena(String name, int age) {
        super(name, age);
        this.rank = (int) (Math.random()*10 + 10);
    }

    public Hyena(String name, int age, String gender) {
        super(name, age, gender);
        this.rank = (int) (Math.random()*20 + 1);
    }

    public Hyena (String name, int age, String gender, int rank){
        super(name,age,gender);
        this.rank = rank;
    }


    //methods
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
