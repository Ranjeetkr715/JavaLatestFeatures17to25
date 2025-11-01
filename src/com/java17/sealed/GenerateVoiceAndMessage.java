package com.java17.sealed;/*purpose of this class and it's applicable for class and interface both
Purpose:
Sealed classes allow you to control which other classes can extend or implement them — giving better control over inheritance.*/

sealed public interface GenerateVoiceAndMessage permits MessageGenerationClass ,VoiceGenerationClass {
    void generateVoiceMessage();
}
