package Adapter;

import Adaptee.WeightMachine;

public class WeightMachineAdapaterIMPL implements  WeightMachineAdapter{
    WeightMachine weightMachine;
    public  WeightMachineAdapaterIMPL(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }
    @Override
    public double getWeightInkg() {
        double weightINpound=weightMachine.getWeightInPound();
        double weightinKG=weightINpound* 0.45;
        return  weightinKG;

    }
}
