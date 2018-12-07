import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   This program demonstrates a solution to the
   Population Database programming challenge.
*/

public class PopulationDemo extends JFrame
{	
	JScrollPane scrollPane;			// A scroll pane to hold the table
   JPanel tablePanel; 				// A panel to hold the table
   JPanel buttonPanelA;     		// A panel to hold the buttons
	JPanel buttonPanelB;     		// A panel to hold the buttons
   JTable cityTable;					// To hold table data
   JButton sortAscendingButton;  // To submit a query
	JButton sortDescendingButton;	// To submit a query
	JButton sortNameButton;   		// To submit a query
	JButton getTotalButton;   		// To submit a query
	JButton getAverageButton;   	// To submit a query
	JButton getHighestButton;   	// To submit a query
	JButton getLowestButton;   	// To submit a query
   JButton exitButton;     		// To quit the application

	String statement;					// To hold an sql statement.
	CityDBQuery dbQuery;				// To hold results of the query.
	
   /**
       Constructor
   */

   public PopulationDemo()
   {
      // Set the window title.
      setTitle("Population Database");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      // Build the Table Panel.
      buildTablePanel();

      // Build the Button Panel.
      buildButtonPanelA();
		buildButtonPanelB();
			
      // Add the panels to the content pane.
      add(tablePanel, BorderLayout.NORTH);
      add(buttonPanelA, BorderLayout.CENTER);
		add(buttonPanelB, BorderLayout.SOUTH);
		
      // Pack and display.
      pack();
      setVisible(true);
   }

   /**
       The buildTablePanel method builds a panel to hold the
       table that will be displayed to the user.
   */

   private void buildTablePanel()
   {
      // Create a panel.
      tablePanel = new JPanel();

		// Set the sql statement to display the table.
		statement = "SELECT * FROM City";
		
	   // Create a new instance of the CityDBQuery 
		// object to hold the results of the query.
		dbQuery = new CityDBQuery(statement);

      // Get the column names.
      String[] colNames = dbQuery.getColumnNames();

      // Get the table data.
      String[][] data = dbQuery.getTableData();
		
      // Create a table using the results of the query.
      cityTable = new JTable(data, colNames);
      
      // Put the table in a scroll pane.
      scrollPane = new JScrollPane(cityTable);

      // Add the table to the panel.
      tablePanel.add(scrollPane);
   }

   /**
       The buildButtonPanelA method builds a panel
       to hold the sorting and total buttons.
   */

   private void buildButtonPanelA()
   {
      // Create a panel.
      buttonPanelA = new JPanel();

      // Create the buttons.
	   sortAscendingButton = new JButton("Sort Ascending");
		sortDescendingButton = new JButton("Sort Descending");
		sortNameButton = new JButton("Sort Name");
		getTotalButton = new JButton("Get Total");
		
		// Register the action listeners for the buttons.
      sortAscendingButton.addActionListener(new SortAscendingButtonListener());
      sortDescendingButton.addActionListener(new SortDescendingButtonListener());
      sortNameButton.addActionListener(new SortNameButtonListener());
      getTotalButton.addActionListener(new GetTotalButtonListener());

      // Add the buttons to the panel.
      buttonPanelA.add(sortAscendingButton);
		buttonPanelA.add(sortDescendingButton);
		buttonPanelA.add(sortNameButton);
		buttonPanelA.add(getTotalButton);
   }

   /**
       The buildButtonPanelB method builds a panel
       to hold the average, highest, lowest, and Exit 
		 buttons.
   */

   private void buildButtonPanelB()
   {
      // Create a panel.
      buttonPanelB = new JPanel();

      // Create the buttons.
		getAverageButton = new JButton("Get Average");
		getHighestButton = new JButton("Get Highest");
		getLowestButton = new JButton("Get Lowest");
		exitButton = new JButton("Exit");
		
		// Register the action listeners for the buttons.
      getAverageButton.addActionListener(new GetAverageButtonListener());
      getHighestButton.addActionListener(new GetHighestButtonListener());
      getLowestButton.addActionListener(new GetLowestButtonListener());
      exitButton.addActionListener(new ExitButtonListener());

      // Add the buttons to the panel.
		buttonPanelB.add(getAverageButton);
		buttonPanelB.add(getHighestButton);
		buttonPanelB.add(getLowestButton);
		buttonPanelB.add(exitButton);
   }
	
