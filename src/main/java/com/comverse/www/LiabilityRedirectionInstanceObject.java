
/**
 * LiabilityRedirectionInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  LiabilityRedirectionInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LiabilityRedirectionInstanceObject extends com.comverse.www.LiabilityRedirectionInstanceIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = liabilityRedirectionInstanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AgreementId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localAgreementId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgreementIdTracker = false ;

                           public boolean isAgreementIdSpecified(){
                               return localAgreementIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getAgreementId(){
                               return localAgreementId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgreementId
                               */
                               public void setAgreementId(com.comverse.www.LongAttributeJAXBElement param){
                            localAgreementIdTracker = true;
                                   
                                            this.localAgreementId=param;
                                    

                               }
                            

                        /**
                        * field for ApplyToSubscriber
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localApplyToSubscriber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localApplyToSubscriberTracker = false ;

                           public boolean isApplyToSubscriberSpecified(){
                               return localApplyToSubscriberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getApplyToSubscriber(){
                               return localApplyToSubscriber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApplyToSubscriber
                               */
                               public void setApplyToSubscriber(com.comverse.www.BooleanAttributeJAXBElement param){
                            localApplyToSubscriberTracker = param != null;
                                   
                                            this.localApplyToSubscriber=param;
                                    

                               }
                            

                        /**
                        * field for CalendarId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localCalendarId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCalendarIdTracker = false ;

                           public boolean isCalendarIdSpecified(){
                               return localCalendarIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getCalendarId(){
                               return localCalendarId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CalendarId
                               */
                               public void setCalendarId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localCalendarIdTracker = true;
                                   
                                            this.localCalendarId=param;
                                    

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
                        * field for IsTargetSsPending
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsTargetSsPending ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsTargetSsPendingTracker = false ;

                           public boolean isIsTargetSsPendingSpecified(){
                               return localIsTargetSsPendingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsTargetSsPending(){
                               return localIsTargetSsPending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsTargetSsPending
                               */
                               public void setIsTargetSsPending(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsTargetSsPendingTracker = param != null;
                                   
                                            this.localIsTargetSsPending=param;
                                    

                               }
                            

                        /**
                        * field for LrOverrideFlag
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localLrOverrideFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLrOverrideFlagTracker = false ;

                           public boolean isLrOverrideFlagSpecified(){
                               return localLrOverrideFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getLrOverrideFlag(){
                               return localLrOverrideFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LrOverrideFlag
                               */
                               public void setLrOverrideFlag(com.comverse.www.BooleanAttributeJAXBElement param){
                            localLrOverrideFlagTracker = param != null;
                                   
                                            this.localLrOverrideFlag=param;
                                    

                               }
                            

                        /**
                        * field for LrOverrideId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localLrOverrideId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLrOverrideIdTracker = false ;

                           public boolean isLrOverrideIdSpecified(){
                               return localLrOverrideIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getLrOverrideId(){
                               return localLrOverrideId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LrOverrideId
                               */
                               public void setLrOverrideId(com.comverse.www.ShortAttributeJAXBElement param){
                            localLrOverrideIdTracker = true;
                                   
                                            this.localLrOverrideId=param;
                                    

                               }
                            

                        /**
                        * field for LrTemplateId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localLrTemplateId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLrTemplateIdTracker = false ;

                           public boolean isLrTemplateIdSpecified(){
                               return localLrTemplateIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getLrTemplateId(){
                               return localLrTemplateId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LrTemplateId
                               */
                               public void setLrTemplateId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localLrTemplateIdTracker = param != null;
                                   
                                            this.localLrTemplateId=param;
                                    

                               }
                            

                        /**
                        * field for Priority
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localPriority ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPriorityTracker = false ;

                           public boolean isPrioritySpecified(){
                               return localPriorityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getPriority(){
                               return localPriority;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Priority
                               */
                               public void setPriority(com.comverse.www.IntegerAttributeJAXBElement param){
                            localPriorityTracker = param != null;
                                   
                                            this.localPriority=param;
                                    

                               }
                            

                        /**
                        * field for RateByTarget
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRateByTarget ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRateByTargetTracker = false ;

                           public boolean isRateByTargetSpecified(){
                               return localRateByTargetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRateByTarget(){
                               return localRateByTarget;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RateByTarget
                               */
                               public void setRateByTarget(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRateByTargetTracker = param != null;
                                   
                                            this.localRateByTarget=param;
                                    

                               }
                            

                        /**
                        * field for RedirectActiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localRedirectActiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRedirectActiveDtTracker = false ;

                           public boolean isRedirectActiveDtSpecified(){
                               return localRedirectActiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getRedirectActiveDt(){
                               return localRedirectActiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RedirectActiveDt
                               */
                               public void setRedirectActiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localRedirectActiveDtTracker = param != null;
                                   
                                            this.localRedirectActiveDt=param;
                                    

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
                        * field for SourceAccountExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localSourceAccountExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceAccountExternalIdTracker = false ;

                           public boolean isSourceAccountExternalIdSpecified(){
                               return localSourceAccountExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getSourceAccountExternalId(){
                               return localSourceAccountExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SourceAccountExternalId
                               */
                               public void setSourceAccountExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localSourceAccountExternalIdTracker = true;
                                   
                                            this.localSourceAccountExternalId=param;
                                    

                               }
                            

                        /**
                        * field for SourceAccountNo
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localSourceAccountNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceAccountNoTracker = false ;

                           public boolean isSourceAccountNoSpecified(){
                               return localSourceAccountNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getSourceAccountNo(){
                               return localSourceAccountNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SourceAccountNo
                               */
                               public void setSourceAccountNo(com.comverse.www.IntegerAttributeJAXBElement param){
                            localSourceAccountNoTracker = param != null;
                                   
                                            this.localSourceAccountNo=param;
                                    

                               }
                            

                        /**
                        * field for SourceLriId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localSourceLriId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceLriIdTracker = false ;

                           public boolean isSourceLriIdSpecified(){
                               return localSourceLriIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getSourceLriId(){
                               return localSourceLriId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SourceLriId
                               */
                               public void setSourceLriId(com.comverse.www.LongAttributeJAXBElement param){
                            localSourceLriIdTracker = true;
                                   
                                            this.localSourceLriId=param;
                                    

                               }
                            

                        /**
                        * field for SourceSubscrNo
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localSourceSubscrNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceSubscrNoTracker = false ;

                           public boolean isSourceSubscrNoSpecified(){
                               return localSourceSubscrNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getSourceSubscrNo(){
                               return localSourceSubscrNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SourceSubscrNo
                               */
                               public void setSourceSubscrNo(com.comverse.www.IntegerAttributeJAXBElement param){
                            localSourceSubscrNoTracker = true;
                                   
                                            this.localSourceSubscrNo=param;
                                    

                               }
                            

                        /**
                        * field for SourceSubscrNoResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localSourceSubscrNoResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceSubscrNoResetsTracker = false ;

                           public boolean isSourceSubscrNoResetsSpecified(){
                               return localSourceSubscrNoResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getSourceSubscrNoResets(){
                               return localSourceSubscrNoResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SourceSubscrNoResets
                               */
                               public void setSourceSubscrNoResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localSourceSubscrNoResetsTracker = true;
                                   
                                            this.localSourceSubscrNoResets=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localSubscriberExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberExternalIdTracker = false ;

                           public boolean isSubscriberExternalIdSpecified(){
                               return localSubscriberExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getSubscriberExternalId(){
                               return localSubscriberExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberExternalId
                               */
                               public void setSubscriberExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localSubscriberExternalIdTracker = true;
                                   
                                            this.localSubscriberExternalId=param;
                                    

                               }
                            

                        /**
                        * field for TargetAccountExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localTargetAccountExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetAccountExternalIdTracker = false ;

                           public boolean isTargetAccountExternalIdSpecified(){
                               return localTargetAccountExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getTargetAccountExternalId(){
                               return localTargetAccountExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetAccountExternalId
                               */
                               public void setTargetAccountExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localTargetAccountExternalIdTracker = true;
                                   
                                            this.localTargetAccountExternalId=param;
                                    

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
                            localTargetAccountNoTracker = param != null;
                                   
                                            this.localTargetAccountNo=param;
                                    

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
                           namespacePrefix+":liabilityRedirectionInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "liabilityRedirectionInstanceObject",
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
                              if (localLiabilityRedirectInstIdTracker){
                                            if (localLiabilityRedirectInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("liabilityRedirectInstId cannot be null!!");
                                            }
                                           localLiabilityRedirectInstId.serialize(new javax.xml.namespace.QName("","liabilityRedirectInstId"),
                                               xmlWriter);
                                        } if (localAgreementIdTracker){
                                    if (localAgreementId==null){

                                        writeStartElement(null, "", "agreementId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAgreementId.serialize(new javax.xml.namespace.QName("","agreementId"),
                                        xmlWriter);
                                    }
                                } if (localApplyToSubscriberTracker){
                                            if (localApplyToSubscriber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("applyToSubscriber cannot be null!!");
                                            }
                                           localApplyToSubscriber.serialize(new javax.xml.namespace.QName("","applyToSubscriber"),
                                               xmlWriter);
                                        } if (localCalendarIdTracker){
                                    if (localCalendarId==null){

                                        writeStartElement(null, "", "calendarId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCalendarId.serialize(new javax.xml.namespace.QName("","calendarId"),
                                        xmlWriter);
                                    }
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
                                        } if (localIsTargetSsPendingTracker){
                                            if (localIsTargetSsPending==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isTargetSsPending cannot be null!!");
                                            }
                                           localIsTargetSsPending.serialize(new javax.xml.namespace.QName("","isTargetSsPending"),
                                               xmlWriter);
                                        } if (localLrOverrideFlagTracker){
                                            if (localLrOverrideFlag==null){
                                                 throw new org.apache.axis2.databinding.ADBException("lrOverrideFlag cannot be null!!");
                                            }
                                           localLrOverrideFlag.serialize(new javax.xml.namespace.QName("","lrOverrideFlag"),
                                               xmlWriter);
                                        } if (localLrOverrideIdTracker){
                                    if (localLrOverrideId==null){

                                        writeStartElement(null, "", "lrOverrideId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLrOverrideId.serialize(new javax.xml.namespace.QName("","lrOverrideId"),
                                        xmlWriter);
                                    }
                                } if (localLrTemplateIdTracker){
                                            if (localLrTemplateId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("lrTemplateId cannot be null!!");
                                            }
                                           localLrTemplateId.serialize(new javax.xml.namespace.QName("","lrTemplateId"),
                                               xmlWriter);
                                        } if (localPriorityTracker){
                                            if (localPriority==null){
                                                 throw new org.apache.axis2.databinding.ADBException("priority cannot be null!!");
                                            }
                                           localPriority.serialize(new javax.xml.namespace.QName("","priority"),
                                               xmlWriter);
                                        } if (localRateByTargetTracker){
                                            if (localRateByTarget==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rateByTarget cannot be null!!");
                                            }
                                           localRateByTarget.serialize(new javax.xml.namespace.QName("","rateByTarget"),
                                               xmlWriter);
                                        } if (localRedirectActiveDtTracker){
                                            if (localRedirectActiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("redirectActiveDt cannot be null!!");
                                            }
                                           localRedirectActiveDt.serialize(new javax.xml.namespace.QName("","redirectActiveDt"),
                                               xmlWriter);
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
                                } if (localSourceAccountExternalIdTracker){
                                    if (localSourceAccountExternalId==null){

                                        writeStartElement(null, "", "sourceAccountExternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSourceAccountExternalId.serialize(new javax.xml.namespace.QName("","sourceAccountExternalId"),
                                        xmlWriter);
                                    }
                                } if (localSourceAccountNoTracker){
                                            if (localSourceAccountNo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("sourceAccountNo cannot be null!!");
                                            }
                                           localSourceAccountNo.serialize(new javax.xml.namespace.QName("","sourceAccountNo"),
                                               xmlWriter);
                                        } if (localSourceLriIdTracker){
                                    if (localSourceLriId==null){

                                        writeStartElement(null, "", "sourceLriId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSourceLriId.serialize(new javax.xml.namespace.QName("","sourceLriId"),
                                        xmlWriter);
                                    }
                                } if (localSourceSubscrNoTracker){
                                    if (localSourceSubscrNo==null){

                                        writeStartElement(null, "", "sourceSubscrNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSourceSubscrNo.serialize(new javax.xml.namespace.QName("","sourceSubscrNo"),
                                        xmlWriter);
                                    }
                                } if (localSourceSubscrNoResetsTracker){
                                    if (localSourceSubscrNoResets==null){

                                        writeStartElement(null, "", "sourceSubscrNoResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSourceSubscrNoResets.serialize(new javax.xml.namespace.QName("","sourceSubscrNoResets"),
                                        xmlWriter);
                                    }
                                } if (localSubscriberExternalIdTracker){
                                    if (localSubscriberExternalId==null){

                                        writeStartElement(null, "", "subscriberExternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSubscriberExternalId.serialize(new javax.xml.namespace.QName("","subscriberExternalId"),
                                        xmlWriter);
                                    }
                                } if (localTargetAccountExternalIdTracker){
                                    if (localTargetAccountExternalId==null){

                                        writeStartElement(null, "", "targetAccountExternalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetAccountExternalId.serialize(new javax.xml.namespace.QName("","targetAccountExternalId"),
                                        xmlWriter);
                                    }
                                } if (localTargetAccountNoTracker){
                                            if (localTargetAccountNo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("targetAccountNo cannot be null!!");
                                            }
                                           localTargetAccountNo.serialize(new javax.xml.namespace.QName("","targetAccountNo"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","liabilityRedirectionInstanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localLiabilityRedirectInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "liabilityRedirectInstId"));
                            
                            
                                    if (localLiabilityRedirectInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("liabilityRedirectInstId cannot be null!!");
                                    }
                                    elementList.add(localLiabilityRedirectInstId);
                                } if (localAgreementIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "agreementId"));
                            
                            
                                    elementList.add(localAgreementId==null?null:
                                    localAgreementId);
                                } if (localApplyToSubscriberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyToSubscriber"));
                            
                            
                                    if (localApplyToSubscriber==null){
                                         throw new org.apache.axis2.databinding.ADBException("applyToSubscriber cannot be null!!");
                                    }
                                    elementList.add(localApplyToSubscriber);
                                } if (localCalendarIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "calendarId"));
                            
                            
                                    elementList.add(localCalendarId==null?null:
                                    localCalendarId);
                                } if (localCalledNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "calledNumber"));
                            
                            
                                    elementList.add(localCalledNumber==null?null:
                                    localCalledNumber);
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
                                } if (localIsTargetSsPendingTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isTargetSsPending"));
                            
                            
                                    if (localIsTargetSsPending==null){
                                         throw new org.apache.axis2.databinding.ADBException("isTargetSsPending cannot be null!!");
                                    }
                                    elementList.add(localIsTargetSsPending);
                                } if (localLrOverrideFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lrOverrideFlag"));
                            
                            
                                    if (localLrOverrideFlag==null){
                                         throw new org.apache.axis2.databinding.ADBException("lrOverrideFlag cannot be null!!");
                                    }
                                    elementList.add(localLrOverrideFlag);
                                } if (localLrOverrideIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lrOverrideId"));
                            
                            
                                    elementList.add(localLrOverrideId==null?null:
                                    localLrOverrideId);
                                } if (localLrTemplateIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "lrTemplateId"));
                            
                            
                                    if (localLrTemplateId==null){
                                         throw new org.apache.axis2.databinding.ADBException("lrTemplateId cannot be null!!");
                                    }
                                    elementList.add(localLrTemplateId);
                                } if (localPriorityTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "priority"));
                            
                            
                                    if (localPriority==null){
                                         throw new org.apache.axis2.databinding.ADBException("priority cannot be null!!");
                                    }
                                    elementList.add(localPriority);
                                } if (localRateByTargetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rateByTarget"));
                            
                            
                                    if (localRateByTarget==null){
                                         throw new org.apache.axis2.databinding.ADBException("rateByTarget cannot be null!!");
                                    }
                                    elementList.add(localRateByTarget);
                                } if (localRedirectActiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectActiveDt"));
                            
                            
                                    if (localRedirectActiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("redirectActiveDt cannot be null!!");
                                    }
                                    elementList.add(localRedirectActiveDt);
                                } if (localRedirectInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "redirectInactiveDt"));
                            
                            
                                    elementList.add(localRedirectInactiveDt==null?null:
                                    localRedirectInactiveDt);
                                } if (localSourceAccountExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "sourceAccountExternalId"));
                            
                            
                                    elementList.add(localSourceAccountExternalId==null?null:
                                    localSourceAccountExternalId);
                                } if (localSourceAccountNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "sourceAccountNo"));
                            
                            
                                    if (localSourceAccountNo==null){
                                         throw new org.apache.axis2.databinding.ADBException("sourceAccountNo cannot be null!!");
                                    }
                                    elementList.add(localSourceAccountNo);
                                } if (localSourceLriIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "sourceLriId"));
                            
                            
                                    elementList.add(localSourceLriId==null?null:
                                    localSourceLriId);
                                } if (localSourceSubscrNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "sourceSubscrNo"));
                            
                            
                                    elementList.add(localSourceSubscrNo==null?null:
                                    localSourceSubscrNo);
                                } if (localSourceSubscrNoResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "sourceSubscrNoResets"));
                            
                            
                                    elementList.add(localSourceSubscrNoResets==null?null:
                                    localSourceSubscrNoResets);
                                } if (localSubscriberExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subscriberExternalId"));
                            
                            
                                    elementList.add(localSubscriberExternalId==null?null:
                                    localSubscriberExternalId);
                                } if (localTargetAccountExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountExternalId"));
                            
                            
                                    elementList.add(localTargetAccountExternalId==null?null:
                                    localTargetAccountExternalId);
                                } if (localTargetAccountNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountNo"));
                            
                            
                                    if (localTargetAccountNo==null){
                                         throw new org.apache.axis2.databinding.ADBException("targetAccountNo cannot be null!!");
                                    }
                                    elementList.add(localTargetAccountNo);
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
        public static LiabilityRedirectionInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LiabilityRedirectionInstanceObject object =
                new LiabilityRedirectionInstanceObject();

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
                    
                            if (!"liabilityRedirectionInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LiabilityRedirectionInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","liabilityRedirectInstId").equals(reader.getName())){
                                
                                                object.setLiabilityRedirectInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","agreementId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAgreementId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAgreementId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","applyToSubscriber").equals(reader.getName())){
                                
                                                object.setApplyToSubscriber(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","calendarId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCalendarId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCalendarId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isTargetSsPending").equals(reader.getName())){
                                
                                                object.setIsTargetSsPending(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lrOverrideFlag").equals(reader.getName())){
                                
                                                object.setLrOverrideFlag(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lrOverrideId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLrOverrideId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLrOverrideId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","lrTemplateId").equals(reader.getName())){
                                
                                                object.setLrTemplateId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","priority").equals(reader.getName())){
                                
                                                object.setPriority(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rateByTarget").equals(reader.getName())){
                                
                                                object.setRateByTarget(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","redirectActiveDt").equals(reader.getName())){
                                
                                                object.setRedirectActiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sourceAccountExternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSourceAccountExternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSourceAccountExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sourceAccountNo").equals(reader.getName())){
                                
                                                object.setSourceAccountNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sourceLriId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSourceLriId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSourceLriId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sourceSubscrNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSourceSubscrNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSourceSubscrNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sourceSubscrNoResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSourceSubscrNoResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSourceSubscrNoResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberExternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSubscriberExternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSubscriberExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetAccountExternalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetAccountExternalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetAccountExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetAccountNo").equals(reader.getName())){
                                
                                                object.setTargetAccountNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    