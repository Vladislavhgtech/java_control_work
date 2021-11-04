import static javax.swing.GroupLayout.Alignment.LEADING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class FinishFrame extends JFrame{
	FinishFrame(boolean F){
		this.setTitle("Game over");                        
		this.setResizable(false);                            
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(250, 150);                           
		this.setVisible(true);          
		this.setLocationRelativeTo(null);           
	

		String winner;
		if(F) {
			winner = "The right player won";
		}
		else {
			winner = "The left player won";
		}

		JLabel w = new JLabel(winner);
		this.add(w);
				
		
		JButton newgame = new JButton("New game");
		this.add(newgame);
				
		newgame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GameFrame frame = new GameFrame();
			}
		});
				
	
		JButton finish = new JButton("Exit");
		this.add(finish);
				
		finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	
		GroupLayout layout = new GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout); 
        layout.setAutoCreateGaps(true); 
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
        		.addGroup(layout.createParallelGroup(LEADING)
        				.addComponent(w)
        				.addComponent(newgame)
        				.addComponent(finish))
        				);
        layout.setVerticalGroup(layout.createSequentialGroup() 
        		.addComponent(w)
				.addComponent(newgame)
				.addComponent(finish)
				);
	}
}
