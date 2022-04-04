package kirjasto;

import java.util.ArrayList;
import java.util.List;

import database.*;

public class TextUserInterface {

    private IO io;
    private HintDaoJdbc db;
    private boolean endState = false;

    public TextUserInterface(IO io, HintDaoJdbc db) {
        this.io = io;
        this.db = db;
    }

    public TextUserInterface(IO io) {
        this.io = io;
    }

    private void add() {
        io.print(("Anna vinkin otsikko"));
        io.nextLine();
        String name = io.nextLine();
        io.print("Anna vinkin linkki");
        String linkki = io.nextLine();
        db.addHint(new Hint(name, linkki));
        io.print("Lisättiin vinkki nimellä" + name + "\n"
                    + "Otsikko: " + linkki   );
    }
    private void remove() {

    }
    private void browse() {
        io.print(db.getAllHints().toString());


    }
    public boolean exit() {
        return this.endState;
    }

    public void display() {
        io.print("Tervetuloa lukuvinkkikirjastoon! Sallitut komennot: \n" +
                "1) Lisaa vinkki \n" +
                "2) Selaa vinkkeja \n" +
                "3) Poista vinkki \n" +
                "4) Sulje valikko");

            io.print("Syota komento: ");
            int cmd = io.nextInt();


            switch(cmd) {
                case 1:
                    io.print("Lisataan vinkki");
                    this.add();
                    break;
                case 2:
                    io.print("Selataan vinkkeja");
                    this.browse();
                    break;
                case 3:
                    io.print("Poista vinkki");
                    this.remove();
                    break;
                case 4:
                    io.print("exit");
                    this.endState = true;
                    this.exit();
                    break;
                default:
                    io.print("Vaara syote");

            }

        }
    }


