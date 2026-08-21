import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class BulkFileRenamer extends JFrame {


    // state
    private File currentDir;
    private final List<FileRow> rows = new ArrayList<>();
    private final RowTableModel tableModel = new RowTableModel();
    private final JTable table = new JTable(tableModel);

    // top bar
    private final JTextField pathField = new JTextField();
    private final JButton browseBtn = new JButton("Browse...");
    private final JButton refreshBtn = new JButton("Refresh List");

    // filter
    private final JTextField filterField = new JTextField();
    private final JCheckBox includeFoldersBox = new JCheckBox("Include subfolders' files? no", false);

    // find & replace
    private final JTextField findField = new JTextField();
    private final JTextField replaceField = new JTextField();
    private final JCheckBox regexBox = new JCheckBox("Use regex");
    private final JCheckBox matchCaseBox = new JCheckBox("Match case");

    // strip characters
    private final JSpinner removeFirstSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 999, 1));
    private final JSpinner removeLastSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 999, 1));

    // case
    private final JComboBox<String> caseBox = new JComboBox<>(new String[]{"Leave as=is", "UPPERCASE", "lowercase", "Title Case", "Sentence case"});
    
    // prefix & suffix
    private final JTextField prefixField = new JTextField();
    private final JTextField suffixField = new JTextField();
    

    public static void main(String[] args) {
        
    }
}