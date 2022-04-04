/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kirjasto;

import lombok.Data;


import java.util.Scanner;

@Data
public class Main {

    private String greeting = "Hello World!";

    public static void main(String[] args) {
        //System.out.println(new Main().getGreeting());

        IO cIO = new ConsoleIO(new Scanner(System.in));

        TextUserInterface tUI = new TextUserInterface(cIO);

            tUI.display();



    }
}
