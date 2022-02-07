package app.visuals;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import app.utils.DataUtils;
import app.utils.TableUtils;

public class MassVariationInput extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tableModel;

	public MassVariationInput() {
		init();
		setVisible(true);		
	}

	public void init() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearData();
				dispose();
			}
		});
		panel.add(btnCancel);
		
		JButton btnClearData = new JButton("Clear Data");
		btnClearData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearData();
			}
		});
		panel.add(btnClearData);
		
		JButton btnAddData = new JButton("Add Data");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addData();
			}
		});
		panel.add(btnAddData);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onSave();
			}
		});
		panel.add(btnSave);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(Color.GRAY);
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Mass Variation Data");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mass of tablets"
			}
		) {
			private static final long serialVersionUID = -1554912773716646695L;
			Class<?>[] columnTypes = new Class[] {
				Float.class
			};
			public Class<?> getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(121);
		table.setBackground(Color.LIGHT_GRAY);
		tableModel = (DefaultTableModel) table.getModel();
		scrollPane.setViewportView(table);
		
		setAlwaysOnTop(true);
		setTitle("Mass Variation Input");
		
		setLocationRelativeTo(null);
	}

	private void onSave() {
		
	}

	private void addData() {
		int dataAmount = DataUtils.getDataAmount(this);
		TableUtils.setDataCount(tableModel, dataAmount);
	}
	
	private void clearData() {
		TableUtils.setRowCount(tableModel, 0);
	}
	
}
