import java.util.*;
public class tree {
	static int node_num;
	static boolean[] visit;
	static int maxnode;
	static int maxdist;
	static  ArrayList<Node> tree[];
	public static void main(String abc[]) {
		Scanner scan = new Scanner(System.in);
		node_num = scan.nextInt();
		tree= new ArrayList[node_num];
		visit= new boolean[node_num];
		for(int i=0; i<node_num; i++) {
			tree[i]= new ArrayList<>();
			visit[i]= false;
		}
		for(int i=0; i<node_num-1; i++) {
			int t1 = scan.nextInt()-1; //parent
			int t2 = scan.nextInt()-1; //child
			int weight = scan.nextInt();
			
			tree[t1].add(new Node(t2, weight));
			tree[t2].add(new Node(t1, weight));
		}
		maxnode=0;
		maxdist =0;
		dfs(0,0);
		maxdist =0;
		visit = new boolean[node_num];
		dfs(maxnode,0);
		System.out.println(maxdist);
	}
	public static void dfs(int v, int len) {
		visit[v] = true;
		if(len>maxdist) {
			maxdist = len;
			maxnode = v;
		}
		for(Node node : tree[v]) {
			int i = node.node_num;
			int weight = node.weight;
			if(!visit[i]) {
				visit[i]=true;
				
				dfs(i, len+weight);
				visit[i]=false;
				
			}
		}
	}
	
	

}
class Node {
	int node_num, weight;
	Node(int node_num, int weight){
		this.node_num = node_num;
		this.weight = weight;
	}
}

