import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListnerExp1 extends Frame implements KeyListener, ActionListener {

    Label l;
    TextArea area;

    KeyListenerEg() {
        // Label creation
        l = new Label();
        l.setBounds(20, 50, 100, 20);

        // Text area creation
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);

        area.addKeyListener(this);

        add(l);
        add(area);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void keyTyped(KeyEvent var1) {
        l.setText("Key typed");
    }

    @Override
    public void keyPressed(KeyEvent var1) {
        l.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent var1) {
        l.setText("Key Released");
    }

    public static void main(String args[]) {
        new KeyListenerEg();
    }

    @Override
    public void actionPerformed(ActionEvent var1) {
        // No action defined
    }
}
