//importing swing library and action listener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SandwichGUI{

  private JFrame frame = new JFrame("Sandwich shop"); //creating new instance of the JFrame object
  private JTabbedPane tabs = new JTabbedPane();
  private JPanel panel = new JPanel(null);
 	private String[] lblBreadChoice_data = {"Option1", "Option2", "Option3"};
	private JComboBox<String> lblBreadChoice = new JComboBox<>(lblBreadChoice_data);
	private JLabel lblChooseBreadLabel = new JLabel();
  private JButton continueButton = new JButton();

  public static void main(String[] args){
    SandwichGUI instance = new SandwichGUI();
    instance.start();
  }

  public void start(){
    this.initFrame();
  }

  public void initFrame(){
    //initialises the frame
    this.frame.setSize(700, 400);
    this.setLocationRelativeTo(frame, Toolkit.getDefaultToolkit().getScreenSize()); //sets frame location relative to screen size (center location)
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setLayout(new GridLayout(1,1));

    this.initPanel();

        
		this.tabs.add("My Created Tab", this.panel);
		this.tabs.add("Fake Panel 2", new JPanel());
		this.tabs.add("Fake Panel 3", new JPanel());
		this.tabs.add("Fake Panel 4", new JPanel());
		this.tabs.add("Fake Panel 5", new JPanel());
		
		this.frame.add(this.tabs);
		this.frame.setVisible(true);
  }

  public void setLocationRelativeTo(Component componet, Dimension relativeTo){
    Dimension componentSize = componet.getSize();
    componet.setLocation((int) relativeTo.getWidth() / 2 - (int) componentSize.getWidth() / 2, (int) relativeTo.getHeight() / 2 - (int) componentSize.getHeight() / 2);
  }
    
  public void setLocationRelativeTo(Component componet, Dimension relativeTo, int offsetX, int offsetY){
    Dimension componentSize = componet.getSize();
    componet.setLocation((int) relativeTo.getWidth() / 2 - (int) componentSize.getWidth() / 2 - offsetX, (int) relativeTo.getHeight() / 2 - (int) componentSize.getHeight() / 2 - offsetY);
  }
  
  public void initPanel(){
    this.lblBreadChoice.setLocation(270,176);
    this.lblBreadChoice.setSize(120,50);
    this.lblBreadChoice.setForeground(new Color(-16750849));
    this.lblBreadChoice.setBackground(new Color(-13108));
    this.lblBreadChoice.setEditable(false);
    this.panel.add(this.lblBreadChoice);

    this.lblChooseBreadLabel.setLocation(232,113);
    this.lblChooseBreadLabel.setSize(185,30);
    this.lblChooseBreadLabel.setOpaque(true);
    this.lblChooseBreadLabel.setBackground(new Color(-1));
    this.lblChooseBreadLabel.setText("Chose the type of bread you want");
    this.panel.add(this.lblChooseBreadLabel);

    this.continueButton.setLocation(574,307);
    this.continueButton.setSize(100,50);
    this.continueButton.addActionListener(e->continueButton_Click());
    this.continueButton.setText("Continue");
    this.panel.add(this.continueButton);
  }

  public void continueButton_Click(){
		System.out.println("continueButton_Click() has been pressed ");
	}
}