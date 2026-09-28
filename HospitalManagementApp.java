import doctorInformation.DoctorDetails;
import financeInformation.FinanceDetails;
import patientInformation.PatientDetails;
import receptionInformation.ReceptionSection;

    public static void main(String[] args) {
    PatientDetails patients = new PatientDetails();
    DoctorDetails doctors = new DoctorDetails();
    FinanceDetails finances = new FinanceDetails();
    ReceptionSection reception = new ReceptionSection();

    //update information
    reception.ReceptionInput(patients);
    doctors.UpdatePatientMedicalInformation(patients);
    finances.UpdateFinances(patients);

    //display final patient record
    System.out.println("=============================================================");
    System.out.println("\u001B[1m\u001B[34mFinal patient record\u001B[0m");
    System.out.println("The patient Id: " + patients.getPatientID());
    System.out.println("The Patient name: " + patients.getName());
    System.out.println("The patient sex: " + patients.getSex());
    System.out.println("The patient age: " + patients.getAge());
    System.out.println("The patient diagnosis: " + patients.getDiagnosis());
    System.out.println("The patient treatment: " + patients.getTreatment());
    System.out.println("The patient next appointment date: " + patients.getAppointmentDate());
    System.out.println("The patient payment method: " + patients.getPaymentMethod());
    System.out.println("The patient payment amount: " + patients.getPaymentAmount());
    System.out.println("The cashier: " + patients.getCashierName());
    System.out.println("The receptionist: " + patients.getReceptionist());
    System.out.println("The doctor is: " + patients.getDoctorName() + "/" + patients.getDoctorTitle());
}