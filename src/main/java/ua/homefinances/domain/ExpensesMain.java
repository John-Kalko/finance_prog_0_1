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
@Entity(name = "expenses_main")
public class ExpensesMain extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user_id;
    @ManyToOne
    @JoinColumn(name = "expenses_units_id")
    private ExpensesUnit type;
    @Column(name = "ex_date", nullable = false)
    private Timestamp date;
    @Column(name = "ex_value", nullable = false)
    private BigDecimal value;
    @Column(name = "description", nullable = true)
    private String description;

    public ExpensesMain() {
    }

    public ExpensesMain(long id, Authenification user_id, ExpensesUnit type, Timestamp date, BigDecimal value, String description) {
        this.id = id;
        this.user_id = user_id;
        this.type = type;
        this.date = date;
        this.value = value;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public Authenification getUser_id() {
        return user_id;
    }

    public ExpensesUnit getType() {
        return type;
    }

    public Timestamp getDate() {
        return date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser_id(Authenification user_id) {
        this.user_id = user_id;
    }

    public void setType(ExpensesUnit type) {
        this.type = type;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final ExpensesMain other = (ExpensesMain) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id && (this.user_id == null || !this.user_id.equals(other.user_id))) {
            return false;
        }
        if (this.type != other.type && (this.type == null || !this.type.equals(other.type))) {
            return false;
        }
        if (this.date != other.date && (this.date == null || !this.date.equals(other.date))) {
            return false;
        }
        return true;
    }
}
