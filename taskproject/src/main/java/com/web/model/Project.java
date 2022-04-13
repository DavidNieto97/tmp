package com.web.model;

import java.time.LocalDate;
import java.util.List;

public class Project {
    private long id;
    private String description;
    private LocalDate begDate;
    private LocalDate endDate;
    private long assignedTo;
    private String status;
    private String comments;
    private List <Task> tasks;
}
