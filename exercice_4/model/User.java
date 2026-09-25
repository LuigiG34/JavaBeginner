package exercice_4.model;

import exercice_4.enums.Status;

public class User {
    private Long id;
    private String email;
    private Status status;

    public User(Long id, String email, Status status) {
        this.id = id;
        this.email = email;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
