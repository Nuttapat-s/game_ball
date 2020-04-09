/**
 * 
 * ��͸Ժ���class���
 *
 */
public class Vector    //page 109 N1-3
{
	double x,y;
	//costrutor ��� method ����������͹class �ж١���¡�����á �������ǵ͹ new object�ҡclass
	//constuctor �������return type   ex=public ���ǡ� vector���
	public Vector()  
	{
			x=0;
			y=0;
	}
	public Vector(double x,double y)  
	{
		/////////////////////
			this.x= x;
			this.y= y;
			
	}
	public Vector add(Vector v)   //�ǡ
	{
		Vector result =new Vector();  
		result.x=this.x+v.x;
		result.y=this.y+v.y;
		return result;
	}
	public String toString()   //���¡���print c
							   //��֡�Ҥ���� tostring
	{
		return "("+x+","+y+")";
	}
	public Vector sub(Vector v)  //ź
	{
		Vector result =new Vector();  
		result.x=this.x-v.x;
		result.y=this.y-v.y;
		return result;
	}
	public Vector mul(double m)  //�ٳ���Ѿ���������vector
	{
		Vector result =new Vector();  
		result.x=this.x*m;
		result.y=this.y*m;
		return result;
	}
	public double dot(Vector v)   //�ͷ
	{
		double result =this.x*v.x+this.y*v.y;
		return result;
	}
	public double size()    //vector ��ͧ�բ�Ҵ���� 
	{
		double result =Math.sqrt(x*x +y*y);
		return result;
				
	}
	public Vector unit()  //unit vector
						  //���¡unit��������ͧ�ջ�иҹ ex a.unit();
	{
		double s=size();
		return new Vector(x/s,y/s);    //�繡��Ŵ�ٻ������ͧ�����칡���
	}
	public static void main(String args[])
	{
		Vector a=new Vector();
		a.x=3;
		a.y=4;
		Vector b=new Vector(5,7);
		Vector c;
		c =a.add(b);
		System.out.println(c.x+" "+c.y);
		System.out.println(c);
		
		Vector d;   //��¹Ẻ��ҵ�������Ѻ
		d=a.sub(b);
		System.out.println(d.x+" "+d.y);
		a.unit();
		
		Vector e;
		System.out.println(a.mul(5));  //��¹Ẻ�Ѵ
		
		System.out.println(a.dot(b));
		System.out.println(a.size());
		System.out.println(a.unit());
	}
}

	
