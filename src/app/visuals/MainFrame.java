package app.visuals;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import app.Main;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private Main main;

	public MainFrame(Main main) {
		this.main = main;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		menuBar.add(horizontalStrut);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewProject = new JMenuItem("Create New Project");
		mntmNewProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.createProject();
			}
		});
		mnFile.add(mntmNewProject);
		
		JMenuItem mntmDeleteProject = new JMenuItem("Delete Project");
		mnFile.add(mntmDeleteProject);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		mnFile.add(verticalStrut);
		
		JMenuItem mntmSaveProject = new JMenuItem("Save Project");
		mnFile.add(mntmSaveProject);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Load Project");
		mnFile.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu = new JMenu("Data");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAddData = new JMenuItem("Add New Data");
		mnNewMenu.add(mntmAddData);
		
		JMenuItem mntmRemoveData = new JMenuItem("Remove Data");
		mnNewMenu.add(mntmRemoveData);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		mnNewMenu.add(verticalStrut_1);
		
		JMenuItem mntmMassVariation = new JMenuItem("Mass Variation");
		mnNewMenu.add(mntmMassVariation);
		
		JMenuItem mntmDisintegration = new JMenuItem("Disintegration");
		mnNewMenu.add(mntmDisintegration);
		
		JMenuItem mntmFriability = new JMenuItem("Friability");
		mnNewMenu.add(mntmFriability);
		
		JMenuItem mntmTensileStrength = new JMenuItem("Tensile Strength");
		mnNewMenu.add(mntmTensileStrength);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Tablet Quality Analyser");
		
		
		
		setVisible(true);
	}

}
