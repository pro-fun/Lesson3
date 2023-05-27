package CurrencyChanger.repository;

import CurrencyChanger.domain.Account;
import CurrencyChanger.domain.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperationRepository extends FileWorker{
    public static List<Operation> operations = new ArrayList<>();
    public static String PATH = "documents/operations";

    public List<Operation> updateOperations() {
        Object object = deserializeObject(PATH);
        if ((object instanceof List<?>)) {
            operations = (List<Operation>) object;
        }
        return operations;
    }
    public List<Operation> allOperations() {
        Object object = deserializeObject(PATH);
        if ((object instanceof List<?>)) {
            operations = (List<Operation>) object;
        }
        return operations;
    }

    public Operation addOperation(Operation operation) {
        operations = allOperations();
        operations.add(operation);
        serializeObject(operations, PATH);
        return operation;
    }
    public void saveChangesWithOperations(){
        serializeObject(operations, PATH);
    }
    public List<Operation> findOperationsByClient(Long clientId) {
        List<Operation> operations = allOperations();
        List<Operation> operationsByClient = operations.stream().filter(operation1 -> operation1.getClientId().equals(clientId)).collect(Collectors.toList());
        if (operationsByClient.isEmpty()) {
            System.out.println("Нет актуальных операций у клиента: " + clientId);
            return new ArrayList<>();
        }
        return operationsByClient;
    }


}
