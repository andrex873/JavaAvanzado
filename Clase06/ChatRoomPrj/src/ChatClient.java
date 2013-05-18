
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mint
 */
public class ChatClient {

    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButton;

    public ChatClient() {
        this.output = new JTextArea(10, 50);
        this.input = new JTextField(50);
        this.sendButton = new JButton("Send");
        this.quitButton = new JButton("Quit");
    }

    public void launchFrame(){
        JFrame frame = new JFrame("Chat Room");
        frame.setLayout(new BorderLayout());

        frame.add(output, BorderLayout.WEST);
        frame.add(input, BorderLayout.SOUTH);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1));
        p1.add(sendButton);
        p1.add(quitButton);

        frame.add(p1, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        
    }

    public static void main(String[] args){
        ChatClient c = new ChatClient();
        c.launchFrame();
    }
    

}
