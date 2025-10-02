package bridge;

public class FileSystemStorage implements ContentStorage {
    @Override
    public void saveContent(String content) {
        System.out.println("Saving content to FILE SYSTEM: " + content);
    }
    @Override
    public void loadContent(String id) {
        System.out.println("Loading content from FILE SYSTEM with id = " + id);
    }
}