package bridge;
public class Main {
    public static void main(String[] args) {
        ContentManager blog = new BlogCMS(new DatabaseStorage());
        ContentManager news = new NewsCMS(new CloudStorage());

        blog.publish("Bridge Pattern in CMS");
        blog.fetch("101");

        news.publish("Breaking News: Bridge Pattern Works!");
        news.fetch("202");

        ContentManager fileBasedNews = new NewsCMS(new FileSystemStorage());
        fileBasedNews.publish("Local File News");
    }
}

