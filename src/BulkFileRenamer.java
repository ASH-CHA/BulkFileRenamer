import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

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

    public static void main(String[] args) {
        
    }
}