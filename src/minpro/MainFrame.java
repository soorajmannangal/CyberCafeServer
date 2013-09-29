/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Oct 10, 2011, 7:45:26 PM
 *
 */

package minpro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SUJITH_G
 */
public class MainFrame extends javax.swing.JFrame {
    //private SqlConnection MyCnnct = new SqlConnection();
    static private Connection MyCnnct = null;
    public static JButton jb;
    public static clientSystems obj = new clientSystems();
    public static JFrame j1 = new JFrame();
    public JOptionPane jopA = new JOptionPane();

    public JButton jbutoo=new JButton();
    /** Creates LogIn Dialog box **** */
    public void LogIn(){
            dlgbxLogIn.setSize(450, 230);
            dlgbxLogIn.setLocation(400, 200);
            dlgbxLogIn.setVisible(true);
            dlgbxLogIn.setAlwaysOnTop(true);
            dlgbxLogIn.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            dlgbxLogIn.setResizable(false);
            this.setEnabled(false);
    }
    
    /*-- for communicating with Server thread -----*/
    public static void addbutt()
	{
	jb=new JButton();
	pnlStatic.add(jb);
	}
    
    public MouseListener ml=new MouseListener() {

        public void mouseClicked(MouseEvent e) {
            FlagClass.conditions="reload";
        clientSystems.trackMessage();
            System.out.println("sooraj");
            // throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mousePressed(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mouseExited(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    
    public java.awt.event.WindowListener wli=new WindowListener() {

        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void windowActivated(WindowEvent e) {
      
               new loadThread().start();
            System.out.println("sooraj window");
      
            //      throw new UnsupportedOperationException("Not supported yet.");
        }

        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    
    public java.awt.event.FocusListener fl=new FocusListener() {

        public void focusGained(FocusEvent e) {
          new loadThread().start();
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void focusLost(FocusEvent e) {
           // throw new UnsupportedOperationException("Not supported yet.");
        }
    };
    
    

    public MainFrame() {
        try {
    String driverName = "oracle.jdbc.driver.OracleDriver";
    Class.forName(driverName);
     String host="localhost";
        String dbName="XE";
        int port=1521;
        String oracleURL="jdbc:oracle:thin:@"+host+":"+port+":"+dbName;
        String username="SYSTEM";
        String password="password";
        MyCnnct = DriverManager.getConnection(oracleURL,username,password);
        }catch(ClassNotFoundException clnf){
            System.out.println(clnf);
        }catch(SQLException sql1){

        }
        
        initComponents();
       
        obj.setSize(600, 600);
        //obj.add(jbutoo);
        
        //jbutoo.addMouseListener(ml);
        
       // jTabbedPane1.addMouseListener(ml);
        //jTabbedPane1.addFocusListener(fl);
        jTabbedPane1.add(obj,0);
        jTabbedPane1.setSelectedComponent(obj);
        
        jTabbedPane1.repaint();
        
        //addWindowFocusListener(wl);
        addWindowListener(wli);
        new loadThread().start();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgbxProSettings = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbbxCatgryNewPro = new javax.swing.JComboBox();
        txtbxNameNewPro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtbxDescNewPro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtbxQtyNewPro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtbxSellNewPro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtbxBuyNewPro = new javax.swing.JTextField();
        btnSubmitNewPro = new javax.swing.JButton();
        lblErrormsgNewPro = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtbxBnumNewPro = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtbxNameNewCatgry = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtbxDescNewCatgry = new javax.swing.JTextField();
        btnSubmitNewCatgry = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        dlgbxAvailStock = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        dlgbxAddToStock = new javax.swing.JDialog();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField15 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        dlgbxUserSettings = new javax.swing.JDialog();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        dlgbxLogIn = new javax.swing.JDialog();
        txtbxPassWord = new javax.swing.JPasswordField();
        txtbxUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblBillNum = new javax.swing.JLabel();
        txtbxCustName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbbxProTypeBill = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        lblAvailable = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbbxProductBill = new javax.swing.JComboBox();
        txtbxQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbxAmount = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbxDiscount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCustAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        txtbxTotal = new javax.swing.JTextField();
        btnSubmitBill = new javax.swing.JButton();
        pnlStatic = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        lblBillDate = new javax.swing.JLabel();
        lblLogedUser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        dlgbxProSettings.setTitle("Product Stettings");
        dlgbxProSettings.setBounds(new java.awt.Rectangle(50, 150, 0, 0));

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(580, 580));
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jPanel3.setPreferredSize(new java.awt.Dimension(580, 580));

        jLabel17.setText("Category :");

        jLabel18.setText("Name :");

        cmbbxCatgryNewPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtbxNameNewPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbxNameNewProKeyReleased(evt);
            }
        });

        jLabel19.setText("Description :");

        jLabel20.setText("Qty :");

        txtbxQtyNewPro.setText("1");
        txtbxQtyNewPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbxQtyNewProKeyReleased(evt);
            }
        });

        jLabel21.setText("Sell Price :");

        txtbxSellNewPro.setText("0.00");
        txtbxSellNewPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbxSellNewProKeyReleased(evt);
            }
        });

        jLabel22.setText("Buy Price :");

        txtbxBuyNewPro.setText("0.00");

        btnSubmitNewPro.setText("Submit");
        btnSubmitNewPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitNewProMouseEntered(evt);
            }
        });
        btnSubmitNewPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitNewProActionPerformed(evt);
            }
        });

        lblErrormsgNewPro.setText("  .");

        jLabel24.setText("Bill No. :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrormsgNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtbxDescNewPro)
                                        .addComponent(cmbbxCatgryNewPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtbxNameNewPro, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtbxBnumNewPro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbxBuyNewPro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbxSellNewPro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbxQtyNewPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnSubmitNewPro)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cmbbxCatgryNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtbxNameNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtbxDescNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtbxQtyNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtbxSellNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtbxBuyNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtbxBnumNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblErrormsgNewPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmitNewPro)
                .addGap(62, 62, 62))
        );

        jTabbedPane2.addTab("Add New Product         ", jPanel3);

        jLabel14.setText("Name :");

        txtbxNameNewCatgry.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtbxNameNewCatgryInputMethodTextChanged(evt);
            }
        });
        txtbxNameNewCatgry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbxNameNewCatgryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbxNameNewCatgryKeyTyped(evt);
            }
        });

        jLabel15.setText("Description :");

        btnSubmitNewCatgry.setText("Submit");
        btnSubmitNewCatgry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitNewCatgryActionPerformed(evt);
            }
        });

        jLabel16.setText("         ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmitNewCatgry)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtbxDescNewCatgry, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtbxNameNewCatgry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtbxNameNewCatgry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtbxDescNewCatgry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSubmitNewCatgry)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add New Product Category  ", jPanel4);

        javax.swing.GroupLayout dlgbxProSettingsLayout = new javax.swing.GroupLayout(dlgbxProSettings.getContentPane());
        dlgbxProSettings.getContentPane().setLayout(dlgbxProSettingsLayout);
        dlgbxProSettingsLayout.setHorizontalGroup(
            dlgbxProSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
            .addGroup(dlgbxProSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dlgbxProSettingsLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        dlgbxProSettingsLayout.setVerticalGroup(
            dlgbxProSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(dlgbxProSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dlgbxProSettingsLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        dlgbxAvailStock.setTitle("Stock Available");
        dlgbxAvailStock.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                dlgbxAvailStockWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dlgbxAvailStockWindowOpened(evt);
            }
        });

        jLabel25.setText("Product Category :");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "one" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Description", "Stock Available", "Sell Price", "Buy Price"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout dlgbxAvailStockLayout = new javax.swing.GroupLayout(dlgbxAvailStock.getContentPane());
        dlgbxAvailStock.getContentPane().setLayout(dlgbxAvailStockLayout);
        dlgbxAvailStockLayout.setHorizontalGroup(
            dlgbxAvailStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgbxAvailStockLayout.createSequentialGroup()
                .addGroup(dlgbxAvailStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgbxAvailStockLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgbxAvailStockLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        dlgbxAvailStockLayout.setVerticalGroup(
            dlgbxAvailStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgbxAvailStockLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(dlgbxAvailStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        dlgbxAddToStock.setTitle("Add to Stock");
        dlgbxAddToStock.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                dlgbxAddToStockWindowActivated(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });

        jLabel26.setText("Category :");

        jLabel27.setText("Product :");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField15.setText("1");

        jLabel28.setText("Qty :");

        jLabel29.setText("Sell Price :");

        jTextField16.setText(" 0.00");

        jLabel30.setText("Buy Price :");

        jTextField17.setText("0.00");

        jLabel31.setText("Bill No. :");

        jButton7.setText("Submit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgbxAddToStockLayout = new javax.swing.GroupLayout(dlgbxAddToStock.getContentPane());
        dlgbxAddToStock.getContentPane().setLayout(dlgbxAddToStockLayout);
        dlgbxAddToStockLayout.setHorizontalGroup(
            dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgbxAddToStockLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox5, 0, 160, Short.MAX_VALUE)
                        .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );
        dlgbxAddToStockLayout.setVerticalGroup(
            dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgbxAddToStockLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgbxAddToStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton7)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Account Settings", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Add Admin User", jPanel6);

        javax.swing.GroupLayout dlgbxUserSettingsLayout = new javax.swing.GroupLayout(dlgbxUserSettings.getContentPane());
        dlgbxUserSettings.getContentPane().setLayout(dlgbxUserSettingsLayout);
        dlgbxUserSettingsLayout.setHorizontalGroup(
            dlgbxUserSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgbxUserSettingsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        dlgbxUserSettingsLayout.setVerticalGroup(
            dlgbxUserSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgbxUserSettingsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtbxUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbxUserNameActionPerformed(evt);
            }
        });

        jLabel2.setText("LogIn");

        jLabel8.setText("UserName : ");

        jLabel10.setText("Password : ");

        jButton1.setText("LogIn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgbxLogInLayout = new javax.swing.GroupLayout(dlgbxLogIn.getContentPane());
        dlgbxLogIn.getContentPane().setLayout(dlgbxLogInLayout);
        dlgbxLogInLayout.setHorizontalGroup(
            dlgbxLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgbxLogInLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(dlgbxLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(68, 68, 68)
                .addGroup(dlgbxLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtbxUserName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbxPassWord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(92, 92, 92))
            .addGroup(dlgbxLogInLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(dlgbxLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        dlgbxLogInLayout.setVerticalGroup(
            dlgbxLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgbxLogInLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(dlgbxLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbxUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(dlgbxLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbxPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InternetCafeManagementSystem");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        jButton6.setText("LogIn");
        jButton6.setName("button1"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton6)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton6)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Internet                                  ", jPanel1);

        jPanel2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel2ComponentAdded(evt);
            }
        });

        lblBillNum.setText("Bill No. :");

        jLabel3.setText("Customer Name :");

        jLabel4.setText("Product Type:");

        cmbbxProTypeBill.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbbxProTypeBill.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbxProTypeBillItemStateChanged(evt);
            }
        });

        jLabel5.setText("Product:");

        jLabel7.setText("Rate:");

        lblRate.setText("0");

        lblAvailable.setText("0");

        jLabel9.setText("Available:");

        cmbbxProductBill.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbbxProductBill.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbxProductBillItemStateChanged(evt);
            }
        });

        txtbxQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbxQtyKeyReleased(evt);
            }
        });

        jLabel6.setText("Qty:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel11.setText("Amount :");

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No.", "Product Id", "Product Name", "Qty", "Rate", "Discount", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBill.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBillMouseClicked(evt);
            }
        });
        tblBill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblBillFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblBill);

        jLabel1.setText("Total :");

        jLabel12.setText("Discount :");

        txtbxDiscount.setText("0.00");
        txtbxDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbxDiscountKeyReleased(evt);
            }
        });

        txtCustAddress.setColumns(20);
        txtCustAddress.setRows(5);
        jScrollPane2.setViewportView(txtCustAddress);

        jLabel13.setText("Address :");

        txtbxTotal.setText("0.00");

        btnSubmitBill.setText("Submit");
        btnSubmitBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitBillActionPerformed(evt);
            }
        });

        pnlStatic.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnlStaticComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout pnlStaticLayout = new javax.swing.GroupLayout(pnlStatic);
        pnlStatic.setLayout(pnlStaticLayout);
        pnlStaticLayout.setHorizontalGroup(
            pnlStaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        pnlStaticLayout.setVerticalGroup(
            pnlStaticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblBillDate.setText("Bill Date:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlStatic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(567, 567, 567))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(566, 566, 566))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))
                                    .addComponent(lblBillNum, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtbxCustName, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtbxDiscount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(txtbxAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)
                                        .addGap(146, 146, 146))
                                    .addComponent(cmbbxProductBill, javax.swing.GroupLayout.Alignment.LEADING, 0, 205, Short.MAX_VALUE)
                                    .addComponent(cmbbxProTypeBill, javax.swing.GroupLayout.Alignment.LEADING, 0, 205, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(lblBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbxQty, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                .addGap(136, 136, 136)))
                        .addGap(166, 166, 166))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRemove)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmitBill)
                    .addComponent(txtbxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(485, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBillNum, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                            .addComponent(lblBillDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtbxCustName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cmbbxProTypeBill))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbbxProductBill)
                                .addComponent(txtbxQty)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtbxAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbxDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtbxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(btnSubmitBill))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlStatic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))))
        );

        jTabbedPane1.addTab("Sales                                      ", jPanel2);

        lblLogedUser.setText("Logged in as ");

        jMenu3.setText("Internet");

        jMenuItem6.setText("User LogIn");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setText(" Quit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Products");

        jMenuItem1.setText("Available Stock");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Add To Stock");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Settings");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Product Settings");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText(" User Settings");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(lblLogedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(641, 641, 641))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblLogedUser)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        try{
        obj.reload_icons();
        
        txtbxAmount.setEditable(false);
        txtbxTotal.setEditable(false);
        btnAdd.setEnabled(false);
        
        if(tblBill.getSelectedRow() > -1)
             btnRemove.setEnabled(true);
        if(tblBill.getSelectedRow() == -1)
            btnRemove.setEnabled(false);


        if(tblBill.getRowCount()==0)
        {
            btnSubmitBill.setEnabled(false);
        }
        cmbbxProTypeBill.removeAllItems();
        ResultSet reslt = null,s1=null;
        Object ob = new Object();
        Statement st1 = MyCnnct.createStatement();
      //---------Assign Bill Number---------- ///
        s1 = st1.executeQuery("select * from cs_flagtable");
        if(s1.next())
            lblBillNum.setText("Bill No. : "+s1.getString("BILLPREFIX")+s1.getString("BILLSTARTS"));
       
       //------Assign Bill Date ---------------------//
       Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        String dateNow = formatter.format(currentDate.getTime());
        lblBillDate.setText("Bill Date : "+dateNow);
      //-------Assign Product Category to Combobox---------//
        Statement st = MyCnnct.createStatement();
        reslt = st.executeQuery("select * from cs_category");
        while(reslt.next())
        {
            cmbbxProTypeBill.addItem(reslt.getObject("NAME"));
        }
        

        }catch(SQLException e1){
        System.out.println("SQL Error 1 "+ e1);
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        dlgbxProSettings.setSize(600, 600);
        dlgbxProSettings.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
       // System.out.println("hai");
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        dlgbxUserSettings.setSize(600, 600);
       dlgbxUserSettings.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void txtbxNameNewCatgryInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtbxNameNewCatgryInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtbxNameNewCatgryInputMethodTextChanged

    private void txtbxNameNewCatgryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbxNameNewCatgryKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtbxNameNewCatgryKeyTyped

    private void txtbxNameNewCatgryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbxNameNewCatgryKeyReleased
        // TODO add your handling code here:
        //-------Checking for Duplication in Category Name---------    //
        try{
        ResultSet s1;
        Statement st1 = MyCnnct.createStatement();
        s1 = st1.executeQuery("select * from cs_category where name='"+txtbxNameNewCatgry.getText()+"'");
        if(s1.next()==true )
        {
        jLabel16.setText("The category already exist..!");
        btnSubmitNewCatgry.setEnabled(false);
        }
        else {
        jLabel16.setText("");
        btnSubmitNewCatgry.setEnabled(true);
        }
        }catch(SQLException e1){
            System.out.println("SQL Error2 :"+e1);
        }
    }//GEN-LAST:event_txtbxNameNewCatgryKeyReleased

    private void btnSubmitNewCatgryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitNewCatgryActionPerformed
        // TODO add your handling code here:
        try{
        Statement st1 = MyCnnct.createStatement();
        ResultSet s1 = null;
        s1 = st1.executeQuery("insert into cs_category values(cat_seq.nextval,'"+txtbxNameNewCatgry.getText()+"','"+txtbxDescNewCatgry.getText()+"')");
        txtbxNameNewCatgry.setText("");
        txtbxDescNewCatgry.setText("");
        }catch(SQLException s1){
            System.out.println("Sql Error 13: " +s1);
        }

    }//GEN-LAST:event_btnSubmitNewCatgryActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
        if(txtbxNameNewPro.getText().length()==0)
            btnSubmitNewPro.setEnabled(false);
        if(txtbxNameNewCatgry.getText().length()==0)
            btnSubmitNewCatgry.setEnabled(false);
     try{
        cmbbxCatgryNewPro.removeAllItems();
        ResultSet reslt = null;
        Object ob = new Object();
        SqlConnection cnnctn = new SqlConnection();
        reslt = cnnctn.run_query("select * from cs_category");
        while(reslt.next())
        {
            ob = reslt.getString("NAME");
         cmbbxCatgryNewPro.addItem(ob);
            //System.out.println(s1.getString(1));
        }
        }catch(SQLException e1){
        System.out.println("SQL Error3 :"+ e1);
        }
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void txtbxNameNewProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbxNameNewProKeyReleased
        // TODO add your handling code here:
        try{
        Statement st1 = MyCnnct.createStatement();
        Statement st2 = MyCnnct.createStatement();
        ResultSet s1=null,s2=null;
        s2 = st1.executeQuery("select * from cs_category where name='"+cmbbxCatgryNewPro.getSelectedItem().toString()+"'") ;
        s2.next();
        
        s1 = st2.executeQuery("select * from cs_product where name='"+txtbxNameNewPro.getText()+"' and cat_id='"+s2.getString("ID")+"'");
        if(s1.next())
        {
         //System.out.println("Already exist");
         lblErrormsgNewPro.setText("The name already exist in this category..!");
         btnSubmitNewPro.setEnabled(false);
        }
        else{
        lblErrormsgNewPro.setText("");
        btnSubmitNewPro.setEnabled(true);
        }
        }catch(SQLException e1){
            System.out.println("SQL Error7 "+e1);
        }
    }//GEN-LAST:event_txtbxNameNewProKeyReleased

    private void btnSubmitNewProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitNewProActionPerformed
        // TODO add your handling code here:
