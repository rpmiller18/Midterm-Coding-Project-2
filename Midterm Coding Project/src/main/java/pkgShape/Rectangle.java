package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
	private int iWidth;
	private int iLength;
	public Rectangle(int iWidth, int iLength)
	{
		if (iWidth >0 && iLength > 0)
		{
			this.iWidth = iWidth;
			this.iLength = iLength;
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	public int getWidth() 
	{
		return iWidth;
	}
	public int getLength() 
	{
		return iLength;
	}
	public void setWidth(int width)
	{
		iWidth = width;
	}
	public void setLength(int length)
	{
		iLength = length;
	}
	@Override
	public double area()
	{
		return iWidth*iLength;
	}
	@Override
	public double perimeter()
	{
		return (iLength*2)+(iWidth*2);
	}
	
	public int compareTo(Object obj) 
	{
		int compareObj = (int) ((Rectangle)obj).area();
		return (int) (this.area()-compareObj);
	}
	
}

