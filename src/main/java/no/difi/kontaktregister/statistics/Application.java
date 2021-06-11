package no.difi.kontaktregister.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    /*
    *** Remove ***

    @Autowired
    private Environment environment;

    @Bean
    public Properties properties() {
        return new Properties(environment);
    }

    @Bean
    public RestTemplate kontaktRegisterRestTemplate(Environment environment) {
        return new RestTemplateBuilder().rootUri(environment.getRequiredProperty("url.base.kontaktregister")).build();
    }

    @Bean
    public IngestClient ingestClient(Environment environment) throws IOException {
        return new IngestClient(
                environment.getRequiredProperty("url.base.ingest.statistikk", URL.class),
                15000,
                60000,
                kontaktregister.owner()
        );
    }
    *** Remove ***
     */

}
