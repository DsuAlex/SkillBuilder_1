import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();


        System.out.println("Enter a floating-point number: ");
        double floatingPointNum = input.nextDouble();
        double spice = (4.0/3.0) * Math.pow(2,(Math.sqrt(5) / (Math.pow(floatingPointNum,3))));
        System.out.println("Well Jean Claude, the spice value resulted in " + spice);
        System.out.printf("And the converted value is %.2f", spice);







        //TODO : Replace this comment with your code
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;
        int cans = 0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double wallArea = wallHeight*wallWidth;

        System.out.println("Wall area: " + wallArea + " square feet");
        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double doubleGallonsNeeded =  wallArea/squareFeetPerGallons;
        String gallonsNeeded = String.format("%.2f", doubleGallonsNeeded);
        System.out.println("Paint needed: " + gallonsNeeded + " gallons");
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        if (doubleGallonsNeeded % gallonsPerCan == 0){

             cans = (int)(doubleGallonsNeeded/gallonsPerCan);

            System.out.println("Cans needed: " + cans + " can(s)");
        } else if (doubleGallonsNeeded % gallonsPerCan != 0) {
            double doubleCans = Math.ceil(doubleGallonsNeeded);
            cans = (int)doubleCans;
            System.out.println("Cans needed: " + cans + " can(s)");

            
        }
    }
}
