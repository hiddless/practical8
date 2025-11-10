public class classical extends Song {
    private String producer;
    public classical(String name, String artist, int releaseYear, String composer) {
        super(name, artist, releaseYear);
        this.producer = composer;
        this.genre="classic";
    }
    @Override
    public void playSampel() {
        System.out.println(genretag()+""+getName() + ":cllasics time");
    }
    public String getProducer() {
        return producer;
    }
}
