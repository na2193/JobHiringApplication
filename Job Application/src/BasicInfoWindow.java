import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class BasicInfoWindow extends JPanel
{
	private JTextField txtName, txtAddress, txtCity, txtState, txtZipCode, txtPhoneNumber, txtEmail;
	private JComboBox cbDate, cbYear, cbMonth;
	private JLabel labelName, labelAddress, labelCity, labelState, labelZipCode, labelPhoneNumber, labelEmail, labelDOB;
	private JButton btnClear;

	public BasicInfoWindow()
	{
		createView();
	}

	private void createView()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel);

		northPanel(panel);

		centerPanel(panel);

		southPanel(panel);
	}
	
	/*
	public ArrayList<HiringPersonInfo> sendInfo()
	{
		String name = txtName.getText();
		String address = txtAddress.getText();
		String city = txtCity.getText();
		String state = txtState.getText();
		String zip = txtZipCode.getText();
		String phone = txtPhoneNumber.getText();
		String email = txtEmail.getText(); 
		String DOB = cbMonth.getSelectedItem() + " " + cbDate.getSelectedItem() + " " + cbYear.getSelectedItem();
		
		HiringPersonInfo addNewInfo = new HiringPersonInfo(name, address, city, state, zip, phone, email, DOB);		
		
		ArrayList<HiringPersonInfo> sendInfo = new ArrayList<HiringPersonInfo>();
		sendInfo.add(addNewInfo);
		
		return sendInfo;
	}
	*/
	
	public void writeToArea()
	{
		String name = txtName.getText();
		String address = txtAddress.getText();
		String city = txtCity.getText();
		String state = txtState.getText();
		String zip = txtZipCode.getText();
		String phone = txtPhoneNumber.getText();
		String email = txtEmail.getText(); 
		String DOB = cbMonth.getSelectedItem() + " " + cbDate.getSelectedItem() + " " + cbYear.getSelectedItem();
		
		HiringPersonInfo addNewInfo = new HiringPersonInfo(name, address, city, state, zip, phone, email, DOB);		

		ReviewAndSubmitWindow sendInfo = new ReviewAndSubmitWindow();
		sendInfo.recieveInfo(addNewInfo);
	}
	
	private void northPanel(JPanel panel)
	{
		JPanel northPanel = new JPanel();
		panel.add(northPanel, BorderLayout.NORTH);

		JLabel labelWelcomeMessage = new JLabel("Welcome to the Job Hiring Systems");
		labelWelcomeMessage.setFont(new Font("Serif", Font.BOLD, 25));
		northPanel.add(labelWelcomeMessage, BorderLayout.CENTER);
	}

	private void centerPanel(JPanel panel)
	{
		JPanel centerPanel = new JPanel();
		GridBagLayout layout = new GridBagLayout();

		centerPanel.setLayout(layout);        
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		labelName = new JLabel("Enter your name: ");
		labelName.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelName,gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		txtName = new JTextField(25);
		txtName.setHorizontalAlignment(JTextField.CENTER);
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtName,gbc); 

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		labelAddress = new JLabel("Enter your address: ");
		labelAddress.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelAddress,gbc); 

		gbc.gridx = 1;
		gbc.gridy = 1;  
		txtAddress = new JTextField(25);
		txtAddress.setHorizontalAlignment(JTextField.CENTER);
		txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtAddress,gbc);  

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2;
		labelCity = new JLabel("Enter your city: ");
		labelCity.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelCity,gbc); 

		gbc.gridx = 1;
		gbc.gridy = 2;
		txtCity = new JTextField(25);
		txtCity.setHorizontalAlignment(JTextField.CENTER);
		txtCity.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtCity,gbc); 

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 3;
		labelState = new JLabel("Enter your State: ");
		labelState.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelState,gbc); 

		gbc.gridx = 1;
		gbc.gridy = 3;
		txtState = new JTextField(25);
		txtState.setHorizontalAlignment(JTextField.CENTER);
		txtState.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtState,gbc); 

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 4;
		labelZipCode = new JLabel("Enter your Zip Code: ");
		labelZipCode.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelZipCode,gbc); 

		gbc.gridx = 1;
		gbc.gridy = 4;
		txtZipCode = new JTextField(25);
		txtZipCode.setHorizontalAlignment(JTextField.CENTER);
		txtZipCode.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtZipCode,gbc); 

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 5;
		labelPhoneNumber = new JLabel("Enter your Phone Number: ");
		labelPhoneNumber.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelPhoneNumber,gbc); 

		gbc.gridx = 1;
		gbc.gridy = 5;
		txtPhoneNumber = new JTextField(25);
		txtPhoneNumber.setHorizontalAlignment(JTextField.CENTER);
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtPhoneNumber,gbc); 

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 6;
		labelEmail = new JLabel("Enter your Email: ");
		labelEmail.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelEmail,gbc); 

		gbc.gridx = 1;
		gbc.gridy = 6;
		txtEmail = new JTextField(25);
		txtEmail.setHorizontalAlignment(JTextField.CENTER);
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtEmail,gbc); 

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 7;
		labelDOB = new JLabel("Enter your Date of Birth: ");
		labelDOB.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelDOB,gbc); 

		gbc.gridx = 1;
		String[] months = {"Month", "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
		cbMonth = new JComboBox<String>(months);
		centerPanel.add(cbMonth, gbc);		

		gbc.gridx = 2;
		cbDate = new JComboBox();
		cbDate.addItem("Day");
		for(int i = 1; i < 31; i++)
		{
			cbDate.addItem(i);
		}
		centerPanel.add(cbDate, gbc);

		gbc.gridx = 3;
		cbYear = new JComboBox();
		cbYear.addItem("Year");
		for(int i = 1940; i < 2017; i++)
		{
			cbYear.addItem(i);
		}
		centerPanel.add(cbYear, gbc);
		panel.add(centerPanel);
	}

	private void southPanel(JPanel panel)
	{
		JPanel southPanel = new JPanel();
		panel.add(southPanel, BorderLayout.SOUTH);

		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ButtonClearActionListener());
		southPanel.add(btnClear, BorderLayout.CENTER);
	}
	
	private class ButtonClearActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			txtName.setText("");
			txtAddress.setText("");
			txtCity.setText("");
			txtState.setText("");
			txtZipCode.setText("");
			txtPhoneNumber.setText("");
			txtEmail.setText("");
			cbMonth.setSelectedItem("Month");
			cbDate.setSelectedItem("Day");
			cbYear.setSelectedItem("Year");	
		}
	}

}