package com.dgut.entity;

import java.util.Date;

public class Appointment {
    private Integer id;

    private Date appointmentDate;

    private Integer teacherId;

    private Integer studentId;

    private Integer organiser;

    private Integer status;

    private String teacherName;

    private Integer teacherRequirementId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getOrganiser() {
        return organiser;
    }

    public void setOrganiser(Integer organiser) {
        this.organiser = organiser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherRequirementId() {
        return teacherRequirementId;
    }

    public void setTeacherRequirementId(Integer teacherRequirementId) {
        this.teacherRequirementId = teacherRequirementId;
    }
}