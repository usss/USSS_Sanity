
/**
 * OfferInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  OfferInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OfferInstanceObject extends com.comverse.www.OfferInstanceIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = offerInstanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

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
                        * field for BonusCheckDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localBonusCheckDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBonusCheckDateTracker = false ;

                           public boolean isBonusCheckDateSpecified(){
                               return localBonusCheckDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getBonusCheckDate(){
                               return localBonusCheckDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BonusCheckDate
                               */
                               public void setBonusCheckDate(com.comverse.www.DateAttributeJAXBElement param){
                            localBonusCheckDateTracker = true;
                                   
                                            this.localBonusCheckDate=param;
                                    

                               }
                            

                        /**
                        * field for BundleId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localBundleId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleIdTracker = false ;

                           public boolean isBundleIdSpecified(){
                               return localBundleIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getBundleId(){
                               return localBundleId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleId
                               */
                               public void setBundleId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localBundleIdTracker = true;
                                   
                                            this.localBundleId=param;
                                    

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
                        * field for CampaignTargetInstId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localCampaignTargetInstId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCampaignTargetInstIdTracker = false ;

                           public boolean isCampaignTargetInstIdSpecified(){
                               return localCampaignTargetInstIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getCampaignTargetInstId(){
                               return localCampaignTargetInstId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignTargetInstId
                               */
                               public void setCampaignTargetInstId(com.comverse.www.LongAttributeJAXBElement param){
                            localCampaignTargetInstIdTracker = true;
                                   
                                            this.localCampaignTargetInstId=param;
                                    

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
                        * field for ConnectReason
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localConnectReason ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConnectReasonTracker = false ;

                           public boolean isConnectReasonSpecified(){
                               return localConnectReasonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getConnectReason(){
                               return localConnectReason;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConnectReason
                               */
                               public void setConnectReason(com.comverse.www.ShortAttributeJAXBElement param){
                            localConnectReasonTracker = param != null;
                                   
                                            this.localConnectReason=param;
                                    

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
                        * field for DisconnectReason
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localDisconnectReason ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisconnectReasonTracker = false ;

                           public boolean isDisconnectReasonSpecified(){
                               return localDisconnectReasonTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getDisconnectReason(){
                               return localDisconnectReason;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisconnectReason
                               */
                               public void setDisconnectReason(com.comverse.www.ShortAttributeJAXBElement param){
                            localDisconnectReasonTracker = true;
                                   
                                            this.localDisconnectReason=param;
                                    

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
                        * field for GuidedAccountNo
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localGuidedAccountNo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuidedAccountNoTracker = false ;

                           public boolean isGuidedAccountNoSpecified(){
                               return localGuidedAccountNoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getGuidedAccountNo(){
                               return localGuidedAccountNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuidedAccountNo
                               */
                               public void setGuidedAccountNo(com.comverse.www.IntegerAttributeJAXBElement param){
                            localGuidedAccountNoTracker = true;
                                   
                                            this.localGuidedAccountNo=param;
                                    

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
                        * field for InactiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localInactiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInactiveDtTracker = false ;

                           public boolean isInactiveDtSpecified(){
                               return localInactiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getInactiveDt(){
                               return localInactiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactiveDt
                               */
                               public void setInactiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localInactiveDtTracker = true;
                                   
                                            this.localInactiveDt=param;
                                    

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
                            localIntendedViewEffectiveDtTracker = true;
                                   
                                            this.localIntendedViewEffectiveDt=param;
                                    

                               }
                            

                        /**
                        * field for OfferId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localOfferId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOfferIdTracker = false ;

                           public boolean isOfferIdSpecified(){
                               return localOfferIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getOfferId(){
                               return localOfferId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferId
                               */
                               public void setOfferId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localOfferIdTracker = param != null;
                                   
                                            this.localOfferId=param;
                                    

                               }
                            

                        /**
                        * field for OfferState
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localOfferState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOfferStateTracker = false ;

                           public boolean isOfferStateSpecified(){
                               return localOfferStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getOfferState(){
                               return localOfferState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferState
                               */
                               public void setOfferState(com.comverse.www.ShortAttributeJAXBElement param){
                            localOfferStateTracker = param != null;
                                   
                                            this.localOfferState=param;
                                    

                               }
                            

                        /**
                        * field for OfferType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localOfferType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOfferTypeTracker = false ;

                           public boolean isOfferTypeSpecified(){
                               return localOfferTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getOfferType(){
                               return localOfferType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OfferType
                               */
                               public void setOfferType(com.comverse.www.ShortAttributeJAXBElement param){
                            localOfferTypeTracker = param != null;
                                   
                                            this.localOfferType=param;
                                    

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
                        * field for PrevInactiveDt
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localPrevInactiveDt ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrevInactiveDtTracker = false ;

                           public boolean isPrevInactiveDtSpecified(){
                               return localPrevInactiveDtTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getPrevInactiveDt(){
                               return localPrevInactiveDt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrevInactiveDt
                               */
                               public void setPrevInactiveDt(com.comverse.www.DateAttributeJAXBElement param){
                            localPrevInactiveDtTracker = true;
                                   
                                            this.localPrevInactiveDt=param;
                                    

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
                        * field for QualifiedAwardsCounter
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localQualifiedAwardsCounter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQualifiedAwardsCounterTracker = false ;

                           public boolean isQualifiedAwardsCounterSpecified(){
                               return localQualifiedAwardsCounterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getQualifiedAwardsCounter(){
                               return localQualifiedAwardsCounter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QualifiedAwardsCounter
                               */
                               public void setQualifiedAwardsCounter(com.comverse.www.IntegerAttributeJAXBElement param){
                            localQualifiedAwardsCounterTracker = true;
                                   
                                            this.localQualifiedAwardsCounter=param;
                                    

                               }
                            

                        /**
                        * field for SelectionType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localSelectionType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSelectionTypeTracker = false ;

                           public boolean isSelectionTypeSpecified(){
                               return localSelectionTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getSelectionType(){
                               return localSelectionType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SelectionType
                               */
                               public void setSelectionType(com.comverse.www.ShortAttributeJAXBElement param){
                            localSelectionTypeTracker = true;
                                   
                                            this.localSelectionType=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInternalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localServiceInternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceInternalIdTracker = false ;

                           public boolean isServiceInternalIdSpecified(){
                               return localServiceInternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getServiceInternalId(){
                               return localServiceInternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInternalId
                               */
                               public void setServiceInternalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localServiceInternalIdTracker = true;
                                   
                                            this.localServiceInternalId=param;
                                    

                               }
                            

                        /**
                        * field for ServiceInternalIdResets
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localServiceInternalIdResets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceInternalIdResetsTracker = false ;

                           public boolean isServiceInternalIdResetsSpecified(){
                               return localServiceInternalIdResetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getServiceInternalIdResets(){
                               return localServiceInternalIdResets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceInternalIdResets
                               */
                               public void setServiceInternalIdResets(com.comverse.www.ShortAttributeJAXBElement param){
                            localServiceInternalIdResetsTracker = true;
                                   
                                            this.localServiceInternalIdResets=param;
                                    

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
                        * field for WaiveActivation
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localWaiveActivation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWaiveActivationTracker = false ;

                           public boolean isWaiveActivationSpecified(){
                               return localWaiveActivationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getWaiveActivation(){
                               return localWaiveActivation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WaiveActivation
                               */
                               public void setWaiveActivation(com.comverse.www.BooleanAttributeJAXBElement param){
                            localWaiveActivationTracker = param != null;
                                   
                                            this.localWaiveActivation=param;
                                    

                               }
                            

                        /**
                        * field for WaiveTermination
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localWaiveTermination ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWaiveTerminationTracker = false ;

                           public boolean isWaiveTerminationSpecified(){
                               return localWaiveTerminationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getWaiveTermination(){
                               return localWaiveTermination;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WaiveTermination
                               */
                               public void setWaiveTermination(com.comverse.www.BooleanAttributeJAXBElement param){
                            localWaiveTerminationTracker = param != null;
                                   
                                            this.localWaiveTermination=param;
                                    

                               }
                            

                        /**
                        * field for WaiveUnmetCommitment
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localWaiveUnmetCommitment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWaiveUnmetCommitmentTracker = false ;

                           public boolean isWaiveUnmetCommitmentSpecified(){
                               return localWaiveUnmetCommitmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getWaiveUnmetCommitment(){
                               return localWaiveUnmetCommitment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WaiveUnmetCommitment
                               */
                               public void setWaiveUnmetCommitment(com.comverse.www.BooleanAttributeJAXBElement param){
                            localWaiveUnmetCommitmentTracker = param != null;
                                   
                                            this.localWaiveUnmetCommitment=param;
                                    

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
                           namespacePrefix+":offerInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "offerInstanceObject",
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
                              if (localViewIdTracker){
                                            if (localViewId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("viewId cannot be null!!");
                                            }
                                           localViewId.serialize(new javax.xml.namespace.QName("","viewId"),
                                               xmlWriter);
                                        } if (localOfferInstIdTracker){
                                            if (localOfferInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("offerInstId cannot be null!!");
                                            }
                                           localOfferInstId.serialize(new javax.xml.namespace.QName("","offerInstId"),
                                               xmlWriter);
                                        } if (localAccountInternalIdTracker){
                                            if (localAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                            }
                                           localAccountInternalId.serialize(new javax.xml.namespace.QName("","accountInternalId"),
                                               xmlWriter);
                                        } if (localActiveDtTracker){
                                            if (localActiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activeDt cannot be null!!");
                                            }
                                           localActiveDt.serialize(new javax.xml.namespace.QName("","activeDt"),
                                               xmlWriter);
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
                                } if (localBonusCheckDateTracker){
                                    if (localBonusCheckDate==null){

                                        writeStartElement(null, "", "bonusCheckDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBonusCheckDate.serialize(new javax.xml.namespace.QName("","bonusCheckDate"),
                                        xmlWriter);
                                    }
                                } if (localBundleIdTracker){
                                    if (localBundleId==null){

                                        writeStartElement(null, "", "bundleId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBundleId.serialize(new javax.xml.namespace.QName("","bundleId"),
                                        xmlWriter);
                                    }
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
                                } if (localCampaignTargetInstIdTracker){
                                    if (localCampaignTargetInstId==null){

                                        writeStartElement(null, "", "campaignTargetInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCampaignTargetInstId.serialize(new javax.xml.namespace.QName("","campaignTargetInstId"),
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
                                        } if (localConnectReasonTracker){
                                            if (localConnectReason==null){
                                                 throw new org.apache.axis2.databinding.ADBException("connectReason cannot be null!!");
                                            }
                                           localConnectReason.serialize(new javax.xml.namespace.QName("","connectReason"),
                                               xmlWriter);
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
                                } if (localDisconnectReasonTracker){
                                    if (localDisconnectReason==null){

                                        writeStartElement(null, "", "disconnectReason", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDisconnectReason.serialize(new javax.xml.namespace.QName("","disconnectReason"),
                                        xmlWriter);
                                    }
                                } if (localExtendedDataTracker){
                                            if (localExtendedData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                            }
                                           localExtendedData.serialize(new javax.xml.namespace.QName("","extendedData"),
                                               xmlWriter);
                                        } if (localExternalAgreementIdTracker){
                                            if (localExternalAgreementId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("externalAgreementId cannot be null!!");
                                            }
                                           localExternalAgreementId.serialize(new javax.xml.namespace.QName("","externalAgreementId"),
                                               xmlWriter);
                                        } if (localGuidedAccountNoTracker){
                                    if (localGuidedAccountNo==null){

                                        writeStartElement(null, "", "guidedAccountNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGuidedAccountNo.serialize(new javax.xml.namespace.QName("","guidedAccountNo"),
                                        xmlWriter);
                                    }
                                } if (localInUseTracker){
                                            if (localInUse==null){
                                                 throw new org.apache.axis2.databinding.ADBException("inUse cannot be null!!");
                                            }
                                           localInUse.serialize(new javax.xml.namespace.QName("","inUse"),
                                               xmlWriter);
                                        } if (localInactiveDtTracker){
                                    if (localInactiveDt==null){

                                        writeStartElement(null, "", "inactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInactiveDt.serialize(new javax.xml.namespace.QName("","inactiveDt"),
                                        xmlWriter);
                                    }
                                } if (localIntendedViewEffectiveDtTracker){
                                    if (localIntendedViewEffectiveDt==null){

                                        writeStartElement(null, "", "intendedViewEffectiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localIntendedViewEffectiveDt.serialize(new javax.xml.namespace.QName("","intendedViewEffectiveDt"),
                                        xmlWriter);
                                    }
                                } if (localOfferIdTracker){
                                            if (localOfferId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("offerId cannot be null!!");
                                            }
                                           localOfferId.serialize(new javax.xml.namespace.QName("","offerId"),
                                               xmlWriter);
                                        } if (localOfferStateTracker){
                                            if (localOfferState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("offerState cannot be null!!");
                                            }
                                           localOfferState.serialize(new javax.xml.namespace.QName("","offerState"),
                                               xmlWriter);
                                        } if (localOfferTypeTracker){
                                            if (localOfferType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("offerType cannot be null!!");
                                            }
                                           localOfferType.serialize(new javax.xml.namespace.QName("","offerType"),
                                               xmlWriter);
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
                                } if (localPaymentModeTracker){
                                            if (localPaymentMode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("paymentMode cannot be null!!");
                                            }
                                           localPaymentMode.serialize(new javax.xml.namespace.QName("","paymentMode"),
                                               xmlWriter);
                                        } if (localPrevInactiveDtTracker){
                                    if (localPrevInactiveDt==null){

                                        writeStartElement(null, "", "prevInactiveDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrevInactiveDt.serialize(new javax.xml.namespace.QName("","prevInactiveDt"),
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
                                } if (localQualifiedAwardsCounterTracker){
                                    if (localQualifiedAwardsCounter==null){

                                        writeStartElement(null, "", "qualifiedAwardsCounter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localQualifiedAwardsCounter.serialize(new javax.xml.namespace.QName("","qualifiedAwardsCounter"),
                                        xmlWriter);
                                    }
                                } if (localSelectionTypeTracker){
                                    if (localSelectionType==null){

                                        writeStartElement(null, "", "selectionType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSelectionType.serialize(new javax.xml.namespace.QName("","selectionType"),
                                        xmlWriter);
                                    }
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
                                        } if (localWaiveActivationTracker){
                                            if (localWaiveActivation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("waiveActivation cannot be null!!");
                                            }
                                           localWaiveActivation.serialize(new javax.xml.namespace.QName("","waiveActivation"),
                                               xmlWriter);
                                        } if (localWaiveTerminationTracker){
                                            if (localWaiveTermination==null){
                                                 throw new org.apache.axis2.databinding.ADBException("waiveTermination cannot be null!!");
                                            }
                                           localWaiveTermination.serialize(new javax.xml.namespace.QName("","waiveTermination"),
                                               xmlWriter);
                                        } if (localWaiveUnmetCommitmentTracker){
                                            if (localWaiveUnmetCommitment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("waiveUnmetCommitment cannot be null!!");
                                            }
                                           localWaiveUnmetCommitment.serialize(new javax.xml.namespace.QName("","waiveUnmetCommitment"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","offerInstanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localViewIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "viewId"));
                            
                            
                                    if (localViewId==null){
                                         throw new org.apache.axis2.databinding.ADBException("viewId cannot be null!!");
                                    }
                                    elementList.add(localViewId);
                                } if (localOfferInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerInstId"));
                            
                            
                                    if (localOfferInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("offerInstId cannot be null!!");
                                    }
                                    elementList.add(localOfferInstId);
                                } if (localAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountInternalId"));
                            
                            
                                    if (localAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                    }
                                    elementList.add(localAccountInternalId);
                                } if (localActiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activeDt"));
                            
                            
                                    if (localActiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("activeDt cannot be null!!");
                                    }
                                    elementList.add(localActiveDt);
                                } if (localAgentIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "agentId"));
                            
                            
                                    elementList.add(localAgentId==null?null:
                                    localAgentId);
                                } if (localBonusCheckDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bonusCheckDate"));
                            
                            
                                    elementList.add(localBonusCheckDate==null?null:
                                    localBonusCheckDate);
                                } if (localBundleIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleId"));
                            
                            
                                    elementList.add(localBundleId==null?null:
                                    localBundleId);
                                } if (localBundleInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleInstId"));
                            
                            
                                    elementList.add(localBundleInstId==null?null:
                                    localBundleInstId);
                                } if (localCampaignTargetInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "campaignTargetInstId"));
                            
                            
                                    elementList.add(localCampaignTargetInstId==null?null:
                                    localCampaignTargetInstId);
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
                                } if (localConnectReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "connectReason"));
                            
                            
                                    if (localConnectReason==null){
                                         throw new org.apache.axis2.databinding.ADBException("connectReason cannot be null!!");
                                    }
                                    elementList.add(localConnectReason);
                                } if (localDealerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dealerId"));
                            
                            
                                    elementList.add(localDealerId==null?null:
                                    localDealerId);
                                } if (localDisconnectReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "disconnectReason"));
                            
                            
                                    elementList.add(localDisconnectReason==null?null:
                                    localDisconnectReason);
                                } if (localExtendedDataTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "extendedData"));
                            
                            
                                    if (localExtendedData==null){
                                         throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                    }
                                    elementList.add(localExtendedData);
                                } if (localExternalAgreementIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "externalAgreementId"));
                            
                            
                                    if (localExternalAgreementId==null){
                                         throw new org.apache.axis2.databinding.ADBException("externalAgreementId cannot be null!!");
                                    }
                                    elementList.add(localExternalAgreementId);
                                } if (localGuidedAccountNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "guidedAccountNo"));
                            
                            
                                    elementList.add(localGuidedAccountNo==null?null:
                                    localGuidedAccountNo);
                                } if (localInUseTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inUse"));
                            
                            
                                    if (localInUse==null){
                                         throw new org.apache.axis2.databinding.ADBException("inUse cannot be null!!");
                                    }
                                    elementList.add(localInUse);
                                } if (localInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inactiveDt"));
                            
                            
                                    elementList.add(localInactiveDt==null?null:
                                    localInactiveDt);
                                } if (localIntendedViewEffectiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "intendedViewEffectiveDt"));
                            
                            
                                    elementList.add(localIntendedViewEffectiveDt==null?null:
                                    localIntendedViewEffectiveDt);
                                } if (localOfferIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerId"));
                            
                            
                                    if (localOfferId==null){
                                         throw new org.apache.axis2.databinding.ADBException("offerId cannot be null!!");
                                    }
                                    elementList.add(localOfferId);
                                } if (localOfferStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerState"));
                            
                            
                                    if (localOfferState==null){
                                         throw new org.apache.axis2.databinding.ADBException("offerState cannot be null!!");
                                    }
                                    elementList.add(localOfferState);
                                } if (localOfferTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offerType"));
                            
                            
                                    if (localOfferType==null){
                                         throw new org.apache.axis2.databinding.ADBException("offerType cannot be null!!");
                                    }
                                    elementList.add(localOfferType);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    elementList.add(localParentAccountInternalId==null?null:
                                    localParentAccountInternalId);
                                } if (localPaymentModeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "paymentMode"));
                            
                            
                                    if (localPaymentMode==null){
                                         throw new org.apache.axis2.databinding.ADBException("paymentMode cannot be null!!");
                                    }
                                    elementList.add(localPaymentMode);
                                } if (localPrevInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevInactiveDt"));
                            
                            
                                    elementList.add(localPrevInactiveDt==null?null:
                                    localPrevInactiveDt);
                                } if (localPrevViewIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevViewId"));
                            
                            
                                    elementList.add(localPrevViewId==null?null:
                                    localPrevViewId);
                                } if (localQualifiedAwardsCounterTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "qualifiedAwardsCounter"));
                            
                            
                                    elementList.add(localQualifiedAwardsCounter==null?null:
                                    localQualifiedAwardsCounter);
                                } if (localSelectionTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "selectionType"));
                            
                            
                                    elementList.add(localSelectionType==null?null:
                                    localSelectionType);
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
                                } if (localWaiveActivationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "waiveActivation"));
                            
                            
                                    if (localWaiveActivation==null){
                                         throw new org.apache.axis2.databinding.ADBException("waiveActivation cannot be null!!");
                                    }
                                    elementList.add(localWaiveActivation);
                                } if (localWaiveTerminationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "waiveTermination"));
                            
                            
                                    if (localWaiveTermination==null){
                                         throw new org.apache.axis2.databinding.ADBException("waiveTermination cannot be null!!");
                                    }
                                    elementList.add(localWaiveTermination);
                                } if (localWaiveUnmetCommitmentTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "waiveUnmetCommitment"));
                            
                            
                                    if (localWaiveUnmetCommitment==null){
                                         throw new org.apache.axis2.databinding.ADBException("waiveUnmetCommitment cannot be null!!");
                                    }
                                    elementList.add(localWaiveUnmetCommitment);
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
        public static OfferInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OfferInstanceObject object =
                new OfferInstanceObject();

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
                    
                            if (!"offerInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OfferInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","viewId").equals(reader.getName())){
                                
                                                object.setViewId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountInternalId").equals(reader.getName())){
                                
                                                object.setAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bonusCheckDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBonusCheckDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBonusCheckDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundleId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBundleId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBundleId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","campaignTargetInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCampaignTargetInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCampaignTargetInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","connectReason").equals(reader.getName())){
                                
                                                object.setConnectReason(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","disconnectReason").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDisconnectReason(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDisconnectReason(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","externalAgreementId").equals(reader.getName())){
                                
                                                object.setExternalAgreementId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","guidedAccountNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGuidedAccountNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGuidedAccountNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","intendedViewEffectiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setIntendedViewEffectiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setIntendedViewEffectiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerId").equals(reader.getName())){
                                
                                                object.setOfferId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerState").equals(reader.getName())){
                                
                                                object.setOfferState(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerType").equals(reader.getName())){
                                
                                                object.setOfferType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","paymentMode").equals(reader.getName())){
                                
                                                object.setPaymentMode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevInactiveDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrevInactiveDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrevInactiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","qualifiedAwardsCounter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setQualifiedAwardsCounter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setQualifiedAwardsCounter(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","selectionType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSelectionType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSelectionType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","waiveActivation").equals(reader.getName())){
                                
                                                object.setWaiveActivation(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","waiveTermination").equals(reader.getName())){
                                
                                                object.setWaiveTermination(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","waiveUnmetCommitment").equals(reader.getName())){
                                
                                                object.setWaiveUnmetCommitment(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    