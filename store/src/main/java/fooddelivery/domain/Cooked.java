package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cooked extends AbstractEvent {

    private Long id;

    public Cooked(StoreOrder aggregate) {
        super(aggregate);
    }

    public Cooked() {
        super();
    }
    // keep

}
