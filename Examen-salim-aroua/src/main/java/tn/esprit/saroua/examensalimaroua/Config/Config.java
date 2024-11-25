package tn.esprit.saroua.examensalimaroua.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public OpenAPI   springShopOpenAPI() {
        return new OpenAPI().info(infoAPI());
    }

    public Info infoAPI() {
        return new Info()
                .title("AS")
                .description("Exam : Exam")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        return new Contact()
                .name("Equipe ASI II")
                .email("AS@esprit.tn")
                .url("https://www.linkedin.com/in/AS/");
    }

//    @Bean
//    public GroupedOpenApi productPublicApi() {
//        return GroupedOpenApi.builder()
//                .group("ALL MANAGEMENT API")
//                .pathsToMatch("/**")
//                .build();
//    }

//    @Bean
//    public GroupedOpenApi blocPublicApi() {
//        return GroupedOpenApi.builder()
//                .group("BLOC API")
//                .pathsToMatch("/bloc/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi chambrePublicApi() {
//        return GroupedOpenApi.builder()
//                .group("CHAMBRE API")
//                .pathsToMatch("/chambre/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi etudiantPublicApi() {
//        return GroupedOpenApi.builder()
//                .group("ETUDIANT API")
//                .pathsToMatch("/etudiant/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi foyerPublicApi() {
//        return GroupedOpenApi.builder()
//                .group("FOYER API")
//                .pathsToMatch("/foyer/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi reservationPublicApi() {
//        return GroupedOpenApi.builder()
//                .group("RESERVATION API")
//                .pathsToMatch("/reservation/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi universitePublicApi() {
//        return GroupedOpenApi.builder()
//                .group("UNIVERSITE API")
//                .pathsToMatch("/universite/**")
//                .build();
//    }
}
