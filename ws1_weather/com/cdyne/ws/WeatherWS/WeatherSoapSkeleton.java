/**
 * WeatherSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public class WeatherSoapSkeleton implements com.cdyne.ws.WeatherWS.WeatherSoap, org.apache.axis.wsdl.Skeleton {
    private com.cdyne.ws.WeatherWS.WeatherSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getWeatherInformation", _params, new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "GetWeatherInformationResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ArrayOfWeatherDescription"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "GetWeatherInformation"));
        _oper.setSoapAction("http://ws.cdyne.com/WeatherWS/GetWeatherInformation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getWeatherInformation") == null) {
            _myOperations.put("getWeatherInformation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getWeatherInformation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ZIP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCityForecastByZIP", _params, new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "GetCityForecastByZIPResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ForecastReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "GetCityForecastByZIP"));
        _oper.setSoapAction("http://ws.cdyne.com/WeatherWS/GetCityForecastByZIP");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCityForecastByZIP") == null) {
            _myOperations.put("getCityForecastByZIP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCityForecastByZIP")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "ZIP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCityWeatherByZIP", _params, new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "GetCityWeatherByZIPResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "WeatherReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://ws.cdyne.com/WeatherWS/", "GetCityWeatherByZIP"));
        _oper.setSoapAction("http://ws.cdyne.com/WeatherWS/GetCityWeatherByZIP");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCityWeatherByZIP") == null) {
            _myOperations.put("getCityWeatherByZIP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCityWeatherByZIP")).add(_oper);
    }

    public WeatherSoapSkeleton() {
        this.impl = new com.cdyne.ws.WeatherWS.WeatherSoapImpl();
    }

    public WeatherSoapSkeleton(com.cdyne.ws.WeatherWS.WeatherSoap impl) {
        this.impl = impl;
    }
    public com.cdyne.ws.WeatherWS.WeatherDescription[] getWeatherInformation() throws java.rmi.RemoteException
    {
        com.cdyne.ws.WeatherWS.WeatherDescription[] ret = impl.getWeatherInformation();
        return ret;
    }

    public com.cdyne.ws.WeatherWS.ForecastReturn getCityForecastByZIP(java.lang.String ZIP) throws java.rmi.RemoteException
    {
        com.cdyne.ws.WeatherWS.ForecastReturn ret = impl.getCityForecastByZIP(ZIP);
        return ret;
    }

    public com.cdyne.ws.WeatherWS.WeatherReturn getCityWeatherByZIP(java.lang.String ZIP) throws java.rmi.RemoteException
    {
        com.cdyne.ws.WeatherWS.WeatherReturn ret = impl.getCityWeatherByZIP(ZIP);
        return ret;
    }

}
