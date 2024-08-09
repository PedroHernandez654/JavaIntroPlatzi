package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.DoubleConsumer;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response=0;
        do{
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. book an appointment");
            System.out.println("2. My appointment");
            System.out.println("3. LogOut");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyApoointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }


        }while(response != 0);
    }
    private static void showBookAppointmentMenu(){
        int response = 0;
        do{
            System.out.println("::Book an apointment");
            System.out.println(":: Select Date: ");
            //Numeración de la lista de fechas
            //Indice de la fecha seleccionada
            //[doctors]
            //1- doctor 1
                // 1- fecha 1
                // 1- fecha 2
            //2- doctor 2
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k=0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");

            for (Map.Entry<Integer,Doctor> doc : doctorAvailableSelected.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                    ". Date: "
                    + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: "
                    + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n 1. Yes \n2. Change Data");
            int responsed = Integer.valueOf(sc.nextLine());
            if (responsed == 1){
                UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();
            }

        }while (response != 0);
    }

    private static void showPatientMyApoointments(){
        int respose = 0;
        do {
            System.out.println("::My Appointments");
            if (UIMenu.patientLogged.getAppointmentDoctors().size()==0){
                System.out.println("Dont Have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                                "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                                "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                                "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor()
                        );
            }

            System.out.println("0. Return");
        }while (respose !=0);
    }
}
