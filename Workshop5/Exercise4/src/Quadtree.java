/**
 * 
 */

/**
 * @author acb131
 *
 */
public class Quadtree 
{
	private int value;
	Quadtree lu;
	Quadtree ll;
	Quadtree ru;
	Quadtree rl;
	
	public Quadtree(int value)
	{
		this.setValue(value);
	}
	
	public Quadtree(Quadtree lu, Quadtree ll,Quadtree ru, Quadtree rl)
	{
		this.lu=lu;
		this.ll=ll;
		this.ru=ru;
		this.rl=rl;
	}
	

	/**
	 * @return the lu
	 */
	public Quadtree getLu() {
		return lu;
	}

	/**
	 * @param lu the lu to set
	 */
	public void setLu(Quadtree lu) {
		this.lu = lu;
	}

	/**
	 * @return the ll
	 */
	public Quadtree getLl() {
		return ll;
	}

	/**
	 * @param ll the ll to set
	 */
	public void setLl(Quadtree ll) {
		this.ll = ll;
	}

	/**
	 * @return the ru
	 */
	public Quadtree getRu() {
		return ru;
	}

	/**
	 * @param ru the ru to set
	 */
	public void setRu(Quadtree ru) {
		this.ru = ru;
	}

	/**
	 * @return the rl
	 */
	public Quadtree getRl() {
		return rl;
	}

	/**
	 * @param rl the rl to set
	 */
	public void setRl(Quadtree rl) {
		this.rl = rl;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
	
	public Quadtree rotateQuadtree(Quadtree initial)
	{
		Quadtree finalQuadtree=new Quadtree(initial.getRu(), initial.getLu(), initial.getRl(), initial.getLl() ); //creates a new quadtree rotated by 90 degrees anti-clockwise. 
		return finalQuadtree;
	} 	//this method rotates a quadtree but it won't do it entirely -each sub quadtree will not be rotated. Not entirely sure what the best way to do this is probably some sort of recursive method.
	
}
