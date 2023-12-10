public class Main {
    public static void main(String[] args) {

        AbstractFactory hfactory=FactoryProducer.getFactory("hollywood");
        Hollywood hollywood=hfactory.getHName("Wanted");
        hollywood.getMovie();

        AbstractFactory bfactory=FactoryProducer.getFactory("bollywood");
        Bollywood bollywood=bfactory.getBName("krish");
        bollywood.getMovie();

        Bollywood bollywood2=bfactory.getBName("raaz");
        bollywood2.getMovie();

    }
}