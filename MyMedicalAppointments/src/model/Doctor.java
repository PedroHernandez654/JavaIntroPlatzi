package model;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributos
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();


    public Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void addAvailableAppointment(String date,String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hopistal: Cruz roja");
        System.out.println("Departamento: Cancegorología");
    }

    public static class AvailableAppointment {
        private  int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //Availableappointment


        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }
        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate(){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments: \nDate:" + date + "\nTime: " + time;
        }
    }

}
