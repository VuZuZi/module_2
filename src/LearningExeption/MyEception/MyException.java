package LearningExeption.MyEception;

public class MyException extends Exception{
    private String error;

    public MyException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
