package GameOfLife;

public class Program {

	public final static int width = 20;
	public final static int height = 18;
	private Display display;
	private Cell[] cells;
	
	
	public Program(){
		cells = new Cell[width * height];
		display = new Display(width, height);
		CreateCells();
		Play();
	}
	
	public void Play(){
		while(display.IsCommunityAlive(cells)){
			display.Draw(cells);
			cells = Krishna.Judge(cells);
		}
	}
	
	public void CreateCells(){
		
		for(int i=0; i < cells.length; i++){
			cells[i] = new Cell(i);
		}
	}

	public static void main(String[] args) {
		new Program();
	}

}
