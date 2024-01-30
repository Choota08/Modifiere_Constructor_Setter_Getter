package Modifire;


public class Person {
        private String username;  //modifier
        private String password;
        
        
        public Person(String username, String password) { //consturctor
            this.username = username;
            this.password = password; 
        }
        public void setusername(String username){
            this.username = username;
        }
        public void setpassword(String password){
            this.password = password;
        }
        public String getusername(){
            return this.username;
        }
        public String getpassword(){
            return this.password;
        }
}
