import java.awt.*;

public class GUI implements Runnable {
    private String title;
    public GUI(String title) {
        this.title = title;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        MainForm mainForm = new MainForm(title);
        Dimension screenSize = SwingScreenUtilities.getDefaultScreenSize();
        Dimension scaledSize = SwingScreenUtilities.getScaledSize(.4,10);
        mainForm.setSize(scaledSize);
        mainForm.setLocationRelativeTo(null);
        mainForm.setVisible(true);
    }
}
