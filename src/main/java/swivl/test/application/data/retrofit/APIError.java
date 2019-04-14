package swivl.test.application.data.retrofit;

public class APIError {

    private int statusCode;

    private String message;

    public APIError() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}