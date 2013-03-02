/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.homefinances.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity class, represents corresponding table.
 * @author Kalko Ievgen.
 */
@Entity(name = "expenses_unit")
public class ExpensesUnit extends Module {

    @Id
    @GeneratedValue
    private short id;
    @Column(name = "name_russian", nullable = false)
    private String russian_name;
    @Column(name = "name_english", nullable = false)
    private String englishName;

    public ExpensesUnit() {
    }

    public ExpensesUnit(short id, String russian_name, String englishName) {
        this.id = id;
        this.russian_name = russian_name;
        this.englishName = englishName;
    }

    public short getId() {
        return id;
    }

    public String getRussian_name() {
        return russian_name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setId(short id) {
        this.id = id;
    }

    public void setRussian_name(String russian_name) {
        this.russian_name = russian_name;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + (this.russian_name != null ? this.russian_name.hashCode() : 0);
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
        final ExpensesUnit other = (ExpensesUnit) obj;
        if (super.getVersion() != other.getVersion()) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if ((this.russian_name == null) ? (other.russian_name != null) : !this.russian_name.equals(other.russian_name)) {
            return false;
        }
        if ((this.englishName == null) ? (other.englishName != null) : !this.englishName.equals(other.englishName)) {
            return false;
        }
        return true;
    }
}
