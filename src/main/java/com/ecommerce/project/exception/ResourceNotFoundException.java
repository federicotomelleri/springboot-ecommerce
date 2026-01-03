package com.ecommerce.project.exception;

public class ResourceNotFoundException extends RuntimeException {

    private String resourceName;
    private String field;
    private String fieldName;
    private Long fieldId;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String field, String fieldName, String resourceName) {
        super(String.format("%s not found with %s : %s", resourceName, field, fieldName));
        this.field = field;
        this.fieldName = fieldName;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(Long fieldId, String field, String resourceName) {
        super(String.format("%s not found with %s : %d", resourceName, field, fieldId));
        this.fieldId = fieldId;
        this.field = field;
        this.resourceName = resourceName;
    }
}
