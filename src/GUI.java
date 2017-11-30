/**
 * Created by vrasa on 11/30/2017.
 */
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.*;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.FontFamilyAction;
import javax.swing.*;
import java.util.*;


public class GUI {

    private JFrame frame;
    private JTextPane editor;
    private JComboBox<String> fontSizeComboBox;
    private JComboBox<String> fontFamilyComboBox;

    private static final String MAIN_TITLE = "RTPL Editor";
    private static final String DEFAULT_FONT_FAMILY = "Droid Sans Mono";
    private static final int DEFAULT_FONT_SIZE = 18;
    private static final String [] FONT_SIZES  = {"Font Size", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30"};
    private static final List<String> FONT_LIST = Arrays.asList(new String [] {"Arial", "Calibri", "Cambria", "Courier New", "Comic Sans MS", "Dialog", "Georgia", "Helevetica", "Lucida Sans", "Monospaced", "Tahoma", "Times New Roman", "Verdana"});

    public GUI(){
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
        editor = new JTextPane();

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
        Vector<String> returnList = new Vector<>();

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

            fontSizeComboBox.setAction(new FontSizeAction(fontSizeStr, newFontSize));
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

            String fontFamily = (String) e.getItem();
            fontFamilyComboBox.setAction(new FontFamilyAction(fontFamily, fontFamily));
            fontFamilyComboBox.setSelectedIndex(0);
            editor.requestFocusInWindow();
        }
    }

    private class EvaluateButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("YOOHAHAHA");
        }
    }

}