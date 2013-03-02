/*
 * Finance program   1.0   13/03/01 
 * Domains module.
 */
package ua.homefinances.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity class, represents corresponding table.
 * @author Kalko Ievgen.
 */
@Entity(name = "bank_card_unit")
public class BankCardUnit extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user_id;
    @Column(name = "card_name", nullable = false)
    private String name;
    @Column(name = "started_amount", nullable = false)
    private BigDecimal startedAmount;
    @Column(name = "expenses", nullable = false)
    private BigDecimal expenses;
    @Column(name = "remainder", nullable = false)
    private BigDecimal remainder;
    @Column(name = "description")
    private String description;

    public BankCardUnit() {
    }

    public BankCardUnit(Authenification user_id, String name, BigDecimal startedAmount, BigDecimal expenses, BigDecimal remainder, String description) {
        this.user_id = user_id;
        this.name = name;
        this.startedAmount = startedAmount;
        this.expenses = expenses;
        this.remainder = remainder;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getStartedAmount() {
        return startedAmount;
    }

    public BigDecimal getExpenses() {
        return expenses;
    }

    public BigDecimal getRemainder() {
        return remainder;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartedAmount(BigDecimal startedAmount) {
        this.startedAmount = startedAmount;
    }

    public void setExpenses(BigDecimal expenses) {
        this.expenses = expenses;
    }

    public void setRemainder(BigDecimal remainder) {
        this.remainder = remainder;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 23 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BankCardUnit other = (BankCardUnit) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id && (this.user_id == null || !this.user_id.equals(other.user_id))) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.startedAmount != other.startedAmount && (this.startedAmount == null || !this.startedAmount.equals(other.startedAmount))) {
            return false;
        }
        return true;
    }
}
