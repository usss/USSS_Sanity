
/**
 * ApiExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.comverse.www;

public class ApiExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1410166014568L;
    
    private com.comverse.www.ApiException faultMessage;

    
        public ApiExceptionException() {
            super("ApiExceptionException");
        }

        public ApiExceptionException(java.lang.String s) {
           super(s);
        }

        public ApiExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ApiExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.comverse.www.ApiException msg){
       faultMessage = msg;
    }
    
    public com.comverse.www.ApiException getFaultMessage(){
       return faultMessage;
    }
}
    