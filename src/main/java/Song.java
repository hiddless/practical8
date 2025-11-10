public class Song {
    private String name;
    private String artist;
    private int releaseYear;
    public Song(String title, String artist, int releaseYear) {
        this.name = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public abstract void sampel();
    public void showInfo(){
        System.out.println("name: "+ name+"/ artist: "+artist+"/ releaseYear: "+releaseYear);
    }




}
