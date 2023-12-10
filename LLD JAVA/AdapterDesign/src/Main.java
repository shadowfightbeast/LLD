import Adaptee.weightmachineforbabies;
import Adapter.WeightMachineAdapaterIMPL;
import Adapter.WeightMachineAdapter;

public class Main {
    public static void main(String[] args) {

        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapaterIMPL(new weightmachineforbabies());
        System.out.println(weightMachineAdapter.getWeightInkg());
    }
}