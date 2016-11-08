/**
 * @author Pedro Roldan on 07-11-2016.
 * @version 0.0
 */
public class Driver {

    public static void main(String[] args) {

        Cpu myCpu = new Cpu();
        String computerName = "myComputerInJava";
        int namelength= computerName.length();
        int i;
        long temp;

        myCpu.setRegisterAt(5, 3756);

        for (i=0 ; i<namelength ; i++) {
            myCpu.setCacheAt(i, computerName.charAt(i));
        }

        System.out.println(myCpu);

        for (i=0 ; i<9 ; i++) {
            temp=myCpu.getRegisterAt(i);
            myCpu.setRegisterAt(i, temp+i);
        }

        System.out.println(myCpu);

    }

}
