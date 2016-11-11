package UserInfo;

import java.util.regex.Pattern;

public class Person {
    private String name;
    private String egn;
    private String eik;
    private String email;
    private String facKey;


    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        if(!validateName(inputName)) {
            System.out.println("Incorrect name!");
            return;
        }
        this.name = inputName;
    }

    public String getEgn(){
        return egn;
    }

    public void setEgn(String inputEgn){
        if(!validateEgn(inputEgn)){
            System.out.println("Incorrect egn!");
            return;
        }
        this.egn = inputEgn;
    }

    public String getEik(){
        return eik;
    }

    public void setEik(String inputEik) {
        if(!validateEik(inputEik)){
            System.out.println("Incorrect eik!");
            return;
        }
        this.eik = inputEik;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String inputEmail) {
        if(!validateEmail(inputEmail)){
            System.out.println("Incorrect email!");
            return;
        }
        this.email = inputEmail;
    }

    public String getFacKey() {
        return facKey;
    }

    public void setFacKey(String inputFacKey) {
        if(!validateFacKey(inputFacKey)){
            System.out.println("Incorrect Facility Key!");
            return;
        }
        this.facKey = inputFacKey;
    }

    private boolean validateName(String username) {
        String name_pattern = "[a-zA-Z]{1,50} [a-zA-Z]{1,50} [a-zA-Z]{1,50}";
        return Pattern.compile(name_pattern).matcher(username).matches();
    }

    private boolean validateEgn(String egn){
        String  egn_pattern = "[0-9]{2}[0-1][0-9][0-3][0-9][0-9]{4}";
        return Pattern.compile(egn_pattern).matcher(egn).matches();
    }

    private boolean validateEik(String eik){
        String eik_pattern = "[0-9]{9}";
        return Pattern.compile(eik_pattern).matcher(eik).matches();
    }

    private boolean validateEmail(String email){
        String email_pattern = "^[^.].{1,64}@[a-zA-Z0-9-.]{1,63}";
        return Pattern.compile(email_pattern).matcher(email).matches();
    }

    private boolean validateFacKey(String facKey){
        String facKey_pattern = "[0-9]{2}-[0-9]{3}";
        return Pattern.compile(facKey_pattern).matcher(facKey).matches();
    }
}
