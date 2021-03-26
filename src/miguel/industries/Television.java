package miguel.industries;

public class Television {
    private boolean power;
    private int channel;
    private final int MAX_CHANNEL;
    private int volume;

    public Television() {
        this.setPower(false);
        this.MAX_CHANNEL = 10;
        this.setVolume(0);
        this.setChannel(1);
    }

    public Television(int max) {
        this.setPower(false);
        if (max < 2) {
            this.MAX_CHANNEL = 10;
        } else {
            this.MAX_CHANNEL = max;
        }
        this.setVolume(0);
        this.setChannel(1);
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= getMAX_CHANNEL()) {
            this.channel = channel;
        }
    }

    public int getMAX_CHANNEL() {
        return MAX_CHANNEL;
    }

    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void volumeUp() {
        this.setVolume(this.getVolume() + 1);
    }

    public void volumeDown() {
        this.setVolume(this.getVolume() - 1);
    }

    @Override
    public String toString() {
        if (isPower()) {
            return "[Television is: on? " + "YES" + ". CHANNEL: " + getChannel() + "/" + getMAX_CHANNEL() +
                    ". VOLUME: " + getVolume() + (getVolume() <= 0 ? "% (Muted)]" : "%]");
        } else {
            return "[Television is: on? " + "NO" + ". CHANNEL: " + getChannel() + "/" + getMAX_CHANNEL() +
                    ". VOLUME: " + getVolume() + (getVolume() <= 0 ? "% (Muted)]" : "%]");
        }
    }
}