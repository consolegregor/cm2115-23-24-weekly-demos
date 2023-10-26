package uk.ac.rgu.topic5;

/**
 * LogFormat is a functional interface - it has a single method to be implemented
 * We can use this to illustrate the use of lambda expressions and method references
 */
public interface LogFormat {
    public void log(String message);
}
