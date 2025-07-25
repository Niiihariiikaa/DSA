import java.util.*;

public class allpaths {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

    }

    public static void allpaths(ArrayList<Edge> graph[], int V, int curr, int tar, String path){

       
        boolean vis[]= new boolean[V];
       if (curr==tar){
            System.out.println(path);
            return;
        }
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                allpaths(graph, V, e.dest, tar, path+e.dest+" ");
            }
        }
        vis[curr]=false; // backtrack
            
        

    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        bfs(graph, V);
        //neighbours of vertex 2
        /*for(int i=0; i<graph[2].size(); i++){
            Edge e= graph[2].get(i);
            System.out.println(e.dest);  
        }

        // print the graph
       /*  for (int i=0; i<graph.length; i++){
            System.out.print("Vertex "+i+"->");
            for (int j=0; j<graph[i].size(); j++){
                Edge e=graph[i].get(j);
                System.out.print("("+e.src+","+e.dest+")");
            }
            System.out.println();
        }
    }*/
    }
    
    
}
