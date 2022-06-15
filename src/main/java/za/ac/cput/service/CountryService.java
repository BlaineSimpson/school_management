/*
CountryService.java
Service interface for country
Author: Demi Farquhar (220322104)
Date: 15 June 2022
 */
package za.ac.cput.service;
import za.ac.cput.domain.Country;
import java.util.List;

public interface CountryService extends IService<Country,String>{
    List<Country> findAll();

}
