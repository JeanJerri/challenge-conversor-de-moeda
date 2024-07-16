import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Moedas {
    private String chaveAPI = "ad70fb22b562f73883efa295";
    private String moeda1, moeda2;
    private double cotacao;

    public Moedas(String moeda1, String moeda2) {
        this.moeda1 = moeda1;
        this.moeda2 = moeda2;
    }

    public String getChaveAPI() {
        return chaveAPI;
    }

    public void setChaveAPI(String chaveAPI) {
        this.chaveAPI = chaveAPI;
    }

    public double obterCotacao() throws IOException, InterruptedException {
        String endereco = "https://v6.exchangerate-api.com/v6/" + chaveAPI + "/latest/" + moeda1;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonResponse = response.body();
        JsonElement jsonElement = JsonParser.parseString(jsonResponse);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        //As 3 linhas acima em uma única linha:
        //JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        cotacao = conversionRates.get(moeda2).getAsDouble();
        return cotacao;
    }

}
