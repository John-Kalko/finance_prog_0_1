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
import ua.homefinances.domain.util.Enumerations;

/**
 * Entity class, represents corresponding table.
 * @author Kalko Ievgen.
 */
@Entity(name = "planning_main")
public class PlanningMain extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user_id;
    @Column(name = "master_income", nullable = false)
    private BigDecimal maserIncome;
    @Column(name = "master_expenses", nullable = false)
    private BigDecimal maserExpenses;
    @Column(name = "master_remainder", nullable = false)
    private BigDecimal maserRemainder;
    @Column(name = "ssp", nullable = false)
    private BigDecimal ssp;
    @Column(name = "sss", nullable = false)
    private BigDecimal sss;
    @Column(name = "accountment_type", nullable = false, columnDefinition = "enum('WEEKLY', 'MONTHLY', 'ANNUAL')")
    private Enumerations.PlanningMain type;

    public PlanningMain() {
    }

    public PlanningMain(long id, Authenification user_id, BigDecimal maserIncome, BigDecimal maserExpenses, BigDecimal maserRemainder, BigDecimal ssp, BigDecimal sss, Enumerations.PlanningMain type) {
        this.id = id;
        this.user_id = user_id;
        this.maserIncome = maserIncome;
        this.maserExpenses = maserExpenses;
        this.maserRemainder = maserRemainder;
        this.ssp = ssp;
        this.sss = sss;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public Authenification getUser_id() {
        return user_id;
    }

    public BigDecimal getMaserIncome() {
        return maserIncome;
    }

    public BigDecimal getMaserExpenses() {
        return maserExpenses;
    }

    public BigDecimal getMaserRemainder() {
        return maserRemainder;
    }

    public BigDecimal getSsp() {
        return ssp;
    }

    public BigDecimal getSss() {
        return sss;
    }

    public Enumerations.PlanningMain getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser_id(Authenification user_id) {
        this.user_id = user_id;
    }

    public void setMaserIncome(BigDecimal maserIncome) {
        this.maserIncome = maserIncome;
    }

    public void setMaserExpenses(BigDecimal maserExpenses) {
        this.maserExpenses = maserExpenses;
    }

    public void setMaserRemainder(BigDecimal maserRemainder) {
        this.maserRemainder = maserRemainder;
    }

    public void setSsp(BigDecimal ssp) {
        this.ssp = ssp;
    }

    public void setSss(BigDecimal sss) {
        this.sss = sss;
    }

    public void setType(Enumerations.PlanningMain type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + (this.maserIncome != null ? this.maserIncome.hashCode() : 0);
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
        final PlanningMain other = (PlanningMain) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id && (this.user_id == null || !this.user_id.equals(other.user_id))) {
            return false;
        }
        if (this.maserIncome != other.maserIncome && (this.maserIncome == null || !this.maserIncome.equals(other.maserIncome))) {
            return false;
        }
        if (this.maserExpenses != other.maserExpenses && (this.maserExpenses == null || !this.maserExpenses.equals(other.maserExpenses))) {
            return false;
        }
        if (this.maserRemainder != other.maserRemainder && (this.maserRemainder == null || !this.maserRemainder.equals(other.maserRemainder))) {
            return false;
        }
        if (this.ssp != other.ssp && (this.ssp == null || !this.ssp.equals(other.ssp))) {
            return false;
        }
        if (this.sss != other.sss && (this.sss == null || !this.sss.equals(other.sss))) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }
}
