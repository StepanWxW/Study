package pattern.proxy;

public class RealProject implements Project{
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }
    public void load() {
        System.out.println("Загрузка проекта: " + url + "....");
    }

    @Override
    public void run() {
        System.out.println("Заработал проект: " + url + "....");
    }
}
