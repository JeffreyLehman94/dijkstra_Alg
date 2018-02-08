import java.util.Random;

/**
 * Created by Jeff on 2/6/2018.
 * Program created to implement Dijkstra's Algorithm
 * <p>
 * This is the class which will hold the main method
 */
public class dijkra_Alg {
    private static int size = 5;

    public static void main(String[] args) {
        Node[][] GRAPH = createArray();
        System.out.println(Array_toString(GRAPH));
    }

    /**
     * This method creates a two dimensional array with random integers then returns it.
     * The array is to be created size x size dimensions
     *
     * @return GRAPH A 2 dimensional array with randomized ints to represent distances
     **/
    private static Node[][] createArray() {
        Random random = new Random();
        Node[][] GRAPH = new Node[size][size];
        int r;
        for (int i = 0; i < size; i++) {
            for (int n = 0; n < size; n++) {
                r = random.nextInt(15) - 5;
                if (r < 0 || i==n) {
                    r = 0;
                }
                GRAPH[i][n] = new Node(r);
            }
        }
        return GRAPH;
    }

    /**
     * Creates and returns a String representation of a 2 dimensional graph
     *
     * @param GRAPH A two dimensional array which will be represented as a String
     * @return s A String representation of the provided two dimensional array
     */
    private static String Array_toString(Node[][] GRAPH) {
        String s = "  ";
        int size = GRAPH.length;

        for (int i = 0; i < size; i++) {
            s += (char) (i + 65) + " ";
        }
        s += "\n";

        for (int i = 0; i < size; i++) {
            s += (char) (i + 65) + " ";
            for (int n = 0; n < size; n++) {
                s += GRAPH[i][n].DISTANCE + " ";
            }
            s += "\n";
        }
        return s;
    }

    private static String[] Algo(Node[] GRAPH){
        String[] final_Paths = new String[size];


        return final_Paths;
    }
}
