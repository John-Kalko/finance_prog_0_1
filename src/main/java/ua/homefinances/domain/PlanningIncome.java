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
import ua.homefinances.domain.util.Enumerations;

/**
 * Entity class, represents corresponding table.
 * @author Kalko Ievgen.
 */
@Entity(name = "planning_income")
public class PlanningIncome extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user;
    @Column(name = "pl_value", nullable = false)
    private BigDecimal value;
    @Column(name = "pl_date", nullable = false)
    private Timestamp date;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "time_type", nullable = false, columnDefinition = "enum('DAYLY', 'MONTHLY', 'ANNUAL')")
    private Enumerations.PlanningIncomeTypes timeType;

    public PlanningIncome() {
    }

    public PlanningIncome(long id, Authenification user, BigDecimal value, Timestamp date, String name, Enumerations.PlanningIncomeTypes timeType) {
        this.id = id;
        this.user = user;
        this.value = value;
        this.date = date;
        this.name = name;
        this.timeType = timeType;
    }

    public long getId() {
        return id;
    }

    public Authenification getUser() {
        return user;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Enumerations.PlanningIncomeTypes getTimeType() {
        return timeType;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(Authenification user) {
        this.user = user;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeType(Enumerations.PlanningIncomeTypes timeType) {
        this.timeType = timeType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + (this.value != null ? this.value.hashCode() : 0);
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
        final PlanningIncome other = (PlanningIncome) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user != other.user && (this.user == null || !this.user.equals(other.user))) {
            return false;
        }
        if (this.value != other.value && (this.value == null || !this.value.equals(other.value))) {
            return false;
        }
        if (this.date != other.date && (this.date == null || !this.date.equals(other.date))) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.timeType != other.timeType) {
            return false;
        }
        return true;
    }
}
