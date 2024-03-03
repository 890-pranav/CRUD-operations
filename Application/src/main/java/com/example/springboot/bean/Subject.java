package com.example.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

    private String Applicant_Name;
    private String Gender;
    private String District;
    private String state;
    private String Pincode;
    private String ownership;
    private String GovtID_Type;
    @Id
    private String ID_Number;
    private String Category;
    private String Load_Applied;
    private String Date_of_Application;
    private String Date_of_Approval;
    private String Modified_Date;
    private String Status;
    private String Reviewer_ID;
    private String Reviewer_Name;
    private String Reviewer_Comments;

    public Subject() {

    }

    public Subject(String applicant_Name, String gender, String district, String state, String pincode, String ownership, String govtID_Type, String ID_Number, String category, String load_Applied, String date_of_Application, String date_of_Approval, String modified_Date, String status, String reviewer_ID, String reviewer_Name, String reviewer_Comments) {
        Applicant_Name = applicant_Name;
        Gender = gender;
        District = district;
        this.state = state;
        Pincode = pincode;
        this.ownership = ownership;
        GovtID_Type = govtID_Type;
        this.ID_Number = ID_Number;
        Category = category;
        Load_Applied = load_Applied;
        Date_of_Application = date_of_Application;
        Date_of_Approval = date_of_Approval;
        Modified_Date = modified_Date;
        Status = status;
        Reviewer_ID = reviewer_ID;
        Reviewer_Name = reviewer_Name;
        Reviewer_Comments = reviewer_Comments;
    }

    public String getApplicant_Name() {
        return Applicant_Name;
    }

    public void setApplicant_Name(String applicant_Name) {
        Applicant_Name = applicant_Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGovtID_Type() {
        return GovtID_Type;
    }

    public void setGovtID_Type(String govtID_Type) {
        GovtID_Type = govtID_Type;
    }

    public String getID_Number() {
        return ID_Number;
    }

    public void setID_Number(String ID_Number) {
        this.ID_Number = ID_Number;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getLoad_Applied() {
        return Load_Applied;
    }

    public void setLoad_Applied(String load_Applied) {
        Load_Applied = load_Applied;
    }

    public String getDate_of_Application() {
        return Date_of_Application;
    }

    public void setDate_of_Application(String date_of_Application) {
        Date_of_Application = date_of_Application;
    }

    public String getDate_of_Approval() {
        return Date_of_Approval;
    }

    public void setDate_of_Approval(String date_of_Approval) {
        Date_of_Approval = date_of_Approval;
    }

    public String getModified_Date() {
        return Modified_Date;
    }

    public void setModified_Date(String modified_Date) {
        Modified_Date = modified_Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getReviewer_ID() {
        return Reviewer_ID;
    }

    public void setReviewer_ID(String reviewer_ID) {
        Reviewer_ID = reviewer_ID;
    }

    public String getReviewer_Name() {
        return Reviewer_Name;
    }

    public void setReviewer_Name(String reviewer_Name) {
        Reviewer_Name = reviewer_Name;
    }

    public String getReviewer_Comments() {
        return Reviewer_Comments;
    }

    public void setReviewer_Comments(String reviewer_Comments) {
        Reviewer_Comments = reviewer_Comments;
    }
}
