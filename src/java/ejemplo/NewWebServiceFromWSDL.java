/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import javax.jws.WebService;

/**
 *
 * @author gadlewinsohn
 */
@WebService(serviceName = "GlobalWeather", portName = "GlobalWeatherHttpPost", endpointInterface = "net.webservicex.GlobalWeatherHttpPost", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/globalweather.asmx.wsdl")
public class NewWebServiceFromWSDL {

    public java.lang.String getWeather(java.lang.String cityName, java.lang.String countryName) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String getCitiesByCountry(java.lang.String countryName) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
