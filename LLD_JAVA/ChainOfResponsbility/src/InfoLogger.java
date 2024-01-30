package LLD_JAVA.ChainOfResponsbility.src;
public class InfoLogger  extends  LogProccessor{
    InfoLogger(LogProccessor nextLogProccesor){
        super(nextLogProccesor);
    }
    public  void log(int logLevel,String message){
        if(logLevel==INFO) System.out.println("INFO" +message);
        else {
            super.log(logLevel,message);
        }
    }
}
