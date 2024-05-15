 package org.sid.bank.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bank.entities.BankAccount;
import org.sid.bank.enums.OperationType;

import java.util.Date;

@Data

public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;

    private String description;
}
