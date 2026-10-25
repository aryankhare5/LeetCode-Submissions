class Solution {
    public boolean strongPasswordCheckerII(String password) {

        String special = "!@#$%^&*()-+";


        if(password.length()>=8){
            Boolean hasUpper = false;
            Boolean hasLower = false;
            Boolean hasDig = false;
            Boolean hasSpecial = false;
            Boolean hasSame = true;
            for (int i = 0; i < password.length(); i++) {
                if(i<password.length()-1 && password.charAt(i) == password.charAt(i+1)) hasSame = false;

                char ch = password.charAt(i);
                if(Character.isLowerCase(ch)) hasLower = true;
                else if( Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isDigit(ch)) hasDig = true;
                else if (special.indexOf(ch) != -1) hasSpecial = true;
            }
            if (hasLower && hasUpper && hasDig && hasSpecial && hasSame){
                return true;
            } else return false;
        } else return false;




    }
}