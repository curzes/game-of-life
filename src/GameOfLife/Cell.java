package GameOfLife;

public class Cell {

	private int cellIndex;
	private boolean alive = false;
	
	public Cell(int bordIndex){
		cellIndex = bordIndex;
	}

	public boolean GetAlive(){
		return alive;
	}
	
	public int GetCellIndex(){
		return cellIndex;
	}
	
	public void SetAlive(boolean value){
		alive = value;
	}
}
