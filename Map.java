
import java.util.Arrays;
import java.util.ArrayList;

public class Map {

	private int[][] map;
	private int count;
	private int z;


	public Map(int count,int z){//count how many image inside the game,nĞĞnÁĞ
		map = MapCreation.getMap(z);//gain array of z rows z coloumns
		this.count = count;
		this.z = z;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getN() {
		return z;
	}

	public void setN(int k) {
		this.z = k;
	}

	public int[][] getMap(){

		ArrayList<Integer> maplist = new ArrayList<Integer>();

		for(int i=0;i<z*z/10;i++){
			for(int j=0;j<count;j++){
			maplist.add(j);
			}
		}

	for(int i=0;i<z;i++){
		for(int j=0;j<z;j++){
			int	index = (int) (Math.random()*maplist.size());//get one image id from list randomly,add that image into array and delete it from list.
			map[i][j] = maplist.get(index);
			maplist.remove(index);
		}
	}

	return map;

	}


	public int[][] getResetMap(){

		ArrayList<Integer> maplist = new ArrayList<Integer>();

		for(int i=0;i<z;i++){
			for(int j=0;j<z;j++){
				if(map[i][j]!=-1)
					maplist.add(map[i][j]);
				map[i][j]=-1;
			}
		}

		//mess up left image
		while(!maplist.isEmpty()){

			int	index = (int) (Math.random()*maplist.size());
			boolean state = false;

			while(!state){
				int i = (int) (Math.random()*z);
				int j = (int) (Math.random()*z);
				if(map[i][j]==-1){//if there is no image in that position
					map[i][j] = maplist.get(index);
					maplist.remove(index);
					state = true;
				}
			}

		}

		return map;

	}


}
