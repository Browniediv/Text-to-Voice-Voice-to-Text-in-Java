# Text-to-Voice-Voice-to-Text-in-Java

# Note:
The TextToSpeech class uses FreeTTS, an open-source speech synthesis system.
The VoiceToText class has a placeholder method. You need to implement the actual voice recognition logic using a library of your choice.
The code provided is a basic implementation and might need adjustments based on the specific requirements and the environment setup.

# This project is a simple Java application that demonstrates Text-to-Speech (TTS) and Voice-to-Text (VTT) conversion using JavaFX for the graphical user interface. The application allows users to enter text and convert it to speech, as well as convert spoken words to text.

# Features
Text-to-Speech (TTS): Converts entered text into spoken words.
Voice-to-Text (VTT): Converts spoken words into written text.
# Prerequisites
Java Development Kit (JDK) 8 or higher
JavaFX library
FreeTTS library (for TTS functionality)
A suitable voice recognition library (optional, depending on implementation)
# Setup Instructions
Clone the Repository

bash
Copy code
git clone https://github.com/YourUsername/YourRepositoryName.git
cd YourRepositoryName
Import into Eclipse

Open Eclipse IDE.
Select File > Open Projects from File System.
Select the cloned repository directory and click Finish.
Add Required Libraries

Download and add the required JAR files to the build path:
JavaFX
FreeTTS
Any other library you choose for voice recognition (e.g., Sphinx4)
Run the Application

Right-click on the Main class and select Run As > Java Application.
# Usage
Text-to-Speech:

Enter text into the input text area.
Click the "Convert Text to Speech" button to hear the spoken version.
Voice-to-Text:

Click the "Convert Speech to Text" button.
Speak into the microphone, and the recognized text will appear in the output text area.
# Code Structure
Main.java: The main entry point of the application. Contains the GUI components and action handlers.
TextToSpeech.java: Contains the logic for converting text to speech using FreeTTS.
VoiceToText.java: Placeholder for voice recognition logic. This class needs to be implemented based on the chosen speech recognition library.
