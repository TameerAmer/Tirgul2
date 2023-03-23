import java.util.ArrayList;

/**This class is the shared data
 * @author Asus
 *
 */
public class SharedData 
{
	/**Class variables
	 * @author Asus
	 * 
	 */
	private ArrayList<Integer> array = new ArrayList<>();
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** Constructor
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return boolean array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**Setter
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**get
	 * @return arraylist
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**get
	 * @return integer
	 */
	public int getB() 
	{
		return b;
	}

	/**get
	 * @return boolean
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**set
	 * @param flag 
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
