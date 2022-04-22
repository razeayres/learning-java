package algorithms;

public class FindingPI {
    public static void main(String[] args) {
        /*
        these calls the getPI() method
        with as arguments the number of
        random points the will be used
        in simulation
        */
        System.out.println(getPI(10000));
        System.out.println(getPI(100000));
        System.out.println(getPI(1000000));
        System.out.println(getPI(10000000));
        System.out.println(getPI(100000000));
        System.out.println(getPI(1000000000));
        System.out.println(getPI(2000000000));
    }

    public static double getPI(int numPoints) {
        /*
        this declares and defines
        the variable inCircle as 0.
        It is actually a counter
        of how many random points
        are located in the circle
        */
        int inCircle = 0;

        /*
        this is the main loop that
        creates the random points
        and evaluates their locations
        */
        for (int i = 0; i < numPoints; i++) {
//            these create the random points
            double randX = Math.random() * 2 - 1;
            double randY = Math.random() * 2 - 1;

//            this calculates the dist from the circle
            double dist = Math.sqrt(randX * randX + randY * randY);

//            this counts how many points are in the circle
            if (dist < 1) {
                inCircle++;
            }
        }

        /*
        this performs and returns
        the actual simulation of PI
        */
        return 4.0 * inCircle / numPoints;
    }
}
