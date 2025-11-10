public class app {
    public static void main(String[] args) {
        Song song1 = new Pop("fireball", "Pitbull", "2014");
        Song song2= new Rocksonfg("Sonne", "Ramstein", "2001");
        Song song3= new classical("Slipping through my fingers","Abba","1981");

        song1.showInfo();
        song2.showInfo();
        song3.showInfo();
        song1.sampel();
        song2.sampel();
        song3.sampel();
        System.out.println("----My songs----");
        Pop pop =(Pop) song1;
        System.out.println(pop.getName()+"catchy:"+pop.isCatchyMusic());

        Rocksonfg rock=(Rocksonfg) song2;
        System.out.println(rock.getName()+"solo:"+rock.isHasSolo());

        classical classical=(classical)song3;
        System.out.println(classical.getName()+"prod by:"+classical.getProducer());
    }
}
