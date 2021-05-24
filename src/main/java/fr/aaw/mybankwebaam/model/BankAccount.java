package fr.aaw.mybankwebaam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BankAccount {
    
    @Id
    private Integer id;

    @OneToOne
    private User user;

    private BigDecimal value;

    //--------------------------- GETTERS SETTERS --------------------------
    // ID --------------------
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    // USER --------------------
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    // VALUE --------------------
    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
