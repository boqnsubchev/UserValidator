package UserInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Scanner sc = new Scanner(System.in);

        while (firstPerson.getName()==null) {
            System.out.print("Enter name in format Name Middlename Surname: ");
            firstPerson.setName(sc.nextLine());
        }
        boolean isPerson;
        String egnEik ;
        while (true){
            System.out.println("Enter either egn or eik (person or business)");
            egnEik = sc.next();
            if(egnEik.equalsIgnoreCase("EGN")){
                isPerson = true;
                break;
            }
            else if(egnEik.equalsIgnoreCase("EIK")){
                isPerson = false;
                break;
            }
            else { System.out.println("Incorrect Input!");}
        }

        if(isPerson){
            while (firstPerson.getEgn()==null){
                System.out.println("Enter egn: ");
                firstPerson.setEgn(sc.next());
            }
        }
        else {
            while (firstPerson.getEik()==null){
                System.out.println("Enter eik: ");
                firstPerson.setEik(sc.next());
            }
        }

        while (firstPerson.getEmail()==null){
            System.out.println("Enter email: ");
            firstPerson.setEmail(sc.next());
        }

        while (firstPerson.getFacKey()==null){
            System.out.println("Enter facility key in format [XX-XXX]");
            firstPerson.setFacKey(sc.next());
        }
        printResult(firstPerson, egnEik);
    }
    public static void printResult(Person inputPerson, String egnEik){
        System.out.println("User Info:");
        System.out.println("Name: "+inputPerson.getName());
        if(egnEik.equalsIgnoreCase("EGN")){
            System.out.println("EGN: "+inputPerson.getEgn());
        }
        else { System.out.println("EIK: "+inputPerson.getEik()); }
        System.out.println("Email: "+inputPerson.getEmail());
        System.out.println("Facility Key: "+inputPerson.getFacKey());
    }
}
