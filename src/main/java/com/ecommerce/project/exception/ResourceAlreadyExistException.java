package com.ecommerce.project.exception;

public class ResourceAlreadyExistException extends RuntimeException{

    private String resourceName;
    private String field;
    private String fieldName;

    public ResourceAlreadyExistException() {
    }

    public ResourceAlreadyExistException(String resourceName, String fieldName, String field) {
        super(String.format("%s already present with %s : %s", resourceName, fieldName, field));
        this.field = field;
        this.fieldName = fieldName;
        this.resourceName = resourceName;
    }
}
