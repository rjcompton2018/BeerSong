public class BeerSong {

    //I am testing the commit feature of Git.

    public static void main(String [] args) {

        Ninety_Nine_Bottles_of_Beer();

    }

    public static void Ninety_Nine_Bottles_of_Beer() {

        String s = "s";
        for (int beers = 99; beers > -1;) {
            System.out.print(beers + " bottle" + s + " of beer on the wall, ");
            System.out.println(beers + " bottle" + s + " of beer");
            if (beers == 0) {
                System.out.print("Take one down, pass it around, no more bottles of beer on the wall.");
                System.out.println("\n\n****END OF PROGRAM OUTPUT****");
                System.exit(0);
            }
            else {
                System.out.println("Take one down, pass it around, ");
                s = (--beers == 1) ? "" : "s";
                System.out.println(beers + " bottle" + s + " of beer on the wall.\n");
                  }
            }
        }

    }

