package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class MyGraph {
    static int V;
    static LinkedList<Integer> adjListArray[];

    MyGraph(int V){
        this.V = V;
        adjListArray = new LinkedList[V];

        for (int i = 0; i < V ; i++) {
            adjListArray[i] = new LinkedList<>();

        }
    }

    static void addEdge(MyGraph myGraph, int src, int dest){
        myGraph.adjListArray[src].add(dest);
        myGraph.adjListArray[dest].add(src);
    }

    static void printGraph(MyGraph myGraph){
        for (int v = 0; v < myGraph.V; v++) {
            System.out.println("Adjaceny list of verex" + v);
            System.out.println("head");
            for (Integer pCrawl: myGraph.adjListArray[v]) {
                System.out.println(" -> " + pCrawl);
            }
            System.out.println("\n");
        }
    }
    static void BFS(int s){
        boolean vistited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        vistited[s] = true;
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll();
            System.out.println(s+ "");
            Iterator<Integer> i = adjListArray[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!vistited[n]){
                    vistited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

}
