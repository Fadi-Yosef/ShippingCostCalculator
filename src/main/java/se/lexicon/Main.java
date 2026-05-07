package se.lexicon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import se.lexicon.model.Destination;
import se.lexicon.model.ShippingRequest;
import se.lexicon.model.Speed;
import se.lexicon.service.ShippingService;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Main.class, args);

        ShippingService shippingService = context.getBean(ShippingService.class);

        ShippingRequest domesticStandardRequest =
                new ShippingRequest(Destination.DOMESTIC, Speed.STANDARD,10.0);
        System.out.println(shippingService.quote(domesticStandardRequest));

        ShippingRequest internationalExpressRequest =
                new ShippingRequest(Destination.INTERNATIONAL, Speed.EXPRESS, 15.0);
        System.out.println(shippingService.quote(internationalExpressRequest));

        ShippingRequest lightDomesticRequest =
                new ShippingRequest(Destination.DOMESTIC, Speed.STANDARD, 5.0);
        System.out.println(shippingService.quote(lightDomesticRequest));

        ShippingRequest heavyInternationalExpressRequest =
                new ShippingRequest(Destination.INTERNATIONAL, Speed.EXPRESS, 20.0);
        System.out.println(shippingService.quote(heavyInternationalExpressRequest));


    }
}
