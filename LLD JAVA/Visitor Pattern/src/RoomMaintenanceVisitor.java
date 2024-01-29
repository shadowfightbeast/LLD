public class RoomMaintenanceVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("performing maintenance of SingleRoom");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("performing maintenance of DoubleRoom");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("performing maintenance of DeluxeRoom");
    }

}
