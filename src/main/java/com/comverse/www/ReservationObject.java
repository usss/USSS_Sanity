
/**
 * ReservationObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  ReservationObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ReservationObject extends com.comverse.www.ReservationIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = reservationObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ActivityStartTime
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localActivityStartTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActivityStartTimeTracker = false ;

                           public boolean isActivityStartTimeSpecified(){
                               return localActivityStartTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getActivityStartTime(){
                               return localActivityStartTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActivityStartTime
                               */
                               public void setActivityStartTime(com.comverse.www.DateAttributeJAXBElement param){
                            localActivityStartTimeTracker = param != null;
                                   
                                            this.localActivityStartTime=param;
                                    

                               }
                            

                        /**
                        * field for AssumeConsumption
                        */

                        
                                    protected com.comverse.www.CharacterAttributeJAXBElement localAssumeConsumption ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssumeConsumptionTracker = false ;

                           public boolean isAssumeConsumptionSpecified(){
                               return localAssumeConsumptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.CharacterAttributeJAXBElement
                           */
                           public  com.comverse.www.CharacterAttributeJAXBElement getAssumeConsumption(){
                               return localAssumeConsumption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssumeConsumption
                               */
                               public void setAssumeConsumption(com.comverse.www.CharacterAttributeJAXBElement param){
                            localAssumeConsumptionTracker = param != null;
                                   
                                            this.localAssumeConsumption=param;
                                    

                               }
                            

                        /**
                        * field for CalledNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCalledNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCalledNumberTracker = false ;

                           public boolean isCalledNumberSpecified(){
                               return localCalledNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCalledNumber(){
                               return localCalledNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CalledNumber
                               */
                               public void setCalledNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localCalledNumberTracker = true;
                                   
                                            this.localCalledNumber=param;
                                    

                               }
                            

                        /**
                        * field for ConsUsage
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localConsUsage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConsUsageTracker = false ;

                           public boolean isConsUsageSpecified(){
                               return localConsUsageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getConsUsage(){
                               return localConsUsage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConsUsage
                               */
                               public void setConsUsage(com.comverse.www.NumericAttributeJAXBElement param){
                            localConsUsageTracker = param != null;
                                   
                                            this.localConsUsage=param;
                                    

                               }
                            

                        /**
                        * field for DiscountItemId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localDiscountItemId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDiscountItemIdTracker = false ;

                           public boolean isDiscountItemIdSpecified(){
                               return localDiscountItemIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getDiscountItemId(){
                               return localDiscountItemId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DiscountItemId
                               */
                               public void setDiscountItemId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localDiscountItemIdTracker = true;
                                   
                                            this.localDiscountItemId=param;
                                    

                               }
                            

                        /**
                        * field for FinalAutId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localFinalAutId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFinalAutIdTracker = false ;

                           public boolean isFinalAutIdSpecified(){
                               return localFinalAutIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getFinalAutId(){
                               return localFinalAutId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FinalAutId
                               */
                               public void setFinalAutId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localFinalAutIdTracker = param != null;
                                   
                                            this.localFinalAutId=param;
                                    

                               }
                            

                        /**
                        * field for FundUsageType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localFundUsageType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFundUsageTypeTracker = false ;

                           public boolean isFundUsageTypeSpecified(){
                               return localFundUsageTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getFundUsageType(){
                               return localFundUsageType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FundUsageType
                               */
                               public void setFundUsageType(com.comverse.www.ShortAttributeJAXBElement param){
                            localFundUsageTypeTracker = true;
                                   
                                            this.localFundUsageType=param;
                                    

                               }
                            

                        /**
                        * field for GroupAccountInfo
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localGroupAccountInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupAccountInfoTracker = false ;

                           public boolean isGroupAccountInfoSpecified(){
                               return localGroupAccountInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getGroupAccountInfo(){
                               return localGroupAccountInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GroupAccountInfo
                               */
                               public void setGroupAccountInfo(com.comverse.www.StringAttributeJAXBElement param){
                            localGroupAccountInfoTracker = true;
                                   
                                            this.localGroupAccountInfo=param;
                                    

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
                        * field for InitialTimeTypeId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localInitialTimeTypeId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitialTimeTypeIdTracker = false ;

                           public boolean isInitialTimeTypeIdSpecified(){
                               return localInitialTimeTypeIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getInitialTimeTypeId(){
                               return localInitialTimeTypeId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitialTimeTypeId
                               */
                               public void setInitialTimeTypeId(com.comverse.www.ShortAttributeJAXBElement param){
                            localInitialTimeTypeIdTracker = true;
                                   
                                            this.localInitialTimeTypeId=param;
                                    

                               }
                            

                        /**
                        * field for LiabilityRedirectIndicator
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localLiabilityRedirectIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiabilityRedirectIndicatorTracker = false ;

                           public boolean isLiabilityRedirectIndicatorSpecified(){
                               return localLiabilityRedirectIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getLiabilityRedirectIndicator(){
                               return localLiabilityRedirectIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiabilityRedirectIndicator
                               */
                               public void setLiabilityRedirectIndicator(com.comverse.www.BooleanAttributeJAXBElement param){
                            localLiabilityRedirectIndicatorTracker = true;
                                   
                                            this.localLiabilityRedirectIndicator=param;
                                    

                               }
                            

                        /**
                        * field for LocationIndicatorPartyA
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localLocationIndicatorPartyA ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationIndicatorPartyATracker = false ;

                           public boolean isLocationIndicatorPartyASpecified(){
                               return localLocationIndicatorPartyATracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getLocationIndicatorPartyA(){
                               return localLocationIndicatorPartyA;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LocationIndicatorPartyA
                               */
                               public void setLocationIndicatorPartyA(com.comverse.www.StringAttributeJAXBElement param){
                            localLocationIndicatorPartyATracker = true;
                                   
                                            this.localLocationIndicatorPartyA=param;
                                    

                               }
                            

                        /**
                        * field for LocationIndicatorPartyB
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localLocationIndicatorPartyB ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationIndicatorPartyBTracker = false ;

                           public boolean isLocationIndicatorPartyBSpecified(){
                               return localLocationIndicatorPartyBTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getLocationIndicatorPartyB(){
                               return localLocationIndicatorPartyB;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LocationIndicatorPartyB
                               */
                               public void setLocationIndicatorPartyB(com.comverse.www.StringAttributeJAXBElement param){
                            localLocationIndicatorPartyBTracker = true;
                                   
                                            this.localLocationIndicatorPartyB=param;
                                    

                               }
                            

                        /**
                        * field for LrCallType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localLrCallType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLrCallTypeTracker = false ;

                           public boolean isLrCallTypeSpecified(){
                               return localLrCallTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getLrCallType(){
                               return localLrCallType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LrCallType
                               */
                               public void setLrCallType(com.comverse.www.ShortAttributeJAXBElement param){
                            localLrCallTypeTracker = true;
                                   
                                            this.localLrCallType=param;
                                    

                               }
                            

                        /**
                        * field for ParentAccountConversionRate
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localParentAccountConversionRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentAccountConversionRateTracker = false ;

                           public boolean isParentAccountConversionRateSpecified(){
                               return localParentAccountConversionRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getParentAccountConversionRate(){
                               return localParentAccountConversionRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentAccountConversionRate
                               */
                               public void setParentAccountConversionRate(com.comverse.www.NumericAttributeJAXBElement param){
                            localParentAccountConversionRateTracker = true;
                                   
                                            this.localParentAccountConversionRate=param;
                                    

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
                            localParentAccountInternalIdTracker = true;
                                   
                                            this.localParentAccountInternalId=param;
                                    

                               }
                            

                        /**
                        * field for ParentAccountIsoCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localParentAccountIsoCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentAccountIsoCodeTracker = false ;

                           public boolean isParentAccountIsoCodeSpecified(){
                               return localParentAccountIsoCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getParentAccountIsoCode(){
                               return localParentAccountIsoCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentAccountIsoCode
                               */
                               public void setParentAccountIsoCode(com.comverse.www.StringAttributeJAXBElement param){
                            localParentAccountIsoCodeTracker = true;
                                   
                                            this.localParentAccountIsoCode=param;
                                    

                               }
                            

                        /**
                        * field for ParentAccountTotConsTml
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localParentAccountTotConsTml ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentAccountTotConsTmlTracker = false ;

                           public boolean isParentAccountTotConsTmlSpecified(){
                               return localParentAccountTotConsTmlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getParentAccountTotConsTml(){
                               return localParentAccountTotConsTml;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentAccountTotConsTml
                               */
                               public void setParentAccountTotConsTml(com.comverse.www.NumericAttributeJAXBElement param){
                            localParentAccountTotConsTmlTracker = true;
                                   
                                            this.localParentAccountTotConsTml=param;
                                    

                               }
                            

                        /**
                        * field for ParentAccountTotReservTml
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localParentAccountTotReservTml ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentAccountTotReservTmlTracker = false ;

                           public boolean isParentAccountTotReservTmlSpecified(){
                               return localParentAccountTotReservTmlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getParentAccountTotReservTml(){
                               return localParentAccountTotReservTml;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentAccountTotReservTml
                               */
                               public void setParentAccountTotReservTml(com.comverse.www.NumericAttributeJAXBElement param){
                            localParentAccountTotReservTmlTracker = true;
                                   
                                            this.localParentAccountTotReservTml=param;
                                    

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
                            localPrimaryOfferIdTracker = true;
                                   
                                            this.localPrimaryOfferId=param;
                                    

                               }
                            

                        /**
                        * field for ResellerVersionId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localResellerVersionId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResellerVersionIdTracker = false ;

                           public boolean isResellerVersionIdSpecified(){
                               return localResellerVersionIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getResellerVersionId(){
                               return localResellerVersionId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResellerVersionId
                               */
                               public void setResellerVersionId(com.comverse.www.LongAttributeJAXBElement param){
                            localResellerVersionIdTracker = true;
                                   
                                            this.localResellerVersionId=param;
                                    

                               }
                            

                        /**
                        * field for ReservationEndTime
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localReservationEndTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationEndTimeTracker = false ;

                           public boolean isReservationEndTimeSpecified(){
                               return localReservationEndTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getReservationEndTime(){
                               return localReservationEndTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReservationEndTime
                               */
                               public void setReservationEndTime(com.comverse.www.DateAttributeJAXBElement param){
                            localReservationEndTimeTracker = param != null;
                                   
                                            this.localReservationEndTime=param;
                                    

                               }
                            

                        /**
                        * field for ServiceType
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceTypeTracker = false ;

                           public boolean isServiceTypeSpecified(){
                               return localServiceTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceType(){
                               return localServiceType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceType
                               */
                               public void setServiceType(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceTypeTracker = param != null;
                                   
                                            this.localServiceType=param;
                                    

                               }
                            

                        /**
                        * field for SettlementCharge
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localSettlementCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSettlementChargeTracker = false ;

                           public boolean isSettlementChargeSpecified(){
                               return localSettlementChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getSettlementCharge(){
                               return localSettlementCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SettlementCharge
                               */
                               public void setSettlementCharge(com.comverse.www.NumericAttributeJAXBElement param){
                            localSettlementChargeTracker = true;
                                   
                                            this.localSettlementCharge=param;
                                    

                               }
                            

                        /**
                        * field for SettlementRecordFlag
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localSettlementRecordFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSettlementRecordFlagTracker = false ;

                           public boolean isSettlementRecordFlagSpecified(){
                               return localSettlementRecordFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getSettlementRecordFlag(){
                               return localSettlementRecordFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SettlementRecordFlag
                               */
                               public void setSettlementRecordFlag(com.comverse.www.BooleanAttributeJAXBElement param){
                            localSettlementRecordFlagTracker = true;
                                   
                                            this.localSettlementRecordFlag=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberIsoCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localSubscriberIsoCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberIsoCodeTracker = false ;

                           public boolean isSubscriberIsoCodeSpecified(){
                               return localSubscriberIsoCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getSubscriberIsoCode(){
                               return localSubscriberIsoCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberIsoCode
                               */
                               public void setSubscriberIsoCode(com.comverse.www.StringAttributeJAXBElement param){
                            localSubscriberIsoCodeTracker = true;
                                   
                                            this.localSubscriberIsoCode=param;
                                    

                               }
                            

                        /**
                        * field for TargetAccountConversionRate
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localTargetAccountConversionRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetAccountConversionRateTracker = false ;

                           public boolean isTargetAccountConversionRateSpecified(){
                               return localTargetAccountConversionRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getTargetAccountConversionRate(){
                               return localTargetAccountConversionRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetAccountConversionRate
                               */
                               public void setTargetAccountConversionRate(com.comverse.www.NumericAttributeJAXBElement param){
                            localTargetAccountConversionRateTracker = true;
                                   
                                            this.localTargetAccountConversionRate=param;
                                    

                               }
                            

                        /**
                        * field for TargetAccountIsoCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localTargetAccountIsoCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetAccountIsoCodeTracker = false ;

                           public boolean isTargetAccountIsoCodeSpecified(){
                               return localTargetAccountIsoCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getTargetAccountIsoCode(){
                               return localTargetAccountIsoCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetAccountIsoCode
                               */
                               public void setTargetAccountIsoCode(com.comverse.www.StringAttributeJAXBElement param){
                            localTargetAccountIsoCodeTracker = true;
                                   
                                            this.localTargetAccountIsoCode=param;
                                    

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
                        * field for TargetAccountReserveTml
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localTargetAccountReserveTml ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetAccountReserveTmlTracker = false ;

                           public boolean isTargetAccountReserveTmlSpecified(){
                               return localTargetAccountReserveTmlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getTargetAccountReserveTml(){
                               return localTargetAccountReserveTml;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetAccountReserveTml
                               */
                               public void setTargetAccountReserveTml(com.comverse.www.NumericAttributeJAXBElement param){
                            localTargetAccountReserveTmlTracker = true;
                                   
                                            this.localTargetAccountReserveTml=param;
                                    

                               }
                            

                        /**
                        * field for TargetSubscrNo
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localTargetSubscrNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetSubscrNoTracker = false ;

                           public boolean isTargetSubscrNoSpecified(){
                               return localTargetSubscrNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getTargetSubscrNo(){
                               return localTargetSubscrNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetSubscrNo
                               */
                               public void setTargetSubscrNo(com.comverse.www.IntegerAttributeJAXBElement param){
                            localTargetSubscrNoTracker = true;
                                   
                                            this.localTargetSubscrNo=param;
                                    

                               }
                            

                        /**
                        * field for TargetSubscrNoResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTargetSubscrNoResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetSubscrNoResetsTracker = false ;

                           public boolean isTargetSubscrNoResetsSpecified(){
                               return localTargetSubscrNoResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTargetSubscrNoResets(){
                               return localTargetSubscrNoResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetSubscrNoResets
                               */
                               public void setTargetSubscrNoResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localTargetSubscrNoResetsTracker = true;
                                   
                                            this.localTargetSubscrNoResets=param;
                                    

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
                        * field for UserSubscrNo
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localUserSubscrNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserSubscrNoTracker = false ;

                           public boolean isUserSubscrNoSpecified(){
                               return localUserSubscrNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getUserSubscrNo(){
                               return localUserSubscrNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserSubscrNo
                               */
                               public void setUserSubscrNo(com.comverse.www.IntegerAttributeJAXBElement param){
                            localUserSubscrNoTracker = true;
                                   
                                            this.localUserSubscrNo=param;
                                    

                               }
                            

                        /**
                        * field for UserSubscrNoResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localUserSubscrNoResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserSubscrNoResetsTracker = false ;

                           public boolean isUserSubscrNoResetsSpecified(){
                               return localUserSubscrNoResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getUserSubscrNoResets(){
                               return localUserSubscrNoResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserSubscrNoResets
                               */
                               public void setUserSubscrNoResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localUserSubscrNoResetsTracker = true;
                                   
                                            this.localUserSubscrNoResets=param;
                                    

                               }
                            

                        /**
                        * field for Balances
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.ReservationBalanceObject[] localBalances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalancesTracker = false ;

                           public boolean isBalancesSpecified(){
                               return localBalancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ReservationBalanceObject[]
                           */
                           public  com.comverse.www.ReservationBalanceObject[] getBalances(){
                               return localBalances;
                           }

                           
                        


                               
                              /**
                               * validate the array for Balances
                               */
                              protected void validateBalances(com.comverse.www.ReservationBalanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Balances
                              */
                              public void setBalances(com.comverse.www.ReservationBalanceObject[] param){
                              
                                   validateBalances(param);

                               localBalancesTracker = true;
                                      
                                      this.localBalances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.ReservationBalanceObject
                             */
                             public void addBalances(com.comverse.www.ReservationBalanceObject param){
                                   if (localBalances == null){
                                   localBalances = new com.comverse.www.ReservationBalanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localBalancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBalances);
                               list.add(param);
                               this.localBalances =
                             (com.comverse.www.ReservationBalanceObject[])list.toArray(
                            new com.comverse.www.ReservationBalanceObject[list.size()]);

                             }
                             

                        /**
                        * field for Accumulators
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.ReservationAccumulatorObject[] localAccumulators ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccumulatorsTracker = false ;

                           public boolean isAccumulatorsSpecified(){
                               return localAccumulatorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ReservationAccumulatorObject[]
                           */
                           public  com.comverse.www.ReservationAccumulatorObject[] getAccumulators(){
                               return localAccumulators;
                           }

                           
                        


                               
                              /**
                               * validate the array for Accumulators
                               */
                              protected void validateAccumulators(com.comverse.www.ReservationAccumulatorObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Accumulators
                              */
                              public void setAccumulators(com.comverse.www.ReservationAccumulatorObject[] param){
                              
                                   validateAccumulators(param);

                               localAccumulatorsTracker = true;
                                      
                                      this.localAccumulators=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.ReservationAccumulatorObject
                             */
                             public void addAccumulators(com.comverse.www.ReservationAccumulatorObject param){
                                   if (localAccumulators == null){
                                   localAccumulators = new com.comverse.www.ReservationAccumulatorObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localAccumulatorsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAccumulators);
                               list.add(param);
                               this.localAccumulators =
                             (com.comverse.www.ReservationAccumulatorObject[])list.toArray(
                            new com.comverse.www.ReservationAccumulatorObject[list.size()]);

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
                           namespacePrefix+":reservationObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "reservationObject",
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
                              if (localAccountInternalIdTracker){
                                    if (localAccountInternalId==null){

                                        writeStartElement(null, "", "accountInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccountInternalId.serialize(new javax.xml.namespace.QName("","accountInternalId"),
                                        xmlWriter);
                                    }
                                } if (localCrnTracker){
                                            if (localCrn==null){
                                                 throw new org.apache.axis2.databinding.ADBException("crn cannot be null!!");
                                            }
                                           localCrn.serialize(new javax.xml.namespace.QName("","crn"),
                                               xmlWriter);
                                        } if (localProcessNameTracker){
                                            if (localProcessName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("processName cannot be null!!");
                                            }
                                           localProcessName.serialize(new javax.xml.namespace.QName("","processName"),
                                               xmlWriter);
                                        } if (localReservationIdTracker){
                                    if (localReservationId==null){

                                        writeStartElement(null, "", "reservationId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localReservationId.serialize(new javax.xml.namespace.QName("","reservationId"),
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
                                        } if (localSluNameTracker){
                                            if (localSluName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("sluName cannot be null!!");
                                            }
                                           localSluName.serialize(new javax.xml.namespace.QName("","sluName"),
                                               xmlWriter);
                                        } if (localActivityStartTimeTracker){
                                            if (localActivityStartTime==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activityStartTime cannot be null!!");
                                            }
                                           localActivityStartTime.serialize(new javax.xml.namespace.QName("","activityStartTime"),
                                               xmlWriter);
                                        } if (localAssumeConsumptionTracker){
                                            if (localAssumeConsumption==null){
                                                 throw new org.apache.axis2.databinding.ADBException("assumeConsumption cannot be null!!");
                                            }
                                           localAssumeConsumption.serialize(new javax.xml.namespace.QName("","assumeConsumption"),
                                               xmlWriter);
                                        } if (localCalledNumberTracker){
                                    if (localCalledNumber==null){

                                        writeStartElement(null, "", "calledNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCalledNumber.serialize(new javax.xml.namespace.QName("","calledNumber"),
                                        xmlWriter);
                                    }
                                } if (localConsUsageTracker){
                                            if (localConsUsage==null){
                                                 throw new org.apache.axis2.databinding.ADBException("consUsage cannot be null!!");
                                            }
                                           localConsUsage.serialize(new javax.xml.namespace.QName("","consUsage"),
                                               xmlWriter);
                                        } if (localDiscountItemIdTracker){
                                    if (localDiscountItemId==null){

                                        writeStartElement(null, "", "discountItemId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDiscountItemId.serialize(new javax.xml.namespace.QName("","discountItemId"),
                                        xmlWriter);
                                    }
                                } if (localFinalAutIdTracker){
                                            if (localFinalAutId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("finalAutId cannot be null!!");
                                            }
                                           localFinalAutId.serialize(new javax.xml.namespace.QName("","finalAutId"),
                                               xmlWriter);
                                        } if (localFundUsageTypeTracker){
                                    if (localFundUsageType==null){

                                        writeStartElement(null, "", "fundUsageType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFundUsageType.serialize(new javax.xml.namespace.QName("","fundUsageType"),
                                        xmlWriter);
                                    }
                                } if (localGroupAccountInfoTracker){
                                    if (localGroupAccountInfo==null){

                                        writeStartElement(null, "", "groupAccountInfo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGroupAccountInfo.serialize(new javax.xml.namespace.QName("","groupAccountInfo"),
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
                                } if (localInitialTimeTypeIdTracker){
                                    if (localInitialTimeTypeId==null){

                                        writeStartElement(null, "", "initialTimeTypeId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInitialTimeTypeId.serialize(new javax.xml.namespace.QName("","initialTimeTypeId"),
                                        xmlWriter);
                                    }
                                } if (localLiabilityRedirectIndicatorTracker){
                                    if (localLiabilityRedirectIndicator==null){

                                        writeStartElement(null, "", "liabilityRedirectIndicator", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLiabilityRedirectIndicator.serialize(new javax.xml.namespace.QName("","liabilityRedirectIndicator"),
                                        xmlWriter);
                                    }
                                } if (localLocationIndicatorPartyATracker){
                                    if (localLocationIndicatorPartyA==null){

                                        writeStartElement(null, "", "locationIndicatorPartyA", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLocationIndicatorPartyA.serialize(new javax.xml.namespace.QName("","locationIndicatorPartyA"),
                                        xmlWriter);
                                    }
                                } if (localLocationIndicatorPartyBTracker){
                                    if (localLocationIndicatorPartyB==null){

                                        writeStartElement(null, "", "locationIndicatorPartyB", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLocationIndicatorPartyB.serialize(new javax.xml.namespace.QName("","locationIndicatorPartyB"),
                                        xmlWriter);
                                    }
                                } if (localLrCallTypeTracker){
                                    if (localLrCallType==null){

                                        writeStartElement(null, "", "lrCallType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLrCallType.serialize(new javax.xml.namespace.QName("","lrCallType"),
                                        xmlWriter);
                                    }
                                } if (localParentAccountConversionRateTracker){
                                    if (localParentAccountConversionRate==null){

                                        writeStartElement(null, "", "parentAccountConversionRate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentAccountConversionRate.serialize(new javax.xml.namespace.QName("","parentAccountConversionRate"),
                                        xmlWriter);
                                    }
                                } if (localParentAccountInternalIdTracker){
                                    if (localParentAccountInternalId==null){

                                        writeStartElement(null, "", "parentAccountInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentAccountInternalId.serialize(new javax.xml.namespace.QName("","parentAccountInternalId"),
                                        xmlWriter);
                                    }
                                } if (localParentAccountIsoCodeTracker){
                                    if (localParentAccountIsoCode==null){

                                        writeStartElement(null, "", "parentAccountIsoCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentAccountIsoCode.serialize(new javax.xml.namespace.QName("","parentAccountIsoCode"),
                                        xmlWriter);
                                    }
                                } if (localParentAccountTotConsTmlTracker){
                                    if (localParentAccountTotConsTml==null){

                                        writeStartElement(null, "", "parentAccountTotConsTml", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentAccountTotConsTml.serialize(new javax.xml.namespace.QName("","parentAccountTotConsTml"),
                                        xmlWriter);
                                    }
                                } if (localParentAccountTotReservTmlTracker){
                                    if (localParentAccountTotReservTml==null){

                                        writeStartElement(null, "", "parentAccountTotReservTml", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentAccountTotReservTml.serialize(new javax.xml.namespace.QName("","parentAccountTotReservTml"),
                                        xmlWriter);
                                    }
                                } if (localPrimaryOfferIdTracker){
                                    if (localPrimaryOfferId==null){

                                        writeStartElement(null, "", "primaryOfferId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrimaryOfferId.serialize(new javax.xml.namespace.QName("","primaryOfferId"),
                                        xmlWriter);
                                    }
                                } if (localResellerVersionIdTracker){
                                    if (localResellerVersionId==null){

                                        writeStartElement(null, "", "resellerVersionId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localResellerVersionId.serialize(new javax.xml.namespace.QName("","resellerVersionId"),
                                        xmlWriter);
                                    }
                                } if (localReservationEndTimeTracker){
                                            if (localReservationEndTime==null){
                                                 throw new org.apache.axis2.databinding.ADBException("reservationEndTime cannot be null!!");
                                            }
                                           localReservationEndTime.serialize(new javax.xml.namespace.QName("","reservationEndTime"),
                                               xmlWriter);
                                        } if (localServiceTypeTracker){
                                            if (localServiceType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceType cannot be null!!");
                                            }
                                           localServiceType.serialize(new javax.xml.namespace.QName("","serviceType"),
                                               xmlWriter);
                                        } if (localSettlementChargeTracker){
                                    if (localSettlementCharge==null){

                                        writeStartElement(null, "", "settlementCharge", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSettlementCharge.serialize(new javax.xml.namespace.QName("","settlementCharge"),
                                        xmlWriter);
                                    }
                                } if (localSettlementRecordFlagTracker){
                                    if (localSettlementRecordFlag==null){

                                        writeStartElement(null, "", "settlementRecordFlag", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSettlementRecordFlag.serialize(new javax.xml.namespace.QName("","settlementRecordFlag"),
                                        xmlWriter);
                                    }
                                } if (localSubscriberIsoCodeTracker){
                                    if (localSubscriberIsoCode==null){

                                        writeStartElement(null, "", "subscriberIsoCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSubscriberIsoCode.serialize(new javax.xml.namespace.QName("","subscriberIsoCode"),
                                        xmlWriter);
                                    }
                                } if (localTargetAccountConversionRateTracker){
                                    if (localTargetAccountConversionRate==null){

                                        writeStartElement(null, "", "targetAccountConversionRate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetAccountConversionRate.serialize(new javax.xml.namespace.QName("","targetAccountConversionRate"),
                                        xmlWriter);
                                    }
                                } if (localTargetAccountIsoCodeTracker){
                                    if (localTargetAccountIsoCode==null){

                                        writeStartElement(null, "", "targetAccountIsoCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetAccountIsoCode.serialize(new javax.xml.namespace.QName("","targetAccountIsoCode"),
                                        xmlWriter);
                                    }
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
                                } if (localTargetAccountReserveTmlTracker){
                                    if (localTargetAccountReserveTml==null){

                                        writeStartElement(null, "", "targetAccountReserveTml", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetAccountReserveTml.serialize(new javax.xml.namespace.QName("","targetAccountReserveTml"),
                                        xmlWriter);
                                    }
                                } if (localTargetSubscrNoTracker){
                                    if (localTargetSubscrNo==null){

                                        writeStartElement(null, "", "targetSubscrNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetSubscrNo.serialize(new javax.xml.namespace.QName("","targetSubscrNo"),
                                        xmlWriter);
                                    }
                                } if (localTargetSubscrNoResetsTracker){
                                    if (localTargetSubscrNoResets==null){

                                        writeStartElement(null, "", "targetSubscrNoResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetSubscrNoResets.serialize(new javax.xml.namespace.QName("","targetSubscrNoResets"),
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
                                } if (localUserSubscrNoTracker){
                                    if (localUserSubscrNo==null){

                                        writeStartElement(null, "", "userSubscrNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUserSubscrNo.serialize(new javax.xml.namespace.QName("","userSubscrNo"),
                                        xmlWriter);
                                    }
                                } if (localUserSubscrNoResetsTracker){
                                    if (localUserSubscrNoResets==null){

                                        writeStartElement(null, "", "userSubscrNoResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUserSubscrNoResets.serialize(new javax.xml.namespace.QName("","userSubscrNoResets"),
                                        xmlWriter);
                                    }
                                } if (localBalancesTracker){
                                       if (localBalances!=null){
                                            for (int i = 0;i < localBalances.length;i++){
                                                if (localBalances[i] != null){
                                                 localBalances[i].serialize(new javax.xml.namespace.QName("","balances"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "balances", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "balances", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localAccumulatorsTracker){
                                       if (localAccumulators!=null){
                                            for (int i = 0;i < localAccumulators.length;i++){
                                                if (localAccumulators[i] != null){
                                                 localAccumulators[i].serialize(new javax.xml.namespace.QName("","accumulators"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "accumulators", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "accumulators", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","reservationObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountInternalId"));
                            
                            
                                    elementList.add(localAccountInternalId==null?null:
                                    localAccountInternalId);
                                } if (localCrnTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "crn"));
                            
                            
                                    if (localCrn==null){
                                         throw new org.apache.axis2.databinding.ADBException("crn cannot be null!!");
                                    }
                                    elementList.add(localCrn);
                                } if (localProcessNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "processName"));
                            
                            
                                    if (localProcessName==null){
                                         throw new org.apache.axis2.databinding.ADBException("processName cannot be null!!");
                                    }
                                    elementList.add(localProcessName);
                                } if (localReservationIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "reservationId"));
                            
                            
                                    elementList.add(localReservationId==null?null:
                                    localReservationId);
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
                                } if (localSluNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "sluName"));
                            
                            
                                    if (localSluName==null){
                                         throw new org.apache.axis2.databinding.ADBException("sluName cannot be null!!");
                                    }
                                    elementList.add(localSluName);
                                } if (localActivityStartTimeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activityStartTime"));
                            
                            
                                    if (localActivityStartTime==null){
                                         throw new org.apache.axis2.databinding.ADBException("activityStartTime cannot be null!!");
                                    }
                                    elementList.add(localActivityStartTime);
                                } if (localAssumeConsumptionTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "assumeConsumption"));
                            
                            
                                    if (localAssumeConsumption==null){
                                         throw new org.apache.axis2.databinding.ADBException("assumeConsumption cannot be null!!");
                                    }
                                    elementList.add(localAssumeConsumption);
                                } if (localCalledNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "calledNumber"));
                            
                            
                                    elementList.add(localCalledNumber==null?null:
                                    localCalledNumber);
                                } if (localConsUsageTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "consUsage"));
                            
                            
                                    if (localConsUsage==null){
                                         throw new org.apache.axis2.databinding.ADBException("consUsage cannot be null!!");
                                    }
                                    elementList.add(localConsUsage);
                                } if (localDiscountItemIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "discountItemId"));
                            
                            
                                    elementList.add(localDiscountItemId==null?null:
                                    localDiscountItemId);
                                } if (localFinalAutIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "finalAutId"));
                            
                            
                                    if (localFinalAutId==null){
                                         throw new org.apache.axis2.databinding.ADBException("finalAutId cannot be null!!");
                                    }
                                    elementList.add(localFinalAutId);
                                } if (localFundUsageTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "fundUsageType"));
                            
                            
                                    elementList.add(localFundUsageType==null?null:
                                    localFundUsageType);
                                } if (localGroupAccountInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "groupAccountInfo"));
                            
                            
                                    elementList.add(localGroupAccountInfo==null?null:
                                    localGroupAccountInfo);
                                } if (localGroupAccountTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "groupAccountType"));
                            
                            
                                    elementList.add(localGroupAccountType==null?null:
                                    localGroupAccountType);
                                } if (localInitialTimeTypeIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "initialTimeTypeId"));
                            
                            
                                    elementList.add(localInitialTimeTypeId==null?null:
                                    localInitialTimeTypeId);
                                } if (localLiabilityRedirectIndicatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "liabilityRedirectIndicator"));
                            
                            
                                    elementList.add(localLiabilityRedirectIndicator==null?null:
                                    localLiabilityRedirectIndicator);
                                } if (localLocationIndicatorPartyATracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "locationIndicatorPartyA"));
                            
                            
                                    elementList.add(localLocationIndicatorPartyA==null?null:
                                    localLocationIndicatorPartyA);
                                } if (localLocationIndicatorPartyBTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "locationIndicatorPartyB"));
                            
                            
                                    elementList.add(localLocationIndicatorPartyB==null?null:
                                    localLocationIndicatorPartyB);
                                } if (localLrCallTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lrCallType"));
                            
                            
                                    elementList.add(localLrCallType==null?null:
                                    localLrCallType);
                                } if (localParentAccountConversionRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountConversionRate"));
                            
                            
                                    elementList.add(localParentAccountConversionRate==null?null:
                                    localParentAccountConversionRate);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    elementList.add(localParentAccountInternalId==null?null:
                                    localParentAccountInternalId);
                                } if (localParentAccountIsoCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountIsoCode"));
                            
                            
                                    elementList.add(localParentAccountIsoCode==null?null:
                                    localParentAccountIsoCode);
                                } if (localParentAccountTotConsTmlTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountTotConsTml"));
                            
                            
                                    elementList.add(localParentAccountTotConsTml==null?null:
                                    localParentAccountTotConsTml);
                                } if (localParentAccountTotReservTmlTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountTotReservTml"));
                            
                            
                                    elementList.add(localParentAccountTotReservTml==null?null:
                                    localParentAccountTotReservTml);
                                } if (localPrimaryOfferIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "primaryOfferId"));
                            
                            
                                    elementList.add(localPrimaryOfferId==null?null:
                                    localPrimaryOfferId);
                                } if (localResellerVersionIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "resellerVersionId"));
                            
                            
                                    elementList.add(localResellerVersionId==null?null:
                                    localResellerVersionId);
                                } if (localReservationEndTimeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "reservationEndTime"));
                            
                            
                                    if (localReservationEndTime==null){
                                         throw new org.apache.axis2.databinding.ADBException("reservationEndTime cannot be null!!");
                                    }
                                    elementList.add(localReservationEndTime);
                                } if (localServiceTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceType"));
                            
                            
                                    if (localServiceType==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceType cannot be null!!");
                                    }
                                    elementList.add(localServiceType);
                                } if (localSettlementChargeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "settlementCharge"));
                            
                            
                                    elementList.add(localSettlementCharge==null?null:
                                    localSettlementCharge);
                                } if (localSettlementRecordFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "settlementRecordFlag"));
                            
                            
                                    elementList.add(localSettlementRecordFlag==null?null:
                                    localSettlementRecordFlag);
                                } if (localSubscriberIsoCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subscriberIsoCode"));
                            
                            
                                    elementList.add(localSubscriberIsoCode==null?null:
                                    localSubscriberIsoCode);
                                } if (localTargetAccountConversionRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountConversionRate"));
                            
                            
                                    elementList.add(localTargetAccountConversionRate==null?null:
                                    localTargetAccountConversionRate);
                                } if (localTargetAccountIsoCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountIsoCode"));
                            
                            
                                    elementList.add(localTargetAccountIsoCode==null?null:
                                    localTargetAccountIsoCode);
                                } if (localTargetAccountNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountNo"));
                            
                            
                                    elementList.add(localTargetAccountNo==null?null:
                                    localTargetAccountNo);
                                } if (localTargetAccountReserveTmlTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountReserveTml"));
                            
                            
                                    elementList.add(localTargetAccountReserveTml==null?null:
                                    localTargetAccountReserveTml);
                                } if (localTargetSubscrNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetSubscrNo"));
                            
                            
                                    elementList.add(localTargetSubscrNo==null?null:
                                    localTargetSubscrNo);
                                } if (localTargetSubscrNoResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetSubscrNoResets"));
                            
                            
                                    elementList.add(localTargetSubscrNoResets==null?null:
                                    localTargetSubscrNoResets);
                                } if (localTimezoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "timezone"));
                            
                            
                                    elementList.add(localTimezone==null?null:
                                    localTimezone);
                                } if (localUserSubscrNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "userSubscrNo"));
                            
                            
                                    elementList.add(localUserSubscrNo==null?null:
                                    localUserSubscrNo);
                                } if (localUserSubscrNoResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "userSubscrNoResets"));
                            
                            
                                    elementList.add(localUserSubscrNoResets==null?null:
                                    localUserSubscrNoResets);
                                } if (localBalancesTracker){
                             if (localBalances!=null) {
                                 for (int i = 0;i < localBalances.length;i++){

                                    if (localBalances[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "balances"));
                                         elementList.add(localBalances[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "balances"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "balances"));
                                        elementList.add(localBalances);
                                    
                             }

                        } if (localAccumulatorsTracker){
                             if (localAccumulators!=null) {
                                 for (int i = 0;i < localAccumulators.length;i++){

                                    if (localAccumulators[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulators"));
                                         elementList.add(localAccumulators[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulators"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulators"));
                                        elementList.add(localAccumulators);
                                    
                             }

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
        public static ReservationObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ReservationObject object =
                new ReservationObject();

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
                    
                            if (!"reservationObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ReservationObject)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list44 = new java.util.ArrayList();
                    
                        java.util.ArrayList list45 = new java.util.ArrayList();
                    
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccountInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","crn").equals(reader.getName())){
                                
                                                object.setCrn(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","processName").equals(reader.getName())){
                                
                                                object.setProcessName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","reservationId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setReservationId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setReservationId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sluName").equals(reader.getName())){
                                
                                                object.setSluName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","activityStartTime").equals(reader.getName())){
                                
                                                object.setActivityStartTime(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","assumeConsumption").equals(reader.getName())){
                                
                                                object.setAssumeConsumption(com.comverse.www.CharacterAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","calledNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCalledNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCalledNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","consUsage").equals(reader.getName())){
                                
                                                object.setConsUsage(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","discountItemId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDiscountItemId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDiscountItemId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","finalAutId").equals(reader.getName())){
                                
                                                object.setFinalAutId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","fundUsageType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFundUsageType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFundUsageType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","groupAccountInfo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGroupAccountInfo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGroupAccountInfo(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","initialTimeTypeId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInitialTimeTypeId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInitialTimeTypeId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","liabilityRedirectIndicator").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLiabilityRedirectIndicator(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLiabilityRedirectIndicator(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","locationIndicatorPartyA").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLocationIndicatorPartyA(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLocationIndicatorPartyA(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","locationIndicatorPartyB").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLocationIndicatorPartyB(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLocationIndicatorPartyB(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lrCallType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLrCallType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLrCallType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountConversionRate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentAccountConversionRate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentAccountConversionRate(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentAccountInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountIsoCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentAccountIsoCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentAccountIsoCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountTotConsTml").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentAccountTotConsTml(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentAccountTotConsTml(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountTotReservTml").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentAccountTotReservTml(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentAccountTotReservTml(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","primaryOfferId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrimaryOfferId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrimaryOfferId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","resellerVersionId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setResellerVersionId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setResellerVersionId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","reservationEndTime").equals(reader.getName())){
                                
                                                object.setReservationEndTime(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceType").equals(reader.getName())){
                                
                                                object.setServiceType(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","settlementCharge").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSettlementCharge(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSettlementCharge(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","settlementRecordFlag").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSettlementRecordFlag(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSettlementRecordFlag(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberIsoCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSubscriberIsoCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSubscriberIsoCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetAccountConversionRate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetAccountConversionRate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetAccountConversionRate(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetAccountIsoCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetAccountIsoCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetAccountIsoCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetAccountReserveTml").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetAccountReserveTml(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetAccountReserveTml(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetSubscrNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetSubscrNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetSubscrNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetSubscrNoResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetSubscrNoResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetSubscrNoResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","userSubscrNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUserSubscrNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUserSubscrNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","userSubscrNoResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUserSubscrNoResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUserSubscrNoResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balances").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list44.add(null);
                                                              reader.next();
                                                          } else {
                                                        list44.add(com.comverse.www.ReservationBalanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone44 = false;
                                                        while(!loopDone44){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone44 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","balances").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list44.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list44.add(com.comverse.www.ReservationBalanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone44 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBalances((com.comverse.www.ReservationBalanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.ReservationBalanceObject.class,
                                                                list44));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accumulators").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list45.add(null);
                                                              reader.next();
                                                          } else {
                                                        list45.add(com.comverse.www.ReservationAccumulatorObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone45 = false;
                                                        while(!loopDone45){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone45 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","accumulators").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list45.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list45.add(com.comverse.www.ReservationAccumulatorObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone45 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAccumulators((com.comverse.www.ReservationAccumulatorObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.ReservationAccumulatorObject.class,
                                                                list45));
                                                            
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
           
    