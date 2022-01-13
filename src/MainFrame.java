//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JToolBar;
//
//class MainFrame {
//     public static void main(String[] args) {
//         JFrame f = new JFrame();
//         f.setSize(500,450);
//         f.setTitle("记账本");
//         f.setLocationRelativeTo(null);
//         f.setResizable(false);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//         JToolBar tb = new JToolBar();
////         花费
//         JButton bSpend = new JButton("消费一笔");
////         记录
//         JButton bRecord = new JButton("记一笔");
////          分类
//         JButton bCategory = new JButton("消费分类");
////          报表
//         JButton bReport = new JButton("月消费报表");
////          设置
//         JButton bConfig = new JButton("设置");
////          备份
//         JButton bBackup = new JButton("备份");
////          恢复
//         JButton bRecover = new JButton("恢复");
//
//         tb.add(bSpend);
//         tb.add(bRecord);
//         tb.add(bCategory);
//         tb.add(bReport);
//         tb.add(bConfig);
//         tb.add(bBackup);
//         tb.add(bRecover);
//         f.setLayout(new BorderLayout());
//         f.add(tb, BorderLayout.NORTH);
////         下方用于显示各种功能界面的JPane
//         f.add(new JPanel(), BorderLayout.CENTER);
//
//         f.setVisible(true);
////          给各个按钮加监听器
//         bSpend.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//
//             }
//         });
//         bRecord.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//
//             }
//         });
//         bCategory.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//
//             }
//         });
//         bConfig.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//
//             }
//         });
//         bBackup.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//
//             }
//         });
//         bRecover.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//
//             }
//         });
//
//     }
//}
