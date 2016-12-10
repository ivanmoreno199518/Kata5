package moneyCalculator.ui.swing;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneyCalculator.ui.moneyDisplay;

public class SwingMoneyDisplay extends JPanel implements moneyDisplay{

    public SwingMoneyDisplay() {
        setLayout(new FlowLayout());
        add(amount());
        add(currency());
    }

    private JLabel amount() {
        JLabel label = new JLabel("500");
        return label;
    }

    private JLabel currency() {
        JLabel label = new JLabel("$");
        return label;
    }
}