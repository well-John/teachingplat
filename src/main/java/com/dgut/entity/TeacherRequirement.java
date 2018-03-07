package com.dgut.entity;

import java.util.Date;

public class TeacherRequirement {
    private Integer id;

    private Integer studentId;

    private String concat;

    private Integer sex;

    private String age;

    private String grade;

    private String phone;

    private String email;

    private String area;

    private String address;

    private String subject;

    private String studentDescription;

    private Integer studentLevel;

    private String teachingTime;

    private Integer requireCount;

    private Integer requireSex;

    private Integer identity;

    private String requirement;

    private String payment;

    private String teachingType;

    private Integer ridingAllowance;

    private Date releaseTime;

    private Integer releaseStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getConcat() {
        return concat;
    }

    public void setConcat(String concat) {
        this.concat = concat == null ? null : concat.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getStudentDescription() {
        return studentDescription;
    }

    public void setStudentDescription(String studentDescription) {
        this.studentDescription = studentDescription == null ? null : studentDescription.trim();
    }

    public Integer getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(Integer studentLevel) {
        this.studentLevel = studentLevel;
    }

    public String getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(String teachingTime) {
        this.teachingTime = teachingTime == null ? null : teachingTime.trim();
    }

    public Integer getRequireCount() {
        return requireCount;
    }

    public void setRequireCount(Integer requireCount) {
        this.requireCount = requireCount;
    }

    public Integer getRequireSex() {
        return requireSex;
    }

    public void setRequireSex(Integer requireSex) {
        this.requireSex = requireSex;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getTeachingType() {
        return teachingType;
    }

    public void setTeachingType(String teachingType) {
        this.teachingType = teachingType == null ? null : teachingType.trim();
    }

    public Integer getRidingAllowance() {
        return ridingAllowance;
    }

    public void setRidingAllowance(Integer ridingAllowance) {
        this.ridingAllowance = ridingAllowance;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(Integer releaseStatus) {
        this.releaseStatus = releaseStatus;
    }
}