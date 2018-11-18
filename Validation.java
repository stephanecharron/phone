
public class Validation {
    public static boolean validatePhone (String phone) {

        if (phone.length() != 12){
            return false;
        }

        if(phone.charAt(3) != '-' || phone.charAt(7) != '-'){
            return false;
        }

        phone = phone.replaceAll("-","");

        for (int i =0 ; i< phone.length(); i++){
            if(!Character.isDigit(phone.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        String t1 = "111-222-3333";
        String t2 = "111-222-3m33";
        String t3 = "111-222-333";
        String t4 = "111-22233933";
        String t5 = "1110222-3333";

        System.out.println(validatePhone(t1));
        System.out.println(validatePhone(t2));
        System.out.println(validatePhone(t3));
        System.out.println(validatePhone(t4));
        System.out.println(validatePhone(t5));

        String phoneRegex = "([0-9]{3}-){2}([0-9]){4}";

        System.out.println(t1.matches(phoneRegex));
        System.out.println(t2.matches(phoneRegex));
        System.out.println(t3.matches(phoneRegex));
        System.out.println(t4.matches(phoneRegex));
        System.out.println(t5.matches(phoneRegex));
    }
}
