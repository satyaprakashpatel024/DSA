package CodingThinker.Graph;

import java.util.*;

public class GraphImplementation {

    static void printGraph_Matrix(int [][]m){
        System.out.println("   1   2   3   4   5");
        for(int i=0; i<m.length; i++){
            System.out.print(i+1+" ");
            for(int j=0; j<m[0].length; j++){
                System.out.print(" "+m[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void graphBy2DArray(Scanner sc){
        System.out.print("Enter no of nodes of graph : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.print("Enter the no of edges of graph : ");
        int m = sc.nextInt();
        System.out.println("Enter \nS D C");
        for(int i=0; i<m; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            mat[s-1][d-1] = c;
            mat[d-1][s-1] = c;
        }
        printGraph_Matrix(mat);
    }

    static void printGraph_AdjList(ArrayList<LinkedList<Integer>> list){
        int x = 1;
        for(var l : list){
            System.out.print(x++);
            for(Integer i : l){
                System.out.print("->"+i);
            }
            System.out.println();
        }
    }
    static void graph_Imp_by_Array_Of_list(Scanner sc){
        System.out.print("Enter the no of nodes of graph : ");
        int n = sc.nextInt();
        System.out.print("Enter no of edges of graph : ");
        int m = sc.nextInt();
        ArrayList<LinkedList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new LinkedList<>());
        }
        for(int i=0; i<m; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            list.get(s-1).add(d);
            list.get(d-1).add(s);
        }

        printGraph_AdjList(list);
    }

    static void print_Graph_HashMap(HashMap<Integer,HashMap<Integer,Integer>> hm){

    }
    static void graph_Imp_By_HashMap(Scanner sc){
        HashMap<Integer,HashMap<Integer,Integer>> hm = new HashMap<>();
        System.out.print("Enter the no of nodes of graph : ");
        int n = sc.nextInt();
        System.out.print("Enter no of edges of graph : ");
        int m = sc.nextInt();
        for(int i=0; i<n; i++){
            hm.put(i, new HashMap<Integer,Integer>());
        }
        for(int i=0; i<m; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            hm.get(s-1).put(d,c);
            hm.get(d-1).put(s,c);
        }
        print_Graph_HashMap(hm);
    }
    static void print_Graph_HashSet(HashMap<Integer, HashSet<Integer>> hs){
        int x = 1;
        System.out.println("src  dest");
        for(var k:hs.keySet()){
            for(Integer i : hs.get(k)){
                System.out.println(x+" ---> "+i);
            }
            x++;
        }
    }
    static void graph_Imp_By_HashSet(Scanner sc){
//        below is the implementation of unweighted graph in hashset of hashmap
        HashMap<Integer, HashSet<Integer>> hs = new HashMap<>();
        System.out.print("Enter the no of nodes of graph : ");
        int n = sc.nextInt();
        System.out.print("Enter no of edges of graph : ");
        int m = sc.nextInt();
        for(int i=0; i<n; i++){
            hs.put(i, new HashSet<>());
        }

        for(int i=0; i<m; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            hs.get(s - 1).add(d);
            hs.get(d - 1).add(s);
        }
        print_Graph_HashSet(hs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        graphBy2DArray(sc);
//        graph_Imp_by_Array_Of_list(sc);
//        graph_Imp_By_HashSet(sc);
        graph_Imp_By_HashMap(sc);
        sc.close();
    }
}

//class Graph {
//    private ArrayList<LinkedList<Integer>> adjList;
//
//    public Graph(int numVertices) {
//        adjList = new ArrayList<>(numVertices);
//        for (int i = 0; i < numVertices; i++) {
//            adjList.add(new LinkedList<>());
//        }
//    }
//
//    public void addEdge(int vertex1, int vertex2) {
//        adjList.get(vertex1).add(vertex2);
//        adjList.get(vertex2).add(vertex1); // For undirected graphs
//    }
//
//    public void printGraph() {
//        for (int i = 0; i < adjList.size(); i++) {
//            System.out.print("Vertex " + i + ": ");
//            for (int j = 0; j < adjList.get(i).size(); j++) {
//                System.out.print(adjList.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//
//        graph.printGraph();
//    }
//}
/*
*
1 2 5
1 3 6
2 4 7
2 5 3
3 4 4
4 5 2
*
* */