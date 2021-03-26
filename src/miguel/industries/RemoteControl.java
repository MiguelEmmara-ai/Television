package miguel.industries;

public class RemoteControl {
    private final Television television;

    public RemoteControl(Television television) {
        this.television = television;
    }

    public void powerButton() {
        television.setPower(!television.isPower());
    }

    public void channelDownButton() {
        if (television.isPower()) {
            if (television.getChannel() == 1) {
                television.setChannel(television.getMAX_CHANNEL());
            } else {
                television.setChannel(television.getChannel() - 1);
            }
        }
    }

    public void channelUpButton() {
        if (television.isPower()) {
            if (television.getChannel() == television.getMAX_CHANNEL()) {
                television.setChannel(1);
            } else {
                television.setChannel(television.getChannel() + 1);
            }
        }
    }

    public void volumeUpByHalf() {
        if (television.isPower()) {
            for (int i = 0; i < 50; i++) {
                television.volumeUp();
            }
        }
    }

    public void volumeDownByHalf() {
        if (television.isPower()) {
            for (int i = 0; i < 50; i++) {
                television.volumeDown();
            }
        }
    }
}