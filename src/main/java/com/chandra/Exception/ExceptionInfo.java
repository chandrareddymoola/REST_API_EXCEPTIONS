package com.chandra.Exception;

import java.time.LocalDate;

public class ExceptionInfo {
    private String exCode;
    private String exDesc;
    private LocalDate exDate;

    public ExceptionInfo(String exCode, String exDesc, LocalDate exDate) {
        this.exCode = exCode;
        this.exDesc = exDesc;
        this.exDate = exDate;
    }

    public String getExDesc() {
        return exDesc;
    }

    public void setExDesc(String exDesc) {
        this.exDesc = exDesc;
    }

    public String getExCode() {
        return exCode;
    }

    public void setExCode(String exCode) {
        this.exCode = exCode;
    }

    public LocalDate getExDate() {
        return exDate;
    }

    public void setExDate(LocalDate exDate) {
        this.exDate = exDate;
    }
}
