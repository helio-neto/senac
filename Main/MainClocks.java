package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import ExerciciosAula.Exe1;
import ExerciciosAula.Exe2;

public class MainClocks {
	
	private JFrame mainFrame;
	private JLabel clockLabel1;
	private JLabel clockLabel2;
	private JLabel clockLabel3;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JLabel msglabel;
	
    public static void main(String[] args) {
        new MainClocks().prepareGUI();
        
    }
    
    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(5, 1));
        
       
        clockLabel1 = new JLabel("", JLabel.CENTER);   
        //clock1Label.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 48f));
        clockLabel2 = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);    
        statusLabel.setSize(350,100);
        msglabel = new JLabel("Welcome to TutorialsPoint SWING Tutorial.", JLabel.CENTER);
        clockLabel3 = new JLabel(DateFormat.getDateTimeInstance().format(new Date()), JLabel.CENTER);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(clockLabel1);
        mainFrame.add(clockLabel2);
        mainFrame.add(clockLabel3);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        
        mainFrame.setVisible(true);  
        
        showJFrameDemo();
     }
    private void showJFrameDemo(){
    	
        final JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());       
        frame.add(msglabel);
        
		new Thread(new ClockThread(clockLabel1, 100)).start();
		new Thread(new ClockThread(clockLabel2, 200)).start();
		new Thread(new ClockThread(clockLabel3, 300)).start();
       
        JButton okButton = new JButton("Open a Frame");
        okButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              statusLabel.setText("A Frame shown to the user.");
              frame.setVisible(true);
           }
        });
        controlPanel.add(okButton);
        mainFrame.setVisible(true);  
     }
    
    class ClockThread implements Runnable{
    	
    	private JLabel lbl;
    	private String outputClock = "";
    	private int sleepTime, countClock = 0;
        public ClockThread(JLabel lbl, int sleepTime) {
    		this.lbl = lbl;
    		this.sleepTime = sleepTime;
    	}

    	@Override
        public void run() {
    		while(true){
    			try {
                	System.out.println(lbl.getText());
                	lbl.setText(outputClock+countClock);
                	
                    Thread.sleep(sleepTime);
                    countClock++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Exe1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    	}                		
     }
    
        
}


