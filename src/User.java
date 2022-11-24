public class User {

   private int userID;
   private String userName;
   private String firstName, lastName;

    User(int userId, String userName, String firstName, String lastName) {
        this.userID = userID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
   }

//   void setuserID(int userID) {
//        this.userID =  userID;
//   }

   int getUserID() {
       return userID;
   }

   String getFirstName() {
        return firstName;
   }

    String getUserName() {
        return userName;
    }

    String getLastName() {
        return lastName;
    }


   void FirstName(String firstName) {
       this.firstName = firstName;
   }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
