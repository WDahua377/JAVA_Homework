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
import java.security.KeyException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.util.HashMap;
import java.util.Map;

public class TypingTutor_ver2 extends JFrame implements KeyListener{

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

    public TypingTutor_ver2(){

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
        addKey(keyMap, keyPanel, "~", 35, 0, 45, 45);
        // keyMap.put('~', new JButton ("~"));
        // keyMap.get('~').setBounds(35, 0, 45, 45);
        // keyPanel.add(keyMap.get('~'));
        addKey(keyMap, keyPanel, "1", 85, 0, 45, 45);
        addKey(keyMap, keyPanel, "2", 135, 0, 45, 45);
        addKey(keyMap, keyPanel, "3", 185, 0, 45, 45);
        addKey(keyMap, keyPanel, "4", 235, 0, 45, 45);
        addKey(keyMap, keyPanel, "5", 285, 0, 45, 45);
        addKey(keyMap, keyPanel, "6", 335, 0, 45, 45);
        addKey(keyMap, keyPanel, "7", 385, 0, 45, 45);
        addKey(keyMap, keyPanel, "8", 435, 0, 45, 45);
        addKey(keyMap, keyPanel, "9", 485, 0, 45, 45);
        addKey(keyMap, keyPanel, "0", 535, 0, 45, 45);
        addKey(keyMap, keyPanel, "-", 585, 0, 45, 45);
        addKey(keyMap, keyPanel, "+", 635, 0, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_BACK_SPACE, "Backspace", 685, 0, 100, 45);
        // backspace = new JButton("Backspace");
        // backspace.setBounds(685, 0, 100, 45);
        // keyPanel.add(backspace);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_TAB, "Tab", 35, 50, 70, 45);
        addKey(keyMap, keyPanel, "Q", 110, 50, 45, 45);
        addKey(keyMap, keyPanel, "W", 160, 50, 45, 45);
        addKey(keyMap, keyPanel, "E", 210, 50, 45, 45);
        addKey(keyMap, keyPanel, "R", 260, 50, 45, 45);
        addKey(keyMap, keyPanel, "T", 310, 50, 45, 45);
        addKey(keyMap, keyPanel, "Y", 360, 50, 45, 45);
        addKey(keyMap, keyPanel, "U", 410, 50, 45, 45);
        addKey(keyMap, keyPanel, "I", 460, 50, 45, 45);
        addKey(keyMap, keyPanel, "O", 510, 50, 45, 45);
        addKey(keyMap, keyPanel, "P", 560, 50, 45, 45);
        addKey(keyMap, keyPanel, "[", 610, 50, 45, 45);
        addKey(keyMap, keyPanel, "]", 660, 50, 45, 45);
        addKey(keyMap, keyPanel, "\\", 710, 50, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_CAPS_LOCK, "Caps", 35, 100, 70, 45);
        addKey(keyMap, keyPanel, "A", 110, 100, 45, 45);
        addKey(keyMap, keyPanel, "S", 160, 100, 45, 45);
        addKey(keyMap, keyPanel, "D", 210, 100, 45, 45);
        addKey(keyMap, keyPanel, "F", 260, 100, 45, 45);
        addKey(keyMap, keyPanel, "G", 310, 100, 45, 45);
        addKey(keyMap, keyPanel, "H", 360, 100, 45, 45);
        addKey(keyMap, keyPanel, "J", 410, 100, 45, 45);
        addKey(keyMap, keyPanel, "K", 460, 100, 45, 45);
        addKey(keyMap, keyPanel, "L", 510, 100, 45, 45);
        addKey(keyMap, keyPanel, ":", 560, 100, 45, 45);
        addKey(keyMap, keyPanel, "\"", 610, 100, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_ENTER, "Enter", 660, 100, 95, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_SHIFT, "Shift", 35, 150, 45, 45);
        addKey(keyMap, keyPanel, "Z", 135, 150, 45, 45);
        addKey(keyMap, keyPanel, "X", 185, 150, 45, 45);
        addKey(keyMap, keyPanel, "C", 235, 150, 45, 45);
        addKey(keyMap, keyPanel, "V", 285, 150, 45, 45);
        addKey(keyMap, keyPanel, "B", 335, 150, 45, 45);
        addKey(keyMap, keyPanel, "N", 385, 150, 45, 45);
        addKey(keyMap, keyPanel, "M", 435, 150, 45, 45);
        addKey(keyMap, keyPanel, ",", 485, 150, 45, 45);
        addKey(keyMap, keyPanel, ".", 535, 150, 45, 45);
        addKey(keyMap, keyPanel, "?", 585, 150, 45, 45);
        addKey(keyMap, keyPanel, " ", 230, 200, 305, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_UP, "^", 660, 150, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_LEFT, "<", 610, 200, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_DOWN, "v", 660, 200, 45, 45);
        addKey(speicalKeyMap, keyPanel, KeyEvent.VK_RIGHT, ">", 710, 200, 45, 45);

        textarea.addKeyListener(this);
    }