if(!(txtbxSellNewPro.getText().equals("0.00")||txtbxBuyNewPro.getText().equals("0.00")))
{
        try{
        Statement st1= MyCnnct.createStatement();
        Statement st2 = MyCnnct.createStatement();
        Statement st3 = MyCnnct.createStatement();
        Statement st4 = MyCnnct.createStatement();
        ResultSet s1 = null,s2=null,s3=null,s4=null,s5=null,s6=null;
        s2 = st1.executeQuery("select * from cs_category where name='"+cmbbxCatgryNewPro.getSelectedItem().toString()+"'") ;
        s2.next();
        s3 = st2.executeQuery("select * from cs_flagtable");
        s3.next();
        s5 = st3.executeQuery("select to_char(sysdate,'DD MON YY') from dual");
        s5.next();
        //--------------Enter to th product table--------------------------//
        s1 = st4.executeQuery("insert into cs_product values(product_seq.nextval,'"+s2.getString("id")+"','"+
                txtbxNameNewPro.getText()+"','"+txtbxDescNewPro.getText()+"','"+txtbxQtyNewPro.getText()+"','"+txtbxSellNewPro.getText()+"','"+txtbxBuyNewPro.getText()+"')");
        //--------------Enter to the StockLog-------------------------------//
        s6 = st4.executeQuery("select * from cs_product where cat_id='"+s2.getString("ID")+"' and name='"+txtbxNameNewPro.getText()+"'");
        s6.next();
        s4 = st1.executeQuery("insert into cs_stocklog values(stocklog_seq.nextval,'"+s6.getString("ID")+"','"+txtbxQtyNewPro.getText()+"','"+txtbxSellNewPro.getText()+"','"+txtbxBuyNewPro.getText()
                +"','"+txtbxBnumNewPro.getText()+"','"+s5.getString(1)+"','"+s3.getString("ACTIVEUSER")+"')");
        txtbxSellNewPro.setText("");
        txtbxBuyNewPro.setText("");
        txtbxBnumNewPro.setText("");
        }catch(SQLException e1){
            System.out.println("Sql Error4 :"+e1);
        }
}else{
    lblErrormsgNewPro.setText("Fill comletely ");
}


    }//GEN-LAST:event_btnSubmitNewProActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dlgbxAvailStock.setSize(600, 400);
        dlgbxAvailStock.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void dlgbxAvailStockWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dlgbxAvailStockWindowOpened
        // TODO add your handling code here:
        
         
    }//GEN-LAST:event_dlgbxAvailStockWindowOpened

    private void dlgbxAvailStockWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dlgbxAvailStockWindowActivated
        // TODO add your handling code here:
         try{
        jComboBox4.removeAllItems();
        ResultSet reslt = null;
        Object ob = new Object();
        SqlConnection cnnctn = new SqlConnection();
        reslt = cnnctn.run_query("select * from cs_category");
        while(reslt.next())
        {
            ob = reslt.getString("NAME");
         jComboBox4.addItem(ob);
            //System.out.println(s1.getString(1));

        }

         //System.out.println(jComboBox4.getSelectedItem().toString());
        }catch(SQLException e1){
        System.out.println("SQL Error6 "+ e1);
        }

    }//GEN-LAST:event_dlgbxAvailStockWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
            
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formWindowActivated

    private void btnSubmitNewProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitNewProMouseEntered
        // TODO add your handling code here:
        if((txtbxSellNewPro.getText().equals("0.00")||txtbxBuyNewPro.getText().equals("0.00")))
        {
            btnSubmitNewPro.setEnabled(false);
            lblErrormsgNewPro.setText("Fill all the fields");
        }
    }//GEN-LAST:event_btnSubmitNewProMouseEntered

    private void dlgbxAddToStockWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dlgbxAddToStockWindowActivated
        // TODO add your handling code here:
        try{
        jComboBox5.removeAllItems();
        ResultSet reslt = null;
        Object ob = new Object();
        SqlConnection cnnctn = new SqlConnection();
        reslt = cnnctn.run_query("select * from cs_category");
        while(reslt.next())
        {
            ob = reslt.getString("NAME");
         jComboBox5.addItem(ob);
            //System.out.println(s1.getString(1));
        }
        }catch(SQLException e1){
        System.out.println("SQL Error7 :"+ e1);
        }

    }//GEN-LAST:event_dlgbxAddToStockWindowActivated

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dlgbxAddToStock.setSize(500, 400);
        dlgbxAddToStock.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        // TODO add your handling code here:
        if(!(evt.getItem().toString().equals("Item 1")))
        {
        Object ob1[] = evt.getItemSelectable().getSelectedObjects();
        if(ob1.length>0)
        {
            //System.out.println(ob1[0].toString().length());
            try{
                jComboBox6.removeAllItems();
                ResultSet reslt = null,s1=null;
                Object ob = new Object();
                SqlConnection cnnctn = new SqlConnection();
                s1=cnnctn.run_query("select * from cs_category where name='"+ob1[0].toString()+"'");
                if(s1.next())
                {
                    reslt = cnnctn.run_query("select * from cs_product where cat_id='"+s1.getString("ID")+"'");
                    while(reslt.next())
                    {
                    ob = reslt.getString("NAME");
                    jComboBox6.addItem(ob);
                    }
                }
            }catch(SQLException e1){
                System.out.println("SQL Error8 :"+ e1);
            }
            
        }//End of if(ob1.lenth..
      }

    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void cmbbxProTypeBillItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbxProTypeBillItemStateChanged
        // TODO add your handling code here:
        
        if(!(evt.getItem().toString().equals("Item 1")))
        {
        Object ob1[] = evt.getItemSelectable().getSelectedObjects();
        if(ob1.length>0)
        {
             
            try{
                try{
                cmbbxProductBill.removeAllItems();
                ResultSet reslt = null,s1=null;
                Object ob = new Object();
                //SqlConnection cnnctn = new SqlConnection();
                Statement st1 = MyCnnct.createStatement();
                Statement st2 = MyCnnct.createStatement();
                s1=st1.executeQuery("select * from cs_category where name='"+ob1[0].toString()+"'");
                if(s1.next())
                {
                    
                    reslt = st2.executeQuery("select * from cs_product where cat_id='"+s1.getString("ID")+"' and stock_available > 0");
                    while(reslt.next())
                    {
                    ob = reslt.getString("NAME");
                    cmbbxProductBill.addItem(ob);
            //System.out.println(s1.getString(1));
                    }
                }
            }catch(NullPointerException n1){

            }
                }catch(SQLException e1){
                System.out.println("SQL Error8 :"+ e1);
            }
            

        }//End of if(ob1.lenth..
      }
      
    }//GEN-LAST:event_cmbbxProTypeBillItemStateChanged

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
  if(!(evt.getItem().toString().equals("one")))
        {
        Object ob1[] = evt.getItemSelectable().getSelectedObjects();
        if(ob1.length>0)
        {
            //System.out.println(ob1[0].toString().length());
            try{
                //jComboBox6.removeAllItems();
                ResultSet reslt = null,s1=null;
                Object ob = new Object();
                //SqlConnection cnnctn = new SqlConnection();
                Statement st1 = MyCnnct.createStatement();
                Statement st2 = MyCnnct.createStatement();
                s1=st1.executeQuery("select * from cs_category where name='"+ob1[0].toString()+"'");
                if(s1.next())
                {
                String[] columnNames = {"Product_ID","Name","Description","Stock Available","Sell Price","Buy Price"};
            	Object[][] data = null;
            	DefaultTableModel m1 = new DefaultTableModel(data,columnNames);
		reslt = st2.executeQuery("select * from cs_product where cat_id='"+s1.getString("ID")+"'");
                    while(reslt.next())
                    {

                    Object[] content = {
                  reslt.getString("ID"),
                  reslt.getString("NAME"),
                  reslt.getString("DESCRIPTION"),
                  reslt.getString("STOCK_AVAILABLE"),
                  reslt.getString("SELL_PRICE"),
                  reslt.getString("BUY_PRICE")
			};
                    m1.addRow(content);
                    }
                jTable2.setModel(m1);
                }
               }catch(SQLException e1){
                System.out.println("SQL Error5 :"+ e1);
            }

        }//End of if(ob1.lenth..
      }
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(!(jTextField16.getText().equals("0.00")||jTextField17.getText().equals("0.00")))
        {
            try{
                Statement st = MyCnnct.createStatement();
                Statement st1 = MyCnnct.createStatement();
                Statement st2 = MyCnnct.createStatement();
                Statement st3 = MyCnnct.createStatement();
                ResultSet s1 = null,s2=null,s3=null,s4=null,s5=null,s6=null,s7=null;
                s2 = st.executeQuery("select * from cs_category where name='"+jComboBox5.getSelectedItem().toString()+"'") ;
                s2.next();
                s1 = st1.executeQuery("select * from cs_flagtable");
                s1.next();
                s4 = st2.executeQuery("select to_char(sysdate,'DD MON YY') from dual");
                s4.next();
                s3 = st3.executeQuery("select * from cs_product where name='"+jComboBox6.getSelectedItem().toString()+"' and cat_id='"+s2.getString("ID")+"'");
                s3.next();
                Integer a = Integer.parseInt(s3.getString("STOCK_AVAILABLE"));
                a= a + Integer.parseInt(jTextField15.getText());
                s5 = st.executeQuery("update cs_product set STOCK_AVAILABLE='"+a.toString()+"',SELL_PRICE='"+jTextField16.getText()+"',BUY_PRICE='"+jTextField17.getText()+"' where ID='"+s3.getString("ID")+"'");
                s6 = st.executeQuery("insert into cs_stocklog values(stocklog_seq.nextval,'"+s3.getString("ID")+"','"+jTextField15.getText()+"','"+jTextField16.getText()+"','"+jTextField17.getText()
                +"','"+jTextField18.getText()+"','"+s4.getString(1)+"','"+s1.getString("ACTIVEUSER")+"')");
                }catch(SQLException e1){
                System.out.println("SQL ERROr9 :"+e1);
                }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void cmbbxProductBillItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbxProductBillItemStateChanged
        // TODO add your handling code here:
        int is_inRow=-1;
        if(!(evt.getItem().toString().equals("Item 1") || cmbbxProTypeBill.getSelectedItem().toString().isEmpty() ))
        {
        Object ob1[] = evt.getItemSelectable().getSelectedObjects();
        if(ob1.length>0)
        {
            
            //System.out.println(ob1[0].toString());
            try{
    
                //SqlConnection c1 = new SqlConnection();
                Statement st1 = MyCnnct.createStatement();
                Statement st2 = MyCnnct.createStatement();
                ResultSet res1 = null,res2;
                res1 = st1.executeQuery("select * from cs_category where name='"+cmbbxProTypeBill.getSelectedItem().toString()+"'");
                if(res1.next())
                {
                res2=st2.executeQuery("select * from cs_product where name='" + ob1[0].toString()+"' and cat_id='"+res1.getString("ID")+"'");
                res2.next(); 
                Integer Stock = Integer.parseInt(res2.getString("STOCK_AVAILABLE"));
                for(int i=0;i<tblBill.getRowCount();i++)
                {
                    if(tblBill.getValueAt(i, 1).toString().equalsIgnoreCase(res2.getString("ID")))
                    {
                       is_inRow = i;
                    }
                }
                if(is_inRow > -1)
                {
                Stock = Stock - Integer.parseInt(tblBill.getValueAt(is_inRow, 3).toString());
                }
                lblRate.setText(res2.getString("SELL_PRICE"));
                lblAvailable.setText(Stock.toString());
                txtbxQty.setText("");
                txtbxAmount.setText("");
                btnAdd.setEnabled(false);
                txtbxDiscount.setText("");
                }
                }catch(NullPointerException n1){

              }catch(SQLException e1){
                System.out.println("SQl ERROR10 :"+e1);
            }
            
        }//End of if(ob1.length..
        else{
                lblAvailable.setText("");
                lblRate.setText("");
                btnAdd.setEnabled(false);
             }
        }
       
    }//GEN-LAST:event_cmbbxProductBillItemStateChanged

    private void txtbxQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbxQtyKeyReleased
        // TODO add your handling code here:
        try{
        Integer av = Integer.parseInt(lblAvailable.getText());
        Integer qt = Integer.parseInt(txtbxQty.getText());
        if(qt <= av){
        qt = qt * Integer.parseInt(lblRate.getText());
        txtbxAmount.setText(Integer.toString(qt));
        txtbxDiscount.setText("0.00");
        btnAdd.setEnabled(true);
        }
        else{
            if(txtbxQty.getText().length()>0)
            {
                txtbxQty.setText(txtbxQty.getText().substring(0, txtbxQty.getText().length()-1));
            }
            if(txtbxQty.getText().length()==0)
                {
                btnAdd.setEnabled(false);
                txtbxAmount.setText("");
                txtbxDiscount.setText("");
                }
        }
        }catch(NumberFormatException n1){
            //---- Removing Invalid Numbers from Qty Entered--------//
            if(txtbxQty.getText().length()>0)
            {
                txtbxQty.setText(txtbxQty.getText().substring(0, txtbxQty.getText().length()-1));
            }
            if(txtbxQty.getText().length()==0)
                {
                btnAdd.setEnabled(false);
                txtbxAmount.setText("");
                txtbxDiscount.setText("");
                }
        }
    }//GEN-LAST:event_txtbxQtyKeyReleased

    private void txtbxQtyNewProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbxQtyNewProKeyReleased
        // TODO add your handling code here:
        try{
            Integer b = Integer.parseInt(txtbxQtyNewPro.getText());
        }catch(NumberFormatException n1){
            txtbxQtyNewPro.setText("");
        }
    }//GEN-LAST:event_txtbxQtyNewProKeyReleased

    private void txtbxDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbxDiscountKeyReleased
        // TODO add your handling code here:
        try{
            Float f1 = Float.parseFloat(txtbxDiscount.getText());
            Float amt = Float.parseFloat(txtbxAmount.getText());
            if(f1 > amt)
            {
                if(!txtbxDiscount.getText().isEmpty())
                {
                  txtbxDiscount.setText(txtbxDiscount.getText().substring(0, txtbxDiscount.getText().length()-1));
                }
               if(txtbxDiscount.getText().isEmpty()){
                btnAdd.setEnabled(false);
                }
            }
            btnAdd.setEnabled(true);
            }catch(NumberFormatException n1){
            if(!txtbxDiscount.getText().isEmpty())
            {
                  txtbxDiscount.setText(txtbxDiscount.getText().substring(0, txtbxDiscount.getText().length()-1));
                  
            }
            if(txtbxDiscount.getText().isEmpty()){
                btnAdd.setEnabled(false);
            }


        }
    }//GEN-LAST:event_txtbxDiscountKeyReleased

    private void txtbxSellNewProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbxSellNewProKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbxSellNewProKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try{
                 //String[] columnNames = {"Sl No.","ProductId","Item","Qty","Rate","Discount","Amount"};
            	//Object[][] data = null;
               //DefaultTableModel m1 = new DefaultTableModel(data,columnNames);
                Boolean isInTable=false;
                int row=0;
                //--- Updating Available Stock -----------//
                Integer avail_Stock = Integer.parseInt(lblAvailable.getText()) - Integer.parseInt(txtbxQty.getText());
                lblAvailable.setText(avail_Stock.toString());
                //------------------------------//
                btnSubmitBill.setEnabled(true);
                DefaultTableModel m2 =(DefaultTableModel) tblBill.getModel();

                Statement c1 = MyCnnct.createStatement();
                ResultSet s1=null,s2=null;
                s1=c1.executeQuery("select * from cs_category where name='"+cmbbxProTypeBill.getSelectedItem().toString()+"'");
                s1.next();
                s2=c1.executeQuery("select * from cs_product where name='"+cmbbxProductBill.getSelectedItem().toString()+"'and cat_id='"+s1.getString("ID")+"'");
                s2.next();
                if(m2.getRowCount()!=0)
                {
                    for(int i=0;i<m2.getRowCount();i++)
                    {
                        if(m2.getValueAt(i, 1).equals(s2.getString("ID")))
                        {
                        isInTable=true;
                        row=i;
                        }
                    }
                }
                Float amt = Float.parseFloat(txtbxAmount.getText());
                Float disc = Float.parseFloat(txtbxDiscount.getText());
                Float total = Float.parseFloat(txtbxTotal.getText());
                Integer qty = Integer.parseInt(txtbxQty.getText());
                total = total + amt - disc;
                Integer slnum = tblBill.getModel().getRowCount()+1;
                if(!isInTable)
                {
                Object[] content = {
                    slnum.toString(),
                    s2.getString("ID"),
                    cmbbxProductBill.getSelectedItem().toString(),
                    txtbxQty.getText(),
                    lblRate.getText(),
                    disc.toString(),
                    amt.toString()
                };
                m2.addRow(content);
                }
                if(isInTable)
                {
                    amt = amt + Float.parseFloat(m2.getValueAt(row, 6).toString());
                    disc = disc + Float.parseFloat(m2.getValueAt(row, 5).toString());
                    qty = qty + Integer.parseInt(m2.getValueAt(row, 3).toString());
                    m2.setValueAt(qty, row, 3);
                    m2.setValueAt(disc, row, 5);
                    m2.setValueAt(amt, row, 6);

                }

                tblBill.setModel(m2);
                txtbxTotal.setText(total.toString());
                txtbxQty.setText("");
                txtbxAmount.setText("");
                txtbxDiscount.setText("");
                btnAdd.setEnabled(false);
              }catch(SQLException e1){
                System.out.println("SQL Errror11:"+e1);
            }catch(NumberFormatException n1){

            }catch(NullPointerException nl1){

            }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        clientIcons t = new clientIcons();
        t.setUser("sujth");
        t.setPC("sujith-pc","ip");
       
        
        MouseListener me = new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
       
                
                
            System.out.println(clientIcons.iconame );
            }

            public void mousePressed(MouseEvent e) {
         //       throw new UnsupportedOperationException("Not supported yet.");
            }

            public void mouseReleased(MouseEvent e) {
           //     throw new UnsupportedOperationException("Not supported yet.");
            }

            public void mouseEntered(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet.");
            }

            public void mouseExited(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        t.addMouseListener(me);
        
        
        
        jPanel1.add(t);
        repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        // TODO add your handling code here:
        /*try{*/
 
    }//GEN-LAST:event_jPanel1ComponentAdded

    private void jPanel2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel2ComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel2ComponentAdded

    private void pnlStaticComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnlStaticComponentAdded
        // TODO add your handling code here:
        //System.out.println("Name"+pnlStatic.getComponent(0).getName());
        //System.out.println("Name from evt:"+evt.getComponent().getName());
        /*try{
        Statement st = MyCnnct.createStatement();
        ResultSet s1 =null;

        if(FlagClass.msg.startsWith("Application"))/* A client application is Started */
        /*{
        s1=st.executeQuery("select * from cs_clientsystems where ip='"+FlagClass.Ip+"'");
        if(!(s1.next()))
        {
        FlagClass.NumOfSys++;
        System.out.println("Num of systems connected:"+FlagClass.NumOfSys+"port:"+FlagClass.port);
        s1=st.executeQuery("insert into cs_clientsystems values(client_seq.nextval,'"+FlagClass.Ip+"','"+FlagClass.SysName+"','"+"1"+"','"+FlagClass.port+"')");
        JToggleButton jb1 = new JToggleButton();
        ImageIcon imgSys = new ImageIcon("Computer.png");
        javax.swing.JLabel jl1 = new JLabel(imgSys,0);
        javax.swing.JLabel jl2 = new JLabel();
        javax.swing.JLabel jl3 = new JLabel();
        jl2.setText("");
        jl2.setSize(90, 25);
        jl3.setSize(90, 25);
        JButton jb2 = new JButton();
        jb1.setSelected(false);
        jb1.setText("LogIn");
        jb1.setName(FlagClass.Ip);
        JPanel jp = new JPanel();
        javax.swing.GroupLayout gl1 = new GroupLayout(jp);
        jp.setLayout(gl1);*/
       //imgSys.setDescription("System");
        //jb1.setText(FlagClass.SysName);
        /*jl3.setText(FlagClass.SysName+FlagClass.NumOfSys);
        jb2.setText("LogIn");
        jp.setSize(190, 190);
        jl1.setBounds(0, 0, 80, 80);
        pnlStatic.remove(0);
        jb1.setSize(90, 23);
        jb1.setBounds(85, 30, 90, 23);
        jb2.setBounds(85, 40, 90, 23);
        jl2.setBounds(0, 100, 90, 25);
        jl3.setName(FlagClass.SysName+FlagClass.NumOfSys);
        jl3.setBounds(0, 80, 90, 20);
        jp.add(jl1);
        jp.add(jb1);
        jp.add(jl3);
        jp.add(jl2);
        jp.addMouseListener(dbutt);*/

        //jb1.addActionListener(dbutt);
        /*int wid=((FlagClass.NumOfSys-1)/3)*200;
        jp.setLocation(30+(((FlagClass.NumOfSys-1)%3)*200), 30+wid);
        jPanel1.add(jp);
        jPanel1.repaint();
        }
        }
        if(FlagClass.msg.equals(""))
        {
        }
        FlagClass.reset();
        }catch(SQLException s1)
        {
        System.out.println("Sql error12:"+s1);     
        }*/
    }//GEN-LAST:event_pnlStaticComponentAdded

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
       //Component c = evt.getComponent();
       //System.out.println("nameof:"+c.getComponentAt(jButton6.getLocation()).getName());

    }//GEN-LAST:event_jPanel1MouseClicked

    private void tblBillFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblBillFocusGained
        // TODO add your handling code here:
