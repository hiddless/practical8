public class Rocksonfg extends Song {
    private boolean hasSolo;
    public Rocksonfg(String name,String artist,int releaseYear){
        super(name,artist,releaseYear);
        this.hasSolo= hasSolo;
    }
    @Override
    public void playSample() {
        System.out.println(getName() + ":rock plays");
    }
    public boolean isHasSolo() {
        return hasSolo;
    }
}
