public class Pop extends Song {
    private boolean catchyMusic;
    public Pop(String name,String artist,int releaseYear,boolean catchyMusic){
        super(name,artist,releaseYear);
        this.genre="pop";
        this.catchyMusic=catchyMusic;
    }
    @Override
    public void playSampel() {
        System.out.println(genretag()+" "+getName() + ": dancetime!");
    }
    public boolean isCatchyMusic() {
        return catchyMusic;
    }

}
