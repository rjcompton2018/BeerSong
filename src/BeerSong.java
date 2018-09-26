public class BeerSong {

    //Richard Compton
    //CSI 3370
    //99 Bottles of Beer on the Wall Song
    /* In this project, I learn how to use Git and GitHub, and code the 99 bottles
    of beer on the walls song.
     */

    public static void main(String [] args) {

        //Calls the 99 Bottles of Beer method
        Ninety_Nine_Bottles_of_Beer();

    }

    public static void Ninety_Nine_Bottles_of_Beer() {

        //Variable used to add 's' to the end of 'beer' when needed
        String s = "s";

        //For loop that creates the 99 bottles of beer song
        for (int beers = 99; beers >= -1;) {
            System.out.print(beers + " bottle" + s + " of beer on the wall, ");
            System.out.println(beers + " bottle" + s + " of beer");

            //The end of the song
            if (beers == 0) {
                System.out.print("Take one down, pass it around, no more bottles of beer on the wall.");
                System.out.println("\n\n****END OF PROGRAM OUTPUT****");
                System.exit(0);
            }

            //The continuation of the song
            else {
                System.out.println("Take one down, pass it around, ");
                s = (--beers == 1) ? "" : "s";
                System.out.println(beers + " bottle" + s + " of beer on the wall.\n");
                  }
            }
        }
    }

