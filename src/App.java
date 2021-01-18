import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException, InterruptedException {

        stage.setTitle("Ticker");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.exmo.com/v1.1/ticker"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // ObjectMapper mapper  = new ObjectMapper();
        // List<Pair> pairs; 
        JSONObject obj;

        Label l = new Label(response.body());
        Scene scene = new Scene(new StackPane(l), 1280, 720);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        
        launch();
    }

}
