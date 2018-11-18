
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
        System.out.println(validatePhone("111-222-3333"));
        System.out.println(validatePhone("111-222-333"));
        System.out.println(validatePhone("111-22233933"));
        System.out.println(validatePhone("1110222-3333"));
    }
}
