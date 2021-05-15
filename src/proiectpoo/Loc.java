package proiectpoo;

class Loc {
    int id;
    boolean rezervat;

    public Loc(int id) {
        this.id = id;
        this.rezervat = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRezervat() {
        return rezervat;
    }

    public void setRezervat(boolean rezervat) {
        this.rezervat = rezervat;
    }

    @Override
    public String toString() {
        return "Loc{" + "id=" + id + ", rezervat=" + rezervat + '}';
    }
    
    
}
