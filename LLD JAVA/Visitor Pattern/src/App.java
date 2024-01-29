public class App {
    public static void main(String[] args) throws Exception {
        RoomElement singleRoomObj = new SingleRoom();
        RoomElement doubleRoomObj = new DoubleRoom();
        RoomElement deluxeRoomObj = new DeluxeRoom();

        RoomVisitor priceVisitorObj = new RoomPricingVisitor();
        singleRoomObj.accept(priceVisitorObj);
        System.out.println(((SingleRoom) singleRoomObj).roomPrice);

        RoomVisitor roomMaintenanceVisitorObj = new RoomMaintenanceVisitor();
        singleRoomObj.accept(roomMaintenanceVisitorObj);
        doubleRoomObj.accept(roomMaintenanceVisitorObj);
        deluxeRoomObj.accept(roomMaintenanceVisitorObj);
    }
}