if(tblBill.getSelectedRow()== -1)
             btnRemove.setEnabled(false);
if(tblBill.getSelectedRow() > -1)
    btnRemove.setEnabled(true);
    }//GEN-LAST:event_tblBillFocusGained

    private void tblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillMouseClicked
        // TODO add your handling code here:
       if(tblBill.getSelectedRow()== -1)
             btnRemove.setEnabled(false);
    if(tblBill.getSelectedRow() > -1)
        btnRemove.setEnabled(true);


    }//GEN-LAST:event_tblBillMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
       DefaultTableModel tm1 = (DefaultTableModel)tblBill.getModel();
       int row_selected;
       row_selected = tblBill.getSelectedRow();
       Float amt = Float.parseFloat(tblBill.getValueAt(row_selected, 6).toString());
       Float disc = Float.parseFloat(tblBill.getValueAt(row_selected, 5).toString());
       Integer qty = Integer.parseInt(tblBill.getValueAt(row_selected, 3).toString());
       Float total = Float.parseFloat(txtbxTotal.getText());
       total = total - (amt - disc);
       //------Updating Stock Available ------------//
       Integer avail_Stock = Integer.parseInt(lblAvailable.getText());
       avail_Stock = avail_Stock + qty;
       lblAvailable.setText(avail_Stock.toString());
       txtbxTotal.setText(total.toString());
       tm1.removeRow(row_selected);
        if(tblBill.getSelectedRow()== -1)
             btnRemove.setEnabled(false);
        if(tblBill.getSelectedRow() > -1)
            btnRemove.setEnabled(true);
       if(tblBill.getRowCount()==0)
           btnSubmitBill.setEnabled(false);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSubmitBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitBillActionPerformed
        // TODO add your handling code here:
        //-------------- Update Bill Number ---------------//
        try{
        String b_num = lblBillNum.getText().split(" : ")[1];
        String b_date = lblBillDate.getText().split(" : ")[1];
        String Active_user;
        Integer bill_num;
        Statement st = MyCnnct.createStatement();
        ResultSet s1 = null,s2,s3,s4;
        s1= st.executeQuery("select * from cs_flagtable");
        s1.next();
        Active_user = s1.getString("activeuser");
        bill_num = Integer.parseInt(b_num.split(s1.getString("billprefix"))[1]);
        bill_num = bill_num+1;
        lblBillNum.setText("Bill No. : "+s1.getString("billprefix")+bill_num.toString());
        s1 = st.executeQuery("Update cs_flagtable set BILLSTARTS = '"+bill_num+"'");
        //-------- Update Available Stock & Sales Table----------//
        for(int i=0;i<tblBill.getRowCount();i++)
        {
        s2 = st.executeQuery("select * from cs_product where id='"+tblBill.getValueAt(i, 1).toString()+"'");
        s2.next();
        Integer s_a = s2.getInt("Stock_available") - Integer.parseInt(tblBill.getValueAt(i, 3).toString());
        s1 = st.executeQuery("Update cs_product set stock_available='"+s_a+"' where id='"+tblBill.getValueAt(i, 1).toString()+"'");

        s2 = st.executeQuery("insert into cs_sales values(sales_seq.nextval,'"+b_num+"','"+tblBill.getValueAt(i, 3).toString()+"','"+
                tblBill.getValueAt(i, 4).toString()+"','"+tblBill.getValueAt(i, 5).toString()+"','"+b_date+"','"+txtbxCustName.getText()
                +"','"+tblBill.getValueAt(i, 1).toString()+"','"+Active_user+"')");
        //---------------- Remove Entries From Bill --------------------//
        DefaultTableModel m1 = (DefaultTableModel) tblBill.getModel();
        m1.removeRow(i);
        tblBill.setModel(m1);

        }
        }catch(SQLException s1){
            System.out.println("SQl Errr 14: "+s1);
        }
    }//GEN-LAST:event_btnSubmitBillActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        // TODO add your handling code here:
 //-------Assign LoggedUser Label------------------///
        try{
            Statement st = MyCnnct.createStatement();
            ResultSet rs =null;
            String ActUser="";
            rs = st.executeQuery("select * from cs_flagtable");
            if(rs.next())
            ActUser = rs.getString("ActiveUser");
        rs = st.executeQuery("select * from cs_admin where id='"+ActUser+"'");
        if(rs.next())
        ActUser = rs.getString("NAME");
        lblLogedUser.setText("Logged in as: "+ActUser);
        }catch(SQLException s1){
            System.out.println("SQl errr 14: "+s1);
        }
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        LogIn lg2 = new LogIn();
        lg2.setAlwaysOnTop(true);
        lg2.setFocusTraversalKeysEnabled(false);
        lg2.setVisible(true);
        lg2.setResizable(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        Statement st = MyCnnct.createStatement();
        ResultSet ss;
        String s = txtbxPassWord.getText();
        //System.out.println("User name: "+txtbxPassWord.getText());
        ss = st.executeQuery("select * from cs_admin where name = '"+txtbxUserName.getText()+"' and password='"+s+"'");
        if(ss.next())
        {
        this.setEnabled(true);
        dlgbxLogIn.setVisible(false);
        }
        
        }catch(SQLException s1){
            System.out.println("SQL Error 15 :"+s1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbxUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbxUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbxUserNameActionPerformed
    /**
    * @param args the command line arguments
    */

        public static void main(String args[]) throws IOException {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          new MainFrame().setVisible(true);

            }
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSubmitBill;
    private javax.swing.JButton btnSubmitNewCatgry;
    private javax.swing.JButton btnSubmitNewPro;
    private javax.swing.JComboBox cmbbxCatgryNewPro;
    private javax.swing.JComboBox cmbbxProTypeBill;
    private javax.swing.JComboBox cmbbxProductBill;
    private javax.swing.JDialog dlgbxAddToStock;
    private javax.swing.JDialog dlgbxAvailStock;
    private javax.swing.JDialog dlgbxLogIn;
    private javax.swing.JDialog dlgbxProSettings;
    private javax.swing.JDialog dlgbxUserSettings;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblBillDate;
    private javax.swing.JLabel lblBillNum;
    private javax.swing.JLabel lblErrormsgNewPro;
    private javax.swing.JLabel lblLogedUser;
    private javax.swing.JLabel lblRate;
    private static javax.swing.JPanel pnlStatic;
    private javax.swing.JTable tblBill;
    private javax.swing.JTextArea txtCustAddress;
    private javax.swing.JTextField txtbxAmount;
    private javax.swing.JTextField txtbxBnumNewPro;
    private javax.swing.JTextField txtbxBuyNewPro;
    private javax.swing.JTextField txtbxCustName;
    private javax.swing.JTextField txtbxDescNewCatgry;
    private javax.swing.JTextField txtbxDescNewPro;
    private javax.swing.JTextField txtbxDiscount;
    private javax.swing.JTextField txtbxNameNewCatgry;
    private javax.swing.JTextField txtbxNameNewPro;
    private javax.swing.JPasswordField txtbxPassWord;
    private javax.swing.JTextField txtbxQty;
    private javax.swing.JTextField txtbxQtyNewPro;
    private javax.swing.JTextField txtbxSellNewPro;
    private javax.swing.JTextField txtbxTotal;
    private javax.swing.JTextField txtbxUserName;
    // End of variables declaration//GEN-END:variables
}