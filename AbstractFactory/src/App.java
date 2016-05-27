import javax.swing.JFrame;

public class App extends JFrame{

	public App() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LightButton("LightButton"));
		pack();
		setVisible(true);
	}
	
	public ComponentFactory getFactory(String name){
		if(name.equalsIgnoreCase("light")){
			return new LightComponentFactory();
		}else if(name.equalsIgnoreCase("dark")){
			return new DarkComponentFactory();
		} else {
			return null;
		}
	}
	
	public static void main(String[]args){
		App app = new App();
	}
}
