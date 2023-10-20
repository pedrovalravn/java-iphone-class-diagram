public class iPhone implements MusicPlayer, Phone, WebBrowser {

    private boolean isPlaying = false;
    private boolean isCallInProgress = false;
    
    public void playMusic() {
        if (!isPlaying) {
            System.out.println("Playing music.");
            isPlaying = true;
        }
    }

    public void pauseMusic() {
        if (isPlaying) {
            System.out.println("Pausing music.");
            isPlaying = false;
        }
    }

    public void nextSong() {
        if (isPlaying) {
            System.out.println("Next song.");
        }
    }

    public void previousSong() {
        if (isPlaying) {
            System.out.println("Previous song.");
        }
    }

    public void makeCall(String number) {
        if (!isCallInProgress) {
            System.out.println("Calling " + number);
            isCallInProgress = true;
        }
    }

    public void answerCall() {
        if (isCallInProgress) {
            System.out.println("Answering call.");
        }
    }

    public void endCall() {
        if (isCallInProgress) {
            System.out.println("Ending call.");
            isCallInProgress = false;
        }
    }

    public void browseInternet(String url) {
        System.out.println("Browsing the Internet for " + url);
    }

    public static void main(String[] args) {
        iPhone myPhone = new iPhone();

        myPhone.playMusic();
        myPhone.nextSong();
        myPhone.pauseMusic();
        myPhone.previousSong();
        
        myPhone.makeCall("123-456-7890");
        myPhone.answerCall();
        myPhone.endCall();
        
        myPhone.browseInternet("https://github.com/pedrovalravn");
    }
}
