import com.fasterxml.jackson.annotation.JsonAlias;

import java.net.URL;

public class DTO {

    @JsonAlias("koji-hub-url")
    private URL kojiHubURL;

    public URL getKojiHubURL() {
        return kojiHubURL;
    }

    public void setKojiHubURL(URL kojiHubURL) {
        this.kojiHubURL = kojiHubURL;
    }
}
