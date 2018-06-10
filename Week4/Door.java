/*---------------------------------------------------
// AUTHOR: Jason Sigler
// FILENAME: Door.java
// SPECIFICATION: A class that simulates the binary states
//                of a door object.
// FOR: CSE-110 lab 5
// TIME SPENT: 35 Minutes
//-------------------------------------------------*/

/**
 /**
 A class that simulates the binary state of a specified door.
 */
public class Door {

    //Initialize private intance variables
    private String doorName;
    private String doorState;


    /**
     * Constructor method for the Door class
     * @param newName  the name of the door.
     * @param newState  the state of the door (open or closed.
     */
    public Door(String newName, String newState){
        doorName = newName;
        doorState = newState;

    }//End of constructor

    /**
     * Checks whether the door is open or closed.
     * @return the state of the door.
     */
    public String getState() {
        return doorState;

    }//End of method

    /**
     * Returns the name of the door
     * @return the doorName variable.
     */
    public String getName(){
        return doorName;
    }//End of method

    /**
     * Changes the state of the door to open or closed.
     * @param newState specifies the state of the door.
     */
    public void setState(String newState) {
        doorState = newState;

    }//End of method


    /**
     * Specify the name of the door.
     * @param newName sets the doorName variable.
     */
    public void setName(String newName) {
        doorName = newName;
    }//End of method

    /**
     * Sets the door state to 'open',
     */
    public void open(){
        doorState = "open";

    }//End of method

    /**
     * Sets the door state to 'closed'.
     */
    public void close(){
        doorState = "closed";

    }//End of method

}//End of Door class
