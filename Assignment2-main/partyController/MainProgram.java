package partyController;

import java.util.Scanner;

public class MainProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type how many guests");
        int input = sc.nextInt();
        int maxNbrOfGuests = input;

        /* Write code to read max number of guests from the user by using one of
         - JOptionPane
         - Scanner and prompt
        */

        Controller controller = new Controller(maxNbrOfGuests);

        // MainProgram -> Controller(maxNbrOfGuests)
        //                GuestManager(maxNbrOfGuests)
        //                MainFrame
    }
}
