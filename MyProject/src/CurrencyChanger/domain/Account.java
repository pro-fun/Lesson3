package CurrencyChanger.domain;

import CurrencyChanger.constants.Currencies;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {
    private Long accountId;
    private String id;
    private Currencies currencies;
    private Double value;
    private Long userId;
    private static final long serialVersionUID = 6079992975082943573L;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && currencies == account.currencies && Objects.equals(userId, account.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currencies, userId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Currencies getCurrency() {
        return currencies;
    }

    public void setCurrency(Currencies currencies) {
        this.currencies = currencies;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Account(String id, Currencies currencies, Double value, Long userId) {
        this.id = id;
        this.currencies = currencies;
        this.value = value;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", id=" + id +
                ", currency='" + currencies + '\'' +
                ", value=" + value +
                ", userId=" + userId +
                '}' + '\n';
    }
}
