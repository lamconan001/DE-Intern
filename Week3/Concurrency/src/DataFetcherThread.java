import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataFetcherThread implements Runnable {
    private String apiEndpoint;
    private String outputFilename;
    public DataFetcherThread(String apiEndpoint, String outputFilename) {
        this.apiEndpoint = apiEndpoint;
        this.outputFilename = outputFilename;
    }
    @Override
    public void run() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiEndpoint)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String data = response.body();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename,true))) {
                writer.write(data);
                writer.newLine();
            }
            System.out.println("Data has been fetched and written to " + outputFilename);

        } catch (IOException | InterruptedException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 1000; i++)
        {
            String api = "https://example" + i + ".com";
            executor.submit(new DataFetcherThread(api, "output.txt"));
        }
        executor.shutdown();
    }
}
