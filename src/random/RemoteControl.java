package random;

public class RemoteControl 
{
	private Television television;
	
	public RemoteControl(Television television)
	{
		this.setTelevision(television);
	}

	public Television getTelevision() 
	{
		return television;
	}

	public void setTelevision(Television television) 
	{
		this.television = television;
	}
	
	public void powerButton()
	{
		// Check if tv is on...
		if(this.getTelevision().isOn())
		{
			// Turns tv off.
			this.getTelevision().setPower(false);
		}
		else // Otherwise...
		{
			// Turns tv on.
			this.getTelevision().setPower(true);
		}
	}
	
	public void channelDownButton()
	{
		// Check if tv is on...
		if(this.getTelevision().isOn())
		{
			// Check if current channel is at 1...
			if(this.getTelevision().getChannel() == 1)
			{
				// Sets channel to maxChannel.
				this.getTelevision().setChannel(this.getTelevision().getMaxChannel());
			}
			else // Otherwise...
			{
				// Turns the channel down by one.
				this.getTelevision().setChannel(this.getTelevision().getChannel() - 1);
			}
		}
	}
	
	public void channelUpButton()
	{
		// Check if tv is on...
		if(this.getTelevision().isOn())
		{
			// Check if current channel is at the maximum channel...
			if(this.getTelevision().getChannel() == this.getTelevision().getMaxChannel())
			{
				// Sets channel to 1.
				this.getTelevision().setChannel(1);
			}
			else // Otherwise...
			{
				// Turns the channel up by one.
				this.getTelevision().setChannel(this.getTelevision().getChannel() + 1);
			}
		}
	}
	
	public void volumeUpByHalf()
	{
		// Check if tv is on...
		if(this.getTelevision().isOn())
		{
			// For loop to turn up the volume by 50% (50 times).
			for(int i = 0; i < 50; i++)
			{
				this.getTelevision().volumeUp();
			}
		}
	}
	
	public void volumeDownByHalf()
	{
		// Check if tv is on...
		if(this.getTelevision().isOn())
		{
			// For loop to turn the volume down by 50% (50 times).
			for(int i = 0; i < 50; i++)
			{
				this.getTelevision().volumeDown();
			}
		}
	}
}
