package random;

public class Television{
	
	private final int MAX_CHANNEL; // Final variables should be capitalised and be at the top.
	private boolean power; // added to check whether power if true(on) or false(off)
	private int channel;
	private int volume;
	
	// Default constructor...
	public Television()
	{
		this.setPower(false);
		this.MAX_CHANNEL = 10;	
		this.setChannel(1); // Requirements specified to set channel to 1.
		this.setVolume(0); // Requirements specified to set volume to 0.
	}
	
	// 1-parameter constructor to allow user to specify
	// the maximum number of channels.
	public Television(int max)
	{
		this.setPower(false);
	
		// Validates user's specification of max channels.
		if(max < 2) { // If max is less than 2...
			this.MAX_CHANNEL = 10;			
		}
		else { // Otherwise assign max to MAX_CHANNEL..
			this.MAX_CHANNEL = max;
		}
		
		this.setChannel(1);
		this.setVolume(0);
	}
	
	// Get method for power.
	public boolean isOn() {
		return power;
	}
	
	public void setPower (boolean power) {
		this.power = power;
	}
	
	// Remember to put the "get" prefix in front of the variables.
	// Alternatively, you can go to Source -> Generate Getters and Setters...
	// and then select the variables you want the IDE to generate it for you.
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) { 
		//this.channel = channel;
		
		// Requirements says to ensure channel stays between 1 and maxChannel, hence,
		if(channel <= this.MAX_CHANNEL && channel >= 1) {// Validates passed in channel.
			this.channel = channel;
		}
	}
	
	// MAX_CHANNEL only has a get method.
    public int getMaxChannel() {
		return this.MAX_CHANNEL;
	}
	
	public int getVolume() {
		return volume;
	}
	
	// Private set method for volume.
	private void setVolume(int volume) {
		//this.volume = volume;
		
		// Requirements also says to ensure volume percentage stays between 0-100, hence
		if(volume <= 100 && volume >= 0) {
			this.volume = volume;
		}
	}
	
	public void volumeDown()
	{
		// Decrements volume percentage by one (Option 1).
		//this.volume--;
		
		// Same function but follows OOP paradigm (Option 2).
		this.setVolume(this.getVolume() - 1);
	}
	
	public void volumeUp()
	{
		// Increments volume percentage by one (Option 1).
		//this.volume++;
		
		// Same function but follows OOP paradigm (Option 2).
		this.setVolume(this.getVolume() + 1);
	}
	
	@Override
	public String toString()
	{
		// Television section...Ternary operator to return the state of the television's power.
		String status = "[Television is: on? " + (this.isOn()? "YES. ":"NO. ");
		
		// Concatenates channel section...
		status += ("CHANNEL: " + this.getChannel() + "/" + this.getMaxChannel() + ". ");
		
		// Concatenates volume section..
		status += ("VOLUME: " + this.getVolume() + "%" + (this.getVolume() == 0? " (muted)":"") + "]");
		
		return status;
	}	
}
