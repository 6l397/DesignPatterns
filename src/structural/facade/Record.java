package structural.facade;

public class Record {
    private String date;
    private String description;

    public Record(String date, String description) {
        this.date = date;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Record{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}

