import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel
{
	private static void createAndShowGUI()
	{
		final Main test = new Main();

		JPanel buttonPanel = new JPanel(new BorderLayout());
		
		JPanel southPanel = new JPanel();
		buttonPanel.add(southPanel, BorderLayout.SOUTH);

		final JButton btnNext = new JButton("NEXT");
		final JButton btnPrev = new JButton("PREVIOUS");
		
		buttonPanel.add(btnNext, BorderLayout.EAST);
		buttonPanel.add(btnPrev, BorderLayout.WEST);

		btnNext.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				test.nextCard();
			}

		});

		btnPrev.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				test.prevCard();
			}

		});

		JFrame frame = new JFrame("Employment Application");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(test);
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		//frame.setSize(750,500);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override 
			public void run()
			{
				createAndShowGUI();
			}
		});
	}

	private CardLayout cardLayout = new CardLayout();
	private JPanel cardShowingPanel = new JPanel(cardLayout);

	public Main()
	{
		BasicInfoWindow window1 = new BasicInfoWindow();
		cardShowingPanel.add(window1, "1");

		EmploymentHistoryWindow window2 = new EmploymentHistoryWindow();
		cardShowingPanel.add(window2, "2");
		
		EducationAndAvailbleWindow window3 = new EducationAndAvailbleWindow();
		cardShowingPanel.add(window3, "3");
		
		ReviewAndSubmitWindow window4 = new ReviewAndSubmitWindow();
		cardShowingPanel.add(window4, "4");
		

		setLayout(new BorderLayout());

		add(cardShowingPanel, BorderLayout.CENTER);
	}

	public void nextCard()
	{
		cardLayout.next(cardShowingPanel);
	}

	public void prevCard()
	{
		cardLayout.previous(cardShowingPanel);
	}

	public void showCard(String key)
	{
		cardLayout.show(cardShowingPanel, key);
	}
}
