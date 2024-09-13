package designpatterns.builderpattern;

public class URL {

    public String protocol;
    public String hostname;
    public String port;
    public String pathParam;
    public String queryParam;

    public URL(URLBuilder urlBuilder) {
        this.protocol=urlBuilder.protocol;
        this.port=urlBuilder.port;
        this.hostname=urlBuilder.hostname;
        this.pathParam=urlBuilder.pathParam;
        this.queryParam=urlBuilder.queryParam;
    }


    public static class URLBuilder{
       private String protocol;
       private String hostname;
       private String port;
       private String pathParam;
       private String queryParam;

       public URLBuilder hostname(String hostname) {
           this.hostname=hostname;
           return this;
       }

       public URLBuilder protocol(String protocol) {
           this.protocol=protocol;
           return this;
       }

        public URLBuilder port(String port) {
            this.port=port;
            return this;
        }

        public URLBuilder pathParam(String pathParam) {
            this.pathParam=pathParam;
            return this;
        }

        public URLBuilder queryParam(String queryParam) {
            this.queryParam=queryParam;
            return this;
        }

        public URL build() {
           return new URL(this);
        }


    }



}
