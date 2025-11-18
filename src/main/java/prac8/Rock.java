package prac8;

public class Rock extends Song {
    private boolean hasSolo;
    public Rock(String name, String artist, int releaseYear, boolean hasSolo){
        super(name, artist, releaseYear);
        this.hasSolo = hasSolo;
        this.genre= "rock";
    }
    @Override
    public void playSampel() {
        System.out.println(genretag()+""+getName() + ": rock plays");
    }
    public boolean isHasSolo() {
        return hasSolo;
    }
}
