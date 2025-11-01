


public class SealedMainMethod {
    public static void main(String [] args){
        GenerateVoiceAndMessage generateVoiceAndMessage = new VoiceGenerationClass();
        GenerateVoiceAndMessage generateVoiceAndMessage1 = new MessageGenerationClass();
        generateVoiceAndMessage.generateVoiceMessage();
        generateVoiceAndMessage1.generateVoiceMessage();;
    }
}
