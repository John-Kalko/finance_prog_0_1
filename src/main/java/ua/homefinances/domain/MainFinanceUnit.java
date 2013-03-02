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
@Entity(name = "main_finance_unit")
public class MainFinanceUnit extends Module {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "authenification_id")
    private Authenification user_id;
    @Column(name = "started_amount", nullable = false)
    private BigDecimal startedAmount;
    @Column(name = "started_visa_amount", nullable = false)
    private BigDecimal visaAmount;
    @Column(name = "master_expenses", nullable = false)
    private BigDecimal masterExpenses;
    @Column(name = "master_expenses_visa", nullable = false)
    private BigDecimal masterExpensesVisa;
    @Column(name = "master_remainder", nullable = false)
    private BigDecimal masterRemainder;
    @Column(name = "master_remainder_visa", nullable = false)
    private BigDecimal masterRemainderVisa;
    @Column(name = "master_debts", nullable = false)
    private BigDecimal masterDebts;
    @Column(name = "master_loans", nullable = false)
    private BigDecimal masterLoans;
    @Column(name = "master_avialible_remainder", nullable = false)
    private BigDecimal generalAvailiableRemainder;
    @Column(name = "master_avialible_cash", nullable = false)
    private BigDecimal generalAvailiableCash;

    public MainFinanceUnit() {
    }

    public MainFinanceUnit(long id, Authenification user_id, BigDecimal startedAmount, BigDecimal visaAmount, BigDecimal masterExpenses, BigDecimal masterExpensesVisa, BigDecimal masterRemainder, BigDecimal masterRemainderVisa, BigDecimal masterDebts, BigDecimal masterLoans, BigDecimal generalAvailiableRemainder, BigDecimal generalAvailiableCash) {
        this.id = id;
        this.user_id = user_id;
        this.startedAmount = startedAmount;
        this.visaAmount = visaAmount;
        this.masterExpenses = masterExpenses;
        this.masterExpensesVisa = masterExpensesVisa;
        this.masterRemainder = masterRemainder;
        this.masterRemainderVisa = masterRemainderVisa;
        this.masterDebts = masterDebts;
        this.masterLoans = masterLoans;
        this.generalAvailiableRemainder = generalAvailiableRemainder;
        this.generalAvailiableCash = generalAvailiableCash;
    }

    public long getId() {
        return id;
    }

    public Authenification getUser_id() {
        return user_id;
    }

    public BigDecimal getStartedAmount() {
        return startedAmount;
    }

    public BigDecimal getVisaAmount() {
        return visaAmount;
    }

    public BigDecimal getMasterExpenses() {
        return masterExpenses;
    }

    public BigDecimal getMasterExpensesVisa() {
        return masterExpensesVisa;
    }

    public BigDecimal getMasterRemainder() {
        return masterRemainder;
    }

    public BigDecimal getMasterRemainderVisa() {
        return masterRemainderVisa;
    }

    public BigDecimal getMasterDebts() {
        return masterDebts;
    }

    public BigDecimal getMasterLoans() {
        return masterLoans;
    }

    public BigDecimal getGeneralAvailiableRemainder() {
        return generalAvailiableRemainder;
    }

    public BigDecimal getGeneralAvailiableCash() {
        return generalAvailiableCash;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser_id(Authenification user_id) {
        this.user_id = user_id;
    }

    public void setStartedAmount(BigDecimal startedAmount) {
        this.startedAmount = startedAmount;
    }

    public void setVisaAmount(BigDecimal visaAmount) {
        this.visaAmount = visaAmount;
    }

    public void setMasterExpenses(BigDecimal masterExpenses) {
        this.masterExpenses = masterExpenses;
    }

    public void setMasterExpensesVisa(BigDecimal masterExpensesVisa) {
        this.masterExpensesVisa = masterExpensesVisa;
    }

    public void setMasterRemainder(BigDecimal masterRemainder) {
        this.masterRemainder = masterRemainder;
    }

    public void setMasterRemainderVisa(BigDecimal masterRemainderVisa) {
        this.masterRemainderVisa = masterRemainderVisa;
    }

    public void setMasterDebts(BigDecimal masterDebts) {
        this.masterDebts = masterDebts;
    }

    public void setMasterLoans(BigDecimal masterLoans) {
        this.masterLoans = masterLoans;
    }

    public void setGeneralAvailiableRemainder(BigDecimal generalAvailiableRemainder) {
        this.generalAvailiableRemainder = generalAvailiableRemainder;
    }

    public void setGeneralAvailiableCash(BigDecimal generalAvailiableCash) {
        this.generalAvailiableCash = generalAvailiableCash;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + (this.startedAmount != null ? this.startedAmount.hashCode() : 0);
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
        final MainFinanceUnit other = (MainFinanceUnit) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.user_id != other.user_id && (this.user_id == null || !this.user_id.equals(other.user_id))) {
            return false;
        }
        if (this.startedAmount != other.startedAmount && (this.startedAmount == null || !this.startedAmount.equals(other.startedAmount))) {
            return false;
        }
        if (this.visaAmount != other.visaAmount && (this.visaAmount == null || !this.visaAmount.equals(other.visaAmount))) {
            return false;
        }
        if (this.masterExpenses != other.masterExpenses && (this.masterExpenses == null || !this.masterExpenses.equals(other.masterExpenses))) {
            return false;
        }
        if (this.masterExpensesVisa != other.masterExpensesVisa && (this.masterExpensesVisa == null || !this.masterExpensesVisa.equals(other.masterExpensesVisa))) {
            return false;
        }
        if (this.masterRemainder != other.masterRemainder && (this.masterRemainder == null || !this.masterRemainder.equals(other.masterRemainder))) {
            return false;
        }
        if (this.masterRemainderVisa != other.masterRemainderVisa && (this.masterRemainderVisa == null || !this.masterRemainderVisa.equals(other.masterRemainderVisa))) {
            return false;
        }
        if (this.masterDebts != other.masterDebts && (this.masterDebts == null || !this.masterDebts.equals(other.masterDebts))) {
            return false;
        }
        if (this.masterLoans != other.masterLoans && (this.masterLoans == null || !this.masterLoans.equals(other.masterLoans))) {
            return false;
        }
        if (this.generalAvailiableRemainder != other.generalAvailiableRemainder && (this.generalAvailiableRemainder == null || !this.generalAvailiableRemainder.equals(other.generalAvailiableRemainder))) {
            return false;
        }
        if (this.generalAvailiableCash != other.generalAvailiableCash && (this.generalAvailiableCash == null || !this.generalAvailiableCash.equals(other.generalAvailiableCash))) {
            return false;
        }
        return true;
    }
}
