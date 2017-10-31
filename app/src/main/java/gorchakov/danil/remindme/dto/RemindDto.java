package gorchakov.danil.remindme.dto;


public class RemindDto {

    private String title;

    public RemindDto(String title) {

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
