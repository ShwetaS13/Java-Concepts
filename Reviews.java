import javax.swing.JOptionPane;

public class MessageBox 
{
	public static void main(String args[])
	{
		String firstName;
		firstName = JOptionPane.showInputDialog("First Name");
		
		JOptionPane.showMessageDialog(null, firstName);
		System.exit(0);
	}

}
