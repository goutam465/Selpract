/**
 * Created by glek0001 on 27/09/17.
 */
public class StringSplit {

    public static void main(String[] args) {

        String iosBrowser = "//tr//td[.='orbitbrowser-android']/../td[.='3.3.13.0']";

        String [] parts = iosBrowser.split("'");

        System.out.println(parts[1]+ "("+parts[3] + ") Enabled/Disabled Pilot Mode");


    }
}
