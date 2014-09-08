
/**
 * SubscriberBaseObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  SubscriberBaseObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SubscriberBaseObject extends com.comverse.www.SubscriberIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = subscriberBaseObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for BEndAddressId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localBEndAddressId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBEndAddressIdTracker = false ;

                           public boolean isBEndAddressIdSpecified(){
                               return localBEndAddressIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getBEndAddressId(){
                               return localBEndAddressId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BEndAddressId
                               */
                               public void setBEndAddressId(com.comverse.www.LongAttributeJAXBElement param){
                            localBEndAddressIdTracker = true;
                                   
                                            this.localBEndAddressId=param;
                                    

                               }
                            

                        /**
                        * field for BRevRcvCostCtr
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localBRevRcvCostCtr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBRevRcvCostCtrTracker = false ;

                           public boolean isBRevRcvCostCtrSpecified(){
                               return localBRevRcvCostCtrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getBRevRcvCostCtr(){
                               return localBRevRcvCostCtr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BRevRcvCostCtr
                               */
                               public void setBRevRcvCostCtr(com.comverse.www.ShortAttributeJAXBElement param){
                            localBRevRcvCostCtrTracker = true;
                                   
                                            this.localBRevRcvCostCtr=param;
                                    

                               }
                            

                        /**
                        * field for BServiceCompany
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBServiceCompany ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServiceCompanyTracker = false ;

                           public boolean isBServiceCompanySpecified(){
                               return localBServiceCompanyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBServiceCompany(){
                               return localBServiceCompany;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServiceCompany
                               */
                               public void setBServiceCompany(com.comverse.www.StringAttributeJAXBElement param){
                            localBServiceCompanyTracker = true;
                                   
                                            this.localBServiceCompany=param;
                                    

                               }
                            

                        /**
                        * field for BServiceFname
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBServiceFname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServiceFnameTracker = false ;

                           public boolean isBServiceFnameSpecified(){
                               return localBServiceFnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBServiceFname(){
                               return localBServiceFname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServiceFname
                               */
                               public void setBServiceFname(com.comverse.www.StringAttributeJAXBElement param){
                            localBServiceFnameTracker = true;
                                   
                                            this.localBServiceFname=param;
                                    

                               }
                            

                        /**
                        * field for BServiceFranchiseTaxCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localBServiceFranchiseTaxCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServiceFranchiseTaxCodeTracker = false ;

                           public boolean isBServiceFranchiseTaxCodeSpecified(){
                               return localBServiceFranchiseTaxCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getBServiceFranchiseTaxCode(){
                               return localBServiceFranchiseTaxCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServiceFranchiseTaxCode
                               */
                               public void setBServiceFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localBServiceFranchiseTaxCodeTracker = true;
                                   
                                            this.localBServiceFranchiseTaxCode=param;
                                    

                               }
                            

                        /**
                        * field for BServiceGeocode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBServiceGeocode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServiceGeocodeTracker = false ;

                           public boolean isBServiceGeocodeSpecified(){
                               return localBServiceGeocodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBServiceGeocode(){
                               return localBServiceGeocode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServiceGeocode
                               */
                               public void setBServiceGeocode(com.comverse.www.StringAttributeJAXBElement param){
                            localBServiceGeocodeTracker = true;
                                   
                                            this.localBServiceGeocode=param;
                                    

                               }
                            

                        /**
                        * field for BServiceLname
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBServiceLname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServiceLnameTracker = false ;

                           public boolean isBServiceLnameSpecified(){
                               return localBServiceLnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBServiceLname(){
                               return localBServiceLname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServiceLname
                               */
                               public void setBServiceLname(com.comverse.www.StringAttributeJAXBElement param){
                            localBServiceLnameTracker = true;
                                   
                                            this.localBServiceLname=param;
                                    

                               }
                            

                        /**
                        * field for BServiceMinit
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBServiceMinit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServiceMinitTracker = false ;

                           public boolean isBServiceMinitSpecified(){
                               return localBServiceMinitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBServiceMinit(){
                               return localBServiceMinit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServiceMinit
                               */
                               public void setBServiceMinit(com.comverse.www.StringAttributeJAXBElement param){
                            localBServiceMinitTracker = true;
                                   
                                            this.localBServiceMinit=param;
                                    

                               }
                            

                        /**
                        * field for BServicePhone
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBServicePhone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServicePhoneTracker = false ;

                           public boolean isBServicePhoneSpecified(){
                               return localBServicePhoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBServicePhone(){
                               return localBServicePhone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServicePhone
                               */
                               public void setBServicePhone(com.comverse.www.StringAttributeJAXBElement param){
                            localBServicePhoneTracker = true;
                                   
                                            this.localBServicePhone=param;
                                    

                               }
                            

                        /**
                        * field for BServicePhone2
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBServicePhone2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBServicePhone2Tracker = false ;

                           public boolean isBServicePhone2Specified(){
                               return localBServicePhone2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBServicePhone2(){
                               return localBServicePhone2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BServicePhone2
                               */
                               public void setBServicePhone2(com.comverse.www.StringAttributeJAXBElement param){
                            localBServicePhone2Tracker = true;
                                   
                                            this.localBServicePhone2=param;
                                    

                               }
                            

                        /**
                        * field for AccountExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAccountExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountExternalIdTracker = false ;

                           public boolean isAccountExternalIdSpecified(){
                               return localAccountExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAccountExternalId(){
                               return localAccountExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountExternalId
                               */
                               public void setAccountExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localAccountExternalIdTracker = param != null;
                                   
                                            this.localAccountExternalId=param;
                                    

                               }
                            

                        /**
                        * field for AccountExternalIdType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localAccountExternalIdType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountExternalIdTypeTracker = false ;

                           public boolean isAccountExternalIdTypeSpecified(){
                               return localAccountExternalIdTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getAccountExternalIdType(){
                               return localAccountExternalIdType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountExternalIdType
                               */
                               public void setAccountExternalIdType(com.comverse.www.ShortAttributeJAXBElement param){
                            localAccountExternalIdTypeTracker = param != null;
                                   
                                            this.localAccountExternalIdType=param;
                                    

                               }
                            

                        /**
                        * field for AccountType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localAccountType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountTypeTracker = false ;

                           public boolean isAccountTypeSpecified(){
                               return localAccountTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getAccountType(){
                               return localAccountType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountType
                               */
                               public void setAccountType(com.comverse.www.ShortAttributeJAXBElement param){
                            localAccountTypeTracker = true;
                                   
                                            this.localAccountType=param;
                                    

                               }
                            

                        /**
                        * field for AcctAccessAllowed
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAcctAccessAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAcctAccessAllowedTracker = false ;

                           public boolean isAcctAccessAllowedSpecified(){
                               return localAcctAccessAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAcctAccessAllowed(){
                               return localAcctAccessAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AcctAccessAllowed
                               */
                               public void setAcctAccessAllowed(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAcctAccessAllowedTracker = param != null;
                                   
                                            this.localAcctAccessAllowed=param;
                                    

                               }
                            

                        /**
                        * field for AcctbalToSubbalcoreTransfer
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAcctbalToSubbalcoreTransfer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAcctbalToSubbalcoreTransferTracker = false ;

                           public boolean isAcctbalToSubbalcoreTransferSpecified(){
                               return localAcctbalToSubbalcoreTransferTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAcctbalToSubbalcoreTransfer(){
                               return localAcctbalToSubbalcoreTransfer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AcctbalToSubbalcoreTransfer
                               */
                               public void setAcctbalToSubbalcoreTransfer(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAcctbalToSubbalcoreTransferTracker = param != null;
                                   
                                            this.localAcctbalToSubbalcoreTransfer=param;
                                    

                               }
                            

                        /**
                        * field for ActiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localActiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActiveDtTracker = false ;

                           public boolean isActiveDtSpecified(){
                               return localActiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getActiveDt(){
                               return localActiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActiveDt
                               */
                               public void setActiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localActiveDtTracker = param != null;
                                   
                                            this.localActiveDt=param;
                                    

                               }
                            

                        /**
                        * field for ActiveLrOverrideId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localActiveLrOverrideId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActiveLrOverrideIdTracker = false ;

                           public boolean isActiveLrOverrideIdSpecified(){
                               return localActiveLrOverrideIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getActiveLrOverrideId(){
                               return localActiveLrOverrideId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActiveLrOverrideId
                               */
                               public void setActiveLrOverrideId(com.comverse.www.ShortAttributeJAXBElement param){
                            localActiveLrOverrideIdTracker = param != null;
                                   
                                            this.localActiveLrOverrideId=param;
                                    

                               }
                            

                        /**
                        * field for Address1
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAddress1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddress1Tracker = false ;

                           public boolean isAddress1Specified(){
                               return localAddress1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAddress1(){
                               return localAddress1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address1
                               */
                               public void setAddress1(com.comverse.www.StringAttributeJAXBElement param){
                            localAddress1Tracker = true;
                                   
                                            this.localAddress1=param;
                                    

                               }
                            

                        /**
                        * field for Address2
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAddress2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddress2Tracker = false ;

                           public boolean isAddress2Specified(){
                               return localAddress2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAddress2(){
                               return localAddress2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address2
                               */
                               public void setAddress2(com.comverse.www.StringAttributeJAXBElement param){
                            localAddress2Tracker = true;
                                   
                                            this.localAddress2=param;
                                    

                               }
                            

                        /**
                        * field for Address3
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAddress3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddress3Tracker = false ;

                           public boolean isAddress3Specified(){
                               return localAddress3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAddress3(){
                               return localAddress3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address3
                               */
                               public void setAddress3(com.comverse.www.StringAttributeJAXBElement param){
                            localAddress3Tracker = true;
                                   
                                            this.localAddress3=param;
                                    

                               }
                            

                        /**
                        * field for Address4
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAddress4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddress4Tracker = false ;

                           public boolean isAddress4Specified(){
                               return localAddress4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAddress4(){
                               return localAddress4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address4
                               */
                               public void setAddress4(com.comverse.www.StringAttributeJAXBElement param){
                            localAddress4Tracker = true;
                                   
                                            this.localAddress4=param;
                                    

                               }
                            

                        /**
                        * field for AddressId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localAddressId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressIdTracker = false ;

                           public boolean isAddressIdSpecified(){
                               return localAddressIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getAddressId(){
                               return localAddressId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddressId
                               */
                               public void setAddressId(com.comverse.www.LongAttributeJAXBElement param){
                            localAddressIdTracker = param != null;
                                   
                                            this.localAddressId=param;
                                    

                               }
                            

                        /**
                        * field for AddressTypeId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localAddressTypeId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressTypeIdTracker = false ;

                           public boolean isAddressTypeIdSpecified(){
                               return localAddressTypeIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getAddressTypeId(){
                               return localAddressTypeId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddressTypeId
                               */
                               public void setAddressTypeId(com.comverse.www.ShortAttributeJAXBElement param){
                            localAddressTypeIdTracker = param != null;
                                   
                                            this.localAddressTypeId=param;
                                    

                               }
                            

                        /**
                        * field for AddtlNotifExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAddtlNotifExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddtlNotifExternalIdTracker = false ;

                           public boolean isAddtlNotifExternalIdSpecified(){
                               return localAddtlNotifExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAddtlNotifExternalId(){
                               return localAddtlNotifExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddtlNotifExternalId
                               */
                               public void setAddtlNotifExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localAddtlNotifExternalIdTracker = true;
                                   
                                            this.localAddtlNotifExternalId=param;
                                    

                               }
                            

                        /**
                        * field for AgentId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAgentId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgentIdTracker = false ;

                           public boolean isAgentIdSpecified(){
                               return localAgentIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAgentId(){
                               return localAgentId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgentId
                               */
                               public void setAgentId(com.comverse.www.StringAttributeJAXBElement param){
                            localAgentIdTracker = true;
                                   
                                            this.localAgentId=param;
                                    

                               }
                            

                        /**
                        * field for Anniversary
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localAnniversary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnniversaryTracker = false ;

                           public boolean isAnniversarySpecified(){
                               return localAnniversaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getAnniversary(){
                               return localAnniversary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Anniversary
                               */
                               public void setAnniversary(com.comverse.www.DateAttributeJAXBElement param){
                            localAnniversaryTracker = true;
                                   
                                            this.localAnniversary=param;
                                    

                               }
                            

                        /**
                        * field for ApplyDay
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localApplyDay ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localApplyDayTracker = false ;

                           public boolean isApplyDaySpecified(){
                               return localApplyDayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getApplyDay(){
                               return localApplyDay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApplyDay
                               */
                               public void setApplyDay(com.comverse.www.ShortAttributeJAXBElement param){
                            localApplyDayTracker = true;
                                   
                                            this.localApplyDay=param;
                                    

                               }
                            

                        /**
                        * field for BalTransMax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalTransMax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalTransMaxTracker = false ;

                           public boolean isBalTransMaxSpecified(){
                               return localBalTransMaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalTransMax(){
                               return localBalTransMax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalTransMax
                               */
                               public void setBalTransMax(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalTransMaxTracker = true;
                                   
                                            this.localBalTransMax=param;
                                    

                               }
                            

                        /**
                        * field for BalTransMin
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalTransMin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalTransMinTracker = false ;

                           public boolean isBalTransMinSpecified(){
                               return localBalTransMinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalTransMin(){
                               return localBalTransMin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalTransMin
                               */
                               public void setBalTransMin(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalTransMinTracker = true;
                                   
                                            this.localBalTransMin=param;
                                    

                               }
                            

                        /**
                        * field for BalTransResidualAmt
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalTransResidualAmt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalTransResidualAmtTracker = false ;

                           public boolean isBalTransResidualAmtSpecified(){
                               return localBalTransResidualAmtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalTransResidualAmt(){
                               return localBalTransResidualAmt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalTransResidualAmt
                               */
                               public void setBalTransResidualAmt(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalTransResidualAmtTracker = true;
                                   
                                            this.localBalTransResidualAmt=param;
                                    

                               }
                            

                        /**
                        * field for BalTransferEnabled
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localBalTransferEnabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalTransferEnabledTracker = false ;

                           public boolean isBalTransferEnabledSpecified(){
                               return localBalTransferEnabledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getBalTransferEnabled(){
                               return localBalTransferEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalTransferEnabled
                               */
                               public void setBalTransferEnabled(com.comverse.www.BooleanAttributeJAXBElement param){
                            localBalTransferEnabledTracker = param != null;
                                   
                                            this.localBalTransferEnabled=param;
                                    

                               }
                            

                        /**
                        * field for Birthday
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localBirthday ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBirthdayTracker = false ;

                           public boolean isBirthdaySpecified(){
                               return localBirthdayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getBirthday(){
                               return localBirthday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Birthday
                               */
                               public void setBirthday(com.comverse.www.DateAttributeJAXBElement param){
                            localBirthdayTracker = true;
                                   
                                            this.localBirthday=param;
                                    

                               }
                            

                        /**
                        * field for CfbNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCfbNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCfbNumberTracker = false ;

                           public boolean isCfbNumberSpecified(){
                               return localCfbNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCfbNumber(){
                               return localCfbNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CfbNumber
                               */
                               public void setCfbNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localCfbNumberTracker = true;
                                   
                                            this.localCfbNumber=param;
                                    

                               }
                            

                        /**
                        * field for CfisNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCfisNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCfisNumberTracker = false ;

                           public boolean isCfisNumberSpecified(){
                               return localCfisNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCfisNumber(){
                               return localCfisNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CfisNumber
                               */
                               public void setCfisNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localCfisNumberTracker = true;
                                   
                                            this.localCfisNumber=param;
                                    

                               }
                            

                        /**
                        * field for CfnaNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCfnaNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCfnaNumberTracker = false ;

                           public boolean isCfnaNumberSpecified(){
                               return localCfnaNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCfnaNumber(){
                               return localCfnaNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CfnaNumber
                               */
                               public void setCfnaNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localCfnaNumberTracker = true;
                                   
                                            this.localCfnaNumber=param;
                                    

                               }
                            

                        /**
                        * field for CfuNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCfuNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCfuNumberTracker = false ;

                           public boolean isCfuNumberSpecified(){
                               return localCfuNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCfuNumber(){
                               return localCfuNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CfuNumber
                               */
                               public void setCfuNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localCfuNumberTracker = true;
                                   
                                            this.localCfuNumber=param;
                                    

                               }
                            

                        /**
                        * field for ChangeDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localChangeDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChangeDtTracker = false ;

                           public boolean isChangeDtSpecified(){
                               return localChangeDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getChangeDt(){
                               return localChangeDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChangeDt
                               */
                               public void setChangeDt(com.comverse.www.DateAttributeJAXBElement param){
                            localChangeDtTracker = param != null;
                                   
                                            this.localChangeDt=param;
                                    

                               }
                            

                        /**
                        * field for ChangeWho
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localChangeWho ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChangeWhoTracker = false ;

                           public boolean isChangeWhoSpecified(){
                               return localChangeWhoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getChangeWho(){
                               return localChangeWho;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChangeWho
                               */
                               public void setChangeWho(com.comverse.www.StringAttributeJAXBElement param){
                            localChangeWhoTracker = param != null;
                                   
                                            this.localChangeWho=param;
                                    

                               }
                            

                        /**
                        * field for ChargeAdvice
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localChargeAdvice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChargeAdviceTracker = false ;

                           public boolean isChargeAdviceSpecified(){
                               return localChargeAdviceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getChargeAdvice(){
                               return localChargeAdvice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChargeAdvice
                               */
                               public void setChargeAdvice(com.comverse.www.ShortAttributeJAXBElement param){
                            localChargeAdviceTracker = param != null;
                                   
                                            this.localChargeAdvice=param;
                                    

                               }
                            

                        /**
                        * field for ChgDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localChgDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChgDtTracker = false ;

                           public boolean isChgDtSpecified(){
                               return localChgDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getChgDt(){
                               return localChgDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChgDt
                               */
                               public void setChgDt(com.comverse.www.DateAttributeJAXBElement param){
                            localChgDtTracker = param != null;
                                   
                                            this.localChgDt=param;
                                    

                               }
                            

                        /**
                        * field for ChgWho
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localChgWho ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChgWhoTracker = false ;

                           public boolean isChgWhoSpecified(){
                               return localChgWhoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getChgWho(){
                               return localChgWho;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChgWho
                               */
                               public void setChgWho(com.comverse.www.StringAttributeJAXBElement param){
                            localChgWhoTracker = param != null;
                                   
                                            this.localChgWho=param;
                                    

                               }
                            

                        /**
                        * field for CircleFlag
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localCircleFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCircleFlagTracker = false ;

                           public boolean isCircleFlagSpecified(){
                               return localCircleFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getCircleFlag(){
                               return localCircleFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CircleFlag
                               */
                               public void setCircleFlag(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localCircleFlagTracker = param != null;
                                   
                                            this.localCircleFlag=param;
                                    

                               }
                            

                        /**
                        * field for City
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCityTracker = false ;

                           public boolean isCitySpecified(){
                               return localCityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCity(){
                               return localCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param City
                               */
                               public void setCity(com.comverse.www.StringAttributeJAXBElement param){
                            localCityTracker = true;
                                   
                                            this.localCity=param;
                                    

                               }
                            

                        /**
                        * field for ClassOfServiceCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localClassOfServiceCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClassOfServiceCodeTracker = false ;

                           public boolean isClassOfServiceCodeSpecified(){
                               return localClassOfServiceCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getClassOfServiceCode(){
                               return localClassOfServiceCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClassOfServiceCode
                               */
                               public void setClassOfServiceCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localClassOfServiceCodeTracker = param != null;
                                   
                                            this.localClassOfServiceCode=param;
                                    

                               }
                            

                        /**
                        * field for Codeword
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCodeword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCodewordTracker = false ;

                           public boolean isCodewordSpecified(){
                               return localCodewordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCodeword(){
                               return localCodeword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Codeword
                               */
                               public void setCodeword(com.comverse.www.StringAttributeJAXBElement param){
                            localCodewordTracker = true;
                                   
                                            this.localCodeword=param;
                                    

                               }
                            

                        /**
                        * field for Converted
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localConverted ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConvertedTracker = false ;

                           public boolean isConvertedSpecified(){
                               return localConvertedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getConverted(){
                               return localConverted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Converted
                               */
                               public void setConverted(com.comverse.www.ShortAttributeJAXBElement param){
                            localConvertedTracker = param != null;
                                   
                                            this.localConverted=param;
                                    

                               }
                            

                        /**
                        * field for CountryCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localCountryCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountryCodeTracker = false ;

                           public boolean isCountryCodeSpecified(){
                               return localCountryCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getCountryCode(){
                               return localCountryCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CountryCode
                               */
                               public void setCountryCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localCountryCodeTracker = param != null;
                                   
                                            this.localCountryCode=param;
                                    

                               }
                            

                        /**
                        * field for County
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCounty ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountyTracker = false ;

                           public boolean isCountySpecified(){
                               return localCountyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCounty(){
                               return localCounty;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param County
                               */
                               public void setCounty(com.comverse.www.StringAttributeJAXBElement param){
                            localCountyTracker = true;
                                   
                                            this.localCounty=param;
                                    

                               }
                            

                        /**
                        * field for CreateDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localCreateDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreateDtTracker = false ;

                           public boolean isCreateDtSpecified(){
                               return localCreateDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getCreateDt(){
                               return localCreateDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateDt
                               */
                               public void setCreateDt(com.comverse.www.DateAttributeJAXBElement param){
                            localCreateDtTracker = param != null;
                                   
                                            this.localCreateDt=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localCurrencyCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrencyCodeTracker = false ;

                           public boolean isCurrencyCodeSpecified(){
                               return localCurrencyCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getCurrencyCode(){
                               return localCurrencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyCode
                               */
                               public void setCurrencyCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localCurrencyCodeTracker = true;
                                   
                                            this.localCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for DateEnterActive
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localDateEnterActive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateEnterActiveTracker = false ;

                           public boolean isDateEnterActiveSpecified(){
                               return localDateEnterActiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getDateEnterActive(){
                               return localDateEnterActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateEnterActive
                               */
                               public void setDateEnterActive(com.comverse.www.DateAttributeJAXBElement param){
                            localDateEnterActiveTracker = true;
                                   
                                            this.localDateEnterActive=param;
                                    

                               }
                            

                        /**
                        * field for DateEnteredPostactive
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localDateEnteredPostactive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateEnteredPostactiveTracker = false ;

                           public boolean isDateEnteredPostactiveSpecified(){
                               return localDateEnteredPostactiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getDateEnteredPostactive(){
                               return localDateEnteredPostactive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateEnteredPostactive
                               */
                               public void setDateEnteredPostactive(com.comverse.www.DateAttributeJAXBElement param){
                            localDateEnteredPostactiveTracker = true;
                                   
                                            this.localDateEnteredPostactive=param;
                                    

                               }
                            

                        /**
                        * field for DateLastFreeAnCall
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localDateLastFreeAnCall ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateLastFreeAnCallTracker = false ;

                           public boolean isDateLastFreeAnCallSpecified(){
                               return localDateLastFreeAnCallTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getDateLastFreeAnCall(){
                               return localDateLastFreeAnCall;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateLastFreeAnCall
                               */
                               public void setDateLastFreeAnCall(com.comverse.www.DateAttributeJAXBElement param){
                            localDateLastFreeAnCallTracker = true;
                                   
                                            this.localDateLastFreeAnCall=param;
                                    

                               }
                            

                        /**
                        * field for DealerId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localDealerId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDealerIdTracker = false ;

                           public boolean isDealerIdSpecified(){
                               return localDealerIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getDealerId(){
                               return localDealerId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DealerId
                               */
                               public void setDealerId(com.comverse.www.ShortAttributeJAXBElement param){
                            localDealerIdTracker = true;
                                   
                                            this.localDealerId=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber1
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber1Tracker = false ;

                           public boolean isDestNumber1Specified(){
                               return localDestNumber1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber1(){
                               return localDestNumber1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber1
                               */
                               public void setDestNumber1(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber1Tracker = true;
                                   
                                            this.localDestNumber1=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber10
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber10 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber10Tracker = false ;

                           public boolean isDestNumber10Specified(){
                               return localDestNumber10Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber10(){
                               return localDestNumber10;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber10
                               */
                               public void setDestNumber10(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber10Tracker = true;
                                   
                                            this.localDestNumber10=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber2
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber2Tracker = false ;

                           public boolean isDestNumber2Specified(){
                               return localDestNumber2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber2(){
                               return localDestNumber2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber2
                               */
                               public void setDestNumber2(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber2Tracker = true;
                                   
                                            this.localDestNumber2=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber3
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber3Tracker = false ;

                           public boolean isDestNumber3Specified(){
                               return localDestNumber3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber3(){
                               return localDestNumber3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber3
                               */
                               public void setDestNumber3(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber3Tracker = true;
                                   
                                            this.localDestNumber3=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber4
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber4Tracker = false ;

                           public boolean isDestNumber4Specified(){
                               return localDestNumber4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber4(){
                               return localDestNumber4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber4
                               */
                               public void setDestNumber4(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber4Tracker = true;
                                   
                                            this.localDestNumber4=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber5
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber5Tracker = false ;

                           public boolean isDestNumber5Specified(){
                               return localDestNumber5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber5(){
                               return localDestNumber5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber5
                               */
                               public void setDestNumber5(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber5Tracker = true;
                                   
                                            this.localDestNumber5=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber6
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber6 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber6Tracker = false ;

                           public boolean isDestNumber6Specified(){
                               return localDestNumber6Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber6(){
                               return localDestNumber6;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber6
                               */
                               public void setDestNumber6(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber6Tracker = true;
                                   
                                            this.localDestNumber6=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber7
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber7 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber7Tracker = false ;

                           public boolean isDestNumber7Specified(){
                               return localDestNumber7Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber7(){
                               return localDestNumber7;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber7
                               */
                               public void setDestNumber7(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber7Tracker = true;
                                   
                                            this.localDestNumber7=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber8
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber8 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber8Tracker = false ;

                           public boolean isDestNumber8Specified(){
                               return localDestNumber8Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber8(){
                               return localDestNumber8;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber8
                               */
                               public void setDestNumber8(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber8Tracker = true;
                                   
                                            this.localDestNumber8=param;
                                    

                               }
                            

                        /**
                        * field for DestNumber9
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDestNumber9 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestNumber9Tracker = false ;

                           public boolean isDestNumber9Specified(){
                               return localDestNumber9Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDestNumber9(){
                               return localDestNumber9;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestNumber9
                               */
                               public void setDestNumber9(com.comverse.www.StringAttributeJAXBElement param){
                            localDestNumber9Tracker = true;
                                   
                                            this.localDestNumber9=param;
                                    

                               }
                            

                        /**
                        * field for DisplayAddressId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localDisplayAddressId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisplayAddressIdTracker = false ;

                           public boolean isDisplayAddressIdSpecified(){
                               return localDisplayAddressIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getDisplayAddressId(){
                               return localDisplayAddressId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayAddressId
                               */
                               public void setDisplayAddressId(com.comverse.www.LongAttributeJAXBElement param){
                            localDisplayAddressIdTracker = param != null;
                                   
                                            this.localDisplayAddressId=param;
                                    

                               }
                            

                        /**
                        * field for DisplayExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDisplayExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisplayExternalIdTracker = false ;

                           public boolean isDisplayExternalIdSpecified(){
                               return localDisplayExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDisplayExternalId(){
                               return localDisplayExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayExternalId
                               */
                               public void setDisplayExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localDisplayExternalIdTracker = param != null;
                                   
                                            this.localDisplayExternalId=param;
                                    

                               }
                            

                        /**
                        * field for DisplayExternalIdType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localDisplayExternalIdType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisplayExternalIdTypeTracker = false ;

                           public boolean isDisplayExternalIdTypeSpecified(){
                               return localDisplayExternalIdTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getDisplayExternalIdType(){
                               return localDisplayExternalIdType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayExternalIdType
                               */
                               public void setDisplayExternalIdType(com.comverse.www.ShortAttributeJAXBElement param){
                            localDisplayExternalIdTypeTracker = param != null;
                                   
                                            this.localDisplayExternalIdType=param;
                                    

                               }
                            

                        /**
                        * field for EnableCdr
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localEnableCdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnableCdrTracker = false ;

                           public boolean isEnableCdrSpecified(){
                               return localEnableCdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getEnableCdr(){
                               return localEnableCdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableCdr
                               */
                               public void setEnableCdr(com.comverse.www.BooleanAttributeJAXBElement param){
                            localEnableCdrTracker = param != null;
                                   
                                            this.localEnableCdr=param;
                                    

                               }
                            

                        /**
                        * field for EquipClassCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localEquipClassCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEquipClassCodeTracker = false ;

                           public boolean isEquipClassCodeSpecified(){
                               return localEquipClassCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getEquipClassCode(){
                               return localEquipClassCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EquipClassCode
                               */
                               public void setEquipClassCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localEquipClassCodeTracker = param != null;
                                   
                                            this.localEquipClassCode=param;
                                    

                               }
                            

                        /**
                        * field for EquipTypeCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localEquipTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEquipTypeCodeTracker = false ;

                           public boolean isEquipTypeCodeSpecified(){
                               return localEquipTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getEquipTypeCode(){
                               return localEquipTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EquipTypeCode
                               */
                               public void setEquipTypeCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localEquipTypeCodeTracker = param != null;
                                   
                                            this.localEquipTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for ExrateClass
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localExrateClass ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExrateClassTracker = false ;

                           public boolean isExrateClassSpecified(){
                               return localExrateClassTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getExrateClass(){
                               return localExrateClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExrateClass
                               */
                               public void setExrateClass(com.comverse.www.ShortAttributeJAXBElement param){
                            localExrateClassTracker = true;
                                   
                                            this.localExrateClass=param;
                                    

                               }
                            

                        /**
                        * field for ExtFlag
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localExtFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtFlagTracker = false ;

                           public boolean isExtFlagSpecified(){
                               return localExtFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getExtFlag(){
                               return localExtFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExtFlag
                               */
                               public void setExtFlag(com.comverse.www.StringAttributeJAXBElement param){
                            localExtFlagTracker = param != null;
                                   
                                            this.localExtFlag=param;
                                    

                               }
                            

                        /**
                        * field for ExtendedData
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localExtendedData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtendedDataTracker = false ;

                           public boolean isExtendedDataSpecified(){
                               return localExtendedDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getExtendedData(){
                               return localExtendedData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExtendedData
                               */
                               public void setExtendedData(com.comverse.www.StringAttributeJAXBElement param){
                            localExtendedDataTracker = param != null;
                                   
                                            this.localExtendedData=param;
                                    

                               }
                            

                        /**
                        * field for ExtendedPostalCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localExtendedPostalCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtendedPostalCodeTracker = false ;

                           public boolean isExtendedPostalCodeSpecified(){
                               return localExtendedPostalCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getExtendedPostalCode(){
                               return localExtendedPostalCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExtendedPostalCode
                               */
                               public void setExtendedPostalCode(com.comverse.www.StringAttributeJAXBElement param){
                            localExtendedPostalCodeTracker = true;
                                   
                                            this.localExtendedPostalCode=param;
                                    

                               }
                            

                        /**
                        * field for ExternalAddressId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localExternalAddressId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalAddressIdTracker = false ;

                           public boolean isExternalAddressIdSpecified(){
                               return localExternalAddressIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getExternalAddressId(){
                               return localExternalAddressId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalAddressId
                               */
                               public void setExternalAddressId(com.comverse.www.StringAttributeJAXBElement param){
                            localExternalAddressIdTracker = true;
                                   
                                            this.localExternalAddressId=param;
                                    

                               }
                            

                        /**
                        * field for FavoriteArea
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localFavoriteArea ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFavoriteAreaTracker = false ;

                           public boolean isFavoriteAreaSpecified(){
                               return localFavoriteAreaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getFavoriteArea(){
                               return localFavoriteArea;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FavoriteArea
                               */
                               public void setFavoriteArea(com.comverse.www.StringAttributeJAXBElement param){
                            localFavoriteAreaTracker = true;
                                   
                                            this.localFavoriteArea=param;
                                    

                               }
                            

                        /**
                        * field for FfChangeCount
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localFfChangeCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFfChangeCountTracker = false ;

                           public boolean isFfChangeCountSpecified(){
                               return localFfChangeCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getFfChangeCount(){
                               return localFfChangeCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FfChangeCount
                               */
                               public void setFfChangeCount(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localFfChangeCountTracker = true;
                                   
                                            this.localFfChangeCount=param;
                                    

                               }
                            

                        /**
                        * field for FranchiseTaxCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localFranchiseTaxCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFranchiseTaxCodeTracker = false ;

                           public boolean isFranchiseTaxCodeSpecified(){
                               return localFranchiseTaxCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getFranchiseTaxCode(){
                               return localFranchiseTaxCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FranchiseTaxCode
                               */
                               public void setFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localFranchiseTaxCodeTracker = param != null;
                                   
                                            this.localFranchiseTaxCode=param;
                                    

                               }
                            

                        /**
                        * field for FreeFfChgAllowance
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localFreeFfChgAllowance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFreeFfChgAllowanceTracker = false ;

                           public boolean isFreeFfChgAllowanceSpecified(){
                               return localFreeFfChgAllowanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getFreeFfChgAllowance(){
                               return localFreeFfChgAllowance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FreeFfChgAllowance
                               */
                               public void setFreeFfChgAllowance(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localFreeFfChgAllowanceTracker = true;
                                   
                                            this.localFreeFfChgAllowance=param;
                                    

                               }
                            

                        /**
                        * field for FxGeocode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localFxGeocode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFxGeocodeTracker = false ;

                           public boolean isFxGeocodeSpecified(){
                               return localFxGeocodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getFxGeocode(){
                               return localFxGeocode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FxGeocode
                               */
                               public void setFxGeocode(com.comverse.www.StringAttributeJAXBElement param){
                            localFxGeocodeTracker = param != null;
                                   
                                            this.localFxGeocode=param;
                                    

                               }
                            

                        /**
                        * field for HappyHourEnd
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localHappyHourEnd ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHappyHourEndTracker = false ;

                           public boolean isHappyHourEndSpecified(){
                               return localHappyHourEndTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getHappyHourEnd(){
                               return localHappyHourEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HappyHourEnd
                               */
                               public void setHappyHourEnd(com.comverse.www.IntegerAttributeJAXBElement param){
                            localHappyHourEndTracker = true;
                                   
                                            this.localHappyHourEnd=param;
                                    

                               }
                            

                        /**
                        * field for HappyHourStart
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localHappyHourStart ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHappyHourStartTracker = false ;

                           public boolean isHappyHourStartSpecified(){
                               return localHappyHourStartTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getHappyHourStart(){
                               return localHappyHourStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HappyHourStart
                               */
                               public void setHappyHourStart(com.comverse.www.IntegerAttributeJAXBElement param){
                            localHappyHourStartTracker = true;
                                   
                                            this.localHappyHourStart=param;
                                    

                               }
                            

                        /**
                        * field for HasPendingOrders
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localHasPendingOrders ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHasPendingOrdersTracker = false ;

                           public boolean isHasPendingOrdersSpecified(){
                               return localHasPendingOrdersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getHasPendingOrders(){
                               return localHasPendingOrders;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasPendingOrders
                               */
                               public void setHasPendingOrders(com.comverse.www.BooleanAttributeJAXBElement param){
                            localHasPendingOrdersTracker = param != null;
                                   
                                            this.localHasPendingOrders=param;
                                    

                               }
                            

                        /**
                        * field for HasRcAnnc
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localHasRcAnnc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHasRcAnncTracker = false ;

                           public boolean isHasRcAnncSpecified(){
                               return localHasRcAnncTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getHasRcAnnc(){
                               return localHasRcAnnc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasRcAnnc
                               */
                               public void setHasRcAnnc(com.comverse.www.BooleanAttributeJAXBElement param){
                            localHasRcAnncTracker = true;
                                   
                                            this.localHasRcAnnc=param;
                                    

                               }
                            

                        /**
                        * field for HierarchyAccountInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localHierarchyAccountInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHierarchyAccountInternalIdTracker = false ;

                           public boolean isHierarchyAccountInternalIdSpecified(){
                               return localHierarchyAccountInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getHierarchyAccountInternalId(){
                               return localHierarchyAccountInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HierarchyAccountInternalId
                               */
                               public void setHierarchyAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localHierarchyAccountInternalIdTracker = param != null;
                                   
                                            this.localHierarchyAccountInternalId=param;
                                    

                               }
                            

                        /**
                        * field for Home1Li
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localHome1Li ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHome1LiTracker = false ;

                           public boolean isHome1LiSpecified(){
                               return localHome1LiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getHome1Li(){
                               return localHome1Li;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Home1Li
                               */
                               public void setHome1Li(com.comverse.www.StringAttributeJAXBElement param){
                            localHome1LiTracker = true;
                                   
                                            this.localHome1Li=param;
                                    

                               }
                            

                        /**
                        * field for Home2Li
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localHome2Li ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHome2LiTracker = false ;

                           public boolean isHome2LiSpecified(){
                               return localHome2LiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getHome2Li(){
                               return localHome2Li;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Home2Li
                               */
                               public void setHome2Li(com.comverse.www.StringAttributeJAXBElement param){
                            localHome2LiTracker = true;
                                   
                                            this.localHome2Li=param;
                                    

                               }
                            

                        /**
                        * field for Home3Li
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localHome3Li ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHome3LiTracker = false ;

                           public boolean isHome3LiSpecified(){
                               return localHome3LiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getHome3Li(){
                               return localHome3Li;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Home3Li
                               */
                               public void setHome3Li(com.comverse.www.StringAttributeJAXBElement param){
                            localHome3LiTracker = true;
                                   
                                            this.localHome3Li=param;
                                    

                               }
                            

                        /**
                        * field for Home4Li
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localHome4Li ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHome4LiTracker = false ;

                           public boolean isHome4LiSpecified(){
                               return localHome4LiTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getHome4Li(){
                               return localHome4Li;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Home4Li
                               */
                               public void setHome4Li(com.comverse.www.StringAttributeJAXBElement param){
                            localHome4LiTracker = true;
                                   
                                            this.localHome4Li=param;
                                    

                               }
                            

                        /**
                        * field for HomeZone
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localHomeZone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHomeZoneTracker = false ;

                           public boolean isHomeZoneSpecified(){
                               return localHomeZoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getHomeZone(){
                               return localHomeZone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HomeZone
                               */
                               public void setHomeZone(com.comverse.www.StringAttributeJAXBElement param){
                            localHomeZoneTracker = true;
                                   
                                            this.localHomeZone=param;
                                    

                               }
                            

                        /**
                        * field for HouseNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localHouseNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHouseNumberTracker = false ;

                           public boolean isHouseNumberSpecified(){
                               return localHouseNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getHouseNumber(){
                               return localHouseNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HouseNumber
                               */
                               public void setHouseNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localHouseNumberTracker = true;
                                   
                                            this.localHouseNumber=param;
                                    

                               }
                            

                        /**
                        * field for HouseNumberSuffix
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localHouseNumberSuffix ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHouseNumberSuffixTracker = false ;

                           public boolean isHouseNumberSuffixSpecified(){
                               return localHouseNumberSuffixTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getHouseNumberSuffix(){
                               return localHouseNumberSuffix;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HouseNumberSuffix
                               */
                               public void setHouseNumberSuffix(com.comverse.www.StringAttributeJAXBElement param){
                            localHouseNumberSuffixTracker = true;
                                   
                                            this.localHouseNumberSuffix=param;
                                    

                               }
                            

                        /**
                        * field for Id2Hash
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localId2Hash ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localId2HashTracker = false ;

                           public boolean isId2HashSpecified(){
                               return localId2HashTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getId2Hash(){
                               return localId2Hash;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id2Hash
                               */
                               public void setId2Hash(com.comverse.www.IntegerAttributeJAXBElement param){
                            localId2HashTracker = true;
                                   
                                            this.localId2Hash=param;
                                    

                               }
                            

                        /**
                        * field for InRatingDb
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localInRatingDb ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInRatingDbTracker = false ;

                           public boolean isInRatingDbSpecified(){
                               return localInRatingDbTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getInRatingDb(){
                               return localInRatingDb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InRatingDb
                               */
                               public void setInRatingDb(com.comverse.www.BooleanAttributeJAXBElement param){
                            localInRatingDbTracker = param != null;
                                   
                                            this.localInRatingDb=param;
                                    

                               }
                            

                        /**
                        * field for IndvCoreBalMin
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localIndvCoreBalMin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIndvCoreBalMinTracker = false ;

                           public boolean isIndvCoreBalMinSpecified(){
                               return localIndvCoreBalMinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getIndvCoreBalMin(){
                               return localIndvCoreBalMin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IndvCoreBalMin
                               */
                               public void setIndvCoreBalMin(com.comverse.www.NumericAttributeJAXBElement param){
                            localIndvCoreBalMinTracker = true;
                                   
                                            this.localIndvCoreBalMin=param;
                                    

                               }
                            

                        /**
                        * field for IndvCoreBalNotifThreshold
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localIndvCoreBalNotifThreshold ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIndvCoreBalNotifThresholdTracker = false ;

                           public boolean isIndvCoreBalNotifThresholdSpecified(){
                               return localIndvCoreBalNotifThresholdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getIndvCoreBalNotifThreshold(){
                               return localIndvCoreBalNotifThreshold;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IndvCoreBalNotifThreshold
                               */
                               public void setIndvCoreBalNotifThreshold(com.comverse.www.NumericAttributeJAXBElement param){
                            localIndvCoreBalNotifThresholdTracker = true;
                                   
                                            this.localIndvCoreBalNotifThreshold=param;
                                    

                               }
                            

                        /**
                        * field for IntendedViewEffectiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localIntendedViewEffectiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntendedViewEffectiveDtTracker = false ;

                           public boolean isIntendedViewEffectiveDtSpecified(){
                               return localIntendedViewEffectiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getIntendedViewEffectiveDt(){
                               return localIntendedViewEffectiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntendedViewEffectiveDt
                               */
                               public void setIntendedViewEffectiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localIntendedViewEffectiveDtTracker = param != null;
                                   
                                            this.localIntendedViewEffectiveDt=param;
                                    

                               }
                            

                        /**
                        * field for Is1Sa
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIs1Sa ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIs1SaTracker = false ;

                           public boolean isIs1SaSpecified(){
                               return localIs1SaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIs1Sa(){
                               return localIs1Sa;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Is1Sa
                               */
                               public void setIs1Sa(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIs1SaTracker = param != null;
                                   
                                            this.localIs1Sa=param;
                                    

                               }
                            

                        /**
                        * field for IsActive
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsActive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsActiveTracker = false ;

                           public boolean isIsActiveSpecified(){
                               return localIsActiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsActive(){
                               return localIsActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsActive
                               */
                               public void setIsActive(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsActiveTracker = param != null;
                                   
                                            this.localIsActive=param;
                                    

                               }
                            

                        /**
                        * field for IsBalIncreasePpAvailed
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsBalIncreasePpAvailed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsBalIncreasePpAvailedTracker = false ;

                           public boolean isIsBalIncreasePpAvailedSpecified(){
                               return localIsBalIncreasePpAvailedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsBalIncreasePpAvailed(){
                               return localIsBalIncreasePpAvailed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsBalIncreasePpAvailed
                               */
                               public void setIsBalIncreasePpAvailed(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsBalIncreasePpAvailedTracker = param != null;
                                   
                                            this.localIsBalIncreasePpAvailed=param;
                                    

                               }
                            

                        /**
                        * field for IsBalanceManaged
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsBalanceManaged ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsBalanceManagedTracker = false ;

                           public boolean isIsBalanceManagedSpecified(){
                               return localIsBalanceManagedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsBalanceManaged(){
                               return localIsBalanceManaged;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsBalanceManaged
                               */
                               public void setIsBalanceManaged(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsBalanceManagedTracker = param != null;
                                   
                                            this.localIsBalanceManaged=param;
                                    

                               }
                            

                        /**
                        * field for IsInTriggered
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsInTriggered ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsInTriggeredTracker = false ;

                           public boolean isIsInTriggeredSpecified(){
                               return localIsInTriggeredTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsInTriggered(){
                               return localIsInTriggered;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsInTriggered
                               */
                               public void setIsInTriggered(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsInTriggeredTracker = param != null;
                                   
                                            this.localIsInTriggered=param;
                                    

                               }
                            

                        /**
                        * field for IsNotificationRecipient
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsNotificationRecipient ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsNotificationRecipientTracker = false ;

                           public boolean isIsNotificationRecipientSpecified(){
                               return localIsNotificationRecipientTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsNotificationRecipient(){
                               return localIsNotificationRecipient;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsNotificationRecipient
                               */
                               public void setIsNotificationRecipient(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsNotificationRecipientTracker = param != null;
                                   
                                            this.localIsNotificationRecipient=param;
                                    

                               }
                            

                        /**
                        * field for IsPostactive
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsPostactive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsPostactiveTracker = false ;

                           public boolean isIsPostactiveSpecified(){
                               return localIsPostactiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsPostactive(){
                               return localIsPostactive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsPostactive
                               */
                               public void setIsPostactive(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsPostactiveTracker = param != null;
                                   
                                            this.localIsPostactive=param;
                                    

                               }
                            

                        /**
                        * field for KeyLineCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localKeyLineCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyLineCodeTracker = false ;

                           public boolean isKeyLineCodeSpecified(){
                               return localKeyLineCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getKeyLineCode(){
                               return localKeyLineCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyLineCode
                               */
                               public void setKeyLineCode(com.comverse.www.StringAttributeJAXBElement param){
                            localKeyLineCodeTracker = true;
                                   
                                            this.localKeyLineCode=param;
                                    

                               }
                            

                        /**
                        * field for LanguageCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localLanguageCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLanguageCodeTracker = false ;

                           public boolean isLanguageCodeSpecified(){
                               return localLanguageCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getLanguageCode(){
                               return localLanguageCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LanguageCode
                               */
                               public void setLanguageCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localLanguageCodeTracker = true;
                                   
                                            this.localLanguageCode=param;
                                    

                               }
                            

                        /**
                        * field for LastAppliedDate1
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastAppliedDate1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastAppliedDate1Tracker = false ;

                           public boolean isLastAppliedDate1Specified(){
                               return localLastAppliedDate1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastAppliedDate1(){
                               return localLastAppliedDate1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastAppliedDate1
                               */
                               public void setLastAppliedDate1(com.comverse.www.DateAttributeJAXBElement param){
                            localLastAppliedDate1Tracker = true;
                                   
                                            this.localLastAppliedDate1=param;
                                    

                               }
                            

                        /**
                        * field for LastAppliedDate2
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastAppliedDate2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastAppliedDate2Tracker = false ;

                           public boolean isLastAppliedDate2Specified(){
                               return localLastAppliedDate2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastAppliedDate2(){
                               return localLastAppliedDate2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastAppliedDate2
                               */
                               public void setLastAppliedDate2(com.comverse.www.DateAttributeJAXBElement param){
                            localLastAppliedDate2Tracker = true;
                                   
                                            this.localLastAppliedDate2=param;
                                    

                               }
                            

                        /**
                        * field for LastAppliedDate3
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastAppliedDate3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastAppliedDate3Tracker = false ;

                           public boolean isLastAppliedDate3Specified(){
                               return localLastAppliedDate3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastAppliedDate3(){
                               return localLastAppliedDate3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastAppliedDate3
                               */
                               public void setLastAppliedDate3(com.comverse.www.DateAttributeJAXBElement param){
                            localLastAppliedDate3Tracker = true;
                                   
                                            this.localLastAppliedDate3=param;
                                    

                               }
                            

                        /**
                        * field for LastAppliedDate4
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastAppliedDate4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastAppliedDate4Tracker = false ;

                           public boolean isLastAppliedDate4Specified(){
                               return localLastAppliedDate4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastAppliedDate4(){
                               return localLastAppliedDate4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastAppliedDate4
                               */
                               public void setLastAppliedDate4(com.comverse.www.DateAttributeJAXBElement param){
                            localLastAppliedDate4Tracker = true;
                                   
                                            this.localLastAppliedDate4=param;
                                    

                               }
                            

                        /**
                        * field for LastAppliedDate5
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastAppliedDate5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastAppliedDate5Tracker = false ;

                           public boolean isLastAppliedDate5Specified(){
                               return localLastAppliedDate5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastAppliedDate5(){
                               return localLastAppliedDate5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastAppliedDate5
                               */
                               public void setLastAppliedDate5(com.comverse.www.DateAttributeJAXBElement param){
                            localLastAppliedDate5Tracker = true;
                                   
                                            this.localLastAppliedDate5=param;
                                    

                               }
                            

                        /**
                        * field for LastCallCharge
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localLastCallCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastCallChargeTracker = false ;

                           public boolean isLastCallChargeSpecified(){
                               return localLastCallChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getLastCallCharge(){
                               return localLastCallCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastCallCharge
                               */
                               public void setLastCallCharge(com.comverse.www.NumericAttributeJAXBElement param){
                            localLastCallChargeTracker = true;
                                   
                                            this.localLastCallCharge=param;
                                    

                               }
                            

                        /**
                        * field for LastRechargeDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastRechargeDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastRechargeDateTracker = false ;

                           public boolean isLastRechargeDateSpecified(){
                               return localLastRechargeDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastRechargeDate(){
                               return localLastRechargeDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastRechargeDate
                               */
                               public void setLastRechargeDate(com.comverse.www.DateAttributeJAXBElement param){
                            localLastRechargeDateTracker = true;
                                   
                                            this.localLastRechargeDate=param;
                                    

                               }
                            

                        /**
                        * field for LastRefurbishDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastRefurbishDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastRefurbishDateTracker = false ;

                           public boolean isLastRefurbishDateSpecified(){
                               return localLastRefurbishDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastRefurbishDate(){
                               return localLastRefurbishDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastRefurbishDate
                               */
                               public void setLastRefurbishDate(com.comverse.www.DateAttributeJAXBElement param){
                            localLastRefurbishDateTracker = true;
                                   
                                            this.localLastRefurbishDate=param;
                                    

                               }
                            

                        /**
                        * field for LastTransDate0
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastTransDate0 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastTransDate0Tracker = false ;

                           public boolean isLastTransDate0Specified(){
                               return localLastTransDate0Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastTransDate0(){
                               return localLastTransDate0;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastTransDate0
                               */
                               public void setLastTransDate0(com.comverse.www.DateAttributeJAXBElement param){
                            localLastTransDate0Tracker = true;
                                   
                                            this.localLastTransDate0=param;
                                    

                               }
                            

                        /**
                        * field for LastTransDate1
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastTransDate1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastTransDate1Tracker = false ;

                           public boolean isLastTransDate1Specified(){
                               return localLastTransDate1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastTransDate1(){
                               return localLastTransDate1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastTransDate1
                               */
                               public void setLastTransDate1(com.comverse.www.DateAttributeJAXBElement param){
                            localLastTransDate1Tracker = true;
                                   
                                            this.localLastTransDate1=param;
                                    

                               }
                            

                        /**
                        * field for LastTransDate2
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastTransDate2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastTransDate2Tracker = false ;

                           public boolean isLastTransDate2Specified(){
                               return localLastTransDate2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastTransDate2(){
                               return localLastTransDate2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastTransDate2
                               */
                               public void setLastTransDate2(com.comverse.www.DateAttributeJAXBElement param){
                            localLastTransDate2Tracker = true;
                                   
                                            this.localLastTransDate2=param;
                                    

                               }
                            

                        /**
                        * field for LastUpdateTs
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastUpdateTs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastUpdateTsTracker = false ;

                           public boolean isLastUpdateTsSpecified(){
                               return localLastUpdateTsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastUpdateTs(){
                               return localLastUpdateTs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastUpdateTs
                               */
                               public void setLastUpdateTs(com.comverse.www.DateAttributeJAXBElement param){
                            localLastUpdateTsTracker = param != null;
                                   
                                            this.localLastUpdateTs=param;
                                    

                               }
                            

                        /**
                        * field for LiabilityRedirectFlag
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localLiabilityRedirectFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiabilityRedirectFlagTracker = false ;

                           public boolean isLiabilityRedirectFlagSpecified(){
                               return localLiabilityRedirectFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getLiabilityRedirectFlag(){
                               return localLiabilityRedirectFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiabilityRedirectFlag
                               */
                               public void setLiabilityRedirectFlag(com.comverse.www.BooleanAttributeJAXBElement param){
                            localLiabilityRedirectFlagTracker = param != null;
                                   
                                            this.localLiabilityRedirectFlag=param;
                                    

                               }
                            

                        /**
                        * field for MarketSegId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localMarketSegId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMarketSegIdTracker = false ;

                           public boolean isMarketSegIdSpecified(){
                               return localMarketSegIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getMarketSegId(){
                               return localMarketSegId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketSegId
                               */
                               public void setMarketSegId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localMarketSegIdTracker = true;
                                   
                                            this.localMarketSegId=param;
                                    

                               }
                            

                        /**
                        * field for MarketingContactProfileId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localMarketingContactProfileId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMarketingContactProfileIdTracker = false ;

                           public boolean isMarketingContactProfileIdSpecified(){
                               return localMarketingContactProfileIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getMarketingContactProfileId(){
                               return localMarketingContactProfileId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingContactProfileId
                               */
                               public void setMarketingContactProfileId(com.comverse.www.LongAttributeJAXBElement param){
                            localMarketingContactProfileIdTracker = true;
                                   
                                            this.localMarketingContactProfileId=param;
                                    

                               }
                            

                        /**
                        * field for MigrationSeq
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localMigrationSeq ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMigrationSeqTracker = false ;

                           public boolean isMigrationSeqSpecified(){
                               return localMigrationSeqTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getMigrationSeq(){
                               return localMigrationSeq;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MigrationSeq
                               */
                               public void setMigrationSeq(com.comverse.www.ShortAttributeJAXBElement param){
                            localMigrationSeqTracker = true;
                                   
                                            this.localMigrationSeq=param;
                                    

                               }
                            

                        /**
                        * field for MobileAdOptIn
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localMobileAdOptIn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMobileAdOptInTracker = false ;

                           public boolean isMobileAdOptInSpecified(){
                               return localMobileAdOptInTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getMobileAdOptIn(){
                               return localMobileAdOptIn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MobileAdOptIn
                               */
                               public void setMobileAdOptIn(com.comverse.www.BooleanAttributeJAXBElement param){
                            localMobileAdOptInTracker = param != null;
                                   
                                            this.localMobileAdOptIn=param;
                                    

                               }
                            

                        /**
                        * field for MogId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localMogId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMogIdTracker = false ;

                           public boolean isMogIdSpecified(){
                               return localMogIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getMogId(){
                               return localMogId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MogId
                               */
                               public void setMogId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localMogIdTracker = true;
                                   
                                            this.localMogId=param;
                                    

                               }
                            

                        /**
                        * field for NearestCrossstreet
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localNearestCrossstreet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNearestCrossstreetTracker = false ;

                           public boolean isNearestCrossstreetSpecified(){
                               return localNearestCrossstreetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getNearestCrossstreet(){
                               return localNearestCrossstreet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NearestCrossstreet
                               */
                               public void setNearestCrossstreet(com.comverse.www.StringAttributeJAXBElement param){
                            localNearestCrossstreetTracker = true;
                                   
                                            this.localNearestCrossstreet=param;
                                    

                               }
                            

                        /**
                        * field for NextApplyDate1
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextApplyDate1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextApplyDate1Tracker = false ;

                           public boolean isNextApplyDate1Specified(){
                               return localNextApplyDate1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextApplyDate1(){
                               return localNextApplyDate1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextApplyDate1
                               */
                               public void setNextApplyDate1(com.comverse.www.DateAttributeJAXBElement param){
                            localNextApplyDate1Tracker = true;
                                   
                                            this.localNextApplyDate1=param;
                                    

                               }
                            

                        /**
                        * field for NextApplyDate2
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextApplyDate2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextApplyDate2Tracker = false ;

                           public boolean isNextApplyDate2Specified(){
                               return localNextApplyDate2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextApplyDate2(){
                               return localNextApplyDate2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextApplyDate2
                               */
                               public void setNextApplyDate2(com.comverse.www.DateAttributeJAXBElement param){
                            localNextApplyDate2Tracker = true;
                                   
                                            this.localNextApplyDate2=param;
                                    

                               }
                            

                        /**
                        * field for NextApplyDate3
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextApplyDate3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextApplyDate3Tracker = false ;

                           public boolean isNextApplyDate3Specified(){
                               return localNextApplyDate3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextApplyDate3(){
                               return localNextApplyDate3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextApplyDate3
                               */
                               public void setNextApplyDate3(com.comverse.www.DateAttributeJAXBElement param){
                            localNextApplyDate3Tracker = true;
                                   
                                            this.localNextApplyDate3=param;
                                    

                               }
                            

                        /**
                        * field for NextApplyDate4
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextApplyDate4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextApplyDate4Tracker = false ;

                           public boolean isNextApplyDate4Specified(){
                               return localNextApplyDate4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextApplyDate4(){
                               return localNextApplyDate4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextApplyDate4
                               */
                               public void setNextApplyDate4(com.comverse.www.DateAttributeJAXBElement param){
                            localNextApplyDate4Tracker = true;
                                   
                                            this.localNextApplyDate4=param;
                                    

                               }
                            

                        /**
                        * field for NextApplyDate5
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextApplyDate5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextApplyDate5Tracker = false ;

                           public boolean isNextApplyDate5Specified(){
                               return localNextApplyDate5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextApplyDate5(){
                               return localNextApplyDate5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextApplyDate5
                               */
                               public void setNextApplyDate5(com.comverse.www.DateAttributeJAXBElement param){
                            localNextApplyDate5Tracker = true;
                                   
                                            this.localNextApplyDate5=param;
                                    

                               }
                            

                        /**
                        * field for NextGrantSyncDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextGrantSyncDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextGrantSyncDateTracker = false ;

                           public boolean isNextGrantSyncDateSpecified(){
                               return localNextGrantSyncDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextGrantSyncDate(){
                               return localNextGrantSyncDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextGrantSyncDate
                               */
                               public void setNextGrantSyncDate(com.comverse.www.DateAttributeJAXBElement param){
                            localNextGrantSyncDateTracker = true;
                                   
                                            this.localNextGrantSyncDate=param;
                                    

                               }
                            

                        /**
                        * field for NoBill
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localNoBill ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNoBillTracker = false ;

                           public boolean isNoBillSpecified(){
                               return localNoBillTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getNoBill(){
                               return localNoBill;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoBill
                               */
                               public void setNoBill(com.comverse.www.BooleanAttributeJAXBElement param){
                            localNoBillTracker = param != null;
                                   
                                            this.localNoBill=param;
                                    

                               }
                            

                        /**
                        * field for NoOfAccumulators
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localNoOfAccumulators ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNoOfAccumulatorsTracker = false ;

                           public boolean isNoOfAccumulatorsSpecified(){
                               return localNoOfAccumulatorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getNoOfAccumulators(){
                               return localNoOfAccumulators;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoOfAccumulators
                               */
                               public void setNoOfAccumulators(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localNoOfAccumulatorsTracker = param != null;
                                   
                                            this.localNoOfAccumulators=param;
                                    

                               }
                            

                        /**
                        * field for NoOfBalances
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localNoOfBalances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNoOfBalancesTracker = false ;

                           public boolean isNoOfBalancesSpecified(){
                               return localNoOfBalancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getNoOfBalances(){
                               return localNoOfBalances;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoOfBalances
                               */
                               public void setNoOfBalances(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localNoOfBalancesTracker = param != null;
                                   
                                            this.localNoOfBalances=param;
                                    

                               }
                            

                        /**
                        * field for NotifRecipientExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localNotifRecipientExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNotifRecipientExternalIdTracker = false ;

                           public boolean isNotifRecipientExternalIdSpecified(){
                               return localNotifRecipientExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getNotifRecipientExternalId(){
                               return localNotifRecipientExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotifRecipientExternalId
                               */
                               public void setNotifRecipientExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localNotifRecipientExternalIdTracker = true;
                                   
                                            this.localNotifRecipientExternalId=param;
                                    

                               }
                            

                        /**
                        * field for NotificationLanguage
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localNotificationLanguage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNotificationLanguageTracker = false ;

                           public boolean isNotificationLanguageSpecified(){
                               return localNotificationLanguageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getNotificationLanguage(){
                               return localNotificationLanguage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotificationLanguage
                               */
                               public void setNotificationLanguage(com.comverse.www.ShortAttributeJAXBElement param){
                            localNotificationLanguageTracker = true;
                                   
                                            this.localNotificationLanguage=param;
                                    

                               }
                            

                        /**
                        * field for NumberFreeAnCalls
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localNumberFreeAnCalls ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberFreeAnCallsTracker = false ;

                           public boolean isNumberFreeAnCallsSpecified(){
                               return localNumberFreeAnCallsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getNumberFreeAnCalls(){
                               return localNumberFreeAnCalls;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberFreeAnCalls
                               */
                               public void setNumberFreeAnCalls(com.comverse.www.ShortAttributeJAXBElement param){
                            localNumberFreeAnCallsTracker = true;
                                   
                                            this.localNumberFreeAnCalls=param;
                                    

                               }
                            

                        /**
                        * field for OptionalEndorsementLine
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localOptionalEndorsementLine ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOptionalEndorsementLineTracker = false ;

                           public boolean isOptionalEndorsementLineSpecified(){
                               return localOptionalEndorsementLineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getOptionalEndorsementLine(){
                               return localOptionalEndorsementLine;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OptionalEndorsementLine
                               */
                               public void setOptionalEndorsementLine(com.comverse.www.StringAttributeJAXBElement param){
                            localOptionalEndorsementLineTracker = true;
                                   
                                            this.localOptionalEndorsementLine=param;
                                    

                               }
                            

                        /**
                        * field for ParentAccountInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localParentAccountInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentAccountInternalIdTracker = false ;

                           public boolean isParentAccountInternalIdSpecified(){
                               return localParentAccountInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getParentAccountInternalId(){
                               return localParentAccountInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentAccountInternalId
                               */
                               public void setParentAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localParentAccountInternalIdTracker = param != null;
                                   
                                            this.localParentAccountInternalId=param;
                                    

                               }
                            

                        /**
                        * field for PaymentMode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localPaymentMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaymentModeTracker = false ;

                           public boolean isPaymentModeSpecified(){
                               return localPaymentModeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getPaymentMode(){
                               return localPaymentMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PaymentMode
                               */
                               public void setPaymentMode(com.comverse.www.ShortAttributeJAXBElement param){
                            localPaymentModeTracker = param != null;
                                   
                                            this.localPaymentMode=param;
                                    

                               }
                            

                        /**
                        * field for PendingCharges
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localPendingCharges ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPendingChargesTracker = false ;

                           public boolean isPendingChargesSpecified(){
                               return localPendingChargesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getPendingCharges(){
                               return localPendingCharges;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PendingCharges
                               */
                               public void setPendingCharges(com.comverse.www.BooleanAttributeJAXBElement param){
                            localPendingChargesTracker = param != null;
                                   
                                            this.localPendingCharges=param;
                                    

                               }
                            

                        /**
                        * field for Pin
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localPin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPinTracker = false ;

                           public boolean isPinSpecified(){
                               return localPinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getPin(){
                               return localPin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pin
                               */
                               public void setPin(com.comverse.www.StringAttributeJAXBElement param){
                            localPinTracker = true;
                                   
                                            this.localPin=param;
                                    

                               }
                            

                        /**
                        * field for PinChangeNeeded
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localPinChangeNeeded ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPinChangeNeededTracker = false ;

                           public boolean isPinChangeNeededSpecified(){
                               return localPinChangeNeededTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getPinChangeNeeded(){
                               return localPinChangeNeeded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PinChangeNeeded
                               */
                               public void setPinChangeNeeded(com.comverse.www.BooleanAttributeJAXBElement param){
                            localPinChangeNeededTracker = param != null;
                                   
                                            this.localPinChangeNeeded=param;
                                    

                               }
                            

                        /**
                        * field for PinLastHack
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localPinLastHack ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPinLastHackTracker = false ;

                           public boolean isPinLastHackSpecified(){
                               return localPinLastHackTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getPinLastHack(){
                               return localPinLastHack;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PinLastHack
                               */
                               public void setPinLastHack(com.comverse.www.DateAttributeJAXBElement param){
                            localPinLastHackTracker = true;
                                   
                                            this.localPinLastHack=param;
                                    

                               }
                            

                        /**
                        * field for PinLockoutCount
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localPinLockoutCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPinLockoutCountTracker = false ;

                           public boolean isPinLockoutCountSpecified(){
                               return localPinLockoutCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getPinLockoutCount(){
                               return localPinLockoutCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PinLockoutCount
                               */
                               public void setPinLockoutCount(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localPinLockoutCountTracker = true;
                                   
                                            this.localPinLockoutCount=param;
                                    

                               }
                            

                        /**
                        * field for PopUnits
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localPopUnits ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPopUnitsTracker = false ;

                           public boolean isPopUnitsSpecified(){
                               return localPopUnitsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getPopUnits(){
                               return localPopUnits;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PopUnits
                               */
                               public void setPopUnits(com.comverse.www.IntegerAttributeJAXBElement param){
                            localPopUnitsTracker = true;
                                   
                                            this.localPopUnits=param;
                                    

                               }
                            

                        /**
                        * field for PostalCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localPostalCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostalCodeTracker = false ;

                           public boolean isPostalCodeSpecified(){
                               return localPostalCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getPostalCode(){
                               return localPostalCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostalCode
                               */
                               public void setPostalCode(com.comverse.www.StringAttributeJAXBElement param){
                            localPostalCodeTracker = true;
                                   
                                            this.localPostalCode=param;
                                    

                               }
                            

                        /**
                        * field for PostfixDirectional
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localPostfixDirectional ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostfixDirectionalTracker = false ;

                           public boolean isPostfixDirectionalSpecified(){
                               return localPostfixDirectionalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getPostfixDirectional(){
                               return localPostfixDirectional;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostfixDirectional
                               */
                               public void setPostfixDirectional(com.comverse.www.StringAttributeJAXBElement param){
                            localPostfixDirectionalTracker = true;
                                   
                                            this.localPostfixDirectional=param;
                                    

                               }
                            

                        /**
                        * field for PostnetAddressBlockBarcode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localPostnetAddressBlockBarcode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostnetAddressBlockBarcodeTracker = false ;

                           public boolean isPostnetAddressBlockBarcodeSpecified(){
                               return localPostnetAddressBlockBarcodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getPostnetAddressBlockBarcode(){
                               return localPostnetAddressBlockBarcode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostnetAddressBlockBarcode
                               */
                               public void setPostnetAddressBlockBarcode(com.comverse.www.StringAttributeJAXBElement param){
                            localPostnetAddressBlockBarcodeTracker = true;
                                   
                                            this.localPostnetAddressBlockBarcode=param;
                                    

                               }
                            

                        /**
                        * field for PostnetBarcode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localPostnetBarcode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostnetBarcodeTracker = false ;

                           public boolean isPostnetBarcodeSpecified(){
                               return localPostnetBarcodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getPostnetBarcode(){
                               return localPostnetBarcode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostnetBarcode
                               */
                               public void setPostnetBarcode(com.comverse.www.StringAttributeJAXBElement param){
                            localPostnetBarcodeTracker = true;
                                   
                                            this.localPostnetBarcode=param;
                                    

                               }
                            

                        /**
                        * field for PrefixDirectional
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localPrefixDirectional ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrefixDirectionalTracker = false ;

                           public boolean isPrefixDirectionalSpecified(){
                               return localPrefixDirectionalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getPrefixDirectional(){
                               return localPrefixDirectional;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrefixDirectional
                               */
                               public void setPrefixDirectional(com.comverse.www.StringAttributeJAXBElement param){
                            localPrefixDirectionalTracker = true;
                                   
                                            this.localPrefixDirectional=param;
                                    

                               }
                            

                        /**
                        * field for PrevViewId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localPrevViewId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrevViewIdTracker = false ;

                           public boolean isPrevViewIdSpecified(){
                               return localPrevViewIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getPrevViewId(){
                               return localPrevViewId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrevViewId
                               */
                               public void setPrevViewId(com.comverse.www.LongAttributeJAXBElement param){
                            localPrevViewIdTracker = true;
                                   
                                            this.localPrevViewId=param;
                                    

                               }
                            

                        /**
                        * field for PreviousRatingState
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localPreviousRatingState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPreviousRatingStateTracker = false ;

                           public boolean isPreviousRatingStateSpecified(){
                               return localPreviousRatingStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getPreviousRatingState(){
                               return localPreviousRatingState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PreviousRatingState
                               */
                               public void setPreviousRatingState(com.comverse.www.ShortAttributeJAXBElement param){
                            localPreviousRatingStateTracker = param != null;
                                   
                                            this.localPreviousRatingState=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryOfferId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localPrimaryOfferId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryOfferIdTracker = false ;

                           public boolean isPrimaryOfferIdSpecified(){
                               return localPrimaryOfferIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getPrimaryOfferId(){
                               return localPrimaryOfferId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryOfferId
                               */
                               public void setPrimaryOfferId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localPrimaryOfferIdTracker = param != null;
                                   
                                            this.localPrimaryOfferId=param;
                                    

                               }
                            

                        /**
                        * field for PrivacyLevel
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localPrivacyLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrivacyLevelTracker = false ;

                           public boolean isPrivacyLevelSpecified(){
                               return localPrivacyLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getPrivacyLevel(){
                               return localPrivacyLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrivacyLevel
                               */
                               public void setPrivacyLevel(com.comverse.www.ShortAttributeJAXBElement param){
                            localPrivacyLevelTracker = param != null;
                                   
                                            this.localPrivacyLevel=param;
                                    

                               }
                            

                        /**
                        * field for PromisedPaymentAmt
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localPromisedPaymentAmt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPromisedPaymentAmtTracker = false ;

                           public boolean isPromisedPaymentAmtSpecified(){
                               return localPromisedPaymentAmtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getPromisedPaymentAmt(){
                               return localPromisedPaymentAmt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PromisedPaymentAmt
                               */
                               public void setPromisedPaymentAmt(com.comverse.www.NumericAttributeJAXBElement param){
                            localPromisedPaymentAmtTracker = true;
                                   
                                            this.localPromisedPaymentAmt=param;
                                    

                               }
                            

                        /**
                        * field for RangeMapExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localRangeMapExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRangeMapExternalIdTracker = false ;

                           public boolean isRangeMapExternalIdSpecified(){
                               return localRangeMapExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getRangeMapExternalId(){
                               return localRangeMapExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RangeMapExternalId
                               */
                               public void setRangeMapExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localRangeMapExternalIdTracker = true;
                                   
                                            this.localRangeMapExternalId=param;
                                    

                               }
                            

                        /**
                        * field for RateClass
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRateClass ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateClassTracker = false ;

                           public boolean isRateClassSpecified(){
                               return localRateClassTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRateClass(){
                               return localRateClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateClass
                               */
                               public void setRateClass(com.comverse.www.ShortAttributeJAXBElement param){
                            localRateClassTracker = true;
                                   
                                            this.localRateClass=param;
                                    

                               }
                            

                        /**
                        * field for RatingLastTransDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localRatingLastTransDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingLastTransDateTracker = false ;

                           public boolean isRatingLastTransDateSpecified(){
                               return localRatingLastTransDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getRatingLastTransDate(){
                               return localRatingLastTransDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatingLastTransDate
                               */
                               public void setRatingLastTransDate(com.comverse.www.DateAttributeJAXBElement param){
                            localRatingLastTransDateTracker = true;
                                   
                                            this.localRatingLastTransDate=param;
                                    

                               }
                            

                        /**
                        * field for RatingNextState
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRatingNextState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingNextStateTracker = false ;

                           public boolean isRatingNextStateSpecified(){
                               return localRatingNextStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRatingNextState(){
                               return localRatingNextState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatingNextState
                               */
                               public void setRatingNextState(com.comverse.www.ShortAttributeJAXBElement param){
                            localRatingNextStateTracker = param != null;
                                   
                                            this.localRatingNextState=param;
                                    

                               }
                            

                        /**
                        * field for RatingPrevTransDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localRatingPrevTransDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingPrevTransDateTracker = false ;

                           public boolean isRatingPrevTransDateSpecified(){
                               return localRatingPrevTransDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getRatingPrevTransDate(){
                               return localRatingPrevTransDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatingPrevTransDate
                               */
                               public void setRatingPrevTransDate(com.comverse.www.DateAttributeJAXBElement param){
                            localRatingPrevTransDateTracker = true;
                                   
                                            this.localRatingPrevTransDate=param;
                                    

                               }
                            

                        /**
                        * field for RatingState
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRatingState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingStateTracker = false ;

                           public boolean isRatingStateSpecified(){
                               return localRatingStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRatingState(){
                               return localRatingState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatingState
                               */
                               public void setRatingState(com.comverse.www.ShortAttributeJAXBElement param){
                            localRatingStateTracker = param != null;
                                   
                                            this.localRatingState=param;
                                    

                               }
                            

                        /**
                        * field for RealServiceInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localRealServiceInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealServiceInternalIdTracker = false ;

                           public boolean isRealServiceInternalIdSpecified(){
                               return localRealServiceInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getRealServiceInternalId(){
                               return localRealServiceInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RealServiceInternalId
                               */
                               public void setRealServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localRealServiceInternalIdTracker = true;
                                   
                                            this.localRealServiceInternalId=param;
                                    

                               }
                            

                        /**
                        * field for RealServiceInternalIdResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRealServiceInternalIdResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealServiceInternalIdResetsTracker = false ;

                           public boolean isRealServiceInternalIdResetsSpecified(){
                               return localRealServiceInternalIdResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRealServiceInternalIdResets(){
                               return localRealServiceInternalIdResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RealServiceInternalIdResets
                               */
                               public void setRealServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localRealServiceInternalIdResetsTracker = true;
                                   
                                            this.localRealServiceInternalIdResets=param;
                                    

                               }
                            

                        /**
                        * field for RealShadowUsageOrder
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRealShadowUsageOrder ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealShadowUsageOrderTracker = false ;

                           public boolean isRealShadowUsageOrderSpecified(){
                               return localRealShadowUsageOrderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRealShadowUsageOrder(){
                               return localRealShadowUsageOrder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RealShadowUsageOrder
                               */
                               public void setRealShadowUsageOrder(com.comverse.www.ShortAttributeJAXBElement param){
                            localRealShadowUsageOrderTracker = true;
                                   
                                            this.localRealShadowUsageOrder=param;
                                    

                               }
                            

                        /**
                        * field for RechLastHack
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localRechLastHack ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRechLastHackTracker = false ;

                           public boolean isRechLastHackSpecified(){
                               return localRechLastHackTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getRechLastHack(){
                               return localRechLastHack;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RechLastHack
                               */
                               public void setRechLastHack(com.comverse.www.DateAttributeJAXBElement param){
                            localRechLastHackTracker = true;
                                   
                                            this.localRechLastHack=param;
                                    

                               }
                            

                        /**
                        * field for RechLockCount
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localRechLockCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRechLockCountTracker = false ;

                           public boolean isRechLockCountSpecified(){
                               return localRechLockCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getRechLockCount(){
                               return localRechLockCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RechLockCount
                               */
                               public void setRechLockCount(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localRechLockCountTracker = true;
                                   
                                            this.localRechLockCount=param;
                                    

                               }
                            

                        /**
                        * field for ResellerId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localResellerId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResellerIdTracker = false ;

                           public boolean isResellerIdSpecified(){
                               return localResellerIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getResellerId(){
                               return localResellerId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResellerId
                               */
                               public void setResellerId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localResellerIdTracker = param != null;
                                   
                                            this.localResellerId=param;
                                    

                               }
                            

                        /**
                        * field for RevRcvCostCtr
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRevRcvCostCtr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRevRcvCostCtrTracker = false ;

                           public boolean isRevRcvCostCtrSpecified(){
                               return localRevRcvCostCtrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRevRcvCostCtr(){
                               return localRevRcvCostCtr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RevRcvCostCtr
                               */
                               public void setRevRcvCostCtr(com.comverse.www.ShortAttributeJAXBElement param){
                            localRevRcvCostCtrTracker = param != null;
                                   
                                            this.localRevRcvCostCtr=param;
                                    

                               }
                            

                        /**
                        * field for ServiceActiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localServiceActiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceActiveDtTracker = false ;

                           public boolean isServiceActiveDtSpecified(){
                               return localServiceActiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getServiceActiveDt(){
                               return localServiceActiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceActiveDt
                               */
                               public void setServiceActiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localServiceActiveDtTracker = true;
                                   
                                            this.localServiceActiveDt=param;
                                    

                               }
                            

                        /**
                        * field for ServiceCompany
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceCompany ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceCompanyTracker = false ;

                           public boolean isServiceCompanySpecified(){
                               return localServiceCompanyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceCompany(){
                               return localServiceCompany;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceCompany
                               */
                               public void setServiceCompany(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceCompanyTracker = true;
                                   
                                            this.localServiceCompany=param;
                                    

                               }
                            

                        /**
                        * field for ServiceExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceExternalIdTracker = false ;

                           public boolean isServiceExternalIdSpecified(){
                               return localServiceExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceExternalId(){
                               return localServiceExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceExternalId
                               */
                               public void setServiceExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceExternalIdTracker = param != null;
                                   
                                            this.localServiceExternalId=param;
                                    

                               }
                            

                        /**
                        * field for ServiceExternalIdType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localServiceExternalIdType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceExternalIdTypeTracker = false ;

                           public boolean isServiceExternalIdTypeSpecified(){
                               return localServiceExternalIdTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getServiceExternalIdType(){
                               return localServiceExternalIdType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceExternalIdType
                               */
                               public void setServiceExternalIdType(com.comverse.www.ShortAttributeJAXBElement param){
                            localServiceExternalIdTypeTracker = param != null;
                                   
                                            this.localServiceExternalIdType=param;
                                    

                               }
                            

                        /**
                        * field for ServiceFname
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceFname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceFnameTracker = false ;

                           public boolean isServiceFnameSpecified(){
                               return localServiceFnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceFname(){
                               return localServiceFname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceFname
                               */
                               public void setServiceFname(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceFnameTracker = true;
                                   
                                            this.localServiceFname=param;
                                    

                               }
                            

                        /**
                        * field for ServiceFranchiseTaxCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localServiceFranchiseTaxCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceFranchiseTaxCodeTracker = false ;

                           public boolean isServiceFranchiseTaxCodeSpecified(){
                               return localServiceFranchiseTaxCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getServiceFranchiseTaxCode(){
                               return localServiceFranchiseTaxCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceFranchiseTaxCode
                               */
                               public void setServiceFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localServiceFranchiseTaxCodeTracker = true;
                                   
                                            this.localServiceFranchiseTaxCode=param;
                                    

                               }
                            

                        /**
                        * field for ServiceGeocode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceGeocode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceGeocodeTracker = false ;

                           public boolean isServiceGeocodeSpecified(){
                               return localServiceGeocodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceGeocode(){
                               return localServiceGeocode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceGeocode
                               */
                               public void setServiceGeocode(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceGeocodeTracker = true;
                                   
                                            this.localServiceGeocode=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInactiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localServiceInactiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceInactiveDtTracker = false ;

                           public boolean isServiceInactiveDtSpecified(){
                               return localServiceInactiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getServiceInactiveDt(){
                               return localServiceInactiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInactiveDt
                               */
                               public void setServiceInactiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localServiceInactiveDtTracker = true;
                                   
                                            this.localServiceInactiveDt=param;
                                    

                               }
                            

                        /**
                        * field for ServiceLname
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceLname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceLnameTracker = false ;

                           public boolean isServiceLnameSpecified(){
                               return localServiceLnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceLname(){
                               return localServiceLname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceLname
                               */
                               public void setServiceLname(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceLnameTracker = true;
                                   
                                            this.localServiceLname=param;
                                    

                               }
                            

                        /**
                        * field for ServiceMinit
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceMinit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceMinitTracker = false ;

                           public boolean isServiceMinitSpecified(){
                               return localServiceMinitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceMinit(){
                               return localServiceMinit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceMinit
                               */
                               public void setServiceMinit(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceMinitTracker = true;
                                   
                                            this.localServiceMinit=param;
                                    

                               }
                            

                        /**
                        * field for ServiceNameGeneration
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceNameGeneration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceNameGenerationTracker = false ;

                           public boolean isServiceNameGenerationSpecified(){
                               return localServiceNameGenerationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceNameGeneration(){
                               return localServiceNameGeneration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceNameGeneration
                               */
                               public void setServiceNameGeneration(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceNameGenerationTracker = true;
                                   
                                            this.localServiceNameGeneration=param;
                                    

                               }
                            

                        /**
                        * field for ServiceNamePre
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceNamePre ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceNamePreTracker = false ;

                           public boolean isServiceNamePreSpecified(){
                               return localServiceNamePreTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceNamePre(){
                               return localServiceNamePre;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceNamePre
                               */
                               public void setServiceNamePre(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceNamePreTracker = true;
                                   
                                            this.localServiceNamePre=param;
                                    

                               }
                            

                        /**
                        * field for ServicePhone
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServicePhone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServicePhoneTracker = false ;

                           public boolean isServicePhoneSpecified(){
                               return localServicePhoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServicePhone(){
                               return localServicePhone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServicePhone
                               */
                               public void setServicePhone(com.comverse.www.StringAttributeJAXBElement param){
                            localServicePhoneTracker = true;
                                   
                                            this.localServicePhone=param;
                                    

                               }
                            

                        /**
                        * field for ServicePhone2
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServicePhone2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServicePhone2Tracker = false ;

                           public boolean isServicePhone2Specified(){
                               return localServicePhone2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServicePhone2(){
                               return localServicePhone2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServicePhone2
                               */
                               public void setServicePhone2(com.comverse.www.StringAttributeJAXBElement param){
                            localServicePhone2Tracker = true;
                                   
                                            this.localServicePhone2=param;
                                    

                               }
                            

                        /**
                        * field for SpecialDate1
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localSpecialDate1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialDate1Tracker = false ;

                           public boolean isSpecialDate1Specified(){
                               return localSpecialDate1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getSpecialDate1(){
                               return localSpecialDate1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialDate1
                               */
                               public void setSpecialDate1(com.comverse.www.DateAttributeJAXBElement param){
                            localSpecialDate1Tracker = true;
                                   
                                            this.localSpecialDate1=param;
                                    

                               }
                            

                        /**
                        * field for SpecialDate2
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localSpecialDate2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialDate2Tracker = false ;

                           public boolean isSpecialDate2Specified(){
                               return localSpecialDate2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getSpecialDate2(){
                               return localSpecialDate2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialDate2
                               */
                               public void setSpecialDate2(com.comverse.www.DateAttributeJAXBElement param){
                            localSpecialDate2Tracker = true;
                                   
                                            this.localSpecialDate2=param;
                                    

                               }
                            

                        /**
                        * field for SpecialDate3
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localSpecialDate3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialDate3Tracker = false ;

                           public boolean isSpecialDate3Specified(){
                               return localSpecialDate3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getSpecialDate3(){
                               return localSpecialDate3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialDate3
                               */
                               public void setSpecialDate3(com.comverse.www.DateAttributeJAXBElement param){
                            localSpecialDate3Tracker = true;
                                   
                                            this.localSpecialDate3=param;
                                    

                               }
                            

                        /**
                        * field for SpecialDate4
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localSpecialDate4 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialDate4Tracker = false ;

                           public boolean isSpecialDate4Specified(){
                               return localSpecialDate4Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getSpecialDate4(){
                               return localSpecialDate4;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialDate4
                               */
                               public void setSpecialDate4(com.comverse.www.DateAttributeJAXBElement param){
                            localSpecialDate4Tracker = true;
                                   
                                            this.localSpecialDate4=param;
                                    

                               }
                            

                        /**
                        * field for SpecialDate5
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localSpecialDate5 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialDate5Tracker = false ;

                           public boolean isSpecialDate5Specified(){
                               return localSpecialDate5Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getSpecialDate5(){
                               return localSpecialDate5;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialDate5
                               */
                               public void setSpecialDate5(com.comverse.www.DateAttributeJAXBElement param){
                            localSpecialDate5Tracker = true;
                                   
                                            this.localSpecialDate5=param;
                                    

                               }
                            

                        /**
                        * field for SpecialDateCounter
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localSpecialDateCounter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpecialDateCounterTracker = false ;

                           public boolean isSpecialDateCounterSpecified(){
                               return localSpecialDateCounterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getSpecialDateCounter(){
                               return localSpecialDateCounter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialDateCounter
                               */
                               public void setSpecialDateCounter(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localSpecialDateCounterTracker = true;
                                   
                                            this.localSpecialDateCounter=param;
                                    

                               }
                            

                        /**
                        * field for State
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateTracker = false ;

                           public boolean isStateSpecified(){
                               return localStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getState(){
                               return localState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param State
                               */
                               public void setState(com.comverse.www.StringAttributeJAXBElement param){
                            localStateTracker = true;
                                   
                                            this.localState=param;
                                    

                               }
                            

                        /**
                        * field for StatusId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localStatusId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusIdTracker = false ;

                           public boolean isStatusIdSpecified(){
                               return localStatusIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getStatusId(){
                               return localStatusId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusId
                               */
                               public void setStatusId(com.comverse.www.ShortAttributeJAXBElement param){
                            localStatusIdTracker = param != null;
                                   
                                            this.localStatusId=param;
                                    

                               }
                            

                        /**
                        * field for StatusReasonId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localStatusReasonId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusReasonIdTracker = false ;

                           public boolean isStatusReasonIdSpecified(){
                               return localStatusReasonIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getStatusReasonId(){
                               return localStatusReasonId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusReasonId
                               */
                               public void setStatusReasonId(com.comverse.www.ShortAttributeJAXBElement param){
                            localStatusReasonIdTracker = param != null;
                                   
                                            this.localStatusReasonId=param;
                                    

                               }
                            

                        /**
                        * field for StatusTypeId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localStatusTypeId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusTypeIdTracker = false ;

                           public boolean isStatusTypeIdSpecified(){
                               return localStatusTypeIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getStatusTypeId(){
                               return localStatusTypeId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusTypeId
                               */
                               public void setStatusTypeId(com.comverse.www.ShortAttributeJAXBElement param){
                            localStatusTypeIdTracker = param != null;
                                   
                                            this.localStatusTypeId=param;
                                    

                               }
                            

                        /**
                        * field for StreetName
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localStreetName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreetNameTracker = false ;

                           public boolean isStreetNameSpecified(){
                               return localStreetNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getStreetName(){
                               return localStreetName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreetName
                               */
                               public void setStreetName(com.comverse.www.StringAttributeJAXBElement param){
                            localStreetNameTracker = true;
                                   
                                            this.localStreetName=param;
                                    

                               }
                            

                        /**
                        * field for StreetSuffix
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localStreetSuffix ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStreetSuffixTracker = false ;

                           public boolean isStreetSuffixSpecified(){
                               return localStreetSuffixTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getStreetSuffix(){
                               return localStreetSuffix;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StreetSuffix
                               */
                               public void setStreetSuffix(com.comverse.www.StringAttributeJAXBElement param){
                            localStreetSuffixTracker = true;
                                   
                                            this.localStreetSuffix=param;
                                    

                               }
                            

                        /**
                        * field for SubNotifLevel
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localSubNotifLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubNotifLevelTracker = false ;

                           public boolean isSubNotifLevelSpecified(){
                               return localSubNotifLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getSubNotifLevel(){
                               return localSubNotifLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubNotifLevel
                               */
                               public void setSubNotifLevel(com.comverse.www.ShortAttributeJAXBElement param){
                            localSubNotifLevelTracker = true;
                                   
                                            this.localSubNotifLevel=param;
                                    

                               }
                            

                        /**
                        * field for SubbalcoreToAcctbalTransfer
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localSubbalcoreToAcctbalTransfer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubbalcoreToAcctbalTransferTracker = false ;

                           public boolean isSubbalcoreToAcctbalTransferSpecified(){
                               return localSubbalcoreToAcctbalTransferTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getSubbalcoreToAcctbalTransfer(){
                               return localSubbalcoreToAcctbalTransfer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubbalcoreToAcctbalTransfer
                               */
                               public void setSubbalcoreToAcctbalTransfer(com.comverse.www.BooleanAttributeJAXBElement param){
                            localSubbalcoreToAcctbalTransferTracker = param != null;
                                   
                                            this.localSubbalcoreToAcctbalTransfer=param;
                                    

                               }
                            

                        /**
                        * field for TargetAccountNo
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localTargetAccountNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetAccountNoTracker = false ;

                           public boolean isTargetAccountNoSpecified(){
                               return localTargetAccountNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getTargetAccountNo(){
                               return localTargetAccountNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetAccountNo
                               */
                               public void setTargetAccountNo(com.comverse.www.IntegerAttributeJAXBElement param){
                            localTargetAccountNoTracker = true;
                                   
                                            this.localTargetAccountNo=param;
                                    

                               }
                            

                        /**
                        * field for Timezone
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTimezone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimezoneTracker = false ;

                           public boolean isTimezoneSpecified(){
                               return localTimezoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTimezone(){
                               return localTimezone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Timezone
                               */
                               public void setTimezone(com.comverse.www.ShortAttributeJAXBElement param){
                            localTimezoneTracker = true;
                                   
                                            this.localTimezone=param;
                                    

                               }
                            

                        /**
                        * field for TransitionReason
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTransitionReason ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransitionReasonTracker = false ;

                           public boolean isTransitionReasonSpecified(){
                               return localTransitionReasonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTransitionReason(){
                               return localTransitionReason;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransitionReason
                               */
                               public void setTransitionReason(com.comverse.www.ShortAttributeJAXBElement param){
                            localTransitionReasonTracker = true;
                                   
                                            this.localTransitionReason=param;
                                    

                               }
                            

                        /**
                        * field for UnitNo
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localUnitNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUnitNoTracker = false ;

                           public boolean isUnitNoSpecified(){
                               return localUnitNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getUnitNo(){
                               return localUnitNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnitNo
                               */
                               public void setUnitNo(com.comverse.www.StringAttributeJAXBElement param){
                            localUnitNoTracker = true;
                                   
                                            this.localUnitNo=param;
                                    

                               }
                            

                        /**
                        * field for UnitType
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localUnitType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUnitTypeTracker = false ;

                           public boolean isUnitTypeSpecified(){
                               return localUnitTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getUnitType(){
                               return localUnitType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnitType
                               */
                               public void setUnitType(com.comverse.www.StringAttributeJAXBElement param){
                            localUnitTypeTracker = true;
                                   
                                            this.localUnitType=param;
                                    

                               }
                            

                        /**
                        * field for UsageEventsAllowed
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localUsageEventsAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsageEventsAllowedTracker = false ;

                           public boolean isUsageEventsAllowedSpecified(){
                               return localUsageEventsAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getUsageEventsAllowed(){
                               return localUsageEventsAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageEventsAllowed
                               */
                               public void setUsageEventsAllowed(com.comverse.www.ShortAttributeJAXBElement param){
                            localUsageEventsAllowedTracker = true;
                                   
                                            this.localUsageEventsAllowed=param;
                                    

                               }
                            

                        /**
                        * field for VertexGeocode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localVertexGeocode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVertexGeocodeTracker = false ;

                           public boolean isVertexGeocodeSpecified(){
                               return localVertexGeocodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getVertexGeocode(){
                               return localVertexGeocode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VertexGeocode
                               */
                               public void setVertexGeocode(com.comverse.www.StringAttributeJAXBElement param){
                            localVertexGeocodeTracker = true;
                                   
                                            this.localVertexGeocode=param;
                                    

                               }
                            

                        /**
                        * field for ViewCreatedDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localViewCreatedDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localViewCreatedDtTracker = false ;

                           public boolean isViewCreatedDtSpecified(){
                               return localViewCreatedDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getViewCreatedDt(){
                               return localViewCreatedDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ViewCreatedDt
                               */
                               public void setViewCreatedDt(com.comverse.www.DateAttributeJAXBElement param){
                            localViewCreatedDtTracker = param != null;
                                   
                                            this.localViewCreatedDt=param;
                                    

                               }
                            

                        /**
                        * field for ViewEffectiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localViewEffectiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localViewEffectiveDtTracker = false ;

                           public boolean isViewEffectiveDtSpecified(){
                               return localViewEffectiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getViewEffectiveDt(){
                               return localViewEffectiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ViewEffectiveDt
                               */
                               public void setViewEffectiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localViewEffectiveDtTracker = param != null;
                                   
                                            this.localViewEffectiveDt=param;
                                    

                               }
                            

                        /**
                        * field for ViewStatus
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localViewStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localViewStatusTracker = false ;

                           public boolean isViewStatusSpecified(){
                               return localViewStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getViewStatus(){
                               return localViewStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ViewStatus
                               */
                               public void setViewStatus(com.comverse.www.ShortAttributeJAXBElement param){
                            localViewStatusTracker = param != null;
                                   
                                            this.localViewStatus=param;
                                    

                               }
                            

                        /**
                        * field for AdvtAllowed
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAdvtAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdvtAllowedTracker = false ;

                           public boolean isAdvtAllowedSpecified(){
                               return localAdvtAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAdvtAllowed(){
                               return localAdvtAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdvtAllowed
                               */
                               public void setAdvtAllowed(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAdvtAllowedTracker = true;
                                   
                                            this.localAdvtAllowed=param;
                                    

                               }
                            

                        /**
                        * field for AvailableCyclicSpend
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localAvailableCyclicSpend ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvailableCyclicSpendTracker = false ;

                           public boolean isAvailableCyclicSpendSpecified(){
                               return localAvailableCyclicSpendTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getAvailableCyclicSpend(){
                               return localAvailableCyclicSpend;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvailableCyclicSpend
                               */
                               public void setAvailableCyclicSpend(com.comverse.www.NumericAttributeJAXBElement param){
                            localAvailableCyclicSpendTracker = true;
                                   
                                            this.localAvailableCyclicSpend=param;
                                    

                               }
                            

                        /**
                        * field for CyclicSpendNextResetDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localCyclicSpendNextResetDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCyclicSpendNextResetDateTracker = false ;

                           public boolean isCyclicSpendNextResetDateSpecified(){
                               return localCyclicSpendNextResetDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getCyclicSpendNextResetDate(){
                               return localCyclicSpendNextResetDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CyclicSpendNextResetDate
                               */
                               public void setCyclicSpendNextResetDate(com.comverse.www.DateAttributeJAXBElement param){
                            localCyclicSpendNextResetDateTracker = true;
                                   
                                            this.localCyclicSpendNextResetDate=param;
                                    

                               }
                            

                        /**
                        * field for CyclicSpendResetDay
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localCyclicSpendResetDay ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCyclicSpendResetDayTracker = false ;

                           public boolean isCyclicSpendResetDaySpecified(){
                               return localCyclicSpendResetDayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getCyclicSpendResetDay(){
                               return localCyclicSpendResetDay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CyclicSpendResetDay
                               */
                               public void setCyclicSpendResetDay(com.comverse.www.ShortAttributeJAXBElement param){
                            localCyclicSpendResetDayTracker = true;
                                   
                                            this.localCyclicSpendResetDay=param;
                                    

                               }
                            

                        /**
                        * field for CyclicSpendThreshold
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localCyclicSpendThreshold ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCyclicSpendThresholdTracker = false ;

                           public boolean isCyclicSpendThresholdSpecified(){
                               return localCyclicSpendThresholdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getCyclicSpendThreshold(){
                               return localCyclicSpendThreshold;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CyclicSpendThreshold
                               */
                               public void setCyclicSpendThreshold(com.comverse.www.NumericAttributeJAXBElement param){
                            localCyclicSpendThresholdTracker = true;
                                   
                                            this.localCyclicSpendThreshold=param;
                                    

                               }
                            

                        /**
                        * field for ThresholdType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localThresholdType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localThresholdTypeTracker = false ;

                           public boolean isThresholdTypeSpecified(){
                               return localThresholdTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getThresholdType(){
                               return localThresholdType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ThresholdType
                               */
                               public void setThresholdType(com.comverse.www.ShortAttributeJAXBElement param){
                            localThresholdTypeTracker = param != null;
                                   
                                            this.localThresholdType=param;
                                    

                               }
                            

                        /**
                        * field for AllowIntraGroupOnly
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAllowIntraGroupOnly ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAllowIntraGroupOnlyTracker = false ;

                           public boolean isAllowIntraGroupOnlySpecified(){
                               return localAllowIntraGroupOnlyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAllowIntraGroupOnly(){
                               return localAllowIntraGroupOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowIntraGroupOnly
                               */
                               public void setAllowIntraGroupOnly(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAllowIntraGroupOnlyTracker = true;
                                   
                                            this.localAllowIntraGroupOnly=param;
                                    

                               }
                            

                        /**
                        * field for GroupAccountName
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localGroupAccountName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupAccountNameTracker = false ;

                           public boolean isGroupAccountNameSpecified(){
                               return localGroupAccountNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getGroupAccountName(){
                               return localGroupAccountName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GroupAccountName
                               */
                               public void setGroupAccountName(com.comverse.www.StringAttributeJAXBElement param){
                            localGroupAccountNameTracker = true;
                                   
                                            this.localGroupAccountName=param;
                                    

                               }
                            

                        /**
                        * field for GroupAccountType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localGroupAccountType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupAccountTypeTracker = false ;

                           public boolean isGroupAccountTypeSpecified(){
                               return localGroupAccountTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getGroupAccountType(){
                               return localGroupAccountType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GroupAccountType
                               */
                               public void setGroupAccountType(com.comverse.www.ShortAttributeJAXBElement param){
                            localGroupAccountTypeTracker = true;
                                   
                                            this.localGroupAccountType=param;
                                    

                               }
                            

                        /**
                        * field for MembersAllowedDiffPo
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localMembersAllowedDiffPo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMembersAllowedDiffPoTracker = false ;

                           public boolean isMembersAllowedDiffPoSpecified(){
                               return localMembersAllowedDiffPoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getMembersAllowedDiffPo(){
                               return localMembersAllowedDiffPo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MembersAllowedDiffPo
                               */
                               public void setMembersAllowedDiffPo(com.comverse.www.BooleanAttributeJAXBElement param){
                            localMembersAllowedDiffPoTracker = true;
                                   
                                            this.localMembersAllowedDiffPo=param;
                                    

                               }
                            

                        /**
                        * field for NotificationHandling
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localNotificationHandling ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNotificationHandlingTracker = false ;

                           public boolean isNotificationHandlingSpecified(){
                               return localNotificationHandlingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getNotificationHandling(){
                               return localNotificationHandling;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NotificationHandling
                               */
                               public void setNotificationHandling(com.comverse.www.ShortAttributeJAXBElement param){
                            localNotificationHandlingTracker = true;
                                   
                                            this.localNotificationHandling=param;
                                    

                               }
                            

                        /**
                        * field for RcApplicability
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRcApplicability ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcApplicabilityTracker = false ;

                           public boolean isRcApplicabilitySpecified(){
                               return localRcApplicabilityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRcApplicability(){
                               return localRcApplicability;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RcApplicability
                               */
                               public void setRcApplicability(com.comverse.www.ShortAttributeJAXBElement param){
                            localRcApplicabilityTracker = true;
                                   
                                            this.localRcApplicability=param;
                                    

                               }
                            

                        /**
                        * field for TargetServiceInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localTargetServiceInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetServiceInternalIdTracker = false ;

                           public boolean isTargetServiceInternalIdSpecified(){
                               return localTargetServiceInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getTargetServiceInternalId(){
                               return localTargetServiceInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetServiceInternalId
                               */
                               public void setTargetServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localTargetServiceInternalIdTracker = true;
                                   
                                            this.localTargetServiceInternalId=param;
                                    

                               }
                            

                        /**
                        * field for TargetServiceInternalIdResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTargetServiceInternalIdResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetServiceInternalIdResetsTracker = false ;

                           public boolean isTargetServiceInternalIdResetsSpecified(){
                               return localTargetServiceInternalIdResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTargetServiceInternalIdResets(){
                               return localTargetServiceInternalIdResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetServiceInternalIdResets
                               */
                               public void setTargetServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localTargetServiceInternalIdResetsTracker = true;
                                   
                                            this.localTargetServiceInternalIdResets=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.comverse.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":subscriberBaseObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "subscriberBaseObject",
                           xmlWriter);
                   }

               
                                    namespace = "";
                                    writeStartElement(null, namespace, "attribs", xmlWriter);
                             
                                               if (localAttribs==java.lang.Byte.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("attribs cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localInforIndividualIdTracker){
                                    if (localInforIndividualId==null){

                                        writeStartElement(null, "", "inforIndividualId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInforIndividualId.serialize(new javax.xml.namespace.QName("","inforIndividualId"),
                                        xmlWriter);
                                    }
                                } if (localServiceInternalIdTracker){
                                            if (localServiceInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceInternalId cannot be null!!");
                                            }
                                           localServiceInternalId.serialize(new javax.xml.namespace.QName("","serviceInternalId"),
                                               xmlWriter);
                                        } if (localServiceInternalIdResetsTracker){
                                            if (localServiceInternalIdResets==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceInternalIdResets cannot be null!!");
                                            }
                                           localServiceInternalIdResets.serialize(new javax.xml.namespace.QName("","serviceInternalIdResets"),
                                               xmlWriter);
                                        } if (localViewIdTracker){
                                            if (localViewId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("viewId cannot be null!!");
                                            }
                                           localViewId.serialize(new javax.xml.namespace.QName("","viewId"),
                                               xmlWriter);
                                        } if (localSubscriberIdTracker){
                                            if (localSubscriberId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("subscriberId cannot be null!!");
                                            }
                                           localSubscriberId.serialize(new javax.xml.namespace.QName("","subscriberId"),
                                               xmlWriter);
                                        } if (localSubscriberExternalIdTypeTracker){
                                            if (localSubscriberExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("subscriberExternalIdType cannot be null!!");
                                            }
                                           localSubscriberExternalIdType.serialize(new javax.xml.namespace.QName("","subscriberExternalIdType"),
                                               xmlWriter);
                                        } if (localBEndAddressIdTracker){
                                    if (localBEndAddressId==null){

                                        writeStartElement(null, "", "BEndAddressId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBEndAddressId.serialize(new javax.xml.namespace.QName("","BEndAddressId"),
                                        xmlWriter);
                                    }
                                } if (localBRevRcvCostCtrTracker){
                                    if (localBRevRcvCostCtr==null){

                                        writeStartElement(null, "", "BRevRcvCostCtr", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBRevRcvCostCtr.serialize(new javax.xml.namespace.QName("","BRevRcvCostCtr"),
                                        xmlWriter);
                                    }
                                } if (localBServiceCompanyTracker){
                                    if (localBServiceCompany==null){

                                        writeStartElement(null, "", "BServiceCompany", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServiceCompany.serialize(new javax.xml.namespace.QName("","BServiceCompany"),
                                        xmlWriter);
                                    }
                                } if (localBServiceFnameTracker){
                                    if (localBServiceFname==null){

                                        writeStartElement(null, "", "BServiceFname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServiceFname.serialize(new javax.xml.namespace.QName("","BServiceFname"),
                                        xmlWriter);
                                    }
                                } if (localBServiceFranchiseTaxCodeTracker){
                                    if (localBServiceFranchiseTaxCode==null){

                                        writeStartElement(null, "", "BServiceFranchiseTaxCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServiceFranchiseTaxCode.serialize(new javax.xml.namespace.QName("","BServiceFranchiseTaxCode"),
                                        xmlWriter);
                                    }
                                } if (localBServiceGeocodeTracker){
                                    if (localBServiceGeocode==null){

                                        writeStartElement(null, "", "BServiceGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServiceGeocode.serialize(new javax.xml.namespace.QName("","BServiceGeocode"),
                                        xmlWriter);
                                    }
                                } if (localBServiceLnameTracker){
                                    if (localBServiceLname==null){

                                        writeStartElement(null, "", "BServiceLname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServiceLname.serialize(new javax.xml.namespace.QName("","BServiceLname"),
                                        xmlWriter);
                                    }
                                } if (localBServiceMinitTracker){
                                    if (localBServiceMinit==null){

                                        writeStartElement(null, "", "BServiceMinit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServiceMinit.serialize(new javax.xml.namespace.QName("","BServiceMinit"),
                                        xmlWriter);
                                    }
                                } if (localBServicePhoneTracker){
                                    if (localBServicePhone==null){

                                        writeStartElement(null, "", "BServicePhone", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServicePhone.serialize(new javax.xml.namespace.QName("","BServicePhone"),
                                        xmlWriter);
                                    }
                                } if (localBServicePhone2Tracker){
                                    if (localBServicePhone2==null){

                                        writeStartElement(null, "", "BServicePhone2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBServicePhone2.serialize(new javax.xml.namespace.QName("","BServicePhone2"),
                                        xmlWriter);
                                    }
                                } if (localAccountExternalIdTracker){
                                            if (localAccountExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountExternalId cannot be null!!");
                                            }
                                           localAccountExternalId.serialize(new javax.xml.namespace.QName("","accountExternalId"),
                                               xmlWriter);
                                        } if (localAccountExternalIdTypeTracker){
                                            if (localAccountExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountExternalIdType cannot be null!!");
                                            }
                                           localAccountExternalIdType.serialize(new javax.xml.namespace.QName("","accountExternalIdType"),
                                               xmlWriter);
                                        } if (localAccountTypeTracker){
                                    if (localAccountType==null){

                                        writeStartElement(null, "", "accountType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccountType.serialize(new javax.xml.namespace.QName("","accountType"),
                                        xmlWriter);
                                    }
                                } if (localAcctAccessAllowedTracker){
                                            if (localAcctAccessAllowed==null){
                                                 throw new org.apache.axis2.databinding.ADBException("acctAccessAllowed cannot be null!!");
                                            }
                                           localAcctAccessAllowed.serialize(new javax.xml.namespace.QName("","acctAccessAllowed"),
                                               xmlWriter);
                                        } if (localAcctbalToSubbalcoreTransferTracker){
                                            if (localAcctbalToSubbalcoreTransfer==null){
                                                 throw new org.apache.axis2.databinding.ADBException("acctbalToSubbalcoreTransfer cannot be null!!");
                                            }
                                           localAcctbalToSubbalcoreTransfer.serialize(new javax.xml.namespace.QName("","acctbalToSubbalcoreTransfer"),
                                               xmlWriter);
                                        } if (localActiveDtTracker){
                                            if (localActiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activeDt cannot be null!!");
                                            }
                                           localActiveDt.serialize(new javax.xml.namespace.QName("","activeDt"),
                                               xmlWriter);
                                        } if (localActiveLrOverrideIdTracker){
                                            if (localActiveLrOverrideId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activeLrOverrideId cannot be null!!");
                                            }
                                           localActiveLrOverrideId.serialize(new javax.xml.namespace.QName("","activeLrOverrideId"),
                                               xmlWriter);
                                        } if (localAddress1Tracker){
                                    if (localAddress1==null){

                                        writeStartElement(null, "", "address1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAddress1.serialize(new javax.xml.namespace.QName("","address1"),
                                        xmlWriter);
                                    }
                                } if (localAddress2Tracker){
                                    if (localAddress2==null){

                                        writeStartElement(null, "", "address2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAddress2.serialize(new javax.xml.namespace.QName("","address2"),
                                        xmlWriter);
                                    }
                                } if (localAddress3Tracker){
                                    if (localAddress3==null){

                                        writeStartElement(null, "", "address3", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAddress3.serialize(new javax.xml.namespace.QName("","address3"),
                                        xmlWriter);
                                    }
                                } if (localAddress4Tracker){
                                    if (localAddress4==null){

                                        writeStartElement(null, "", "address4", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAddress4.serialize(new javax.xml.namespace.QName("","address4"),
                                        xmlWriter);
                                    }
                                } if (localAddressIdTracker){
                                            if (localAddressId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("addressId cannot be null!!");
                                            }
                                           localAddressId.serialize(new javax.xml.namespace.QName("","addressId"),
                                               xmlWriter);
                                        } if (localAddressTypeIdTracker){
                                            if (localAddressTypeId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("addressTypeId cannot be null!!");
                                            }
                                           localAddressTypeId.serialize(new javax.xml.namespace.QName("","addressTypeId"),
                                               xmlWriter);
                                        } if (localAddtlNotifExternalIdTracker){
                                    if (localAddtlNotifExternalId==null){

                                        writeStartElement(null, "", "addtlNotifExternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAddtlNotifExternalId.serialize(new javax.xml.namespace.QName("","addtlNotifExternalId"),
                                        xmlWriter);
                                    }
                                } if (localAgentIdTracker){
                                    if (localAgentId==null){

                                        writeStartElement(null, "", "agentId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAgentId.serialize(new javax.xml.namespace.QName("","agentId"),
                                        xmlWriter);
                                    }
                                } if (localAnniversaryTracker){
                                    if (localAnniversary==null){

                                        writeStartElement(null, "", "anniversary", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAnniversary.serialize(new javax.xml.namespace.QName("","anniversary"),
                                        xmlWriter);
                                    }
                                } if (localApplyDayTracker){
                                    if (localApplyDay==null){

                                        writeStartElement(null, "", "applyDay", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localApplyDay.serialize(new javax.xml.namespace.QName("","applyDay"),
                                        xmlWriter);
                                    }
                                } if (localBalTransMaxTracker){
                                    if (localBalTransMax==null){

                                        writeStartElement(null, "", "balTransMax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBalTransMax.serialize(new javax.xml.namespace.QName("","balTransMax"),
                                        xmlWriter);
                                    }
                                } if (localBalTransMinTracker){
                                    if (localBalTransMin==null){

                                        writeStartElement(null, "", "balTransMin", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBalTransMin.serialize(new javax.xml.namespace.QName("","balTransMin"),
                                        xmlWriter);
                                    }
                                } if (localBalTransResidualAmtTracker){
                                    if (localBalTransResidualAmt==null){

                                        writeStartElement(null, "", "balTransResidualAmt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBalTransResidualAmt.serialize(new javax.xml.namespace.QName("","balTransResidualAmt"),
                                        xmlWriter);
                                    }
                                } if (localBalTransferEnabledTracker){
                                            if (localBalTransferEnabled==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balTransferEnabled cannot be null!!");
                                            }
                                           localBalTransferEnabled.serialize(new javax.xml.namespace.QName("","balTransferEnabled"),
                                               xmlWriter);
                                        } if (localBirthdayTracker){
                                    if (localBirthday==null){

                                        writeStartElement(null, "", "birthday", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBirthday.serialize(new javax.xml.namespace.QName("","birthday"),
                                        xmlWriter);
                                    }
                                } if (localCfbNumberTracker){
                                    if (localCfbNumber==null){

                                        writeStartElement(null, "", "cfbNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCfbNumber.serialize(new javax.xml.namespace.QName("","cfbNumber"),
                                        xmlWriter);
                                    }
                                } if (localCfisNumberTracker){
                                    if (localCfisNumber==null){

                                        writeStartElement(null, "", "cfisNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCfisNumber.serialize(new javax.xml.namespace.QName("","cfisNumber"),
                                        xmlWriter);
                                    }
                                } if (localCfnaNumberTracker){
                                    if (localCfnaNumber==null){

                                        writeStartElement(null, "", "cfnaNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCfnaNumber.serialize(new javax.xml.namespace.QName("","cfnaNumber"),
                                        xmlWriter);
                                    }
                                } if (localCfuNumberTracker){
                                    if (localCfuNumber==null){

                                        writeStartElement(null, "", "cfuNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCfuNumber.serialize(new javax.xml.namespace.QName("","cfuNumber"),
                                        xmlWriter);
                                    }
                                } if (localChangeDtTracker){
                                            if (localChangeDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("changeDt cannot be null!!");
                                            }
                                           localChangeDt.serialize(new javax.xml.namespace.QName("","changeDt"),
                                               xmlWriter);
                                        } if (localChangeWhoTracker){
                                            if (localChangeWho==null){
                                                 throw new org.apache.axis2.databinding.ADBException("changeWho cannot be null!!");
                                            }
                                           localChangeWho.serialize(new javax.xml.namespace.QName("","changeWho"),
                                               xmlWriter);
                                        } if (localChargeAdviceTracker){
                                            if (localChargeAdvice==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chargeAdvice cannot be null!!");
                                            }
                                           localChargeAdvice.serialize(new javax.xml.namespace.QName("","chargeAdvice"),
                                               xmlWriter);
                                        } if (localChgDtTracker){
                                            if (localChgDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chgDt cannot be null!!");
                                            }
                                           localChgDt.serialize(new javax.xml.namespace.QName("","chgDt"),
                                               xmlWriter);
                                        } if (localChgWhoTracker){
                                            if (localChgWho==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chgWho cannot be null!!");
                                            }
                                           localChgWho.serialize(new javax.xml.namespace.QName("","chgWho"),
                                               xmlWriter);
                                        } if (localCircleFlagTracker){
                                            if (localCircleFlag==null){
                                                 throw new org.apache.axis2.databinding.ADBException("circleFlag cannot be null!!");
                                            }
                                           localCircleFlag.serialize(new javax.xml.namespace.QName("","circleFlag"),
                                               xmlWriter);
                                        } if (localCityTracker){
                                    if (localCity==null){

                                        writeStartElement(null, "", "city", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCity.serialize(new javax.xml.namespace.QName("","city"),
                                        xmlWriter);
                                    }
                                } if (localClassOfServiceCodeTracker){
                                            if (localClassOfServiceCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("classOfServiceCode cannot be null!!");
                                            }
                                           localClassOfServiceCode.serialize(new javax.xml.namespace.QName("","classOfServiceCode"),
                                               xmlWriter);
                                        } if (localCodewordTracker){
                                    if (localCodeword==null){

                                        writeStartElement(null, "", "codeword", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCodeword.serialize(new javax.xml.namespace.QName("","codeword"),
                                        xmlWriter);
                                    }
                                } if (localConvertedTracker){
                                            if (localConverted==null){
                                                 throw new org.apache.axis2.databinding.ADBException("converted cannot be null!!");
                                            }
                                           localConverted.serialize(new javax.xml.namespace.QName("","converted"),
                                               xmlWriter);
                                        } if (localCountryCodeTracker){
                                            if (localCountryCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("countryCode cannot be null!!");
                                            }
                                           localCountryCode.serialize(new javax.xml.namespace.QName("","countryCode"),
                                               xmlWriter);
                                        } if (localCountyTracker){
                                    if (localCounty==null){

                                        writeStartElement(null, "", "county", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCounty.serialize(new javax.xml.namespace.QName("","county"),
                                        xmlWriter);
                                    }
                                } if (localCreateDtTracker){
                                            if (localCreateDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("createDt cannot be null!!");
                                            }
                                           localCreateDt.serialize(new javax.xml.namespace.QName("","createDt"),
                                               xmlWriter);
                                        } if (localCurrencyCodeTracker){
                                    if (localCurrencyCode==null){

                                        writeStartElement(null, "", "currencyCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                        xmlWriter);
                                    }
                                } if (localDateEnterActiveTracker){
                                    if (localDateEnterActive==null){

                                        writeStartElement(null, "", "dateEnterActive", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDateEnterActive.serialize(new javax.xml.namespace.QName("","dateEnterActive"),
                                        xmlWriter);
                                    }
                                } if (localDateEnteredPostactiveTracker){
                                    if (localDateEnteredPostactive==null){

                                        writeStartElement(null, "", "dateEnteredPostactive", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDateEnteredPostactive.serialize(new javax.xml.namespace.QName("","dateEnteredPostactive"),
                                        xmlWriter);
                                    }
                                } if (localDateLastFreeAnCallTracker){
                                    if (localDateLastFreeAnCall==null){

                                        writeStartElement(null, "", "dateLastFreeAnCall", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDateLastFreeAnCall.serialize(new javax.xml.namespace.QName("","dateLastFreeAnCall"),
                                        xmlWriter);
                                    }
                                } if (localDealerIdTracker){
                                    if (localDealerId==null){

                                        writeStartElement(null, "", "dealerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDealerId.serialize(new javax.xml.namespace.QName("","dealerId"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber1Tracker){
                                    if (localDestNumber1==null){

                                        writeStartElement(null, "", "destNumber1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber1.serialize(new javax.xml.namespace.QName("","destNumber1"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber10Tracker){
                                    if (localDestNumber10==null){

                                        writeStartElement(null, "", "destNumber10", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber10.serialize(new javax.xml.namespace.QName("","destNumber10"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber2Tracker){
                                    if (localDestNumber2==null){

                                        writeStartElement(null, "", "destNumber2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber2.serialize(new javax.xml.namespace.QName("","destNumber2"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber3Tracker){
                                    if (localDestNumber3==null){

                                        writeStartElement(null, "", "destNumber3", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber3.serialize(new javax.xml.namespace.QName("","destNumber3"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber4Tracker){
                                    if (localDestNumber4==null){

                                        writeStartElement(null, "", "destNumber4", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber4.serialize(new javax.xml.namespace.QName("","destNumber4"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber5Tracker){
                                    if (localDestNumber5==null){

                                        writeStartElement(null, "", "destNumber5", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber5.serialize(new javax.xml.namespace.QName("","destNumber5"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber6Tracker){
                                    if (localDestNumber6==null){

                                        writeStartElement(null, "", "destNumber6", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber6.serialize(new javax.xml.namespace.QName("","destNumber6"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber7Tracker){
                                    if (localDestNumber7==null){

                                        writeStartElement(null, "", "destNumber7", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber7.serialize(new javax.xml.namespace.QName("","destNumber7"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber8Tracker){
                                    if (localDestNumber8==null){

                                        writeStartElement(null, "", "destNumber8", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber8.serialize(new javax.xml.namespace.QName("","destNumber8"),
                                        xmlWriter);
                                    }
                                } if (localDestNumber9Tracker){
                                    if (localDestNumber9==null){

                                        writeStartElement(null, "", "destNumber9", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDestNumber9.serialize(new javax.xml.namespace.QName("","destNumber9"),
                                        xmlWriter);
                                    }
                                } if (localDisplayAddressIdTracker){
                                            if (localDisplayAddressId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("displayAddressId cannot be null!!");
                                            }
                                           localDisplayAddressId.serialize(new javax.xml.namespace.QName("","displayAddressId"),
                                               xmlWriter);
                                        } if (localDisplayExternalIdTracker){
                                            if (localDisplayExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("displayExternalId cannot be null!!");
                                            }
                                           localDisplayExternalId.serialize(new javax.xml.namespace.QName("","displayExternalId"),
                                               xmlWriter);
                                        } if (localDisplayExternalIdTypeTracker){
                                            if (localDisplayExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("displayExternalIdType cannot be null!!");
                                            }
                                           localDisplayExternalIdType.serialize(new javax.xml.namespace.QName("","displayExternalIdType"),
                                               xmlWriter);
                                        } if (localEnableCdrTracker){
                                            if (localEnableCdr==null){
                                                 throw new org.apache.axis2.databinding.ADBException("enableCdr cannot be null!!");
                                            }
                                           localEnableCdr.serialize(new javax.xml.namespace.QName("","enableCdr"),
                                               xmlWriter);
                                        } if (localEquipClassCodeTracker){
                                            if (localEquipClassCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("equipClassCode cannot be null!!");
                                            }
                                           localEquipClassCode.serialize(new javax.xml.namespace.QName("","equipClassCode"),
                                               xmlWriter);
                                        } if (localEquipTypeCodeTracker){
                                            if (localEquipTypeCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("equipTypeCode cannot be null!!");
                                            }
                                           localEquipTypeCode.serialize(new javax.xml.namespace.QName("","equipTypeCode"),
                                               xmlWriter);
                                        } if (localExrateClassTracker){
                                    if (localExrateClass==null){

                                        writeStartElement(null, "", "exrateClass", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localExrateClass.serialize(new javax.xml.namespace.QName("","exrateClass"),
                                        xmlWriter);
                                    }
                                } if (localExtFlagTracker){
                                            if (localExtFlag==null){
                                                 throw new org.apache.axis2.databinding.ADBException("extFlag cannot be null!!");
                                            }
                                           localExtFlag.serialize(new javax.xml.namespace.QName("","extFlag"),
                                               xmlWriter);
                                        } if (localExtendedDataTracker){
                                            if (localExtendedData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                            }
                                           localExtendedData.serialize(new javax.xml.namespace.QName("","extendedData"),
                                               xmlWriter);
                                        } if (localExtendedPostalCodeTracker){
                                    if (localExtendedPostalCode==null){

                                        writeStartElement(null, "", "extendedPostalCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localExtendedPostalCode.serialize(new javax.xml.namespace.QName("","extendedPostalCode"),
                                        xmlWriter);
                                    }
                                } if (localExternalAddressIdTracker){
                                    if (localExternalAddressId==null){

                                        writeStartElement(null, "", "externalAddressId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localExternalAddressId.serialize(new javax.xml.namespace.QName("","externalAddressId"),
                                        xmlWriter);
                                    }
                                } if (localFavoriteAreaTracker){
                                    if (localFavoriteArea==null){

                                        writeStartElement(null, "", "favoriteArea", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFavoriteArea.serialize(new javax.xml.namespace.QName("","favoriteArea"),
                                        xmlWriter);
                                    }
                                } if (localFfChangeCountTracker){
                                    if (localFfChangeCount==null){

                                        writeStartElement(null, "", "ffChangeCount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFfChangeCount.serialize(new javax.xml.namespace.QName("","ffChangeCount"),
                                        xmlWriter);
                                    }
                                } if (localFranchiseTaxCodeTracker){
                                            if (localFranchiseTaxCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("franchiseTaxCode cannot be null!!");
                                            }
                                           localFranchiseTaxCode.serialize(new javax.xml.namespace.QName("","franchiseTaxCode"),
                                               xmlWriter);
                                        } if (localFreeFfChgAllowanceTracker){
                                    if (localFreeFfChgAllowance==null){

                                        writeStartElement(null, "", "freeFfChgAllowance", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFreeFfChgAllowance.serialize(new javax.xml.namespace.QName("","freeFfChgAllowance"),
                                        xmlWriter);
                                    }
                                } if (localFxGeocodeTracker){
                                            if (localFxGeocode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("fxGeocode cannot be null!!");
                                            }
                                           localFxGeocode.serialize(new javax.xml.namespace.QName("","fxGeocode"),
                                               xmlWriter);
                                        } if (localHappyHourEndTracker){
                                    if (localHappyHourEnd==null){

                                        writeStartElement(null, "", "happyHourEnd", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHappyHourEnd.serialize(new javax.xml.namespace.QName("","happyHourEnd"),
                                        xmlWriter);
                                    }
                                } if (localHappyHourStartTracker){
                                    if (localHappyHourStart==null){

                                        writeStartElement(null, "", "happyHourStart", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHappyHourStart.serialize(new javax.xml.namespace.QName("","happyHourStart"),
                                        xmlWriter);
                                    }
                                } if (localHasPendingOrdersTracker){
                                            if (localHasPendingOrders==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hasPendingOrders cannot be null!!");
                                            }
                                           localHasPendingOrders.serialize(new javax.xml.namespace.QName("","hasPendingOrders"),
                                               xmlWriter);
                                        } if (localHasRcAnncTracker){
                                    if (localHasRcAnnc==null){

                                        writeStartElement(null, "", "hasRcAnnc", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHasRcAnnc.serialize(new javax.xml.namespace.QName("","hasRcAnnc"),
                                        xmlWriter);
                                    }
                                } if (localHierarchyAccountInternalIdTracker){
                                            if (localHierarchyAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hierarchyAccountInternalId cannot be null!!");
                                            }
                                           localHierarchyAccountInternalId.serialize(new javax.xml.namespace.QName("","hierarchyAccountInternalId"),
                                               xmlWriter);
                                        } if (localHome1LiTracker){
                                    if (localHome1Li==null){

                                        writeStartElement(null, "", "home1Li", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHome1Li.serialize(new javax.xml.namespace.QName("","home1Li"),
                                        xmlWriter);
                                    }
                                } if (localHome2LiTracker){
                                    if (localHome2Li==null){

                                        writeStartElement(null, "", "home2Li", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHome2Li.serialize(new javax.xml.namespace.QName("","home2Li"),
                                        xmlWriter);
                                    }
                                } if (localHome3LiTracker){
                                    if (localHome3Li==null){

                                        writeStartElement(null, "", "home3Li", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHome3Li.serialize(new javax.xml.namespace.QName("","home3Li"),
                                        xmlWriter);
                                    }
                                } if (localHome4LiTracker){
                                    if (localHome4Li==null){

                                        writeStartElement(null, "", "home4Li", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHome4Li.serialize(new javax.xml.namespace.QName("","home4Li"),
                                        xmlWriter);
                                    }
                                } if (localHomeZoneTracker){
                                    if (localHomeZone==null){

                                        writeStartElement(null, "", "homeZone", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHomeZone.serialize(new javax.xml.namespace.QName("","homeZone"),
                                        xmlWriter);
                                    }
                                } if (localHouseNumberTracker){
                                    if (localHouseNumber==null){

                                        writeStartElement(null, "", "houseNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHouseNumber.serialize(new javax.xml.namespace.QName("","houseNumber"),
                                        xmlWriter);
                                    }
                                } if (localHouseNumberSuffixTracker){
                                    if (localHouseNumberSuffix==null){

                                        writeStartElement(null, "", "houseNumberSuffix", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHouseNumberSuffix.serialize(new javax.xml.namespace.QName("","houseNumberSuffix"),
                                        xmlWriter);
                                    }
                                } if (localId2HashTracker){
                                    if (localId2Hash==null){

                                        writeStartElement(null, "", "id2Hash", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localId2Hash.serialize(new javax.xml.namespace.QName("","id2Hash"),
                                        xmlWriter);
                                    }
                                } if (localInRatingDbTracker){
                                            if (localInRatingDb==null){
                                                 throw new org.apache.axis2.databinding.ADBException("inRatingDb cannot be null!!");
                                            }
                                           localInRatingDb.serialize(new javax.xml.namespace.QName("","inRatingDb"),
                                               xmlWriter);
                                        } if (localIndvCoreBalMinTracker){
                                    if (localIndvCoreBalMin==null){

                                        writeStartElement(null, "", "indvCoreBalMin", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localIndvCoreBalMin.serialize(new javax.xml.namespace.QName("","indvCoreBalMin"),
                                        xmlWriter);
                                    }
                                } if (localIndvCoreBalNotifThresholdTracker){
                                    if (localIndvCoreBalNotifThreshold==null){

                                        writeStartElement(null, "", "indvCoreBalNotifThreshold", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localIndvCoreBalNotifThreshold.serialize(new javax.xml.namespace.QName("","indvCoreBalNotifThreshold"),
                                        xmlWriter);
                                    }
                                } if (localIntendedViewEffectiveDtTracker){
                                            if (localIntendedViewEffectiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("intendedViewEffectiveDt cannot be null!!");
                                            }
                                           localIntendedViewEffectiveDt.serialize(new javax.xml.namespace.QName("","intendedViewEffectiveDt"),
                                               xmlWriter);
                                        } if (localIs1SaTracker){
                                            if (localIs1Sa==null){
                                                 throw new org.apache.axis2.databinding.ADBException("is1sa cannot be null!!");
                                            }
                                           localIs1Sa.serialize(new javax.xml.namespace.QName("","is1sa"),
                                               xmlWriter);
                                        } if (localIsActiveTracker){
                                            if (localIsActive==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isActive cannot be null!!");
                                            }
                                           localIsActive.serialize(new javax.xml.namespace.QName("","isActive"),
                                               xmlWriter);
                                        } if (localIsBalIncreasePpAvailedTracker){
                                            if (localIsBalIncreasePpAvailed==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isBalIncreasePpAvailed cannot be null!!");
                                            }
                                           localIsBalIncreasePpAvailed.serialize(new javax.xml.namespace.QName("","isBalIncreasePpAvailed"),
                                               xmlWriter);
                                        } if (localIsBalanceManagedTracker){
                                            if (localIsBalanceManaged==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isBalanceManaged cannot be null!!");
                                            }
                                           localIsBalanceManaged.serialize(new javax.xml.namespace.QName("","isBalanceManaged"),
                                               xmlWriter);
                                        } if (localIsInTriggeredTracker){
                                            if (localIsInTriggered==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isInTriggered cannot be null!!");
                                            }
                                           localIsInTriggered.serialize(new javax.xml.namespace.QName("","isInTriggered"),
                                               xmlWriter);
                                        } if (localIsNotificationRecipientTracker){
                                            if (localIsNotificationRecipient==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isNotificationRecipient cannot be null!!");
                                            }
                                           localIsNotificationRecipient.serialize(new javax.xml.namespace.QName("","isNotificationRecipient"),
                                               xmlWriter);
                                        } if (localIsPostactiveTracker){
                                            if (localIsPostactive==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isPostactive cannot be null!!");
                                            }
                                           localIsPostactive.serialize(new javax.xml.namespace.QName("","isPostactive"),
                                               xmlWriter);
                                        } if (localKeyLineCodeTracker){
                                    if (localKeyLineCode==null){

                                        writeStartElement(null, "", "keyLineCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localKeyLineCode.serialize(new javax.xml.namespace.QName("","keyLineCode"),
                                        xmlWriter);
                                    }
                                } if (localLanguageCodeTracker){
                                    if (localLanguageCode==null){

                                        writeStartElement(null, "", "languageCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLanguageCode.serialize(new javax.xml.namespace.QName("","languageCode"),
                                        xmlWriter);
                                    }
                                } if (localLastAppliedDate1Tracker){
                                    if (localLastAppliedDate1==null){

                                        writeStartElement(null, "", "lastAppliedDate1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastAppliedDate1.serialize(new javax.xml.namespace.QName("","lastAppliedDate1"),
                                        xmlWriter);
                                    }
                                } if (localLastAppliedDate2Tracker){
                                    if (localLastAppliedDate2==null){

                                        writeStartElement(null, "", "lastAppliedDate2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastAppliedDate2.serialize(new javax.xml.namespace.QName("","lastAppliedDate2"),
                                        xmlWriter);
                                    }
                                } if (localLastAppliedDate3Tracker){
                                    if (localLastAppliedDate3==null){

                                        writeStartElement(null, "", "lastAppliedDate3", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastAppliedDate3.serialize(new javax.xml.namespace.QName("","lastAppliedDate3"),
                                        xmlWriter);
                                    }
                                } if (localLastAppliedDate4Tracker){
                                    if (localLastAppliedDate4==null){

                                        writeStartElement(null, "", "lastAppliedDate4", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastAppliedDate4.serialize(new javax.xml.namespace.QName("","lastAppliedDate4"),
                                        xmlWriter);
                                    }
                                } if (localLastAppliedDate5Tracker){
                                    if (localLastAppliedDate5==null){

                                        writeStartElement(null, "", "lastAppliedDate5", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastAppliedDate5.serialize(new javax.xml.namespace.QName("","lastAppliedDate5"),
                                        xmlWriter);
                                    }
                                } if (localLastCallChargeTracker){
                                    if (localLastCallCharge==null){

                                        writeStartElement(null, "", "lastCallCharge", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastCallCharge.serialize(new javax.xml.namespace.QName("","lastCallCharge"),
                                        xmlWriter);
                                    }
                                } if (localLastRechargeDateTracker){
                                    if (localLastRechargeDate==null){

                                        writeStartElement(null, "", "lastRechargeDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastRechargeDate.serialize(new javax.xml.namespace.QName("","lastRechargeDate"),
                                        xmlWriter);
                                    }
                                } if (localLastRefurbishDateTracker){
                                    if (localLastRefurbishDate==null){

                                        writeStartElement(null, "", "lastRefurbishDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastRefurbishDate.serialize(new javax.xml.namespace.QName("","lastRefurbishDate"),
                                        xmlWriter);
                                    }
                                } if (localLastTransDate0Tracker){
                                    if (localLastTransDate0==null){

                                        writeStartElement(null, "", "lastTransDate0", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastTransDate0.serialize(new javax.xml.namespace.QName("","lastTransDate0"),
                                        xmlWriter);
                                    }
                                } if (localLastTransDate1Tracker){
                                    if (localLastTransDate1==null){

                                        writeStartElement(null, "", "lastTransDate1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastTransDate1.serialize(new javax.xml.namespace.QName("","lastTransDate1"),
                                        xmlWriter);
                                    }
                                } if (localLastTransDate2Tracker){
                                    if (localLastTransDate2==null){

                                        writeStartElement(null, "", "lastTransDate2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastTransDate2.serialize(new javax.xml.namespace.QName("","lastTransDate2"),
                                        xmlWriter);
                                    }
                                } if (localLastUpdateTsTracker){
                                            if (localLastUpdateTs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("lastUpdateTs cannot be null!!");
                                            }
                                           localLastUpdateTs.serialize(new javax.xml.namespace.QName("","lastUpdateTs"),
                                               xmlWriter);
                                        } if (localLiabilityRedirectFlagTracker){
                                            if (localLiabilityRedirectFlag==null){
                                                 throw new org.apache.axis2.databinding.ADBException("liabilityRedirectFlag cannot be null!!");
                                            }
                                           localLiabilityRedirectFlag.serialize(new javax.xml.namespace.QName("","liabilityRedirectFlag"),
                                               xmlWriter);
                                        } if (localMarketSegIdTracker){
                                    if (localMarketSegId==null){

                                        writeStartElement(null, "", "marketSegId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMarketSegId.serialize(new javax.xml.namespace.QName("","marketSegId"),
                                        xmlWriter);
                                    }
                                } if (localMarketingContactProfileIdTracker){
                                    if (localMarketingContactProfileId==null){

                                        writeStartElement(null, "", "marketingContactProfileId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMarketingContactProfileId.serialize(new javax.xml.namespace.QName("","marketingContactProfileId"),
                                        xmlWriter);
                                    }
                                } if (localMigrationSeqTracker){
                                    if (localMigrationSeq==null){

                                        writeStartElement(null, "", "migrationSeq", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMigrationSeq.serialize(new javax.xml.namespace.QName("","migrationSeq"),
                                        xmlWriter);
                                    }
                                } if (localMobileAdOptInTracker){
                                            if (localMobileAdOptIn==null){
                                                 throw new org.apache.axis2.databinding.ADBException("mobileAdOptIn cannot be null!!");
                                            }
                                           localMobileAdOptIn.serialize(new javax.xml.namespace.QName("","mobileAdOptIn"),
                                               xmlWriter);
                                        } if (localMogIdTracker){
                                    if (localMogId==null){

                                        writeStartElement(null, "", "mogId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMogId.serialize(new javax.xml.namespace.QName("","mogId"),
                                        xmlWriter);
                                    }
                                } if (localNearestCrossstreetTracker){
                                    if (localNearestCrossstreet==null){

                                        writeStartElement(null, "", "nearestCrossstreet", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNearestCrossstreet.serialize(new javax.xml.namespace.QName("","nearestCrossstreet"),
                                        xmlWriter);
                                    }
                                } if (localNextApplyDate1Tracker){
                                    if (localNextApplyDate1==null){

                                        writeStartElement(null, "", "nextApplyDate1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextApplyDate1.serialize(new javax.xml.namespace.QName("","nextApplyDate1"),
                                        xmlWriter);
                                    }
                                } if (localNextApplyDate2Tracker){
                                    if (localNextApplyDate2==null){

                                        writeStartElement(null, "", "nextApplyDate2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextApplyDate2.serialize(new javax.xml.namespace.QName("","nextApplyDate2"),
                                        xmlWriter);
                                    }
                                } if (localNextApplyDate3Tracker){
                                    if (localNextApplyDate3==null){

                                        writeStartElement(null, "", "nextApplyDate3", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextApplyDate3.serialize(new javax.xml.namespace.QName("","nextApplyDate3"),
                                        xmlWriter);
                                    }
                                } if (localNextApplyDate4Tracker){
                                    if (localNextApplyDate4==null){

                                        writeStartElement(null, "", "nextApplyDate4", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextApplyDate4.serialize(new javax.xml.namespace.QName("","nextApplyDate4"),
                                        xmlWriter);
                                    }
                                } if (localNextApplyDate5Tracker){
                                    if (localNextApplyDate5==null){

                                        writeStartElement(null, "", "nextApplyDate5", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextApplyDate5.serialize(new javax.xml.namespace.QName("","nextApplyDate5"),
                                        xmlWriter);
                                    }
                                } if (localNextGrantSyncDateTracker){
                                    if (localNextGrantSyncDate==null){

                                        writeStartElement(null, "", "nextGrantSyncDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextGrantSyncDate.serialize(new javax.xml.namespace.QName("","nextGrantSyncDate"),
                                        xmlWriter);
                                    }
                                } if (localNoBillTracker){
                                            if (localNoBill==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                            }
                                           localNoBill.serialize(new javax.xml.namespace.QName("","noBill"),
                                               xmlWriter);
                                        } if (localNoOfAccumulatorsTracker){
                                            if (localNoOfAccumulators==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noOfAccumulators cannot be null!!");
                                            }
                                           localNoOfAccumulators.serialize(new javax.xml.namespace.QName("","noOfAccumulators"),
                                               xmlWriter);
                                        } if (localNoOfBalancesTracker){
                                            if (localNoOfBalances==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noOfBalances cannot be null!!");
                                            }
                                           localNoOfBalances.serialize(new javax.xml.namespace.QName("","noOfBalances"),
                                               xmlWriter);
                                        } if (localNotifRecipientExternalIdTracker){
                                    if (localNotifRecipientExternalId==null){

                                        writeStartElement(null, "", "notifRecipientExternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNotifRecipientExternalId.serialize(new javax.xml.namespace.QName("","notifRecipientExternalId"),
                                        xmlWriter);
                                    }
                                } if (localNotificationLanguageTracker){
                                    if (localNotificationLanguage==null){

                                        writeStartElement(null, "", "notificationLanguage", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNotificationLanguage.serialize(new javax.xml.namespace.QName("","notificationLanguage"),
                                        xmlWriter);
                                    }
                                } if (localNumberFreeAnCallsTracker){
                                    if (localNumberFreeAnCalls==null){

                                        writeStartElement(null, "", "numberFreeAnCalls", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNumberFreeAnCalls.serialize(new javax.xml.namespace.QName("","numberFreeAnCalls"),
                                        xmlWriter);
                                    }
                                } if (localOptionalEndorsementLineTracker){
                                    if (localOptionalEndorsementLine==null){

                                        writeStartElement(null, "", "optionalEndorsementLine", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOptionalEndorsementLine.serialize(new javax.xml.namespace.QName("","optionalEndorsementLine"),
                                        xmlWriter);
                                    }
                                } if (localParentAccountInternalIdTracker){
                                            if (localParentAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("parentAccountInternalId cannot be null!!");
                                            }
                                           localParentAccountInternalId.serialize(new javax.xml.namespace.QName("","parentAccountInternalId"),
                                               xmlWriter);
                                        } if (localPaymentModeTracker){
                                            if (localPaymentMode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("paymentMode cannot be null!!");
                                            }
                                           localPaymentMode.serialize(new javax.xml.namespace.QName("","paymentMode"),
                                               xmlWriter);
                                        } if (localPendingChargesTracker){
                                            if (localPendingCharges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("pendingCharges cannot be null!!");
                                            }
                                           localPendingCharges.serialize(new javax.xml.namespace.QName("","pendingCharges"),
                                               xmlWriter);
                                        } if (localPinTracker){
                                    if (localPin==null){

                                        writeStartElement(null, "", "pin", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPin.serialize(new javax.xml.namespace.QName("","pin"),
                                        xmlWriter);
                                    }
                                } if (localPinChangeNeededTracker){
                                            if (localPinChangeNeeded==null){
                                                 throw new org.apache.axis2.databinding.ADBException("pinChangeNeeded cannot be null!!");
                                            }
                                           localPinChangeNeeded.serialize(new javax.xml.namespace.QName("","pinChangeNeeded"),
                                               xmlWriter);
                                        } if (localPinLastHackTracker){
                                    if (localPinLastHack==null){

                                        writeStartElement(null, "", "pinLastHack", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPinLastHack.serialize(new javax.xml.namespace.QName("","pinLastHack"),
                                        xmlWriter);
                                    }
                                } if (localPinLockoutCountTracker){
                                    if (localPinLockoutCount==null){

                                        writeStartElement(null, "", "pinLockoutCount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPinLockoutCount.serialize(new javax.xml.namespace.QName("","pinLockoutCount"),
                                        xmlWriter);
                                    }
                                } if (localPopUnitsTracker){
                                    if (localPopUnits==null){

                                        writeStartElement(null, "", "popUnits", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPopUnits.serialize(new javax.xml.namespace.QName("","popUnits"),
                                        xmlWriter);
                                    }
                                } if (localPostalCodeTracker){
                                    if (localPostalCode==null){

                                        writeStartElement(null, "", "postalCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPostalCode.serialize(new javax.xml.namespace.QName("","postalCode"),
                                        xmlWriter);
                                    }
                                } if (localPostfixDirectionalTracker){
                                    if (localPostfixDirectional==null){

                                        writeStartElement(null, "", "postfixDirectional", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPostfixDirectional.serialize(new javax.xml.namespace.QName("","postfixDirectional"),
                                        xmlWriter);
                                    }
                                } if (localPostnetAddressBlockBarcodeTracker){
                                    if (localPostnetAddressBlockBarcode==null){

                                        writeStartElement(null, "", "postnetAddressBlockBarcode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPostnetAddressBlockBarcode.serialize(new javax.xml.namespace.QName("","postnetAddressBlockBarcode"),
                                        xmlWriter);
                                    }
                                } if (localPostnetBarcodeTracker){
                                    if (localPostnetBarcode==null){

                                        writeStartElement(null, "", "postnetBarcode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPostnetBarcode.serialize(new javax.xml.namespace.QName("","postnetBarcode"),
                                        xmlWriter);
                                    }
                                } if (localPrefixDirectionalTracker){
                                    if (localPrefixDirectional==null){

                                        writeStartElement(null, "", "prefixDirectional", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrefixDirectional.serialize(new javax.xml.namespace.QName("","prefixDirectional"),
                                        xmlWriter);
                                    }
                                } if (localPrevViewIdTracker){
                                    if (localPrevViewId==null){

                                        writeStartElement(null, "", "prevViewId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrevViewId.serialize(new javax.xml.namespace.QName("","prevViewId"),
                                        xmlWriter);
                                    }
                                } if (localPreviousRatingStateTracker){
                                            if (localPreviousRatingState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("previousRatingState cannot be null!!");
                                            }
                                           localPreviousRatingState.serialize(new javax.xml.namespace.QName("","previousRatingState"),
                                               xmlWriter);
                                        } if (localPrimaryOfferIdTracker){
                                            if (localPrimaryOfferId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("primaryOfferId cannot be null!!");
                                            }
                                           localPrimaryOfferId.serialize(new javax.xml.namespace.QName("","primaryOfferId"),
                                               xmlWriter);
                                        } if (localPrivacyLevelTracker){
                                            if (localPrivacyLevel==null){
                                                 throw new org.apache.axis2.databinding.ADBException("privacyLevel cannot be null!!");
                                            }
                                           localPrivacyLevel.serialize(new javax.xml.namespace.QName("","privacyLevel"),
                                               xmlWriter);
                                        } if (localPromisedPaymentAmtTracker){
                                    if (localPromisedPaymentAmt==null){

                                        writeStartElement(null, "", "promisedPaymentAmt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPromisedPaymentAmt.serialize(new javax.xml.namespace.QName("","promisedPaymentAmt"),
                                        xmlWriter);
                                    }
                                } if (localRangeMapExternalIdTracker){
                                    if (localRangeMapExternalId==null){

                                        writeStartElement(null, "", "rangeMapExternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRangeMapExternalId.serialize(new javax.xml.namespace.QName("","rangeMapExternalId"),
                                        xmlWriter);
                                    }
                                } if (localRateClassTracker){
                                    if (localRateClass==null){

                                        writeStartElement(null, "", "rateClass", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRateClass.serialize(new javax.xml.namespace.QName("","rateClass"),
                                        xmlWriter);
                                    }
                                } if (localRatingLastTransDateTracker){
                                    if (localRatingLastTransDate==null){

                                        writeStartElement(null, "", "ratingLastTransDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRatingLastTransDate.serialize(new javax.xml.namespace.QName("","ratingLastTransDate"),
                                        xmlWriter);
                                    }
                                } if (localRatingNextStateTracker){
                                            if (localRatingNextState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ratingNextState cannot be null!!");
                                            }
                                           localRatingNextState.serialize(new javax.xml.namespace.QName("","ratingNextState"),
                                               xmlWriter);
                                        } if (localRatingPrevTransDateTracker){
                                    if (localRatingPrevTransDate==null){

                                        writeStartElement(null, "", "ratingPrevTransDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRatingPrevTransDate.serialize(new javax.xml.namespace.QName("","ratingPrevTransDate"),
                                        xmlWriter);
                                    }
                                } if (localRatingStateTracker){
                                            if (localRatingState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ratingState cannot be null!!");
                                            }
                                           localRatingState.serialize(new javax.xml.namespace.QName("","ratingState"),
                                               xmlWriter);
                                        } if (localRealServiceInternalIdTracker){
                                    if (localRealServiceInternalId==null){

                                        writeStartElement(null, "", "realServiceInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRealServiceInternalId.serialize(new javax.xml.namespace.QName("","realServiceInternalId"),
                                        xmlWriter);
                                    }
                                } if (localRealServiceInternalIdResetsTracker){
                                    if (localRealServiceInternalIdResets==null){

                                        writeStartElement(null, "", "realServiceInternalIdResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRealServiceInternalIdResets.serialize(new javax.xml.namespace.QName("","realServiceInternalIdResets"),
                                        xmlWriter);
                                    }
                                } if (localRealShadowUsageOrderTracker){
                                    if (localRealShadowUsageOrder==null){

                                        writeStartElement(null, "", "realShadowUsageOrder", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRealShadowUsageOrder.serialize(new javax.xml.namespace.QName("","realShadowUsageOrder"),
                                        xmlWriter);
                                    }
                                } if (localRechLastHackTracker){
                                    if (localRechLastHack==null){

                                        writeStartElement(null, "", "rechLastHack", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRechLastHack.serialize(new javax.xml.namespace.QName("","rechLastHack"),
                                        xmlWriter);
                                    }
                                } if (localRechLockCountTracker){
                                    if (localRechLockCount==null){

                                        writeStartElement(null, "", "rechLockCount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRechLockCount.serialize(new javax.xml.namespace.QName("","rechLockCount"),
                                        xmlWriter);
                                    }
                                } if (localResellerIdTracker){
                                            if (localResellerId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("resellerId cannot be null!!");
                                            }
                                           localResellerId.serialize(new javax.xml.namespace.QName("","resellerId"),
                                               xmlWriter);
                                        } if (localRevRcvCostCtrTracker){
                                            if (localRevRcvCostCtr==null){
                                                 throw new org.apache.axis2.databinding.ADBException("revRcvCostCtr cannot be null!!");
                                            }
                                           localRevRcvCostCtr.serialize(new javax.xml.namespace.QName("","revRcvCostCtr"),
                                               xmlWriter);
                                        } if (localServiceActiveDtTracker){
                                    if (localServiceActiveDt==null){

                                        writeStartElement(null, "", "serviceActiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceActiveDt.serialize(new javax.xml.namespace.QName("","serviceActiveDt"),
                                        xmlWriter);
                                    }
                                } if (localServiceCompanyTracker){
                                    if (localServiceCompany==null){

                                        writeStartElement(null, "", "serviceCompany", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceCompany.serialize(new javax.xml.namespace.QName("","serviceCompany"),
                                        xmlWriter);
                                    }
                                } if (localServiceExternalIdTracker){
                                            if (localServiceExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceExternalId cannot be null!!");
                                            }
                                           localServiceExternalId.serialize(new javax.xml.namespace.QName("","serviceExternalId"),
                                               xmlWriter);
                                        } if (localServiceExternalIdTypeTracker){
                                            if (localServiceExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceExternalIdType cannot be null!!");
                                            }
                                           localServiceExternalIdType.serialize(new javax.xml.namespace.QName("","serviceExternalIdType"),
                                               xmlWriter);
                                        } if (localServiceFnameTracker){
                                    if (localServiceFname==null){

                                        writeStartElement(null, "", "serviceFname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceFname.serialize(new javax.xml.namespace.QName("","serviceFname"),
                                        xmlWriter);
                                    }
                                } if (localServiceFranchiseTaxCodeTracker){
                                    if (localServiceFranchiseTaxCode==null){

                                        writeStartElement(null, "", "serviceFranchiseTaxCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceFranchiseTaxCode.serialize(new javax.xml.namespace.QName("","serviceFranchiseTaxCode"),
                                        xmlWriter);
                                    }
                                } if (localServiceGeocodeTracker){
                                    if (localServiceGeocode==null){

                                        writeStartElement(null, "", "serviceGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceGeocode.serialize(new javax.xml.namespace.QName("","serviceGeocode"),
                                        xmlWriter);
                                    }
                                } if (localServiceInactiveDtTracker){
                                    if (localServiceInactiveDt==null){

                                        writeStartElement(null, "", "serviceInactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceInactiveDt.serialize(new javax.xml.namespace.QName("","serviceInactiveDt"),
                                        xmlWriter);
                                    }
                                } if (localServiceLnameTracker){
                                    if (localServiceLname==null){

                                        writeStartElement(null, "", "serviceLname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceLname.serialize(new javax.xml.namespace.QName("","serviceLname"),
                                        xmlWriter);
                                    }
                                } if (localServiceMinitTracker){
                                    if (localServiceMinit==null){

                                        writeStartElement(null, "", "serviceMinit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceMinit.serialize(new javax.xml.namespace.QName("","serviceMinit"),
                                        xmlWriter);
                                    }
                                } if (localServiceNameGenerationTracker){
                                    if (localServiceNameGeneration==null){

                                        writeStartElement(null, "", "serviceNameGeneration", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceNameGeneration.serialize(new javax.xml.namespace.QName("","serviceNameGeneration"),
                                        xmlWriter);
                                    }
                                } if (localServiceNamePreTracker){
                                    if (localServiceNamePre==null){

                                        writeStartElement(null, "", "serviceNamePre", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceNamePre.serialize(new javax.xml.namespace.QName("","serviceNamePre"),
                                        xmlWriter);
                                    }
                                } if (localServicePhoneTracker){
                                    if (localServicePhone==null){

                                        writeStartElement(null, "", "servicePhone", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServicePhone.serialize(new javax.xml.namespace.QName("","servicePhone"),
                                        xmlWriter);
                                    }
                                } if (localServicePhone2Tracker){
                                    if (localServicePhone2==null){

                                        writeStartElement(null, "", "servicePhone2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServicePhone2.serialize(new javax.xml.namespace.QName("","servicePhone2"),
                                        xmlWriter);
                                    }
                                } if (localSpecialDate1Tracker){
                                    if (localSpecialDate1==null){

                                        writeStartElement(null, "", "specialDate1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSpecialDate1.serialize(new javax.xml.namespace.QName("","specialDate1"),
                                        xmlWriter);
                                    }
                                } if (localSpecialDate2Tracker){
                                    if (localSpecialDate2==null){

                                        writeStartElement(null, "", "specialDate2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSpecialDate2.serialize(new javax.xml.namespace.QName("","specialDate2"),
                                        xmlWriter);
                                    }
                                } if (localSpecialDate3Tracker){
                                    if (localSpecialDate3==null){

                                        writeStartElement(null, "", "specialDate3", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSpecialDate3.serialize(new javax.xml.namespace.QName("","specialDate3"),
                                        xmlWriter);
                                    }
                                } if (localSpecialDate4Tracker){
                                    if (localSpecialDate4==null){

                                        writeStartElement(null, "", "specialDate4", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSpecialDate4.serialize(new javax.xml.namespace.QName("","specialDate4"),
                                        xmlWriter);
                                    }
                                } if (localSpecialDate5Tracker){
                                    if (localSpecialDate5==null){

                                        writeStartElement(null, "", "specialDate5", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSpecialDate5.serialize(new javax.xml.namespace.QName("","specialDate5"),
                                        xmlWriter);
                                    }
                                } if (localSpecialDateCounterTracker){
                                    if (localSpecialDateCounter==null){

                                        writeStartElement(null, "", "specialDateCounter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSpecialDateCounter.serialize(new javax.xml.namespace.QName("","specialDateCounter"),
                                        xmlWriter);
                                    }
                                } if (localStateTracker){
                                    if (localState==null){

                                        writeStartElement(null, "", "state", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localState.serialize(new javax.xml.namespace.QName("","state"),
                                        xmlWriter);
                                    }
                                } if (localStatusIdTracker){
                                            if (localStatusId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("statusId cannot be null!!");
                                            }
                                           localStatusId.serialize(new javax.xml.namespace.QName("","statusId"),
                                               xmlWriter);
                                        } if (localStatusReasonIdTracker){
                                            if (localStatusReasonId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("statusReasonId cannot be null!!");
                                            }
                                           localStatusReasonId.serialize(new javax.xml.namespace.QName("","statusReasonId"),
                                               xmlWriter);
                                        } if (localStatusTypeIdTracker){
                                            if (localStatusTypeId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("statusTypeId cannot be null!!");
                                            }
                                           localStatusTypeId.serialize(new javax.xml.namespace.QName("","statusTypeId"),
                                               xmlWriter);
                                        } if (localStreetNameTracker){
                                    if (localStreetName==null){

                                        writeStartElement(null, "", "streetName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStreetName.serialize(new javax.xml.namespace.QName("","streetName"),
                                        xmlWriter);
                                    }
                                } if (localStreetSuffixTracker){
                                    if (localStreetSuffix==null){

                                        writeStartElement(null, "", "streetSuffix", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStreetSuffix.serialize(new javax.xml.namespace.QName("","streetSuffix"),
                                        xmlWriter);
                                    }
                                } if (localSubNotifLevelTracker){
                                    if (localSubNotifLevel==null){

                                        writeStartElement(null, "", "subNotifLevel", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSubNotifLevel.serialize(new javax.xml.namespace.QName("","subNotifLevel"),
                                        xmlWriter);
                                    }
                                } if (localSubbalcoreToAcctbalTransferTracker){
                                            if (localSubbalcoreToAcctbalTransfer==null){
                                                 throw new org.apache.axis2.databinding.ADBException("subbalcoreToAcctbalTransfer cannot be null!!");
                                            }
                                           localSubbalcoreToAcctbalTransfer.serialize(new javax.xml.namespace.QName("","subbalcoreToAcctbalTransfer"),
                                               xmlWriter);
                                        } if (localTargetAccountNoTracker){
                                    if (localTargetAccountNo==null){

                                        writeStartElement(null, "", "targetAccountNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetAccountNo.serialize(new javax.xml.namespace.QName("","targetAccountNo"),
                                        xmlWriter);
                                    }
                                } if (localTimezoneTracker){
                                    if (localTimezone==null){

                                        writeStartElement(null, "", "timezone", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTimezone.serialize(new javax.xml.namespace.QName("","timezone"),
                                        xmlWriter);
                                    }
                                } if (localTransitionReasonTracker){
                                    if (localTransitionReason==null){

                                        writeStartElement(null, "", "transitionReason", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTransitionReason.serialize(new javax.xml.namespace.QName("","transitionReason"),
                                        xmlWriter);
                                    }
                                } if (localUnitNoTracker){
                                    if (localUnitNo==null){

                                        writeStartElement(null, "", "unitNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUnitNo.serialize(new javax.xml.namespace.QName("","unitNo"),
                                        xmlWriter);
                                    }
                                } if (localUnitTypeTracker){
                                    if (localUnitType==null){

                                        writeStartElement(null, "", "unitType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUnitType.serialize(new javax.xml.namespace.QName("","unitType"),
                                        xmlWriter);
                                    }
                                } if (localUsageEventsAllowedTracker){
                                    if (localUsageEventsAllowed==null){

                                        writeStartElement(null, "", "usageEventsAllowed", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUsageEventsAllowed.serialize(new javax.xml.namespace.QName("","usageEventsAllowed"),
                                        xmlWriter);
                                    }
                                } if (localVertexGeocodeTracker){
                                    if (localVertexGeocode==null){

                                        writeStartElement(null, "", "vertexGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localVertexGeocode.serialize(new javax.xml.namespace.QName("","vertexGeocode"),
                                        xmlWriter);
                                    }
                                } if (localViewCreatedDtTracker){
                                            if (localViewCreatedDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("viewCreatedDt cannot be null!!");
                                            }
                                           localViewCreatedDt.serialize(new javax.xml.namespace.QName("","viewCreatedDt"),
                                               xmlWriter);
                                        } if (localViewEffectiveDtTracker){
                                            if (localViewEffectiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("viewEffectiveDt cannot be null!!");
                                            }
                                           localViewEffectiveDt.serialize(new javax.xml.namespace.QName("","viewEffectiveDt"),
                                               xmlWriter);
                                        } if (localViewStatusTracker){
                                            if (localViewStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("viewStatus cannot be null!!");
                                            }
                                           localViewStatus.serialize(new javax.xml.namespace.QName("","viewStatus"),
                                               xmlWriter);
                                        } if (localAdvtAllowedTracker){
                                    if (localAdvtAllowed==null){

                                        writeStartElement(null, "", "advtAllowed", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAdvtAllowed.serialize(new javax.xml.namespace.QName("","advtAllowed"),
                                        xmlWriter);
                                    }
                                } if (localAvailableCyclicSpendTracker){
                                    if (localAvailableCyclicSpend==null){

                                        writeStartElement(null, "", "availableCyclicSpend", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAvailableCyclicSpend.serialize(new javax.xml.namespace.QName("","availableCyclicSpend"),
                                        xmlWriter);
                                    }
                                } if (localCyclicSpendNextResetDateTracker){
                                    if (localCyclicSpendNextResetDate==null){

                                        writeStartElement(null, "", "cyclicSpendNextResetDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCyclicSpendNextResetDate.serialize(new javax.xml.namespace.QName("","cyclicSpendNextResetDate"),
                                        xmlWriter);
                                    }
                                } if (localCyclicSpendResetDayTracker){
                                    if (localCyclicSpendResetDay==null){

                                        writeStartElement(null, "", "cyclicSpendResetDay", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCyclicSpendResetDay.serialize(new javax.xml.namespace.QName("","cyclicSpendResetDay"),
                                        xmlWriter);
                                    }
                                } if (localCyclicSpendThresholdTracker){
                                    if (localCyclicSpendThreshold==null){

                                        writeStartElement(null, "", "cyclicSpendThreshold", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCyclicSpendThreshold.serialize(new javax.xml.namespace.QName("","cyclicSpendThreshold"),
                                        xmlWriter);
                                    }
                                } if (localThresholdTypeTracker){
                                            if (localThresholdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("thresholdType cannot be null!!");
                                            }
                                           localThresholdType.serialize(new javax.xml.namespace.QName("","thresholdType"),
                                               xmlWriter);
                                        } if (localAllowIntraGroupOnlyTracker){
                                    if (localAllowIntraGroupOnly==null){

                                        writeStartElement(null, "", "allowIntraGroupOnly", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAllowIntraGroupOnly.serialize(new javax.xml.namespace.QName("","allowIntraGroupOnly"),
                                        xmlWriter);
                                    }
                                } if (localGroupAccountNameTracker){
                                    if (localGroupAccountName==null){

                                        writeStartElement(null, "", "groupAccountName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGroupAccountName.serialize(new javax.xml.namespace.QName("","groupAccountName"),
                                        xmlWriter);
                                    }
                                } if (localGroupAccountTypeTracker){
                                    if (localGroupAccountType==null){

                                        writeStartElement(null, "", "groupAccountType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGroupAccountType.serialize(new javax.xml.namespace.QName("","groupAccountType"),
                                        xmlWriter);
                                    }
                                } if (localMembersAllowedDiffPoTracker){
                                    if (localMembersAllowedDiffPo==null){

                                        writeStartElement(null, "", "membersAllowedDiffPo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMembersAllowedDiffPo.serialize(new javax.xml.namespace.QName("","membersAllowedDiffPo"),
                                        xmlWriter);
                                    }
                                } if (localNotificationHandlingTracker){
                                    if (localNotificationHandling==null){

                                        writeStartElement(null, "", "notificationHandling", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNotificationHandling.serialize(new javax.xml.namespace.QName("","notificationHandling"),
                                        xmlWriter);
                                    }
                                } if (localRcApplicabilityTracker){
                                    if (localRcApplicability==null){

                                        writeStartElement(null, "", "rcApplicability", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRcApplicability.serialize(new javax.xml.namespace.QName("","rcApplicability"),
                                        xmlWriter);
                                    }
                                } if (localTargetServiceInternalIdTracker){
                                    if (localTargetServiceInternalId==null){

                                        writeStartElement(null, "", "targetServiceInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetServiceInternalId.serialize(new javax.xml.namespace.QName("","targetServiceInternalId"),
                                        xmlWriter);
                                    }
                                } if (localTargetServiceInternalIdResetsTracker){
                                    if (localTargetServiceInternalIdResets==null){

                                        writeStartElement(null, "", "targetServiceInternalIdResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetServiceInternalIdResets.serialize(new javax.xml.namespace.QName("","targetServiceInternalIdResets"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.comverse.com")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","subscriberBaseObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localInforIndividualIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inforIndividualId"));
                            
                            
                                    elementList.add(localInforIndividualId==null?null:
                                    localInforIndividualId);
                                } if (localServiceInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInternalId"));
                            
                            
                                    if (localServiceInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceInternalId cannot be null!!");
                                    }
                                    elementList.add(localServiceInternalId);
                                } if (localServiceInternalIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInternalIdResets"));
                            
                            
                                    if (localServiceInternalIdResets==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceInternalIdResets cannot be null!!");
                                    }
                                    elementList.add(localServiceInternalIdResets);
                                } if (localViewIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "viewId"));
                            
                            
                                    if (localViewId==null){
                                         throw new org.apache.axis2.databinding.ADBException("viewId cannot be null!!");
                                    }
                                    elementList.add(localViewId);
                                } if (localSubscriberIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subscriberId"));
                            
                            
                                    if (localSubscriberId==null){
                                         throw new org.apache.axis2.databinding.ADBException("subscriberId cannot be null!!");
                                    }
                                    elementList.add(localSubscriberId);
                                } if (localSubscriberExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subscriberExternalIdType"));
                            
                            
                                    if (localSubscriberExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("subscriberExternalIdType cannot be null!!");
                                    }
                                    elementList.add(localSubscriberExternalIdType);
                                } if (localBEndAddressIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BEndAddressId"));
                            
                            
                                    elementList.add(localBEndAddressId==null?null:
                                    localBEndAddressId);
                                } if (localBRevRcvCostCtrTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BRevRcvCostCtr"));
                            
                            
                                    elementList.add(localBRevRcvCostCtr==null?null:
                                    localBRevRcvCostCtr);
                                } if (localBServiceCompanyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServiceCompany"));
                            
                            
                                    elementList.add(localBServiceCompany==null?null:
                                    localBServiceCompany);
                                } if (localBServiceFnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServiceFname"));
                            
                            
                                    elementList.add(localBServiceFname==null?null:
                                    localBServiceFname);
                                } if (localBServiceFranchiseTaxCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServiceFranchiseTaxCode"));
                            
                            
                                    elementList.add(localBServiceFranchiseTaxCode==null?null:
                                    localBServiceFranchiseTaxCode);
                                } if (localBServiceGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServiceGeocode"));
                            
                            
                                    elementList.add(localBServiceGeocode==null?null:
                                    localBServiceGeocode);
                                } if (localBServiceLnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServiceLname"));
                            
                            
                                    elementList.add(localBServiceLname==null?null:
                                    localBServiceLname);
                                } if (localBServiceMinitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServiceMinit"));
                            
                            
                                    elementList.add(localBServiceMinit==null?null:
                                    localBServiceMinit);
                                } if (localBServicePhoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServicePhone"));
                            
                            
                                    elementList.add(localBServicePhone==null?null:
                                    localBServicePhone);
                                } if (localBServicePhone2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BServicePhone2"));
                            
                            
                                    elementList.add(localBServicePhone2==null?null:
                                    localBServicePhone2);
                                } if (localAccountExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountExternalId"));
                            
                            
                                    if (localAccountExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountExternalId cannot be null!!");
                                    }
                                    elementList.add(localAccountExternalId);
                                } if (localAccountExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountExternalIdType"));
                            
                            
                                    if (localAccountExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountExternalIdType cannot be null!!");
                                    }
                                    elementList.add(localAccountExternalIdType);
                                } if (localAccountTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountType"));
                            
                            
                                    elementList.add(localAccountType==null?null:
                                    localAccountType);
                                } if (localAcctAccessAllowedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "acctAccessAllowed"));
                            
                            
                                    if (localAcctAccessAllowed==null){
                                         throw new org.apache.axis2.databinding.ADBException("acctAccessAllowed cannot be null!!");
                                    }
                                    elementList.add(localAcctAccessAllowed);
                                } if (localAcctbalToSubbalcoreTransferTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "acctbalToSubbalcoreTransfer"));
                            
                            
                                    if (localAcctbalToSubbalcoreTransfer==null){
                                         throw new org.apache.axis2.databinding.ADBException("acctbalToSubbalcoreTransfer cannot be null!!");
                                    }
                                    elementList.add(localAcctbalToSubbalcoreTransfer);
                                } if (localActiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activeDt"));
                            
                            
                                    if (localActiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("activeDt cannot be null!!");
                                    }
                                    elementList.add(localActiveDt);
                                } if (localActiveLrOverrideIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activeLrOverrideId"));
                            
                            
                                    if (localActiveLrOverrideId==null){
                                         throw new org.apache.axis2.databinding.ADBException("activeLrOverrideId cannot be null!!");
                                    }
                                    elementList.add(localActiveLrOverrideId);
                                } if (localAddress1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "address1"));
                            
                            
                                    elementList.add(localAddress1==null?null:
                                    localAddress1);
                                } if (localAddress2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "address2"));
                            
                            
                                    elementList.add(localAddress2==null?null:
                                    localAddress2);
                                } if (localAddress3Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "address3"));
                            
                            
                                    elementList.add(localAddress3==null?null:
                                    localAddress3);
                                } if (localAddress4Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "address4"));
                            
                            
                                    elementList.add(localAddress4==null?null:
                                    localAddress4);
                                } if (localAddressIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "addressId"));
                            
                            
                                    if (localAddressId==null){
                                         throw new org.apache.axis2.databinding.ADBException("addressId cannot be null!!");
                                    }
                                    elementList.add(localAddressId);
                                } if (localAddressTypeIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "addressTypeId"));
                            
                            
                                    if (localAddressTypeId==null){
                                         throw new org.apache.axis2.databinding.ADBException("addressTypeId cannot be null!!");
                                    }
                                    elementList.add(localAddressTypeId);
                                } if (localAddtlNotifExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "addtlNotifExternalId"));
                            
                            
                                    elementList.add(localAddtlNotifExternalId==null?null:
                                    localAddtlNotifExternalId);
                                } if (localAgentIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "agentId"));
                            
                            
                                    elementList.add(localAgentId==null?null:
                                    localAgentId);
                                } if (localAnniversaryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "anniversary"));
                            
                            
                                    elementList.add(localAnniversary==null?null:
                                    localAnniversary);
                                } if (localApplyDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDay"));
                            
                            
                                    elementList.add(localApplyDay==null?null:
                                    localApplyDay);
                                } if (localBalTransMaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balTransMax"));
                            
                            
                                    elementList.add(localBalTransMax==null?null:
                                    localBalTransMax);
                                } if (localBalTransMinTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balTransMin"));
                            
                            
                                    elementList.add(localBalTransMin==null?null:
                                    localBalTransMin);
                                } if (localBalTransResidualAmtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balTransResidualAmt"));
                            
                            
                                    elementList.add(localBalTransResidualAmt==null?null:
                                    localBalTransResidualAmt);
                                } if (localBalTransferEnabledTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balTransferEnabled"));
                            
                            
                                    if (localBalTransferEnabled==null){
                                         throw new org.apache.axis2.databinding.ADBException("balTransferEnabled cannot be null!!");
                                    }
                                    elementList.add(localBalTransferEnabled);
                                } if (localBirthdayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "birthday"));
                            
                            
                                    elementList.add(localBirthday==null?null:
                                    localBirthday);
                                } if (localCfbNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cfbNumber"));
                            
                            
                                    elementList.add(localCfbNumber==null?null:
                                    localCfbNumber);
                                } if (localCfisNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cfisNumber"));
                            
                            
                                    elementList.add(localCfisNumber==null?null:
                                    localCfisNumber);
                                } if (localCfnaNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cfnaNumber"));
                            
                            
                                    elementList.add(localCfnaNumber==null?null:
                                    localCfnaNumber);
                                } if (localCfuNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cfuNumber"));
                            
                            
                                    elementList.add(localCfuNumber==null?null:
                                    localCfuNumber);
                                } if (localChangeDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "changeDt"));
                            
                            
                                    if (localChangeDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("changeDt cannot be null!!");
                                    }
                                    elementList.add(localChangeDt);
                                } if (localChangeWhoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "changeWho"));
                            
                            
                                    if (localChangeWho==null){
                                         throw new org.apache.axis2.databinding.ADBException("changeWho cannot be null!!");
                                    }
                                    elementList.add(localChangeWho);
                                } if (localChargeAdviceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chargeAdvice"));
                            
                            
                                    if (localChargeAdvice==null){
                                         throw new org.apache.axis2.databinding.ADBException("chargeAdvice cannot be null!!");
                                    }
                                    elementList.add(localChargeAdvice);
                                } if (localChgDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chgDt"));
                            
                            
                                    if (localChgDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("chgDt cannot be null!!");
                                    }
                                    elementList.add(localChgDt);
                                } if (localChgWhoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chgWho"));
                            
                            
                                    if (localChgWho==null){
                                         throw new org.apache.axis2.databinding.ADBException("chgWho cannot be null!!");
                                    }
                                    elementList.add(localChgWho);
                                } if (localCircleFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "circleFlag"));
                            
                            
                                    if (localCircleFlag==null){
                                         throw new org.apache.axis2.databinding.ADBException("circleFlag cannot be null!!");
                                    }
                                    elementList.add(localCircleFlag);
                                } if (localCityTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "city"));
                            
                            
                                    elementList.add(localCity==null?null:
                                    localCity);
                                } if (localClassOfServiceCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "classOfServiceCode"));
                            
                            
                                    if (localClassOfServiceCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("classOfServiceCode cannot be null!!");
                                    }
                                    elementList.add(localClassOfServiceCode);
                                } if (localCodewordTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "codeword"));
                            
                            
                                    elementList.add(localCodeword==null?null:
                                    localCodeword);
                                } if (localConvertedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "converted"));
                            
                            
                                    if (localConverted==null){
                                         throw new org.apache.axis2.databinding.ADBException("converted cannot be null!!");
                                    }
                                    elementList.add(localConverted);
                                } if (localCountryCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "countryCode"));
                            
                            
                                    if (localCountryCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("countryCode cannot be null!!");
                                    }
                                    elementList.add(localCountryCode);
                                } if (localCountyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "county"));
                            
                            
                                    elementList.add(localCounty==null?null:
                                    localCounty);
                                } if (localCreateDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "createDt"));
                            
                            
                                    if (localCreateDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("createDt cannot be null!!");
                                    }
                                    elementList.add(localCreateDt);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    elementList.add(localCurrencyCode==null?null:
                                    localCurrencyCode);
                                } if (localDateEnterActiveTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateEnterActive"));
                            
                            
                                    elementList.add(localDateEnterActive==null?null:
                                    localDateEnterActive);
                                } if (localDateEnteredPostactiveTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateEnteredPostactive"));
                            
                            
                                    elementList.add(localDateEnteredPostactive==null?null:
                                    localDateEnteredPostactive);
                                } if (localDateLastFreeAnCallTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateLastFreeAnCall"));
                            
                            
                                    elementList.add(localDateLastFreeAnCall==null?null:
                                    localDateLastFreeAnCall);
                                } if (localDealerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dealerId"));
                            
                            
                                    elementList.add(localDealerId==null?null:
                                    localDealerId);
                                } if (localDestNumber1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber1"));
                            
                            
                                    elementList.add(localDestNumber1==null?null:
                                    localDestNumber1);
                                } if (localDestNumber10Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber10"));
                            
                            
                                    elementList.add(localDestNumber10==null?null:
                                    localDestNumber10);
                                } if (localDestNumber2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber2"));
                            
                            
                                    elementList.add(localDestNumber2==null?null:
                                    localDestNumber2);
                                } if (localDestNumber3Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber3"));
                            
                            
                                    elementList.add(localDestNumber3==null?null:
                                    localDestNumber3);
                                } if (localDestNumber4Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber4"));
                            
                            
                                    elementList.add(localDestNumber4==null?null:
                                    localDestNumber4);
                                } if (localDestNumber5Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber5"));
                            
                            
                                    elementList.add(localDestNumber5==null?null:
                                    localDestNumber5);
                                } if (localDestNumber6Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber6"));
                            
                            
                                    elementList.add(localDestNumber6==null?null:
                                    localDestNumber6);
                                } if (localDestNumber7Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber7"));
                            
                            
                                    elementList.add(localDestNumber7==null?null:
                                    localDestNumber7);
                                } if (localDestNumber8Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber8"));
                            
                            
                                    elementList.add(localDestNumber8==null?null:
                                    localDestNumber8);
                                } if (localDestNumber9Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "destNumber9"));
                            
                            
                                    elementList.add(localDestNumber9==null?null:
                                    localDestNumber9);
                                } if (localDisplayAddressIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "displayAddressId"));
                            
                            
                                    if (localDisplayAddressId==null){
                                         throw new org.apache.axis2.databinding.ADBException("displayAddressId cannot be null!!");
                                    }
                                    elementList.add(localDisplayAddressId);
                                } if (localDisplayExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "displayExternalId"));
                            
                            
                                    if (localDisplayExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("displayExternalId cannot be null!!");
                                    }
                                    elementList.add(localDisplayExternalId);
                                } if (localDisplayExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "displayExternalIdType"));
                            
                            
                                    if (localDisplayExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("displayExternalIdType cannot be null!!");
                                    }
                                    elementList.add(localDisplayExternalIdType);
                                } if (localEnableCdrTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "enableCdr"));
                            
                            
                                    if (localEnableCdr==null){
                                         throw new org.apache.axis2.databinding.ADBException("enableCdr cannot be null!!");
                                    }
                                    elementList.add(localEnableCdr);
                                } if (localEquipClassCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "equipClassCode"));
                            
                            
                                    if (localEquipClassCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("equipClassCode cannot be null!!");
                                    }
                                    elementList.add(localEquipClassCode);
                                } if (localEquipTypeCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "equipTypeCode"));
                            
                            
                                    if (localEquipTypeCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("equipTypeCode cannot be null!!");
                                    }
                                    elementList.add(localEquipTypeCode);
                                } if (localExrateClassTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "exrateClass"));
                            
                            
                                    elementList.add(localExrateClass==null?null:
                                    localExrateClass);
                                } if (localExtFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "extFlag"));
                            
                            
                                    if (localExtFlag==null){
                                         throw new org.apache.axis2.databinding.ADBException("extFlag cannot be null!!");
                                    }
                                    elementList.add(localExtFlag);
                                } if (localExtendedDataTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "extendedData"));
                            
                            
                                    if (localExtendedData==null){
                                         throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                    }
                                    elementList.add(localExtendedData);
                                } if (localExtendedPostalCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "extendedPostalCode"));
                            
                            
                                    elementList.add(localExtendedPostalCode==null?null:
                                    localExtendedPostalCode);
                                } if (localExternalAddressIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "externalAddressId"));
                            
                            
                                    elementList.add(localExternalAddressId==null?null:
                                    localExternalAddressId);
                                } if (localFavoriteAreaTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "favoriteArea"));
                            
                            
                                    elementList.add(localFavoriteArea==null?null:
                                    localFavoriteArea);
                                } if (localFfChangeCountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ffChangeCount"));
                            
                            
                                    elementList.add(localFfChangeCount==null?null:
                                    localFfChangeCount);
                                } if (localFranchiseTaxCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "franchiseTaxCode"));
                            
                            
                                    if (localFranchiseTaxCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("franchiseTaxCode cannot be null!!");
                                    }
                                    elementList.add(localFranchiseTaxCode);
                                } if (localFreeFfChgAllowanceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "freeFfChgAllowance"));
                            
                            
                                    elementList.add(localFreeFfChgAllowance==null?null:
                                    localFreeFfChgAllowance);
                                } if (localFxGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "fxGeocode"));
                            
                            
                                    if (localFxGeocode==null){
                                         throw new org.apache.axis2.databinding.ADBException("fxGeocode cannot be null!!");
                                    }
                                    elementList.add(localFxGeocode);
                                } if (localHappyHourEndTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "happyHourEnd"));
                            
                            
                                    elementList.add(localHappyHourEnd==null?null:
                                    localHappyHourEnd);
                                } if (localHappyHourStartTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "happyHourStart"));
                            
                            
                                    elementList.add(localHappyHourStart==null?null:
                                    localHappyHourStart);
                                } if (localHasPendingOrdersTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hasPendingOrders"));
                            
                            
                                    if (localHasPendingOrders==null){
                                         throw new org.apache.axis2.databinding.ADBException("hasPendingOrders cannot be null!!");
                                    }
                                    elementList.add(localHasPendingOrders);
                                } if (localHasRcAnncTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hasRcAnnc"));
                            
                            
                                    elementList.add(localHasRcAnnc==null?null:
                                    localHasRcAnnc);
                                } if (localHierarchyAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hierarchyAccountInternalId"));
                            
                            
                                    if (localHierarchyAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("hierarchyAccountInternalId cannot be null!!");
                                    }
                                    elementList.add(localHierarchyAccountInternalId);
                                } if (localHome1LiTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "home1Li"));
                            
                            
                                    elementList.add(localHome1Li==null?null:
                                    localHome1Li);
                                } if (localHome2LiTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "home2Li"));
                            
                            
                                    elementList.add(localHome2Li==null?null:
                                    localHome2Li);
                                } if (localHome3LiTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "home3Li"));
                            
                            
                                    elementList.add(localHome3Li==null?null:
                                    localHome3Li);
                                } if (localHome4LiTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "home4Li"));
                            
                            
                                    elementList.add(localHome4Li==null?null:
                                    localHome4Li);
                                } if (localHomeZoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "homeZone"));
                            
                            
                                    elementList.add(localHomeZone==null?null:
                                    localHomeZone);
                                } if (localHouseNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "houseNumber"));
                            
                            
                                    elementList.add(localHouseNumber==null?null:
                                    localHouseNumber);
                                } if (localHouseNumberSuffixTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "houseNumberSuffix"));
                            
                            
                                    elementList.add(localHouseNumberSuffix==null?null:
                                    localHouseNumberSuffix);
                                } if (localId2HashTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "id2Hash"));
                            
                            
                                    elementList.add(localId2Hash==null?null:
                                    localId2Hash);
                                } if (localInRatingDbTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inRatingDb"));
                            
                            
                                    if (localInRatingDb==null){
                                         throw new org.apache.axis2.databinding.ADBException("inRatingDb cannot be null!!");
                                    }
                                    elementList.add(localInRatingDb);
                                } if (localIndvCoreBalMinTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "indvCoreBalMin"));
                            
                            
                                    elementList.add(localIndvCoreBalMin==null?null:
                                    localIndvCoreBalMin);
                                } if (localIndvCoreBalNotifThresholdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "indvCoreBalNotifThreshold"));
                            
                            
                                    elementList.add(localIndvCoreBalNotifThreshold==null?null:
                                    localIndvCoreBalNotifThreshold);
                                } if (localIntendedViewEffectiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "intendedViewEffectiveDt"));
                            
                            
                                    if (localIntendedViewEffectiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("intendedViewEffectiveDt cannot be null!!");
                                    }
                                    elementList.add(localIntendedViewEffectiveDt);
                                } if (localIs1SaTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "is1sa"));
                            
                            
                                    if (localIs1Sa==null){
                                         throw new org.apache.axis2.databinding.ADBException("is1sa cannot be null!!");
                                    }
                                    elementList.add(localIs1Sa);
                                } if (localIsActiveTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isActive"));
                            
                            
                                    if (localIsActive==null){
                                         throw new org.apache.axis2.databinding.ADBException("isActive cannot be null!!");
                                    }
                                    elementList.add(localIsActive);
                                } if (localIsBalIncreasePpAvailedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isBalIncreasePpAvailed"));
                            
                            
                                    if (localIsBalIncreasePpAvailed==null){
                                         throw new org.apache.axis2.databinding.ADBException("isBalIncreasePpAvailed cannot be null!!");
                                    }
                                    elementList.add(localIsBalIncreasePpAvailed);
                                } if (localIsBalanceManagedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isBalanceManaged"));
                            
                            
                                    if (localIsBalanceManaged==null){
                                         throw new org.apache.axis2.databinding.ADBException("isBalanceManaged cannot be null!!");
                                    }
                                    elementList.add(localIsBalanceManaged);
                                } if (localIsInTriggeredTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isInTriggered"));
                            
                            
                                    if (localIsInTriggered==null){
                                         throw new org.apache.axis2.databinding.ADBException("isInTriggered cannot be null!!");
                                    }
                                    elementList.add(localIsInTriggered);
                                } if (localIsNotificationRecipientTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isNotificationRecipient"));
                            
                            
                                    if (localIsNotificationRecipient==null){
                                         throw new org.apache.axis2.databinding.ADBException("isNotificationRecipient cannot be null!!");
                                    }
                                    elementList.add(localIsNotificationRecipient);
                                } if (localIsPostactiveTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isPostactive"));
                            
                            
                                    if (localIsPostactive==null){
                                         throw new org.apache.axis2.databinding.ADBException("isPostactive cannot be null!!");
                                    }
                                    elementList.add(localIsPostactive);
                                } if (localKeyLineCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "keyLineCode"));
                            
                            
                                    elementList.add(localKeyLineCode==null?null:
                                    localKeyLineCode);
                                } if (localLanguageCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "languageCode"));
                            
                            
                                    elementList.add(localLanguageCode==null?null:
                                    localLanguageCode);
                                } if (localLastAppliedDate1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastAppliedDate1"));
                            
                            
                                    elementList.add(localLastAppliedDate1==null?null:
                                    localLastAppliedDate1);
                                } if (localLastAppliedDate2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastAppliedDate2"));
                            
                            
                                    elementList.add(localLastAppliedDate2==null?null:
                                    localLastAppliedDate2);
                                } if (localLastAppliedDate3Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastAppliedDate3"));
                            
                            
                                    elementList.add(localLastAppliedDate3==null?null:
                                    localLastAppliedDate3);
                                } if (localLastAppliedDate4Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastAppliedDate4"));
                            
                            
                                    elementList.add(localLastAppliedDate4==null?null:
                                    localLastAppliedDate4);
                                } if (localLastAppliedDate5Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastAppliedDate5"));
                            
                            
                                    elementList.add(localLastAppliedDate5==null?null:
                                    localLastAppliedDate5);
                                } if (localLastCallChargeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastCallCharge"));
                            
                            
                                    elementList.add(localLastCallCharge==null?null:
                                    localLastCallCharge);
                                } if (localLastRechargeDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastRechargeDate"));
                            
                            
                                    elementList.add(localLastRechargeDate==null?null:
                                    localLastRechargeDate);
                                } if (localLastRefurbishDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastRefurbishDate"));
                            
                            
                                    elementList.add(localLastRefurbishDate==null?null:
                                    localLastRefurbishDate);
                                } if (localLastTransDate0Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastTransDate0"));
                            
                            
                                    elementList.add(localLastTransDate0==null?null:
                                    localLastTransDate0);
                                } if (localLastTransDate1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastTransDate1"));
                            
                            
                                    elementList.add(localLastTransDate1==null?null:
                                    localLastTransDate1);
                                } if (localLastTransDate2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastTransDate2"));
                            
                            
                                    elementList.add(localLastTransDate2==null?null:
                                    localLastTransDate2);
                                } if (localLastUpdateTsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastUpdateTs"));
                            
                            
                                    if (localLastUpdateTs==null){
                                         throw new org.apache.axis2.databinding.ADBException("lastUpdateTs cannot be null!!");
                                    }
                                    elementList.add(localLastUpdateTs);
                                } if (localLiabilityRedirectFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "liabilityRedirectFlag"));
                            
                            
                                    if (localLiabilityRedirectFlag==null){
                                         throw new org.apache.axis2.databinding.ADBException("liabilityRedirectFlag cannot be null!!");
                                    }
                                    elementList.add(localLiabilityRedirectFlag);
                                } if (localMarketSegIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "marketSegId"));
                            
                            
                                    elementList.add(localMarketSegId==null?null:
                                    localMarketSegId);
                                } if (localMarketingContactProfileIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "marketingContactProfileId"));
                            
                            
                                    elementList.add(localMarketingContactProfileId==null?null:
                                    localMarketingContactProfileId);
                                } if (localMigrationSeqTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "migrationSeq"));
                            
                            
                                    elementList.add(localMigrationSeq==null?null:
                                    localMigrationSeq);
                                } if (localMobileAdOptInTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "mobileAdOptIn"));
                            
                            
                                    if (localMobileAdOptIn==null){
                                         throw new org.apache.axis2.databinding.ADBException("mobileAdOptIn cannot be null!!");
                                    }
                                    elementList.add(localMobileAdOptIn);
                                } if (localMogIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "mogId"));
                            
                            
                                    elementList.add(localMogId==null?null:
                                    localMogId);
                                } if (localNearestCrossstreetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nearestCrossstreet"));
                            
                            
                                    elementList.add(localNearestCrossstreet==null?null:
                                    localNearestCrossstreet);
                                } if (localNextApplyDate1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextApplyDate1"));
                            
                            
                                    elementList.add(localNextApplyDate1==null?null:
                                    localNextApplyDate1);
                                } if (localNextApplyDate2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextApplyDate2"));
                            
                            
                                    elementList.add(localNextApplyDate2==null?null:
                                    localNextApplyDate2);
                                } if (localNextApplyDate3Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextApplyDate3"));
                            
                            
                                    elementList.add(localNextApplyDate3==null?null:
                                    localNextApplyDate3);
                                } if (localNextApplyDate4Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextApplyDate4"));
                            
                            
                                    elementList.add(localNextApplyDate4==null?null:
                                    localNextApplyDate4);
                                } if (localNextApplyDate5Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextApplyDate5"));
                            
                            
                                    elementList.add(localNextApplyDate5==null?null:
                                    localNextApplyDate5);
                                } if (localNextGrantSyncDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextGrantSyncDate"));
                            
                            
                                    elementList.add(localNextGrantSyncDate==null?null:
                                    localNextGrantSyncDate);
                                } if (localNoBillTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noBill"));
                            
                            
                                    if (localNoBill==null){
                                         throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                    }
                                    elementList.add(localNoBill);
                                } if (localNoOfAccumulatorsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noOfAccumulators"));
                            
                            
                                    if (localNoOfAccumulators==null){
                                         throw new org.apache.axis2.databinding.ADBException("noOfAccumulators cannot be null!!");
                                    }
                                    elementList.add(localNoOfAccumulators);
                                } if (localNoOfBalancesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noOfBalances"));
                            
                            
                                    if (localNoOfBalances==null){
                                         throw new org.apache.axis2.databinding.ADBException("noOfBalances cannot be null!!");
                                    }
                                    elementList.add(localNoOfBalances);
                                } if (localNotifRecipientExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "notifRecipientExternalId"));
                            
                            
                                    elementList.add(localNotifRecipientExternalId==null?null:
                                    localNotifRecipientExternalId);
                                } if (localNotificationLanguageTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "notificationLanguage"));
                            
                            
                                    elementList.add(localNotificationLanguage==null?null:
                                    localNotificationLanguage);
                                } if (localNumberFreeAnCallsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "numberFreeAnCalls"));
                            
                            
                                    elementList.add(localNumberFreeAnCalls==null?null:
                                    localNumberFreeAnCalls);
                                } if (localOptionalEndorsementLineTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "optionalEndorsementLine"));
                            
                            
                                    elementList.add(localOptionalEndorsementLine==null?null:
                                    localOptionalEndorsementLine);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    if (localParentAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("parentAccountInternalId cannot be null!!");
                                    }
                                    elementList.add(localParentAccountInternalId);
                                } if (localPaymentModeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "paymentMode"));
                            
                            
                                    if (localPaymentMode==null){
                                         throw new org.apache.axis2.databinding.ADBException("paymentMode cannot be null!!");
                                    }
                                    elementList.add(localPaymentMode);
                                } if (localPendingChargesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "pendingCharges"));
                            
                            
                                    if (localPendingCharges==null){
                                         throw new org.apache.axis2.databinding.ADBException("pendingCharges cannot be null!!");
                                    }
                                    elementList.add(localPendingCharges);
                                } if (localPinTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "pin"));
                            
                            
                                    elementList.add(localPin==null?null:
                                    localPin);
                                } if (localPinChangeNeededTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "pinChangeNeeded"));
                            
                            
                                    if (localPinChangeNeeded==null){
                                         throw new org.apache.axis2.databinding.ADBException("pinChangeNeeded cannot be null!!");
                                    }
                                    elementList.add(localPinChangeNeeded);
                                } if (localPinLastHackTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "pinLastHack"));
                            
                            
                                    elementList.add(localPinLastHack==null?null:
                                    localPinLastHack);
                                } if (localPinLockoutCountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "pinLockoutCount"));
                            
                            
                                    elementList.add(localPinLockoutCount==null?null:
                                    localPinLockoutCount);
                                } if (localPopUnitsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "popUnits"));
                            
                            
                                    elementList.add(localPopUnits==null?null:
                                    localPopUnits);
                                } if (localPostalCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "postalCode"));
                            
                            
                                    elementList.add(localPostalCode==null?null:
                                    localPostalCode);
                                } if (localPostfixDirectionalTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "postfixDirectional"));
                            
                            
                                    elementList.add(localPostfixDirectional==null?null:
                                    localPostfixDirectional);
                                } if (localPostnetAddressBlockBarcodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "postnetAddressBlockBarcode"));
                            
                            
                                    elementList.add(localPostnetAddressBlockBarcode==null?null:
                                    localPostnetAddressBlockBarcode);
                                } if (localPostnetBarcodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "postnetBarcode"));
                            
                            
                                    elementList.add(localPostnetBarcode==null?null:
                                    localPostnetBarcode);
                                } if (localPrefixDirectionalTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prefixDirectional"));
                            
                            
                                    elementList.add(localPrefixDirectional==null?null:
                                    localPrefixDirectional);
                                } if (localPrevViewIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevViewId"));
                            
                            
                                    elementList.add(localPrevViewId==null?null:
                                    localPrevViewId);
                                } if (localPreviousRatingStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "previousRatingState"));
                            
                            
                                    if (localPreviousRatingState==null){
                                         throw new org.apache.axis2.databinding.ADBException("previousRatingState cannot be null!!");
                                    }
                                    elementList.add(localPreviousRatingState);
                                } if (localPrimaryOfferIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "primaryOfferId"));
                            
                            
                                    if (localPrimaryOfferId==null){
                                         throw new org.apache.axis2.databinding.ADBException("primaryOfferId cannot be null!!");
                                    }
                                    elementList.add(localPrimaryOfferId);
                                } if (localPrivacyLevelTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "privacyLevel"));
                            
                            
                                    if (localPrivacyLevel==null){
                                         throw new org.apache.axis2.databinding.ADBException("privacyLevel cannot be null!!");
                                    }
                                    elementList.add(localPrivacyLevel);
                                } if (localPromisedPaymentAmtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "promisedPaymentAmt"));
                            
                            
                                    elementList.add(localPromisedPaymentAmt==null?null:
                                    localPromisedPaymentAmt);
                                } if (localRangeMapExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rangeMapExternalId"));
                            
                            
                                    elementList.add(localRangeMapExternalId==null?null:
                                    localRangeMapExternalId);
                                } if (localRateClassTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rateClass"));
                            
                            
                                    elementList.add(localRateClass==null?null:
                                    localRateClass);
                                } if (localRatingLastTransDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ratingLastTransDate"));
                            
                            
                                    elementList.add(localRatingLastTransDate==null?null:
                                    localRatingLastTransDate);
                                } if (localRatingNextStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ratingNextState"));
                            
                            
                                    if (localRatingNextState==null){
                                         throw new org.apache.axis2.databinding.ADBException("ratingNextState cannot be null!!");
                                    }
                                    elementList.add(localRatingNextState);
                                } if (localRatingPrevTransDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ratingPrevTransDate"));
                            
                            
                                    elementList.add(localRatingPrevTransDate==null?null:
                                    localRatingPrevTransDate);
                                } if (localRatingStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ratingState"));
                            
                            
                                    if (localRatingState==null){
                                         throw new org.apache.axis2.databinding.ADBException("ratingState cannot be null!!");
                                    }
                                    elementList.add(localRatingState);
                                } if (localRealServiceInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "realServiceInternalId"));
                            
                            
                                    elementList.add(localRealServiceInternalId==null?null:
                                    localRealServiceInternalId);
                                } if (localRealServiceInternalIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "realServiceInternalIdResets"));
                            
                            
                                    elementList.add(localRealServiceInternalIdResets==null?null:
                                    localRealServiceInternalIdResets);
                                } if (localRealShadowUsageOrderTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "realShadowUsageOrder"));
                            
                            
                                    elementList.add(localRealShadowUsageOrder==null?null:
                                    localRealShadowUsageOrder);
                                } if (localRechLastHackTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rechLastHack"));
                            
                            
                                    elementList.add(localRechLastHack==null?null:
                                    localRechLastHack);
                                } if (localRechLockCountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rechLockCount"));
                            
                            
                                    elementList.add(localRechLockCount==null?null:
                                    localRechLockCount);
                                } if (localResellerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "resellerId"));
                            
                            
                                    if (localResellerId==null){
                                         throw new org.apache.axis2.databinding.ADBException("resellerId cannot be null!!");
                                    }
                                    elementList.add(localResellerId);
                                } if (localRevRcvCostCtrTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "revRcvCostCtr"));
                            
                            
                                    if (localRevRcvCostCtr==null){
                                         throw new org.apache.axis2.databinding.ADBException("revRcvCostCtr cannot be null!!");
                                    }
                                    elementList.add(localRevRcvCostCtr);
                                } if (localServiceActiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceActiveDt"));
                            
                            
                                    elementList.add(localServiceActiveDt==null?null:
                                    localServiceActiveDt);
                                } if (localServiceCompanyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceCompany"));
                            
                            
                                    elementList.add(localServiceCompany==null?null:
                                    localServiceCompany);
                                } if (localServiceExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceExternalId"));
                            
                            
                                    if (localServiceExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceExternalId cannot be null!!");
                                    }
                                    elementList.add(localServiceExternalId);
                                } if (localServiceExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceExternalIdType"));
                            
                            
                                    if (localServiceExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceExternalIdType cannot be null!!");
                                    }
                                    elementList.add(localServiceExternalIdType);
                                } if (localServiceFnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceFname"));
                            
                            
                                    elementList.add(localServiceFname==null?null:
                                    localServiceFname);
                                } if (localServiceFranchiseTaxCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceFranchiseTaxCode"));
                            
                            
                                    elementList.add(localServiceFranchiseTaxCode==null?null:
                                    localServiceFranchiseTaxCode);
                                } if (localServiceGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceGeocode"));
                            
                            
                                    elementList.add(localServiceGeocode==null?null:
                                    localServiceGeocode);
                                } if (localServiceInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInactiveDt"));
                            
                            
                                    elementList.add(localServiceInactiveDt==null?null:
                                    localServiceInactiveDt);
                                } if (localServiceLnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceLname"));
                            
                            
                                    elementList.add(localServiceLname==null?null:
                                    localServiceLname);
                                } if (localServiceMinitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceMinit"));
                            
                            
                                    elementList.add(localServiceMinit==null?null:
                                    localServiceMinit);
                                } if (localServiceNameGenerationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceNameGeneration"));
                            
                            
                                    elementList.add(localServiceNameGeneration==null?null:
                                    localServiceNameGeneration);
                                } if (localServiceNamePreTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceNamePre"));
                            
                            
                                    elementList.add(localServiceNamePre==null?null:
                                    localServiceNamePre);
                                } if (localServicePhoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "servicePhone"));
                            
                            
                                    elementList.add(localServicePhone==null?null:
                                    localServicePhone);
                                } if (localServicePhone2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "servicePhone2"));
                            
                            
                                    elementList.add(localServicePhone2==null?null:
                                    localServicePhone2);
                                } if (localSpecialDate1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "specialDate1"));
                            
                            
                                    elementList.add(localSpecialDate1==null?null:
                                    localSpecialDate1);
                                } if (localSpecialDate2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "specialDate2"));
                            
                            
                                    elementList.add(localSpecialDate2==null?null:
                                    localSpecialDate2);
                                } if (localSpecialDate3Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "specialDate3"));
                            
                            
                                    elementList.add(localSpecialDate3==null?null:
                                    localSpecialDate3);
                                } if (localSpecialDate4Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "specialDate4"));
                            
                            
                                    elementList.add(localSpecialDate4==null?null:
                                    localSpecialDate4);
                                } if (localSpecialDate5Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "specialDate5"));
                            
                            
                                    elementList.add(localSpecialDate5==null?null:
                                    localSpecialDate5);
                                } if (localSpecialDateCounterTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "specialDateCounter"));
                            
                            
                                    elementList.add(localSpecialDateCounter==null?null:
                                    localSpecialDateCounter);
                                } if (localStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "state"));
                            
                            
                                    elementList.add(localState==null?null:
                                    localState);
                                } if (localStatusIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "statusId"));
                            
                            
                                    if (localStatusId==null){
                                         throw new org.apache.axis2.databinding.ADBException("statusId cannot be null!!");
                                    }
                                    elementList.add(localStatusId);
                                } if (localStatusReasonIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "statusReasonId"));
                            
                            
                                    if (localStatusReasonId==null){
                                         throw new org.apache.axis2.databinding.ADBException("statusReasonId cannot be null!!");
                                    }
                                    elementList.add(localStatusReasonId);
                                } if (localStatusTypeIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "statusTypeId"));
                            
                            
                                    if (localStatusTypeId==null){
                                         throw new org.apache.axis2.databinding.ADBException("statusTypeId cannot be null!!");
                                    }
                                    elementList.add(localStatusTypeId);
                                } if (localStreetNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "streetName"));
                            
                            
                                    elementList.add(localStreetName==null?null:
                                    localStreetName);
                                } if (localStreetSuffixTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "streetSuffix"));
                            
                            
                                    elementList.add(localStreetSuffix==null?null:
                                    localStreetSuffix);
                                } if (localSubNotifLevelTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subNotifLevel"));
                            
                            
                                    elementList.add(localSubNotifLevel==null?null:
                                    localSubNotifLevel);
                                } if (localSubbalcoreToAcctbalTransferTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subbalcoreToAcctbalTransfer"));
                            
                            
                                    if (localSubbalcoreToAcctbalTransfer==null){
                                         throw new org.apache.axis2.databinding.ADBException("subbalcoreToAcctbalTransfer cannot be null!!");
                                    }
                                    elementList.add(localSubbalcoreToAcctbalTransfer);
                                } if (localTargetAccountNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountNo"));
                            
                            
                                    elementList.add(localTargetAccountNo==null?null:
                                    localTargetAccountNo);
                                } if (localTimezoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "timezone"));
                            
                            
                                    elementList.add(localTimezone==null?null:
                                    localTimezone);
                                } if (localTransitionReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "transitionReason"));
                            
                            
                                    elementList.add(localTransitionReason==null?null:
                                    localTransitionReason);
                                } if (localUnitNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "unitNo"));
                            
                            
                                    elementList.add(localUnitNo==null?null:
                                    localUnitNo);
                                } if (localUnitTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "unitType"));
                            
                            
                                    elementList.add(localUnitType==null?null:
                                    localUnitType);
                                } if (localUsageEventsAllowedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "usageEventsAllowed"));
                            
                            
                                    elementList.add(localUsageEventsAllowed==null?null:
                                    localUsageEventsAllowed);
                                } if (localVertexGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "vertexGeocode"));
                            
                            
                                    elementList.add(localVertexGeocode==null?null:
                                    localVertexGeocode);
                                } if (localViewCreatedDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "viewCreatedDt"));
                            
                            
                                    if (localViewCreatedDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("viewCreatedDt cannot be null!!");
                                    }
                                    elementList.add(localViewCreatedDt);
                                } if (localViewEffectiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "viewEffectiveDt"));
                            
                            
                                    if (localViewEffectiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("viewEffectiveDt cannot be null!!");
                                    }
                                    elementList.add(localViewEffectiveDt);
                                } if (localViewStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "viewStatus"));
                            
                            
                                    if (localViewStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("viewStatus cannot be null!!");
                                    }
                                    elementList.add(localViewStatus);
                                } if (localAdvtAllowedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "advtAllowed"));
                            
                            
                                    elementList.add(localAdvtAllowed==null?null:
                                    localAdvtAllowed);
                                } if (localAvailableCyclicSpendTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "availableCyclicSpend"));
                            
                            
                                    elementList.add(localAvailableCyclicSpend==null?null:
                                    localAvailableCyclicSpend);
                                } if (localCyclicSpendNextResetDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cyclicSpendNextResetDate"));
                            
                            
                                    elementList.add(localCyclicSpendNextResetDate==null?null:
                                    localCyclicSpendNextResetDate);
                                } if (localCyclicSpendResetDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cyclicSpendResetDay"));
                            
                            
                                    elementList.add(localCyclicSpendResetDay==null?null:
                                    localCyclicSpendResetDay);
                                } if (localCyclicSpendThresholdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cyclicSpendThreshold"));
                            
                            
                                    elementList.add(localCyclicSpendThreshold==null?null:
                                    localCyclicSpendThreshold);
                                } if (localThresholdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "thresholdType"));
                            
                            
                                    if (localThresholdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("thresholdType cannot be null!!");
                                    }
                                    elementList.add(localThresholdType);
                                } if (localAllowIntraGroupOnlyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "allowIntraGroupOnly"));
                            
                            
                                    elementList.add(localAllowIntraGroupOnly==null?null:
                                    localAllowIntraGroupOnly);
                                } if (localGroupAccountNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "groupAccountName"));
                            
                            
                                    elementList.add(localGroupAccountName==null?null:
                                    localGroupAccountName);
                                } if (localGroupAccountTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "groupAccountType"));
                            
                            
                                    elementList.add(localGroupAccountType==null?null:
                                    localGroupAccountType);
                                } if (localMembersAllowedDiffPoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "membersAllowedDiffPo"));
                            
                            
                                    elementList.add(localMembersAllowedDiffPo==null?null:
                                    localMembersAllowedDiffPo);
                                } if (localNotificationHandlingTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "notificationHandling"));
                            
                            
                                    elementList.add(localNotificationHandling==null?null:
                                    localNotificationHandling);
                                } if (localRcApplicabilityTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcApplicability"));
                            
                            
                                    elementList.add(localRcApplicability==null?null:
                                    localRcApplicability);
                                } if (localTargetServiceInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetServiceInternalId"));
                            
                            
                                    elementList.add(localTargetServiceInternalId==null?null:
                                    localTargetServiceInternalId);
                                } if (localTargetServiceInternalIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetServiceInternalIdResets"));
                            
                            
                                    elementList.add(localTargetServiceInternalIdResets==null?null:
                                    localTargetServiceInternalIdResets);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SubscriberBaseObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SubscriberBaseObject object =
                new SubscriberBaseObject();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"subscriberBaseObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SubscriberBaseObject)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","attribs").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"attribs" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAttribs(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToByte(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inforIndividualId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInforIndividualId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInforIndividualId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInternalId").equals(reader.getName())){
                                
                                                object.setServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInternalIdResets").equals(reader.getName())){
                                
                                                object.setServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","viewId").equals(reader.getName())){
                                
                                                object.setViewId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberId").equals(reader.getName())){
                                
                                                object.setSubscriberId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberExternalIdType").equals(reader.getName())){
                                
                                                object.setSubscriberExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BEndAddressId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBEndAddressId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBEndAddressId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BRevRcvCostCtr").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBRevRcvCostCtr(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBRevRcvCostCtr(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServiceCompany").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServiceCompany(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServiceCompany(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServiceFname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServiceFname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServiceFname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServiceFranchiseTaxCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServiceFranchiseTaxCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServiceFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServiceGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServiceGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServiceGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServiceLname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServiceLname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServiceLname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServiceMinit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServiceMinit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServiceMinit(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServicePhone").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServicePhone(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServicePhone(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BServicePhone2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBServicePhone2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBServicePhone2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountExternalId").equals(reader.getName())){
                                
                                                object.setAccountExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountExternalIdType").equals(reader.getName())){
                                
                                                object.setAccountExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccountType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccountType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","acctAccessAllowed").equals(reader.getName())){
                                
                                                object.setAcctAccessAllowed(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","acctbalToSubbalcoreTransfer").equals(reader.getName())){
                                
                                                object.setAcctbalToSubbalcoreTransfer(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","activeDt").equals(reader.getName())){
                                
                                                object.setActiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","activeLrOverrideId").equals(reader.getName())){
                                
                                                object.setActiveLrOverrideId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","address1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAddress1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAddress1(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","address2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAddress2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAddress2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","address3").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAddress3(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAddress3(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","address4").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAddress4(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAddress4(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","addressId").equals(reader.getName())){
                                
                                                object.setAddressId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","addressTypeId").equals(reader.getName())){
                                
                                                object.setAddressTypeId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","addtlNotifExternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAddtlNotifExternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAddtlNotifExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","agentId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAgentId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAgentId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","anniversary").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAnniversary(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAnniversary(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","applyDay").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setApplyDay(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setApplyDay(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balTransMax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBalTransMax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBalTransMax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balTransMin").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBalTransMin(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBalTransMin(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balTransResidualAmt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBalTransResidualAmt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBalTransResidualAmt(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balTransferEnabled").equals(reader.getName())){
                                
                                                object.setBalTransferEnabled(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","birthday").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBirthday(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBirthday(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cfbNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCfbNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCfbNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cfisNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCfisNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCfisNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cfnaNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCfnaNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCfnaNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cfuNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCfuNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCfuNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","changeDt").equals(reader.getName())){
                                
                                                object.setChangeDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","changeWho").equals(reader.getName())){
                                
                                                object.setChangeWho(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chargeAdvice").equals(reader.getName())){
                                
                                                object.setChargeAdvice(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chgDt").equals(reader.getName())){
                                
                                                object.setChgDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chgWho").equals(reader.getName())){
                                
                                                object.setChgWho(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","circleFlag").equals(reader.getName())){
                                
                                                object.setCircleFlag(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","city").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCity(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCity(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","classOfServiceCode").equals(reader.getName())){
                                
                                                object.setClassOfServiceCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codeword").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCodeword(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCodeword(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","converted").equals(reader.getName())){
                                
                                                object.setConverted(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","countryCode").equals(reader.getName())){
                                
                                                object.setCountryCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","county").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCounty(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCounty(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","createDt").equals(reader.getName())){
                                
                                                object.setCreateDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currencyCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCurrencyCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCurrencyCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateEnterActive").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDateEnterActive(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDateEnterActive(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateEnteredPostactive").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDateEnteredPostactive(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDateEnteredPostactive(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateLastFreeAnCall").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDateLastFreeAnCall(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDateLastFreeAnCall(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dealerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDealerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDealerId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber1(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber10").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber10(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber10(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber3").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber3(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber3(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber4").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber4(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber4(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber5").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber5(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber5(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber6").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber6(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber6(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber7").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber7(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber7(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber8").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber8(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber8(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","destNumber9").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDestNumber9(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDestNumber9(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","displayAddressId").equals(reader.getName())){
                                
                                                object.setDisplayAddressId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","displayExternalId").equals(reader.getName())){
                                
                                                object.setDisplayExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","displayExternalIdType").equals(reader.getName())){
                                
                                                object.setDisplayExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","enableCdr").equals(reader.getName())){
                                
                                                object.setEnableCdr(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","equipClassCode").equals(reader.getName())){
                                
                                                object.setEquipClassCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","equipTypeCode").equals(reader.getName())){
                                
                                                object.setEquipTypeCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","exrateClass").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setExrateClass(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setExrateClass(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","extFlag").equals(reader.getName())){
                                
                                                object.setExtFlag(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","extendedData").equals(reader.getName())){
                                
                                                object.setExtendedData(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","extendedPostalCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setExtendedPostalCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setExtendedPostalCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","externalAddressId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setExternalAddressId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setExternalAddressId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","favoriteArea").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFavoriteArea(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFavoriteArea(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ffChangeCount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFfChangeCount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFfChangeCount(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","franchiseTaxCode").equals(reader.getName())){
                                
                                                object.setFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","freeFfChgAllowance").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFreeFfChgAllowance(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFreeFfChgAllowance(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fxGeocode").equals(reader.getName())){
                                
                                                object.setFxGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","happyHourEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHappyHourEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHappyHourEnd(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","happyHourStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHappyHourStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHappyHourStart(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hasPendingOrders").equals(reader.getName())){
                                
                                                object.setHasPendingOrders(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hasRcAnnc").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHasRcAnnc(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHasRcAnnc(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hierarchyAccountInternalId").equals(reader.getName())){
                                
                                                object.setHierarchyAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","home1Li").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHome1Li(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHome1Li(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","home2Li").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHome2Li(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHome2Li(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","home3Li").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHome3Li(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHome3Li(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","home4Li").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHome4Li(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHome4Li(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","homeZone").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHomeZone(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHomeZone(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","houseNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHouseNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHouseNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","houseNumberSuffix").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHouseNumberSuffix(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHouseNumberSuffix(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","id2Hash").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setId2Hash(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setId2Hash(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inRatingDb").equals(reader.getName())){
                                
                                                object.setInRatingDb(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","indvCoreBalMin").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setIndvCoreBalMin(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setIndvCoreBalMin(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","indvCoreBalNotifThreshold").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setIndvCoreBalNotifThreshold(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setIndvCoreBalNotifThreshold(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","intendedViewEffectiveDt").equals(reader.getName())){
                                
                                                object.setIntendedViewEffectiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","is1sa").equals(reader.getName())){
                                
                                                object.setIs1Sa(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isActive").equals(reader.getName())){
                                
                                                object.setIsActive(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isBalIncreasePpAvailed").equals(reader.getName())){
                                
                                                object.setIsBalIncreasePpAvailed(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isBalanceManaged").equals(reader.getName())){
                                
                                                object.setIsBalanceManaged(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isInTriggered").equals(reader.getName())){
                                
                                                object.setIsInTriggered(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isNotificationRecipient").equals(reader.getName())){
                                
                                                object.setIsNotificationRecipient(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isPostactive").equals(reader.getName())){
                                
                                                object.setIsPostactive(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","keyLineCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setKeyLineCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setKeyLineCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","languageCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLanguageCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLanguageCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastAppliedDate1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastAppliedDate1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastAppliedDate1(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastAppliedDate2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastAppliedDate2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastAppliedDate2(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastAppliedDate3").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastAppliedDate3(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastAppliedDate3(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastAppliedDate4").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastAppliedDate4(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastAppliedDate4(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastAppliedDate5").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastAppliedDate5(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastAppliedDate5(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastCallCharge").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastCallCharge(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastCallCharge(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastRechargeDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastRechargeDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastRechargeDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastRefurbishDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastRefurbishDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastRefurbishDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastTransDate0").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastTransDate0(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastTransDate0(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastTransDate1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastTransDate1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastTransDate1(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastTransDate2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastTransDate2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastTransDate2(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastUpdateTs").equals(reader.getName())){
                                
                                                object.setLastUpdateTs(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","liabilityRedirectFlag").equals(reader.getName())){
                                
                                                object.setLiabilityRedirectFlag(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","marketSegId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMarketSegId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMarketSegId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","marketingContactProfileId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMarketingContactProfileId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMarketingContactProfileId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","migrationSeq").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMigrationSeq(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMigrationSeq(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","mobileAdOptIn").equals(reader.getName())){
                                
                                                object.setMobileAdOptIn(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","mogId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMogId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMogId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nearestCrossstreet").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNearestCrossstreet(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNearestCrossstreet(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextApplyDate1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextApplyDate1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextApplyDate1(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextApplyDate2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextApplyDate2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextApplyDate2(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextApplyDate3").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextApplyDate3(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextApplyDate3(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextApplyDate4").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextApplyDate4(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextApplyDate4(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextApplyDate5").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextApplyDate5(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextApplyDate5(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextGrantSyncDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextGrantSyncDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextGrantSyncDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","noBill").equals(reader.getName())){
                                
                                                object.setNoBill(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","noOfAccumulators").equals(reader.getName())){
                                
                                                object.setNoOfAccumulators(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","noOfBalances").equals(reader.getName())){
                                
                                                object.setNoOfBalances(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","notifRecipientExternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNotifRecipientExternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNotifRecipientExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","notificationLanguage").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNotificationLanguage(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNotificationLanguage(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","numberFreeAnCalls").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNumberFreeAnCalls(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNumberFreeAnCalls(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","optionalEndorsementLine").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOptionalEndorsementLine(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOptionalEndorsementLine(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountInternalId").equals(reader.getName())){
                                
                                                object.setParentAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","paymentMode").equals(reader.getName())){
                                
                                                object.setPaymentMode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pendingCharges").equals(reader.getName())){
                                
                                                object.setPendingCharges(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pin").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPin(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPin(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pinChangeNeeded").equals(reader.getName())){
                                
                                                object.setPinChangeNeeded(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pinLastHack").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPinLastHack(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPinLastHack(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","pinLockoutCount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPinLockoutCount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPinLockoutCount(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","popUnits").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPopUnits(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPopUnits(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","postalCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPostalCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPostalCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","postfixDirectional").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPostfixDirectional(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPostfixDirectional(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","postnetAddressBlockBarcode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPostnetAddressBlockBarcode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPostnetAddressBlockBarcode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","postnetBarcode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPostnetBarcode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPostnetBarcode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prefixDirectional").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrefixDirectional(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrefixDirectional(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevViewId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrevViewId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrevViewId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","previousRatingState").equals(reader.getName())){
                                
                                                object.setPreviousRatingState(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","primaryOfferId").equals(reader.getName())){
                                
                                                object.setPrimaryOfferId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","privacyLevel").equals(reader.getName())){
                                
                                                object.setPrivacyLevel(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","promisedPaymentAmt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPromisedPaymentAmt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPromisedPaymentAmt(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rangeMapExternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRangeMapExternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRangeMapExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rateClass").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRateClass(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRateClass(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ratingLastTransDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRatingLastTransDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRatingLastTransDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ratingNextState").equals(reader.getName())){
                                
                                                object.setRatingNextState(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ratingPrevTransDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRatingPrevTransDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRatingPrevTransDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ratingState").equals(reader.getName())){
                                
                                                object.setRatingState(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","realServiceInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRealServiceInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRealServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","realServiceInternalIdResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRealServiceInternalIdResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRealServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","realShadowUsageOrder").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRealShadowUsageOrder(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRealShadowUsageOrder(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rechLastHack").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRechLastHack(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRechLastHack(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rechLockCount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRechLockCount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRechLockCount(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","resellerId").equals(reader.getName())){
                                
                                                object.setResellerId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","revRcvCostCtr").equals(reader.getName())){
                                
                                                object.setRevRcvCostCtr(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceActiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceActiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceActiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceCompany").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceCompany(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceCompany(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceExternalId").equals(reader.getName())){
                                
                                                object.setServiceExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceExternalIdType").equals(reader.getName())){
                                
                                                object.setServiceExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceFname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceFname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceFname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceFranchiseTaxCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceFranchiseTaxCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceLname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceLname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceLname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceMinit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceMinit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceMinit(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceNameGeneration").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceNameGeneration(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceNameGeneration(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceNamePre").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceNamePre(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceNamePre(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","servicePhone").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServicePhone(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServicePhone(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","servicePhone2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServicePhone2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServicePhone2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","specialDate1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSpecialDate1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSpecialDate1(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","specialDate2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSpecialDate2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSpecialDate2(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","specialDate3").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSpecialDate3(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSpecialDate3(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","specialDate4").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSpecialDate4(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSpecialDate4(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","specialDate5").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSpecialDate5(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSpecialDate5(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","specialDateCounter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSpecialDateCounter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSpecialDateCounter(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","state").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setState(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setState(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","statusId").equals(reader.getName())){
                                
                                                object.setStatusId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","statusReasonId").equals(reader.getName())){
                                
                                                object.setStatusReasonId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","statusTypeId").equals(reader.getName())){
                                
                                                object.setStatusTypeId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","streetName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStreetName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStreetName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","streetSuffix").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStreetSuffix(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStreetSuffix(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subNotifLevel").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSubNotifLevel(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSubNotifLevel(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subbalcoreToAcctbalTransfer").equals(reader.getName())){
                                
                                                object.setSubbalcoreToAcctbalTransfer(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetAccountNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetAccountNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetAccountNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","timezone").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTimezone(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTimezone(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","transitionReason").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTransitionReason(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTransitionReason(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","unitNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUnitNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUnitNo(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","unitType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUnitType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUnitType(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","usageEventsAllowed").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUsageEventsAllowed(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUsageEventsAllowed(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vertexGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setVertexGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setVertexGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","viewCreatedDt").equals(reader.getName())){
                                
                                                object.setViewCreatedDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","viewEffectiveDt").equals(reader.getName())){
                                
                                                object.setViewEffectiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","viewStatus").equals(reader.getName())){
                                
                                                object.setViewStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","advtAllowed").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAdvtAllowed(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAdvtAllowed(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","availableCyclicSpend").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAvailableCyclicSpend(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAvailableCyclicSpend(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cyclicSpendNextResetDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCyclicSpendNextResetDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCyclicSpendNextResetDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cyclicSpendResetDay").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCyclicSpendResetDay(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCyclicSpendResetDay(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cyclicSpendThreshold").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCyclicSpendThreshold(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCyclicSpendThreshold(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","thresholdType").equals(reader.getName())){
                                
                                                object.setThresholdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","allowIntraGroupOnly").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAllowIntraGroupOnly(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAllowIntraGroupOnly(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","groupAccountName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGroupAccountName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGroupAccountName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","groupAccountType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGroupAccountType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGroupAccountType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","membersAllowedDiffPo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMembersAllowedDiffPo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMembersAllowedDiffPo(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","notificationHandling").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNotificationHandling(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNotificationHandling(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcApplicability").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRcApplicability(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRcApplicability(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetServiceInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetServiceInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetServiceInternalIdResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetServiceInternalIdResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    