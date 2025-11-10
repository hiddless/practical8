public class Pop extends Song {
    private boolean catchyMusic;
    public Pop(String name,String artist,int releaseYear,boolean catchyMusic){
        super(name,artist,releaseYear);
        this.catchyMusic=catchyMusic;
    }
    @Override
    public void Sample() {
        System.out.println(getName() + ": dancetime!");
    }
    public boolean isCatchyMusic() {
        return catchyMusic;
    }

}
