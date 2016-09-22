/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Chris
 */
public interface TipCalculator {
    public abstract void getBillAmount();
    public abstract void setBillAmount(double bill);
    //public abstract void getServiceQuaility();
    //public abstract void setServiceQuality(ServiceQuality sq);
    public abstract double getTipPercent();
    public abstract double setTipPercent();
}
