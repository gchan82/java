import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guiWithJFrame extends JFrame{
    private JLabel item1;
    public guiWithJFrame(){
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("This is gonna show up on hover");
        add(item1);
    }
}
