public class DoorTester
{
    
    public static void main(String [] args)
    {
       Door door = new Door();
       door.setName("Front Door");
       door.setState("closed");
       
       System.out.println(door.getState());
       System.out.println("Expected: closed");
       
       door.open();
       System.out.println(door.getState());
       System.out.println("Expected: Open");
       
       System.out.println(door.getName());
       System.out.println("Expected: Front Door");
       
    }

}
