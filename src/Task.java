public class Task {
    // atributos
    private String description;
    private boolean done;

    // construtor(somente a String description)
    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    // getters and setters
    public String getDescription() {
        return description;
    }
    
    //get das boolianas é "is"
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
