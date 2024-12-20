package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRate {
    public static void converter(byte option, double amount) throws IOException, InterruptedException {
        String baseCode = "";
        String targetCode = "";
        System.out.print("Usted ha seleccionado: ");

        switch (option) {
            case 1 -> {
                baseCode = "USD";
                targetCode = "ARS";
                System.out.println("Dólar => Peso Argentino");
            }
            case 2 -> {
                baseCode = "ARS";
                targetCode = "USD";
                System.out.println("Peso Argentino => Dólar");
            }
            case 3 -> {
                baseCode = "USD";
                targetCode = "BRL";
                System.out.println("Dólar => Real Brasileño");
            }
            case 4 -> {
                baseCode = "BRL";
                targetCode = "USD";
                System.out.println("Real Brasileño => Dólar");
            }
            case 5 -> {
                baseCode = "USD";
                targetCode = "COP";
                System.out.println("Dólar => Peso Colombiano");
            }
            case 6 -> {
                baseCode = "COP";
                targetCode = "USD";
                System.out.println("Peso Colombiano => Dólar");
            }
            default -> {
                System.out.println("Opción no válida.");
                return;
            }
        }

        final String endpoint = "https://v6.exchangerate-api.com/v6/8d5930a7d8eaf793659ef7ea/pair/" + baseCode + "/" + targetCode + "/" + amount;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        MyRecord myRecord = gson.fromJson(json, MyRecord.class);

        final String result = myRecord.conversion_result();
        System.out.println("==================================================");
        System.out.println("El valor " + amount + " [" + baseCode + "] corresponde al valor final de => " + result + " [" + targetCode + "]");
        System.out.println("==================================================");
    }
}
