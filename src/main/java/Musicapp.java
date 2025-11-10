public class Musicapp {
    public static void main(String[] args) {
        Song song1 = new Pop("fireball", "Pitbull", 2014,true);
        Song song2= new Rock("Sonne", "Ramstein",2001,true);
        Song song3= new classical("Slipping through my fingers","Abba",1981,"benny anderson");

        song1.showInfo();
        song2.showInfo();
        song3.showInfo();
        song1.playSampel();
        song2.playSampel();
        song3.playSampel();
        System.out.println("----My songs----");
        Pop pop =(Pop) song1;
        System.out.println(pop.getName()+"catchy:"+pop.isCatchyMusic());

        Rock rock=(Rock) song2;
        System.out.println(rock.getName()+"solo:"+rock.isHasSolo());

        classical classical=(classical)song3;
        System.out.println(classical.getName()+"prod by:"+classical.getProducer());
    }
}
