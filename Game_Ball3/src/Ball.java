import java.awt.Graphics;
import java.awt.Color;

public class Ball
{
	public int R,G,B,Size;
	public Vector pos,vel;
	
	public Ball()  //public ball ���Polymorphism  �������ball[].R=...
	{
		R=(int)(Math.random()*255);
		G=(int)(Math.random()*255);
		B=(int)(Math.random()*255);
		Size=(int)(Math.random()*100+30);
		
		pos=new Vector((int)(Math.random()*500),(int)(Math.random()*500));
		vel=new Vector((int)(Math.random()*10-5),(int)(Math.random()*10-5));
	}
	public void move()    //����١����������ⴹ����Թ�ͺ����ͧ�繡�ҿ�ǡ����
	{
		pos =pos.add(vel);
		if(pos.x + Size> 500)
		{
			pos.x=500-Size;
			vel.x *=-1;
		}
		if(pos.x <0)
		{
			pos.x=0;
			vel.x *=-1;
		}
		if(pos.y + Size> 500)
		{
			pos.y=500-Size;
			vel.y *=-1;
		}
		if(pos.y <0)
		{
			pos.y=0;
			vel.y *=-1;
		}
	}
	public void draw(Graphics g)      //void �������ա��return��Ѻ��      ��method��診��÷ӧҹ������ѹ�ͧ
	{
		g.setColor(new Color(R,G,B,200));                       //200��ҹ��ѧ��ͤ�Ҥ������
		g.fillOval((int)(pos.x), (int)(pos.y), Size, Size);     //pos.x�ͧcast ��int �����method filloval �ѹ�Ѻ��int
	}
}
