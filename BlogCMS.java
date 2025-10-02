package bridge;
public class BlogCMS extends ContentManager {
    public BlogCMS(ContentStorage storage) {
        super(storage);
    }
    @Override
    public void publish(String content) {
        System.out.println("[BlogCMS] Publishing article...");
        storage.saveContent(content);
    }
    @Override
    public void fetch(String id) {
        System.out.println("[BlogCMS] Fetching article...");
        storage.loadContent(id);
    }
}