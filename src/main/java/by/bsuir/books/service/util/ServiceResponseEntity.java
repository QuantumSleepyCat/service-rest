package by.bsuir.books.service.util;

import org.springframework.http.HttpStatus;

public class ServiceResponseEntity<T> {

    private HttpStatus status;
    private T resultBody;

    public ServiceResponseEntity(){}

    public ServiceResponseEntity(HttpStatus status) {
        this.status = status;
    }

    public ServiceResponseEntity(T resultBody, HttpStatus status) {
        this.status = status;
        this.resultBody = resultBody;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public T getResultBody() {
        return resultBody;
    }

    public void setResultBody(T resultBody) {
        this.resultBody = resultBody;
    }
}
