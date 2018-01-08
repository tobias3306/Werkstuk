package com.ehb.tobias.werkstuk;

/**
 * Created by Tobias on 7/01/2018.
 */

public class Parameter {
    private String[] dataset;
    private String timezone;
    private double rows;
    private String format;

    public String[] getDataset() {
        return dataset;
    }

    public void setDataset(String[] dataset) {
        this.dataset = dataset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public double getRows() {
        return rows;
    }

    public void setRows(double rows) {
        this.rows = rows;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
