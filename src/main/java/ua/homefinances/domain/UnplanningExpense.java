/*
 * Finance program   1.0   13/03/01 
 * Domains module.
 */
package ua.homefinances.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
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
@Entity(name = "unplanning_expense")
public class UnplanningExpense extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user_id;
    @Column(name = "ex_date", nullable = false)
    private Timestamp date;
    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
    @Column(name = "description", nullable = false)
    private String decription;

    public UnplanningExpense() {
    }

    public UnplanningExpense(long id, Authenification user_id, Timestamp date, BigDecimal amount, String decription) {
        this.id = id;
        this.user_id = user_id;
        this.date = date;
        this.amount = amount;
        this.decription = decription;
    }

    public long getId() {
        return id;
    }

    public Authenification getUser_id() {
        return user_id;
    }

    public Timestamp getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDecription() {
        return decription;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser_id(Authenification user_id) {
        this.user_id = user_id;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + (this.date != null ? this.date.hashCode() : 0);
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
        final UnplanningExpense other = (UnplanningExpense) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id && (this.user_id == null || !this.user_id.equals(other.user_id))) {
            return false;
        }
        if (this.date != other.date && (this.date == null || !this.date.equals(other.date))) {
            return false;
        }
        if (this.amount != other.amount && (this.amount == null || !this.amount.equals(other.amount))) {
            return false;
        }
        if ((this.decription == null) ? (other.decription != null) : !this.decription.equals(other.decription)) {
            return false;
        }
        return true;
    }
}
