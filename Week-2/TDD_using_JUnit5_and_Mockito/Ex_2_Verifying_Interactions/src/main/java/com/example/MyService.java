package com.example;

public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processTask(String taskName) {
        // Business logic would go here
        externalApi.notify("Task processed: " + taskName);
    }
}