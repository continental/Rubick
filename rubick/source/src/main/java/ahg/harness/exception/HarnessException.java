package ahg.harness.exception;

public abstract class HarnessException extends Exception { 

    public boolean isHard;

    public HarnessException(String errorMessage) {
        super(errorMessage);
    }

    public abstract String getReason();

}
