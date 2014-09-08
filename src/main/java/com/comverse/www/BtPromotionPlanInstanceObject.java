
/**
 * BtPromotionPlanInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  BtPromotionPlanInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BtPromotionPlanInstanceObject extends com.comverse.www.BtPromotionPlanInstanceIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = btPromotionPlanInstanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ActiveByDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localActiveByDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActiveByDtTracker = false ;

                           public boolean isActiveByDtSpecified(){
                               return localActiveByDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getActiveByDt(){
                               return localActiveByDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActiveByDt
                               */
                               public void setActiveByDt(com.comverse.www.DateAttributeJAXBElement param){
                            localActiveByDtTracker = true;
                                   
                                            this.localActiveByDt=param;
                                    

                               }
                            

                        /**
                        * field for AvailPeriods
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localAvailPeriods ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvailPeriodsTracker = false ;

                           public boolean isAvailPeriodsSpecified(){
                               return localAvailPeriodsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getAvailPeriods(){
                               return localAvailPeriods;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvailPeriods
                               */
                               public void setAvailPeriods(com.comverse.www.ShortAttributeJAXBElement param){
                            localAvailPeriodsTracker = true;
                                   
                                            this.localAvailPeriods=param;
                                    

                               }
                            

                        /**
                        * field for BillPeriod
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localBillPeriod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillPeriodTracker = false ;

                           public boolean isBillPeriodSpecified(){
                               return localBillPeriodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getBillPeriod(){
                               return localBillPeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillPeriod
                               */
                               public void setBillPeriod(com.comverse.www.StringAttributeJAXBElement param){
                            localBillPeriodTracker = true;
                                   
                                            this.localBillPeriod=param;
                                    

                               }
                            

                        /**
                        * field for DistributePayback
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localDistributePayback ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDistributePaybackTracker = false ;

                           public boolean isDistributePaybackSpecified(){
                               return localDistributePaybackTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getDistributePayback(){
                               return localDistributePayback;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DistributePayback
                               */
                               public void setDistributePayback(com.comverse.www.BooleanAttributeJAXBElement param){
                            localDistributePaybackTracker = param != null;
                                   
                                            this.localDistributePayback=param;
                                    

                               }
                            

                        /**
                        * field for DurationOverride
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localDurationOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDurationOverrideTracker = false ;

                           public boolean isDurationOverrideSpecified(){
                               return localDurationOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getDurationOverride(){
                               return localDurationOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DurationOverride
                               */
                               public void setDurationOverride(com.comverse.www.BooleanAttributeJAXBElement param){
                            localDurationOverrideTracker = param != null;
                                   
                                            this.localDurationOverride=param;
                                    

                               }
                            

                        /**
                        * field for ExternalAgreementId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localExternalAgreementId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalAgreementIdTracker = false ;

                           public boolean isExternalAgreementIdSpecified(){
                               return localExternalAgreementIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getExternalAgreementId(){
                               return localExternalAgreementId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalAgreementId
                               */
                               public void setExternalAgreementId(com.comverse.www.StringAttributeJAXBElement param){
                            localExternalAgreementIdTracker = param != null;
                                   
                                            this.localExternalAgreementId=param;
                                    

                               }
                            

                        /**
                        * field for FirstUseDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localFirstUseDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstUseDtTracker = false ;

                           public boolean isFirstUseDtSpecified(){
                               return localFirstUseDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getFirstUseDt(){
                               return localFirstUseDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstUseDt
                               */
                               public void setFirstUseDt(com.comverse.www.DateAttributeJAXBElement param){
                            localFirstUseDtTracker = true;
                                   
                                            this.localFirstUseDt=param;
                                    

                               }
                            

                        /**
                        * field for GracePeriod
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localGracePeriod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGracePeriodTracker = false ;

                           public boolean isGracePeriodSpecified(){
                               return localGracePeriodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getGracePeriod(){
                               return localGracePeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GracePeriod
                               */
                               public void setGracePeriod(com.comverse.www.ShortAttributeJAXBElement param){
                            localGracePeriodTracker = param != null;
                                   
                                            this.localGracePeriod=param;
                                    

                               }
                            

                        /**
                        * field for InUse
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localInUse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInUseTracker = false ;

                           public boolean isInUseSpecified(){
                               return localInUseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getInUse(){
                               return localInUse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InUse
                               */
                               public void setInUse(com.comverse.www.StringAttributeJAXBElement param){
                            localInUseTracker = param != null;
                                   
                                            this.localInUse=param;
                                    

                               }
                            

                        /**
                        * field for IsCustom
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localIsCustom ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsCustomTracker = false ;

                           public boolean isIsCustomSpecified(){
                               return localIsCustomTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getIsCustom(){
                               return localIsCustom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsCustom
                               */
                               public void setIsCustom(com.comverse.www.ShortAttributeJAXBElement param){
                            localIsCustomTracker = true;
                                   
                                            this.localIsCustom=param;
                                    

                               }
                            

                        /**
                        * field for LastUseDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localLastUseDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastUseDtTracker = false ;

                           public boolean isLastUseDtSpecified(){
                               return localLastUseDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getLastUseDt(){
                               return localLastUseDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastUseDt
                               */
                               public void setLastUseDt(com.comverse.www.DateAttributeJAXBElement param){
                            localLastUseDtTracker = true;
                                   
                                            this.localLastUseDt=param;
                                    

                               }
                            

                        /**
                        * field for MinDurationDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localMinDurationDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinDurationDateTracker = false ;

                           public boolean isMinDurationDateSpecified(){
                               return localMinDurationDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getMinDurationDate(){
                               return localMinDurationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinDurationDate
                               */
                               public void setMinDurationDate(com.comverse.www.DateAttributeJAXBElement param){
                            localMinDurationDateTracker = true;
                                   
                                            this.localMinDurationDate=param;
                                    

                               }
                            

                        /**
                        * field for MinNoticeDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localMinNoticeDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinNoticeDateTracker = false ;

                           public boolean isMinNoticeDateSpecified(){
                               return localMinNoticeDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getMinNoticeDate(){
                               return localMinNoticeDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinNoticeDate
                               */
                               public void setMinNoticeDate(com.comverse.www.DateAttributeJAXBElement param){
                            localMinNoticeDateTracker = true;
                                   
                                            this.localMinNoticeDate=param;
                                    

                               }
                            

                        /**
                        * field for NextEvalDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextEvalDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextEvalDateTracker = false ;

                           public boolean isNextEvalDateSpecified(){
                               return localNextEvalDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextEvalDate(){
                               return localNextEvalDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextEvalDate
                               */
                               public void setNextEvalDate(com.comverse.www.DateAttributeJAXBElement param){
                            localNextEvalDateTracker = true;
                                   
                                            this.localNextEvalDate=param;
                                    

                               }
                            

                        /**
                        * field for NoticeInactiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNoticeInactiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNoticeInactiveDtTracker = false ;

                           public boolean isNoticeInactiveDtSpecified(){
                               return localNoticeInactiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNoticeInactiveDt(){
                               return localNoticeInactiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoticeInactiveDt
                               */
                               public void setNoticeInactiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localNoticeInactiveDtTracker = true;
                                   
                                            this.localNoticeInactiveDt=param;
                                    

                               }
                            

                        /**
                        * field for NoticeOverride
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localNoticeOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNoticeOverrideTracker = false ;

                           public boolean isNoticeOverrideSpecified(){
                               return localNoticeOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getNoticeOverride(){
                               return localNoticeOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NoticeOverride
                               */
                               public void setNoticeOverride(com.comverse.www.BooleanAttributeJAXBElement param){
                            localNoticeOverrideTracker = param != null;
                                   
                                            this.localNoticeOverride=param;
                                    

                               }
                            

                        /**
                        * field for PrevEvalDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localPrevEvalDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrevEvalDateTracker = false ;

                           public boolean isPrevEvalDateSpecified(){
                               return localPrevEvalDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getPrevEvalDate(){
                               return localPrevEvalDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrevEvalDate
                               */
                               public void setPrevEvalDate(com.comverse.www.DateAttributeJAXBElement param){
                            localPrevEvalDateTracker = true;
                                   
                                            this.localPrevEvalDate=param;
                                    

                               }
                            

                        /**
                        * field for ProrateAccountEndOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProrateAccountEndOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProrateAccountEndOverrideTracker = false ;

                           public boolean isProrateAccountEndOverrideSpecified(){
                               return localProrateAccountEndOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProrateAccountEndOverride(){
                               return localProrateAccountEndOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProrateAccountEndOverride
                               */
                               public void setProrateAccountEndOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProrateAccountEndOverrideTracker = param != null;
                                   
                                            this.localProrateAccountEndOverride=param;
                                    

                               }
                            

                        /**
                        * field for ProrateAccountStartOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProrateAccountStartOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProrateAccountStartOverrideTracker = false ;

                           public boolean isProrateAccountStartOverrideSpecified(){
                               return localProrateAccountStartOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProrateAccountStartOverride(){
                               return localProrateAccountStartOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProrateAccountStartOverride
                               */
                               public void setProrateAccountStartOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProrateAccountStartOverrideTracker = param != null;
                                   
                                            this.localProrateAccountStartOverride=param;
                                    

                               }
                            

                        /**
                        * field for ProrateContractEndOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProrateContractEndOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProrateContractEndOverrideTracker = false ;

                           public boolean isProrateContractEndOverrideSpecified(){
                               return localProrateContractEndOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProrateContractEndOverride(){
                               return localProrateContractEndOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProrateContractEndOverride
                               */
                               public void setProrateContractEndOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProrateContractEndOverrideTracker = param != null;
                                   
                                            this.localProrateContractEndOverride=param;
                                    

                               }
                            

                        /**
                        * field for ProrateContractStrtOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProrateContractStrtOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProrateContractStrtOverrideTracker = false ;

                           public boolean isProrateContractStrtOverrideSpecified(){
                               return localProrateContractStrtOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProrateContractStrtOverride(){
                               return localProrateContractStrtOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProrateContractStrtOverride
                               */
                               public void setProrateContractStrtOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProrateContractStrtOverrideTracker = param != null;
                                   
                                            this.localProrateContractStrtOverride=param;
                                    

                               }
                            

                        /**
                        * field for ProrateInterimBillOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProrateInterimBillOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProrateInterimBillOverrideTracker = false ;

                           public boolean isProrateInterimBillOverrideSpecified(){
                               return localProrateInterimBillOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProrateInterimBillOverride(){
                               return localProrateInterimBillOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProrateInterimBillOverride
                               */
                               public void setProrateInterimBillOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProrateInterimBillOverrideTracker = param != null;
                                   
                                            this.localProrateInterimBillOverride=param;
                                    

                               }
                            

                        /**
                        * field for ProratePeriodChangeOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProratePeriodChangeOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProratePeriodChangeOverrideTracker = false ;

                           public boolean isProratePeriodChangeOverrideSpecified(){
                               return localProratePeriodChangeOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProratePeriodChangeOverride(){
                               return localProratePeriodChangeOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProratePeriodChangeOverride
                               */
                               public void setProratePeriodChangeOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProratePeriodChangeOverrideTracker = param != null;
                                   
                                            this.localProratePeriodChangeOverride=param;
                                    

                               }
                            

                        /**
                        * field for ProrateTgtRebatesOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProrateTgtRebatesOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProrateTgtRebatesOverrideTracker = false ;

                           public boolean isProrateTgtRebatesOverrideSpecified(){
                               return localProrateTgtRebatesOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProrateTgtRebatesOverride(){
                               return localProrateTgtRebatesOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProrateTgtRebatesOverride
                               */
                               public void setProrateTgtRebatesOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProrateTgtRebatesOverrideTracker = param != null;
                                   
                                            this.localProrateTgtRebatesOverride=param;
                                    

                               }
                            

                        /**
                        * field for ProrateTgtThresholdOverride
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localProrateTgtThresholdOverride ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProrateTgtThresholdOverrideTracker = false ;

                           public boolean isProrateTgtThresholdOverrideSpecified(){
                               return localProrateTgtThresholdOverrideTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getProrateTgtThresholdOverride(){
                               return localProrateTgtThresholdOverride;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProrateTgtThresholdOverride
                               */
                               public void setProrateTgtThresholdOverride(com.comverse.www.ShortAttributeJAXBElement param){
                            localProrateTgtThresholdOverrideTracker = param != null;
                                   
                                            this.localProrateTgtThresholdOverride=param;
                                    

                               }
                            

                        /**
                        * field for RolloverPeriod
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRolloverPeriod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverPeriodTracker = false ;

                           public boolean isRolloverPeriodSpecified(){
                               return localRolloverPeriodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRolloverPeriod(){
                               return localRolloverPeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverPeriod
                               */
                               public void setRolloverPeriod(com.comverse.www.ShortAttributeJAXBElement param){
                            localRolloverPeriodTracker = true;
                                   
                                            this.localRolloverPeriod=param;
                                    

                               }
                            

                        /**
                        * field for RolloverPeriodStart
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRolloverPeriodStart ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverPeriodStartTracker = false ;

                           public boolean isRolloverPeriodStartSpecified(){
                               return localRolloverPeriodStartTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRolloverPeriodStart(){
                               return localRolloverPeriodStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverPeriodStart
                               */
                               public void setRolloverPeriodStart(com.comverse.www.ShortAttributeJAXBElement param){
                            localRolloverPeriodStartTracker = true;
                                   
                                            this.localRolloverPeriodStart=param;
                                    

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
                        * field for TotalElementAmount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localTotalElementAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalElementAmountTracker = false ;

                           public boolean isTotalElementAmountSpecified(){
                               return localTotalElementAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getTotalElementAmount(){
                               return localTotalElementAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalElementAmount
                               */
                               public void setTotalElementAmount(com.comverse.www.NumericAttributeJAXBElement param){
                            localTotalElementAmountTracker = param != null;
                                   
                                            this.localTotalElementAmount=param;
                                    

                               }
                            

                        /**
                        * field for TotalPeriods
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localTotalPeriods ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalPeriodsTracker = false ;

                           public boolean isTotalPeriodsSpecified(){
                               return localTotalPeriodsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getTotalPeriods(){
                               return localTotalPeriods;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalPeriods
                               */
                               public void setTotalPeriods(com.comverse.www.ShortAttributeJAXBElement param){
                            localTotalPeriodsTracker = true;
                                   
                                            this.localTotalPeriods=param;
                                    

                               }
                            

                        /**
                        * field for TotalSavingsAmount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localTotalSavingsAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalSavingsAmountTracker = false ;

                           public boolean isTotalSavingsAmountSpecified(){
                               return localTotalSavingsAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getTotalSavingsAmount(){
                               return localTotalSavingsAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalSavingsAmount
                               */
                               public void setTotalSavingsAmount(com.comverse.www.NumericAttributeJAXBElement param){
                            localTotalSavingsAmountTracker = param != null;
                                   
                                            this.localTotalSavingsAmount=param;
                                    

                               }
                            

                        /**
                        * field for TrackTotalAmounts
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localTrackTotalAmounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTrackTotalAmountsTracker = false ;

                           public boolean isTrackTotalAmountsSpecified(){
                               return localTrackTotalAmountsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getTrackTotalAmounts(){
                               return localTrackTotalAmounts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TrackTotalAmounts
                               */
                               public void setTrackTotalAmounts(com.comverse.www.BooleanAttributeJAXBElement param){
                            localTrackTotalAmountsTracker = param != null;
                                   
                                            this.localTrackTotalAmounts=param;
                                    

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
                           namespacePrefix+":btPromotionPlanInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "btPromotionPlanInstanceObject",
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
                              if (localBtPromotionPlanInstIdTracker){
                                            if (localBtPromotionPlanInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("btPromotionPlanInstId cannot be null!!");
                                            }
                                           localBtPromotionPlanInstId.serialize(new javax.xml.namespace.QName("","btPromotionPlanInstId"),
                                               xmlWriter);
                                        } if (localAccountInternalIdTracker){
                                    if (localAccountInternalId==null){

                                        writeStartElement(null, "", "accountInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccountInternalId.serialize(new javax.xml.namespace.QName("","accountInternalId"),
                                        xmlWriter);
                                    }
                                } if (localBtPromotionPlanIdTracker){
                                            if (localBtPromotionPlanId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("btPromotionPlanId cannot be null!!");
                                            }
                                           localBtPromotionPlanId.serialize(new javax.xml.namespace.QName("","btPromotionPlanId"),
                                               xmlWriter);
                                        } if (localOfferInstIdTracker){
                                            if (localOfferInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("offerInstId cannot be null!!");
                                            }
                                           localOfferInstId.serialize(new javax.xml.namespace.QName("","offerInstId"),
                                               xmlWriter);
                                        } if (localServiceInternalIdTracker){
                                    if (localServiceInternalId==null){

                                        writeStartElement(null, "", "serviceInternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceInternalId.serialize(new javax.xml.namespace.QName("","serviceInternalId"),
                                        xmlWriter);
                                    }
                                } if (localServiceInternalIdResetsTracker){
                                    if (localServiceInternalIdResets==null){

                                        writeStartElement(null, "", "serviceInternalIdResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceInternalIdResets.serialize(new javax.xml.namespace.QName("","serviceInternalIdResets"),
                                        xmlWriter);
                                    }
                                } if (localActiveByDtTracker){
                                    if (localActiveByDt==null){

                                        writeStartElement(null, "", "activeByDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localActiveByDt.serialize(new javax.xml.namespace.QName("","activeByDt"),
                                        xmlWriter);
                                    }
                                } if (localAvailPeriodsTracker){
                                    if (localAvailPeriods==null){

                                        writeStartElement(null, "", "availPeriods", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAvailPeriods.serialize(new javax.xml.namespace.QName("","availPeriods"),
                                        xmlWriter);
                                    }
                                } if (localBillPeriodTracker){
                                    if (localBillPeriod==null){

                                        writeStartElement(null, "", "billPeriod", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillPeriod.serialize(new javax.xml.namespace.QName("","billPeriod"),
                                        xmlWriter);
                                    }
                                } if (localDistributePaybackTracker){
                                            if (localDistributePayback==null){
                                                 throw new org.apache.axis2.databinding.ADBException("distributePayback cannot be null!!");
                                            }
                                           localDistributePayback.serialize(new javax.xml.namespace.QName("","distributePayback"),
                                               xmlWriter);
                                        } if (localDurationOverrideTracker){
                                            if (localDurationOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("durationOverride cannot be null!!");
                                            }
                                           localDurationOverride.serialize(new javax.xml.namespace.QName("","durationOverride"),
                                               xmlWriter);
                                        } if (localExternalAgreementIdTracker){
                                            if (localExternalAgreementId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("externalAgreementId cannot be null!!");
                                            }
                                           localExternalAgreementId.serialize(new javax.xml.namespace.QName("","externalAgreementId"),
                                               xmlWriter);
                                        } if (localFirstUseDtTracker){
                                    if (localFirstUseDt==null){

                                        writeStartElement(null, "", "firstUseDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFirstUseDt.serialize(new javax.xml.namespace.QName("","firstUseDt"),
                                        xmlWriter);
                                    }
                                } if (localGracePeriodTracker){
                                            if (localGracePeriod==null){
                                                 throw new org.apache.axis2.databinding.ADBException("gracePeriod cannot be null!!");
                                            }
                                           localGracePeriod.serialize(new javax.xml.namespace.QName("","gracePeriod"),
                                               xmlWriter);
                                        } if (localInUseTracker){
                                            if (localInUse==null){
                                                 throw new org.apache.axis2.databinding.ADBException("inUse cannot be null!!");
                                            }
                                           localInUse.serialize(new javax.xml.namespace.QName("","inUse"),
                                               xmlWriter);
                                        } if (localIsCustomTracker){
                                    if (localIsCustom==null){

                                        writeStartElement(null, "", "isCustom", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localIsCustom.serialize(new javax.xml.namespace.QName("","isCustom"),
                                        xmlWriter);
                                    }
                                } if (localLastUseDtTracker){
                                    if (localLastUseDt==null){

                                        writeStartElement(null, "", "lastUseDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastUseDt.serialize(new javax.xml.namespace.QName("","lastUseDt"),
                                        xmlWriter);
                                    }
                                } if (localMinDurationDateTracker){
                                    if (localMinDurationDate==null){

                                        writeStartElement(null, "", "minDurationDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMinDurationDate.serialize(new javax.xml.namespace.QName("","minDurationDate"),
                                        xmlWriter);
                                    }
                                } if (localMinNoticeDateTracker){
                                    if (localMinNoticeDate==null){

                                        writeStartElement(null, "", "minNoticeDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMinNoticeDate.serialize(new javax.xml.namespace.QName("","minNoticeDate"),
                                        xmlWriter);
                                    }
                                } if (localNextEvalDateTracker){
                                    if (localNextEvalDate==null){

                                        writeStartElement(null, "", "nextEvalDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextEvalDate.serialize(new javax.xml.namespace.QName("","nextEvalDate"),
                                        xmlWriter);
                                    }
                                } if (localNoticeInactiveDtTracker){
                                    if (localNoticeInactiveDt==null){

                                        writeStartElement(null, "", "noticeInactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNoticeInactiveDt.serialize(new javax.xml.namespace.QName("","noticeInactiveDt"),
                                        xmlWriter);
                                    }
                                } if (localNoticeOverrideTracker){
                                            if (localNoticeOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noticeOverride cannot be null!!");
                                            }
                                           localNoticeOverride.serialize(new javax.xml.namespace.QName("","noticeOverride"),
                                               xmlWriter);
                                        } if (localPrevEvalDateTracker){
                                    if (localPrevEvalDate==null){

                                        writeStartElement(null, "", "prevEvalDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrevEvalDate.serialize(new javax.xml.namespace.QName("","prevEvalDate"),
                                        xmlWriter);
                                    }
                                } if (localProrateAccountEndOverrideTracker){
                                            if (localProrateAccountEndOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prorateAccountEndOverride cannot be null!!");
                                            }
                                           localProrateAccountEndOverride.serialize(new javax.xml.namespace.QName("","prorateAccountEndOverride"),
                                               xmlWriter);
                                        } if (localProrateAccountStartOverrideTracker){
                                            if (localProrateAccountStartOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prorateAccountStartOverride cannot be null!!");
                                            }
                                           localProrateAccountStartOverride.serialize(new javax.xml.namespace.QName("","prorateAccountStartOverride"),
                                               xmlWriter);
                                        } if (localProrateContractEndOverrideTracker){
                                            if (localProrateContractEndOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prorateContractEndOverride cannot be null!!");
                                            }
                                           localProrateContractEndOverride.serialize(new javax.xml.namespace.QName("","prorateContractEndOverride"),
                                               xmlWriter);
                                        } if (localProrateContractStrtOverrideTracker){
                                            if (localProrateContractStrtOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prorateContractStrtOverride cannot be null!!");
                                            }
                                           localProrateContractStrtOverride.serialize(new javax.xml.namespace.QName("","prorateContractStrtOverride"),
                                               xmlWriter);
                                        } if (localProrateInterimBillOverrideTracker){
                                            if (localProrateInterimBillOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prorateInterimBillOverride cannot be null!!");
                                            }
                                           localProrateInterimBillOverride.serialize(new javax.xml.namespace.QName("","prorateInterimBillOverride"),
                                               xmlWriter);
                                        } if (localProratePeriodChangeOverrideTracker){
                                            if (localProratePeriodChangeOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("proratePeriodChangeOverride cannot be null!!");
                                            }
                                           localProratePeriodChangeOverride.serialize(new javax.xml.namespace.QName("","proratePeriodChangeOverride"),
                                               xmlWriter);
                                        } if (localProrateTgtRebatesOverrideTracker){
                                            if (localProrateTgtRebatesOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prorateTgtRebatesOverride cannot be null!!");
                                            }
                                           localProrateTgtRebatesOverride.serialize(new javax.xml.namespace.QName("","prorateTgtRebatesOverride"),
                                               xmlWriter);
                                        } if (localProrateTgtThresholdOverrideTracker){
                                            if (localProrateTgtThresholdOverride==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prorateTgtThresholdOverride cannot be null!!");
                                            }
                                           localProrateTgtThresholdOverride.serialize(new javax.xml.namespace.QName("","prorateTgtThresholdOverride"),
                                               xmlWriter);
                                        } if (localRolloverPeriodTracker){
                                    if (localRolloverPeriod==null){

                                        writeStartElement(null, "", "rolloverPeriod", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRolloverPeriod.serialize(new javax.xml.namespace.QName("","rolloverPeriod"),
                                        xmlWriter);
                                    }
                                } if (localRolloverPeriodStartTracker){
                                    if (localRolloverPeriodStart==null){

                                        writeStartElement(null, "", "rolloverPeriodStart", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRolloverPeriodStart.serialize(new javax.xml.namespace.QName("","rolloverPeriodStart"),
                                        xmlWriter);
                                    }
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
                                } if (localTotalElementAmountTracker){
                                            if (localTotalElementAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("totalElementAmount cannot be null!!");
                                            }
                                           localTotalElementAmount.serialize(new javax.xml.namespace.QName("","totalElementAmount"),
                                               xmlWriter);
                                        } if (localTotalPeriodsTracker){
                                    if (localTotalPeriods==null){

                                        writeStartElement(null, "", "totalPeriods", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalPeriods.serialize(new javax.xml.namespace.QName("","totalPeriods"),
                                        xmlWriter);
                                    }
                                } if (localTotalSavingsAmountTracker){
                                            if (localTotalSavingsAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("totalSavingsAmount cannot be null!!");
                                            }
                                           localTotalSavingsAmount.serialize(new javax.xml.namespace.QName("","totalSavingsAmount"),
                                               xmlWriter);
                                        } if (localTrackTotalAmountsTracker){
                                            if (localTrackTotalAmounts==null){
                                                 throw new org.apache.axis2.databinding.ADBException("trackTotalAmounts cannot be null!!");
                                            }
                                           localTrackTotalAmounts.serialize(new javax.xml.namespace.QName("","trackTotalAmounts"),
                                               xmlWriter);
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","btPromotionPlanInstanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localBtPromotionPlanInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "btPromotionPlanInstId"));
                            
                            
                                    if (localBtPromotionPlanInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("btPromotionPlanInstId cannot be null!!");
                                    }
                                    elementList.add(localBtPromotionPlanInstId);
                                } if (localAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountInternalId"));
                            
                            
                                    elementList.add(localAccountInternalId==null?null:
                                    localAccountInternalId);
                                } if (localBtPromotionPlanIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "btPromotionPlanId"));
                            
                            
                                    if (localBtPromotionPlanId==null){
                                         throw new org.apache.axis2.databinding.ADBException("btPromotionPlanId cannot be null!!");
                                    }
                                    elementList.add(localBtPromotionPlanId);
                                } if (localOfferInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerInstId"));
                            
                            
                                    if (localOfferInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("offerInstId cannot be null!!");
                                    }
                                    elementList.add(localOfferInstId);
                                } if (localServiceInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInternalId"));
                            
                            
                                    elementList.add(localServiceInternalId==null?null:
                                    localServiceInternalId);
                                } if (localServiceInternalIdResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInternalIdResets"));
                            
                            
                                    elementList.add(localServiceInternalIdResets==null?null:
                                    localServiceInternalIdResets);
                                } if (localActiveByDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activeByDt"));
                            
                            
                                    elementList.add(localActiveByDt==null?null:
                                    localActiveByDt);
                                } if (localAvailPeriodsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "availPeriods"));
                            
                            
                                    elementList.add(localAvailPeriods==null?null:
                                    localAvailPeriods);
                                } if (localBillPeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billPeriod"));
                            
                            
                                    elementList.add(localBillPeriod==null?null:
                                    localBillPeriod);
                                } if (localDistributePaybackTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "distributePayback"));
                            
                            
                                    if (localDistributePayback==null){
                                         throw new org.apache.axis2.databinding.ADBException("distributePayback cannot be null!!");
                                    }
                                    elementList.add(localDistributePayback);
                                } if (localDurationOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "durationOverride"));
                            
                            
                                    if (localDurationOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("durationOverride cannot be null!!");
                                    }
                                    elementList.add(localDurationOverride);
                                } if (localExternalAgreementIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "externalAgreementId"));
                            
                            
                                    if (localExternalAgreementId==null){
                                         throw new org.apache.axis2.databinding.ADBException("externalAgreementId cannot be null!!");
                                    }
                                    elementList.add(localExternalAgreementId);
                                } if (localFirstUseDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "firstUseDt"));
                            
                            
                                    elementList.add(localFirstUseDt==null?null:
                                    localFirstUseDt);
                                } if (localGracePeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "gracePeriod"));
                            
                            
                                    if (localGracePeriod==null){
                                         throw new org.apache.axis2.databinding.ADBException("gracePeriod cannot be null!!");
                                    }
                                    elementList.add(localGracePeriod);
                                } if (localInUseTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inUse"));
                            
                            
                                    if (localInUse==null){
                                         throw new org.apache.axis2.databinding.ADBException("inUse cannot be null!!");
                                    }
                                    elementList.add(localInUse);
                                } if (localIsCustomTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isCustom"));
                            
                            
                                    elementList.add(localIsCustom==null?null:
                                    localIsCustom);
                                } if (localLastUseDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lastUseDt"));
                            
                            
                                    elementList.add(localLastUseDt==null?null:
                                    localLastUseDt);
                                } if (localMinDurationDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "minDurationDate"));
                            
                            
                                    elementList.add(localMinDurationDate==null?null:
                                    localMinDurationDate);
                                } if (localMinNoticeDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "minNoticeDate"));
                            
                            
                                    elementList.add(localMinNoticeDate==null?null:
                                    localMinNoticeDate);
                                } if (localNextEvalDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextEvalDate"));
                            
                            
                                    elementList.add(localNextEvalDate==null?null:
                                    localNextEvalDate);
                                } if (localNoticeInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noticeInactiveDt"));
                            
                            
                                    elementList.add(localNoticeInactiveDt==null?null:
                                    localNoticeInactiveDt);
                                } if (localNoticeOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noticeOverride"));
                            
                            
                                    if (localNoticeOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("noticeOverride cannot be null!!");
                                    }
                                    elementList.add(localNoticeOverride);
                                } if (localPrevEvalDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevEvalDate"));
                            
                            
                                    elementList.add(localPrevEvalDate==null?null:
                                    localPrevEvalDate);
                                } if (localProrateAccountEndOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prorateAccountEndOverride"));
                            
                            
                                    if (localProrateAccountEndOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("prorateAccountEndOverride cannot be null!!");
                                    }
                                    elementList.add(localProrateAccountEndOverride);
                                } if (localProrateAccountStartOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prorateAccountStartOverride"));
                            
                            
                                    if (localProrateAccountStartOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("prorateAccountStartOverride cannot be null!!");
                                    }
                                    elementList.add(localProrateAccountStartOverride);
                                } if (localProrateContractEndOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prorateContractEndOverride"));
                            
                            
                                    if (localProrateContractEndOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("prorateContractEndOverride cannot be null!!");
                                    }
                                    elementList.add(localProrateContractEndOverride);
                                } if (localProrateContractStrtOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prorateContractStrtOverride"));
                            
                            
                                    if (localProrateContractStrtOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("prorateContractStrtOverride cannot be null!!");
                                    }
                                    elementList.add(localProrateContractStrtOverride);
                                } if (localProrateInterimBillOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prorateInterimBillOverride"));
                            
                            
                                    if (localProrateInterimBillOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("prorateInterimBillOverride cannot be null!!");
                                    }
                                    elementList.add(localProrateInterimBillOverride);
                                } if (localProratePeriodChangeOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "proratePeriodChangeOverride"));
                            
                            
                                    if (localProratePeriodChangeOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("proratePeriodChangeOverride cannot be null!!");
                                    }
                                    elementList.add(localProratePeriodChangeOverride);
                                } if (localProrateTgtRebatesOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prorateTgtRebatesOverride"));
                            
                            
                                    if (localProrateTgtRebatesOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("prorateTgtRebatesOverride cannot be null!!");
                                    }
                                    elementList.add(localProrateTgtRebatesOverride);
                                } if (localProrateTgtThresholdOverrideTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prorateTgtThresholdOverride"));
                            
                            
                                    if (localProrateTgtThresholdOverride==null){
                                         throw new org.apache.axis2.databinding.ADBException("prorateTgtThresholdOverride cannot be null!!");
                                    }
                                    elementList.add(localProrateTgtThresholdOverride);
                                } if (localRolloverPeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rolloverPeriod"));
                            
                            
                                    elementList.add(localRolloverPeriod==null?null:
                                    localRolloverPeriod);
                                } if (localRolloverPeriodStartTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rolloverPeriodStart"));
                            
                            
                                    elementList.add(localRolloverPeriodStart==null?null:
                                    localRolloverPeriodStart);
                                } if (localSalesChannelIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "salesChannelId"));
                            
                            
                                    elementList.add(localSalesChannelId==null?null:
                                    localSalesChannelId);
                                } if (localTotalElementAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalElementAmount"));
                            
                            
                                    if (localTotalElementAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("totalElementAmount cannot be null!!");
                                    }
                                    elementList.add(localTotalElementAmount);
                                } if (localTotalPeriodsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalPeriods"));
                            
                            
                                    elementList.add(localTotalPeriods==null?null:
                                    localTotalPeriods);
                                } if (localTotalSavingsAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalSavingsAmount"));
                            
                            
                                    if (localTotalSavingsAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("totalSavingsAmount cannot be null!!");
                                    }
                                    elementList.add(localTotalSavingsAmount);
                                } if (localTrackTotalAmountsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "trackTotalAmounts"));
                            
                            
                                    if (localTrackTotalAmounts==null){
                                         throw new org.apache.axis2.databinding.ADBException("trackTotalAmounts cannot be null!!");
                                    }
                                    elementList.add(localTrackTotalAmounts);
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
        public static BtPromotionPlanInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BtPromotionPlanInstanceObject object =
                new BtPromotionPlanInstanceObject();

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
                    
                            if (!"btPromotionPlanInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BtPromotionPlanInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","btPromotionPlanInstId").equals(reader.getName())){
                                
                                                object.setBtPromotionPlanInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","btPromotionPlanId").equals(reader.getName())){
                                
                                                object.setBtPromotionPlanId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerInstId").equals(reader.getName())){
                                
                                                object.setOfferInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceInternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInternalIdResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceInternalIdResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","activeByDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setActiveByDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setActiveByDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","availPeriods").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAvailPeriods(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAvailPeriods(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billPeriod").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillPeriod(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillPeriod(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","distributePayback").equals(reader.getName())){
                                
                                                object.setDistributePayback(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","durationOverride").equals(reader.getName())){
                                
                                                object.setDurationOverride(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","externalAgreementId").equals(reader.getName())){
                                
                                                object.setExternalAgreementId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","firstUseDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFirstUseDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFirstUseDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","gracePeriod").equals(reader.getName())){
                                
                                                object.setGracePeriod(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inUse").equals(reader.getName())){
                                
                                                object.setInUse(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isCustom").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setIsCustom(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setIsCustom(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lastUseDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastUseDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastUseDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","minDurationDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMinDurationDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMinDurationDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","minNoticeDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMinNoticeDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMinNoticeDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextEvalDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextEvalDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextEvalDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","noticeInactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNoticeInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNoticeInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","noticeOverride").equals(reader.getName())){
                                
                                                object.setNoticeOverride(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevEvalDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrevEvalDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrevEvalDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prorateAccountEndOverride").equals(reader.getName())){
                                
                                                object.setProrateAccountEndOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prorateAccountStartOverride").equals(reader.getName())){
                                
                                                object.setProrateAccountStartOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prorateContractEndOverride").equals(reader.getName())){
                                
                                                object.setProrateContractEndOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prorateContractStrtOverride").equals(reader.getName())){
                                
                                                object.setProrateContractStrtOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prorateInterimBillOverride").equals(reader.getName())){
                                
                                                object.setProrateInterimBillOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","proratePeriodChangeOverride").equals(reader.getName())){
                                
                                                object.setProratePeriodChangeOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prorateTgtRebatesOverride").equals(reader.getName())){
                                
                                                object.setProrateTgtRebatesOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prorateTgtThresholdOverride").equals(reader.getName())){
                                
                                                object.setProrateTgtThresholdOverride(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rolloverPeriod").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRolloverPeriod(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRolloverPeriod(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rolloverPeriodStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRolloverPeriodStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRolloverPeriodStart(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalElementAmount").equals(reader.getName())){
                                
                                                object.setTotalElementAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalPeriods").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalPeriods(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalPeriods(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalSavingsAmount").equals(reader.getName())){
                                
                                                object.setTotalSavingsAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","trackTotalAmounts").equals(reader.getName())){
                                
                                                object.setTrackTotalAmounts(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
           
    