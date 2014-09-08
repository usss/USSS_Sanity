
/**
 * SAMLSignOnServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package sec.rtbd.comverse.org.webservice.auth;

        

        /*
        *  SAMLSignOnServiceStub java implementation
        */

        
        public class SAMLSignOnServiceStub extends org.apache.axis2.client.Stub
        implements SAMLSignOnService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("SAMLSignOnService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[34];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "listGroups"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "processLogin"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "addUserAttributes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "disableUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "getSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "addRole"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "listRealms"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "listUsers"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "addRealm"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "removeGroup"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "enableUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "getGroup"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "getRole"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "removeRealm"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "unlockUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "updateUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "isProductionSite"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "removeUserAttributes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "changePassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "listRoles"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "removeRole"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "lockUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "addGroup"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "proxyLogin"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "changeUserAttributes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "removeUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "updateRealm"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "processLogout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[27]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "updateGroup"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[28]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "getRealm"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[29]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "resetPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[30]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "updateRole"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[31]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "addUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[32]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth", "getUser"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[33]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listGroups"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listGroups"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listGroups"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "processLogin"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "processLogin"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "processLogin"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "disableUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "disableUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "disableUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listRealms"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listRealms"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listRealms"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listUsers"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listUsers"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listUsers"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "enableUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "enableUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "enableUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "unlockUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "unlockUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "unlockUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "changePassword"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "changePassword"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "changePassword"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listRoles"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listRoles"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "listRoles"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "lockUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "lockUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "lockUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "proxyLogin"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "proxyLogin"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "proxyLogin"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "changeUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "changeUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "changeUserAttributes"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "removeUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "processLogout"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "processLogout"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "processLogout"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateGroup"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getRealm"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "resetPassword"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "resetPassword"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "resetPassword"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "updateRole"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "addUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth","SSOException"), "getUser"),"sec.rtbd.comverse.org.webservice.auth.SSOExceptionE");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public SAMLSignOnServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public SAMLSignOnServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public SAMLSignOnServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://192.168.112.49:8443/SAMLSignOnWS" );
                
    }

    /**
     * Default Constructor
     */
    public SAMLSignOnServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://192.168.112.49:8443/SAMLSignOnWS" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public SAMLSignOnServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#listGroups
                     * @param listGroups0
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE listGroups(

                            sec.rtbd.comverse.org.webservice.auth.ListGroupsE listGroups0)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/listGroupsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listGroups0,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listGroups")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listGroups"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listGroups"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listGroups"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listGroups"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#processLogin
                     * @param processLogin2
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE processLogin(

                            sec.rtbd.comverse.org.webservice.auth.ProcessLoginE processLogin2)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/processLoginRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    processLogin2,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "processLogin")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "processLogin"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processLogin"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processLogin"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processLogin"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#addUserAttributes
                     * @param addUserAttributes4
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE addUserAttributes(

                            sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE addUserAttributes4)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/addUserAttributesRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addUserAttributes4,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addUserAttributes")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addUserAttributes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserAttributes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserAttributes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUserAttributes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#disableUser
                     * @param disableUser6
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE disableUser(

                            sec.rtbd.comverse.org.webservice.auth.DisableUserE disableUser6)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/disableUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    disableUser6,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "disableUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "disableUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"disableUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"disableUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"disableUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#getSession
                     * @param getSession8
                    
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE getSession(

                            sec.rtbd.comverse.org.webservice.auth.GetSessionE getSession8)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/getSessionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getSession8,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getSession")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getSession"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getSession"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getSession"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getSession"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#addRole
                     * @param addRole10
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE addRole(

                            sec.rtbd.comverse.org.webservice.auth.AddRoleE addRole10)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/addRoleRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addRole10,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addRole")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addRole"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addRole"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addRole"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addRole"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#listRealms
                     * @param listRealms12
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE listRealms(

                            sec.rtbd.comverse.org.webservice.auth.ListRealmsE listRealms12)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/listRealmsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listRealms12,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listRealms")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listRealms"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listRealms"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listRealms"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listRealms"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#listUsers
                     * @param listUsers14
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE listUsers(

                            sec.rtbd.comverse.org.webservice.auth.ListUsersE listUsers14)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/listUsersRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listUsers14,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listUsers")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listUsers"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listUsers"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listUsers"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listUsers"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#addRealm
                     * @param addRealm16
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE addRealm(

                            sec.rtbd.comverse.org.webservice.auth.AddRealmE addRealm16)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/addRealmRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addRealm16,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addRealm")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addRealm"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addRealm"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addRealm"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addRealm"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#removeGroup
                     * @param removeGroup18
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE removeGroup(

                            sec.rtbd.comverse.org.webservice.auth.RemoveGroupE removeGroup18)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/removeGroupRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeGroup18,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeGroup")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeGroup"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeGroup"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeGroup"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeGroup"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#enableUser
                     * @param enableUser20
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE enableUser(

                            sec.rtbd.comverse.org.webservice.auth.EnableUserE enableUser20)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/enableUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    enableUser20,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "enableUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "enableUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"enableUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"enableUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"enableUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#getGroup
                     * @param getGroup22
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE getGroup(

                            sec.rtbd.comverse.org.webservice.auth.GetGroupE getGroup22)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/getGroupRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getGroup22,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getGroup")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getGroup"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getGroup"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getGroup"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getGroup"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#getRole
                     * @param getRole24
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE getRole(

                            sec.rtbd.comverse.org.webservice.auth.GetRoleE getRole24)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/getRoleRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRole24,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getRole")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getRole"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRole"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRole"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRole"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#removeRealm
                     * @param removeRealm26
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE removeRealm(

                            sec.rtbd.comverse.org.webservice.auth.RemoveRealmE removeRealm26)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/removeRealmRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeRealm26,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeRealm")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeRealm"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeRealm"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeRealm"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeRealm"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#unlockUser
                     * @param unlockUser28
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE unlockUser(

                            sec.rtbd.comverse.org.webservice.auth.UnlockUserE unlockUser28)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/unlockUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    unlockUser28,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "unlockUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "unlockUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unlockUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unlockUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"unlockUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#updateUser
                     * @param updateUser30
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE updateUser(

                            sec.rtbd.comverse.org.webservice.auth.UpdateUserE updateUser30)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/updateUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateUser30,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#isProductionSite
                     * @param isProductionSite32
                    
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE isProductionSite(

                            sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE isProductionSite32)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/isProductionSiteRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    isProductionSite32,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "isProductionSite")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "isProductionSite"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isProductionSite"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isProductionSite"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"isProductionSite"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#removeUserAttributes
                     * @param removeUserAttributes34
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE removeUserAttributes(

                            sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE removeUserAttributes34)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/removeUserAttributesRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeUserAttributes34,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeUserAttributes")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeUserAttributes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserAttributes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserAttributes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUserAttributes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#changePassword
                     * @param changePassword36
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE changePassword(

                            sec.rtbd.comverse.org.webservice.auth.ChangePasswordE changePassword36)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/changePasswordRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changePassword36,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "changePassword")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "changePassword"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changePassword"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#listRoles
                     * @param listRoles38
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE listRoles(

                            sec.rtbd.comverse.org.webservice.auth.ListRolesE listRoles38)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/listRolesRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listRoles38,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listRoles")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "listRoles"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listRoles"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listRoles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"listRoles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#removeRole
                     * @param removeRole40
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE removeRole(

                            sec.rtbd.comverse.org.webservice.auth.RemoveRoleE removeRole40)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/removeRoleRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeRole40,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeRole")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeRole"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeRole"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeRole"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeRole"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#lockUser
                     * @param lockUser42
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.LockUserResponseE lockUser(

                            sec.rtbd.comverse.org.webservice.auth.LockUserE lockUser42)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/lockUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    lockUser42,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "lockUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "lockUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.LockUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.LockUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"lockUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"lockUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"lockUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#addGroup
                     * @param addGroup44
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE addGroup(

                            sec.rtbd.comverse.org.webservice.auth.AddGroupE addGroup44)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/addGroupRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addGroup44,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addGroup")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addGroup"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addGroup"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addGroup"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addGroup"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#proxyLogin
                     * @param proxyLogin46
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE proxyLogin(

                            sec.rtbd.comverse.org.webservice.auth.ProxyLoginE proxyLogin46)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/proxyLoginRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    proxyLogin46,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "proxyLogin")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "proxyLogin"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"proxyLogin"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"proxyLogin"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"proxyLogin"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#changeUserAttributes
                     * @param changeUserAttributes48
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE changeUserAttributes(

                            sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE changeUserAttributes48)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/changeUserAttributesRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeUserAttributes48,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "changeUserAttributes")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "changeUserAttributes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changeUserAttributes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changeUserAttributes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"changeUserAttributes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#removeUser
                     * @param removeUser50
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE removeUser(

                            sec.rtbd.comverse.org.webservice.auth.RemoveUserE removeUser50)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/removeUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    removeUser50,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "removeUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#updateRealm
                     * @param updateRealm52
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE updateRealm(

                            sec.rtbd.comverse.org.webservice.auth.UpdateRealmE updateRealm52)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/updateRealmRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateRealm52,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateRealm")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateRealm"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRealm"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRealm"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRealm"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#processLogout
                     * @param processLogout54
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE processLogout(

                            sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE processLogout54)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/processLogoutRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    processLogout54,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "processLogout")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "processLogout"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processLogout"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processLogout"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processLogout"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#updateGroup
                     * @param updateGroup56
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE updateGroup(

                            sec.rtbd.comverse.org.webservice.auth.UpdateGroupE updateGroup56)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/updateGroupRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateGroup56,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateGroup")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateGroup"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateGroup"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateGroup"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateGroup"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#getRealm
                     * @param getRealm58
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE getRealm(

                            sec.rtbd.comverse.org.webservice.auth.GetRealmE getRealm58)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/getRealmRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRealm58,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getRealm")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getRealm"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRealm"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRealm"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getRealm"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#resetPassword
                     * @param resetPassword60
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE resetPassword(

                            sec.rtbd.comverse.org.webservice.auth.ResetPasswordE resetPassword60)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/resetPasswordRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    resetPassword60,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "resetPassword")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "resetPassword"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resetPassword"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resetPassword"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resetPassword"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#updateRole
                     * @param updateRole62
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE updateRole(

                            sec.rtbd.comverse.org.webservice.auth.UpdateRoleE updateRole62)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/updateRoleRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateRole62,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateRole")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "updateRole"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRole"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRole"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateRole"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#addUser
                     * @param addUser64
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.AddUserResponseE addUser(

                            sec.rtbd.comverse.org.webservice.auth.AddUserE addUser64)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/addUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addUser64,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "addUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.AddUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.AddUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see sec.rtbd.comverse.org.webservice.auth.SAMLSignOnService#getUser
                     * @param getUser66
                    
                     * @throws sec.rtbd.comverse.org.webservice.auth.SSOExceptionException : 
                     */

                    

                            public  sec.rtbd.comverse.org.webservice.auth.GetUserResponseE getUser(

                            sec.rtbd.comverse.org.webservice.auth.GetUserE getUser66)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,sec.rtbd.comverse.org.webservice.auth.SSOExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
              _operationClient.getOptions().setAction("https://org.comverse.rtbd.sec/webservice/auth/SingleSignOnWS/getUserRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getUser66,
                                                    optimizeContent(new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getUser")), new javax.xml.namespace.QName("https://org.comverse.rtbd.sec/webservice/auth",
                                                    "getUser"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             sec.rtbd.comverse.org.webservice.auth.GetUserResponseE.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (sec.rtbd.comverse.org.webservice.auth.GetUserResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUser"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof sec.rtbd.comverse.org.webservice.auth.SSOExceptionException){
                          throw (sec.rtbd.comverse.org.webservice.auth.SSOExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://172.17.201.16:8443/SAMLSignOnWS
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListGroupsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListGroupsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.SSOExceptionE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ProcessLoginE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProcessLoginE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.DisableUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.DisableUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetSessionE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetSessionE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddRoleE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddRoleE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListRealmsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListRealmsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListUsersE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListUsersE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddRealmE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddRealmE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveGroupE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveGroupE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.EnableUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.EnableUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetGroupE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetGroupE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetRoleE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetRoleE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveRealmE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveRealmE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UnlockUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UnlockUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ChangePasswordE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ChangePasswordE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListRolesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListRolesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveRoleE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveRoleE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.LockUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.LockUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.LockUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.LockUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddGroupE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddGroupE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ProxyLoginE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProxyLoginE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateRealmE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateRealmE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateGroupE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateGroupE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetRealmE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetRealmE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ResetPasswordE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ResetPasswordE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateRoleE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateRoleE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.AddUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetUserE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetUserE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(sec.rtbd.comverse.org.webservice.auth.GetUserResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetUserResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ListGroupsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListGroupsE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ProcessLoginE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProcessLoginE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.DisableUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.DisableUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.GetSessionE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetSessionE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.AddRoleE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddRoleE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ListRealmsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListRealmsE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ListUsersE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListUsersE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.AddRealmE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddRealmE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.RemoveGroupE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveGroupE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.EnableUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.EnableUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.GetGroupE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetGroupE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.GetRoleE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetRoleE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.RemoveRealmE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveRealmE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.UnlockUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UnlockUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.UpdateUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ChangePasswordE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ChangePasswordE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ListRolesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ListRolesE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.RemoveRoleE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveRoleE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.LockUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.LockUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.AddGroupE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddGroupE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ProxyLoginE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProxyLoginE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.RemoveUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.RemoveUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.UpdateRealmE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateRealmE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.UpdateGroupE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateGroupE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.GetRealmE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetRealmE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.ResetPasswordE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.ResetPasswordE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.UpdateRoleE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.UpdateRoleE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.AddUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.AddUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, sec.rtbd.comverse.org.webservice.auth.GetUserE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(sec.rtbd.comverse.org.webservice.auth.GetUserE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (sec.rtbd.comverse.org.webservice.auth.ListGroupsE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListGroupsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListGroupsResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ProcessLoginE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ProcessLoginE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ProcessLoginResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddUserAttributesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddUserAttributesResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.DisableUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.DisableUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.DisableUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetSessionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetSessionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetSessionResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddRoleE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddRoleE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddRoleResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ListRealmsE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListRealmsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListRealmsResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ListUsersE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListUsersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListUsersResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddRealmE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddRealmE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddRealmResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveGroupE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveGroupE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveGroupResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.EnableUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.EnableUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.EnableUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetGroupE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetGroupE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetGroupResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetRoleE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetRoleE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetRoleResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveRealmE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveRealmE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveRealmResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UnlockUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UnlockUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UnlockUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.IsProductionSiteE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.IsProductionSiteResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveUserAttributesResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ChangePasswordE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ChangePasswordE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ChangePasswordResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ListRolesE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListRolesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ListRolesResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveRoleE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveRoleE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveRoleResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.LockUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.LockUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.LockUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.LockUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddGroupE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddGroupE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddGroupResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ProxyLoginE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ProxyLoginE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ProxyLoginResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ChangeUserAttributesResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.RemoveUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateRealmE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateRealmE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateRealmResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ProcessLogoutE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ProcessLogoutResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateGroupE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateGroupE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateGroupResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetRealmE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetRealmE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetRealmResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ResetPasswordE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ResetPasswordE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.ResetPasswordResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateRoleE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateRoleE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.UpdateRoleResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.AddUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.AddUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetUserE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetUserE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.GetUserResponseE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.GetUserResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.class.equals(type)){
                
                           return sec.rtbd.comverse.org.webservice.auth.SSOExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   