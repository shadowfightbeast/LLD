public interface Observer {
    //method to update the observer used by subject
    public  void update();
    public  void setSubject(Subject sub);
}
class MytopicSubscriber  implements  Observer{
    public  String name;
    private  Subject topic;
    @Override
    public void update() {
        String msg=(String) topic.getUpdate(this);
        if(msg==null){
            System.out.println(name+"no new message");
        }else{
            System.out.println(name + "consuming message" +msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}

