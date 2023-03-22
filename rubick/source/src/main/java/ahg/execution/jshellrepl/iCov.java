package ahg.execution.jshellrepl;

import java.time.Duration;

import java.net.URI;
import java.net.http.HttpClient;
/* import java.net.http.HttpHeaders; */
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class iCov {

	static String covUrl = null;
	static String resetUrl = null;
	static String shutdownUrl = null;

	public static void setup(String host) {
		covUrl = host + "/coverage?iteration_id=0&data_type=detail";
		resetUrl = host + "/reset";
		shutdownUrl = host + "/shutdown?all=false";
	}

	public static String GET(String url) throws java.io.IOException, InterruptedException {

		HttpRequest request = HttpRequest.
					newBuilder().
					uri(URI.create(url))
					.GET()
					.timeout(Duration.ofSeconds(1))
					.build();

		var client = HttpClient.newHttpClient();

		HttpResponse.BodyHandler<String> asString = HttpResponse.
								BodyHandlers.
								ofString();

		HttpResponse<String> response = client.send(request, asString);

		int statusCode = response.statusCode();
		if (statusCode != 200) 
			throw new RuntimeException("status code of GET request of \"" + url + "\" is " + statusCode);

		/* 
		 * System.out.printf("Status Code: %s%n", statusCode); 
		 * HttpHeaders headers = response.headers(); 
		 * System.out.printf("Response Headers: %s%n", headers); 
		 * System.out.println(response.body()); 
		 */

		return response.body();
	}

	public static String DELETE(String url) throws java.io.IOException, InterruptedException {
		HttpRequest request = HttpRequest.
					newBuilder().
					uri(URI.create(url))
					.DELETE()
					.timeout(Duration.ofSeconds(1))
					.build();

		var client = HttpClient.newHttpClient();

		HttpResponse.BodyHandler<String> asString = HttpResponse.
								BodyHandlers.
								ofString();

		HttpResponse<String> response = client.send(request, asString);

		int statusCode = response.statusCode();
		if (statusCode != 200) 
			throw new RuntimeException("status code of DELETE request of \"" + url + "\" is " + statusCode);

		/* 
		 * System.out.printf("Status Code: %s%n", statusCode); 
		 * HttpHeaders headers = response.headers(); 
		 * System.out.printf("Response Headers: %s%n", headers); 
		 * System.out.println(response.body()); 
		 */

		return response.body();
	}

	public static String getCoverage() {
		try {
			return GET(covUrl);
		} catch (Exception ex) {
			throw new RuntimeException("exception happended during the http req of coverage: " + ex);
		}
	}

	// this shutdown currently has ugly exit log, fix this requires the upgrade of the NanoHTTPD used by agent (need to replace it, quite a big work)
	public static void shutdown() {
		try {
			GET(shutdownUrl);
			//String cmd = "curl --location --request GET '" + shutdownUrl + "'";
			//Runtime.getRuntime().exec(cmd);
		} catch (Exception ex) {
			/* ex.printStackTrace();
			throw new RuntimeException("exception happended during the http req of shutdown: " + ex); */
			// just eat the exception since shutdown will throw exception everytime
			System.out.println("can ignore: exception happended during the http req of shutdown");
		}
	}

	public static void resetCoverage() {
		try {
			DELETE(resetUrl);
		} catch (Exception ex) {
			throw new RuntimeException("exception happended during the http req of reset: " + ex);
		}
	}
}
