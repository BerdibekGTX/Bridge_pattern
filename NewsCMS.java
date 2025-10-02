package bridge;

public class NewsCMS extends ContentManager {
    public NewsCMS(ContentStorage storage) {
        super(storage);
    }
    @Override
    public void publish(String content) {
        System.out.println("[NewsCMS] Publishing news...");
        storage.saveContent(content);
    }
    @Override
    public void fetch(String id) {
        System.out.println("[NewsCMS] Fetching news...");
        storage.loadContent(id);
    }
}