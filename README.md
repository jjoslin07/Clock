# Clock
## Java Clock that displays Current Time, Day and Date

### Screenshot
<img width="462" alt="Screen Shot 2022-04-12 at 9 59 54 PM" src="https://user-images.githubusercontent.com/73438491/163104985-743f7f94-ddd6-4150-9c7e-342b247b3fae.png">

### Method
```
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
```
