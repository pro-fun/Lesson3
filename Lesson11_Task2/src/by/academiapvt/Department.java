package by.academiapvt;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String typeOfDepartment;
    private Set <Ward> wardList = new HashSet<Ward>();

    public String getTypeOfDepartment() {
        return typeOfDepartment;
    }

    public void setTypeOfDepartment(String typeOfDepartment) {
        this.typeOfDepartment = typeOfDepartment;
    }

    public Set getWardList() {
        return wardList;
    }

    public void setWardList(Set wardList) {
        this.wardList = wardList;
    }

    public Department(String typeOfDepartment) {
        this.typeOfDepartment = typeOfDepartment;
    }

    public void toAddWardInTheDepartment(Ward ward) {
        wardList.add(ward);
    }

    public void toCountMaleAndFemale() {
        int menCount = 0;
        int womenCount = 0;
        for (Ward ward: wardList){
            if (Sex.MALE.equals(ward.getGender())){
                menCount = menCount + ward.getListOfPatients().size();
            }
            else womenCount =womenCount + ward.getListOfPatients().size();
        }
        System.out.println("Количество пациентов: Мужчины - " + menCount + ", женщины - " + womenCount);
        }
    }


