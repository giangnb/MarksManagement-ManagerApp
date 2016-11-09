
package com.client.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ApplicationWebService", targetNamespace = "http://ws.marksmana.com/", wsdlLocation = "http://marksmanager.56mfu9rwbj.us-east-1.elasticbeanstalk.com/ApplicationWebService?wsdl")
public class ApplicationWebService_Service
    extends Service
{

    private final static URL APPLICATIONWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException APPLICATIONWEBSERVICE_EXCEPTION;
    private final static QName APPLICATIONWEBSERVICE_QNAME = new QName("http://ws.marksmana.com/", "ApplicationWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://marksmanager.56mfu9rwbj.us-east-1.elasticbeanstalk.com/ApplicationWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APPLICATIONWEBSERVICE_WSDL_LOCATION = url;
        APPLICATIONWEBSERVICE_EXCEPTION = e;
    }

    public ApplicationWebService_Service() {
        super(__getWsdlLocation(), APPLICATIONWEBSERVICE_QNAME);
    }

    public ApplicationWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), APPLICATIONWEBSERVICE_QNAME, features);
    }

    public ApplicationWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, APPLICATIONWEBSERVICE_QNAME);
    }

    public ApplicationWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APPLICATIONWEBSERVICE_QNAME, features);
    }

    public ApplicationWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ApplicationWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ApplicationWebService
     */
    @WebEndpoint(name = "ApplicationWebServicePort")
    public ApplicationWebService getApplicationWebServicePort() {
        return super.getPort(new QName("http://ws.marksmana.com/", "ApplicationWebServicePort"), ApplicationWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ApplicationWebService
     */
    @WebEndpoint(name = "ApplicationWebServicePort")
    public ApplicationWebService getApplicationWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.marksmana.com/", "ApplicationWebServicePort"), ApplicationWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APPLICATIONWEBSERVICE_EXCEPTION!= null) {
            throw APPLICATIONWEBSERVICE_EXCEPTION;
        }
        return APPLICATIONWEBSERVICE_WSDL_LOCATION;
    }

}
