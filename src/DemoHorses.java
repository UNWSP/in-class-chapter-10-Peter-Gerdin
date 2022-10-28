public class DemoHorses {
    public static void main(String[] arg){

        Horse horse1 = new Horse("Zach L", "black", 1999);
        RaceHorse horse2 = new RaceHorse("Zach B", "White", 2006, 16);

        System.out.println(horse1.getName() +"\n"+ horse1.getColor() +"\n"+ horse1.getBirthYear()+"\n\n");
        System.out.println(horse2.getName() +"\n"+ horse2.getColor() +"\n"+ horse2.getBirthYear() +"\n"+ horse2.getRaces() +"\n\n");

    }
}
