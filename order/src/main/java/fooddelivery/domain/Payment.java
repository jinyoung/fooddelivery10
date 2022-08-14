package fooddelivery.domain;

import fooddelivery.OrderApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Payment_table")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Order order;

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = OrderApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
