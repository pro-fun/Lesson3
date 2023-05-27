package CurrencyChanger.repository;

import CurrencyChanger.domain.Account;
import CurrencyChanger.exception.AccountException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AccountRepository extends FileWorker {
    public static List<Account> accounts = new ArrayList<>();
    public static String PATH = "documents/accounts";

    public List<Account> updateAccounts() {
        Object object = deserializeObject(PATH);
        if ((object instanceof List<?>)) {
            accounts = (List<Account>) object;
        }
        return accounts;
    }

    public List<Account> allAccounts() {
        Object object = deserializeObject(PATH);
        List<Account> accounts = new ArrayList<>();
        if ((object instanceof List<?>)) {
            accounts = (List<Account>) object;
        }
        return accounts;
    }

    public List<Account> findAccountsByClient(Long clientId) {
        List<Account> accounts = allAccounts();
        List<Account> accountsByClient = accounts.stream().filter(account1 -> account1.getUserId().equals(clientId)).collect(Collectors.toList());
        if (accountsByClient.isEmpty()) {
            System.out.println ("Нет актуальных счетов у клиента: " + clientId);
            return new ArrayList<>();

        }
        return accountsByClient;
    }

        public Account findById(String accountId){
        return accounts.stream().filter(account1 -> account1.getId().equals(accountId)).findFirst().orElseThrow(()->new AccountException("Счёта с id " + accountId + " не найдено"));
    }
    public Account addAccount(Account account) {
        accounts = allAccounts();
        accounts.add(account);
        serializeObject(accounts, PATH);
        return account;
    }
    public void deleteAccount(Account account){
        accounts = allAccounts();
        accounts.remove(account);
        serializeObject(accounts, PATH);
    }
    public void saveChangesWithAccounts(){
        serializeObject(accounts, PATH);
    }
    public void passComission(Double sum){
        Account account = (Account) accounts.stream().filter(account1 -> account1.getUserId()==0).findFirst().orElseThrow(()->new AccountException("Счёта админа не найдено"));
        Double comissions = account.getValue()+sum;
        account.setValue(comissions);
    }

}
