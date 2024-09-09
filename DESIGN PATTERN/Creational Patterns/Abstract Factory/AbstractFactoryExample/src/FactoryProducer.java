public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("hollywood"))
            return new HNameFactory();

        if (choice.equalsIgnoreCase("bollywood"))
            return new BNameFactory();
        return null;
    }
}
