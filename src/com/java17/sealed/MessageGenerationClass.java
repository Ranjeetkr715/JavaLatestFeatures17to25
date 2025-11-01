package com.java17.sealed;


non-sealed public class MessageGenerationClass implements GenerateVoiceAndMessage{
    @Override
    public void generateVoiceMessage() {
        System.out.println("generate message");
    }
}
