class TV implements TVRemote {
    private boolean isOn;
    private int currentChannel;
    private int currentVolume;

    public TV() {
        this.isOn = false;
        this.currentChannel = 1; // default channel
        this.currentVolume = 10; // default volume
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("TV is powered on.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("TV is powered off.");
    }

    @Override
    public void changeChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Changing channel to " + channel);
        } else {
            System.out.println("TV is powered off. Cannot change channel.");
        }
    }

    @Override
    public void adjustVolume(int volume) {
        if (isOn) {
            currentVolume = volume;
            System.out.println("Adjusting volume to " + volume);
        } else {
            System.out.println("TV is powered off. Cannot adjust volume.");
        }
    }

}

