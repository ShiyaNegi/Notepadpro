import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class notepadpro extends JFrame {
    public void display(){
        setTitle("Notepadpro");

        JMenuBar menubar=new JMenuBar();
        menubar.setBackground(Color.white);

        JMenu file=new JMenu("File");
        file.setFont(new Font("AERIAL",Font.PLAIN,14));

        JMenuItem newdoc=new JMenuItem("New");
        newdoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));


        JMenuItem open=new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        JMenuItem save =new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        JMenuItem close=new JMenuItem("close");
        close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, ActionEvent.CTRL_MASK));



        file.add(newdoc);
        file.add(open);
        file.add(save);
        file.add(close);

        menubar.add(file);
        JMenu edit=new JMenu("Edit");
        edit.setFont(new Font("AERIAL",Font.PLAIN,14));

        JMenuItem copy=new JMenuItem("copy");
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

        JMenuItem cut=new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        JMenuItem paste =new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        JMenuItem selectall=new JMenuItem("SELECT ALL");
        close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, ActionEvent.CTRL_MASK));

        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(selectall);

        menubar.add(edit);

        JMenu helpmenu=new JMenu("Help");
        helpmenu.setFont(new Font("AERIAL",Font.PLAIN,14));

        JMenuItem help=new JMenuItem("Help");
        help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        menubar.add(helpmenu);

        setJMenuBar(menubar);
       JTextArea area=new JTextArea();
        area.setFont(new Font("SAN_SERI",Font.PLAIN,18));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        add(area);

        JScrollPane pane=new JScrollPane(area);
        add(pane);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }



    public static void main(String[] args) {
        notepadpro project= new notepadpro() {
        };
        project.display();
    }
}
