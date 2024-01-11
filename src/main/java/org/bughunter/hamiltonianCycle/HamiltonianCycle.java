package org.bughunter.hamiltonianCycle;

public class HamiltonianCycle {

    private int numberOfVertexes;
    private int[] hamiltonianPath;
    private  int[][] adjacencyMatrix;

    public HamiltonianCycle(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.numberOfVertexes = adjacencyMatrix[0].length;
        this.hamiltonianPath = new int[numberOfVertexes];
    }

    public void solve() {
//        we start with first vertex (with index 0)
        hamiltonianPath[0] = 0;

        if(findSolution(1)) {
            showResult();
        } else {
            System.out.println("There's no solution...");
        }
    }

    private boolean findSolution(int position) {
//        we have considered all the vertexes so end of the algorithm
        if(position == this.numberOfVertexes) {
//            there is a connection back to the first node (index 0) so the cycle exists
            if (adjacencyMatrix[hamiltonianPath[position - 1]][hamiltonianPath[0]] == 1) {
                return true;
            } else {
                return false;
            }
        }
//        try all the possible vertexes in the graph
        for(int vertexIndex = 1; vertexIndex < numberOfVertexes; ++vertexIndex) {
//            if the node is feasible then this is the next node in the Hamiltonian cycle
            if (isValid(vertexIndex, position)) {
//                we include the vertex in the hamiltonian path
                hamiltonianPath[position] = vertexIndex;

                if (findSolution(position + 1)) {
                    return true;

//                    BACKTRACK !!!
//                    here backtracking does nothing - we just consider another vertex
                }
            }
        }
//        tried all the vertexes without a success
        return false;
    }

    private boolean isValid(int vertex, int actualPosition) {
//        first criteria: whether the two nodes are connected?
        if (adjacencyMatrix[hamiltonianPath[actualPosition - 1]][vertex] == 0) {
            return false;
        }
//        second criteria: whether we have already visited this given node?
        for (int i = 0; i < actualPosition; ++i) {
            if (hamiltonianPath[i] == vertex) {
                return false;
            }
        }
        return  true;
    }

    private void showResult() {
        System.out.println("Hamiltonian cycle exist: ");

        for(int i = 0; i < hamiltonianPath.length; i++) {
            System.out.print(hamiltonianPath[i] + " - ");
        }
        System.out.print(hamiltonianPath[0]);
    }
}
