public class BeerSong {

    //I am testing the commit feature of Git.

    public void Main() {

    }

    public void Ninety_Nine_Bottles_of_Beer() {

        String s = "s";
        for (int beers = 99; beers > -1;) {
            System.out.print(beers + "bottle" + s + " of beer on the wall, ");
            System.out.println(beers + " bottle" + s + " of beer");
            if (beers == 0) {
                System.out.print("No more left");
                System.out.println("99 bottles of beer on the wall.\n");
                System.exit(0);
            }
            else {
                System.out.println("Take one down, pass it around, ");
            }
        }

    }
}
