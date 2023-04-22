package by.academiapvt;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class TaxService {
    Map<ActualTaxDebts, Collection<Company>> listOfCompanies = new HashMap<>();

    public Map<ActualTaxDebts, Collection<Company>> getListOfCompanies() {
        return listOfCompanies;
    }

    public void setListOfCompanies(Map<ActualTaxDebts, Collection<Company>> listOfCompanies) {
        this.listOfCompanies = listOfCompanies;
    }

    public void toCheckCompanyByTaxDept(Company company) {
        double currentDept = company.getTaxDebts();
        ActualTaxDebts i = null;
        int n = 0;
        if (currentDept <= 0) {
            i = ActualTaxDebts.NODEPTS;
        }
        if (currentDept > 0 && currentDept <= 10000) {
            i = ActualTaxDebts.DEPTSUNDER10000;
        }
        if (currentDept > 10000) {
            i = ActualTaxDebts.DEPTSOVER10000;
        }
        Set<Map.Entry<ActualTaxDebts, Collection<Company>>> companies = listOfCompanies.entrySet();
        for (Map.Entry<ActualTaxDebts, Collection<Company>> entry : companies) {
            if (entry.getKey().equals(i) && entry.getValue().contains(company)) {
                System.out.println("Налоговый статус не поменялся");
                n++;
                break;
            }
        }
        for (Map.Entry<ActualTaxDebts, Collection<Company>> entry : companies) {
            if (n == 0 && entry.getValue().contains(company) ) {
                entry.getValue().remove(company);
                break;
            }
        }
        for (Map.Entry<ActualTaxDebts, Collection<Company>> entry : companies) {
            if (n == 0 && entry.getKey().equals(i)) {
                entry.getValue().add(company);
                break;
            }
        }
    }
}

