package gorchakov.danil.remindme.dto;


import java.util.Date;

public class RemindDto {

    private String id;
    private String title;
    private Date remindDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public RemindDto() {

    }

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
