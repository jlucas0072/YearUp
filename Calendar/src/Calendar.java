import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.GregorianCalendar;
import javax.swing.JScrollPane;


public class Calendar {


	private DefaultTableModel m_defTblModel = new DefaultTableModel();
	
	private int m_realMonth = -1;
	private int m_realYear = -1;
	private int m_realDay = -1;
	private int m_currentMonth = -1;
	private int m_currentYear = -1;

	//UI Components
	private JButton btnPrevious = null;
	private JButton btnNext = null;
	private JFrame frame;
	private JTable daysTable;
	JLabel  lblMonth = null;
	JComboBox comboBox = null;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar window = new Calendar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calendar() {
		GregorianCalendar cal = new GregorianCalendar(); //Create calendar
		m_realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
		m_realMonth = cal.get(GregorianCalendar.MONTH); //Get month
		m_realYear = cal.get(GregorianCalendar.YEAR); //Get year
		m_currentMonth = m_realMonth; //Match month and year
		m_currentYear = m_realYear;

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (m_currentMonth == 0)
				{ //Back one year
					m_currentMonth = 11;
					m_currentYear -= 1;
				}
				else
				{ //Back one month
					m_currentMonth -= 1;
				}

				refreshCalendar(m_currentMonth, m_currentYear);
				
			}
		});
		btnPrevious.setBounds(10, 5, 84, 23);
		panel.add(btnPrevious);
		
		lblMonth = new JLabel("New label");
		lblMonth.setBounds(104, 9, 65, 14);
		panel.add(lblMonth);
		
		btnNext = new JButton("Next");
		btnNext.setBounds(179, 5, 65, 23);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (m_currentMonth == 11)
				{ //Up one year
					m_currentMonth = 0;
					m_currentYear += 1;
				}
				else
				{ //Up one month
					m_currentMonth += 1;
				}

				refreshCalendar(m_currentMonth, m_currentYear);

			}
		});
		panel.add(btnNext);
		
		JLabel lblChangeYear = new JLabel("Change Year:");
		lblChangeYear.setBounds(254, 9, 73, 14);
		panel.add(lblChangeYear);
		
		comboBox = new JComboBox();
		for (int i=m_realYear-100; i<=m_realYear+100; i++)
		{
			comboBox.addItem(String.valueOf(i));
		}
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (comboBox.getSelectedItem() != null)
				{
					String b = comboBox.getSelectedItem().toString();
					m_currentYear = Integer.parseInt(b); //Get the numeric value
					refreshCalendar(m_currentMonth, m_currentYear); //Refresh
				}
			}
		});
		comboBox.setBounds(337, 6, 58, 20);
		panel.add(comboBox);
		
		//scrollPane.setBounds(10, 63, 414, 187)
		
		String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; //All headers
		
		for (int i=0; i<7; i++)
		{
		   m_defTblModel.addColumn(headers[i]);
		}
		
		
		daysTable = new JTable(m_defTblModel);
		daysTable.setBounds(417, 42, -411, 220);
		daysTable.setColumnSelectionAllowed(true);
		daysTable.setRowSelectionAllowed(true);
		daysTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
				//Set row/column count
		daysTable.setRowHeight(38);
				
		//daysTable.getParent().setBackground(daysTable.getBackground());
		m_defTblModel.setColumnCount(7);
		m_defTblModel.setRowCount(6);
		
		JScrollPane scrollPane = new JScrollPane(daysTable);
		scrollPane.setBounds(10, 51, 414, 200);
		panel.add(scrollPane);
		
		refreshCalendar(m_realMonth, m_realYear);
		}
		
		
		public void refreshCalendar(int monthIndex, int year)
		{
			String[] monthsList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			
			int numberOfDays= -1;  //Number Of Days
			int startOfMonth = -1; //Start Of Month

			btnPrevious.setEnabled(true); //Enable buttons at first
			btnNext.setEnabled(true);

			
			if ((monthIndex == 0) && (year <= m_realYear - 100))
			{
				//A month before January 100 years ago cannot be reached
				btnPrevious.setEnabled(false);
			}

			if ((monthIndex == 11) && (year >= m_realYear + 100))
			{
				//A month after December 100 years later cannot be reached
				btnNext.setEnabled(false);

			}

			lblMonth.setText(monthsList[monthIndex]); //Refresh the month label at the top
			comboBox.setSelectedItem(String.valueOf(year)); //Select the correct year in the
			
			GregorianCalendar cal = new GregorianCalendar(year, monthIndex, 1);
			numberOfDays = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
			startOfMonth = cal.get(GregorianCalendar.DAY_OF_WEEK);

			//Clear table
			for (int i=0; i<6; i++)
			{
				for (int j=0; j<7; j++)
				{
					m_defTblModel.setValueAt(null, i, j);
				}
			}

			for (int i=1; i<=numberOfDays; i++)
			{
				int row = new Integer((i+startOfMonth-2)/7);
				int column  =  (i+startOfMonth-2)%7;
				m_defTblModel.setValueAt(i, row, column);

	}
}
}
