package com.example.officebuilding.dao;

import com.example.officebuilding.dtos.BuildingEmployeeDTO;
import com.example.officebuilding.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

@Repository
public class BuildingEmployeeDAO {


    public void updateBuildingEmployee(Integer empId, Integer salaryId, BuildingEmployeeDTO buildingEmployeeDTO){
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            NativeQuery query = session.createSQLQuery("UPDATE building_employee SET address = :address, date_of_birth = :dob,name = :name,phone_no = :phoneNo,position = :position ,salary_id = :salaryId WHERE (id = :id)" );
            query.setParameter("id",empId);
            query.setParameter("address",buildingEmployeeDTO.getAddress());
            query.setParameter("dob",buildingEmployeeDTO.getDateOfBirth());
            query.setParameter("name",buildingEmployeeDTO.getName());
            query.setParameter("phoneNo",buildingEmployeeDTO.getPhoneNo());
            query.setParameter("position",buildingEmployeeDTO.getPosition());
            query.setParameter("salaryId",salaryId);
            query.executeUpdate();
            session.getTransaction().commit();
        }catch(Exception e){
            if(session.getTransaction() != null) session.getTransaction().rollback();

        }
    }
}
