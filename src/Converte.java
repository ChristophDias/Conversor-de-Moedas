import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Converte {
    public Conversao converteMoeda(String baseCurrency, String targetCurrency, double value) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/66a195c3869977d55c043725/pair/" + baseCurrency + "/" + targetCurrency + "/" + value);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversao.class);

        } catch (Exception  e) {
            throw new RuntimeException("Não consigo converter");
        }
    }
}
