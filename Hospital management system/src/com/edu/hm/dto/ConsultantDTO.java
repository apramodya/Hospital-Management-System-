/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.hm.dto;

/**
 *
 * @author Jinadi
 */
public class ConsultantDTO {

    public ConsultantDTO(String cid, EmployeeDTO employeeDTO, WardDTO wardDTO, String speciality) {
        this.cid = cid;
        this.employeeDTO = employeeDTO;
        this.wardDTO = wardDTO;
        this.speciality = speciality;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the employeeDTO
     */
    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    /**
     * @param employeeDTO the employeeDTO to set
     */
    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    /**
     * @return the wardDTO
     */
    public WardDTO getWardDTO() {
        return wardDTO;
    }

    /**
     * @param wardDTO the wardDTO to set
     */
    public void setWardDTO(WardDTO wardDTO) {
        this.wardDTO = wardDTO;
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    private String cid;
    private EmployeeDTO employeeDTO;
    private WardDTO wardDTO;
    private String speciality;
}
