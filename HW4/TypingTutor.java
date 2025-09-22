// GUI application
// display a virtual keyboard and show what users is typing on the screen
// use JButtons to represent the keys
// highlights the corresponding JButton on the GUI as users press each key
// adds the character to a JTextArea shows what users has typed so far
// to highlight a JButton, use its setBackground method to change its background

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.util.HashMap;
import java.util.Map;

public class TypingTutor extends JFrame implements KeyListener{

    // public static JButton tilde, one, two, three, four, five, six, seven, eight, nine, zero, dash, plus, backspace;
    // public static JButton tab, Q, W, E, R, T, Y, U, I, O, P, lbracket, rbracket, backslash;
    // public static JButton caps, A, S, D, F, G, H, J, K, L, colon, quote, enter;
    // public static JButton shift, Z, X, C, V, B, N, M, comma, dot, question;
    // public static JButton up, down, left, right, space;
    // public static JButton backspace, tab, caps, enter, shift;
    public static Map<Character, JButton> keyMap;
    public static Map<Integer, JButton> speicalKeyMap;
    public static JLabel label;
    public static JTextArea textarea;

    public TypingTutor(){   // constructor

        super("Typing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(820, 550);

        JPanel upPanel = new JPanel();
        JPanel keyPanel = new JPanel();
        upPanel.setLayout(null);
        keyPanel.setLayout(null);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(upPanel);
        getContentPane().add(keyPanel);

        upPanel.setPreferredSize(new Dimension(820, 250));
        label = new JLabel("<html>Type some text using your keyboard. <html>" + 
        "<html>The keys you pess will be highlighted and the text will be displayed.<html>" + 
        "<html><br/>Note: Clicking the bottons with your mouse will not perform any action.<html>");
        label.setBounds(35, 0, 820, 40);
        upPanel.add(label);
        textarea = new JTextArea();
        textarea.setBounds(35, 45, 750, 200);
        upPanel.add(textarea);
        
        keyPanel.setPreferredSize(new Dimension(820, 300));
        keyMap = new HashMap<>();
        addKey(keyMap, keyPanel, "~", 35, 0, 45, 45,'~', '`');
        addKey(keyMap, keyPanel, "1", 85, 0, 45, 45,'1', '!');
        addKey(keyMap, keyPanel, "2", 135, 0, 45, 45,'2', '@');
        addKey(keyMap, keyPanel, "3", 185, 0, 45, 45, '3', '#');
        addKey(keyMap, keyPanel, "4", 235, 0, 45, 45, '4', '$');
        addKey(keyMap, keyPanel, "5", 285, 0, 45, 45, '5', '%');
        addKey(keyMap, keyPanel, "6", 335, 0, 45, 45, '6', '^');
        addKey(keyMap, keyPanel, "7", 385, 0, 45, 45, '7', '&');
        addKey(keyMap, keyPanel, "8", 435, 0, 45, 45, '8', '*');
        addKey(keyMap, keyPanel, "9", 485, 0, 45, 45, '9', '(');
        addKey(keyMap, keyPanel, "0", 535, 0, 45, 45, '0', ')');
        addKey(keyMap, keyPanel, "-", 585, 0, 45, 45, '-', '_');
        addKey(keyMap, keyPanel, "+", 635, 0, 45, 45, '+', '=');
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_BACK_SPACE, "Backspace", 685, 0, 100, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_TAB, "Tab", 35, 50, 70, 45);
        addKey(keyMap, keyPanel, "Q", 110, 50, 45, 45, 'Q', 'q');
        addKey(keyMap, keyPanel, "W", 160, 50, 45, 45, 'W', 'w');
        addKey(keyMap, keyPanel, "E", 210, 50, 45, 45, 'E', 'e');
        addKey(keyMap, keyPanel, "R", 260, 50, 45, 45, 'R', 'r');
        addKey(keyMap, keyPanel, "T", 310, 50, 45, 45, 'T', 't');
        addKey(keyMap, keyPanel, "Y", 360, 50, 45, 45, 'Y', 'y');
        addKey(keyMap, keyPanel, "U", 410, 50, 45, 45, 'U', 'u');
        addKey(keyMap, keyPanel, "I", 460, 50, 45, 45, 'I', 'i');
        addKey(keyMap, keyPanel, "O", 510, 50, 45, 45, 'O', 'o');
        addKey(keyMap, keyPanel, "P", 560, 50, 45, 45, 'P', 'p');
        addKey(keyMap, keyPanel, "[", 610, 50, 45, 45, '[', '{');
        addKey(keyMap, keyPanel, "]", 660, 50, 45, 45, ']', '}');
        addKey(keyMap, keyPanel, "\\", 710, 50, 45, 45, '\\', '|');
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_CAPS_LOCK, "Caps", 35, 100, 70, 45);
        addKey(keyMap, keyPanel, "A", 110, 100, 45, 45, 'A', 'a');
        addKey(keyMap, keyPanel, "S", 160, 100, 45, 45, 'S', 's');
        addKey(keyMap, keyPanel, "D", 210, 100, 45, 45, 'D', 'd');
        addKey(keyMap, keyPanel, "F", 260, 100, 45, 45, 'F', 'f');
        addKey(keyMap, keyPanel, "G", 310, 100, 45, 45, 'G', 'g');
        addKey(keyMap, keyPanel, "H", 360, 100, 45, 45, 'H', 'h');
        addKey(keyMap, keyPanel, "J", 410, 100, 45, 45, 'J', 'j');
        addKey(keyMap, keyPanel, "K", 460, 100, 45, 45, 'K', 'k');
        addKey(keyMap, keyPanel, "L", 510, 100, 45, 45, 'L', 'l');
        addKey(keyMap, keyPanel, ":", 560, 100, 45, 45, ':', ';');
        addKey(keyMap, keyPanel, "\"", 610, 100, 45, 45, '\'', '\"');
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_ENTER, "Enter", 660, 100, 95, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_SHIFT, "Shift", 35, 150, 45, 45);
        addKey(keyMap, keyPanel, "Z", 135, 150, 45, 45, 'Z', 'z');
        addKey(keyMap, keyPanel, "X", 185, 150, 45, 45, 'X', 'x');
        addKey(keyMap, keyPanel, "C", 235, 150, 45, 45, 'C', 'c');
        addKey(keyMap, keyPanel, "V", 285, 150, 45, 45, 'V', 'v');
        addKey(keyMap, keyPanel, "B", 335, 150, 45, 45, 'B', 'b');
        addKey(keyMap, keyPanel, "N", 385, 150, 45, 45, 'N', 'n');
        addKey(keyMap, keyPanel, "M", 435, 150, 45, 45, 'M', 'm');
        addKey(keyMap, keyPanel, ",", 485, 150, 45, 45, ',', '<');
        addKey(keyMap, keyPanel, ".", 535, 150, 45, 45, '.', '>');
        addKey(keyMap, keyPanel, "?", 585, 150, 45, 45, '?', '/');
        addKey(keyMap, keyPanel, " ", 230, 200, 305, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_UP, "^", 660, 150, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_LEFT, "<", 610, 200, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_DOWN, "v", 660, 200, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_RIGHT, ">", 710, 200, 45, 45);

        textarea.addKeyListener(this);
    }

    public void addKey(Map<Character, JButton> map ,JPanel panel, String label, int x, int y, int w, int h, char... chars){
        JButton btn = new JButton(label);
        for(char c : chars){
            map.put(c, btn);
        }
        btn.setBounds(x, y, w, h);
        panel.add(btn);
    }

    public void addKey(Map<Integer, JButton> map, JPanel panel, int n, String label, int x, int y, int w, int h){
        map.put(n, new JButton(label));
        map.get(n).setBounds(x, y, w, h);
        panel.add(map.get(n));
    }

    // function key
    public void keyPressed(KeyEvent event){
        JButton btn = speicalKeyMap.get(event.getKeyCode());
        if(btn != null){
            btn.setBackground(Color.GRAY);
        }
    }

    public void keyReleased(KeyEvent event){
        JButton btn = null;
        if(event.getKeyChar() != KeyEvent.CHAR_UNDEFINED){  // character
            btn = keyMap.get(event.getKeyChar());
        }else{                                              // specialKey
            btn = speicalKeyMap.get(event.getKeyCode());
        }
        btn.setBackground(textarea.getBackground());
    }

    public void keyTyped(KeyEvent event){
        JButton btn = null;
        if(event.getKeyChar() != KeyEvent.CHAR_UNDEFINED){  // character
            btn = keyMap.get(event.getKeyChar());
        }else{                                              // specialKey
            btn = speicalKeyMap.get(event.getKeyCode());
        }
        btn.setBackground(Color.GRAY);
    }

    public static void main(String[] args){
        TypingTutor app = new TypingTutor();
        app.setVisible(true);
    }
}