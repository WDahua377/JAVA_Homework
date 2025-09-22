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

public class TypingTutor extends JFrame implements KeyListener{

    public static JButton tilde;
    public static JButton one;
    public static JButton two;
    public static JButton three;
    public static JButton four;
    public static JButton five;
    public static JButton six;
    public static JButton seven;
    public static JButton eight;
    public static JButton nine;
    public static JButton zero;
    public static JButton dash;
    public static JButton plus;
    public static JButton backspace;
    public static JButton tab;
    public static JButton Q;
    public static JButton W;
    public static JButton E;
    public static JButton R;
    public static JButton T;
    public static JButton Y;
    public static JButton U;
    public static JButton I;
    public static JButton O;
    public static JButton P;
    public static JButton lbracket;
    public static JButton rbracket;
    public static JButton backslash;
    public static JButton caps;
    public static JButton A;
    public static JButton S;
    public static JButton D;
    public static JButton F;
    public static JButton G;
    public static JButton H;
    public static JButton J;
    public static JButton K;
    public static JButton L;
    public static JButton colon;
    public static JButton quote;
    public static JButton enter;
    public static JButton shift;
    public static JButton Z;
    public static JButton X;
    public static JButton C;
    public static JButton V;
    public static JButton B;
    public static JButton N;
    public static JButton M;
    public static JButton comma;
    public static JButton dot;
    public static JButton question;
    public static JButton up;
    public static JButton down;
    public static JButton left;
    public static JButton right;
    public static JButton space;
    public static JLabel label;
    public static JTextArea textarea;

