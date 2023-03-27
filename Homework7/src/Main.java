import by.academiapvt.Patient;

public class Main {
    public static void main(String[] args) {
        Patient[] patients1 = Patient.initialize();
//     Task 1.a
        Patient[] patients2 = getPatientByDiagnosis(patients1, "ОРВИ");
        System.out.println("Список пациентов с ОРВИ:");
        for (Patient patient : patients2) {
            System.out.println(patient.information());
        }
//        Task 2.a
        System.out.println("Список пациентов с медицинскими карточками от номера 114 до номера 118:");
        Patient[] patients3 = getPatientByMedicacardInterval(patients1,114,118);
        for (Patient patient : patients3) {
            System.out.println(patient.information());
        }
    }


    public static Patient[] getPatientByDiagnosis(Patient[] patients, String diagnosis) {
        int i = 0;
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals(diagnosis)) i++;
        }
        int j = 0;
        Patient[] newPatients = new Patient[i];
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals(diagnosis)) {
                newPatients[j] = patient;
                j++;
            }
        }
        return newPatients;
    }
    public static Patient[] getPatientByMedicacardInterval(Patient[] patients, int firstcard, int lastcard) {
        int i = 0;
        for (Patient patient : patients) {
            if (patient.getMedicalcard() >= firstcard && patient.getMedicalcard() <= lastcard) i++;
        }
        int j = 0;
        Patient[] newPatients1 = new Patient[i];
        for (Patient patient : patients) {
            if ((patient.getMedicalcard() >= firstcard) && (patient.getMedicalcard() <= lastcard)) {
                newPatients1[j] = patient;
                j++;
            }
        }
        return newPatients1;
    }
}