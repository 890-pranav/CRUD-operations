package com.example.Application.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name="Applicants")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Number;
    @JsonProperty("Applicant_Name")
    private String applicant_Name;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("District")
    private String district;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Pincode")
    private String pincode;
    @JsonProperty("Ownership")
    private String ownership;
    @JsonProperty("GovtID_Type")
    private String govtID_Type;
    @JsonProperty("ID_Number")
    private Long ID_Number;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("Load_Applied_in_KV")
    private String load_Applied;
    @JsonProperty("Date_of_Approval")
    private String date_of_Approval;
    @JsonProperty("Modified_Date")
    private String modified_Date;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Reviewer_ID")
    private String reviewer_ID;
    @JsonProperty("Reviewer_Name")
    private String reviewer_Name;
    @JsonProperty("Reviewer_Comments")
    private String reviewer_Comments;

    public Subject(){
    }

    public Subject(Long number, String applicant_Name, String gender, String district, String state, String pincode, String ownership, String govtID_Type, Long ID_Number, String category, String load_Applied, String date_of_Approval, String modified_Date, String status, String reviewer_ID, String reviewer_Name, String reviewer_Comments) {
        this.Number = number;
        this.applicant_Name = applicant_Name;
        this.gender = gender;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
        this.ownership = ownership;
        this.govtID_Type = govtID_Type;
        this.ID_Number = ID_Number;
        this.category = category;
        this.load_Applied = load_Applied;
        this.date_of_Approval = date_of_Approval;
        this.modified_Date = modified_Date;
        this.status = status;
        this.reviewer_ID = reviewer_ID;
        this.reviewer_Name = reviewer_Name;
        this.reviewer_Comments = reviewer_Comments;
    }
    public Long getNumber(){ return Number;}

    public void setNumber(Long Number){ this.Number = Number;}
    public String getapplicant_Name() {
        return applicant_Name;
    }

    public void setapplicant_Name(String applicant_Name) {
        this.applicant_Name = applicant_Name;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getdistrict() {
        return district;
    }

    public void setdistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getpincode() {
        return pincode;
    }

    public void setpincode(String pincode) {
        this.pincode = pincode;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getgovtID_Type() {
        return govtID_Type;
    }

    public void setgovtID_Type(String govtID_Type) {
        this.govtID_Type = govtID_Type;
    }

    public Long getID_Number() {
        return ID_Number;
    }

    public void setID_Number(Long ID_Number) {
        this.ID_Number = ID_Number;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getload_Applied() {
        return load_Applied;
    }

    public void setload_Applied(String load_Applied) {
        this.load_Applied = load_Applied;
    }

    public String getdate_of_Approval() {
        return date_of_Approval;
    }

    public void setdate_of_Approval(String date_of_Approval) {
        this.date_of_Approval = date_of_Approval;
    }

    public String getmodified_Date() {
        return modified_Date;
    }

    public void setmodified_Date(String modified_Date) {
        this.modified_Date = modified_Date;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public String getreviewer_ID() {
        return reviewer_ID;
    }

    public void setreviewer_ID(String reviewer_ID) {
        this.reviewer_ID = reviewer_ID;
    }

    public String getreviewer_Name() {
        return reviewer_Name;
    }

    public void setreviewer_Name(String reviewer_Name) {
        this.reviewer_Name = reviewer_Name;
    }

    public String getreviewer_Comments() {
        return reviewer_Comments;
    }

    public void setreviewer_Comments(String reviewer_Comments) {
        this.reviewer_Comments = reviewer_Comments;
    }
}
