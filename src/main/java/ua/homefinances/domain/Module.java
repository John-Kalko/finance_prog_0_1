/*
 * Finance program   1.0   13/03/01 
 * Domains module.
 */
package ua.homefinances.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

/**
 * Super class for all entities. It will provide optimistic concurrency.
 *
 * @author Kalko Ievgen.
 */
@MappedSuperclass
public abstract class Module implements Serializable {

    @Transient
    private static final long serialVersionUID = 1L;
    /**
     * It will provide optimistic concurrency.
     */
    @Version
    @Column(name = "version", nullable = false)
    private Integer version = 0;

    public Module() {
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (this.version ^ (this.version >>> 16));
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
        final Module other = (Module) obj;
        if (this.version != other.version) {
            return false;
        }
        return true;
    }
}
