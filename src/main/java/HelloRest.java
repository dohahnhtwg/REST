import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import com.google.gson.Gson;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class HelloRest {
    public static void main(String[] args) throws IOException {
        PostRequest postRequest = new PostRequest("Minesweeper", "TestUser", "100");
        String       postUrl       = "http://de-htwg-sa-highscores.herokuapp.com/";
        Gson         gson          = new Gson();
        HttpClient   httpClient    = HttpClientBuilder.create().build();
        HttpPost     post          = new HttpPost(postUrl);
        StringEntity postingString = new StringEntity(gson.toJson(postRequest));//gson.tojson() converts your pojo to json
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");
        HttpResponse  response = httpClient.execute(post);
        System.out.println(response);
    }
}
