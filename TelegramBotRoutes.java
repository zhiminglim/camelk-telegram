import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

  public void configure() {

    from("telegram:bots?authorizationToken={{token}}")
      .convertBodyTo(String.class)
      .choice()
        .when(simple("${body.toLowerCase()} contains 'chuck'"))
          .to("http://api.icndb.com/jokes/random")
          .unmarshal().json(JsonLibrary.Jackson)
          .transform(simple("${body[value][joke]}"))
          .log("${body}")
          .to("telegram:bots?authorizationToken={{token}}")
        .otherwise()
          .log("No Chuck")
          .to("telegram:bots?authorizationToken={{token}}");
  }
}