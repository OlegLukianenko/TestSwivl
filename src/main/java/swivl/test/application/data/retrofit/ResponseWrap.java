package swivl.test.application.data.retrofit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class ResponseWrap<T> {

    public T data;
    public boolean status;
    public int statusCode;
    public String message;

    public ResponseWrap(@NonNull boolean status, int statusCode, @Nullable T data, @Nullable String message) {
        this.status = status;
        this.statusCode = statusCode;
        this.data = data;
        this.message = message;
    }

    public ResponseWrap(@NonNull boolean status, @Nullable Integer statusCode, @Nullable T data) {
        this.status = status;
        this.statusCode = statusCode == null ? 0 : statusCode;
        this.data = data;
    }

    public ResponseWrap(@NonNull boolean status, @Nullable Integer statusCode, @Nullable String message) {
        this.status = status;
        this.statusCode = statusCode == null ? 0 : statusCode;
        this.message = message;
    }

    public ResponseWrap(@NonNull boolean status, @Nullable String message) {
        this.status = status;
        this.message =  message;
    }

}
