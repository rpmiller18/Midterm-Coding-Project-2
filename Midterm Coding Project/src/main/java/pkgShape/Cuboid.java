package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDepth;
	public Cuboid(int iWidth, int iLength, int iDepth)
	{
		super(iWidth, iLength);
		if (iDepth > 0)
		{
			this.iDepth = iDepth;
		}
		else
		{
			throw new IllegalArgumentException();
		}
		
	}
		
	public int getDepth() 
	{
		return iDepth;
	}

	public void setDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume()
	{
		return super.area()*iDepth;
	}
	
	@Override
	public double area()
	{
		return super.area()*6;
	}
	
	@Override
	public double perimeter()
	{
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int compareTo(Object obj) {
		int compareObj = (int) ((Cuboid)obj).area();
		return (int) (this.area()-compareObj);
	}
	

	class SortByArea implements Comparator<Cuboid>
	{
		@Override
		public int compare(Cuboid a, Cuboid b) 
		{
			
			return (int) (a.volume() - b.volume());
		}	
	}
	
	class SortByVolume implements Comparator<Cuboid>
	{
		@Override
		public int compare(Cuboid a, Cuboid b) 
		{
			return (int) (a.area() - b.area());
		}	
	}
	
}