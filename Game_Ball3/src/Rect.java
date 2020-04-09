import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Ball    //ก้อปค่าจากแม่มาคือball(ก้อปปี้ทุกอย่าง) ใช้extend เรียกว่าoverride
{
	public void draw(Graphics g)      
	{
		g.setColor(new Color(R,G,B,200));                      
		g.fillRect((int)(pos.x), (int)(pos.y), Size, Size);     
	}
}
