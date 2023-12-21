package interfaces;

import creatures.Creatures;

public interface Speakable {

    void speak(String speach);

    void ask(String question, Creatures askWho);

}
