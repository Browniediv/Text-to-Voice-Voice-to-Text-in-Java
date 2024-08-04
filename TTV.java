import com.sun.speech.freetts.*;

public class TextToSpeech {
    private static final String VOICE_NAME = "kevin16";

    public static void speak(String text) {
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice(VOICE_NAME);

        if (voice != null) {
            voice.allocate();
            voice.speak(text);
        }
    }
}
