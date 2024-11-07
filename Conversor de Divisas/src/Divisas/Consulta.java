package Divisas;

import com.google.gson.Gson;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Consulta {

    public Divisas consultaDelCliente(/*String numeroMenu*/ String moneda1, String moneda2, Double monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1cc64b64e63a5aa84f77fa1e/pair/" + moneda1 +
                "/" + moneda2 + "/" + monto);//Ver como el usuario entrara
        // con el input del menu por el usd
//        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1cc64b64e63a5aa84f77fa1e/latest/" + numeroMenu);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);
        } catch (Exception e) {
            throw new RuntimeException("No disponible de momento");
        }

    }
}
