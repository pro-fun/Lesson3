package CurrencyChanger.service;

import CurrencyChanger.domain.ChangeCurrency;
import CurrencyChanger.domain.Operation;

import java.util.List;

public interface OperationService {
    void writeOperation(Long clientId, String accountNumber, String accountNumberToPass, Double sum);

    List<ChangeCurrency> changeCurrencies();

    List<Operation> getOperationByClient(Long clientId);

    List<Operation> getOperationHistory(Long clientId, int year1, int month1, int day1, int year2, int month2, int day2);

    List<Operation> readAllOperations();
}

