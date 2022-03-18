package com.ug6.soal1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Production
{
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private ArrayList<Long> productionDueDays;
    private double costCalculation;

    public Production(final int productionCapacity, final ArrayList<LocalDate> productionDate, final ArrayList<Long> productionDueDays) {
        this.setProductionCapacity(productionCapacity);
        this.setProductionDate(productionDate);
        this.setProductionDueDays(productionDueDays);
        this.costCalculation = 0.0;
    }

    public boolean checkPhonesSpecification(final String androidCode) {
        int index = 0;
        boolean status = false;
        for (final String androidLevel : Codes.ANDROIDCODES) {
            status = (!androidCode.equalsIgnoreCase(androidLevel) || index >= 3);
            ++index;
        }
        return status;
    }

    public boolean checkPhonesSpecification(final String androidCode, final int ramCapacity, final int romCapacity) {
        int index = 0;
        boolean status = false;
        System.out.println("Starting with status " + status);
        for (final String androidLevel : Codes.ANDROIDCODES) {
            if (index <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity >= 1 && ramCapacity <= 8 &&  romCapacity >= 32 && romCapacity <= 128 ) {
                    status = true;
                }
            }
            else if (index > 4 && index < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64) {
                status = true;
            }
            ++index;
        }
        System.out.println("Finish checking with status " + status);
        return status;
    }

    public void conductProduction(final Phones phone) {
        final LocalDate Now = LocalDate.now();
        final long productionDuration = this.getProductionCapacity() * 3L;
        this.getProductionDate().add(Now);
        final LocalDate productionDueDate = Now.plusDays(productionDuration);
        final long daysBetweenProduction = ChronoUnit.DAYS.between(Now, productionDueDate);
        final String NowFormat = Now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        final String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        final double cost = this.getProductionCapacity() * 1000 * (double)daysBetweenProduction;
        this.setCostCalculation(cost);
        final String bonusProductionDate = Now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        final String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + NowFormat);
        System.out.println("Production Due date: " + productionDueDateFormat);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.getCostCalculation());
    }

    public void conductProduction(final Phones phone, final float productionRate) {
        if (productionRate >= 0.0f && productionRate <= 2.0f) {
            final LocalDate Now = LocalDate.now();
            final long productionDuration = (long)(this.getProductionCapacity() * 3L * productionRate);
            this.getProductionDate().add(Now);
            final LocalDate productionDueDate = Now.plusDays(productionDuration);
            final long daysBetweenProduction = ChronoUnit.DAYS.between(Now, productionDueDate);
            final String NowFormat = Now.format(DateTimeFormatter.ISO_LOCAL_DATE);
            final String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
            final double cost = this.getProductionCapacity() * 1000 * (double)daysBetweenProduction * 2.0;
            this.setCostCalculation(cost);
            final String bonusProductionDate = Now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            final String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + bonusProductionDate);
            System.out.println("Production Due date: " + bonusProductionDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.getCostCalculation());
        }
        else {
            System.out.println("Please Input valid Production Rate");
        }
    }

    public int getProductionCapacity() {

        return this.productionCapacity;
    }

    public void setProductionCapacity(final int productionCapacity) {

        this.productionCapacity = productionCapacity;
    }

    public ArrayList<LocalDate> getProductionDate() {

        return this.productionDate;
    }

    protected void setProductionDate(final ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }

    public ArrayList<Long> getProductionDueDays() {
        return this.productionDueDays;
    }

    public void setProductionDueDays(final ArrayList<Long> productionDueDays) {
        this.productionDueDays = productionDueDays;
    }

    public double getCostCalculation() {

        return this.costCalculation;
    }

    public void setCostCalculation(final double costCalculation) {

        this.costCalculation = costCalculation;
    }


}

