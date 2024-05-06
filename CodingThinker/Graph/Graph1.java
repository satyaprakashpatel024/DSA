package CodingThinker.Graph;

import java.util.*;

public class Graph1 {
    HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    class PrimsPair{
        int s;
        int d;
        int c;
        PrimsPair(int s, int d, int c){
            this.s = s;
            this.d = d;
            this.c = c;
        }
    }
    class DijkstraPair{
        int d;
        String path;
        int c;
        public DijkstraPair(int d, String path, int c){
            this.d = d;
            this.path = path;
            this.c = c;
        }
    }
    public Graph1(int n){
        for(int i=0; i<n; i++){
            map.put(i+1, new HashMap<Integer,Integer>());
        }
    }
    public void addEdge(int s, int d,int c){
        map.get(s).put(d,c);
        map.get(d).put(s,c);
    }
    public boolean containsEdge(int s, int d){
        return map.get(s).containsKey(d);
    }
    public void removeEdge(int s, int d){
        System.out.println("deleting : "+s+" to "+d +" and vice-versa");
        map.get(s).remove(d);
        map.get(d).remove(s);
    }
    public boolean containsVertex(int x){
        return map.containsKey(x);
    }
    public void removeVertex(int s){
        System.out.println("deleting vertex : "+s);
        for(int x : map.get(s).keySet()){
            map.get(x).remove(s);
        }
        map.remove(s);
    }
    public int noOfEdges(){
        int sum=0;
        for(int i:map.keySet()){
            sum += map.get(i).size();
        }
        return sum/2;
    }

    public void display(){
        for(int x : map.keySet()){
            System.out.print(x+"-->");
            System.out.println(map.get(x));
//            for(int y : map.get(x).keySet()){
//                System.out.println(x+"-->"+y+"--"+map.get(x).get(y));
//            }
        }
    }
    public void bfsTraversal(int x){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(x);
        while(!q.isEmpty()){
            int u = q.remove();
            if(visited.contains(u)) continue;
            visited.add(u);
            System.out.println(u);
            for(int v: map.get(u).keySet()){
                if(!visited.contains(v)){
                    q.add(v);
                }
            }
        }
    }
    public boolean bfsHasPath(int s,int d){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.remove();
            if(u == d){
                return true;
            }
            if(visited.contains(u)) continue;
            visited.add(u);
            for(int v: map.get(u).keySet()){
                if(!visited.contains(v)){
                    q.add(v);
                }
            }
        }
        return false;
    }
    public boolean isCyclic(int s,int d){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(s);
        while(!q.isEmpty()){
            int u = q.remove();
            if(u == d){
                return true;
            }
            if(visited.contains(u)) continue;
            visited.add(u);
            for(int v: map.get(u).keySet()){
                if(!visited.contains(v)){
                    q.add(v);
                }
            }
        }
        return false;
    }
    public boolean hasPath(int s, int d, HashSet<Integer> visited){
        if(s==d){
            return true;
        }
        visited.add(s);
        for(int x: map.get(s).keySet()){
            if(!visited.contains(x)){
                boolean ans = hasPath(x,d,visited);
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }
    public void printMstByKruskal(int src){
        PriorityQueue<PrimsPair> q = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.c-o2.c;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        for(int x: map.get(src).keySet()){
            q.add(new PrimsPair(src,x,map.get(src).get(x)));
        }
        while(!q.isEmpty()){
            PrimsPair x = q.remove();
            if(visited.contains(x.d)){
                continue;
            }
            visited.add(x.d);
            System.out.println(x.d+" via "+x.s+" @ "+x.c);
            for(int y: map.get(x.d).keySet()){
                if(!visited.contains(y)){
                    q.add(new PrimsPair(x.d,y,map.get(x.d).get(y)));
                }
            }
        }
    }
    public void printMstByPrims(int src){
        PriorityQueue<PrimsPair> q = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.c-o2.c;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
//        adding first member
        q.add(new PrimsPair(src,src,0));
//        iterating over queue
        while(!q.isEmpty()){
//            removing element from queue
            PrimsPair x = q.remove();
//            ignoring element if visited
            if(visited.contains(x.d)){
                continue;
            }
//            marking visited
            visited.add(x.d);
//            doing own work
            System.out.println(x.d+" via "+x.s+" @ "+x.c);
//            adding to queue if not already visited
            for(int y: map.get(x.d).keySet()){
                if(!visited.contains(y)){
                    q.add(new PrimsPair(x.d,y,map.get(x.d).get(y)));
                }
            }
        }
    }

    public void dijkastraAlgorithm(int src){
        PriorityQueue<DijkstraPair> q = new PriorityQueue<DijkstraPair>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(new DijkstraPair(src,src+"",0));
        while(!q.isEmpty()){
            DijkstraPair x = q.remove();
            if(visited.contains(x.d)){
                continue;
            }
            visited.add(x.d);
            System.out.println(x.d+" via "+x.path+" @ "+x.c);
            for(int y: map.get(x.d).keySet()){
                if(!visited.contains(y)){

                }
            }
        }
    }
    public static void main(String[] args) {
        Graph1 g = new Graph1(7);
        g.addEdge(1,2,5);
        g.addEdge(1,3,6);
        g.addEdge(2,4,4);
        g.addEdge(2,5,3);
        g.addEdge(3,4,6);
        g.addEdge(5,6,2);
        g.addEdge(5,7,5);
        g.addEdge(6,7,4);
//        g.display();
        System.out.println("MST by prims algorithm : ");
        g.printMstByPrims(1);
//        g.removeEdge(2,3);
//        g.display();
//        g.removeVertex(4);
//        System.out.println();
//        g.display();
//        System.out.println(g.bfsHasPath(1,4));
//        g.bfsTraversal(1);
        System.out.println("MST by kruskal algorithm : ");
        g.printMstByKruskal(1);
    }
}
