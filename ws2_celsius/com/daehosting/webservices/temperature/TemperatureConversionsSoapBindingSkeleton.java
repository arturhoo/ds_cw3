/**
 * TemperatureConversionsSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.daehosting.webservices.temperature;

public class TemperatureConversionsSoapBindingSkeleton implements com.daehosting.webservices.temperature.TemperatureConversionsSoapType, org.apache.axis.wsdl.Skeleton {
    private com.daehosting.webservices.temperature.TemperatureConversionsSoapType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "nCelcius"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("celciusToFahrenheit", _params, new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "CelciusToFahrenheitResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "CelciusToFahrenheit"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("celciusToFahrenheit") == null) {
            _myOperations.put("celciusToFahrenheit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("celciusToFahrenheit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "nFahrenheit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fahrenheitToCelcius", _params, new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "FahrenheitToCelciusResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "FahrenheitToCelcius"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fahrenheitToCelcius") == null) {
            _myOperations.put("fahrenheitToCelcius", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fahrenheitToCelcius")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "nCelcius"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "nWindSpeed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("windChillInCelcius", _params, new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "WindChillInCelciusResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "WindChillInCelcius"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("windChillInCelcius") == null) {
            _myOperations.put("windChillInCelcius", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("windChillInCelcius")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "nFahrenheit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "nWindSpeed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("windChillInFahrenheit", _params, new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "WindChillInFahrenheitResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.daehosting.com/temperature", "WindChillInFahrenheit"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("windChillInFahrenheit") == null) {
            _myOperations.put("windChillInFahrenheit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("windChillInFahrenheit")).add(_oper);
    }

    public TemperatureConversionsSoapBindingSkeleton() {
        this.impl = new com.daehosting.webservices.temperature.TemperatureConversionsSoapBindingImpl();
    }

    public TemperatureConversionsSoapBindingSkeleton(com.daehosting.webservices.temperature.TemperatureConversionsSoapType impl) {
        this.impl = impl;
    }
    public java.math.BigDecimal celciusToFahrenheit(java.math.BigDecimal nCelcius) throws java.rmi.RemoteException
    {
        java.math.BigDecimal ret = impl.celciusToFahrenheit(nCelcius);
        return ret;
    }

    public java.math.BigDecimal fahrenheitToCelcius(java.math.BigDecimal nFahrenheit) throws java.rmi.RemoteException
    {
        java.math.BigDecimal ret = impl.fahrenheitToCelcius(nFahrenheit);
        return ret;
    }

    public java.math.BigDecimal windChillInCelcius(java.math.BigDecimal nCelcius, java.math.BigDecimal nWindSpeed) throws java.rmi.RemoteException
    {
        java.math.BigDecimal ret = impl.windChillInCelcius(nCelcius, nWindSpeed);
        return ret;
    }

    public java.math.BigDecimal windChillInFahrenheit(java.math.BigDecimal nFahrenheit, java.math.BigDecimal nWindSpeed) throws java.rmi.RemoteException
    {
        java.math.BigDecimal ret = impl.windChillInFahrenheit(nFahrenheit, nWindSpeed);
        return ret;
    }

}
