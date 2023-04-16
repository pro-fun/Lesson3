package by.academiapvt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ward {
    private int number;
    private Sex gender;
    private List<Patient> listOfPatients = new ArrayList<Patient>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public List getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(List listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    public Ward(int number, Sex gender) {
        this.number = number;
        this.gender = gender;
    }

    public Ward() {
    }

    public void toAddPatientInTheWard(Patient patient) {
        if (listOfPatients.size() < 4 || gender.equals(patient.getSex())) {
            listOfPatients.add(patient);
        } else System.out.println("Палата переполнена или в ней пациенты противоположного пола");
    }

    public void toSortPatientsById() {
        Patient[] patients = new Patient[listOfPatients.size()];
        listOfPatients.toArray(patients);
        Patient patientForSort = new Patient();
        for (int n = 0; n < patients.length; n++) {
            for (int k = 0; k < patients.length; k++) {
                if (patients[k].getId() > patients[n].getId()) {
                    patientForSort = patients[n];
                    patients[n] = patients[k];
                    patients[k] = patientForSort;
                }
            }
        }
        List newListOfPatients = new ArrayList();
        for (int n = 0; n < patients.length; n++) {
            newListOfPatients.add(patients[n]);
        }
        setListOfPatients(newListOfPatients);
    }
    public void toAddPatientByDiagnosis(Patient patient, String diagnosis) {
        if (patient.getSex().equals(diagnosis)){
            listOfPatients.add(patient);
        }
    }

}
