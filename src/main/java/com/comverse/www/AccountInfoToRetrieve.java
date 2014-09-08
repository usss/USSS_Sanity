
/**
 * AccountInfoToRetrieve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  AccountInfoToRetrieve bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AccountInfoToRetrieve extends com.comverse.www.ObjectBase
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = accountInfoToRetrieve
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for OnlyCoreBalance
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localOnlyCoreBalance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnlyCoreBalanceTracker = false ;

                           public boolean isOnlyCoreBalanceSpecified(){
                               return localOnlyCoreBalanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getOnlyCoreBalance(){
                               return localOnlyCoreBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnlyCoreBalance
                               */
                               public void setOnlyCoreBalance(com.comverse.www.BooleanAttributeJAXBElement param){
                            localOnlyCoreBalanceTracker = param != null;
                                   
                                            this.localOnlyCoreBalance=param;
                                    

                               }
                            

                        /**
                        * field for Balances
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localBalances ;
                                
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
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getBalances(){
                               return localBalances;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Balances
                               */
                               public void setBalances(com.comverse.www.BooleanAttributeJAXBElement param){
                            localBalancesTracker = param != null;
                                   
                                            this.localBalances=param;
                                    

                               }
                            

                        /**
                        * field for Accumulators
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAccumulators ;
                                
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
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAccumulators(){
                               return localAccumulators;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Accumulators
                               */
                               public void setAccumulators(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAccumulatorsTracker = param != null;
                                   
                                            this.localAccumulators=param;
                                    

                               }
                            

                        /**
                        * field for AccountData
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAccountData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccountDataTracker = false ;

                           public boolean isAccountDataSpecified(){
                               return localAccountDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAccountData(){
                               return localAccountData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountData
                               */
                               public void setAccountData(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAccountDataTracker = param != null;
                                   
                                            this.localAccountData=param;
                                    

                               }
                            

                        /**
                        * field for PaymentProfile
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localPaymentProfile ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaymentProfileTracker = false ;

                           public boolean isPaymentProfileSpecified(){
                               return localPaymentProfileTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getPaymentProfile(){
                               return localPaymentProfile;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PaymentProfile
                               */
                               public void setPaymentProfile(com.comverse.www.BooleanAttributeJAXBElement param){
                            localPaymentProfileTracker = param != null;
                                   
                                            this.localPaymentProfile=param;
                                    

                               }
                            

                        /**
                        * field for ExternalIds
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localExternalIds ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalIdsTracker = false ;

                           public boolean isExternalIdsSpecified(){
                               return localExternalIdsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getExternalIds(){
                               return localExternalIds;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalIds
                               */
                               public void setExternalIds(com.comverse.www.BooleanAttributeJAXBElement param){
                            localExternalIdsTracker = param != null;
                                   
                                            this.localExternalIds=param;
                                    

                               }
                            

                        /**
                        * field for Bundles
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localBundles ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundlesTracker = false ;

                           public boolean isBundlesSpecified(){
                               return localBundlesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getBundles(){
                               return localBundles;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Bundles
                               */
                               public void setBundles(com.comverse.www.BooleanAttributeJAXBElement param){
                            localBundlesTracker = param != null;
                                   
                                            this.localBundles=param;
                                    

                               }
                            

                        /**
                        * field for Offers
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localOffers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOffersTracker = false ;

                           public boolean isOffersSpecified(){
                               return localOffersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getOffers(){
                               return localOffers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Offers
                               */
                               public void setOffers(com.comverse.www.BooleanAttributeJAXBElement param){
                            localOffersTracker = param != null;
                                   
                                            this.localOffers=param;
                                    

                               }
                            

                        /**
                        * field for RCs
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRCs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRCsTracker = false ;

                           public boolean isRCsSpecified(){
                               return localRCsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRCs(){
                               return localRCs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RCs
                               */
                               public void setRCs(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRCsTracker = param != null;
                                   
                                            this.localRCs=param;
                                    

                               }
                            

                        /**
                        * field for RcAwardRedirects
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRcAwardRedirects ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcAwardRedirectsTracker = false ;

                           public boolean isRcAwardRedirectsSpecified(){
                               return localRcAwardRedirectsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRcAwardRedirects(){
                               return localRcAwardRedirects;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RcAwardRedirects
                               */
                               public void setRcAwardRedirects(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRcAwardRedirectsTracker = param != null;
                                   
                                            this.localRcAwardRedirects=param;
                                    

                               }
                            

                        /**
                        * field for RcRateKeys
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRcRateKeys ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcRateKeysTracker = false ;

                           public boolean isRcRateKeysSpecified(){
                               return localRcRateKeysTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRcRateKeys(){
                               return localRcRateKeys;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RcRateKeys
                               */
                               public void setRcRateKeys(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRcRateKeysTracker = param != null;
                                   
                                            this.localRcRateKeys=param;
                                    

                               }
                            

                        /**
                        * field for RcRateOverrides
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRcRateOverrides ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcRateOverridesTracker = false ;

                           public boolean isRcRateOverridesSpecified(){
                               return localRcRateOverridesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRcRateOverrides(){
                               return localRcRateOverrides;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RcRateOverrides
                               */
                               public void setRcRateOverrides(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRcRateOverridesTracker = param != null;
                                   
                                            this.localRcRateOverrides=param;
                                    

                               }
                            

                        /**
                        * field for NRCs
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localNRCs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNRCsTracker = false ;

                           public boolean isNRCsSpecified(){
                               return localNRCsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getNRCs(){
                               return localNRCs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NRCs
                               */
                               public void setNRCs(com.comverse.www.BooleanAttributeJAXBElement param){
                            localNRCsTracker = param != null;
                                   
                                            this.localNRCs=param;
                                    

                               }
                            

                        /**
                        * field for BalanceGrants
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localBalanceGrants ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceGrantsTracker = false ;

                           public boolean isBalanceGrantsSpecified(){
                               return localBalanceGrantsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getBalanceGrants(){
                               return localBalanceGrants;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceGrants
                               */
                               public void setBalanceGrants(com.comverse.www.BooleanAttributeJAXBElement param){
                            localBalanceGrantsTracker = param != null;
                                   
                                            this.localBalanceGrants=param;
                                    

                               }
                            

                        /**
                        * field for BtPromotionPlans
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localBtPromotionPlans ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBtPromotionPlansTracker = false ;

                           public boolean isBtPromotionPlansSpecified(){
                               return localBtPromotionPlansTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getBtPromotionPlans(){
                               return localBtPromotionPlans;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BtPromotionPlans
                               */
                               public void setBtPromotionPlans(com.comverse.www.BooleanAttributeJAXBElement param){
                            localBtPromotionPlansTracker = param != null;
                                   
                                            this.localBtPromotionPlans=param;
                                    

                               }
                            

                        /**
                        * field for UseBillingDB
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localUseBillingDB ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUseBillingDBTracker = false ;

                           public boolean isUseBillingDBSpecified(){
                               return localUseBillingDBTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getUseBillingDB(){
                               return localUseBillingDB;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseBillingDB
                               */
                               public void setUseBillingDB(com.comverse.www.BooleanAttributeJAXBElement param){
                            localUseBillingDBTracker = param != null;
                                   
                                            this.localUseBillingDB=param;
                                    

                               }
                            

                        /**
                        * field for UseBalancesFromBillingDB
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localUseBalancesFromBillingDB ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUseBalancesFromBillingDBTracker = false ;

                           public boolean isUseBalancesFromBillingDBSpecified(){
                               return localUseBalancesFromBillingDBTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getUseBalancesFromBillingDB(){
                               return localUseBalancesFromBillingDB;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseBalancesFromBillingDB
                               */
                               public void setUseBalancesFromBillingDB(com.comverse.www.BooleanAttributeJAXBElement param){
                            localUseBalancesFromBillingDBTracker = param != null;
                                   
                                            this.localUseBalancesFromBillingDB=param;
                                    

                               }
                            

                        /**
                        * field for LiabilityRedirectionsSource
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localLiabilityRedirectionsSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiabilityRedirectionsSourceTracker = false ;

                           public boolean isLiabilityRedirectionsSourceSpecified(){
                               return localLiabilityRedirectionsSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getLiabilityRedirectionsSource(){
                               return localLiabilityRedirectionsSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiabilityRedirectionsSource
                               */
                               public void setLiabilityRedirectionsSource(com.comverse.www.BooleanAttributeJAXBElement param){
                            localLiabilityRedirectionsSourceTracker = param != null;
                                   
                                            this.localLiabilityRedirectionsSource=param;
                                    

                               }
                            

                        /**
                        * field for LiabilityRedirectionsTarget
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localLiabilityRedirectionsTarget ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiabilityRedirectionsTargetTracker = false ;

                           public boolean isLiabilityRedirectionsTargetSpecified(){
                               return localLiabilityRedirectionsTargetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getLiabilityRedirectionsTarget(){
                               return localLiabilityRedirectionsTarget;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiabilityRedirectionsTarget
                               */
                               public void setLiabilityRedirectionsTarget(com.comverse.www.BooleanAttributeJAXBElement param){
                            localLiabilityRedirectionsTargetTracker = param != null;
                                   
                                            this.localLiabilityRedirectionsTarget=param;
                                    

                               }
                            

                        /**
                        * field for OnlyActiveEntities
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localOnlyActiveEntities ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOnlyActiveEntitiesTracker = false ;

                           public boolean isOnlyActiveEntitiesSpecified(){
                               return localOnlyActiveEntitiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getOnlyActiveEntities(){
                               return localOnlyActiveEntities;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OnlyActiveEntities
                               */
                               public void setOnlyActiveEntities(com.comverse.www.BooleanAttributeJAXBElement param){
                            localOnlyActiveEntitiesTracker = param != null;
                                   
                                            this.localOnlyActiveEntities=param;
                                    

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
                           namespacePrefix+":accountInfoToRetrieve",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "accountInfoToRetrieve",
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
                              if (localOnlyCoreBalanceTracker){
                                            if (localOnlyCoreBalance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OnlyCoreBalance cannot be null!!");
                                            }
                                           localOnlyCoreBalance.serialize(new javax.xml.namespace.QName("","OnlyCoreBalance"),
                                               xmlWriter);
                                        } if (localBalancesTracker){
                                            if (localBalances==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Balances cannot be null!!");
                                            }
                                           localBalances.serialize(new javax.xml.namespace.QName("","Balances"),
                                               xmlWriter);
                                        } if (localAccumulatorsTracker){
                                            if (localAccumulators==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Accumulators cannot be null!!");
                                            }
                                           localAccumulators.serialize(new javax.xml.namespace.QName("","Accumulators"),
                                               xmlWriter);
                                        } if (localAccountDataTracker){
                                            if (localAccountData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AccountData cannot be null!!");
                                            }
                                           localAccountData.serialize(new javax.xml.namespace.QName("","AccountData"),
                                               xmlWriter);
                                        } if (localPaymentProfileTracker){
                                            if (localPaymentProfile==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PaymentProfile cannot be null!!");
                                            }
                                           localPaymentProfile.serialize(new javax.xml.namespace.QName("","PaymentProfile"),
                                               xmlWriter);
                                        } if (localExternalIdsTracker){
                                            if (localExternalIds==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExternalIds cannot be null!!");
                                            }
                                           localExternalIds.serialize(new javax.xml.namespace.QName("","ExternalIds"),
                                               xmlWriter);
                                        } if (localBundlesTracker){
                                            if (localBundles==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Bundles cannot be null!!");
                                            }
                                           localBundles.serialize(new javax.xml.namespace.QName("","Bundles"),
                                               xmlWriter);
                                        } if (localOffersTracker){
                                            if (localOffers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Offers cannot be null!!");
                                            }
                                           localOffers.serialize(new javax.xml.namespace.QName("","Offers"),
                                               xmlWriter);
                                        } if (localRCsTracker){
                                            if (localRCs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RCs cannot be null!!");
                                            }
                                           localRCs.serialize(new javax.xml.namespace.QName("","RCs"),
                                               xmlWriter);
                                        } if (localRcAwardRedirectsTracker){
                                            if (localRcAwardRedirects==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RcAwardRedirects cannot be null!!");
                                            }
                                           localRcAwardRedirects.serialize(new javax.xml.namespace.QName("","RcAwardRedirects"),
                                               xmlWriter);
                                        } if (localRcRateKeysTracker){
                                            if (localRcRateKeys==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcRateKeys cannot be null!!");
                                            }
                                           localRcRateKeys.serialize(new javax.xml.namespace.QName("","rcRateKeys"),
                                               xmlWriter);
                                        } if (localRcRateOverridesTracker){
                                            if (localRcRateOverrides==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcRateOverrides cannot be null!!");
                                            }
                                           localRcRateOverrides.serialize(new javax.xml.namespace.QName("","rcRateOverrides"),
                                               xmlWriter);
                                        } if (localNRCsTracker){
                                            if (localNRCs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NRCs cannot be null!!");
                                            }
                                           localNRCs.serialize(new javax.xml.namespace.QName("","NRCs"),
                                               xmlWriter);
                                        } if (localBalanceGrantsTracker){
                                            if (localBalanceGrants==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BalanceGrants cannot be null!!");
                                            }
                                           localBalanceGrants.serialize(new javax.xml.namespace.QName("","BalanceGrants"),
                                               xmlWriter);
                                        } if (localBtPromotionPlansTracker){
                                            if (localBtPromotionPlans==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BtPromotionPlans cannot be null!!");
                                            }
                                           localBtPromotionPlans.serialize(new javax.xml.namespace.QName("","BtPromotionPlans"),
                                               xmlWriter);
                                        } if (localUseBillingDBTracker){
                                            if (localUseBillingDB==null){
                                                 throw new org.apache.axis2.databinding.ADBException("useBillingDB cannot be null!!");
                                            }
                                           localUseBillingDB.serialize(new javax.xml.namespace.QName("","useBillingDB"),
                                               xmlWriter);
                                        } if (localUseBalancesFromBillingDBTracker){
                                            if (localUseBalancesFromBillingDB==null){
                                                 throw new org.apache.axis2.databinding.ADBException("useBalancesFromBillingDB cannot be null!!");
                                            }
                                           localUseBalancesFromBillingDB.serialize(new javax.xml.namespace.QName("","useBalancesFromBillingDB"),
                                               xmlWriter);
                                        } if (localLiabilityRedirectionsSourceTracker){
                                            if (localLiabilityRedirectionsSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LiabilityRedirectionsSource cannot be null!!");
                                            }
                                           localLiabilityRedirectionsSource.serialize(new javax.xml.namespace.QName("","LiabilityRedirectionsSource"),
                                               xmlWriter);
                                        } if (localLiabilityRedirectionsTargetTracker){
                                            if (localLiabilityRedirectionsTarget==null){
                                                 throw new org.apache.axis2.databinding.ADBException("LiabilityRedirectionsTarget cannot be null!!");
                                            }
                                           localLiabilityRedirectionsTarget.serialize(new javax.xml.namespace.QName("","LiabilityRedirectionsTarget"),
                                               xmlWriter);
                                        } if (localOnlyActiveEntitiesTracker){
                                            if (localOnlyActiveEntities==null){
                                                 throw new org.apache.axis2.databinding.ADBException("onlyActiveEntities cannot be null!!");
                                            }
                                           localOnlyActiveEntities.serialize(new javax.xml.namespace.QName("","onlyActiveEntities"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","accountInfoToRetrieve"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localOnlyCoreBalanceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "OnlyCoreBalance"));
                            
                            
                                    if (localOnlyCoreBalance==null){
                                         throw new org.apache.axis2.databinding.ADBException("OnlyCoreBalance cannot be null!!");
                                    }
                                    elementList.add(localOnlyCoreBalance);
                                } if (localBalancesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "Balances"));
                            
                            
                                    if (localBalances==null){
                                         throw new org.apache.axis2.databinding.ADBException("Balances cannot be null!!");
                                    }
                                    elementList.add(localBalances);
                                } if (localAccumulatorsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "Accumulators"));
                            
                            
                                    if (localAccumulators==null){
                                         throw new org.apache.axis2.databinding.ADBException("Accumulators cannot be null!!");
                                    }
                                    elementList.add(localAccumulators);
                                } if (localAccountDataTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "AccountData"));
                            
                            
                                    if (localAccountData==null){
                                         throw new org.apache.axis2.databinding.ADBException("AccountData cannot be null!!");
                                    }
                                    elementList.add(localAccountData);
                                } if (localPaymentProfileTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "PaymentProfile"));
                            
                            
                                    if (localPaymentProfile==null){
                                         throw new org.apache.axis2.databinding.ADBException("PaymentProfile cannot be null!!");
                                    }
                                    elementList.add(localPaymentProfile);
                                } if (localExternalIdsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ExternalIds"));
                            
                            
                                    if (localExternalIds==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExternalIds cannot be null!!");
                                    }
                                    elementList.add(localExternalIds);
                                } if (localBundlesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "Bundles"));
                            
                            
                                    if (localBundles==null){
                                         throw new org.apache.axis2.databinding.ADBException("Bundles cannot be null!!");
                                    }
                                    elementList.add(localBundles);
                                } if (localOffersTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "Offers"));
                            
                            
                                    if (localOffers==null){
                                         throw new org.apache.axis2.databinding.ADBException("Offers cannot be null!!");
                                    }
                                    elementList.add(localOffers);
                                } if (localRCsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "RCs"));
                            
                            
                                    if (localRCs==null){
                                         throw new org.apache.axis2.databinding.ADBException("RCs cannot be null!!");
                                    }
                                    elementList.add(localRCs);
                                } if (localRcAwardRedirectsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "RcAwardRedirects"));
                            
                            
                                    if (localRcAwardRedirects==null){
                                         throw new org.apache.axis2.databinding.ADBException("RcAwardRedirects cannot be null!!");
                                    }
                                    elementList.add(localRcAwardRedirects);
                                } if (localRcRateKeysTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcRateKeys"));
                            
                            
                                    if (localRcRateKeys==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcRateKeys cannot be null!!");
                                    }
                                    elementList.add(localRcRateKeys);
                                } if (localRcRateOverridesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcRateOverrides"));
                            
                            
                                    if (localRcRateOverrides==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcRateOverrides cannot be null!!");
                                    }
                                    elementList.add(localRcRateOverrides);
                                } if (localNRCsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "NRCs"));
                            
                            
                                    if (localNRCs==null){
                                         throw new org.apache.axis2.databinding.ADBException("NRCs cannot be null!!");
                                    }
                                    elementList.add(localNRCs);
                                } if (localBalanceGrantsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BalanceGrants"));
                            
                            
                                    if (localBalanceGrants==null){
                                         throw new org.apache.axis2.databinding.ADBException("BalanceGrants cannot be null!!");
                                    }
                                    elementList.add(localBalanceGrants);
                                } if (localBtPromotionPlansTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "BtPromotionPlans"));
                            
                            
                                    if (localBtPromotionPlans==null){
                                         throw new org.apache.axis2.databinding.ADBException("BtPromotionPlans cannot be null!!");
                                    }
                                    elementList.add(localBtPromotionPlans);
                                } if (localUseBillingDBTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "useBillingDB"));
                            
                            
                                    if (localUseBillingDB==null){
                                         throw new org.apache.axis2.databinding.ADBException("useBillingDB cannot be null!!");
                                    }
                                    elementList.add(localUseBillingDB);
                                } if (localUseBalancesFromBillingDBTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "useBalancesFromBillingDB"));
                            
                            
                                    if (localUseBalancesFromBillingDB==null){
                                         throw new org.apache.axis2.databinding.ADBException("useBalancesFromBillingDB cannot be null!!");
                                    }
                                    elementList.add(localUseBalancesFromBillingDB);
                                } if (localLiabilityRedirectionsSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "LiabilityRedirectionsSource"));
                            
                            
                                    if (localLiabilityRedirectionsSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("LiabilityRedirectionsSource cannot be null!!");
                                    }
                                    elementList.add(localLiabilityRedirectionsSource);
                                } if (localLiabilityRedirectionsTargetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "LiabilityRedirectionsTarget"));
                            
                            
                                    if (localLiabilityRedirectionsTarget==null){
                                         throw new org.apache.axis2.databinding.ADBException("LiabilityRedirectionsTarget cannot be null!!");
                                    }
                                    elementList.add(localLiabilityRedirectionsTarget);
                                } if (localOnlyActiveEntitiesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "onlyActiveEntities"));
                            
                            
                                    if (localOnlyActiveEntities==null){
                                         throw new org.apache.axis2.databinding.ADBException("onlyActiveEntities cannot be null!!");
                                    }
                                    elementList.add(localOnlyActiveEntities);
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
        public static AccountInfoToRetrieve parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AccountInfoToRetrieve object =
                new AccountInfoToRetrieve();

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
                    
                            if (!"accountInfoToRetrieve".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AccountInfoToRetrieve)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","OnlyCoreBalance").equals(reader.getName())){
                                
                                                object.setOnlyCoreBalance(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Balances").equals(reader.getName())){
                                
                                                object.setBalances(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Accumulators").equals(reader.getName())){
                                
                                                object.setAccumulators(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","AccountData").equals(reader.getName())){
                                
                                                object.setAccountData(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","PaymentProfile").equals(reader.getName())){
                                
                                                object.setPaymentProfile(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ExternalIds").equals(reader.getName())){
                                
                                                object.setExternalIds(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Bundles").equals(reader.getName())){
                                
                                                object.setBundles(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","Offers").equals(reader.getName())){
                                
                                                object.setOffers(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","RCs").equals(reader.getName())){
                                
                                                object.setRCs(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","RcAwardRedirects").equals(reader.getName())){
                                
                                                object.setRcAwardRedirects(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcRateKeys").equals(reader.getName())){
                                
                                                object.setRcRateKeys(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcRateOverrides").equals(reader.getName())){
                                
                                                object.setRcRateOverrides(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","NRCs").equals(reader.getName())){
                                
                                                object.setNRCs(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BalanceGrants").equals(reader.getName())){
                                
                                                object.setBalanceGrants(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","BtPromotionPlans").equals(reader.getName())){
                                
                                                object.setBtPromotionPlans(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","useBillingDB").equals(reader.getName())){
                                
                                                object.setUseBillingDB(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","useBalancesFromBillingDB").equals(reader.getName())){
                                
                                                object.setUseBalancesFromBillingDB(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","LiabilityRedirectionsSource").equals(reader.getName())){
                                
                                                object.setLiabilityRedirectionsSource(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","LiabilityRedirectionsTarget").equals(reader.getName())){
                                
                                                object.setLiabilityRedirectionsTarget(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","onlyActiveEntities").equals(reader.getName())){
                                
                                                object.setOnlyActiveEntities(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    