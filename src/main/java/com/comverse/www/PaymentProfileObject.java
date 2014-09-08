
/**
 * PaymentProfileObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  PaymentProfileObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class PaymentProfileObject extends com.comverse.www.PaymentProfileIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = paymentProfileObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

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
                        * field for AccountInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localAccountInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountInternalIdTracker = false ;

                           public boolean isAccountInternalIdSpecified(){
                               return localAccountInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getAccountInternalId(){
                               return localAccountInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountInternalId
                               */
                               public void setAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localAccountInternalIdTracker = param != null;
                                   
                                            this.localAccountInternalId=param;
                                    

                               }
                            

                        /**
                        * field for AltBankAccNum
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAltBankAccNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAltBankAccNumTracker = false ;

                           public boolean isAltBankAccNumSpecified(){
                               return localAltBankAccNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAltBankAccNum(){
                               return localAltBankAccNum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AltBankAccNum
                               */
                               public void setAltBankAccNum(com.comverse.www.StringAttributeJAXBElement param){
                            localAltBankAccNumTracker = true;
                                   
                                            this.localAltBankAccNum=param;
                                    

                               }
                            

                        /**
                        * field for AvsAddressId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localAvsAddressId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvsAddressIdTracker = false ;

                           public boolean isAvsAddressIdSpecified(){
                               return localAvsAddressIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getAvsAddressId(){
                               return localAvsAddressId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvsAddressId
                               */
                               public void setAvsAddressId(com.comverse.www.ShortAttributeJAXBElement param){
                            localAvsAddressIdTracker = true;
                                   
                                            this.localAvsAddressId=param;
                                    

                               }
                            

                        /**
                        * field for AvsResponseCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAvsResponseCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvsResponseCodeTracker = false ;

                           public boolean isAvsResponseCodeSpecified(){
                               return localAvsResponseCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAvsResponseCode(){
                               return localAvsResponseCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvsResponseCode
                               */
                               public void setAvsResponseCode(com.comverse.www.StringAttributeJAXBElement param){
                            localAvsResponseCodeTracker = true;
                                   
                                            this.localAvsResponseCode=param;
                                    

                               }
                            

                        /**
                        * field for BankAccountType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localBankAccountType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankAccountTypeTracker = false ;

                           public boolean isBankAccountTypeSpecified(){
                               return localBankAccountTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getBankAccountType(){
                               return localBankAccountType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BankAccountType
                               */
                               public void setBankAccountType(com.comverse.www.ShortAttributeJAXBElement param){
                            localBankAccountTypeTracker = true;
                                   
                                            this.localBankAccountType=param;
                                    

                               }
                            

                        /**
                        * field for BankAgencyCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBankAgencyCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankAgencyCodeTracker = false ;

                           public boolean isBankAgencyCodeSpecified(){
                               return localBankAgencyCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBankAgencyCode(){
                               return localBankAgencyCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BankAgencyCode
                               */
                               public void setBankAgencyCode(com.comverse.www.StringAttributeJAXBElement param){
                            localBankAgencyCodeTracker = true;
                                   
                                            this.localBankAgencyCode=param;
                                    

                               }
                            

                        /**
                        * field for BankAgencyName
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBankAgencyName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankAgencyNameTracker = false ;

                           public boolean isBankAgencyNameSpecified(){
                               return localBankAgencyNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBankAgencyName(){
                               return localBankAgencyName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BankAgencyName
                               */
                               public void setBankAgencyName(com.comverse.www.StringAttributeJAXBElement param){
                            localBankAgencyNameTracker = true;
                                   
                                            this.localBankAgencyName=param;
                                    

                               }
                            

                        /**
                        * field for BankCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBankCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankCodeTracker = false ;

                           public boolean isBankCodeSpecified(){
                               return localBankCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBankCode(){
                               return localBankCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BankCode
                               */
                               public void setBankCode(com.comverse.www.StringAttributeJAXBElement param){
                            localBankCodeTracker = true;
                                   
                                            this.localBankCode=param;
                                    

                               }
                            

                        /**
                        * field for BillCompanyTaxId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localBillCompanyTaxId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillCompanyTaxIdTracker = false ;

                           public boolean isBillCompanyTaxIdSpecified(){
                               return localBillCompanyTaxIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getBillCompanyTaxId(){
                               return localBillCompanyTaxId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillCompanyTaxId
                               */
                               public void setBillCompanyTaxId(com.comverse.www.LongAttributeJAXBElement param){
                            localBillCompanyTaxIdTracker = true;
                                   
                                            this.localBillCompanyTaxId=param;
                                    

                               }
                            

                        /**
                        * field for BranchCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBranchCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBranchCodeTracker = false ;

                           public boolean isBranchCodeSpecified(){
                               return localBranchCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBranchCode(){
                               return localBranchCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BranchCode
                               */
                               public void setBranchCode(com.comverse.www.StringAttributeJAXBElement param){
                            localBranchCodeTracker = true;
                                   
                                            this.localBranchCode=param;
                                    

                               }
                            

                        /**
                        * field for BranchName
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBranchName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBranchNameTracker = false ;

                           public boolean isBranchNameSpecified(){
                               return localBranchNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBranchName(){
                               return localBranchName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BranchName
                               */
                               public void setBranchName(com.comverse.www.StringAttributeJAXBElement param){
                            localBranchNameTracker = true;
                                   
                                            this.localBranchName=param;
                                    

                               }
                            

                        /**
                        * field for CardAccount
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCardAccount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardAccountTracker = false ;

                           public boolean isCardAccountSpecified(){
                               return localCardAccountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCardAccount(){
                               return localCardAccount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardAccount
                               */
                               public void setCardAccount(com.comverse.www.StringAttributeJAXBElement param){
                            localCardAccountTracker = true;
                                   
                                            this.localCardAccount=param;
                                    

                               }
                            

                        /**
                        * field for CardCarrier
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCardCarrier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardCarrierTracker = false ;

                           public boolean isCardCarrierSpecified(){
                               return localCardCarrierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCardCarrier(){
                               return localCardCarrier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardCarrier
                               */
                               public void setCardCarrier(com.comverse.www.StringAttributeJAXBElement param){
                            localCardCarrierTracker = true;
                                   
                                            this.localCardCarrier=param;
                                    

                               }
                            

                        /**
                        * field for CardExpire
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCardExpire ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardExpireTracker = false ;

                           public boolean isCardExpireSpecified(){
                               return localCardExpireTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCardExpire(){
                               return localCardExpire;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardExpire
                               */
                               public void setCardExpire(com.comverse.www.StringAttributeJAXBElement param){
                            localCardExpireTracker = true;
                                   
                                            this.localCardExpire=param;
                                    

                               }
                            

                        /**
                        * field for ClearingHouseId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localClearingHouseId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClearingHouseIdTracker = false ;

                           public boolean isClearingHouseIdSpecified(){
                               return localClearingHouseIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getClearingHouseId(){
                               return localClearingHouseId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClearingHouseId
                               */
                               public void setClearingHouseId(com.comverse.www.StringAttributeJAXBElement param){
                            localClearingHouseIdTracker = true;
                                   
                                            this.localClearingHouseId=param;
                                    

                               }
                            

                        /**
                        * field for CustBankAccNum
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustBankAccNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBankAccNumTracker = false ;

                           public boolean isCustBankAccNumSpecified(){
                               return localCustBankAccNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustBankAccNum(){
                               return localCustBankAccNum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBankAccNum
                               */
                               public void setCustBankAccNum(com.comverse.www.StringAttributeJAXBElement param){
                            localCustBankAccNumTracker = true;
                                   
                                            this.localCustBankAccNum=param;
                                    

                               }
                            

                        /**
                        * field for CustBankAcctType
                        */

                        
                                    protected com.comverse.www.CharacterAttributeJAXBElement localCustBankAcctType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBankAcctTypeTracker = false ;

                           public boolean isCustBankAcctTypeSpecified(){
                               return localCustBankAcctTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.CharacterAttributeJAXBElement
                           */
                           public  com.comverse.www.CharacterAttributeJAXBElement getCustBankAcctType(){
                               return localCustBankAcctType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBankAcctType
                               */
                               public void setCustBankAcctType(com.comverse.www.CharacterAttributeJAXBElement param){
                            localCustBankAcctTypeTracker = true;
                                   
                                            this.localCustBankAcctType=param;
                                    

                               }
                            

                        /**
                        * field for CustBankSortCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustBankSortCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBankSortCodeTracker = false ;

                           public boolean isCustBankSortCodeSpecified(){
                               return localCustBankSortCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustBankSortCode(){
                               return localCustBankSortCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBankSortCode
                               */
                               public void setCustBankSortCode(com.comverse.www.StringAttributeJAXBElement param){
                            localCustBankSortCodeTracker = true;
                                   
                                            this.localCustBankSortCode=param;
                                    

                               }
                            

                        /**
                        * field for CustBillAddress
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustBillAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBillAddressTracker = false ;

                           public boolean isCustBillAddressSpecified(){
                               return localCustBillAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustBillAddress(){
                               return localCustBillAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBillAddress
                               */
                               public void setCustBillAddress(com.comverse.www.StringAttributeJAXBElement param){
                            localCustBillAddressTracker = true;
                                   
                                            this.localCustBillAddress=param;
                                    

                               }
                            

                        /**
                        * field for CustBillCity
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustBillCity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBillCityTracker = false ;

                           public boolean isCustBillCitySpecified(){
                               return localCustBillCityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustBillCity(){
                               return localCustBillCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBillCity
                               */
                               public void setCustBillCity(com.comverse.www.StringAttributeJAXBElement param){
                            localCustBillCityTracker = true;
                                   
                                            this.localCustBillCity=param;
                                    

                               }
                            

                        /**
                        * field for CustBillCountryCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localCustBillCountryCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBillCountryCodeTracker = false ;

                           public boolean isCustBillCountryCodeSpecified(){
                               return localCustBillCountryCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getCustBillCountryCode(){
                               return localCustBillCountryCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBillCountryCode
                               */
                               public void setCustBillCountryCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localCustBillCountryCodeTracker = true;
                                   
                                            this.localCustBillCountryCode=param;
                                    

                               }
                            

                        /**
                        * field for CustBillState
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustBillState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBillStateTracker = false ;

                           public boolean isCustBillStateSpecified(){
                               return localCustBillStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustBillState(){
                               return localCustBillState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBillState
                               */
                               public void setCustBillState(com.comverse.www.StringAttributeJAXBElement param){
                            localCustBillStateTracker = true;
                                   
                                            this.localCustBillState=param;
                                    

                               }
                            

                        /**
                        * field for CustBillZip
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustBillZip ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustBillZipTracker = false ;

                           public boolean isCustBillZipSpecified(){
                               return localCustBillZipTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustBillZip(){
                               return localCustBillZip;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustBillZip
                               */
                               public void setCustBillZip(com.comverse.www.StringAttributeJAXBElement param){
                            localCustBillZipTracker = true;
                                   
                                            this.localCustBillZip=param;
                                    

                               }
                            

                        /**
                        * field for CustCompanyName
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustCompanyName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustCompanyNameTracker = false ;

                           public boolean isCustCompanyNameSpecified(){
                               return localCustCompanyNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustCompanyName(){
                               return localCustCompanyName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustCompanyName
                               */
                               public void setCustCompanyName(com.comverse.www.StringAttributeJAXBElement param){
                            localCustCompanyNameTracker = true;
                                   
                                            this.localCustCompanyName=param;
                                    

                               }
                            

                        /**
                        * field for CustEmail
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustEmailTracker = false ;

                           public boolean isCustEmailSpecified(){
                               return localCustEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustEmail(){
                               return localCustEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustEmail
                               */
                               public void setCustEmail(com.comverse.www.StringAttributeJAXBElement param){
                            localCustEmailTracker = true;
                                   
                                            this.localCustEmail=param;
                                    

                               }
                            

                        /**
                        * field for CustPhone
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustPhone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustPhoneTracker = false ;

                           public boolean isCustPhoneSpecified(){
                               return localCustPhoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustPhone(){
                               return localCustPhone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustPhone
                               */
                               public void setCustPhone(com.comverse.www.StringAttributeJAXBElement param){
                            localCustPhoneTracker = true;
                                   
                                            this.localCustPhone=param;
                                    

                               }
                            

                        /**
                        * field for CyclicalBillUsed
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localCyclicalBillUsed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCyclicalBillUsedTracker = false ;

                           public boolean isCyclicalBillUsedSpecified(){
                               return localCyclicalBillUsedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getCyclicalBillUsed(){
                               return localCyclicalBillUsed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CyclicalBillUsed
                               */
                               public void setCyclicalBillUsed(com.comverse.www.BooleanAttributeJAXBElement param){
                            localCyclicalBillUsedTracker = param != null;
                                   
                                            this.localCyclicalBillUsed=param;
                                    

                               }
                            

                        /**
                        * field for DriverLicenseNum
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDriverLicenseNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDriverLicenseNumTracker = false ;

                           public boolean isDriverLicenseNumSpecified(){
                               return localDriverLicenseNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDriverLicenseNum(){
                               return localDriverLicenseNum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DriverLicenseNum
                               */
                               public void setDriverLicenseNum(com.comverse.www.StringAttributeJAXBElement param){
                            localDriverLicenseNumTracker = true;
                                   
                                            this.localDriverLicenseNum=param;
                                    

                               }
                            

                        /**
                        * field for DriverLicenseState
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDriverLicenseState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDriverLicenseStateTracker = false ;

                           public boolean isDriverLicenseStateSpecified(){
                               return localDriverLicenseStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDriverLicenseState(){
                               return localDriverLicenseState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DriverLicenseState
                               */
                               public void setDriverLicenseState(com.comverse.www.StringAttributeJAXBElement param){
                            localDriverLicenseStateTracker = true;
                                   
                                            this.localDriverLicenseState=param;
                                    

                               }
                            

                        /**
                        * field for IsDefault
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsDefault ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsDefaultTracker = false ;

                           public boolean isIsDefaultSpecified(){
                               return localIsDefaultTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsDefault(){
                               return localIsDefault;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsDefault
                               */
                               public void setIsDefault(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsDefaultTracker = param != null;
                                   
                                            this.localIsDefault=param;
                                    

                               }
                            

                        /**
                        * field for IsTemporary
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsTemporary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsTemporaryTracker = false ;

                           public boolean isIsTemporarySpecified(){
                               return localIsTemporaryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsTemporary(){
                               return localIsTemporary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsTemporary
                               */
                               public void setIsTemporary(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsTemporaryTracker = param != null;
                                   
                                            this.localIsTemporary=param;
                                    

                               }
                            

                        /**
                        * field for NewCustBankSortCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localNewCustBankSortCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNewCustBankSortCodeTracker = false ;

                           public boolean isNewCustBankSortCodeSpecified(){
                               return localNewCustBankSortCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getNewCustBankSortCode(){
                               return localNewCustBankSortCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NewCustBankSortCode
                               */
                               public void setNewCustBankSortCode(com.comverse.www.StringAttributeJAXBElement param){
                            localNewCustBankSortCodeTracker = true;
                                   
                                            this.localNewCustBankSortCode=param;
                                    

                               }
                            

                        /**
                        * field for NonRealtimeOnly
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localNonRealtimeOnly ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNonRealtimeOnlyTracker = false ;

                           public boolean isNonRealtimeOnlySpecified(){
                               return localNonRealtimeOnlyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getNonRealtimeOnly(){
                               return localNonRealtimeOnly;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NonRealtimeOnly
                               */
                               public void setNonRealtimeOnly(com.comverse.www.BooleanAttributeJAXBElement param){
                            localNonRealtimeOnlyTracker = param != null;
                                   
                                            this.localNonRealtimeOnly=param;
                                    

                               }
                            

                        /**
                        * field for OwnrFname
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localOwnrFname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOwnrFnameTracker = false ;

                           public boolean isOwnrFnameSpecified(){
                               return localOwnrFnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getOwnrFname(){
                               return localOwnrFname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OwnrFname
                               */
                               public void setOwnrFname(com.comverse.www.StringAttributeJAXBElement param){
                            localOwnrFnameTracker = true;
                                   
                                            this.localOwnrFname=param;
                                    

                               }
                            

                        /**
                        * field for OwnrLname
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localOwnrLname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOwnrLnameTracker = false ;

                           public boolean isOwnrLnameSpecified(){
                               return localOwnrLnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getOwnrLname(){
                               return localOwnrLname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OwnrLname
                               */
                               public void setOwnrLname(com.comverse.www.StringAttributeJAXBElement param){
                            localOwnrLnameTracker = true;
                                   
                                            this.localOwnrLname=param;
                                    

                               }
                            

                        /**
                        * field for PayMethod
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localPayMethod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPayMethodTracker = false ;

                           public boolean isPayMethodSpecified(){
                               return localPayMethodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getPayMethod(){
                               return localPayMethod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PayMethod
                               */
                               public void setPayMethod(com.comverse.www.ShortAttributeJAXBElement param){
                            localPayMethodTracker = param != null;
                                   
                                            this.localPayMethod=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusTracker = false ;

                           public boolean isStatusSpecified(){
                               return localStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.comverse.www.ShortAttributeJAXBElement param){
                            localStatusTracker = param != null;
                                   
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for TransFlag
                        */

                        
                                    protected com.comverse.www.CharacterAttributeJAXBElement localTransFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransFlagTracker = false ;

                           public boolean isTransFlagSpecified(){
                               return localTransFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.CharacterAttributeJAXBElement
                           */
                           public  com.comverse.www.CharacterAttributeJAXBElement getTransFlag(){
                               return localTransFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransFlag
                               */
                               public void setTransFlag(com.comverse.www.CharacterAttributeJAXBElement param){
                            localTransFlagTracker = true;
                                   
                                            this.localTransFlag=param;
                                    

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
                           namespacePrefix+":paymentProfileObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "paymentProfileObject",
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
                              if (localProfileIdTracker){
                                            if (localProfileId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("profileId cannot be null!!");
                                            }
                                           localProfileId.serialize(new javax.xml.namespace.QName("","profileId"),
                                               xmlWriter);
                                        } if (localAccountExternalIdTracker){
                                            if (localAccountExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountExternalId cannot be null!!");
                                            }
                                           localAccountExternalId.serialize(new javax.xml.namespace.QName("","accountExternalId"),
                                               xmlWriter);
                                        } if (localAccountInternalIdTracker){
                                            if (localAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                            }
                                           localAccountInternalId.serialize(new javax.xml.namespace.QName("","accountInternalId"),
                                               xmlWriter);
                                        } if (localAltBankAccNumTracker){
                                    if (localAltBankAccNum==null){

                                        writeStartElement(null, "", "altBankAccNum", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAltBankAccNum.serialize(new javax.xml.namespace.QName("","altBankAccNum"),
                                        xmlWriter);
                                    }
                                } if (localAvsAddressIdTracker){
                                    if (localAvsAddressId==null){

                                        writeStartElement(null, "", "avsAddressId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAvsAddressId.serialize(new javax.xml.namespace.QName("","avsAddressId"),
                                        xmlWriter);
                                    }
                                } if (localAvsResponseCodeTracker){
                                    if (localAvsResponseCode==null){

                                        writeStartElement(null, "", "avsResponseCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAvsResponseCode.serialize(new javax.xml.namespace.QName("","avsResponseCode"),
                                        xmlWriter);
                                    }
                                } if (localBankAccountTypeTracker){
                                    if (localBankAccountType==null){

                                        writeStartElement(null, "", "bankAccountType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBankAccountType.serialize(new javax.xml.namespace.QName("","bankAccountType"),
                                        xmlWriter);
                                    }
                                } if (localBankAgencyCodeTracker){
                                    if (localBankAgencyCode==null){

                                        writeStartElement(null, "", "bankAgencyCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBankAgencyCode.serialize(new javax.xml.namespace.QName("","bankAgencyCode"),
                                        xmlWriter);
                                    }
                                } if (localBankAgencyNameTracker){
                                    if (localBankAgencyName==null){

                                        writeStartElement(null, "", "bankAgencyName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBankAgencyName.serialize(new javax.xml.namespace.QName("","bankAgencyName"),
                                        xmlWriter);
                                    }
                                } if (localBankCodeTracker){
                                    if (localBankCode==null){

                                        writeStartElement(null, "", "bankCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBankCode.serialize(new javax.xml.namespace.QName("","bankCode"),
                                        xmlWriter);
                                    }
                                } if (localBillCompanyTaxIdTracker){
                                    if (localBillCompanyTaxId==null){

                                        writeStartElement(null, "", "billCompanyTaxId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillCompanyTaxId.serialize(new javax.xml.namespace.QName("","billCompanyTaxId"),
                                        xmlWriter);
                                    }
                                } if (localBranchCodeTracker){
                                    if (localBranchCode==null){

                                        writeStartElement(null, "", "branchCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBranchCode.serialize(new javax.xml.namespace.QName("","branchCode"),
                                        xmlWriter);
                                    }
                                } if (localBranchNameTracker){
                                    if (localBranchName==null){

                                        writeStartElement(null, "", "branchName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBranchName.serialize(new javax.xml.namespace.QName("","branchName"),
                                        xmlWriter);
                                    }
                                } if (localCardAccountTracker){
                                    if (localCardAccount==null){

                                        writeStartElement(null, "", "cardAccount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCardAccount.serialize(new javax.xml.namespace.QName("","cardAccount"),
                                        xmlWriter);
                                    }
                                } if (localCardCarrierTracker){
                                    if (localCardCarrier==null){

                                        writeStartElement(null, "", "cardCarrier", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCardCarrier.serialize(new javax.xml.namespace.QName("","cardCarrier"),
                                        xmlWriter);
                                    }
                                } if (localCardExpireTracker){
                                    if (localCardExpire==null){

                                        writeStartElement(null, "", "cardExpire", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCardExpire.serialize(new javax.xml.namespace.QName("","cardExpire"),
                                        xmlWriter);
                                    }
                                } if (localClearingHouseIdTracker){
                                    if (localClearingHouseId==null){

                                        writeStartElement(null, "", "clearingHouseId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localClearingHouseId.serialize(new javax.xml.namespace.QName("","clearingHouseId"),
                                        xmlWriter);
                                    }
                                } if (localCustBankAccNumTracker){
                                    if (localCustBankAccNum==null){

                                        writeStartElement(null, "", "custBankAccNum", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBankAccNum.serialize(new javax.xml.namespace.QName("","custBankAccNum"),
                                        xmlWriter);
                                    }
                                } if (localCustBankAcctTypeTracker){
                                    if (localCustBankAcctType==null){

                                        writeStartElement(null, "", "custBankAcctType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBankAcctType.serialize(new javax.xml.namespace.QName("","custBankAcctType"),
                                        xmlWriter);
                                    }
                                } if (localCustBankSortCodeTracker){
                                    if (localCustBankSortCode==null){

                                        writeStartElement(null, "", "custBankSortCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBankSortCode.serialize(new javax.xml.namespace.QName("","custBankSortCode"),
                                        xmlWriter);
                                    }
                                } if (localCustBillAddressTracker){
                                    if (localCustBillAddress==null){

                                        writeStartElement(null, "", "custBillAddress", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBillAddress.serialize(new javax.xml.namespace.QName("","custBillAddress"),
                                        xmlWriter);
                                    }
                                } if (localCustBillCityTracker){
                                    if (localCustBillCity==null){

                                        writeStartElement(null, "", "custBillCity", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBillCity.serialize(new javax.xml.namespace.QName("","custBillCity"),
                                        xmlWriter);
                                    }
                                } if (localCustBillCountryCodeTracker){
                                    if (localCustBillCountryCode==null){

                                        writeStartElement(null, "", "custBillCountryCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBillCountryCode.serialize(new javax.xml.namespace.QName("","custBillCountryCode"),
                                        xmlWriter);
                                    }
                                } if (localCustBillStateTracker){
                                    if (localCustBillState==null){

                                        writeStartElement(null, "", "custBillState", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBillState.serialize(new javax.xml.namespace.QName("","custBillState"),
                                        xmlWriter);
                                    }
                                } if (localCustBillZipTracker){
                                    if (localCustBillZip==null){

                                        writeStartElement(null, "", "custBillZip", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustBillZip.serialize(new javax.xml.namespace.QName("","custBillZip"),
                                        xmlWriter);
                                    }
                                } if (localCustCompanyNameTracker){
                                    if (localCustCompanyName==null){

                                        writeStartElement(null, "", "custCompanyName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustCompanyName.serialize(new javax.xml.namespace.QName("","custCompanyName"),
                                        xmlWriter);
                                    }
                                } if (localCustEmailTracker){
                                    if (localCustEmail==null){

                                        writeStartElement(null, "", "custEmail", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustEmail.serialize(new javax.xml.namespace.QName("","custEmail"),
                                        xmlWriter);
                                    }
                                } if (localCustPhoneTracker){
                                    if (localCustPhone==null){

                                        writeStartElement(null, "", "custPhone", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustPhone.serialize(new javax.xml.namespace.QName("","custPhone"),
                                        xmlWriter);
                                    }
                                } if (localCyclicalBillUsedTracker){
                                            if (localCyclicalBillUsed==null){
                                                 throw new org.apache.axis2.databinding.ADBException("cyclicalBillUsed cannot be null!!");
                                            }
                                           localCyclicalBillUsed.serialize(new javax.xml.namespace.QName("","cyclicalBillUsed"),
                                               xmlWriter);
                                        } if (localDriverLicenseNumTracker){
                                    if (localDriverLicenseNum==null){

                                        writeStartElement(null, "", "driverLicenseNum", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDriverLicenseNum.serialize(new javax.xml.namespace.QName("","driverLicenseNum"),
                                        xmlWriter);
                                    }
                                } if (localDriverLicenseStateTracker){
                                    if (localDriverLicenseState==null){

                                        writeStartElement(null, "", "driverLicenseState", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDriverLicenseState.serialize(new javax.xml.namespace.QName("","driverLicenseState"),
                                        xmlWriter);
                                    }
                                } if (localIsDefaultTracker){
                                            if (localIsDefault==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isDefault cannot be null!!");
                                            }
                                           localIsDefault.serialize(new javax.xml.namespace.QName("","isDefault"),
                                               xmlWriter);
                                        } if (localIsTemporaryTracker){
                                            if (localIsTemporary==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isTemporary cannot be null!!");
                                            }
                                           localIsTemporary.serialize(new javax.xml.namespace.QName("","isTemporary"),
                                               xmlWriter);
                                        } if (localNewCustBankSortCodeTracker){
                                    if (localNewCustBankSortCode==null){

                                        writeStartElement(null, "", "newCustBankSortCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNewCustBankSortCode.serialize(new javax.xml.namespace.QName("","newCustBankSortCode"),
                                        xmlWriter);
                                    }
                                } if (localNonRealtimeOnlyTracker){
                                            if (localNonRealtimeOnly==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nonRealtimeOnly cannot be null!!");
                                            }
                                           localNonRealtimeOnly.serialize(new javax.xml.namespace.QName("","nonRealtimeOnly"),
                                               xmlWriter);
                                        } if (localOwnrFnameTracker){
                                    if (localOwnrFname==null){

                                        writeStartElement(null, "", "ownrFname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOwnrFname.serialize(new javax.xml.namespace.QName("","ownrFname"),
                                        xmlWriter);
                                    }
                                } if (localOwnrLnameTracker){
                                    if (localOwnrLname==null){

                                        writeStartElement(null, "", "ownrLname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOwnrLname.serialize(new javax.xml.namespace.QName("","ownrLname"),
                                        xmlWriter);
                                    }
                                } if (localPayMethodTracker){
                                            if (localPayMethod==null){
                                                 throw new org.apache.axis2.databinding.ADBException("payMethod cannot be null!!");
                                            }
                                           localPayMethod.serialize(new javax.xml.namespace.QName("","payMethod"),
                                               xmlWriter);
                                        } if (localStatusTracker){
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("","status"),
                                               xmlWriter);
                                        } if (localTransFlagTracker){
                                    if (localTransFlag==null){

                                        writeStartElement(null, "", "transFlag", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTransFlag.serialize(new javax.xml.namespace.QName("","transFlag"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","paymentProfileObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localProfileIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "profileId"));
                            
                            
                                    if (localProfileId==null){
                                         throw new org.apache.axis2.databinding.ADBException("profileId cannot be null!!");
                                    }
                                    elementList.add(localProfileId);
                                } if (localAccountExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountExternalId"));
                            
                            
                                    if (localAccountExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountExternalId cannot be null!!");
                                    }
                                    elementList.add(localAccountExternalId);
                                } if (localAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountInternalId"));
                            
                            
                                    if (localAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                    }
                                    elementList.add(localAccountInternalId);
                                } if (localAltBankAccNumTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "altBankAccNum"));
                            
                            
                                    elementList.add(localAltBankAccNum==null?null:
                                    localAltBankAccNum);
                                } if (localAvsAddressIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "avsAddressId"));
                            
                            
                                    elementList.add(localAvsAddressId==null?null:
                                    localAvsAddressId);
                                } if (localAvsResponseCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "avsResponseCode"));
                            
                            
                                    elementList.add(localAvsResponseCode==null?null:
                                    localAvsResponseCode);
                                } if (localBankAccountTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bankAccountType"));
                            
                            
                                    elementList.add(localBankAccountType==null?null:
                                    localBankAccountType);
                                } if (localBankAgencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bankAgencyCode"));
                            
                            
                                    elementList.add(localBankAgencyCode==null?null:
                                    localBankAgencyCode);
                                } if (localBankAgencyNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bankAgencyName"));
                            
                            
                                    elementList.add(localBankAgencyName==null?null:
                                    localBankAgencyName);
                                } if (localBankCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bankCode"));
                            
                            
                                    elementList.add(localBankCode==null?null:
                                    localBankCode);
                                } if (localBillCompanyTaxIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billCompanyTaxId"));
                            
                            
                                    elementList.add(localBillCompanyTaxId==null?null:
                                    localBillCompanyTaxId);
                                } if (localBranchCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "branchCode"));
                            
                            
                                    elementList.add(localBranchCode==null?null:
                                    localBranchCode);
                                } if (localBranchNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "branchName"));
                            
                            
                                    elementList.add(localBranchName==null?null:
                                    localBranchName);
                                } if (localCardAccountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cardAccount"));
                            
                            
                                    elementList.add(localCardAccount==null?null:
                                    localCardAccount);
                                } if (localCardCarrierTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cardCarrier"));
                            
                            
                                    elementList.add(localCardCarrier==null?null:
                                    localCardCarrier);
                                } if (localCardExpireTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cardExpire"));
                            
                            
                                    elementList.add(localCardExpire==null?null:
                                    localCardExpire);
                                } if (localClearingHouseIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "clearingHouseId"));
                            
                            
                                    elementList.add(localClearingHouseId==null?null:
                                    localClearingHouseId);
                                } if (localCustBankAccNumTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBankAccNum"));
                            
                            
                                    elementList.add(localCustBankAccNum==null?null:
                                    localCustBankAccNum);
                                } if (localCustBankAcctTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBankAcctType"));
                            
                            
                                    elementList.add(localCustBankAcctType==null?null:
                                    localCustBankAcctType);
                                } if (localCustBankSortCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBankSortCode"));
                            
                            
                                    elementList.add(localCustBankSortCode==null?null:
                                    localCustBankSortCode);
                                } if (localCustBillAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBillAddress"));
                            
                            
                                    elementList.add(localCustBillAddress==null?null:
                                    localCustBillAddress);
                                } if (localCustBillCityTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBillCity"));
                            
                            
                                    elementList.add(localCustBillCity==null?null:
                                    localCustBillCity);
                                } if (localCustBillCountryCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBillCountryCode"));
                            
                            
                                    elementList.add(localCustBillCountryCode==null?null:
                                    localCustBillCountryCode);
                                } if (localCustBillStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBillState"));
                            
                            
                                    elementList.add(localCustBillState==null?null:
                                    localCustBillState);
                                } if (localCustBillZipTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custBillZip"));
                            
                            
                                    elementList.add(localCustBillZip==null?null:
                                    localCustBillZip);
                                } if (localCustCompanyNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custCompanyName"));
                            
                            
                                    elementList.add(localCustCompanyName==null?null:
                                    localCustCompanyName);
                                } if (localCustEmailTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custEmail"));
                            
                            
                                    elementList.add(localCustEmail==null?null:
                                    localCustEmail);
                                } if (localCustPhoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custPhone"));
                            
                            
                                    elementList.add(localCustPhone==null?null:
                                    localCustPhone);
                                } if (localCyclicalBillUsedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cyclicalBillUsed"));
                            
                            
                                    if (localCyclicalBillUsed==null){
                                         throw new org.apache.axis2.databinding.ADBException("cyclicalBillUsed cannot be null!!");
                                    }
                                    elementList.add(localCyclicalBillUsed);
                                } if (localDriverLicenseNumTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "driverLicenseNum"));
                            
                            
                                    elementList.add(localDriverLicenseNum==null?null:
                                    localDriverLicenseNum);
                                } if (localDriverLicenseStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "driverLicenseState"));
                            
                            
                                    elementList.add(localDriverLicenseState==null?null:
                                    localDriverLicenseState);
                                } if (localIsDefaultTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isDefault"));
                            
                            
                                    if (localIsDefault==null){
                                         throw new org.apache.axis2.databinding.ADBException("isDefault cannot be null!!");
                                    }
                                    elementList.add(localIsDefault);
                                } if (localIsTemporaryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isTemporary"));
                            
                            
                                    if (localIsTemporary==null){
                                         throw new org.apache.axis2.databinding.ADBException("isTemporary cannot be null!!");
                                    }
                                    elementList.add(localIsTemporary);
                                } if (localNewCustBankSortCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "newCustBankSortCode"));
                            
                            
                                    elementList.add(localNewCustBankSortCode==null?null:
                                    localNewCustBankSortCode);
                                } if (localNonRealtimeOnlyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nonRealtimeOnly"));
                            
                            
                                    if (localNonRealtimeOnly==null){
                                         throw new org.apache.axis2.databinding.ADBException("nonRealtimeOnly cannot be null!!");
                                    }
                                    elementList.add(localNonRealtimeOnly);
                                } if (localOwnrFnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ownrFname"));
                            
                            
                                    elementList.add(localOwnrFname==null?null:
                                    localOwnrFname);
                                } if (localOwnrLnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ownrLname"));
                            
                            
                                    elementList.add(localOwnrLname==null?null:
                                    localOwnrLname);
                                } if (localPayMethodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "payMethod"));
                            
                            
                                    if (localPayMethod==null){
                                         throw new org.apache.axis2.databinding.ADBException("payMethod cannot be null!!");
                                    }
                                    elementList.add(localPayMethod);
                                } if (localStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                } if (localTransFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "transFlag"));
                            
                            
                                    elementList.add(localTransFlag==null?null:
                                    localTransFlag);
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
        public static PaymentProfileObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PaymentProfileObject object =
                new PaymentProfileObject();

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
                    
                            if (!"paymentProfileObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PaymentProfileObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","profileId").equals(reader.getName())){
                                
                                                object.setProfileId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountInternalId").equals(reader.getName())){
                                
                                                object.setAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","altBankAccNum").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAltBankAccNum(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAltBankAccNum(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","avsAddressId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAvsAddressId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAvsAddressId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","avsResponseCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAvsResponseCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAvsResponseCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bankAccountType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBankAccountType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBankAccountType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bankAgencyCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBankAgencyCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBankAgencyCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bankAgencyName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBankAgencyName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBankAgencyName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bankCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBankCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBankCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billCompanyTaxId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillCompanyTaxId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillCompanyTaxId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","branchCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBranchCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBranchCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","branchName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBranchName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBranchName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cardAccount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCardAccount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCardAccount(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cardCarrier").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCardCarrier(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCardCarrier(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cardExpire").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCardExpire(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCardExpire(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","clearingHouseId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setClearingHouseId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setClearingHouseId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBankAccNum").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBankAccNum(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBankAccNum(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBankAcctType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBankAcctType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBankAcctType(com.comverse.www.CharacterAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBankSortCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBankSortCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBankSortCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBillAddress").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBillAddress(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBillAddress(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBillCity").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBillCity(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBillCity(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBillCountryCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBillCountryCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBillCountryCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBillState").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBillState(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBillState(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custBillZip").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustBillZip(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustBillZip(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custCompanyName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustCompanyName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustCompanyName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custEmail").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustEmail(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustEmail(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custPhone").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustPhone(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustPhone(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cyclicalBillUsed").equals(reader.getName())){
                                
                                                object.setCyclicalBillUsed(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","driverLicenseNum").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDriverLicenseNum(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDriverLicenseNum(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","driverLicenseState").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDriverLicenseState(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDriverLicenseState(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isDefault").equals(reader.getName())){
                                
                                                object.setIsDefault(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isTemporary").equals(reader.getName())){
                                
                                                object.setIsTemporary(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","newCustBankSortCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNewCustBankSortCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNewCustBankSortCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nonRealtimeOnly").equals(reader.getName())){
                                
                                                object.setNonRealtimeOnly(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ownrFname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOwnrFname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOwnrFname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ownrLname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOwnrLname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOwnrLname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","payMethod").equals(reader.getName())){
                                
                                                object.setPayMethod(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","status").equals(reader.getName())){
                                
                                                object.setStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","transFlag").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTransFlag(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTransFlag(com.comverse.www.CharacterAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    