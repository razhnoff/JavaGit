package org.bsuir.task2;


public class PatienMain {

	public static void main(String[] args) {
	Patient[] patients = new Patient[4];
	Patient patient1 = new Patient(1, "Hrenova", "Гадя", "Petrovich", "Engelsa 4",
			"23566115894", 2, "dblbil");
	Patient patient2 = new Patient(2, "Bredova", "Sasha", "Ibragimovich", "Marksa 2",
			"4521333558", 10, "dsgsdfwewe");
	Patient patient3 = new Patient(3, "Petrova", "Nадя", "Vadimovich", "Masherova 12",
			"033315845", 11, "vkmkdfs");
	Patient patient4 = new Patient(4, "Hrenova", "Гадя", "Petrovich", "Gagi 85",
			"88561248", 0, "d,llnnii");
	patients[0] = patient1;
	patients[1] = patient2;
	patients[2] = patient3;
	patients[3] =  patient4;
	System.out.println("--------Task a----------");
	System.out.println();
	for (Patient patient : patients) {
		if (patient.getDiagnoz().equals("dblbil")) {
			System.out.println(patient);
			}
		}
	System.out.println("------Task b-----------");
	System.out.println();
	for (Patient patient : patients) {
		if (patient.getMedicina() < 20 && patient.getMedicina() > 10) {
			System.out.println(patient);
			}
		}
	}	
}
