public class classical extends Song {
    private String producer;
    public classical(String name, String artist, int releaseYear, String composer) {
        super(name, artist, releaseYear);
        this.producer = composer;
    }
    @Override
    public void playSample() {
        System.out.println(getName() + ":cllasics time");
    }
    public String getProducer() {
        return producer;
    }
}
