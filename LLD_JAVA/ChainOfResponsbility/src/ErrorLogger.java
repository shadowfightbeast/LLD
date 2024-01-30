package LLD_JAVA.ChainOfResponsbility.src;
public class ErrorLogger extends  LogProccessor {
    ErrorLogger(LogProccessor nextLogProccessor){
        super( nextLogProccessor);
    }
    public  void log(int logLevel , String message){
        if(logLevel==ERROR) System.out.println("ERROR" + message);
        else{
            super.log(logLevel,message);
        }
    }
}
