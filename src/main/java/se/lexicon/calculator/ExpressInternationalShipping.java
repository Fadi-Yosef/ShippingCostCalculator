package se.lexicon.calculator;

import org.springframework.stereotype.Component;
import se.lexicon.model.Destination;
import se.lexicon.model.ShippingRequest;
import se.lexicon.model.Speed;
import se.lexicon.service.ShippingCostCalculator;

@Component
public class ExpressInternationalShipping implements ShippingCostCalculator {

    @Override
    public boolean supports(ShippingRequest request) {
        return request.destination() == Destination.INTERNATIONAL
                && request.speed() == Speed.EXPRESS;
    }

    @Override
    public double calculate(ShippingRequest request) {
        return 25 + 4.5 * request.weightKg();
    }
}
