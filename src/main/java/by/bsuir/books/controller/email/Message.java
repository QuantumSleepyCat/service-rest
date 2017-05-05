package by.bsuir.books.controller.email;

/**
 * Created by Lenovo on 21.03.2017.
 */
public class Message {
    private String name;
    private String theme;
    private String text;

    public Message() {
    }

    public Message(String name, String theme, String text) {
        this.name = name;
        this.theme = theme;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (name != null ? !name.equals(message.name) : message.name != null) return false;
        if (theme != null ? !theme.equals(message.theme) : message.theme != null) return false;
        return text != null ? text.equals(message.text) : message.text == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
