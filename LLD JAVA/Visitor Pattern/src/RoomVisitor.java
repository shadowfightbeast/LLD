
public interface RoomVisitor {
    public void visit(SingleRoom singleRoomObj);

    public void visit(DoubleRoom doubleRoomObj);

    public void visit(DeluxeRoom deluxeRoomObj);
}
