/**
 * Created by vrasa on 11/30/2017.
 */
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.List;
/*

public class GUI {

    private JFrame frame;
    private JTextArea editor;
    private JComboBox<String> fontSizeComboBox;
    private JComboBox<String> fontFamilyComboBox;
    private File file;
    private Font font;
    private String fontFamily;
    private int fontSize;

    private static final String MAIN_TITLE = "RTPL Editor";
    private static final String DEFAULT_FONT_FAMILY = "Monospaced";
    private static final int DEFAULT_FONT_SIZE = 18;
    private static final String [] FONT_SIZES  = {"Font Size", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30"};
    private static final List<String> FONT_LIST = Arrays.asList(new String [] {"Droid Sans Mono", "Consolas", "DejaVu Sans Mono", "Fira Code", "Courier New", "Dialog Input","Monospaced"});

    public GUI(){
        fontFamily = DEFAULT_FONT_FAMILY;
        fontSize = DEFAULT_FONT_SIZE;
        try {
            createAndShowGUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createAndShowGUI() throws Exception {
        UIManager.put("TextPane.font", new Font(DEFAULT_FONT_FAMILY, Font.PLAIN, DEFAULT_FONT_SIZE));
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        frame = new JFrame();
        editor = new JTextArea();;
        JScrollPane editorScrollPane = new JScrollPane(editor);

        fontSizeComboBox = new JComboBox<String>(FONT_SIZES);
        fontSizeComboBox.setEditable(false);
        fontSizeComboBox.addItemListener(new FontSizeItemListener());

        Vector<String> editorFonts = getEditorFonts();
        editorFonts.add(0, "Font Family");
        fontFamilyComboBox = new JComboBox<String>(editorFonts);
        fontFamilyComboBox.setEditable(false);
        fontFamilyComboBox.addItemListener(new FontFamilyItemListener());

        JButton evaluateButton = new JButton();
        evaluateButton.setHideActionText(true);
        evaluateButton.setText("Evaluate");
        evaluateButton.addActionListener(new EvaluateButtonActionListener());

        JPanel panel = new JPanel(new GridLayout(1,2));
        JPanel evaluatePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel fontOptionsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        fontOptionsPanel.add(fontSizeComboBox);
        fontOptionsPanel.add(new JSeparator(SwingConstants.VERTICAL));
        fontOptionsPanel.add(fontFamilyComboBox);

        evaluatePanel.add(evaluateButton);

        panel.add(evaluatePanel);
        panel.add(fontOptionsPanel);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(editorScrollPane, BorderLayout.CENTER);

        frame.setSize(900, 500);
        frame.setLocation(150, 80);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle(MAIN_TITLE);
        editor.requestFocusInWindow();
    }

    private Vector<String> getEditorFonts() {
        String [] availableFonts =
                GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        Vector<String> returnList = new Vector<String>();
        for (String font : availableFonts) {
            if (FONT_LIST.contains(font)) {
                returnList.add(font);
            }
        }

        return returnList;
    }

    private class FontSizeItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if ((e.getStateChange() != ItemEvent.SELECTED) ||
                    (fontSizeComboBox.getSelectedIndex() == 0)) {

                return;
            }
            String fontSizeStr = (String) e.getItem();
            int newFontSize = 0;
            try {
                newFontSize = Integer.parseInt(fontSizeStr);
            }
            catch (NumberFormatException ex) {

                return;
            }
            font = new Font(fontFamily, Font.PLAIN, newFontSize);
            fontSize = newFontSize;
            editor.setFont(font);
            fontSizeComboBox.setSelectedIndex(0);
            editor.requestFocusInWindow();
        }
    }

    private class FontFamilyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if ((e.getStateChange() != ItemEvent.SELECTED) ||
                    (fontFamilyComboBox.getSelectedIndex() == 0)) {

                return;
            }
            String newFontFamily = (String) e.getItem();
            editor.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
            font = new Font(newFontFamily, Font.PLAIN, fontSize);
            fontFamily = newFontFamily;
            editor.setFont(font);
            fontFamilyComboBox.setSelectedIndex(0);
            editor.requestFocusInWindow();
        }
    }

    private class EvaluateButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(".:STATIC EVALUATION:.");
            String s = editor.getText();

            try {
                CharStream input = new ANTLRInputStream(s);
                RTPLLexer lexer=new RTPLLexer(input);
                CommonTokenStream ts=new CommonTokenStream(lexer);
                RTPLParser parser=new RTPLParser(ts);
                RTPLParser.ProgramContext program_ctx;
                program_ctx = parser.program();
            } catch (Exception ex) {ex.printStackTrace();}
            System.out.println();
        }
    }
}
*/
