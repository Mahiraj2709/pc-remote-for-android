package hu.za.pc_remote.common;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Andor
 * Date: 9/26/11
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class RCAction implements Serializable {

    public enum Type{

        MOUSE_MOVE(0, 2),
        MOUSE_CLICK(1, 1),
        KEY_PRESS(2, 1),
        COMMAND(3, 1);

        private int value;
        private int numberOfArgs;  //TODO not needed

        Type(int value, int argNum){
            this.value = value;
            this.numberOfArgs = argNum;
        }

        public int getValue(){
            return value;
        }
    }

    public Type type;
    public float[] arguments; //TODO int is not good, x and y coordinatas are coming in float

    public String toString(){
        StringBuilder sb = new StringBuilder("RCAction type:").append(type.toString()).append(" args:");
        for(float f : arguments){
            sb.append(" ").append(f);
        }
        return sb.toString();
    }
}