import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    public String id;
    public String text;
    public String type;
    public String user;
    public String upvotes;

    public Data() {
        // Пустой конструктор
    }

    public Data(@JsonProperty("id") String id,
                        @JsonProperty("text") String text,
                        @JsonProperty("type") String type,
                        @JsonProperty("user") String user,
                        @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "FactAboutCat {" +
                "\n id : '" + id + '\'' +
                "\n text : '" + text + '\'' +
                "\n type : '" + type + '\'' +
                "\n user : '" + user + '\'' +
                "\n upvotes : " + upvotes +
                "\n }\n";
    }
}