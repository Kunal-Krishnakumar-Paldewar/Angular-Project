package com.example.childadoption;

public class Donor {
    String donorid, donorname;

   String contact_no,amount;

    public Donor(String id, String name, String phone, String amt) {
        this.donorid = id;
        this.donorname = name;
        this.contact_no = phone;
        this.amount=amt;

    }



    public String getDonorid () {
            return donorid;
        }

        public String getDonorname () {
            return donorname;
        }


        public String getContact_no () {
            return contact_no;
        }
        public String getAmount(){
            return amount;
        }


    }

