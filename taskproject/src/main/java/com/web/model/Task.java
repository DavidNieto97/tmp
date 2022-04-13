package com.web.model;

import java.time.LocalDate;

public class Task {
    private long id;
    private String description;
    private LocalDate begDate;
    private LocalDate endDate;
    private long assignedTo;
    private TaskStatus status;
    private String comments;
}
