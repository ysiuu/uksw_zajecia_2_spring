package pl.edu.uksw.j2eecourse.zajecia_2;

public class Swiat {

    private Ziemia ziemia;

    public Swiat() {
        this.ziemia = new Ziemia();
    }

    public void start() {
        System.out.println("Witaj Świecie");

        this.ziemia.przedstawSie();
    }

}
