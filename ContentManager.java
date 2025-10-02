package bridge;
public abstract class ContentManager {
    protected ContentStorage storage;
    public ContentManager(ContentStorage storage) {
        this.storage = storage;
    }
    public abstract void publish(String content);
    public abstract void fetch(String id);
}
