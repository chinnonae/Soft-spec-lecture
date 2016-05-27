import javax.swing.JButton;
import javax.swing.JTextField;

public class DarkComponentFactory implements ComponentFactory {

	@Override
	public JButton createButton(String msg) {
		return new DarkButton(msg);
	}

	@Override
	public JTextField createJTextField() {
		// TODO Auto-generated method stub
		return null;
	}

}
