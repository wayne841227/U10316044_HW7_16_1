import javax.swing.*;
import java.awt.event.*;

public class MyDeck extends JFrame {

    
	



    public MyDeck() {
        // Create two buttons 
        JButton jbtRefresh = new JButton("Refresh");
    
        // Create a panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(jbtRefresh);

    	add(panel); // Add panel to the frame

        // Register listeners
        OKListenerClass listener1 = new OKListenerClass();
        jbtRefresh.addActionListener(listener1);
    }
   
    public static void main(String[] args) {
    	JFrame frame = new HandleEvent();
    	frame.setTitle("Pick Four Cards");
    	frame.setSize(600, 450);
    	frame.setLocation(300, 200);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}

class RefreshListenerClass implements ActionListener {
    @Override 
    public void actionPerformed(ActionEvent e) {
        System.out.println("Refresh button clicked");
    }
}

