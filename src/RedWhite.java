import edu.princeton.cs.algs4.Graph;

import java.util.HashMap;
import java.util.Iterator;

public class RedWhite {
    public static int count(Graph G, int[] rednodes) {
        int rw_count = 0;
        System.out.println("Vertices: " + G.V());
        System.out.println("Edges: " + G.E());
        if (rednodes.length == 0) {
            return 0;
        }

        HashMap<Integer, Boolean> redNodeMap = new HashMap<>();
        for(int i = 0; i < rednodes.length; i++) {
            redNodeMap.put(rednodes[i], true);
        }

        for(int i = 0; i < rednodes.length; i++) {
            Iterator<Integer> iterator = G.adj(rednodes[i]).iterator();
            while (iterator.hasNext()) {
                if(!redNodeMap.containsKey(iterator.next())) {
                    rw_count++;
                }
            }
        }



        return rw_count;
    }
}
