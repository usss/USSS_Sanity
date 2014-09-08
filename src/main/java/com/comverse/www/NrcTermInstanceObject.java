
/**
 * NrcTermInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  NrcTermInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NrcTermInstanceObject extends com.comverse.www.NrcTermInstanceIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = nrcTermInstanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Annotation
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAnnotation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotationTracker = false ;

                           public boolean isAnnotationSpecified(){
                               return localAnnotationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAnnotation(){
                               return localAnnotation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotation
                               */
                               public void setAnnotation(com.comverse.www.StringAttributeJAXBElement param){
                            localAnnotationTracker = true;
                                   
                                            this.localAnnotation=param;
                                    

                               }
                            

                        /**
                        * field for Annotation2
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localAnnotation2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnnotation2Tracker = false ;

                           public boolean isAnnotation2Specified(){
                               return localAnnotation2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getAnnotation2(){
                               return localAnnotation2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Annotation2
                               */
                               public void setAnnotation2(com.comverse.www.StringAttributeJAXBElement param){
                            localAnnotation2Tracker = true;
                                   
                                            this.localAnnotation2=param;
                                    

                               }
                            

                        /**
                        * field for ApplyDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localApplyDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localApplyDateTracker = false ;

                           public boolean isApplyDateSpecified(){
                               return localApplyDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getApplyDate(){
                               return localApplyDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApplyDate
                               */
                               public void setApplyDate(com.comverse.www.DateAttributeJAXBElement param){
                            localApplyDateTracker = true;
                                   
                                            this.localApplyDate=param;
                                    

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
                        * field for AssociationType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localAssociationType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssociationTypeTracker = false ;

                           public boolean isAssociationTypeSpecified(){
                               return localAssociationTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getAssociationType(){
                               return localAssociationType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssociationType
                               */
                               public void setAssociationType(com.comverse.www.ShortAttributeJAXBElement param){
                            localAssociationTypeTracker = param != null;
                                   
                                            this.localAssociationType=param;
                                    

                               }
                            

                        /**
                        * field for AutoActivation
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localAutoActivation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAutoActivationTracker = false ;

                           public boolean isAutoActivationSpecified(){
                               return localAutoActivationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getAutoActivation(){
                               return localAutoActivation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoActivation
                               */
                               public void setAutoActivation(com.comverse.www.ShortAttributeJAXBElement param){
                            localAutoActivationTracker = param != null;
                                   
                                            this.localAutoActivation=param;
                                    

                               }
                            

                        /**
                        * field for BillOrderNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBillOrderNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillOrderNumberTracker = false ;

                           public boolean isBillOrderNumberSpecified(){
                               return localBillOrderNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBillOrderNumber(){
                               return localBillOrderNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillOrderNumber
                               */
                               public void setBillOrderNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localBillOrderNumberTracker = true;
                                   
                                            this.localBillOrderNumber=param;
                                    

                               }
                            

                        /**
                        * field for BillingAccountInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localBillingAccountInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillingAccountInternalIdTracker = false ;

                           public boolean isBillingAccountInternalIdSpecified(){
                               return localBillingAccountInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getBillingAccountInternalId(){
                               return localBillingAccountInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillingAccountInternalId
                               */
                               public void setBillingAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localBillingAccountInternalIdTracker = param != null;
                                   
                                            this.localBillingAccountInternalId=param;
                                    

                               }
                            

                        /**
                        * field for BundleInstId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localBundleInstId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleInstIdTracker = false ;

                           public boolean isBundleInstIdSpecified(){
                               return localBundleInstIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getBundleInstId(){
                               return localBundleInstId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleInstId
                               */
                               public void setBundleInstId(com.comverse.www.LongAttributeJAXBElement param){
                            localBundleInstIdTracker = true;
                                   
                                            this.localBundleInstId=param;
                                    

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
                        * field for CityTax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localCityTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCityTaxTracker = false ;

                           public boolean isCityTaxSpecified(){
                               return localCityTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getCityTax(){
                               return localCityTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CityTax
                               */
                               public void setCityTax(com.comverse.www.NumericAttributeJAXBElement param){
                            localCityTaxTracker = true;
                                   
                                            this.localCityTax=param;
                                    

                               }
                            

                        /**
                        * field for CountyTax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localCountyTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountyTaxTracker = false ;

                           public boolean isCountyTaxSpecified(){
                               return localCountyTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getCountyTax(){
                               return localCountyTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CountyTax
                               */
                               public void setCountyTax(com.comverse.www.NumericAttributeJAXBElement param){
                            localCountyTaxTracker = true;
                                   
                                            this.localCountyTax=param;
                                    

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
                        * field for CurrentInstallment
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localCurrentInstallment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrentInstallmentTracker = false ;

                           public boolean isCurrentInstallmentSpecified(){
                               return localCurrentInstallmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getCurrentInstallment(){
                               return localCurrentInstallment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrentInstallment
                               */
                               public void setCurrentInstallment(com.comverse.www.ShortAttributeJAXBElement param){
                            localCurrentInstallmentTracker = param != null;
                                   
                                            this.localCurrentInstallment=param;
                                    

                               }
                            

                        /**
                        * field for CustomerOrderNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localCustomerOrderNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomerOrderNumberTracker = false ;

                           public boolean isCustomerOrderNumberSpecified(){
                               return localCustomerOrderNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getCustomerOrderNumber(){
                               return localCustomerOrderNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerOrderNumber
                               */
                               public void setCustomerOrderNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localCustomerOrderNumberTracker = true;
                                   
                                            this.localCustomerOrderNumber=param;
                                    

                               }
                            

                        /**
                        * field for DateNrcJournalable
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localDateNrcJournalable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateNrcJournalableTracker = false ;

                           public boolean isDateNrcJournalableSpecified(){
                               return localDateNrcJournalableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getDateNrcJournalable(){
                               return localDateNrcJournalable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateNrcJournalable
                               */
                               public void setDateNrcJournalable(com.comverse.www.DateAttributeJAXBElement param){
                            localDateNrcJournalableTracker = true;
                                   
                                            this.localDateNrcJournalable=param;
                                    

                               }
                            

                        /**
                        * field for FederalTax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localFederalTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFederalTaxTracker = false ;

                           public boolean isFederalTaxSpecified(){
                               return localFederalTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getFederalTax(){
                               return localFederalTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FederalTax
                               */
                               public void setFederalTax(com.comverse.www.NumericAttributeJAXBElement param){
                            localFederalTaxTracker = true;
                                   
                                            this.localFederalTax=param;
                                    

                               }
                            

                        /**
                        * field for FlexibleCycleDuration
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localFlexibleCycleDuration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFlexibleCycleDurationTracker = false ;

                           public boolean isFlexibleCycleDurationSpecified(){
                               return localFlexibleCycleDurationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getFlexibleCycleDuration(){
                               return localFlexibleCycleDuration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FlexibleCycleDuration
                               */
                               public void setFlexibleCycleDuration(com.comverse.www.ShortAttributeJAXBElement param){
                            localFlexibleCycleDurationTracker = true;
                                   
                                            this.localFlexibleCycleDuration=param;
                                    

                               }
                            

                        /**
                        * field for GeoAreaId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localGeoAreaId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeoAreaIdTracker = false ;

                           public boolean isGeoAreaIdSpecified(){
                               return localGeoAreaIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getGeoAreaId(){
                               return localGeoAreaId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeoAreaId
                               */
                               public void setGeoAreaId(com.comverse.www.ShortAttributeJAXBElement param){
                            localGeoAreaIdTracker = true;
                                   
                                            this.localGeoAreaId=param;
                                    

                               }
                            

                        /**
                        * field for InventoryId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localInventoryId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInventoryIdTracker = false ;

                           public boolean isInventoryIdSpecified(){
                               return localInventoryIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getInventoryId(){
                               return localInventoryId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InventoryId
                               */
                               public void setInventoryId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localInventoryIdTracker = true;
                                   
                                            this.localInventoryId=param;
                                    

                               }
                            

                        /**
                        * field for InventoryIdResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localInventoryIdResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInventoryIdResetsTracker = false ;

                           public boolean isInventoryIdResetsSpecified(){
                               return localInventoryIdResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getInventoryIdResets(){
                               return localInventoryIdResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InventoryIdResets
                               */
                               public void setInventoryIdResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localInventoryIdResetsTracker = true;
                                   
                                            this.localInventoryIdResets=param;
                                    

                               }
                            

                        /**
                        * field for LastProcessedDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastProcessedDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastProcessedDtTracker = false ;

                           public boolean isLastProcessedDtSpecified(){
                               return localLastProcessedDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastProcessedDt(){
                               return localLastProcessedDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastProcessedDt
                               */
                               public void setLastProcessedDt(com.comverse.www.DateAttributeJAXBElement param){
                            localLastProcessedDtTracker = param != null;
                                   
                                            this.localLastProcessedDt=param;
                                    

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
                        * field for NrcCategory
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localNrcCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNrcCategoryTracker = false ;

                           public boolean isNrcCategorySpecified(){
                               return localNrcCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getNrcCategory(){
                               return localNrcCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NrcCategory
                               */
                               public void setNrcCategory(com.comverse.www.ShortAttributeJAXBElement param){
                            localNrcCategoryTracker = param != null;
                                   
                                            this.localNrcCategory=param;
                                    

                               }
                            

                        /**
                        * field for NrcTermId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localNrcTermId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNrcTermIdTracker = false ;

                           public boolean isNrcTermIdSpecified(){
                               return localNrcTermIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getNrcTermId(){
                               return localNrcTermId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NrcTermId
                               */
                               public void setNrcTermId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localNrcTermIdTracker = param != null;
                                   
                                            this.localNrcTermId=param;
                                    

                               }
                            

                        /**
                        * field for OfferInstId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localOfferInstId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOfferInstIdTracker = false ;

                           public boolean isOfferInstIdSpecified(){
                               return localOfferInstIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getOfferInstId(){
                               return localOfferInstId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferInstId
                               */
                               public void setOfferInstId(com.comverse.www.LongAttributeJAXBElement param){
                            localOfferInstIdTracker = true;
                                   
                                            this.localOfferInstId=param;
                                    

                               }
                            

                        /**
                        * field for OrderNumber
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localOrderNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrderNumberTracker = false ;

                           public boolean isOrderNumberSpecified(){
                               return localOrderNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getOrderNumber(){
                               return localOrderNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrderNumber
                               */
                               public void setOrderNumber(com.comverse.www.StringAttributeJAXBElement param){
                            localOrderNumberTracker = true;
                                   
                                            this.localOrderNumber=param;
                                    

                               }
                            

                        /**
                        * field for OtherTax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localOtherTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOtherTaxTracker = false ;

                           public boolean isOtherTaxSpecified(){
                               return localOtherTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getOtherTax(){
                               return localOtherTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherTax
                               */
                               public void setOtherTax(com.comverse.www.NumericAttributeJAXBElement param){
                            localOtherTaxTracker = true;
                                   
                                            this.localOtherTax=param;
                                    

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
                        * field for ParentServiceInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localParentServiceInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentServiceInternalIdTracker = false ;

                           public boolean isParentServiceInternalIdSpecified(){
                               return localParentServiceInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getParentServiceInternalId(){
                               return localParentServiceInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentServiceInternalId
                               */
                               public void setParentServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localParentServiceInternalIdTracker = true;
                                   
                                            this.localParentServiceInternalId=param;
                                    

                               }
                            

                        /**
                        * field for ParentServiceInternalIdResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localParentServiceInternalIdResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentServiceInternalIdResetsTracker = false ;

                           public boolean isParentServiceInternalIdResetsSpecified(){
                               return localParentServiceInternalIdResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getParentServiceInternalIdResets(){
                               return localParentServiceInternalIdResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentServiceInternalIdResets
                               */
                               public void setParentServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localParentServiceInternalIdResetsTracker = true;
                                   
                                            this.localParentServiceInternalIdResets=param;
                                    

                               }
                            

                        /**
                        * field for PostActiveChgApplied
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localPostActiveChgApplied ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPostActiveChgAppliedTracker = false ;

                           public boolean isPostActiveChgAppliedSpecified(){
                               return localPostActiveChgAppliedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getPostActiveChgApplied(){
                               return localPostActiveChgApplied;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PostActiveChgApplied
                               */
                               public void setPostActiveChgApplied(com.comverse.www.BooleanAttributeJAXBElement param){
                            localPostActiveChgAppliedTracker = param != null;
                                   
                                            this.localPostActiveChgApplied=param;
                                    

                               }
                            

                        /**
                        * field for ProcessErrorCode
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localProcessErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessErrorCodeTracker = false ;

                           public boolean isProcessErrorCodeSpecified(){
                               return localProcessErrorCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getProcessErrorCode(){
                               return localProcessErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessErrorCode
                               */
                               public void setProcessErrorCode(com.comverse.www.IntegerAttributeJAXBElement param){
                            localProcessErrorCodeTracker = true;
                                   
                                            this.localProcessErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ProcessingStatus
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProcessingStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessingStatusTracker = false ;

                           public boolean isProcessingStatusSpecified(){
                               return localProcessingStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProcessingStatus(){
                               return localProcessingStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessingStatus
                               */
                               public void setProcessingStatus(com.comverse.www.ShortAttributeJAXBElement param){
                            localProcessingStatusTracker = param != null;
                                   
                                            this.localProcessingStatus=param;
                                    

                               }
                            

                        /**
                        * field for ProfileId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localProfileId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileIdTracker = false ;

                           public boolean isProfileIdSpecified(){
                               return localProfileIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getProfileId(){
                               return localProfileId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileId
                               */
                               public void setProfileId(com.comverse.www.LongAttributeJAXBElement param){
                            localProfileIdTracker = true;
                                   
                                            this.localProfileId=param;
                                    

                               }
                            

                        /**
                        * field for Rate
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateTracker = false ;

                           public boolean isRateSpecified(){
                               return localRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getRate(){
                               return localRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rate
                               */
                               public void setRate(com.comverse.www.NumericAttributeJAXBElement param){
                            localRateTracker = true;
                                   
                                            this.localRate=param;
                                    

                               }
                            

                        /**
                        * field for RateDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localRateDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateDtTracker = false ;

                           public boolean isRateDtSpecified(){
                               return localRateDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getRateDt(){
                               return localRateDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateDt
                               */
                               public void setRateDt(com.comverse.www.DateAttributeJAXBElement param){
                            localRateDtTracker = param != null;
                                   
                                            this.localRateDt=param;
                                    

                               }
                            

                        /**
                        * field for RedirectAccountNo
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localRedirectAccountNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRedirectAccountNoTracker = false ;

                           public boolean isRedirectAccountNoSpecified(){
                               return localRedirectAccountNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getRedirectAccountNo(){
                               return localRedirectAccountNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RedirectAccountNo
                               */
                               public void setRedirectAccountNo(com.comverse.www.IntegerAttributeJAXBElement param){
                            localRedirectAccountNoTracker = true;
                                   
                                            this.localRedirectAccountNo=param;
                                    

                               }
                            

                        /**
                        * field for RedirectInactiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localRedirectInactiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRedirectInactiveDtTracker = false ;

                           public boolean isRedirectInactiveDtSpecified(){
                               return localRedirectInactiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getRedirectInactiveDt(){
                               return localRedirectInactiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RedirectInactiveDt
                               */
                               public void setRedirectInactiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localRedirectInactiveDtTracker = true;
                                   
                                            this.localRedirectInactiveDt=param;
                                    

                               }
                            

                        /**
                        * field for RedirectType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRedirectType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRedirectTypeTracker = false ;

                           public boolean isRedirectTypeSpecified(){
                               return localRedirectTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRedirectType(){
                               return localRedirectType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RedirectType
                               */
                               public void setRedirectType(com.comverse.www.ShortAttributeJAXBElement param){
                            localRedirectTypeTracker = param != null;
                                   
                                            this.localRedirectType=param;
                                    

                               }
                            

                        /**
                        * field for RetryCount
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRetryCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRetryCountTracker = false ;

                           public boolean isRetryCountSpecified(){
                               return localRetryCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRetryCount(){
                               return localRetryCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RetryCount
                               */
                               public void setRetryCount(com.comverse.www.ShortAttributeJAXBElement param){
                            localRetryCountTracker = param != null;
                                   
                                            this.localRetryCount=param;
                                    

                               }
                            

                        /**
                        * field for SalesChannelId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localSalesChannelId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSalesChannelIdTracker = false ;

                           public boolean isSalesChannelIdSpecified(){
                               return localSalesChannelIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getSalesChannelId(){
                               return localSalesChannelId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SalesChannelId
                               */
                               public void setSalesChannelId(com.comverse.www.ShortAttributeJAXBElement param){
                            localSalesChannelIdTracker = true;
                                   
                                            this.localSalesChannelId=param;
                                    

                               }
                            

                        /**
                        * field for ShipFromGeocode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localShipFromGeocode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShipFromGeocodeTracker = false ;

                           public boolean isShipFromGeocodeSpecified(){
                               return localShipFromGeocodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getShipFromGeocode(){
                               return localShipFromGeocode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShipFromGeocode
                               */
                               public void setShipFromGeocode(com.comverse.www.StringAttributeJAXBElement param){
                            localShipFromGeocodeTracker = true;
                                   
                                            this.localShipFromGeocode=param;
                                    

                               }
                            

                        /**
                        * field for ShipToGeocode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localShipToGeocode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localShipToGeocodeTracker = false ;

                           public boolean isShipToGeocodeSpecified(){
                               return localShipToGeocodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getShipToGeocode(){
                               return localShipToGeocode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ShipToGeocode
                               */
                               public void setShipToGeocode(com.comverse.www.StringAttributeJAXBElement param){
                            localShipToGeocodeTracker = true;
                                   
                                            this.localShipToGeocode=param;
                                    

                               }
                            

                        /**
                        * field for StateTax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localStateTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateTaxTracker = false ;

                           public boolean isStateTaxSpecified(){
                               return localStateTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getStateTax(){
                               return localStateTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateTax
                               */
                               public void setStateTax(com.comverse.www.NumericAttributeJAXBElement param){
                            localStateTaxTracker = true;
                                   
                                            this.localStateTax=param;
                                    

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
                        * field for TargetRatingServerId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTargetRatingServerId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetRatingServerIdTracker = false ;

                           public boolean isTargetRatingServerIdSpecified(){
                               return localTargetRatingServerIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTargetRatingServerId(){
                               return localTargetRatingServerId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetRatingServerId
                               */
                               public void setTargetRatingServerId(com.comverse.www.ShortAttributeJAXBElement param){
                            localTargetRatingServerIdTracker = true;
                                   
                                            this.localTargetRatingServerId=param;
                                    

                               }
                            

                        /**
                        * field for TargetServerId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTargetServerId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetServerIdTracker = false ;

                           public boolean isTargetServerIdSpecified(){
                               return localTargetServerIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTargetServerId(){
                               return localTargetServerId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetServerId
                               */
                               public void setTargetServerId(com.comverse.www.ShortAttributeJAXBElement param){
                            localTargetServerIdTracker = true;
                                   
                                            this.localTargetServerId=param;
                                    

                               }
                            

                        /**
                        * field for TaxPkgInstId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localTaxPkgInstId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxPkgInstIdTracker = false ;

                           public boolean isTaxPkgInstIdSpecified(){
                               return localTaxPkgInstIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getTaxPkgInstId(){
                               return localTaxPkgInstId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxPkgInstId
                               */
                               public void setTaxPkgInstId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localTaxPkgInstIdTracker = true;
                                   
                                            this.localTaxPkgInstId=param;
                                    

                               }
                            

                        /**
                        * field for TaxTypeCode
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localTaxTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxTypeCodeTracker = false ;

                           public boolean isTaxTypeCodeSpecified(){
                               return localTaxTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getTaxTypeCode(){
                               return localTaxTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxTypeCode
                               */
                               public void setTaxTypeCode(com.comverse.www.IntegerAttributeJAXBElement param){
                            localTaxTypeCodeTracker = true;
                                   
                                            this.localTaxTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for TotalInstallments
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTotalInstallments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalInstallmentsTracker = false ;

                           public boolean isTotalInstallmentsSpecified(){
                               return localTotalInstallmentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTotalInstallments(){
                               return localTotalInstallments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalInstallments
                               */
                               public void setTotalInstallments(com.comverse.www.ShortAttributeJAXBElement param){
                            localTotalInstallmentsTracker = param != null;
                                   
                                            this.localTotalInstallments=param;
                                    

                               }
                            

                        /**
                        * field for TransactDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localTransactDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactDateTracker = false ;

                           public boolean isTransactDateSpecified(){
                               return localTransactDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getTransactDate(){
                               return localTransactDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactDate
                               */
                               public void setTransactDate(com.comverse.www.DateAttributeJAXBElement param){
                            localTransactDateTracker = param != null;
                                   
                                            this.localTransactDate=param;
                                    

                               }
                            

                        /**
                        * field for UseCode
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localUseCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUseCodeTracker = false ;

                           public boolean isUseCodeSpecified(){
                               return localUseCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getUseCode(){
                               return localUseCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseCode
                               */
                               public void setUseCode(com.comverse.www.ShortAttributeJAXBElement param){
                            localUseCodeTracker = true;
                                   
                                            this.localUseCode=param;
                                    

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
                           namespacePrefix+":nrcTermInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "nrcTermInstanceObject",
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
                              if (localNrcTermInstIdTracker){
                                            if (localNrcTermInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nrcTermInstId cannot be null!!");
                                            }
                                           localNrcTermInstId.serialize(new javax.xml.namespace.QName("","nrcTermInstId"),
                                               xmlWriter);
                                        } if (localAnnotationTracker){
                                    if (localAnnotation==null){

                                        writeStartElement(null, "", "annotation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAnnotation.serialize(new javax.xml.namespace.QName("","annotation"),
                                        xmlWriter);
                                    }
                                } if (localAnnotation2Tracker){
                                    if (localAnnotation2==null){

                                        writeStartElement(null, "", "annotation2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAnnotation2.serialize(new javax.xml.namespace.QName("","annotation2"),
                                        xmlWriter);
                                    }
                                } if (localApplyDateTracker){
                                    if (localApplyDate==null){

                                        writeStartElement(null, "", "applyDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localApplyDate.serialize(new javax.xml.namespace.QName("","applyDate"),
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
                                } if (localAssociationTypeTracker){
                                            if (localAssociationType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("associationType cannot be null!!");
                                            }
                                           localAssociationType.serialize(new javax.xml.namespace.QName("","associationType"),
                                               xmlWriter);
                                        } if (localAutoActivationTracker){
                                            if (localAutoActivation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("autoActivation cannot be null!!");
                                            }
                                           localAutoActivation.serialize(new javax.xml.namespace.QName("","autoActivation"),
                                               xmlWriter);
                                        } if (localBillOrderNumberTracker){
                                    if (localBillOrderNumber==null){

                                        writeStartElement(null, "", "billOrderNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillOrderNumber.serialize(new javax.xml.namespace.QName("","billOrderNumber"),
                                        xmlWriter);
                                    }
                                } if (localBillingAccountInternalIdTracker){
                                            if (localBillingAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("billingAccountInternalId cannot be null!!");
                                            }
                                           localBillingAccountInternalId.serialize(new javax.xml.namespace.QName("","billingAccountInternalId"),
                                               xmlWriter);
                                        } if (localBundleInstIdTracker){
                                    if (localBundleInstId==null){

                                        writeStartElement(null, "", "bundleInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBundleInstId.serialize(new javax.xml.namespace.QName("","bundleInstId"),
                                        xmlWriter);
                                    }
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
                                        } if (localCityTaxTracker){
                                    if (localCityTax==null){

                                        writeStartElement(null, "", "cityTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCityTax.serialize(new javax.xml.namespace.QName("","cityTax"),
                                        xmlWriter);
                                    }
                                } if (localCountyTaxTracker){
                                    if (localCountyTax==null){

                                        writeStartElement(null, "", "countyTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCountyTax.serialize(new javax.xml.namespace.QName("","countyTax"),
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
                                } if (localCurrentInstallmentTracker){
                                            if (localCurrentInstallment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currentInstallment cannot be null!!");
                                            }
                                           localCurrentInstallment.serialize(new javax.xml.namespace.QName("","currentInstallment"),
                                               xmlWriter);
                                        } if (localCustomerOrderNumberTracker){
                                    if (localCustomerOrderNumber==null){

                                        writeStartElement(null, "", "customerOrderNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustomerOrderNumber.serialize(new javax.xml.namespace.QName("","customerOrderNumber"),
                                        xmlWriter);
                                    }
                                } if (localDateNrcJournalableTracker){
                                    if (localDateNrcJournalable==null){

                                        writeStartElement(null, "", "dateNrcJournalable", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDateNrcJournalable.serialize(new javax.xml.namespace.QName("","dateNrcJournalable"),
                                        xmlWriter);
                                    }
                                } if (localFederalTaxTracker){
                                    if (localFederalTax==null){

                                        writeStartElement(null, "", "federalTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFederalTax.serialize(new javax.xml.namespace.QName("","federalTax"),
                                        xmlWriter);
                                    }
                                } if (localFlexibleCycleDurationTracker){
                                    if (localFlexibleCycleDuration==null){

                                        writeStartElement(null, "", "flexibleCycleDuration", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFlexibleCycleDuration.serialize(new javax.xml.namespace.QName("","flexibleCycleDuration"),
                                        xmlWriter);
                                    }
                                } if (localGeoAreaIdTracker){
                                    if (localGeoAreaId==null){

                                        writeStartElement(null, "", "geoAreaId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGeoAreaId.serialize(new javax.xml.namespace.QName("","geoAreaId"),
                                        xmlWriter);
                                    }
                                } if (localInventoryIdTracker){
                                    if (localInventoryId==null){

                                        writeStartElement(null, "", "inventoryId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInventoryId.serialize(new javax.xml.namespace.QName("","inventoryId"),
                                        xmlWriter);
                                    }
                                } if (localInventoryIdResetsTracker){
                                    if (localInventoryIdResets==null){

                                        writeStartElement(null, "", "inventoryIdResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInventoryIdResets.serialize(new javax.xml.namespace.QName("","inventoryIdResets"),
                                        xmlWriter);
                                    }
                                } if (localLastProcessedDtTracker){
                                            if (localLastProcessedDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("lastProcessedDt cannot be null!!");
                                            }
                                           localLastProcessedDt.serialize(new javax.xml.namespace.QName("","lastProcessedDt"),
                                               xmlWriter);
                                        } if (localNoBillTracker){
                                            if (localNoBill==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                            }
                                           localNoBill.serialize(new javax.xml.namespace.QName("","noBill"),
                                               xmlWriter);
                                        } if (localNrcCategoryTracker){
                                            if (localNrcCategory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nrcCategory cannot be null!!");
                                            }
                                           localNrcCategory.serialize(new javax.xml.namespace.QName("","nrcCategory"),
                                               xmlWriter);
                                        } if (localNrcTermIdTracker){
                                            if (localNrcTermId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("nrcTermId cannot be null!!");
                                            }
                                           localNrcTermId.serialize(new javax.xml.namespace.QName("","nrcTermId"),
                                               xmlWriter);
                                        } if (localOfferInstIdTracker){
                                    if (localOfferInstId==null){

                                        writeStartElement(null, "", "offerInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOfferInstId.serialize(new javax.xml.namespace.QName("","offerInstId"),
                                        xmlWriter);
                                    }
                                } if (localOrderNumberTracker){
                                    if (localOrderNumber==null){

                                        writeStartElement(null, "", "orderNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOrderNumber.serialize(new javax.xml.namespace.QName("","orderNumber"),
                                        xmlWriter);
                                    }
                                } if (localOtherTaxTracker){
                                    if (localOtherTax==null){

                                        writeStartElement(null, "", "otherTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOtherTax.serialize(new javax.xml.namespace.QName("","otherTax"),
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
                                } if (localParentServiceInternalIdTracker){
                                    if (localParentServiceInternalId==null){

                                        writeStartElement(null, "", "parentServiceInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentServiceInternalId.serialize(new javax.xml.namespace.QName("","parentServiceInternalId"),
                                        xmlWriter);
                                    }
                                } if (localParentServiceInternalIdResetsTracker){
                                    if (localParentServiceInternalIdResets==null){

                                        writeStartElement(null, "", "parentServiceInternalIdResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentServiceInternalIdResets.serialize(new javax.xml.namespace.QName("","parentServiceInternalIdResets"),
                                        xmlWriter);
                                    }
                                } if (localPostActiveChgAppliedTracker){
                                            if (localPostActiveChgApplied==null){
                                                 throw new org.apache.axis2.databinding.ADBException("postActiveChgApplied cannot be null!!");
                                            }
                                           localPostActiveChgApplied.serialize(new javax.xml.namespace.QName("","postActiveChgApplied"),
                                               xmlWriter);
                                        } if (localProcessErrorCodeTracker){
                                    if (localProcessErrorCode==null){

                                        writeStartElement(null, "", "processErrorCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProcessErrorCode.serialize(new javax.xml.namespace.QName("","processErrorCode"),
                                        xmlWriter);
                                    }
                                } if (localProcessingStatusTracker){
                                            if (localProcessingStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("processingStatus cannot be null!!");
                                            }
                                           localProcessingStatus.serialize(new javax.xml.namespace.QName("","processingStatus"),
                                               xmlWriter);
                                        } if (localProfileIdTracker){
                                    if (localProfileId==null){

                                        writeStartElement(null, "", "profileId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProfileId.serialize(new javax.xml.namespace.QName("","profileId"),
                                        xmlWriter);
                                    }
                                } if (localRateTracker){
                                    if (localRate==null){

                                        writeStartElement(null, "", "rate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRate.serialize(new javax.xml.namespace.QName("","rate"),
                                        xmlWriter);
                                    }
                                } if (localRateDtTracker){
                                            if (localRateDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rateDt cannot be null!!");
                                            }
                                           localRateDt.serialize(new javax.xml.namespace.QName("","rateDt"),
                                               xmlWriter);
                                        } if (localRedirectAccountNoTracker){
                                    if (localRedirectAccountNo==null){

                                        writeStartElement(null, "", "redirectAccountNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRedirectAccountNo.serialize(new javax.xml.namespace.QName("","redirectAccountNo"),
                                        xmlWriter);
                                    }
                                } if (localRedirectInactiveDtTracker){
                                    if (localRedirectInactiveDt==null){

                                        writeStartElement(null, "", "redirectInactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRedirectInactiveDt.serialize(new javax.xml.namespace.QName("","redirectInactiveDt"),
                                        xmlWriter);
                                    }
                                } if (localRedirectTypeTracker){
                                            if (localRedirectType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("redirectType cannot be null!!");
                                            }
                                           localRedirectType.serialize(new javax.xml.namespace.QName("","redirectType"),
                                               xmlWriter);
                                        } if (localRetryCountTracker){
                                            if (localRetryCount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("retryCount cannot be null!!");
                                            }
                                           localRetryCount.serialize(new javax.xml.namespace.QName("","retryCount"),
                                               xmlWriter);
                                        } if (localSalesChannelIdTracker){
                                    if (localSalesChannelId==null){

                                        writeStartElement(null, "", "salesChannelId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSalesChannelId.serialize(new javax.xml.namespace.QName("","salesChannelId"),
                                        xmlWriter);
                                    }
                                } if (localShipFromGeocodeTracker){
                                    if (localShipFromGeocode==null){

                                        writeStartElement(null, "", "shipFromGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localShipFromGeocode.serialize(new javax.xml.namespace.QName("","shipFromGeocode"),
                                        xmlWriter);
                                    }
                                } if (localShipToGeocodeTracker){
                                    if (localShipToGeocode==null){

                                        writeStartElement(null, "", "shipToGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localShipToGeocode.serialize(new javax.xml.namespace.QName("","shipToGeocode"),
                                        xmlWriter);
                                    }
                                } if (localStateTaxTracker){
                                    if (localStateTax==null){

                                        writeStartElement(null, "", "stateTax", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStateTax.serialize(new javax.xml.namespace.QName("","stateTax"),
                                        xmlWriter);
                                    }
                                } if (localStatusTracker){
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("","status"),
                                               xmlWriter);
                                        } if (localTargetRatingServerIdTracker){
                                    if (localTargetRatingServerId==null){

                                        writeStartElement(null, "", "targetRatingServerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetRatingServerId.serialize(new javax.xml.namespace.QName("","targetRatingServerId"),
                                        xmlWriter);
                                    }
                                } if (localTargetServerIdTracker){
                                    if (localTargetServerId==null){

                                        writeStartElement(null, "", "targetServerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetServerId.serialize(new javax.xml.namespace.QName("","targetServerId"),
                                        xmlWriter);
                                    }
                                } if (localTaxPkgInstIdTracker){
                                    if (localTaxPkgInstId==null){

                                        writeStartElement(null, "", "taxPkgInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTaxPkgInstId.serialize(new javax.xml.namespace.QName("","taxPkgInstId"),
                                        xmlWriter);
                                    }
                                } if (localTaxTypeCodeTracker){
                                    if (localTaxTypeCode==null){

                                        writeStartElement(null, "", "taxTypeCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTaxTypeCode.serialize(new javax.xml.namespace.QName("","taxTypeCode"),
                                        xmlWriter);
                                    }
                                } if (localTotalInstallmentsTracker){
                                            if (localTotalInstallments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("totalInstallments cannot be null!!");
                                            }
                                           localTotalInstallments.serialize(new javax.xml.namespace.QName("","totalInstallments"),
                                               xmlWriter);
                                        } if (localTransactDateTracker){
                                            if (localTransactDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("transactDate cannot be null!!");
                                            }
                                           localTransactDate.serialize(new javax.xml.namespace.QName("","transactDate"),
                                               xmlWriter);
                                        } if (localUseCodeTracker){
                                    if (localUseCode==null){

                                        writeStartElement(null, "", "useCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUseCode.serialize(new javax.xml.namespace.QName("","useCode"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","nrcTermInstanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localNrcTermInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nrcTermInstId"));
                            
                            
                                    if (localNrcTermInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("nrcTermInstId cannot be null!!");
                                    }
                                    elementList.add(localNrcTermInstId);
                                } if (localAnnotationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "annotation"));
                            
                            
                                    elementList.add(localAnnotation==null?null:
                                    localAnnotation);
                                } if (localAnnotation2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "annotation2"));
                            
                            
                                    elementList.add(localAnnotation2==null?null:
                                    localAnnotation2);
                                } if (localApplyDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDate"));
                            
                            
                                    elementList.add(localApplyDate==null?null:
                                    localApplyDate);
                                } if (localApplyDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDay"));
                            
                            
                                    elementList.add(localApplyDay==null?null:
                                    localApplyDay);
                                } if (localAssociationTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "associationType"));
                            
                            
                                    if (localAssociationType==null){
                                         throw new org.apache.axis2.databinding.ADBException("associationType cannot be null!!");
                                    }
                                    elementList.add(localAssociationType);
                                } if (localAutoActivationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "autoActivation"));
                            
                            
                                    if (localAutoActivation==null){
                                         throw new org.apache.axis2.databinding.ADBException("autoActivation cannot be null!!");
                                    }
                                    elementList.add(localAutoActivation);
                                } if (localBillOrderNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billOrderNumber"));
                            
                            
                                    elementList.add(localBillOrderNumber==null?null:
                                    localBillOrderNumber);
                                } if (localBillingAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billingAccountInternalId"));
                            
                            
                                    if (localBillingAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("billingAccountInternalId cannot be null!!");
                                    }
                                    elementList.add(localBillingAccountInternalId);
                                } if (localBundleInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleInstId"));
                            
                            
                                    elementList.add(localBundleInstId==null?null:
                                    localBundleInstId);
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
                                } if (localCityTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cityTax"));
                            
                            
                                    elementList.add(localCityTax==null?null:
                                    localCityTax);
                                } if (localCountyTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "countyTax"));
                            
                            
                                    elementList.add(localCountyTax==null?null:
                                    localCountyTax);
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
                                } if (localCurrentInstallmentTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currentInstallment"));
                            
                            
                                    if (localCurrentInstallment==null){
                                         throw new org.apache.axis2.databinding.ADBException("currentInstallment cannot be null!!");
                                    }
                                    elementList.add(localCurrentInstallment);
                                } if (localCustomerOrderNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "customerOrderNumber"));
                            
                            
                                    elementList.add(localCustomerOrderNumber==null?null:
                                    localCustomerOrderNumber);
                                } if (localDateNrcJournalableTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateNrcJournalable"));
                            
                            
                                    elementList.add(localDateNrcJournalable==null?null:
                                    localDateNrcJournalable);
                                } if (localFederalTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "federalTax"));
                            
                            
                                    elementList.add(localFederalTax==null?null:
                                    localFederalTax);
                                } if (localFlexibleCycleDurationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "flexibleCycleDuration"));
                            
                            
                                    elementList.add(localFlexibleCycleDuration==null?null:
                                    localFlexibleCycleDuration);
                                } if (localGeoAreaIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "geoAreaId"));
                            
                            
                                    elementList.add(localGeoAreaId==null?null:
                                    localGeoAreaId);
                                } if (localInventoryIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inventoryId"));
                            
                            
                                    elementList.add(localInventoryId==null?null:
                                    localInventoryId);
                                } if (localInventoryIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inventoryIdResets"));
                            
                            
                                    elementList.add(localInventoryIdResets==null?null:
                                    localInventoryIdResets);
                                } if (localLastProcessedDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastProcessedDt"));
                            
                            
                                    if (localLastProcessedDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("lastProcessedDt cannot be null!!");
                                    }
                                    elementList.add(localLastProcessedDt);
                                } if (localNoBillTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noBill"));
                            
                            
                                    if (localNoBill==null){
                                         throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                    }
                                    elementList.add(localNoBill);
                                } if (localNrcCategoryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nrcCategory"));
                            
                            
                                    if (localNrcCategory==null){
                                         throw new org.apache.axis2.databinding.ADBException("nrcCategory cannot be null!!");
                                    }
                                    elementList.add(localNrcCategory);
                                } if (localNrcTermIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nrcTermId"));
                            
                            
                                    if (localNrcTermId==null){
                                         throw new org.apache.axis2.databinding.ADBException("nrcTermId cannot be null!!");
                                    }
                                    elementList.add(localNrcTermId);
                                } if (localOfferInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerInstId"));
                            
                            
                                    elementList.add(localOfferInstId==null?null:
                                    localOfferInstId);
                                } if (localOrderNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "orderNumber"));
                            
                            
                                    elementList.add(localOrderNumber==null?null:
                                    localOrderNumber);
                                } if (localOtherTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "otherTax"));
                            
                            
                                    elementList.add(localOtherTax==null?null:
                                    localOtherTax);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    elementList.add(localParentAccountInternalId==null?null:
                                    localParentAccountInternalId);
                                } if (localParentServiceInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentServiceInternalId"));
                            
                            
                                    elementList.add(localParentServiceInternalId==null?null:
                                    localParentServiceInternalId);
                                } if (localParentServiceInternalIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentServiceInternalIdResets"));
                            
                            
                                    elementList.add(localParentServiceInternalIdResets==null?null:
                                    localParentServiceInternalIdResets);
                                } if (localPostActiveChgAppliedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "postActiveChgApplied"));
                            
                            
                                    if (localPostActiveChgApplied==null){
                                         throw new org.apache.axis2.databinding.ADBException("postActiveChgApplied cannot be null!!");
                                    }
                                    elementList.add(localPostActiveChgApplied);
                                } if (localProcessErrorCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "processErrorCode"));
                            
                            
                                    elementList.add(localProcessErrorCode==null?null:
                                    localProcessErrorCode);
                                } if (localProcessingStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "processingStatus"));
                            
                            
                                    if (localProcessingStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("processingStatus cannot be null!!");
                                    }
                                    elementList.add(localProcessingStatus);
                                } if (localProfileIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "profileId"));
                            
                            
                                    elementList.add(localProfileId==null?null:
                                    localProfileId);
                                } if (localRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rate"));
                            
                            
                                    elementList.add(localRate==null?null:
                                    localRate);
                                } if (localRateDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rateDt"));
                            
                            
                                    if (localRateDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("rateDt cannot be null!!");
                                    }
                                    elementList.add(localRateDt);
                                } if (localRedirectAccountNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectAccountNo"));
                            
                            
                                    elementList.add(localRedirectAccountNo==null?null:
                                    localRedirectAccountNo);
                                } if (localRedirectInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectInactiveDt"));
                            
                            
                                    elementList.add(localRedirectInactiveDt==null?null:
                                    localRedirectInactiveDt);
                                } if (localRedirectTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectType"));
                            
                            
                                    if (localRedirectType==null){
                                         throw new org.apache.axis2.databinding.ADBException("redirectType cannot be null!!");
                                    }
                                    elementList.add(localRedirectType);
                                } if (localRetryCountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "retryCount"));
                            
                            
                                    if (localRetryCount==null){
                                         throw new org.apache.axis2.databinding.ADBException("retryCount cannot be null!!");
                                    }
                                    elementList.add(localRetryCount);
                                } if (localSalesChannelIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "salesChannelId"));
                            
                            
                                    elementList.add(localSalesChannelId==null?null:
                                    localSalesChannelId);
                                } if (localShipFromGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "shipFromGeocode"));
                            
                            
                                    elementList.add(localShipFromGeocode==null?null:
                                    localShipFromGeocode);
                                } if (localShipToGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "shipToGeocode"));
                            
                            
                                    elementList.add(localShipToGeocode==null?null:
                                    localShipToGeocode);
                                } if (localStateTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "stateTax"));
                            
                            
                                    elementList.add(localStateTax==null?null:
                                    localStateTax);
                                } if (localStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                } if (localTargetRatingServerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetRatingServerId"));
                            
                            
                                    elementList.add(localTargetRatingServerId==null?null:
                                    localTargetRatingServerId);
                                } if (localTargetServerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetServerId"));
                            
                            
                                    elementList.add(localTargetServerId==null?null:
                                    localTargetServerId);
                                } if (localTaxPkgInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "taxPkgInstId"));
                            
                            
                                    elementList.add(localTaxPkgInstId==null?null:
                                    localTaxPkgInstId);
                                } if (localTaxTypeCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "taxTypeCode"));
                            
                            
                                    elementList.add(localTaxTypeCode==null?null:
                                    localTaxTypeCode);
                                } if (localTotalInstallmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalInstallments"));
                            
                            
                                    if (localTotalInstallments==null){
                                         throw new org.apache.axis2.databinding.ADBException("totalInstallments cannot be null!!");
                                    }
                                    elementList.add(localTotalInstallments);
                                } if (localTransactDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "transactDate"));
                            
                            
                                    if (localTransactDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("transactDate cannot be null!!");
                                    }
                                    elementList.add(localTransactDate);
                                } if (localUseCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "useCode"));
                            
                            
                                    elementList.add(localUseCode==null?null:
                                    localUseCode);
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
        public static NrcTermInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NrcTermInstanceObject object =
                new NrcTermInstanceObject();

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
                    
                            if (!"nrcTermInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NrcTermInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcTermInstId").equals(reader.getName())){
                                
                                                object.setNrcTermInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","annotation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAnnotation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAnnotation(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","annotation2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAnnotation2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAnnotation2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","applyDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setApplyDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setApplyDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","associationType").equals(reader.getName())){
                                
                                                object.setAssociationType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","autoActivation").equals(reader.getName())){
                                
                                                object.setAutoActivation(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billOrderNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillOrderNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillOrderNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billingAccountInternalId").equals(reader.getName())){
                                
                                                object.setBillingAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundleInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBundleInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBundleInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cityTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCityTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCityTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","countyTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCountyTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCountyTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currentInstallment").equals(reader.getName())){
                                
                                                object.setCurrentInstallment(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","customerOrderNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustomerOrderNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustomerOrderNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateNrcJournalable").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDateNrcJournalable(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDateNrcJournalable(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","federalTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFederalTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFederalTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","flexibleCycleDuration").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFlexibleCycleDuration(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFlexibleCycleDuration(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","geoAreaId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGeoAreaId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGeoAreaId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inventoryId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInventoryId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInventoryId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inventoryIdResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInventoryIdResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInventoryIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastProcessedDt").equals(reader.getName())){
                                
                                                object.setLastProcessedDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcCategory").equals(reader.getName())){
                                
                                                object.setNrcCategory(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcTermId").equals(reader.getName())){
                                
                                                object.setNrcTermId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOfferInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOfferInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","orderNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOrderNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOrderNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","otherTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOtherTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOtherTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentServiceInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentServiceInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentServiceInternalIdResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentServiceInternalIdResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","postActiveChgApplied").equals(reader.getName())){
                                
                                                object.setPostActiveChgApplied(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","processErrorCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProcessErrorCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProcessErrorCode(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","processingStatus").equals(reader.getName())){
                                
                                                object.setProcessingStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","profileId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProfileId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProfileId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRate(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rateDt").equals(reader.getName())){
                                
                                                object.setRateDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","redirectAccountNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRedirectAccountNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRedirectAccountNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","redirectInactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRedirectInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRedirectInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","redirectType").equals(reader.getName())){
                                
                                                object.setRedirectType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","retryCount").equals(reader.getName())){
                                
                                                object.setRetryCount(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","salesChannelId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSalesChannelId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSalesChannelId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","shipFromGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setShipFromGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setShipFromGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","shipToGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setShipToGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setShipToGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","stateTax").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStateTax(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStateTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetRatingServerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetRatingServerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetRatingServerId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetServerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetServerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetServerId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","taxPkgInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTaxPkgInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTaxPkgInstId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","taxTypeCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTaxTypeCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTaxTypeCode(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalInstallments").equals(reader.getName())){
                                
                                                object.setTotalInstallments(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","transactDate").equals(reader.getName())){
                                
                                                object.setTransactDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","useCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUseCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUseCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    