    public TypingTutor(){

        super("Typing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        tilde = new JButton("~");
        tilde.setBounds(35, 0, 45, 45);
        keyPanel.add(tilde);
        one = new JButton("1");
        one.setBounds(85, 0, 45, 45);
        keyPanel.add(one);
        two = new JButton("2");
        two.setBounds(135, 0, 45, 45);
        keyPanel.add(two);
        three = new JButton("3");
        three.setBounds(185, 0, 45, 45);
        keyPanel.add(three);
        four = new JButton("4");
        four.setBounds(235, 0, 45, 45);
        keyPanel.add(four);
        five = new JButton("5");
        five.setBounds(285, 0, 45, 45);
        keyPanel.add(five);
        six = new JButton("6");
        six.setBounds(335, 0, 45, 45);
        keyPanel.add(six);
        seven = new JButton("7");
        seven.setBounds(385, 0, 45, 45);
        keyPanel.add(seven);
        eight = new JButton("8");
        eight.setBounds(435, 0, 45, 45);
        keyPanel.add(eight);
        nine = new JButton("9");
        nine.setBounds(485, 0, 45, 45);
        keyPanel.add(nine);
        zero = new JButton("0");
        zero.setBounds(535, 0, 45, 45);
        keyPanel.add(zero);
        dash = new JButton("-");
        dash.setBounds(585, 0, 45, 45);
        keyPanel.add(dash);
        plus = new JButton("+");
        plus.setBounds(635, 0, 45, 45);
        keyPanel.add(plus);
        backspace = new JButton("Baskspace");
        backspace.setBounds(685, 0, 100, 45);
        keyPanel.add(backspace);
        tab = new JButton("Tab");
        tab.setBounds(35, 50, 70, 45);
        keyPanel.add(tab);
        Q = new JButton("Q");
        Q.setBounds(110, 50, 45, 45);
        keyPanel.add(Q);
        W = new JButton("W");
        W.setBounds(160, 50, 45, 45);
        keyPanel.add(W);
        E = new JButton("E");
        E.setBounds(210, 50, 45, 45);
        keyPanel.add(E);
        R = new JButton("R");
        R.setBounds(260, 50, 45, 45);
        keyPanel.add(R);
        T = new JButton("T");
        T.setBounds(310, 50, 45, 45);
        keyPanel.add(T);
        Y = new JButton("Y");
        Y.setBounds(360, 50, 45, 45);
        keyPanel.add(Y);
        U = new JButton("U");
        U.setBounds(410, 50, 45, 45);
        keyPanel.add(U);
        I = new JButton("I");
        I.setBounds(460, 50, 45, 45);
        keyPanel.add(I);
        O = new JButton("O");
        O.setBounds(510, 50, 45, 45);
        keyPanel.add(O);
        P = new JButton("P");
        P.setBounds(560, 50, 45, 45);
        keyPanel.add(P);
        lbracket = new JButton("[");
        lbracket.setBounds(610, 50, 45, 45);
        keyPanel.add(lbracket);
        rbracket = new JButton("]");
        rbracket.setBounds(660, 50, 45, 45);
        keyPanel.add(rbracket);
        backslash = new JButton("\\");
        backslash.setBounds(710, 50, 45, 45);
        keyPanel.add(backslash);
        caps = new JButton("Caps");
        caps.setBounds(35, 100, 70, 45);
        keyPanel.add(caps);
        A = new JButton("A");
        A.setBounds(110, 100, 45, 45);
        keyPanel.add(A);
        S = new JButton("S");
        S.setBounds(160, 100, 45, 45);
        keyPanel.add(S);
        D = new JButton("D");
        D.setBounds(210, 100, 45, 45);
        keyPanel.add(D);
        F = new JButton("F");
        F.setBounds(260, 100, 45, 45);
        keyPanel.add(F);
        G = new JButton("G");
        G.setBounds(310, 100, 45, 45);
        keyPanel.add(G);
        H = new JButton("H");
        H.setBounds(360, 100, 45, 45);
        keyPanel.add(H);
        J = new JButton("J");
        J.setBounds(410, 100, 45, 45);
        keyPanel.add(J);
        K = new JButton("K");
        K.setBounds(460, 100, 45, 45);
        keyPanel.add(K);
        L = new JButton("L");
        L.setBounds(510, 100, 45, 45);
        keyPanel.add(L);
        colon = new JButton(":");
        colon.setBounds(560, 100, 45, 45);
        keyPanel.add(colon);
        quote = new JButton("\"");
        quote.setBounds(610, 100, 45, 45);
        keyPanel.add(quote);
        enter = new JButton("Enter");
        enter.setBounds(660, 100, 95, 45);
        keyPanel.add(enter);
        shift = new JButton("Shift");
        shift.setBounds(35, 150, 95, 45);
        keyPanel.add(shift);
        Z = new JButton("Z");
        Z.setBounds(135, 150, 45, 45);
        keyPanel.add(Z);
        X = new JButton("X");
        X.setBounds(185, 150, 45, 45);
        keyPanel.add(X);
        C = new JButton("C");
        C.setBounds(235, 150, 45, 45);
        keyPanel.add(C);
        V = new JButton("V");
        V.setBounds(285, 150, 45, 45);
        keyPanel.add(V);
        B = new JButton("B");
        B.setBounds(335, 150, 45, 45);
        keyPanel.add(B);
        N = new JButton("N");
        N.setBounds(385, 150, 45, 45);
        keyPanel.add(N);
        M = new JButton("M");
        M.setBounds(435, 150, 45, 45);
        keyPanel.add(M);
        comma = new JButton(",");
        comma.setBounds(485, 150, 45, 45);
        keyPanel.add(comma);
        dot = new JButton(",");
        dot.setBounds(535, 150, 45, 45);
        keyPanel.add(dot);
        question = new JButton("?");
        question.setBounds(585, 150, 45, 45);
        keyPanel.add(question);
        up = new JButton("^");
        up.setBounds(660, 150, 45, 45);
        keyPanel.add(up);
        space = new JButton();
        space.setBounds(230, 200, 305, 45);
        keyPanel.add(space);
        left = new JButton("<");
        left.setBounds(610, 200, 45, 45);
        keyPanel.add(left);
        down = new JButton("v");
        down.setBounds(660, 200, 45, 45);
        keyPanel.add(down);
        right = new JButton(">");
        right.setBounds(710, 200, 45, 45);
        keyPanel.add(right);


        textarea.addKeyListener(this);
        setSize(820, 550);
        // pack();

    }

    // function key
    public void keyPressed(KeyEvent event){
        switch(event.getKeyCode()){
            case KeyEvent.VK_CAPS_LOCK:
                caps.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_UP:
                up.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_DOWN:
                down.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_LEFT:
                left.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_RIGHT:
                right.setBackground(Color.GRAY);
                break;
            case KeyEvent.VK_SHIFT:
                shift.setBackground(Color.GRAY);
                break;
        }
    }

    public void keyReleased(KeyEvent event){
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