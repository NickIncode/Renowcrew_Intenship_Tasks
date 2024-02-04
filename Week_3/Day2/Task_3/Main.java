interface TVRemote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
    void adjustVolume(int volume);
}

interface SmartTVRemote extends TVRemote {
    void browseInternet();
    void streamContent(String content);
}

public class Main {
    public static void main(String[] args) {
        // Implementation of SmartTVRemote
        SmartTVRemote remote = new SmartTVRemote() {
            @Override
            public void powerOn() {
                System.out.println("Smart TV is powered on.");
            }

            @Override
            public void powerOff() {
                System.out.println("Smart TV is powered off.");
            }

            @Override
            public void changeChannel(int channel) {
                System.out.println("Changing channel to " + channel);
            }

            @Override
            public void adjustVolume(int volume) {
                System.out.println("Adjusting volume to " + volume);
            }

            @Override
            public void browseInternet() {
                System.out.println("Browsing the internet on Smart TV.");
            }

            @Override
            public void streamContent(String content) {
                System.out.println("Streaming " + content + " on Smart TV.");
            }
        };

        // Using SmartTVRemote methods
        remote.powerOn();
        remote.changeChannel(5);
        remote.adjustVolume(20);
        remote.browseInternet();
        remote.streamContent("Netflix");
        remote.powerOff();


      TV tv = new TV(); // Create a TV instance

      // Power on the TV
      tv.powerOn();

      // Change channel and adjust volume
      tv.changeChannel(5);
      tv.adjustVolume(20);

      // Power off the TV
      tv.powerOff(); TV t = new TV(); // Create a TV instance

      // Power on the TV
      tv.powerOn();

      // Change channel and adjust volume
      tv.changeChannel(5);
      tv.adjustVolume(20);

      // Power off the TV
      tv.powerOff();
    }
}

