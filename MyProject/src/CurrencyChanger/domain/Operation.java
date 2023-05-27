package CurrencyChanger.domain;

import CurrencyChanger.constants.Currencies;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Operation implements Serializable {
    private Long id;
    private LocalDateTime time;
    private String timeOfOperation;
    private Long clientId;
    private String clientName;
    private String clientSurname;
    private String clientAccountId;
    private String accountIdToPass;
    private Currencies clientAccountCurrency;
    private Currencies accountToPassCurrency;
    private Double valueToPass;
    private Double comm;
    private static final long serialVersionUID = -7994607932307928487L;

    public Operation( LocalDateTime time, String timeOfOperation, String clientName, String clientSurname, String clientAccountId, String accountIdToPass, Currencies clientAccountCurrency, Currencies accountToPassCurrency, Double valueToPass, Double comm, Long clientId) {
        this.time = time;
        this.timeOfOperation = timeOfOperation;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientAccountId = clientAccountId;
        this.accountIdToPass = accountIdToPass;
        this.clientAccountCurrency = clientAccountCurrency;
        this.accountToPassCurrency = accountToPassCurrency;
        this.valueToPass = valueToPass;
        this.comm = comm;
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientAccountId() {
        return clientAccountId;
    }

    public void setClientAccountId(String clientAccountId) {
        this.clientAccountId = clientAccountId;
    }

    public String getAccountIdToPass() {
        return accountIdToPass;
    }

    public void setAccountIdToPass(String accountIdToPass) {
        this.accountIdToPass = accountIdToPass;
    }

    public Currencies getClientAccountCurrency() {
        return clientAccountCurrency;
    }

    public void setClientAccountCurrency(Currencies clientAccountCurrency) {
        this.clientAccountCurrency = clientAccountCurrency;
    }

    public Currencies getAccountToPassCurrency() {
        return accountToPassCurrency;
    }

    public void setAccountToPassCurrency(Currencies accountToPassCurrency) {
        this.accountToPassCurrency = accountToPassCurrency;
    }

    public Double getValueToPass() {
        return valueToPass;
    }

    public void setValueToPass(Double valueToPass) {
        this.valueToPass = valueToPass;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public String getTimeOfOperation() {
        return timeOfOperation;
    }

    public void setTimeOfOperation(String timeOfOperation) {
        this.timeOfOperation = timeOfOperation;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "Номер операции =" + id +
                ", время =" + timeOfOperation +
                ", Имя клиента='" + clientName + '\'' +
                ", Фамилия клиента ='" + clientSurname + '\'' +
                ", номер аккаунта ='" + clientAccountId + '\'' +
                ", номер счёта, на который переведены средства ='" + accountIdToPass + '\'' +
                ", валюта счёта, с которого переведены деньги =" + clientAccountCurrency +
                ", валюта счёта, на который переведены деньги =" + accountToPassCurrency +
                ", сумма перевода =" + valueToPass +
                ", комиссия =" + comm +
                '}' + '\n';
    }

}