   /**
       The updateDisplayTable method updates the
       table that will be displayed to the user.
   */
	
	private void updateDisplayTable()
	{
      // Get the column names.
      String[] colNames = dbQuery.getColumnNames();

      // Get the table data.
      String[][] data = dbQuery.getTableData();

		// Remove the old scroll pane.
		tablePanel.remove(scrollPane);
		
      // Create a JTable with the results.
      cityTable = new JTable(data, colNames);
		
   	// Put the table in a scroll pane.
   	scrollPane = new JScrollPane(cityTable);

   	// Add the table to the panel.
   	tablePanel.add(scrollPane);	
		
   	// Pack and display.
   	pack();
   	setVisible(true);
	}
		
   /**
       The SortAscendingButtonListener class is an action listener
       for the sortAscending button.
   */

   private class SortAscendingButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Set the sql statement to sort the cities by population
			// in ascending order.
			statement = "SELECT * FROM CITY ORDER BY Population";
			
	      // Create a new instance of the CityDBQuery object to
			// hold the results of the query.
			dbQuery = new CityDBQuery(statement);
			
			// Update and display the results of the query in the table.
			updateDisplayTable();		
      }
   }
	
   /**
       The SortDescendingButtonListener class is an action listener
       for the SortDescending button.
   */

   private class SortDescendingButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Set the sql statement to sort the cities by population
			// in descending order.
			statement = "SELECT * FROM CITY ORDER BY Population DESC";
			
	      // Create a new instance of the CityDBQuery object to
			// hold the results of the query.
			dbQuery = new CityDBQuery(statement);
			
			// Update and display the results of the query in the table.
			updateDisplayTable();
      }
   }
	
   /**
       The SortNameButtonListener class is an action listener
       for the SortName button.
   */

   private class SortNameButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Set the sql statement to sort the cities by name
			// in ascending order.
			statement = "SELECT * FROM CITY ORDER BY CityName";
			
	      // Create a new instance of the CityDBQuery object to
			// hold the results of the query.
			dbQuery = new CityDBQuery(statement);
			
			// Update and display the results of the query in the table.
			updateDisplayTable();	
      }
   }
	
   /**
       The GetTotalButtonListener class is an action listener
       for the GetTotal button.
   */

   private class GetTotalButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Set the sql statement to get the total population of
			// all cities.
			statement = "SELECT SUM(Population) AS Total FROM City";
			
	      // Create a new instance of the CityDBQuery object to
			// hold the results of the query.
			dbQuery = new CityDBQuery(statement);
			
			// Update and display the results of the query in the table.
			updateDisplayTable();
      }
   }
	
   /**
       The GetAverageButtonListener class is an action listener
       for the GetAverage button.
   */

   private class GetAverageButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Set the sql statement to get the average population of
			// all cities.
			statement = "SELECT AVG(Population) AS Average FROM City";
			
	      // Create a new instance of the CityDBQuery object to
			// hold the results of the query.
			dbQuery = new CityDBQuery(statement);
			
			// Update and display the results of the query in the table.
			updateDisplayTable();
      }
   }
	
   /**
       The GetHighestButtonListener class is an action listener
       for the GetHighest button.
   */

   private class GetHighestButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Set the sql statement to get the highest population of
			// all cities.
			statement = "SELECT MAX(Population) AS Highest FROM City";
			
	      // Create a new instance of the CityDBQuery object to
			// hold the results of the query.
			dbQuery = new CityDBQuery(statement);
			
			// Update and display the results of the query in the table.
			updateDisplayTable();
      }
   }
	
   /**
       The GetLowestButtonListener class is an action listener
       for the GetLowest button.
   */

   private class GetLowestButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Set the sql statement to get the lowest population of
			// all cities.
			statement = "SELECT MIN(Population) AS Lowest FROM City";
			
	      // Create a new instance of the CityDBQuery object to
			// hold the results of the query.
			dbQuery = new CityDBQuery(statement);
			
			// Update and display the results of the query in the table.
			updateDisplayTable();
      }
   }						
   /**
       The ExitButtonListener class is an action listener
       for the Exit button.
   */

   private class ExitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // End the application.
         System.exit(0);
      }
   }

   /**
       The main method creates an instance of the class.
   */

   public static void main(String[] args)
   {
      new PopulationDemo();
   }
}