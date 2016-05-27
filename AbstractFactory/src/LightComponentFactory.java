import javax.swing.JButton;
import javax.swing.JTextField;

public class LightComponentFactory implements ComponentFactory {



	@Override
	public JButton createButton(String msg) {
		return new LightButton(msg);
	}

	@Override
	public JTextField createJTextField() {
		return null;
	}

}
