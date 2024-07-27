package com.example.interceptor2.entities;


public class Month {
    private Integer monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;

    public Month( Integer monthNumber, String englishName, String italianName,  String germanName) {
        this.englishName = englishName;
        this.germanName = germanName;
        this.italianName = italianName;
        this.monthNumber = monthNumber;
    }
    public Month(){}

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getGermanName() {
        return germanName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public Integer getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(Integer monthNumber) {
        this.monthNumber = monthNumber;
    }

    @Override
    public String toString() {
        return "Month{" +
                "englishName='" + englishName + '\'' +
                ", monthNumber=" + monthNumber +
                ", italianName='" + italianName + '\'' +
                ", germanName='" + germanName + '\'' +
                '}';
    }
}
