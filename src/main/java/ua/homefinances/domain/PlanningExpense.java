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
@Entity(name = "planning_expense")
public class PlanningExpense extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user;
    @ManyToOne
    @JoinColumn(name = "expenses_units")
    private ExpensesUnit type;
    @Column(name = "pl_value", nullable = false)
    private BigDecimal value;
    @Column(name = "total_period", nullable = false)
    private BigDecimal totalPeriod;

    public PlanningExpense() {
    }

    public PlanningExpense(long id, Authenification user, ExpensesUnit type, BigDecimal value, BigDecimal totalPeriod) {
        this.id = id;
        this.user = user;
        this.type = type;
        this.value = value;
        this.totalPeriod = totalPeriod;
    }

    public long getId() {
        return id;
    }

    public Authenification getUser() {
        return user;
    }

    public ExpensesUnit getType() {
        return type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public BigDecimal getTotalPeriod() {
        return totalPeriod;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(Authenification user) {
        this.user = user;
    }

    public void setType(ExpensesUnit type) {
        this.type = type;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setTotalPeriod(BigDecimal totalPeriod) {
        this.totalPeriod = totalPeriod;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + (this.type != null ? this.type.hashCode() : 0);
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
        final PlanningExpense other = (PlanningExpense) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user != other.user && (this.user == null || !this.user.equals(other.user))) {
            return false;
        }
        if (this.type != other.type && (this.type == null || !this.type.equals(other.type))) {
            return false;
        }
        if (this.value != other.value && (this.value == null || !this.value.equals(other.value))) {
            return false;
        }
        if (this.totalPeriod != other.totalPeriod && (this.totalPeriod == null || !this.totalPeriod.equals(other.totalPeriod))) {
            return false;
        }
        return true;
    }
}
