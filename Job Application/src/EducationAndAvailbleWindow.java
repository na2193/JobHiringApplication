import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EducationAndAvailbleWindow extends JPanel
{
	private JButton btnClear;
	private JLabel labelRecendEducation, labelCity, labelState, labelMajor, labelGPA, labelGradYear, labelDegree;
	private JTextField txtRecentEducation, txtCity, txtState, txtMajor, txtGPA, txtGradYear, txtDegree;

	private JTabbedPane tabbedPane = new JTabbedPane();
	private JPanel panelEducation, panelAvailability;

	private JLabel labelMon, labelTues, labelWed, labelThur, labelFri, labelSun, labelSat, labelStart, labelEnd;
	private JComboBox<String> cbSundayStart, cbSundayEnd, cbMondayStart, cbMondayEnd, cbTuesdayStart, cbTuesdayEnd,
					cbWedStart, cbWedEnd, cbThurStart, cbThurEnd, cbFriStart, cbFriEnd, cbSatStart, cbSatEnd;
	
	public EducationAndAvailbleWindow()
	{
		createView();
	}
	
	private void createView()
	{
		panelEducation = new JPanel();
		panelEducation.setLayout(new BorderLayout());

		centerPanelEducation(panelEducation);

		panelAvailability = new JPanel();
		panelAvailability.setLayout(new BorderLayout());

		centerPanelAvailability(panelAvailability);

		northPanel(panelEducation, panelAvailability);
		southPanelEducation(panelEducation, panelAvailability);


		tabbedPane.add("Education", panelEducation);
		tabbedPane.add("Availibility", panelAvailability);

		add(tabbedPane);
	}
	private void northPanel(JPanel panelEducation, JPanel panelAvailability)
	{
		JPanel northPanelE = new JPanel();
		panelEducation.add(northPanelE, BorderLayout.NORTH);

		JLabel labelEducation = new JLabel("Education");
		labelEducation.setFont(new Font("Serif", Font.BOLD, 25));
		northPanelE.add(labelEducation, BorderLayout.CENTER);
		/*
		 * End of education part
		 */

		/*
		 * Start of available part
		 */
		JPanel northPanelA = new JPanel();
		panelAvailability.add(northPanelA, BorderLayout.NORTH);

		JLabel labelAvailability = new JLabel("Availability");
		labelAvailability.setFont(new Font("Serif", Font.BOLD, 25));
		northPanelA.add(labelAvailability, BorderLayout.CENTER);
	}

	private void centerPanelEducation(JPanel panelEducation)
	{
		JPanel centerPanel = new JPanel();
		GridBagLayout layout = new GridBagLayout();

		centerPanel.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_END;

		labelRecendEducation = new JLabel("Recent Education: ");
		labelRecendEducation.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelRecendEducation,gbc);
		gbc.gridy++;

		labelCity = new JLabel("City: ");
		labelCity.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelCity,gbc);
		gbc.gridy++;

		labelState = new JLabel("State: ");
		labelState.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelState,gbc);
		gbc.gridy++;

		labelGradYear = new JLabel("Graduation Year: ");
		labelGradYear.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelGradYear,gbc);
		gbc.gridy++;

		labelMajor = new JLabel("Major: ");
		labelMajor.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelMajor,gbc);
		gbc.gridy++;

		labelDegree = new JLabel("Intended Degree: ");
		labelDegree.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelDegree,gbc);
		gbc.gridy++;

		labelGPA = new JLabel("GPA recieved: ");
		labelGPA.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelGPA,gbc);
		gbc.gridy++;

		//reseting
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_START;

		txtRecentEducation = new JTextField(25);
		txtRecentEducation.setHorizontalAlignment(JTextField.CENTER);
		txtRecentEducation.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtRecentEducation,gbc); 
		gbc.gridy++;

		txtCity = new JTextField(25);
		txtCity.setHorizontalAlignment(JTextField.CENTER);
		txtCity.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtCity,gbc); 
		gbc.gridy++;

		txtState = new JTextField(25);
		txtState.setHorizontalAlignment(JTextField.CENTER);
		txtState.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtState,gbc); 
		gbc.gridy++;

		txtMajor = new JTextField(25);
		txtMajor.setHorizontalAlignment(JTextField.CENTER);
		txtMajor.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtMajor,gbc); 
		gbc.gridy++;

		txtGPA = new JTextField(25);
		txtGPA.setHorizontalAlignment(JTextField.CENTER);
		txtGPA.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtGPA,gbc); 
		gbc.gridy++;

		txtGradYear = new JTextField(25);
		txtGradYear.setHorizontalAlignment(JTextField.CENTER);
		txtGradYear.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtGradYear,gbc); 
		gbc.gridy++;

		txtDegree = new JTextField(25);
		txtDegree.setHorizontalAlignment(JTextField.CENTER);
		txtDegree.setHorizontalAlignment(SwingConstants.LEFT);
		centerPanel.add(txtDegree,gbc); 
		gbc.gridy++;

		panelEducation.add(centerPanel);
	}

	private void centerPanelAvailability(JPanel panelAvailability)
	{
		JPanel centerPanel = new JPanel();
		panelAvailability.add(centerPanel, BorderLayout.CENTER);

		GridBagLayout layout = new GridBagLayout();
		centerPanel.setLayout(layout);        
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.CENTER;

		String time = "";

		gbc.gridx = 1;
		gbc.gridy = 1;
		labelSun = new JLabel("Sunday");
		labelSun.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelSun,gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		labelStart = new JLabel("Start");
		labelSun.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelStart,gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		labelEnd = new JLabel("End");
		labelEnd.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelEnd,gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		labelMon = new JLabel("Monday");
		labelMon.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelMon,gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;
		labelTues = new JLabel("Tuesday");
		labelTues.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelTues,gbc);

		gbc.gridx = 4;
		gbc.gridy = 1;
		labelWed = new JLabel("Wednesday");
		labelWed.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelWed,gbc);

		gbc.gridx = 5;
		gbc.gridy = 1;
		labelThur = new JLabel("Thursday");
		labelThur.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelThur,gbc);

		gbc.gridx = 6;
		gbc.gridy = 1;
		labelFri = new JLabel("Friday");
		labelFri.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelFri,gbc);

		gbc.gridx = 7;
		gbc.gridy = 1;
		labelSat = new JLabel("Saturday");
		labelSat.setFont(new Font("Serif", Font.PLAIN, 15));
		centerPanel.add(labelSat,gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		cbSundayStart = new JComboBox<String>();
		cbSundayStart.addItem("0:00");
		time = getTime(cbSundayStart);
		cbSundayStart.addItem(time);
		centerPanel.add(cbSundayStart, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		cbSundayEnd = new JComboBox<String>();
		cbSundayEnd.addItem("0:00");
		time = getTime(cbSundayEnd);
		cbSundayEnd.addItem(time);
		centerPanel.add(cbSundayEnd, gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;
		cbMondayStart = new JComboBox<String>();
		cbMondayStart.addItem("0:00");
		time = getTime(cbMondayStart);
		cbMondayStart.addItem(time);
		centerPanel.add(cbMondayStart, gbc);

		gbc.gridx = 2;
		gbc.gridy = 3;
		cbMondayEnd = new JComboBox<String>();
		cbMondayEnd.addItem("0:00");
		time = getTime(cbMondayEnd);
		cbMondayEnd.addItem(time);
		centerPanel.add(cbMondayEnd, gbc);

		gbc.gridx = 3;
		gbc.gridy = 2;
		cbTuesdayStart = new JComboBox<String>();
		cbTuesdayStart.addItem("0:00");
		time = getTime(cbTuesdayStart);
		cbTuesdayStart.addItem(time);
		centerPanel.add(cbTuesdayStart, gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		cbTuesdayEnd = new JComboBox<String>();
		cbTuesdayEnd.addItem("0:00");
		time = getTime(cbTuesdayEnd);
		cbTuesdayEnd.addItem(time);
		centerPanel.add(cbTuesdayEnd, gbc);

		gbc.gridx = 4;
		gbc.gridy = 2;
		cbWedStart = new JComboBox<String>();
		cbWedStart.addItem("0:00");
		time = getTime(cbWedStart);
		cbWedStart.addItem(time);
		centerPanel.add(cbWedStart, gbc);

		gbc.gridx = 4;
		gbc.gridy = 3;
		cbWedEnd = new JComboBox<String>();
		cbWedEnd.addItem("0:00");
		time = getTime(cbWedEnd);
		cbWedEnd.addItem(time);
		centerPanel.add(cbWedEnd, gbc);

		gbc.gridx = 5;
		gbc.gridy = 2;
		cbThurStart = new JComboBox<String>();
		cbThurStart.addItem("0:00");
		time = getTime(cbThurStart);
		cbThurStart.addItem(time);
		centerPanel.add(cbThurStart, gbc);

		gbc.gridx = 5;
		gbc.gridy = 3;
		cbThurEnd = new JComboBox<String>();
		cbThurEnd.addItem("0:00");
		time = getTime(cbThurEnd);
		cbThurEnd.addItem(time);
		centerPanel.add(cbThurEnd, gbc);

		gbc.gridx = 6;
		gbc.gridy = 2;
		cbFriStart = new JComboBox<String>();
		cbFriStart.addItem("0:00");
		time = getTime(cbFriStart);
		cbFriStart.addItem(time);
		centerPanel.add(cbFriStart, gbc);

		gbc.gridx = 6;
		gbc.gridy = 3;
		cbFriEnd = new JComboBox<String>();
		cbFriEnd.addItem("0:00");
		time = getTime(cbFriEnd);
		cbFriEnd.addItem(time);
		centerPanel.add(cbFriEnd, gbc);

		gbc.gridx = 7;
		gbc.gridy = 2;
		cbSatStart = new JComboBox<String>();
		cbSatStart.addItem("0:00");
		time = getTime(cbSatStart);
		cbSatStart.addItem(time);
		centerPanel.add(cbSatStart, gbc);

		gbc.gridx = 7;
		gbc.gridy = 3;
		cbSatEnd= new JComboBox<String>();
		cbSatEnd.addItem("0:00");
		time = getTime(cbSatEnd);
		cbSatEnd.addItem(time);
		centerPanel.add(cbSatEnd, gbc);

		panelAvailability.add(centerPanel);
	}

	public String getTime(JComboBox<String> cb)
	{
		String hours = "";
		for(int i = 5; i < 12; i++)
		{	
			hours = Integer.toString(i) + " am";
			cb.addItem(hours);
		}
		cb.addItem("12 pm");
		for(int i = 1; i < 11; i++)
		{
			hours = Integer.toString(i) + " pm";
			cb.addItem(hours);
		}
		return hours;
	}

	private void southPanelEducation(JPanel panelEducation, JPanel panelAvailability)
	{
		JPanel southPanelE = new JPanel();
		panelEducation.add(southPanelE, BorderLayout.SOUTH);

		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ButtonClearActionListener());
		southPanelE.add(btnClear);	
		/*
		 * End of education part
		 */

		/*
		 * Start of available part
		 */
		JPanel southPanelA = new JPanel();
		panelAvailability.add(southPanelA, BorderLayout.SOUTH);

		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ButtonClearAvailableActionListener());
		southPanelA.add(btnClear);
	}
	
	private class ButtonClearActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			txtRecentEducation.setText("");
			txtCity.setText(""); 
			txtState.setText(""); 
			txtMajor.setText(""); 
			txtGPA.setText("");  
			txtGradYear.setText("");  
			txtDegree.setText(""); 
		}
	}

	private class ButtonClearAvailableActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			cbSundayStart.setSelectedItem("0:00"); 
			cbSundayEnd.setSelectedItem("0:00"); 
			cbMondayStart.setSelectedItem("0:00"); 
			cbMondayEnd.setSelectedItem("0:00"); 
			cbTuesdayStart.setSelectedItem("0:00"); 
			cbTuesdayEnd.setSelectedItem("0:00"); 
			cbWedStart.setSelectedItem("0:00");  
			cbWedEnd.setSelectedItem("0:00"); 
			cbThurStart.setSelectedItem("0:00"); 
			cbThurEnd.setSelectedItem("0:00"); 
			cbFriStart.setSelectedItem("0:00"); 
			cbFriEnd.setSelectedItem("0:00"); 
			cbSatStart.setSelectedItem("0:00"); 
			cbSatEnd.setSelectedItem("0:00"); 	
		}
	}
	
	
}