    public void addKey(Map<Character, JButton> map ,JPanel panel,char[] chars, String label, int x, int y, int w, int h){
        char c = label.charAt(0);
        map.put(c, new JButton(label));
        map.get(label).setBounds(x, y, w, h);
        panel.add(map.get(label));
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
        if(event.getKeyChar() != KeyEvent.CHAR_UNDEFINED){
            btn = keyMap.get(event.getKeyChar());
        }else{
            btn = speicalKeyMap.get(event.getKeyCode());
        }
        btn.setBackground(textarea.getBackground());


        switch(event.getKeyChar()){
            case '~':
            case '`':
                tilde.setBackground(textarea.getBackground());
                break;
            case '1':
            case '!':
                one.setBackground(textarea.getBackground());
                break;
            case '2':
            case '@':
                two.setBackground(textarea.getBackground());
                break;
            case '3':
            case '#':
                three.setBackground(textarea.getBackground());
                break;
            case '4':
            case '$':
                four.setBackground(textarea.getBackground());
                break;
            case '5':
            case '%':
                five.setBackground(textarea.getBackground());
                break;
            case '6':
            case '^':
                six.setBackground(textarea.getBackground());
                break;
            case '7':
            case '&':
                seven.setBackground(textarea.getBackground());
                break;
            case '8':
            case '*':
                eight.setBackground(textarea.getBackground());
                break;
            case '9':
            case '(':
                nine.setBackground(textarea.getBackground());
                break;
            case '0':
            case ')':
                zero.setBackground(textarea.getBackground());
                break;
            case '-':
            case '_':
                dash.setBackground(textarea.getBackground());
                break;
            case '+':
            case '=':
                plus.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_BACK_SPACE:
                backspace.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_TAB:
                tab.setBackground(textarea.getBackground());
                break;
            case 'Q':
            case 'q':
                Q.setBackground(textarea.getBackground());
                break;
            case 'W':
            case 'w':
                W.setBackground(textarea.getBackground());
                break;
            case 'E':
            case 'e':
                E.setBackground(textarea.getBackground());
                break;
            case 'R':
            case 'r':
                R.setBackground(textarea.getBackground());
                break;
            case 'T':
            case 't':
                T.setBackground(textarea.getBackground());
                break;
            case 'Y':
            case 'y':
                Y.setBackground(textarea.getBackground());
                break;
            case 'U':
            case 'u':
                U.setBackground(textarea.getBackground());
                break;
            case 'I':
            case 'i':
                I.setBackground(textarea.getBackground());
                break;
            case 'O':
            case 'o':
                O.setBackground(textarea.getBackground());
                break;
            case 'P':
            case 'p':
                P.setBackground(textarea.getBackground());
                break;
            case '[':
            case '{':
                lbracket.setBackground(textarea.getBackground());
                break;
            case ']':
            case '}':
                rbracket.setBackground(textarea.getBackground());
                break;
            case '\\':
            case '|':
                backslash.setBackground(textarea.getBackground());
                break;
            case 'A':
            case 'a':
                A.setBackground(textarea.getBackground());
                break;
            case 'S':
            case 's':
                S.setBackground(textarea.getBackground());
                break;
            case 'D':
            case 'd':
                D.setBackground(textarea.getBackground());
                break;
            case 'F':
            case 'f':
                F.setBackground(textarea.getBackground());
                break;
            case 'G':
            case 'g':
                G.setBackground(textarea.getBackground());
                break;
            case 'H':
            case 'h':
                H.setBackground(textarea.getBackground());
                break;
            case 'J':
            case 'j':
                J.setBackground(textarea.getBackground());
                break;
            case 'K':
            case 'k':
                K.setBackground(textarea.getBackground());
                break;
            case 'L':
            case 'l':
                L.setBackground(textarea.getBackground());
                break;
            case ':':
            case ';':
                colon.setBackground(textarea.getBackground());
                break;
            case '\"':
            case '\'':
                quote.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_ENTER:
                enter.setBackground(textarea.getBackground());
                break;
            case 'Z':
            case 'z':
                Z.setBackground(textarea.getBackground());
                break;
            case 'X':
            case 'x':
                X.setBackground(textarea.getBackground());
                break;
            case 'C':
            case 'c':
                C.setBackground(textarea.getBackground());
                break;
            case 'V':
            case 'v':
                V.setBackground(textarea.getBackground());
                break;
            case 'B':
            case 'b':
                B.setBackground(textarea.getBackground());
                break;
            case 'N':
            case 'n':
                N.setBackground(textarea.getBackground());
                break;
            case 'M':
            case 'm':
                M.setBackground(textarea.getBackground());
                break;
            case ',':
            case '<':
                comma.setBackground(textarea.getBackground());
                break;
            case '.':
            case '>':
                dot.setBackground(textarea.getBackground());
                break;
            case '?':
            case '/':
                question.setBackground(textarea.getBackground());
                break;
            case ' ':
                space.setBackground(textarea.getBackground());
                break;
        }

        switch(event.getKeyCode()){
            case KeyEvent.VK_CAPS_LOCK:
                caps.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_SHIFT:
                shift.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_UP:
                up.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_DOWN:
                down.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_LEFT:
                left.setBackground(textarea.getBackground());
                break;
            case KeyEvent.VK_RIGHT:
                right.setBackground(textarea.getBackground());
                break;
        }
    }

