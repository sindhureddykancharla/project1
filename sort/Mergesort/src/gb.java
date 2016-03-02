
public class gb 
{
private char [][] theBoard;
public gb()
{
	this.theBoard= new char[3][3];
}
private void clearBoar()
{
	for(int i=0; i<this.theBoard.length;i++)
	{
		for(int j=0;j<this.theBoard[i].length;j++) 
		{
			this.theBoard[i][j]='-';
		}
	}
}
public void display()
{
	for(int i=0; i<this.theBoard.length;i++)
	{
		for(int j=0;j<this.theBoard[i].length;j++) 
		{
			System.out.println(this.theBoard[i][j]);
		}
	}
}
}
