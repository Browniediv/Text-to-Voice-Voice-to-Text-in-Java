import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private TextArea inputText;
    private TextArea outputText;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TTV and VTT Conversion");

        inputText = new TextArea();
        inputText.setPromptText("Enter text to convert to speech...");

        outputText = new TextArea();
        outputText.setPromptText("Speech to text output...");
        outputText.setEditable(false);

        Button ttvButton = new Button("Convert Text to Speech");
        ttvButton.setOnAction(e -> convertTextToSpeech());

        Button vttButton = new Button("Convert Speech to Text");
        vttButton.setOnAction(e -> convertSpeechToText());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(inputText, ttvButton, vttButton, outputText);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void convertTextToSpeech() {
        String text = inputText.getText();
        // Call the TTS function here
        TextToSpeech.speak(text);
    }

    private void convertSpeechToText() {
        // Call the VTT function here and set output to outputText
        String recognizedText = VoiceToText.recognize();
        outputText.setText(recognizedText);
    }
}
