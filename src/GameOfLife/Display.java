package GameOfLife;

public class Display {

	private int width;
	
	public Display(int width, int height){
		this.width = width;
	}
	
	public boolean IsCommunityAlive(Cell[] cells){
		for(Cell c : cells){
			if(c.GetAlive()){
				return true;
			}
		}
		return false;
	}
	
	public void Draw(Cell[] cells){
		
		for(int i=0; i<cells.length; i++){
			if(i % width == 0){
				System.out.print("\n");
			}
			System.out.print( WriteCell(cells[i]) );
		}
		System.out.print("\n");
	}
	
	public String WriteCell(Cell cell){
		if(cell.GetAlive()){
			return "X";
		}
		else{
			return ".";
		}
	}
}
