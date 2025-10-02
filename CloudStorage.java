package bridge;

public class CloudStorage implements ContentStorage {
    @Override
    public void saveContent(String content) {
        System.out.println("Saving content to CLOUD: " + content);
    }
    @Override
    public void loadContent(String id) {
        System.out.println("Loading content from CLOUD with id = " + id);
    }
}