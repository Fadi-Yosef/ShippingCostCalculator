package se.lexicon.calculator;

import org.springframework.stereotype.Component;
import se.lexicon.model.Destination;
import se.lexicon.model.ShippingRequest;
import se.lexicon.model.Speed;
import se.lexicon.service.ShippingCostCalculator;

@Component
public class StandardDomesticShipping implements ShippingCostCalculator {

    @Override
<<<<<<< HEAD
    public boolean supports(ShippingRequest r) {
        return r.destination() == Destination.DOMESTIC && r.speed() == Speed.STANDARD;
    }

    @Override
    public double calculate(ShippingRequest r) {
        return 5 + 1.2 * r.weightKg();
=======
    public boolean supports(ShippingRequest request) {
        return request.destination() == Destination.DOMESTIC
                && request.speed() == Speed.STANDARD;
    }

    @Override
    public double calculate(ShippingRequest request) {
        return 5 + 1.2 * request.weightKg();
>>>>>>> origin/InShalla
    }
}