import java.util.*;

public class wall {
	static int N;
	static int M;
	static int[][] map;
	static int dist; //�ִܰŸ�
	//static int once; //���μ� �� �ִ� Ƚ��
	static boolean [][] visit;
	static boolean [][] visit2;
	static Queue<pair> queue;
	static int [][]d;
	static int dx[] = { 0,0,1,-1 }; // ����
	static int dy[] = { 1,-1,0,0 };
	public static void main (String aaa[]) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M= scan.nextInt();
		map= new int[N][M];
		d= new int[N][M];
		queue = new LinkedList<pair>();
		
		for(int i=0; i<N; i++) {
			String tmp = scan.next();
			for(int j=0; j<M; j++) {
				
				map[i][j]= Integer.parseInt(tmp.charAt(j)+"");
			}
		}
		//System.out.println("&&&");
		visit = new boolean [N][M];
		visit2 = new boolean [N][M];
		queue.add(new pair(0,0,false));
		visit[0][0] = true;
		//dist = 1 ;
		d[0][0]=1;
		bfs(0,0);
		if(d[N-1][M-1]==0) {
			System.out.println(-1);
		}else {
		System.out.println(d[N-1][M-1]);
		}
	}
	public static void bfs(int x, int y) {
		while(!queue.isEmpty()) {
			
			if(visit[N-1][M-1]==true || visit2[N-1][M-1]==true) {
				break;
			}
			
		pair p = queue.poll();
		int nx = p.x;
		int ny= p.y;
		boolean dest = p.check;
		for(int i=0; i<4; i++) {
			int nnx = nx+dx[i];
			int nny = ny+dy[i];
			if(nnx >=0 && nny>=0 &&nnx< N && nny<M) { //�̵������ϸ�
				if(dest) { //���� �μ����� ������
					
					if(visit[nnx][nny]==false&&visit2[nnx][nny]==false&&map[nnx][nny]==0) { //���̾ƴҶ�
					  queue.add(new pair(nnx,nny,dest));
					  visit2[nnx][nny]=true;
					//System.out.println(nnx+"&"+nny);
					  //dist++;
					d[nnx][nny]= d[nx][ny]+1;
					}
				}
				else { //���� �μ����� ������
						if(visit[nnx][nny]==false) {
							if(map[nnx][nny]==0) { //���̾ƴҶ�
								queue.add(new pair(nnx, nny, dest));
//								visit[nnx][nny]= true;
//
//								  System.out.println(nnx+"&"+nny);
//								dist++;
							}
							if(map[nnx][nny]==1) { //���� ����, ���μ�
								queue.add(new pair(nnx, nny, true));
								
							}
							visit[nnx][nny]= true;
							//  System.out.println(nnx+"&"+nny);
							//dist++;

								d[nnx][nny]= d[nx][ny]+1;
						}
					
				}
			}
			
		}
			
		}
		
		
	}

}
class pair {
	int x;
	int y;
	boolean check; //���� �ν����� check 
	
	pair(int x, int y, boolean check){
		this.x = x;
		this.y = y;
		this.check = check;
	}
}
