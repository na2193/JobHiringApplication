import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ReviewAndSubmitWindow extends JPanel
{
	private JButton btnSubmit;

	public ReviewAndSubmitWindow()
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

	private void northPanel(JPanel panel)
	{
		JPanel northPanel = new JPanel();
		panel.add(northPanel, BorderLayout.NORTH);

		JLabel labelMessage = new JLabel("Review and Submit");
		labelMessage.setFont(new Font("Serif", Font.BOLD, 25));
		northPanel.add(labelMessage, BorderLayout.CENTER);
	}

	private void centerPanel(JPanel panel)
	{
		JPanel centerPanel = new JPanel();

		JTextArea showReview = new JTextArea();
		showReview.setLineWrap(true);
		showReview.setWrapStyleWord(true);
		showReview.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(showReview);
		scrollPane.setPreferredSize(new Dimension(600, 385));
		centerPanel.add(scrollPane, BorderLayout.CENTER);

		/*
		BasicInfoWindow getInfo = new BasicInfoWindow();

		ArrayList<HiringPersonInfo> recievedInfo = new ArrayList<HiringPersonInfo>();
		recievedInfo = getInfo.sendInfo();

		showReview.append(recievedInfo.toString());
		 */
		
		
		panel.add(centerPanel);
	}
	
	public void recieveInfo(HiringPersonInfo person)
	{
		JTextArea showReview = new JTextArea();
		showReview.setLineWrap(true);
		showReview.setWrapStyleWord(true);
		showReview.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(showReview);
		scrollPane.setPreferredSize(new Dimension(600, 385));
		
		ArrayList<HiringPersonInfo> getInfo = new ArrayList();
		getInfo.add(person);
		
		for(HiringPersonInfo persons : getInfo)
		{
			showReview.append(persons.toString());
		}
	}



	private void southPanel(JPanel panel)
	{
		JPanel southPanel = new JPanel();
		panel.add(southPanel, BorderLayout.SOUTH);

		btnSubmit = new JButton("SUBMIT");
		// creates a new file
		southPanel.add(btnSubmit);
	}	
}
