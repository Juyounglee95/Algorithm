import java.util.*;
import java.util.Queue;

public class war {
	static PriorityQueue<Node> queue;
	static int result;
	static int x[]= {1,0,-1,0}; //¿ì, »ó, ÁÂ, ÇÏ
	static int y[]= {0,1,0,-1};
	static int visited[][];
	static int arr[][];
	static int scale;
	public static void main (String [] abc) {
	Scanner sc = new Scanner(System.in);
	
	int testcase = sc.nextInt();
	System.out.println(testcase);
	for(int i=0; i< testcase; i++) {
		scale = sc.nextInt();
		
		arr= new int[scale][scale];
		visited = new int [scale][scale];
		for( int k=0; k< scale; k++) {
		String s = sc.next();
			for( int j=0; j< scale; j++) {
				arr[k][j]= s.charAt(j)-'0';
			}
		}// arr ÀÔ·Â
//		for( int k=0; k< scale; k++) {
//			for( int j=0; j< scale; j++) {
//				System.out.println(arr[k][j]);
//			}
//		}
		result =0; 
		queue = new PriorityQueue<>();
		bfs(new Node(0,0,0));
		System.out.println("#"+(i+1)+" "+result);
	}
 }
	public static void bfs(Node start) {
		visited[start.x][start.y]=1;
		queue.add(start);
		 while(!queue.isEmpty()) {
			 Node cur = queue.poll();
			 int curx = cur.x;
			 int cury = cur.y;
			 if(cury == scale -1 && curx == scale-1) {
				 result = cur.cost;
				 return;
			 }
			 
			 for( int i =0; i<4; i++) { //»óÇÏÁÂ¿ì Å½»ö
				 int nx = curx + x[i];
				 int ny = cury+y[i];
				 if(ny<0||nx<0||ny>scale-1|| nx>scale-1) {
					 continue;
					 
				 }
				 if(visited[nx][ny]==0) {
					 visited[nx][ny]=1;
					 queue.add(new Node(nx, ny, cur.cost+arr[nx][ny]));
				 }
			 }
		 }
	}
}
class Node implements Comparable<Node>{
	int x, y, cost;
	Node(int x, int y, int cost){
		this.x = x;
		this.y= y;
		this.cost= cost;
		
	}
	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub
		return cost- node.cost;
		
	}
	
}
