import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmploymentHistoryWindow extends JPanel
{
	private JButton btnClear, btnNext, btnPrevious, btnAddMoreEmployment;
	private JLabel labelEmployer, labelPosition, labelStart, labelEnd, labelDuties,labelReason, labelPhoneNum;
	private JTextField txtEmployer, txtPosition, txtStart, txtEnd, txtPhoneNum;
	private JTextArea areaDuties, areaReason;

	private JTabbedPane tabbedPane = new JTabbedPane();

	public EmploymentHistoryWindow()
	{
		createView();
	}

	private void createView()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		tabbedPane.add("Employment", panel);

		add(tabbedPane);

		northPanel(panel);

		centerPanel(panel);

		southPanel(panel);
	}
	
	private void northPanel(JPanel panel)
	{
		JPanel northPanel = new JPanel();
		panel.add(northPanel, BorderLayout.NORTH);

		JLabel labelEmployment = new JLabel("Employment Information");
		labelEmployment.setFont(new Font("Serif", Font.BOLD, 25));
		northPanel.add(labelEmployment, BorderLayout.CENTER);
	}
	
	private void centerPanel(JPanel panel)
	{
		JPanel centerPanel = new JPanel();
		GridBagLayout layout = new GridBagLayout();

		centerPanel.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_END;

		labelEmployer = new JLabel("Employer: ");
		labelEmployer.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelEmployer,gbc);
		gbc.gridy++;

		labelPosition = new JLabel("Position: ");
		labelPosition.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelPosition,gbc);
		gbc.gridy++;

		labelPhoneNum = new JLabel("Employer's Phone Number: ");
		labelPhoneNum.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelPhoneNum,gbc);
		gbc.gridy++;

		labelStart = new JLabel("Start Date: ");
		labelStart.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelStart,gbc);
		gbc.gridy++;

		labelEnd = new JLabel("End Date: ");
		labelEnd.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelEnd,gbc);
		gbc.gridy++;

		labelDuties = new JLabel("Duties: ");
		labelDuties.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelDuties,gbc);
		gbc.gridy++;

		labelReason = new JLabel("Reason for leaving: ");
		labelReason.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelReason,gbc);
		gbc.gridy++;

		//reseting
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_START;

		txtEmployer = new JTextField(25);
		txtEmployer.setHorizontalAlignment(JTextField.CENTER);
		txtEmployer.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtEmployer,gbc); 
		gbc.gridy++;

		txtPosition = new JTextField(25);
		txtPosition.setHorizontalAlignment(JTextField.CENTER);
		txtPosition.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtPosition,gbc); 
		gbc.gridy++;

		txtPhoneNum = new JTextField(25);
		txtPhoneNum.setHorizontalAlignment(JTextField.CENTER);
		txtPhoneNum.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtPhoneNum,gbc); 
		gbc.gridy++;

		txtStart = new JTextField(25);
		txtStart.setHorizontalAlignment(JTextField.CENTER);
		txtStart.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtStart,gbc); 
		gbc.gridy++;

		txtEnd = new JTextField(25);
		txtEnd.setHorizontalAlignment(JTextField.CENTER);
		txtEnd.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtEnd,gbc); 
		gbc.gridy++;

		areaDuties = new JTextArea();
		areaDuties.setLineWrap(true);
		areaDuties.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(areaDuties); 
		scrollPane.setPreferredSize(new Dimension(315, 90));
		centerPanel.add(scrollPane, gbc);
		gbc.gridy++;

		areaReason = new JTextArea();
		areaReason.setLineWrap(true);
		areaReason.setWrapStyleWord(true);
		JScrollPane scrollPaneReason = new JScrollPane(areaReason); 
		scrollPaneReason.setPreferredSize(new Dimension(315, 90));
		centerPanel.add(scrollPaneReason, gbc);
		gbc.gridy++;

		btnAddMoreEmployment = new JButton("Add More");
		btnAddMoreEmployment.addActionListener(new ButtonAddMoreActionListener());
		centerPanel.add(btnAddMoreEmployment,gbc);
		gbc.gridy++;

		panel.add(centerPanel);
	}
	
	private void southPanel(JPanel panel)
	{
		JPanel southPanel = new JPanel();
		panel.add(southPanel, BorderLayout.SOUTH);

		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ButtonClearActionListener());
		southPanel.add(btnClear);
	}
	
	private class ButtonAddMoreActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{	
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			
			northPanel(panel);
			
			centerPanel(panel);
			
			southPanel(panel);
			
			tabbedPane.add("More Emplo.", panel);
		}
	}
	
	private class ButtonClearActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{	
			txtEmployer.setText(""); 
			txtPosition.setText(""); 
			txtStart.setText(""); 
			txtEnd.setText(""); 
			txtPhoneNum.setText(""); 
			areaDuties.setText(""); 
			areaReason.setText(""); 
		}
	}
	
}
