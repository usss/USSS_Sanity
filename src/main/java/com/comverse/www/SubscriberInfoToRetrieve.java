
/**
 * SubscriberInfoToRetrieve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  SubscriberInfoToRetrieve bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SubscriberInfoToRetrieve extends com.comverse.www.ObjectBase
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = subscriberInfoToRetrieve
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
                        * field for Phonebook
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localPhonebook ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhonebookTracker = false ;

                           public boolean isPhonebookSpecified(){
                               return localPhonebookTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getPhonebook(){
                               return localPhonebook;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Phonebook
                               */
                               public void setPhonebook(com.comverse.www.BooleanAttributeJAXBElement param){
                            localPhonebookTracker = param != null;
                                   
                                            this.localPhonebook=param;
                                    

                               }
                            

                        /**
                        * field for HomeLocations
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localHomeLocations ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHomeLocationsTracker = false ;

                           public boolean isHomeLocationsSpecified(){
                               return localHomeLocationsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getHomeLocations(){
                               return localHomeLocations;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HomeLocations
                               */
                               public void setHomeLocations(com.comverse.www.BooleanAttributeJAXBElement param){
                            localHomeLocationsTracker = param != null;
                                   
                                            this.localHomeLocations=param;
                                    

                               }
                            

                        /**
                        * field for Address
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressTracker = false ;

                           public boolean isAddressSpecified(){
                               return localAddressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAddress(){
                               return localAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Address
                               */
                               public void setAddress(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAddressTracker = param != null;
                                   
                                            this.localAddress=param;
                                    

                               }
                            

                        /**
                        * field for SubscriberData
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localSubscriberData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberDataTracker = false ;

                           public boolean isSubscriberDataSpecified(){
                               return localSubscriberDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getSubscriberData(){
                               return localSubscriberData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberData
                               */
                               public void setSubscriberData(com.comverse.www.BooleanAttributeJAXBElement param){
                            localSubscriberDataTracker = param != null;
                                   
                                            this.localSubscriberData=param;
                                    

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
                        * field for CUG
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localCUG ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCUGTracker = false ;

                           public boolean isCUGSpecified(){
                               return localCUGTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getCUG(){
                               return localCUG;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CUG
                               */
                               public void setCUG(com.comverse.www.BooleanAttributeJAXBElement param){
                            localCUGTracker = param != null;
                                   
                                            this.localCUG=param;
                                    

                               }
                            

                        /**
                        * field for Reservations
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localReservations ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReservationsTracker = false ;

                           public boolean isReservationsSpecified(){
                               return localReservationsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getReservations(){
                               return localReservations;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reservations
                               */
                               public void setReservations(com.comverse.www.BooleanAttributeJAXBElement param){
                            localReservationsTracker = param != null;
                                   
                                            this.localReservations=param;
                                    

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
                        * field for PromisedPayments
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localPromisedPayments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPromisedPaymentsTracker = false ;

                           public boolean isPromisedPaymentsSpecified(){
                               return localPromisedPaymentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getPromisedPayments(){
                               return localPromisedPayments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PromisedPayments
                               */
                               public void setPromisedPayments(com.comverse.www.BooleanAttributeJAXBElement param){
                            localPromisedPaymentsTracker = param != null;
                                   
                                            this.localPromisedPayments=param;
                                    

                               }
                            

                        /**
                        * field for LiabilityRedirectionSource
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localLiabilityRedirectionSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiabilityRedirectionSourceTracker = false ;

                           public boolean isLiabilityRedirectionSourceSpecified(){
                               return localLiabilityRedirectionSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getLiabilityRedirectionSource(){
                               return localLiabilityRedirectionSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiabilityRedirectionSource
                               */
                               public void setLiabilityRedirectionSource(com.comverse.www.BooleanAttributeJAXBElement param){
                            localLiabilityRedirectionSourceTracker = param != null;
                                   
                                            this.localLiabilityRedirectionSource=param;
                                    

                               }
                            

                        /**
                        * field for LiabilityRedirectionTarget
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localLiabilityRedirectionTarget ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiabilityRedirectionTargetTracker = false ;

                           public boolean isLiabilityRedirectionTargetSpecified(){
                               return localLiabilityRedirectionTargetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getLiabilityRedirectionTarget(){
                               return localLiabilityRedirectionTarget;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiabilityRedirectionTarget
                               */
                               public void setLiabilityRedirectionTarget(com.comverse.www.BooleanAttributeJAXBElement param){
                            localLiabilityRedirectionTargetTracker = param != null;
                                   
                                            this.localLiabilityRedirectionTarget=param;
                                    

                               }
                            

                        /**
                        * field for AddressAssociation
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localAddressAssociation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAddressAssociationTracker = false ;

                           public boolean isAddressAssociationSpecified(){
                               return localAddressAssociationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getAddressAssociation(){
                               return localAddressAssociation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AddressAssociation
                               */
                               public void setAddressAssociation(com.comverse.www.BooleanAttributeJAXBElement param){
                            localAddressAssociationTracker = param != null;
                                   
                                            this.localAddressAssociation=param;
                                    

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
                        * field for FaList
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localFaList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFaListTracker = false ;

                           public boolean isFaListSpecified(){
                               return localFaListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getFaList(){
                               return localFaList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FaList
                               */
                               public void setFaList(com.comverse.www.BooleanAttributeJAXBElement param){
                            localFaListTracker = param != null;
                                   
                                            this.localFaList=param;
                                    

                               }
                            

                        /**
                        * field for FfList
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localFfList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFfListTracker = false ;

                           public boolean isFfListSpecified(){
                               return localFfListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getFfList(){
                               return localFfList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FfList
                               */
                               public void setFfList(com.comverse.www.BooleanAttributeJAXBElement param){
                            localFfListTracker = param != null;
                                   
                                            this.localFfList=param;
                                    

                               }
                            

                        /**
                        * field for RcInactiveInstances
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRcInactiveInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcInactiveInstancesTracker = false ;

                           public boolean isRcInactiveInstancesSpecified(){
                               return localRcInactiveInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRcInactiveInstances(){
                               return localRcInactiveInstances;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RcInactiveInstances
                               */
                               public void setRcInactiveInstances(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRcInactiveInstancesTracker = param != null;
                                   
                                            this.localRcInactiveInstances=param;
                                    

                               }
                            

                        /**
                        * field for CurrentFFInstances
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localCurrentFFInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrentFFInstancesTracker = false ;

                           public boolean isCurrentFFInstancesSpecified(){
                               return localCurrentFFInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getCurrentFFInstances(){
                               return localCurrentFFInstances;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrentFFInstances
                               */
                               public void setCurrentFFInstances(com.comverse.www.BooleanAttributeJAXBElement param){
                            localCurrentFFInstancesTracker = param != null;
                                   
                                            this.localCurrentFFInstances=param;
                                    

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
                           namespacePrefix+":subscriberInfoToRetrieve",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "subscriberInfoToRetrieve",
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
                                                 throw new org.apache.axis2.databinding.ADBException("onlyCoreBalance cannot be null!!");
                                            }
                                           localOnlyCoreBalance.serialize(new javax.xml.namespace.QName("","onlyCoreBalance"),
                                               xmlWriter);
                                        } if (localBalancesTracker){
                                            if (localBalances==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balances cannot be null!!");
                                            }
                                           localBalances.serialize(new javax.xml.namespace.QName("","balances"),
                                               xmlWriter);
                                        } if (localAccumulatorsTracker){
                                            if (localAccumulators==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accumulators cannot be null!!");
                                            }
                                           localAccumulators.serialize(new javax.xml.namespace.QName("","accumulators"),
                                               xmlWriter);
                                        } if (localPhonebookTracker){
                                            if (localPhonebook==null){
                                                 throw new org.apache.axis2.databinding.ADBException("phonebook cannot be null!!");
                                            }
                                           localPhonebook.serialize(new javax.xml.namespace.QName("","phonebook"),
                                               xmlWriter);
                                        } if (localHomeLocationsTracker){
                                            if (localHomeLocations==null){
                                                 throw new org.apache.axis2.databinding.ADBException("homeLocations cannot be null!!");
                                            }
                                           localHomeLocations.serialize(new javax.xml.namespace.QName("","homeLocations"),
                                               xmlWriter);
                                        } if (localAddressTracker){
                                            if (localAddress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("address cannot be null!!");
                                            }
                                           localAddress.serialize(new javax.xml.namespace.QName("","address"),
                                               xmlWriter);
                                        } if (localSubscriberDataTracker){
                                            if (localSubscriberData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("subscriberData cannot be null!!");
                                            }
                                           localSubscriberData.serialize(new javax.xml.namespace.QName("","subscriberData"),
                                               xmlWriter);
                                        } if (localExternalIdsTracker){
                                            if (localExternalIds==null){
                                                 throw new org.apache.axis2.databinding.ADBException("externalIds cannot be null!!");
                                            }
                                           localExternalIds.serialize(new javax.xml.namespace.QName("","externalIds"),
                                               xmlWriter);
                                        } if (localBundlesTracker){
                                            if (localBundles==null){
                                                 throw new org.apache.axis2.databinding.ADBException("bundles cannot be null!!");
                                            }
                                           localBundles.serialize(new javax.xml.namespace.QName("","bundles"),
                                               xmlWriter);
                                        } if (localOffersTracker){
                                            if (localOffers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("offers cannot be null!!");
                                            }
                                           localOffers.serialize(new javax.xml.namespace.QName("","offers"),
                                               xmlWriter);
                                        } if (localBtPromotionPlansTracker){
                                            if (localBtPromotionPlans==null){
                                                 throw new org.apache.axis2.databinding.ADBException("btPromotionPlans cannot be null!!");
                                            }
                                           localBtPromotionPlans.serialize(new javax.xml.namespace.QName("","btPromotionPlans"),
                                               xmlWriter);
                                        } if (localRCsTracker){
                                            if (localRCs==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RCs cannot be null!!");
                                            }
                                           localRCs.serialize(new javax.xml.namespace.QName("","RCs"),
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
                                        } if (localCUGTracker){
                                            if (localCUG==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CUG cannot be null!!");
                                            }
                                           localCUG.serialize(new javax.xml.namespace.QName("","CUG"),
                                               xmlWriter);
                                        } if (localReservationsTracker){
                                            if (localReservations==null){
                                                 throw new org.apache.axis2.databinding.ADBException("reservations cannot be null!!");
                                            }
                                           localReservations.serialize(new javax.xml.namespace.QName("","reservations"),
                                               xmlWriter);
                                        } if (localBalanceGrantsTracker){
                                            if (localBalanceGrants==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceGrants cannot be null!!");
                                            }
                                           localBalanceGrants.serialize(new javax.xml.namespace.QName("","balanceGrants"),
                                               xmlWriter);
                                        } if (localPromisedPaymentsTracker){
                                            if (localPromisedPayments==null){
                                                 throw new org.apache.axis2.databinding.ADBException("promisedPayments cannot be null!!");
                                            }
                                           localPromisedPayments.serialize(new javax.xml.namespace.QName("","promisedPayments"),
                                               xmlWriter);
                                        } if (localLiabilityRedirectionSourceTracker){
                                            if (localLiabilityRedirectionSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("liabilityRedirectionSource cannot be null!!");
                                            }
                                           localLiabilityRedirectionSource.serialize(new javax.xml.namespace.QName("","liabilityRedirectionSource"),
                                               xmlWriter);
                                        } if (localLiabilityRedirectionTargetTracker){
                                            if (localLiabilityRedirectionTarget==null){
                                                 throw new org.apache.axis2.databinding.ADBException("liabilityRedirectionTarget cannot be null!!");
                                            }
                                           localLiabilityRedirectionTarget.serialize(new javax.xml.namespace.QName("","liabilityRedirectionTarget"),
                                               xmlWriter);
                                        } if (localAddressAssociationTracker){
                                            if (localAddressAssociation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("addressAssociation cannot be null!!");
                                            }
                                           localAddressAssociation.serialize(new javax.xml.namespace.QName("","addressAssociation"),
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
                                        } if (localOnlyActiveEntitiesTracker){
                                            if (localOnlyActiveEntities==null){
                                                 throw new org.apache.axis2.databinding.ADBException("onlyActiveEntities cannot be null!!");
                                            }
                                           localOnlyActiveEntities.serialize(new javax.xml.namespace.QName("","onlyActiveEntities"),
                                               xmlWriter);
                                        } if (localFaListTracker){
                                            if (localFaList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("faList cannot be null!!");
                                            }
                                           localFaList.serialize(new javax.xml.namespace.QName("","faList"),
                                               xmlWriter);
                                        } if (localFfListTracker){
                                            if (localFfList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ffList cannot be null!!");
                                            }
                                           localFfList.serialize(new javax.xml.namespace.QName("","ffList"),
                                               xmlWriter);
                                        } if (localRcInactiveInstancesTracker){
                                            if (localRcInactiveInstances==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rcInactiveInstances cannot be null!!");
                                            }
                                           localRcInactiveInstances.serialize(new javax.xml.namespace.QName("","rcInactiveInstances"),
                                               xmlWriter);
                                        } if (localCurrentFFInstancesTracker){
                                            if (localCurrentFFInstances==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currentFFInstances cannot be null!!");
                                            }
                                           localCurrentFFInstances.serialize(new javax.xml.namespace.QName("","currentFFInstances"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","subscriberInfoToRetrieve"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localOnlyCoreBalanceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "onlyCoreBalance"));
                            
                            
                                    if (localOnlyCoreBalance==null){
                                         throw new org.apache.axis2.databinding.ADBException("onlyCoreBalance cannot be null!!");
                                    }
                                    elementList.add(localOnlyCoreBalance);
                                } if (localBalancesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balances"));
                            
                            
                                    if (localBalances==null){
                                         throw new org.apache.axis2.databinding.ADBException("balances cannot be null!!");
                                    }
                                    elementList.add(localBalances);
                                } if (localAccumulatorsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accumulators"));
                            
                            
                                    if (localAccumulators==null){
                                         throw new org.apache.axis2.databinding.ADBException("accumulators cannot be null!!");
                                    }
                                    elementList.add(localAccumulators);
                                } if (localPhonebookTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "phonebook"));
                            
                            
                                    if (localPhonebook==null){
                                         throw new org.apache.axis2.databinding.ADBException("phonebook cannot be null!!");
                                    }
                                    elementList.add(localPhonebook);
                                } if (localHomeLocationsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "homeLocations"));
                            
                            
                                    if (localHomeLocations==null){
                                         throw new org.apache.axis2.databinding.ADBException("homeLocations cannot be null!!");
                                    }
                                    elementList.add(localHomeLocations);
                                } if (localAddressTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "address"));
                            
                            
                                    if (localAddress==null){
                                         throw new org.apache.axis2.databinding.ADBException("address cannot be null!!");
                                    }
                                    elementList.add(localAddress);
                                } if (localSubscriberDataTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subscriberData"));
                            
                            
                                    if (localSubscriberData==null){
                                         throw new org.apache.axis2.databinding.ADBException("subscriberData cannot be null!!");
                                    }
                                    elementList.add(localSubscriberData);
                                } if (localExternalIdsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "externalIds"));
                            
                            
                                    if (localExternalIds==null){
                                         throw new org.apache.axis2.databinding.ADBException("externalIds cannot be null!!");
                                    }
                                    elementList.add(localExternalIds);
                                } if (localBundlesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundles"));
                            
                            
                                    if (localBundles==null){
                                         throw new org.apache.axis2.databinding.ADBException("bundles cannot be null!!");
                                    }
                                    elementList.add(localBundles);
                                } if (localOffersTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "offers"));
                            
                            
                                    if (localOffers==null){
                                         throw new org.apache.axis2.databinding.ADBException("offers cannot be null!!");
                                    }
                                    elementList.add(localOffers);
                                } if (localBtPromotionPlansTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "btPromotionPlans"));
                            
                            
                                    if (localBtPromotionPlans==null){
                                         throw new org.apache.axis2.databinding.ADBException("btPromotionPlans cannot be null!!");
                                    }
                                    elementList.add(localBtPromotionPlans);
                                } if (localRCsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "RCs"));
                            
                            
                                    if (localRCs==null){
                                         throw new org.apache.axis2.databinding.ADBException("RCs cannot be null!!");
                                    }
                                    elementList.add(localRCs);
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
                                } if (localCUGTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "CUG"));
                            
                            
                                    if (localCUG==null){
                                         throw new org.apache.axis2.databinding.ADBException("CUG cannot be null!!");
                                    }
                                    elementList.add(localCUG);
                                } if (localReservationsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "reservations"));
                            
                            
                                    if (localReservations==null){
                                         throw new org.apache.axis2.databinding.ADBException("reservations cannot be null!!");
                                    }
                                    elementList.add(localReservations);
                                } if (localBalanceGrantsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceGrants"));
                            
                            
                                    if (localBalanceGrants==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceGrants cannot be null!!");
                                    }
                                    elementList.add(localBalanceGrants);
                                } if (localPromisedPaymentsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "promisedPayments"));
                            
                            
                                    if (localPromisedPayments==null){
                                         throw new org.apache.axis2.databinding.ADBException("promisedPayments cannot be null!!");
                                    }
                                    elementList.add(localPromisedPayments);
                                } if (localLiabilityRedirectionSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "liabilityRedirectionSource"));
                            
                            
                                    if (localLiabilityRedirectionSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("liabilityRedirectionSource cannot be null!!");
                                    }
                                    elementList.add(localLiabilityRedirectionSource);
                                } if (localLiabilityRedirectionTargetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "liabilityRedirectionTarget"));
                            
                            
                                    if (localLiabilityRedirectionTarget==null){
                                         throw new org.apache.axis2.databinding.ADBException("liabilityRedirectionTarget cannot be null!!");
                                    }
                                    elementList.add(localLiabilityRedirectionTarget);
                                } if (localAddressAssociationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "addressAssociation"));
                            
                            
                                    if (localAddressAssociation==null){
                                         throw new org.apache.axis2.databinding.ADBException("addressAssociation cannot be null!!");
                                    }
                                    elementList.add(localAddressAssociation);
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
                                } if (localOnlyActiveEntitiesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "onlyActiveEntities"));
                            
                            
                                    if (localOnlyActiveEntities==null){
                                         throw new org.apache.axis2.databinding.ADBException("onlyActiveEntities cannot be null!!");
                                    }
                                    elementList.add(localOnlyActiveEntities);
                                } if (localFaListTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "faList"));
                            
                            
                                    if (localFaList==null){
                                         throw new org.apache.axis2.databinding.ADBException("faList cannot be null!!");
                                    }
                                    elementList.add(localFaList);
                                } if (localFfListTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ffList"));
                            
                            
                                    if (localFfList==null){
                                         throw new org.apache.axis2.databinding.ADBException("ffList cannot be null!!");
                                    }
                                    elementList.add(localFfList);
                                } if (localRcInactiveInstancesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcInactiveInstances"));
                            
                            
                                    if (localRcInactiveInstances==null){
                                         throw new org.apache.axis2.databinding.ADBException("rcInactiveInstances cannot be null!!");
                                    }
                                    elementList.add(localRcInactiveInstances);
                                } if (localCurrentFFInstancesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currentFFInstances"));
                            
                            
                                    if (localCurrentFFInstances==null){
                                         throw new org.apache.axis2.databinding.ADBException("currentFFInstances cannot be null!!");
                                    }
                                    elementList.add(localCurrentFFInstances);
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
        public static SubscriberInfoToRetrieve parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SubscriberInfoToRetrieve object =
                new SubscriberInfoToRetrieve();

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
                    
                            if (!"subscriberInfoToRetrieve".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SubscriberInfoToRetrieve)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","onlyCoreBalance").equals(reader.getName())){
                                
                                                object.setOnlyCoreBalance(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balances").equals(reader.getName())){
                                
                                                object.setBalances(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accumulators").equals(reader.getName())){
                                
                                                object.setAccumulators(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","phonebook").equals(reader.getName())){
                                
                                                object.setPhonebook(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","homeLocations").equals(reader.getName())){
                                
                                                object.setHomeLocations(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","address").equals(reader.getName())){
                                
                                                object.setAddress(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberData").equals(reader.getName())){
                                
                                                object.setSubscriberData(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","externalIds").equals(reader.getName())){
                                
                                                object.setExternalIds(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundles").equals(reader.getName())){
                                
                                                object.setBundles(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offers").equals(reader.getName())){
                                
                                                object.setOffers(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","btPromotionPlans").equals(reader.getName())){
                                
                                                object.setBtPromotionPlans(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","CUG").equals(reader.getName())){
                                
                                                object.setCUG(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","reservations").equals(reader.getName())){
                                
                                                object.setReservations(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceGrants").equals(reader.getName())){
                                
                                                object.setBalanceGrants(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","promisedPayments").equals(reader.getName())){
                                
                                                object.setPromisedPayments(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","liabilityRedirectionSource").equals(reader.getName())){
                                
                                                object.setLiabilityRedirectionSource(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","liabilityRedirectionTarget").equals(reader.getName())){
                                
                                                object.setLiabilityRedirectionTarget(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","addressAssociation").equals(reader.getName())){
                                
                                                object.setAddressAssociation(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","onlyActiveEntities").equals(reader.getName())){
                                
                                                object.setOnlyActiveEntities(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","faList").equals(reader.getName())){
                                
                                                object.setFaList(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ffList").equals(reader.getName())){
                                
                                                object.setFfList(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcInactiveInstances").equals(reader.getName())){
                                
                                                object.setRcInactiveInstances(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currentFFInstances").equals(reader.getName())){
                                
                                                object.setCurrentFFInstances(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    