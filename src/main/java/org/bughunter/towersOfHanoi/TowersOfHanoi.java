package org.bughunter.towersOfHanoi;

public class TowersOfHanoi {

    public void solve(int disk, char source, char middle, char destination) {

        if (disk == 0) {
            System.out.println("Plate " + disk + " from " + source + " to " + destination);
            return;
        }
//        We move n - 1 plates to the middle rod - to be able to move the largest one to the destination (last) rod
        solve(disk - 1, source, destination, middle);
//        We move the large plate to the destination. We call this method recursively so this is not always th largest plate
        System.out.println("Plate " + disk + " from " + source + " to " + destination);
//        We move n - 1 plates from the middle to the destination (with the help of the first rod)
        solve(disk - 1, middle, source, destination);
    }
}
