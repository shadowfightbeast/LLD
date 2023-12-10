public abstract  class AbstractFactory {
    abstract Hollywood getHName(String name);
    abstract Bollywood getBName(String name);
}

class HNameFactory extends AbstractFactory{
    @Override
    Hollywood getHName(String name) {
        if(name==null) return null;
        else if(name=="Ted") return new HollywoodComedy();
        else if(name=="Wanted") return new HollywoodAction();
        else if(name=="Anaballe") return new HollywoodAction();
        return null;
    }

    @Override
    Bollywood getBName(String name) {

        return null;
    }
}
class BNameFactory extends AbstractFactory{

    @Override
    Hollywood getHName(String name) {
        return null;
    }

    @Override
    Bollywood getBName(String name) {
        if(name==null) return  null;
        else if(name=="dhamaal") return  new BollywoodComedy();
        else if(name=="krish") return  new BollywoodAction();
        else if(name=="raaz") return  new BollywoodHoror();
        return null;
    }
}
