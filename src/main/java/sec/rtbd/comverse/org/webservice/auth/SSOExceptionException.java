
/**
 * SSOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package sec.rtbd.comverse.org.webservice.auth;

public class SSOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1409928781594L;
    
    private sec.rtbd.comverse.org.webservice.auth.SSOExceptionE faultMessage;

    
        public SSOExceptionException() {
            super("SSOExceptionException");
        }

        public SSOExceptionException(java.lang.String s) {
           super(s);
        }

        public SSOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SSOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(sec.rtbd.comverse.org.webservice.auth.SSOExceptionE msg){
       faultMessage = msg;
    }
    
    public sec.rtbd.comverse.org.webservice.auth.SSOExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    