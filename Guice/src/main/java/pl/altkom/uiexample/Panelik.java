package pl.altkom.uiexample;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.google.inject.Inject;

public class Panelik extends JPanel {

	@Inject
	public Panelik(JButton button, JButton guzik, JLabel label, Sluchacz s) {
		super();	
		button.setText("Przycisk 1");
                guzik.setText("Guzik");
		label.setText("Etykieta");
//		button.addActionListener(new AbstractAction("name of button") {
//		    public void actionPerformed(ActionEvent e) {
//		        System.exit(0);
//		    }
//		});
		button.addActionListener(s);
                guzik.addActionListener(s);
		this.add(button);
                this.add(guzik);
		this.add(label);
	}
}
