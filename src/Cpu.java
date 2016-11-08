import java.util.Arrays;

/**
 * @author Pedro Roldan on 07-11-2016.
 * @version 0.0
 */
public class Cpu {

    private long[] register = new long[9];
    private String cacheMemory = "                      ";

    public Cpu() {
    }

    /**
     * Puts long value on the position index of the register
     * @param index
     * @param value
     */
    public void setRegisterAt (int index, long value) {

        if (index>register.length && index<=0) {
            System.out.println("Index should be between 0-8!");
            System.exit(-1);
        }

        this.register[index]=value;
    }

    /**
     * returns the value at register[index]
     * @param index
     * @return
     */
    public long getRegisterAt(int index) {
        return register[index];
    }

    /**
     * Puts char value on the position index of the cacheMemory
     * @param index
     * @param value
     */
    public void setCacheAt (int index, char value) {

        StringBuilder string = new StringBuilder(this.cacheMemory);  //object to manipulate string

        if (index<0) {
            System.out.println("Index should be positive!");
            System.exit(-1);
        }

        string.setCharAt(index,value);
        cacheMemory= string.substring(0);   //substring gives back the string with the index 0 until length - 1
    }

    /**
     * Prints the information about my CPU
     * @return cpu information
     */
    @Override
    public String toString() {
        return "CPU{" +
                "register=" + Arrays.toString(register) +
                ", cacheMemory='" + cacheMemory + '\'' +
                '}';
    }
}
