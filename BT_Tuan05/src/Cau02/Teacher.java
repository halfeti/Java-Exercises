package Cau02;

public class Teacher extends Person {
    private String rank;

    public Teacher(){

    }
    public Teacher(String rank){
        this.rank=rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
