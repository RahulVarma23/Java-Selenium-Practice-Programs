package designpatterns.builderpattern;

public class Demo {

    public static void main(String[] args) {
        URL.URLBuilder builder = new URL.URLBuilder();
        builder.protocol("https://").hostname("www.google.com:").port("443")
                .pathParam("/1").queryParam("?name=xyz");

        URL url = builder.build();

        System.out.print(url.protocol);
        System.out.print(url.hostname);
        System.out.print(url.port);
        System.out.print(url.pathParam);
        System.out.print(url.queryParam);
    }
}
