package com.sampson.imersaospringdio.cep;

public class ViaCepResponse {

    private String cep;
    private String address;
    private String locale;

    public ViaCepResponse(String cep, String address, String locale) {
        this.cep = cep;
        this.address = address;
        this.locale = locale;
    }

    public ViaCepResponse() {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "ViaCepResponse{" +
                "cep='" + cep + '\'' +
                ", address='" + address + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}
