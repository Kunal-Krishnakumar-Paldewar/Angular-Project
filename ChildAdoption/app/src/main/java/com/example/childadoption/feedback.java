package com.example.childadoption;

public class feedback {

        String feedbackid;
        String username,feedback,email;


        public feedback(String feedbackid,String username,String feedback,String email){
            this.feedbackid=feedbackid;
            this.username=username;
            this.feedback=feedback;
            this.email=email;
        }


        public String getFeedbackid() {
            return feedbackid;
        }

        public String getUsername() {
            return username;
        }

        public String getFeedback() {
            return feedback;
        }

        public String getEmail(){
            return email;
        }

}
