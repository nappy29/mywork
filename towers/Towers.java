/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package towers;

/**
 *
 * @author Nappy
 */
public class Towers {

   public static void solveTowers( int disks, int sourcePeg,
int destinationPeg, int tempPeg )
{
// base case -- only one disk to move
if ( disks == 1 )
{
System.out.printf( "\n%d --> %d", sourcePeg, destinationPeg );
return;
} // end if
// recursion step -- move (disk - 1) disks from sourcePeg
// to tempPeg using destinationPeg
solveTowers( disks - 1, sourcePeg, tempPeg, destinationPeg );
// move last disk from sourcePeg to destinationPeg
System.out.printf( "\n%d --> %d", sourcePeg, destinationPeg );
// move ( disks - 1 ) disks from tempPeg to destinationPeg
solveTowers( disks - 1, tempPeg, destinationPeg, sourcePeg );
} // end method solveTowers
   public static void main( String[] args )
 {
 int startPeg = 1; // value 1 used to indicate startPeg in output
 int endPeg = 3; // value 3 used to indicate endPeg in output
 int tempPeg = 2; // value 2 used to indicate tempPeg in output
 int totalDisks = 64; // number of disks

 // initial nonrecursive call: move all disks.
 Towers.solveTowers( totalDisks, startPeg, endPeg, tempPeg );
 } //
}
