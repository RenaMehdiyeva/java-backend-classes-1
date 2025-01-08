package az.edu.turing.module01.AdvancedLevel;

public class DijkstraAlgorithm {

    public static int[] dijkstra(int[][] graph, int startNode) {
        int n = graph.length;
        int[] distances = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        distances[startNode] = 0;

        for (int count = 0; count < n; count++) {
            int u = -1;
            for (int i = 0; i < n; i++) {
                if (!visited[i] && (u == -1 || distances[i] < distances[u])) {
                    u = i;
                }
            }
            if (distances[u] == Integer.MAX_VALUE) break;
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (graph[u][v] != Integer.MAX_VALUE && !visited[v]) {
                    int newDist = distances[u] + graph[u][v];
                    if (newDist < distances[v]) {
                        distances[v] = newDist;
                    }
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 1, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 1},
                {Integer.MAX_VALUE, 2, 0, 5},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };
        int startNode = 0;
        int[] distances = dijkstra(graph, startNode);

        for (int i = 0; i < distances.length; i++) {
            System.out.println("Node " + i + ": " + (distances[i] == Integer.MAX_VALUE ? "Unreachable" : distances[i]));
        }
    }
}

