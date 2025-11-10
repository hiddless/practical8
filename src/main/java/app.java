public class app {
    public static void main(String[] args) {
        Song song1 = new Pop("fireball", "Pitbull", "2014");
        Song song2= new Rocksonfg("Sonne", "Ramstein", "2001");
        Song song3= new classical("Slipping through my fingers","Abba","1981");

        song1.showInfo();
        song2.showInfo();
        song3.showInfo();
    }
}
