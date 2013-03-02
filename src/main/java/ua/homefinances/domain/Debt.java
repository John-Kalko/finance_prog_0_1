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
@Entity(name = "debt")
public class Debt extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user_id;
    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
    @Column(name = "person", nullable = false)
    private String person;
    @Column(name = "description", nullable = true)
    private String description;
    @Column(name = "is_actual", nullable = false)
    private boolean isActual;

    public Debt() {
    }

    public Debt(long id, Authenification user_id, BigDecimal amount, String person, String description, boolean isActual) {
        this.id = id;
        this.user_id = user_id;
        this.amount = amount;
        this.person = person;
        this.description = description;
        this.isActual = isActual;
    }

    public long getId() {
        return id;
    }

    public Authenification getUser_id() {
        return user_id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getPerson() {
        return person;
    }

    public String getDescription() {
        return description;
    }

    public boolean isIsActual() {
        return isActual;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser_id(Authenification user_id) {
        this.user_id = user_id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsActual(boolean isActual) {
        this.isActual = isActual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + (this.amount != null ? this.amount.hashCode() : 0);
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
        final Debt other = (Debt) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id && (this.user_id == null || !this.user_id.equals(other.user_id))) {
            return false;
        }
        if (this.amount != other.amount && (this.amount == null || !this.amount.equals(other.amount))) {
            return false;
        }
        if ((this.person == null) ? (other.person != null) : !this.person.equals(other.person)) {
            return false;
        }
        return true;
    }
}
