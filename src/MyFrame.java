import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Suppress serial warning
@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	// Global Variables
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;

	// Constructor
		MyFrame() {
		// Set properties for the JFrame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Java Clock");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.getContentPane().setBackground(Color.BLACK);
		this.setResizable(false);
		
		// See the format for the time, day and date
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		
		// Set properties for time label
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(251, 153, 0));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		// Set properties for day label
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		dayLabel.setForeground(new Color(251, 153, 0));
		
		// Set properties for date label
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		dateLabel.setForeground(new Color(251, 153, 0));
		
		// Add all labels to the JFrame and set visible
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		// Run setTime() method
		setTime();
	}
		
		// Method to set the time and update every 1000ms
	public void setTime() {
		// Continuous loop to check time, day and date
		while (true) {
			// Get current time and set to timeLabel
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);

			// Get current day and set to dayLabel
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);

			// Get current date and set to dateLabel
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			// try catch block to sleep loop every 1000ms 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
