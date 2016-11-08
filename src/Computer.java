

/**
 * @author Pedro Roldan on 07-11-2016.
 * @version 0.0
 */
public class Computer {

    private int ramSize;
    private int hardDriveSize;
    private Cpu[] CPUS= new Cpu[4];

    /**
     * Construction function of a computer
     * @param ramSize
     * @param hardDriveSize
     */
    public Computer (int ramSize, int hardDriveSize){
        this.ramSize=ramSize;
        this.hardDriveSize=hardDriveSize;
    }

    /**
     * gets the Ram size of the computer
     * @return
     */
    public int getRamSize() {
        return ramSize;
    }

    /**
     * sets the ram size of the computer
     * @param ramSize
     */
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    /**
     * gets the hard drive size of the computer
     * @return
     */
    public int getHardDriveSize() {
        return hardDriveSize;
    }

    /**
     * sets the hard drive size of the computer
     * @param hardDriveSize
     */
    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }
}
