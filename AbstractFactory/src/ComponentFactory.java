import javax.swing.JButton;
import javax.swing.JTextField;

public interface ComponentFactory {

	public JButton createButton(String msg);
	public JTextField createJTextField();
	
}
