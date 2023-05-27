package CurrencyChanger.service;

import CurrencyChanger.constants.Currencies;
import CurrencyChanger.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> allAccounts();
    List<Account> getAccountsByClient(Long userId);
    Account getByNumberAccount(String accountNumber);
    void deleteAccount (String id, Long userId);
    Double calculateSumOnAccounts(Long userId);
    Account createAccount (String id, Currencies currencies, Long userId);

    Account passMoney(String id, Double sum);
    void checkAccountsForUser(Long clientId, String accountNumber, String accountNumberToPass);
    void changeCurrency(String accountNumber, String accountNumberToPass, Double sum);
}
