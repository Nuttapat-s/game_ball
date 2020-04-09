/**
 * 
 * คำอธิบายในclassอื่น
 *
 */
public class Vector    //page 109 N1-3
{
	double x,y;
	//costrutor คือ method ที่ชื่อเหมือนclass จะถูกเรียกครั้งแรก ครั้งเดียวตอน new objectจากclass
	//constuctor จะไม่มีreturn type   ex=public แล้วก็ vectorเลย
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
	public Vector add(Vector v)   //บวก
	{
		Vector result =new Vector();  
		result.x=this.x+v.x;
		result.y=this.y+v.y;
		return result;
	}
	public String toString()   //เรียกการprint c
							   //ไปศึกษาคำว่า tostring
	{
		return "("+x+","+y+")";
	}
	public Vector sub(Vector v)  //ลบ
	{
		Vector result =new Vector();  
		result.x=this.x-v.x;
		result.y=this.y-v.y;
		return result;
	}
	public Vector mul(double m)  //คูณผลลัพท์ทั้งหมดเป็นvector
	{
		Vector result =new Vector();  
		result.x=this.x*m;
		result.y=this.y*m;
		return result;
	}
	public double dot(Vector v)   //ดอท
	{
		double result =this.x*v.x+this.y*v.y;
		return result;
	}
	public double size()    //vector ต้องมีขนาดเสมอ 
	{
		double result =Math.sqrt(x*x +y*y);
		return result;
				
	}
	public Vector unit()  //unit vector
						  //เรียกunitเฉยไม่ได้ต้องมีประธาน ex a.unit();
	{
		double s=size();
		return new Vector(x/s,y/s);    //เป็นการลดรูปโค้ดไม่ต้องรีเทิร์นก็ได้
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
		
		Vector d;   //เขียนแบบเอาตัวแปรมารับ
		d=a.sub(b);
		System.out.println(d.x+" "+d.y);
		a.unit();
		
		Vector e;
		System.out.println(a.mul(5));  //เขียนแบบลัด
		
		System.out.println(a.dot(b));
		System.out.println(a.size());
		System.out.println(a.unit());
	}
}

	
