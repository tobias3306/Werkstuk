package com.ehb.tobias.werkstuk;

/**
 * Created by Tobias on 7/01/2018.
 */

public class upperJson {
    private int nhits;
    private Parameter parameters;
    private ATM[] records;
    public int getNhits() {
        return nhits;
    }

    public void setNhits(int nhits) {
        this.nhits = nhits;
    }

    public Parameter getParameters() {
        return parameters;
    }

    public void setParameters(Parameter parameters) {
        this.parameters = parameters;
    }

    public ATM[] getRecords() {
        return records;
    }

    public void setRecords(ATM[] records) {
        this.records = records;
    }
}
