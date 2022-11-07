package com.liliana;
import com.liliana.DAO.DentistDAOH2;
import com.liliana.entity.Dentist;
import com.liliana.service.DentistService;
import org.junit.Test;

import java.sql.SQLException;

import static junit.framework.TestCase.assertEquals;


public class DentistTest {

    @Test
    public void updatePatient() throws SQLException {
        //Given
        Dentist dentist1 =  new Dentist(996, 9874, "Stark", "Sansa");
        Dentist dentist2 =  new Dentist(996, 9874, "Stark", "Arya");
        DentistService dentistService =  new DentistService();
        dentistService.setDentistDAO(new DentistDAOH2());

        //When
        dentistService.addDentist(dentist1);
        Dentist updatedPatient = dentistService.updateDentist(dentist2);
        String realName = "Arya";

        //Then
        assertEquals(realName,updatedPatient.getName());

    }

}


