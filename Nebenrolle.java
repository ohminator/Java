public class Nebenrolle {
  
    private String Name;
    private int Alter;
    private char Geschlecht;
    private double Größe;

    public Nebenrolle(String pName, int pAlter, char pGeschlecht, double pGröße) {
        Name = pName;
        Alter = pAlter;
        Geschlecht = pGeschlecht;
        Größe = pGröße;
    }

    public String getName() {
        return Name;
    }

    public int getAlter() {
        return Alter;
    }

    public char getGeschlecht() {
        return Geschlecht
    }

    public double getGröße() {
        return Größe;
    }