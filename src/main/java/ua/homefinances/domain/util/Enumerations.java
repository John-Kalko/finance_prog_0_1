/*
 * Finance program   1.0   13/03/01 
 * Domains module.
 */
package ua.homefinances.domain.util;

/**
 * Enumerations for the entities.
 *
 * @author Kalko Ievgen.
 */
public interface Enumerations {

    /**
     * Represents enumerations in respective DB tables.
     */
    public static enum PlanningIncomeTypes {

        DAYLY, WEEKLY, MONTHLY, ANNUAL
    };

    /**
     * Represents enumerations in respective DB tables.
     */
    public static enum PlanningMain {

        WEEKLY, MONTHLY, ANNUAL
    }
}