    public void keyTyped(KeyEvent event){
        switch(event.getKeyChar()){
            case '~':
            case '`':
                tilde.setBackground(Color.GRAY);
                break;
            case '1':
            case '!':
                one.setBackground(Color.GRAY);
                break;
            case '2':
            case '@':
                two.setBackground(Color.GRAY);
                break;
            case '3':
            case '#':
                three.setBackground(Color.GRAY);
                break;
            case '4':
            case '$':
                four.setBackground(Color.GRAY);
                break;
            case '5':
            case '%':
                five.setBackground(Color.GRAY);
                break;
            case '6':
            case '^':
                six.setBackground(Color.GRAY);
                break;
            case '7':
            case '&':
                seven.setBackground(Color.GRAY);
                break;
            case '8':
            case '*':
                eight.setBackground(Color.GRAY);
                break;
            case '9':
            case '(':
                nine.setBackground(Color.GRAY);
                break;
            case '0':
            case ')':
                zero.setBackground(Color.GRAY);
                break;
            case '-':
            case '_':
                dash.setBackground(Color.GRAY);
                break;
            case '+':
            case '=':
                plus.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_BACK_SPACE:
                backspace.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_TAB:
                tab.setBackground(Color.GRAY);
                break;
            case 'Q':
            case 'q':
                Q.setBackground(Color.GRAY);
                break;
            case 'W':
            case 'w':
                W.setBackground(Color.GRAY);
                break;
            case 'E':
            case 'e':
                E.setBackground(Color.GRAY);
                break;
            case 'R':
            case 'r':
                R.setBackground(Color.GRAY);
                break;
            case 'T':
            case 't':
                T.setBackground(Color.GRAY);
                break;
            case 'Y':
            case 'y':
                Y.setBackground(Color.GRAY);
                break;
            case 'U':
            case 'u':
                U.setBackground(Color.GRAY);
                break;
            case 'I':
            case 'i':
                I.setBackground(Color.GRAY);
                break;
            case 'O':
            case 'o':
                O.setBackground(Color.GRAY);
                break;
            case 'P':
            case 'p':
                P.setBackground(Color.GRAY);
                break;
            case '[':
            case '{':
                lbracket.setBackground(Color.GRAY);
                break;
            case ']':
            case '}':
                rbracket.setBackground(Color.GRAY);
                break;
            case '\\':
            case '|':
                backslash.setBackground(Color.GRAY);
                break;
            case 'A':
            case 'a':
                A.setBackground(Color.GRAY);
                break;
            case 'S':
            case 's':
                S.setBackground(Color.GRAY);
                break;
            case 'D':
            case 'd':
                D.setBackground(Color.GRAY);
                break;
            case 'F':
            case 'f':
                F.setBackground(Color.GRAY);
                break;
            case 'G':
            case 'g':
                G.setBackground(Color.GRAY);
                break;
            case 'H':
            case 'h':
                H.setBackground(Color.GRAY);
                break;
            case 'J':
            case 'j':
                J.setBackground(Color.GRAY);
                break;
            case 'K':
            case 'k':
                K.setBackground(Color.GRAY);
                break;
            case 'L':
            case 'l':
                L.setBackground(Color.GRAY);
                break;
            case ':':
            case ';':
                colon.setBackground(Color.GRAY);
                break;
            case '\"':
            case '\'':
                quote.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_ENTER:
                enter.setBackground(Color.GRAY);
                break;
            case 'Z':
            case 'z':
                Z.setBackground(Color.GRAY);
                break;
            case 'X':
            case 'x':
                X.setBackground(Color.GRAY);
                break;
            case 'C':
            case 'c':
                C.setBackground(Color.GRAY);
                break;
            case 'V':
            case 'v':
                V.setBackground(Color.GRAY);
                break;
            case 'B':
            case 'b':
                B.setBackground(Color.GRAY);
                break;
            case 'N':
            case 'n':
                N.setBackground(Color.GRAY);
                break;
            case 'M':
            case 'm':
                M.setBackground(Color.GRAY);
                break;
            case ',':
            case '<':
                comma.setBackground(Color.GRAY);
                break;
            case '.':
            case '>':
                dot.setBackground(Color.GRAY);
                break;
            case '?':
            case '/':
                question.setBackground(Color.GRAY);
                break;
            case ' ':
                space.setBackground(Color.GRAY);
                break;
        }
    }

    public static void main(String[] args){
        TypingTutor app = new TypingTutor();
        app.setVisible(true);
    }
}