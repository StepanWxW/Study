package pattern.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://githab.com/strpanWxW");
        project.run();
    }
}
