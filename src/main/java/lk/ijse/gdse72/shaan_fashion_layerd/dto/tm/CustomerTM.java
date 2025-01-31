package lk.ijse.gdse72.shaan_fashion_layerd.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerTM {
    private String customerId;
    private String userId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
}
