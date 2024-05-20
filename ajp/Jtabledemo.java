import javax.swing.*;

public class Jtabledemo
{
	JFrame f;
	Jtabledemo()
	{
		f= new JFrame();
		String data[][]={{"100","Amit","56565"},{"101","kishor","5454"},{"102","ram","45454"}};
		String column[]={"ID","NAME","SALARY"};
		

		JTable jt=new JTable(data,column);
		jt.setBounds(30,40,200,300);
		f.add(jt);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
	 new Jtabledemo();
	
	}
}