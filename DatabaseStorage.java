package bridge;

public class DatabaseStorage implements ContentStorage {
    @Override
    public void saveContent(String content) {
        System.out.println("Saving content to DATABASE: " + content);
    }
    @Override
    public void loadContent(String id) {
        System.out.println("Loading content from DATABASE with id = " + id);
    }
}