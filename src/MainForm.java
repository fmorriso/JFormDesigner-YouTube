import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Dec 30 13:32:36 MST 2024
 */



/**
 * @author frede
 */
public class MainForm extends JFrame {
    public MainForm(String title) {
        super(title);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner non-commercial license
        PuzzleGridSubPanel = new JPanel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

        //======== PuzzleGridSubPanel ========
        {
            PuzzleGridSubPanel.setLayout(new GridLayout(3, 3));
        }
        contentPane.add(PuzzleGridSubPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner non-commercial license
    private JPanel PuzzleGridSubPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
