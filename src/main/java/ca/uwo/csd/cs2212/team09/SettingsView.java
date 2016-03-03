package ca.uwo.csd.cs2212.team09;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

/**
 * //TODO: This is for stage 3
 * @author Team 9
 */
public class SettingsView extends JDialog {
	
	private MainView parent;
	private JCheckBox chckbxNewCheckBox;

	/**
	 * Create the dialog.
	 * @param p
	 * @param modal
     */
	public SettingsView(MainView p, boolean modal) {
		setTitle("Settings");
		setModal(modal);
		setAlwaysOnTop(true);
		parent = p;
		setBounds(100, 100, 560, 350);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			getContentPane().add(tabbedPane, BorderLayout.CENTER);
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("Daily Dashboard", null, panel, null);
				{
					chckbxNewCheckBox = new JCheckBox("Calories burned (out)");
					chckbxNewCheckBox.setSelected(true);
				}
				
				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Total distance");
				chckbxNewCheckBox_1.setSelected(true);
				
				JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Floors climbed");
				chckbxNewCheckBox_2.setSelected(true);
				
				JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Steps");
				chckbxNewCheckBox_3.setSelected(true);
				
				JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Active minutes");
				chckbxNewCheckBox_4.setSelected(true);
				
				JCheckBox chckbxSedentaryMinutes = new JCheckBox("Sedentary minutes");
				chckbxSedentaryMinutes.setSelected(true);
				
				JLabel lblWhat = new JLabel("Elements shown on your daily dashboard:");
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxNewCheckBox_1)
								.addComponent(chckbxNewCheckBox_2)
								.addComponent(chckbxNewCheckBox_3)
								.addComponent(chckbxNewCheckBox_4)
								.addComponent(chckbxSedentaryMinutes)
								.addComponent(lblWhat))
							.addContainerGap(369, Short.MAX_VALUE))
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(14)
							.addComponent(lblWhat)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxNewCheckBox_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxNewCheckBox_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxNewCheckBox_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxNewCheckBox_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxSedentaryMinutes)
							.addContainerGap(33, Short.MAX_VALUE))
				);
				panel.setLayout(gl_panel);
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("About", null, panel, null);
			}
		}
	}
}