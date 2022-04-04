/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kirjasto;

import lombok.Data;

import database.*;
import java.util.Scanner;

@Data
public class Main {

    private String greeting = "Hello World!";

    public static void main(String[] args) {
        //System.out.println(new Main().getGreeting());

        IO cIO = new ConsoleIO(new Scanner(System.in));
        HintDaoJdbc db = new HintDaoJdbc();

        TextUserInterface tUI = new TextUserInterface(cIO,db);

            while(!tUI.exit()) {
                tUI.display();
            }




    }
}
