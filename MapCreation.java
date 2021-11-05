/*
 *  ============================================================================================
 *  MapCreation.java : Create a map for gamer to play.
 *  
 *  ============================================================================================
 */
import java.util.Arrays;
import java.util.ArrayList;
public class MapCreation {

	static int[][] map;

	public MapCreation(){

	}

	public static int[][] getMap(int n){
		map = new int[n][n];


		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				map[i][j] = -1;
			}
		}

		return map;
	}

}
