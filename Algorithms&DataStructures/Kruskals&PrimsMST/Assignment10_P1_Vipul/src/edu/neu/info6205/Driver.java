package edu.neu.info6205;

public class Driver {

	public static void main(String[] args) {
		
		int V = 7;  
        int E = 12;
        KruskalAlgorithm kruskalsAlgorithm = new KruskalAlgorithm(V, E);
        kruskalsAlgorithm.generateGraph();
        kruskalsAlgorithm.showKruskalMST();
        
        
        PrimsAlgorithm primsAlgorithm = new PrimsAlgorithm();
        int graphMST[][] = primsAlgorithm.genearteGraph();
        primsAlgorithm.primMST(graphMST);

	}

}
