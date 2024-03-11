//package GuiLearningBlueJ;

//importing swing library
import javax.swing.*;

//importing action listener
import java.awt.*;
import java.awt.event.*;

public class TestProgram{
  
    private JFrame frame = new JFrame("Не вирус (не точно)"); //creating new instance of the JFrame object
    private JPanel panel = new JPanel(null); //creating new instance of JPanel object
    private JButton onButton = new JButton("On"); //creating new instance of JButton for on button
    private JButton offButton = new JButton("Off"); //creating new instance of JButton for off button
    private JLabel label = new JLabel(); //creating new JLabel instance for displaying the current state of the lightbulb
    
    public static void main(String[] args){
        TestProgram instance = new TestProgram();
        instance.start();
    }
    
    /**
     * First function that is called inside the class
     */
    public void start(){
        this.init();
        this.frame.setVisible(true);
    }
    
    public void setEnabled(boolean value){
        if(value){
            this.label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("on.jpg"))));
        }else{
            this.label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("off.jpg"))));
        }
    }
    
    public void setLocationRelativeTo(Component componet, Dimension relativeTo){
        Dimension componentSize = componet.getSize();
        componet.setLocation((int) relativeTo.getWidth() / 2 - (int) componentSize.getWidth() / 2, (int) relativeTo.getHeight() / 2 - (int) componentSize.getHeight() / 2);
    }
    
    public void setLocationRelativeTo(Component componet, Dimension relativeTo, int offsetX, int offsetY){
        Dimension componentSize = componet.getSize();
        componet.setLocation((int) relativeTo.getWidth() / 2 - (int) componentSize.getWidth() / 2 - offsetX, (int) relativeTo.getHeight() / 2 - (int) componentSize.getHeight() / 2 - offsetY);
    }
    
    /**
     * Initialise all the components of the GUI and event listeners
     */
    public void init(){
        //initialises the frame
        this.frame.setSize((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
        this.setLocationRelativeTo(frame, Toolkit.getDefaultToolkit().getScreenSize()); //sets frame location relative to screen size (center location)
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(new GridLayout(1,1));
        
        //initialises the label and adds it to the panel
        //initialises the label and adds it to the panel
        this.label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("off.jpg"))));
        this.label.setSize(100, 161);
        this.setLocationRelativeTo(label, frame.getSize(), 0, 50); //sets label location to center of frame +50 pixels in y direction
        this.panel.add(this.label);
        
        //initialises the on button and adds it to the panel
        this.onButton.setSize(100, 50);
        this.setLocationRelativeTo(onButton, frame.getSize(), -100, -50); //sets button location to center of frame -100 pixels in x direction and -20 pixels in y direction
        this.onButton.addActionListener(AL->onSwitchOnClick());
        this.panel.add(this.onButton);
        
        //initialises the off button and adds it to the panel
        this.offButton.setSize(100, 50);
        this.setLocationRelativeTo(offButton, frame.getSize(), 100, -50); //sets button location to center of frame +100 pixels in x direction and -20 pixels in y direction
        this.offButton.addActionListener(AL->onSwitchOffClick());
        this.panel.add(this.offButton);
        
        this.frame.add(this.panel); //adds the panel to the frame
    }
    
    /**
     * Called when off button is pressed
     * Updates the text and the state of the lightbulb
     */
    public void onSwitchOffClick(){
        this.setEnabled(false);
    }
    
    /**
     * Called when on button is pressed
     * Updates the text and the state of the lightbulb
     */
    public void onSwitchOnClick(){
        this.setEnabled(true);
    }
}
