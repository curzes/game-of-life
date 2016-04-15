package GameOfLife;

public class Krishna {
	
	public static Cell[] Judge(Cell[] cells){
		Cell[] cellCopy = new Cell[cells.length];
		int neighbor = 0;
		int[] neighbors = new int[8];
		
		for(int i=0; i<cells.length; i++){
			neighbor = 0;
			cellCopy[i] = new Cell(i);
			
			neighbors[0] = cells[i].GetCellIndex() - Program.width - 1;
			neighbors[1] = cells[i].GetCellIndex() - Program.width;
			neighbors[2] = cells[i].GetCellIndex() - Program.width + 1;
			
			neighbors[3] = cells[i].GetCellIndex() - 1;
			neighbors[4] = cells[i].GetCellIndex() + 1;
		
			neighbors[5] = cells[i].GetCellIndex() + Program.width - 1;
			neighbors[6] = cells[i].GetCellIndex() + Program.width;
			neighbors[7] = cells[i].GetCellIndex() + Program.width + 1;
			
			for(int n : neighbors){
				if(n > 0 && n < cells.length && cells[n].GetAlive()){
					neighbor++;
				}
			}
			if(neighbor < 2 || neighbor > 3){
				cellCopy[i].SetAlive(false);
			}
			else if(neighbor == 3){
				cellCopy[i].SetAlive(true);
			}
		}
		return cellCopy;
	}
}
