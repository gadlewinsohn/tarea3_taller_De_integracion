/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;


/**
 *
 * @author gadlewinsohn
 */
@WebService(serviceName = "Paises")
public class Paises {

    /**
     * This is a sample web service operation
     * @param pais
     * @return 
     */
    @WebMethod(operationName = "obtenerCiudades")
    public String[] obtenerCiudades(@WebParam(name = "pais") String pais) {
        GlobalWeather gw = new GlobalWeather();
        GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
        
        Airport aero = new Airport();
        AirportSoap aerosoap;
        aerosoap = aero.getAirportSoap();
        String aeropuertos = aerosoap.getAirportInformationByCountry(pais);
        String cities = gwSoap.getCitiesByCountry(pais);
        
        String[] ciudades_aeropuertos = new String[2];
        ciudades_aeropuertos[0] = cities;
        ciudades_aeropuertos[1] = aeropuertos;
        
       
        return ciudades_aeropuertos;
    }
}
