package by.academiapvt;

import java.util.*;
import java.util.Set;
import java.util.Map;

import static by.academiapvt.ActualTaxDebts.*;

public class Main {
    public static void main(String[] args) {
//        Task 1.3
        Company company1 = new Company("Добрае Кола", "Шиномонтаж", 01, 7000);
        Company company2 = new Company("Ласунак", "Торговля", 01, 0);
        Company company3 = new Company("Адвокат+", "Юридические услуги", 01, 6000);
        Company company4 = new Company("Прораб и ко", "Строительство", 01, 17000);
        Company company5 = new Company("Школа АйТи", "Образовательные услуги", 01, 0);
        Company company6 = new Company("Буренка", "Производство молочных продуктов", 01, 0);
        Company company7 = new Company("Новый Дом", "Риелтерские услуги", 01, 22000);
        Company company8 = new Company("Айболит", "Медицинские услуги", 01, 21000);
        Company company9 = new Company("Лучший отель", "Гостиничные услуги", 01, 0);
        Company company10 = new Company("Черепаха", "Пассажирские перевозки", 01, 3000);

//        Task 1.4
        Collection collection1 = new ArrayList<Company>();
        collection1.add(company2);
        collection1.add(company5);
        collection1.add(company6);
        collection1.add(company9);
        Collection collection2 = new ArrayList<Company>();
        collection2.add(company1);
        collection2.add(company3);
        collection2.add(company10);
        Collection collection3 = new ArrayList<Company>();
        collection3.add(company4);
        collection3.add(company7);
        collection3.add(company8);
        TaxService newList = new TaxService();
        newList.listOfCompanies.put(NODEPTS, collection1);
        newList.listOfCompanies.put(DEPTSUNDER10000, collection2);
        newList.listOfCompanies.put(DEPTSOVER10000, collection3);
//        Task 1.5
        company4.toPayTaxes(11000);
        System.out.println(company4.getTaxDebts());
        newList.toCheckCompanyByTaxDept(company4);
        information(newList);
    }

    public static void information(TaxService taxService) {
        Set<Map.Entry<ActualTaxDebts, Collection<Company>>> companies = taxService.listOfCompanies.entrySet();
        for (Map.Entry<ActualTaxDebts, Collection<Company>> entry : companies) {
            System.out.println(entry);
        }
    }
}



