/*
 * Healthcare Managment System.
 * 
 */
package PatientPages;

/**
 *
 * @author Vishal
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.sql.*;

import javax.swing.border.*;
public class swing_sample extends JFrame
{
	JFrame jf;
	JPanel p1;
	JPanel p0[];
	JLabel l1;
	JButton b[];
	handler handle;
	ResultSet [] rs;
public swing_sample(ResultSet...as)
	{
	rs=new ResultSet[2];
	rs[0]=as[0];//rs[0] for personal data
	rs[1]=as[1];//rs[1] for view records
	handle=new handler();
		p0=new JPanel[4];
		b=new JButton[4];
		l1=new JLabel("ELECTRONIC HEALTH RECORD");
			l1.setForeground(Color.BLUE);
			l1.setFont(l1.getFont().deriveFont(30.0f));
			b[0]=new JButton("Personal Info");
			b[0].setBounds(30,30,30,30);
			b[0].setBackground(Color.WHITE);
		                b[0].setBorder(new LineBorder(Color.RED));
				b[0].setFont(b[0].getFont().deriveFont(18.0f));
					b[0].setPreferredSize(new Dimension(200,60));
					p0[0]=new JPanel();
p0[0].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[0].setBackground(Color.WHITE);					
p0[0].add(b[0]);
		b[1]=new JButton("View_Records");
		b[1].setBackground(Color.WHITE);
		b[1].setFont(b[1].getFont().deriveFont(20.0f));
		b[1].setPreferredSize(new Dimension(200,60));
                b[1].setBorder(new LineBorder(Color.RED));
		p0[1]=new JPanel();
		p0[1].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[1].setBackground(Color.WHITE);
		p0[1].add(b[1]);
		b[2]=new JButton("Find a Doctor");
		b[2].setBackground(Color.WHITE);
		b[2].setPreferredSize(new Dimension(200,60));
	        b[2].setBorder(new LineBorder(Color.BLUE));
		b[2].setFont(b[2].getFont().deriveFont(16.0f));
		p0[2]=new JPanel();
		p0[2].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[2].setBackground(Color.WHITE);
		p0[2].add(b[2]);
		b[3]=new JButton("Sign_Out");
		b[3].setBorder(new LineBorder(Color.BLUE));
		b[3].setFont(b[3].getFont().deriveFont(13.5f));
		b[3].setBackground(Color.WHITE);
		b[3].setPreferredSize(new Dimension(200,60));		
	        p0[3]=new JPanel();
		p0[3].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[3].setBackground(Color.WHITE);
		p0[3].add(b[3]);
		p1=new JPanel();
		p1.setLayout(new GridLayout(4,2,0,0));
		
		JPanel title,name=new JPanel();
		title=new JPanel();
		title.setBackground(new Color(0,200,200));
		name.setBackground(new Color(0,200,200));
		name.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		title.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		title.add(l1);
		p1.add(title);
	
		try
		{
		 JLabel l2=new JLabel(rs[0].getString(2));
		 l2.setForeground(Color.BLUE);
			l2.setFont(l1.getFont().deriveFont(30.0f));
			name.add(l2);
		}catch(Exception e){System.out.println("SQL except in name");}
		
		p1.add(name);
		setTitle("EHR");
	for(int i=0;i<p0.length;i++)
	{
		p0[i].setBackground(new Color(0,200,200));
		b[i].addActionListener(handle);
	}
		p1.add(p0[0]);
		p1.add(p0[1]);
	        p1.add(p0[2]);
	        p1.add(p0[3]);
		setLayout(new BorderLayout());
		setBackground(Color.white);
		setVisible(true);
//fs.setRes,izable(false);
setSize(800,800);
//fs.setExtendedState(JFrame.MAXIMIZED_BOTH);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p1.setBackground(new Color(0,200,200));
	add(p1,"Center");
	
	 
	}
public void buildPER()
{
	 jf=new JFrame("Personal Info");
	jf.setSize(800, 800);
	jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   JPanel []c;
	   JButton button;
	    JLabel t_name,t_ht,t_user,t_wt;
	     JLabel t_pass;
	   JLabel l_name,l_pass,l_user,l_ht,l_wt,l_gender,t_gender;
	   jf.setLayout(new GridLayout(8,1));
       c=new JPanel[16];
       for(int i=0;i<16;i++)
       {
       	c[i]=new JPanel();
       c[i].setLayout(new FlowLayout(FlowLayout.CENTER));
       c[i].setBackground(new Color(0,200,200));
       }
       button=new JButton("Update");
       button.setBackground(Color.GREEN);
       Border border=new LineBorder(Color.RED);
       button.setBorder(border);
button.setFont(button.getFont().deriveFont(14.0f));
	button.setPreferredSize(new Dimension(200,60));
       //adding actionlistener to the button
       button.addActionListener(handle);
       
       l_name=new JLabel("Name:");
       l_pass=new JLabel("Password:");
       l_user=new JLabel("User Name:");
       l_ht=new JLabel("Height:");
       l_wt=new JLabel("Weight:");
       l_gender=new JLabel("Gender:");
       t_gender=new JLabel(" ");
       l_name.setForeground(Color.BLACK);
		l_name.setFont(l_name.getFont().deriveFont(15.2f));
		 l_pass.setForeground(Color.BLACK);
		 
			l_pass.setFont(l_pass.getFont().deriveFont(15.2f));
			l_user.setForeground(Color.BLACK);
			l_user.setFont(l_name.getFont().deriveFont(15.2f));
			 l_ht.setForeground(Color.BLACK);
				l_ht.setFont(l_ht.getFont().deriveFont(15.2f));
				 l_wt.setForeground(Color.BLACK);
					l_wt.setFont(l_wt.getFont().deriveFont(15.3f));
					 l_gender.setForeground(Color.BLACK);
						l_gender.setFont(l_gender.getFont().deriveFont(15.2f));
						 t_gender.setForeground(Color.RED);
							t_gender.setFont(t_gender.getFont().deriveFont(15.2f));
						
       try
       {
       t_name=new JLabel(rs[0].getString(2));
       t_user=new JLabel(rs[0].getString(1));
        t_ht=new JLabel(rs[0].getString(3));
       t_wt=new JLabel(rs[0].getString(4));
        t_pass=new JLabel(rs[0].getString(6));
       
        if(rs[0].getString(5).equals("M"))
        {
        	t_gender.setText("Male");
        }
        else
        {
        	t_gender.setText("Female");
        }
        JLabel title1=new JLabel("Personal");
        JLabel title2=new JLabel("Info");
        title1.setForeground(Color.WHITE);
		title1.setFont(title1.getFont().deriveFont(25.2f));
		title2.setForeground(Color.WHITE);
		title2.setFont(title2.getFont().deriveFont(25.2f));
        c[0].add(title1);
        c[1].add(title2);
 
        c[2].add(l_name);
        c[3].add(t_name);
        c[4].add(l_pass);
        c[5].add(t_pass);
       c[6].add(l_user);
       c[7].add(t_user);
       c[8].add(l_ht);
        c[9].add(t_ht);
        c[10].add(l_wt);
        c[11].add(t_wt);
        c[12].add(l_gender);
        c[13].add(t_gender);
        c[14].add(button);
       
        for(int i=0;i<16;i++)
        {
        	jf.add(c[i]);
        }
        //visual
        jf.setVisible(true);
       }
       catch(Exception e){System.out.println("Build PINfo error");}
       jf.setBackground(new Color(0,200,200));
	
}
public void viewRec()
{
	 jf=new JFrame("Rec Info");
		jf.setSize(800, 800);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   JPanel []c;
		   jf.setLayout(new GridLayout(5,1));
	       c=new JPanel[10];
	       for(int i=0;i<10;i++)
	       {
	       	c[i]=new JPanel();
	       c[i].setLayout(new FlowLayout(FlowLayout.CENTER));
	       c[i].setBackground(new Color(0,200,200));
	       }
	
	 JLabel l[]=new JLabel[4];
	 for(int i=0;i<4;i++)
	 {
		 l[i]=new JLabel(" ");
	 }
	 JLabel t[]=new JLabel[5];
	 for(int i=0;i<4;i++)
	 {
		 t[i]=new JLabel(" ");
	 }
	 for(int i=0;i<4;i++)
	 {
		 t[i].setFont(t[i].getFont().deriveFont(17.2f));
			t[i].setForeground(Color.RED);

			 l[i].setFont(t[i].getFont().deriveFont(14.2f));
				l[i].setForeground(Color.BLACK);
	 }
	try {
		
		  if(rs[1].next()==false)
		  {
			  l[0].setText("Empty");
		  }
		  while(rs[1].next())
		  {
			  l[0].setText("DocName:");
			  t[0].setText(rs[1].getString(2));
			  l[1].setText("Date:");
			  t[1].setText(rs[1].getString(3));
			  l[2].setText("Problem:");
			  t[2].setText(rs[1].getString(5));
			  l[3].setText("Prescription:");
			  t[3].setText(rs[1].getString(4));
			
			 //System.out.println("UserName:\t"+rs[1].getString(1)+"\n"+"Prescription:\t"+rs[1].getString(2)+"\n"+"DATE:\t"+rs[1].getString(3)+"\n"+"Problem:\t"+rs[1].getString(4)+"\n\n\n");
		}
		  
		  } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	 JLabel title1=new JLabel("Patient");
     JLabel title2=new JLabel("Records");
     title1.setForeground(Color.WHITE);
		title1.setFont(title1.getFont().deriveFont(25.2f));
		title2.setForeground(Color.WHITE);
		title2.setFont(title2.getFont().deriveFont(25.2f));
     c[0].add(title1);
     c[1].add(title2);
	 for(int i=0,p=2;p<8;p++,i++)
	 {
		 c[p].add(l[i]);
		 p++;
		 c[p].add(t[i]);
	 }
	 for(int i=0;i<10;i++)
     {
     	jf.add(c[i]);
     }
}

class handler implements ActionListener
{

    //This is triggered whenever the user clicks the login button
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getActionCommand()=="Personal Info")
    	{
    		
    		buildPER();
    	}
    	else if(ae.getActionCommand()=="Sign_Out")
    	{
    		new PatientLOG();
    		dispose();
    	}
    	else if(ae.getActionCommand()=="View_Records")
    	{
    		viewRec();
    	}
    	else if(ae.getActionCommand()=="Update")
    	{
    		new UpdateInfo(rs[0],jf);
    	}
    	else
    	{
    		//Find a doc under development
    	}
    	
    }
}
}
