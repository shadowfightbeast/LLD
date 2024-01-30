package LLD_JAVA.ChainOfResponsbility.src;
public abstract class LogProccessor {
    public  static  int  INFO=1;
    public  static  int  DEBUG=2;
    public  static  int  ERROR=3;
    LogProccessor nextLogProccessor;
    LogProccessor(LogProccessor  loggerProccessor){
        this.nextLogProccessor=loggerProccessor;
    }
    public  void log(int logLevel,String  message){
        if(nextLogProccessor!=null){
            nextLogProccessor.log(logLevel,message);
        }
    }
}
