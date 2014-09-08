
/**
 * AccountObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  AccountObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AccountObject extends com.comverse.www.AccountBaseObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = accountObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Subscribers
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.SubscriberObject[] localSubscribers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscribersTracker = false ;

                           public boolean isSubscribersSpecified(){
                               return localSubscribersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SubscriberObject[]
                           */
                           public  com.comverse.www.SubscriberObject[] getSubscribers(){
                               return localSubscribers;
                           }

                           
                        


                               
                              /**
                               * validate the array for Subscribers
                               */
                              protected void validateSubscribers(com.comverse.www.SubscriberObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Subscribers
                              */
                              public void setSubscribers(com.comverse.www.SubscriberObject[] param){
                              
                                   validateSubscribers(param);

                               localSubscribersTracker = true;
                                      
                                      this.localSubscribers=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.SubscriberObject
                             */
                             public void addSubscribers(com.comverse.www.SubscriberObject param){
                                   if (localSubscribers == null){
                                   localSubscribers = new com.comverse.www.SubscriberObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localSubscribersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSubscribers);
                               list.add(param);
                               this.localSubscribers =
                             (com.comverse.www.SubscriberObject[])list.toArray(
                            new com.comverse.www.SubscriberObject[list.size()]);

                             }
                             

                        /**
                        * field for BundleInstance
                        */

                        
                                    protected com.comverse.www.BundleInstanceObject localBundleInstance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleInstanceTracker = false ;

                           public boolean isBundleInstanceSpecified(){
                               return localBundleInstanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BundleInstanceObject
                           */
                           public  com.comverse.www.BundleInstanceObject getBundleInstance(){
                               return localBundleInstance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleInstance
                               */
                               public void setBundleInstance(com.comverse.www.BundleInstanceObject param){
                            localBundleInstanceTracker = param != null;
                                   
                                            this.localBundleInstance=param;
                                    

                               }
                            

                        /**
                        * field for OfferInstances
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.OfferInstanceObject[] localOfferInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOfferInstancesTracker = false ;

                           public boolean isOfferInstancesSpecified(){
                               return localOfferInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.OfferInstanceObject[]
                           */
                           public  com.comverse.www.OfferInstanceObject[] getOfferInstances(){
                               return localOfferInstances;
                           }

                           
                        


                               
                              /**
                               * validate the array for OfferInstances
                               */
                              protected void validateOfferInstances(com.comverse.www.OfferInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param OfferInstances
                              */
                              public void setOfferInstances(com.comverse.www.OfferInstanceObject[] param){
                              
                                   validateOfferInstances(param);

                               localOfferInstancesTracker = true;
                                      
                                      this.localOfferInstances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.OfferInstanceObject
                             */
                             public void addOfferInstances(com.comverse.www.OfferInstanceObject param){
                                   if (localOfferInstances == null){
                                   localOfferInstances = new com.comverse.www.OfferInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localOfferInstancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localOfferInstances);
                               list.add(param);
                               this.localOfferInstances =
                             (com.comverse.www.OfferInstanceObject[])list.toArray(
                            new com.comverse.www.OfferInstanceObject[list.size()]);

                             }
                             

                        /**
                        * field for BtPromotionPlanInstances
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.BtPromotionPlanInstanceObject[] localBtPromotionPlanInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBtPromotionPlanInstancesTracker = false ;

                           public boolean isBtPromotionPlanInstancesSpecified(){
                               return localBtPromotionPlanInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BtPromotionPlanInstanceObject[]
                           */
                           public  com.comverse.www.BtPromotionPlanInstanceObject[] getBtPromotionPlanInstances(){
                               return localBtPromotionPlanInstances;
                           }

                           
                        


                               
                              /**
                               * validate the array for BtPromotionPlanInstances
                               */
                              protected void validateBtPromotionPlanInstances(com.comverse.www.BtPromotionPlanInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BtPromotionPlanInstances
                              */
                              public void setBtPromotionPlanInstances(com.comverse.www.BtPromotionPlanInstanceObject[] param){
                              
                                   validateBtPromotionPlanInstances(param);

                               localBtPromotionPlanInstancesTracker = true;
                                      
                                      this.localBtPromotionPlanInstances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.BtPromotionPlanInstanceObject
                             */
                             public void addBtPromotionPlanInstances(com.comverse.www.BtPromotionPlanInstanceObject param){
                                   if (localBtPromotionPlanInstances == null){
                                   localBtPromotionPlanInstances = new com.comverse.www.BtPromotionPlanInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localBtPromotionPlanInstancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBtPromotionPlanInstances);
                               list.add(param);
                               this.localBtPromotionPlanInstances =
                             (com.comverse.www.BtPromotionPlanInstanceObject[])list.toArray(
                            new com.comverse.www.BtPromotionPlanInstanceObject[list.size()]);

                             }
                             

                        /**
                        * field for BalanceInstances
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.BalanceInstanceObject[] localBalanceInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceInstancesTracker = false ;

                           public boolean isBalanceInstancesSpecified(){
                               return localBalanceInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BalanceInstanceObject[]
                           */
                           public  com.comverse.www.BalanceInstanceObject[] getBalanceInstances(){
                               return localBalanceInstances;
                           }

                           
                        


                               
                              /**
                               * validate the array for BalanceInstances
                               */
                              protected void validateBalanceInstances(com.comverse.www.BalanceInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BalanceInstances
                              */
                              public void setBalanceInstances(com.comverse.www.BalanceInstanceObject[] param){
                              
                                   validateBalanceInstances(param);

                               localBalanceInstancesTracker = true;
                                      
                                      this.localBalanceInstances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.BalanceInstanceObject
                             */
                             public void addBalanceInstances(com.comverse.www.BalanceInstanceObject param){
                                   if (localBalanceInstances == null){
                                   localBalanceInstances = new com.comverse.www.BalanceInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localBalanceInstancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBalanceInstances);
                               list.add(param);
                               this.localBalanceInstances =
                             (com.comverse.www.BalanceInstanceObject[])list.toArray(
                            new com.comverse.www.BalanceInstanceObject[list.size()]);

                             }
                             

                        /**
                        * field for Accumulators
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.AccumulatorInstanceObject[] localAccumulators ;
                                
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
                           * @return com.comverse.www.AccumulatorInstanceObject[]
                           */
                           public  com.comverse.www.AccumulatorInstanceObject[] getAccumulators(){
                               return localAccumulators;
                           }

                           
                        


                               
                              /**
                               * validate the array for Accumulators
                               */
                              protected void validateAccumulators(com.comverse.www.AccumulatorInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Accumulators
                              */
                              public void setAccumulators(com.comverse.www.AccumulatorInstanceObject[] param){
                              
                                   validateAccumulators(param);

                               localAccumulatorsTracker = true;
                                      
                                      this.localAccumulators=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.AccumulatorInstanceObject
                             */
                             public void addAccumulators(com.comverse.www.AccumulatorInstanceObject param){
                                   if (localAccumulators == null){
                                   localAccumulators = new com.comverse.www.AccumulatorInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localAccumulatorsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAccumulators);
                               list.add(param);
                               this.localAccumulators =
                             (com.comverse.www.AccumulatorInstanceObject[])list.toArray(
                            new com.comverse.www.AccumulatorInstanceObject[list.size()]);

                             }
                             

                        /**
                        * field for NrcTermInstances
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.NrcTermInstanceObject[] localNrcTermInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNrcTermInstancesTracker = false ;

                           public boolean isNrcTermInstancesSpecified(){
                               return localNrcTermInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NrcTermInstanceObject[]
                           */
                           public  com.comverse.www.NrcTermInstanceObject[] getNrcTermInstances(){
                               return localNrcTermInstances;
                           }

                           
                        


                               
                              /**
                               * validate the array for NrcTermInstances
                               */
                              protected void validateNrcTermInstances(com.comverse.www.NrcTermInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NrcTermInstances
                              */
                              public void setNrcTermInstances(com.comverse.www.NrcTermInstanceObject[] param){
                              
                                   validateNrcTermInstances(param);

                               localNrcTermInstancesTracker = true;
                                      
                                      this.localNrcTermInstances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.NrcTermInstanceObject
                             */
                             public void addNrcTermInstances(com.comverse.www.NrcTermInstanceObject param){
                                   if (localNrcTermInstances == null){
                                   localNrcTermInstances = new com.comverse.www.NrcTermInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localNrcTermInstancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNrcTermInstances);
                               list.add(param);
                               this.localNrcTermInstances =
                             (com.comverse.www.NrcTermInstanceObject[])list.toArray(
                            new com.comverse.www.NrcTermInstanceObject[list.size()]);

                             }
                             

                        /**
                        * field for RcTermInstances
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.RcTermInstanceObject[] localRcTermInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcTermInstancesTracker = false ;

                           public boolean isRcTermInstancesSpecified(){
                               return localRcTermInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.RcTermInstanceObject[]
                           */
                           public  com.comverse.www.RcTermInstanceObject[] getRcTermInstances(){
                               return localRcTermInstances;
                           }

                           
                        


                               
                              /**
                               * validate the array for RcTermInstances
                               */
                              protected void validateRcTermInstances(com.comverse.www.RcTermInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RcTermInstances
                              */
                              public void setRcTermInstances(com.comverse.www.RcTermInstanceObject[] param){
                              
                                   validateRcTermInstances(param);

                               localRcTermInstancesTracker = true;
                                      
                                      this.localRcTermInstances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.RcTermInstanceObject
                             */
                             public void addRcTermInstances(com.comverse.www.RcTermInstanceObject param){
                                   if (localRcTermInstances == null){
                                   localRcTermInstances = new com.comverse.www.RcTermInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localRcTermInstancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRcTermInstances);
                               list.add(param);
                               this.localRcTermInstances =
                             (com.comverse.www.RcTermInstanceObject[])list.toArray(
                            new com.comverse.www.RcTermInstanceObject[list.size()]);

                             }
                             

                        /**
                        * field for RcTermInstanceRateKeyList
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.RcTermInstanceRateKeyObject[] localRcTermInstanceRateKeyList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcTermInstanceRateKeyListTracker = false ;

                           public boolean isRcTermInstanceRateKeyListSpecified(){
                               return localRcTermInstanceRateKeyListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.RcTermInstanceRateKeyObject[]
                           */
                           public  com.comverse.www.RcTermInstanceRateKeyObject[] getRcTermInstanceRateKeyList(){
                               return localRcTermInstanceRateKeyList;
                           }

                           
                        


                               
                              /**
                               * validate the array for RcTermInstanceRateKeyList
                               */
                              protected void validateRcTermInstanceRateKeyList(com.comverse.www.RcTermInstanceRateKeyObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RcTermInstanceRateKeyList
                              */
                              public void setRcTermInstanceRateKeyList(com.comverse.www.RcTermInstanceRateKeyObject[] param){
                              
                                   validateRcTermInstanceRateKeyList(param);

                               localRcTermInstanceRateKeyListTracker = true;
                                      
                                      this.localRcTermInstanceRateKeyList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.RcTermInstanceRateKeyObject
                             */
                             public void addRcTermInstanceRateKeyList(com.comverse.www.RcTermInstanceRateKeyObject param){
                                   if (localRcTermInstanceRateKeyList == null){
                                   localRcTermInstanceRateKeyList = new com.comverse.www.RcTermInstanceRateKeyObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localRcTermInstanceRateKeyListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRcTermInstanceRateKeyList);
                               list.add(param);
                               this.localRcTermInstanceRateKeyList =
                             (com.comverse.www.RcTermInstanceRateKeyObject[])list.toArray(
                            new com.comverse.www.RcTermInstanceRateKeyObject[list.size()]);

                             }
                             

                        /**
                        * field for RcTermInstanceRateOverrideList
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.RcTermInstanceRateOverrideObject[] localRcTermInstanceRateOverrideList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcTermInstanceRateOverrideListTracker = false ;

                           public boolean isRcTermInstanceRateOverrideListSpecified(){
                               return localRcTermInstanceRateOverrideListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.RcTermInstanceRateOverrideObject[]
                           */
                           public  com.comverse.www.RcTermInstanceRateOverrideObject[] getRcTermInstanceRateOverrideList(){
                               return localRcTermInstanceRateOverrideList;
                           }

                           
                        


                               
                              /**
                               * validate the array for RcTermInstanceRateOverrideList
                               */
                              protected void validateRcTermInstanceRateOverrideList(com.comverse.www.RcTermInstanceRateOverrideObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RcTermInstanceRateOverrideList
                              */
                              public void setRcTermInstanceRateOverrideList(com.comverse.www.RcTermInstanceRateOverrideObject[] param){
                              
                                   validateRcTermInstanceRateOverrideList(param);

                               localRcTermInstanceRateOverrideListTracker = true;
                                      
                                      this.localRcTermInstanceRateOverrideList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.RcTermInstanceRateOverrideObject
                             */
                             public void addRcTermInstanceRateOverrideList(com.comverse.www.RcTermInstanceRateOverrideObject param){
                                   if (localRcTermInstanceRateOverrideList == null){
                                   localRcTermInstanceRateOverrideList = new com.comverse.www.RcTermInstanceRateOverrideObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localRcTermInstanceRateOverrideListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRcTermInstanceRateOverrideList);
                               list.add(param);
                               this.localRcTermInstanceRateOverrideList =
                             (com.comverse.www.RcTermInstanceRateOverrideObject[])list.toArray(
                            new com.comverse.www.RcTermInstanceRateOverrideObject[list.size()]);

                             }
                             

                        /**
                        * field for Reservations
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.ReservationObject[] localReservations ;
                                
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
                           * @return com.comverse.www.ReservationObject[]
                           */
                           public  com.comverse.www.ReservationObject[] getReservations(){
                               return localReservations;
                           }

                           
                        


                               
                              /**
                               * validate the array for Reservations
                               */
                              protected void validateReservations(com.comverse.www.ReservationObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Reservations
                              */
                              public void setReservations(com.comverse.www.ReservationObject[] param){
                              
                                   validateReservations(param);

                               localReservationsTracker = true;
                                      
                                      this.localReservations=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.ReservationObject
                             */
                             public void addReservations(com.comverse.www.ReservationObject param){
                                   if (localReservations == null){
                                   localReservations = new com.comverse.www.ReservationObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localReservationsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localReservations);
                               list.add(param);
                               this.localReservations =
                             (com.comverse.www.ReservationObject[])list.toArray(
                            new com.comverse.www.ReservationObject[list.size()]);

                             }
                             

                        /**
                        * field for BalanceGrants
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.BalanceGrantObject[] localBalanceGrants ;
                                
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
                           * @return com.comverse.www.BalanceGrantObject[]
                           */
                           public  com.comverse.www.BalanceGrantObject[] getBalanceGrants(){
                               return localBalanceGrants;
                           }

                           
                        


                               
                              /**
                               * validate the array for BalanceGrants
                               */
                              protected void validateBalanceGrants(com.comverse.www.BalanceGrantObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BalanceGrants
                              */
                              public void setBalanceGrants(com.comverse.www.BalanceGrantObject[] param){
                              
                                   validateBalanceGrants(param);

                               localBalanceGrantsTracker = true;
                                      
                                      this.localBalanceGrants=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.BalanceGrantObject
                             */
                             public void addBalanceGrants(com.comverse.www.BalanceGrantObject param){
                                   if (localBalanceGrants == null){
                                   localBalanceGrants = new com.comverse.www.BalanceGrantObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localBalanceGrantsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBalanceGrants);
                               list.add(param);
                               this.localBalanceGrants =
                             (com.comverse.www.BalanceGrantObject[])list.toArray(
                            new com.comverse.www.BalanceGrantObject[list.size()]);

                             }
                             

                        /**
                        * field for PaymentProfile
                        */

                        
                                    protected com.comverse.www.PaymentProfileObject localPaymentProfile ;
                                
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
                           * @return com.comverse.www.PaymentProfileObject
                           */
                           public  com.comverse.www.PaymentProfileObject getPaymentProfile(){
                               return localPaymentProfile;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PaymentProfile
                               */
                               public void setPaymentProfile(com.comverse.www.PaymentProfileObject param){
                            localPaymentProfileTracker = param != null;
                                   
                                            this.localPaymentProfile=param;
                                    

                               }
                            

                        /**
                        * field for LiabilityRedirectionsSource
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.LiabilityRedirectionInstanceObject[] localLiabilityRedirectionsSource ;
                                
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
                           * @return com.comverse.www.LiabilityRedirectionInstanceObject[]
                           */
                           public  com.comverse.www.LiabilityRedirectionInstanceObject[] getLiabilityRedirectionsSource(){
                               return localLiabilityRedirectionsSource;
                           }

                           
                        


                               
                              /**
                               * validate the array for LiabilityRedirectionsSource
                               */
                              protected void validateLiabilityRedirectionsSource(com.comverse.www.LiabilityRedirectionInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LiabilityRedirectionsSource
                              */
                              public void setLiabilityRedirectionsSource(com.comverse.www.LiabilityRedirectionInstanceObject[] param){
                              
                                   validateLiabilityRedirectionsSource(param);

                               localLiabilityRedirectionsSourceTracker = true;
                                      
                                      this.localLiabilityRedirectionsSource=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.LiabilityRedirectionInstanceObject
                             */
                             public void addLiabilityRedirectionsSource(com.comverse.www.LiabilityRedirectionInstanceObject param){
                                   if (localLiabilityRedirectionsSource == null){
                                   localLiabilityRedirectionsSource = new com.comverse.www.LiabilityRedirectionInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localLiabilityRedirectionsSourceTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLiabilityRedirectionsSource);
                               list.add(param);
                               this.localLiabilityRedirectionsSource =
                             (com.comverse.www.LiabilityRedirectionInstanceObject[])list.toArray(
                            new com.comverse.www.LiabilityRedirectionInstanceObject[list.size()]);

                             }
                             

                        /**
                        * field for LiabilityRedirectionsTarget
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.LiabilityRedirectionInstanceObject[] localLiabilityRedirectionsTarget ;
                                
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
                           * @return com.comverse.www.LiabilityRedirectionInstanceObject[]
                           */
                           public  com.comverse.www.LiabilityRedirectionInstanceObject[] getLiabilityRedirectionsTarget(){
                               return localLiabilityRedirectionsTarget;
                           }

                           
                        


                               
                              /**
                               * validate the array for LiabilityRedirectionsTarget
                               */
                              protected void validateLiabilityRedirectionsTarget(com.comverse.www.LiabilityRedirectionInstanceObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LiabilityRedirectionsTarget
                              */
                              public void setLiabilityRedirectionsTarget(com.comverse.www.LiabilityRedirectionInstanceObject[] param){
                              
                                   validateLiabilityRedirectionsTarget(param);

                               localLiabilityRedirectionsTargetTracker = true;
                                      
                                      this.localLiabilityRedirectionsTarget=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.LiabilityRedirectionInstanceObject
                             */
                             public void addLiabilityRedirectionsTarget(com.comverse.www.LiabilityRedirectionInstanceObject param){
                                   if (localLiabilityRedirectionsTarget == null){
                                   localLiabilityRedirectionsTarget = new com.comverse.www.LiabilityRedirectionInstanceObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localLiabilityRedirectionsTargetTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLiabilityRedirectionsTarget);
                               list.add(param);
                               this.localLiabilityRedirectionsTarget =
                             (com.comverse.www.LiabilityRedirectionInstanceObject[])list.toArray(
                            new com.comverse.www.LiabilityRedirectionInstanceObject[list.size()]);

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
                           namespacePrefix+":accountObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "accountObject",
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
                                                 throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                            }
                                           localAccountInternalId.serialize(new javax.xml.namespace.QName("","accountInternalId"),
                                               xmlWriter);
                                        } if (localInforCustomerIdTracker){
                                    if (localInforCustomerId==null){

                                        writeStartElement(null, "", "inforCustomerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInforCustomerId.serialize(new javax.xml.namespace.QName("","inforCustomerId"),
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
                                        } if (localAccountCategoryTracker){
                                            if (localAccountCategory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountCategory cannot be null!!");
                                            }
                                           localAccountCategory.serialize(new javax.xml.namespace.QName("","accountCategory"),
                                               xmlWriter);
                                        } if (localAccountRatingStatusTracker){
                                    if (localAccountRatingStatus==null){

                                        writeStartElement(null, "", "accountRatingStatus", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccountRatingStatus.serialize(new javax.xml.namespace.QName("","accountRatingStatus"),
                                        xmlWriter);
                                    }
                                } if (localAccountStatusTracker){
                                            if (localAccountStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountStatus cannot be null!!");
                                            }
                                           localAccountStatus.serialize(new javax.xml.namespace.QName("","accountStatus"),
                                               xmlWriter);
                                        } if (localAccountStatusDtTracker){
                                            if (localAccountStatusDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountStatusDt cannot be null!!");
                                            }
                                           localAccountStatusDt.serialize(new javax.xml.namespace.QName("","accountStatusDt"),
                                               xmlWriter);
                                        } if (localAccountTemplateIdTracker){
                                    if (localAccountTemplateId==null){

                                        writeStartElement(null, "", "accountTemplateId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccountTemplateId.serialize(new javax.xml.namespace.QName("","accountTemplateId"),
                                        xmlWriter);
                                    }
                                } if (localAccountTypeTracker){
                                            if (localAccountType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountType cannot be null!!");
                                            }
                                           localAccountType.serialize(new javax.xml.namespace.QName("","accountType"),
                                               xmlWriter);
                                        } if (localAcctExpireDateTracker){
                                    if (localAcctExpireDate==null){

                                        writeStartElement(null, "", "acctExpireDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAcctExpireDate.serialize(new javax.xml.namespace.QName("","acctExpireDate"),
                                        xmlWriter);
                                    }
                                } if (localAcctSegIdTracker){
                                            if (localAcctSegId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("acctSegId cannot be null!!");
                                            }
                                           localAcctSegId.serialize(new javax.xml.namespace.QName("","acctSegId"),
                                               xmlWriter);
                                        } if (localAcctbalToSubbalcoreTransferTracker){
                                            if (localAcctbalToSubbalcoreTransfer==null){
                                                 throw new org.apache.axis2.databinding.ADBException("acctbalToSubbalcoreTransfer cannot be null!!");
                                            }
                                           localAcctbalToSubbalcoreTransfer.serialize(new javax.xml.namespace.QName("","acctbalToSubbalcoreTransfer"),
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
                                } if (localAltCompanyNameTracker){
                                    if (localAltCompanyName==null){

                                        writeStartElement(null, "", "altCompanyName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAltCompanyName.serialize(new javax.xml.namespace.QName("","altCompanyName"),
                                        xmlWriter);
                                    }
                                } if (localAltFnameTracker){
                                    if (localAltFname==null){

                                        writeStartElement(null, "", "altFname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAltFname.serialize(new javax.xml.namespace.QName("","altFname"),
                                        xmlWriter);
                                    }
                                } if (localAltLnameTracker){
                                    if (localAltLname==null){

                                        writeStartElement(null, "", "altLname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAltLname.serialize(new javax.xml.namespace.QName("","altLname"),
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
                                } if (localApplyDayAcrossSubscribersTracker){
                                            if (localApplyDayAcrossSubscribers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("applyDayAcrossSubscribers cannot be null!!");
                                            }
                                           localApplyDayAcrossSubscribers.serialize(new javax.xml.namespace.QName("","applyDayAcrossSubscribers"),
                                               xmlWriter);
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
                                        } if (localBillAddress1Tracker){
                                    if (localBillAddress1==null){

                                        writeStartElement(null, "", "billAddress1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillAddress1.serialize(new javax.xml.namespace.QName("","billAddress1"),
                                        xmlWriter);
                                    }
                                } if (localBillAddress2Tracker){
                                    if (localBillAddress2==null){

                                        writeStartElement(null, "", "billAddress2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillAddress2.serialize(new javax.xml.namespace.QName("","billAddress2"),
                                        xmlWriter);
                                    }
                                } if (localBillAddress3Tracker){
                                    if (localBillAddress3==null){

                                        writeStartElement(null, "", "billAddress3", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillAddress3.serialize(new javax.xml.namespace.QName("","billAddress3"),
                                        xmlWriter);
                                    }
                                } if (localBillAddress4Tracker){
                                    if (localBillAddress4==null){

                                        writeStartElement(null, "", "billAddress4", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillAddress4.serialize(new javax.xml.namespace.QName("","billAddress4"),
                                        xmlWriter);
                                    }
                                } if (localBillCityTracker){
                                    if (localBillCity==null){

                                        writeStartElement(null, "", "billCity", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillCity.serialize(new javax.xml.namespace.QName("","billCity"),
                                        xmlWriter);
                                    }
                                } if (localBillCompanyTracker){
                                    if (localBillCompany==null){

                                        writeStartElement(null, "", "billCompany", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillCompany.serialize(new javax.xml.namespace.QName("","billCompany"),
                                        xmlWriter);
                                    }
                                } if (localBillCountryCodeTracker){
                                    if (localBillCountryCode==null){

                                        writeStartElement(null, "", "billCountryCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillCountryCode.serialize(new javax.xml.namespace.QName("","billCountryCode"),
                                        xmlWriter);
                                    }
                                } if (localBillCountyTracker){
                                    if (localBillCounty==null){

                                        writeStartElement(null, "", "billCounty", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillCounty.serialize(new javax.xml.namespace.QName("","billCounty"),
                                        xmlWriter);
                                    }
                                } if (localBillDispMethTracker){
                                    if (localBillDispMeth==null){

                                        writeStartElement(null, "", "billDispMeth", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillDispMeth.serialize(new javax.xml.namespace.QName("","billDispMeth"),
                                        xmlWriter);
                                    }
                                } if (localBillFmtOptTracker){
                                    if (localBillFmtOpt==null){

                                        writeStartElement(null, "", "billFmtOpt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillFmtOpt.serialize(new javax.xml.namespace.QName("","billFmtOpt"),
                                        xmlWriter);
                                    }
                                } if (localBillFnameTracker){
                                    if (localBillFname==null){

                                        writeStartElement(null, "", "billFname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillFname.serialize(new javax.xml.namespace.QName("","billFname"),
                                        xmlWriter);
                                    }
                                } if (localBillFranchiseTaxCodeTracker){
                                    if (localBillFranchiseTaxCode==null){

                                        writeStartElement(null, "", "billFranchiseTaxCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillFranchiseTaxCode.serialize(new javax.xml.namespace.QName("","billFranchiseTaxCode"),
                                        xmlWriter);
                                    }
                                } if (localBillGeocodeTracker){
                                    if (localBillGeocode==null){

                                        writeStartElement(null, "", "billGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillGeocode.serialize(new javax.xml.namespace.QName("","billGeocode"),
                                        xmlWriter);
                                    }
                                } if (localBillHoldCodeTracker){
                                    if (localBillHoldCode==null){

                                        writeStartElement(null, "", "billHoldCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillHoldCode.serialize(new javax.xml.namespace.QName("","billHoldCode"),
                                        xmlWriter);
                                    }
                                } if (localBillLnameTracker){
                                    if (localBillLname==null){

                                        writeStartElement(null, "", "billLname", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillLname.serialize(new javax.xml.namespace.QName("","billLname"),
                                        xmlWriter);
                                    }
                                } if (localBillMinitTracker){
                                    if (localBillMinit==null){

                                        writeStartElement(null, "", "billMinit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillMinit.serialize(new javax.xml.namespace.QName("","billMinit"),
                                        xmlWriter);
                                    }
                                } if (localBillNameGenerationTracker){
                                    if (localBillNameGeneration==null){

                                        writeStartElement(null, "", "billNameGeneration", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillNameGeneration.serialize(new javax.xml.namespace.QName("","billNameGeneration"),
                                        xmlWriter);
                                    }
                                } if (localBillNamePreTracker){
                                    if (localBillNamePre==null){

                                        writeStartElement(null, "", "billNamePre", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillNamePre.serialize(new javax.xml.namespace.QName("","billNamePre"),
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
                                } if (localBillSequenceNumTracker){
                                            if (localBillSequenceNum==null){
                                                 throw new org.apache.axis2.databinding.ADBException("billSequenceNum cannot be null!!");
                                            }
                                           localBillSequenceNum.serialize(new javax.xml.namespace.QName("","billSequenceNum"),
                                               xmlWriter);
                                        } if (localBillStateTracker){
                                    if (localBillState==null){

                                        writeStartElement(null, "", "billState", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillState.serialize(new javax.xml.namespace.QName("","billState"),
                                        xmlWriter);
                                    }
                                } if (localBillTitleTracker){
                                    if (localBillTitle==null){

                                        writeStartElement(null, "", "billTitle", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillTitle.serialize(new javax.xml.namespace.QName("","billTitle"),
                                        xmlWriter);
                                    }
                                } if (localBillZipTracker){
                                    if (localBillZip==null){

                                        writeStartElement(null, "", "billZip", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillZip.serialize(new javax.xml.namespace.QName("","billZip"),
                                        xmlWriter);
                                    }
                                } if (localBilledFromDtTracker){
                                    if (localBilledFromDt==null){

                                        writeStartElement(null, "", "billedFromDt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBilledFromDt.serialize(new javax.xml.namespace.QName("","billedFromDt"),
                                        xmlWriter);
                                    }
                                } if (localBillingFrequencyTracker){
                                    if (localBillingFrequency==null){

                                        writeStartElement(null, "", "billingFrequency", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillingFrequency.serialize(new javax.xml.namespace.QName("","billingFrequency"),
                                        xmlWriter);
                                    }
                                } if (localBillingServiceCenterTracker){
                                    if (localBillingServiceCenter==null){

                                        writeStartElement(null, "", "billingServiceCenter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBillingServiceCenter.serialize(new javax.xml.namespace.QName("","billingServiceCenter"),
                                        xmlWriter);
                                    }
                                } if (localChargeThresholdTracker){
                                            if (localChargeThreshold==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chargeThreshold cannot be null!!");
                                            }
                                           localChargeThreshold.serialize(new javax.xml.namespace.QName("","chargeThreshold"),
                                               xmlWriter);
                                        } if (localChgDateTracker){
                                    if (localChgDate==null){

                                        writeStartElement(null, "", "chgDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChgDate.serialize(new javax.xml.namespace.QName("","chgDate"),
                                        xmlWriter);
                                    }
                                } if (localChgWhoTracker){
                                            if (localChgWho==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chgWho cannot be null!!");
                                            }
                                           localChgWho.serialize(new javax.xml.namespace.QName("","chgWho"),
                                               xmlWriter);
                                        } if (localChildCountTracker){
                                    if (localChildCount==null){

                                        writeStartElement(null, "", "childCount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChildCount.serialize(new javax.xml.namespace.QName("","childCount"),
                                        xmlWriter);
                                    }
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
                                } if (localCollectionHistoryTracker){
                                    if (localCollectionHistory==null){

                                        writeStartElement(null, "", "collectionHistory", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCollectionHistory.serialize(new javax.xml.namespace.QName("","collectionHistory"),
                                        xmlWriter);
                                    }
                                } if (localCollectionIndicatorTracker){
                                            if (localCollectionIndicator==null){
                                                 throw new org.apache.axis2.databinding.ADBException("collectionIndicator cannot be null!!");
                                            }
                                           localCollectionIndicator.serialize(new javax.xml.namespace.QName("","collectionIndicator"),
                                               xmlWriter);
                                        } if (localCollectionStatusTracker){
                                            if (localCollectionStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("collectionStatus cannot be null!!");
                                            }
                                           localCollectionStatus.serialize(new javax.xml.namespace.QName("","collectionStatus"),
                                               xmlWriter);
                                        } if (localCollectionsServiceCenterTracker){
                                    if (localCollectionsServiceCenter==null){

                                        writeStartElement(null, "", "collectionsServiceCenter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCollectionsServiceCenter.serialize(new javax.xml.namespace.QName("","collectionsServiceCenter"),
                                        xmlWriter);
                                    }
                                } if (localContact1NameTracker){
                                    if (localContact1Name==null){

                                        writeStartElement(null, "", "contact1Name", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localContact1Name.serialize(new javax.xml.namespace.QName("","contact1Name"),
                                        xmlWriter);
                                    }
                                } if (localContact1PhoneTracker){
                                    if (localContact1Phone==null){

                                        writeStartElement(null, "", "contact1Phone", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localContact1Phone.serialize(new javax.xml.namespace.QName("","contact1Phone"),
                                        xmlWriter);
                                    }
                                } if (localContact2NameTracker){
                                    if (localContact2Name==null){

                                        writeStartElement(null, "", "contact2Name", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localContact2Name.serialize(new javax.xml.namespace.QName("","contact2Name"),
                                        xmlWriter);
                                    }
                                } if (localContact2PhoneTracker){
                                    if (localContact2Phone==null){

                                        writeStartElement(null, "", "contact2Phone", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localContact2Phone.serialize(new javax.xml.namespace.QName("","contact2Phone"),
                                        xmlWriter);
                                    }
                                } if (localConvertedTracker){
                                            if (localConverted==null){
                                                 throw new org.apache.axis2.databinding.ADBException("converted cannot be null!!");
                                            }
                                           localConverted.serialize(new javax.xml.namespace.QName("","converted"),
                                               xmlWriter);
                                        } if (localCredStatusTracker){
                                    if (localCredStatus==null){

                                        writeStartElement(null, "", "credStatus", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCredStatus.serialize(new javax.xml.namespace.QName("","credStatus"),
                                        xmlWriter);
                                    }
                                } if (localCreditRatingTracker){
                                            if (localCreditRating==null){
                                                 throw new org.apache.axis2.databinding.ADBException("creditRating cannot be null!!");
                                            }
                                           localCreditRating.serialize(new javax.xml.namespace.QName("","creditRating"),
                                               xmlWriter);
                                        } if (localCreditThreshTracker){
                                    if (localCreditThresh==null){

                                        writeStartElement(null, "", "creditThresh", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCreditThresh.serialize(new javax.xml.namespace.QName("","creditThresh"),
                                        xmlWriter);
                                    }
                                } if (localCurrencyCodeTracker){
                                            if (localCurrencyCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                            }
                                           localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                               xmlWriter);
                                        } if (localCurrentStateTracker){
                                            if (localCurrentState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currentState cannot be null!!");
                                            }
                                           localCurrentState.serialize(new javax.xml.namespace.QName("","currentState"),
                                               xmlWriter);
                                        } if (localCustAddress1Tracker){
                                    if (localCustAddress1==null){

                                        writeStartElement(null, "", "custAddress1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustAddress1.serialize(new javax.xml.namespace.QName("","custAddress1"),
                                        xmlWriter);
                                    }
                                } if (localCustAddress2Tracker){
                                    if (localCustAddress2==null){

                                        writeStartElement(null, "", "custAddress2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustAddress2.serialize(new javax.xml.namespace.QName("","custAddress2"),
                                        xmlWriter);
                                    }
                                } if (localCustAddress3Tracker){
                                    if (localCustAddress3==null){

                                        writeStartElement(null, "", "custAddress3", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustAddress3.serialize(new javax.xml.namespace.QName("","custAddress3"),
                                        xmlWriter);
                                    }
                                } if (localCustAddress4Tracker){
                                    if (localCustAddress4==null){

                                        writeStartElement(null, "", "custAddress4", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustAddress4.serialize(new javax.xml.namespace.QName("","custAddress4"),
                                        xmlWriter);
                                    }
                                } if (localCustCityTracker){
                                    if (localCustCity==null){

                                        writeStartElement(null, "", "custCity", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustCity.serialize(new javax.xml.namespace.QName("","custCity"),
                                        xmlWriter);
                                    }
                                } if (localCustCountryCodeTracker){
                                    if (localCustCountryCode==null){

                                        writeStartElement(null, "", "custCountryCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustCountryCode.serialize(new javax.xml.namespace.QName("","custCountryCode"),
                                        xmlWriter);
                                    }
                                } if (localCustCountyTracker){
                                    if (localCustCounty==null){

                                        writeStartElement(null, "", "custCounty", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustCounty.serialize(new javax.xml.namespace.QName("","custCounty"),
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
                                } if (localCustFaxnoTracker){
                                    if (localCustFaxno==null){

                                        writeStartElement(null, "", "custFaxno", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustFaxno.serialize(new javax.xml.namespace.QName("","custFaxno"),
                                        xmlWriter);
                                    }
                                } if (localCustFranchiseTaxCodeTracker){
                                    if (localCustFranchiseTaxCode==null){

                                        writeStartElement(null, "", "custFranchiseTaxCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustFranchiseTaxCode.serialize(new javax.xml.namespace.QName("","custFranchiseTaxCode"),
                                        xmlWriter);
                                    }
                                } if (localCustGeocodeTracker){
                                    if (localCustGeocode==null){

                                        writeStartElement(null, "", "custGeocode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustGeocode.serialize(new javax.xml.namespace.QName("","custGeocode"),
                                        xmlWriter);
                                    }
                                } if (localCustPhone1Tracker){
                                    if (localCustPhone1==null){

                                        writeStartElement(null, "", "custPhone1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustPhone1.serialize(new javax.xml.namespace.QName("","custPhone1"),
                                        xmlWriter);
                                    }
                                } if (localCustPhone2Tracker){
                                    if (localCustPhone2==null){

                                        writeStartElement(null, "", "custPhone2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustPhone2.serialize(new javax.xml.namespace.QName("","custPhone2"),
                                        xmlWriter);
                                    }
                                } if (localCustStateTracker){
                                    if (localCustState==null){

                                        writeStartElement(null, "", "custState", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustState.serialize(new javax.xml.namespace.QName("","custState"),
                                        xmlWriter);
                                    }
                                } if (localCustZipTracker){
                                    if (localCustZip==null){

                                        writeStartElement(null, "", "custZip", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustZip.serialize(new javax.xml.namespace.QName("","custZip"),
                                        xmlWriter);
                                    }
                                } if (localCyclicalThresholdTracker){
                                            if (localCyclicalThreshold==null){
                                                 throw new org.apache.axis2.databinding.ADBException("cyclicalThreshold cannot be null!!");
                                            }
                                           localCyclicalThreshold.serialize(new javax.xml.namespace.QName("","cyclicalThreshold"),
                                               xmlWriter);
                                        } if (localDateActiveTracker){
                                    if (localDateActive==null){

                                        writeStartElement(null, "", "dateActive", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDateActive.serialize(new javax.xml.namespace.QName("","dateActive"),
                                        xmlWriter);
                                    }
                                } if (localDateCreatedTracker){
                                            if (localDateCreated==null){
                                                 throw new org.apache.axis2.databinding.ADBException("dateCreated cannot be null!!");
                                            }
                                           localDateCreated.serialize(new javax.xml.namespace.QName("","dateCreated"),
                                               xmlWriter);
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
                                } if (localDateInactiveTracker){
                                    if (localDateInactive==null){

                                        writeStartElement(null, "", "dateInactive", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDateInactive.serialize(new javax.xml.namespace.QName("","dateInactive"),
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
                                } if (localDeptTracker){
                                    if (localDept==null){

                                        writeStartElement(null, "", "dept", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDept.serialize(new javax.xml.namespace.QName("","dept"),
                                        xmlWriter);
                                    }
                                } if (localDiscRcvOptTracker){
                                    if (localDiscRcvOpt==null){

                                        writeStartElement(null, "", "discRcvOpt", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDiscRcvOpt.serialize(new javax.xml.namespace.QName("","discRcvOpt"),
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
                                } if (localDistrChanTracker){
                                    if (localDistrChan==null){

                                        writeStartElement(null, "", "distrChan", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDistrChan.serialize(new javax.xml.namespace.QName("","distrChan"),
                                        xmlWriter);
                                    }
                                } if (localEnableCdrTracker){
                                            if (localEnableCdr==null){
                                                 throw new org.apache.axis2.databinding.ADBException("enableCdr cannot be null!!");
                                            }
                                           localEnableCdr.serialize(new javax.xml.namespace.QName("","enableCdr"),
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
                                } if (localExtendedDataTracker){
                                            if (localExtendedData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                            }
                                           localExtendedData.serialize(new javax.xml.namespace.QName("","extendedData"),
                                               xmlWriter);
                                        } if (localGenderTracker){
                                    if (localGender==null){

                                        writeStartElement(null, "", "gender", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGender.serialize(new javax.xml.namespace.QName("","gender"),
                                        xmlWriter);
                                    }
                                } if (localGlobalContractStatusTracker){
                                            if (localGlobalContractStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("globalContractStatus cannot be null!!");
                                            }
                                           localGlobalContractStatus.serialize(new javax.xml.namespace.QName("","globalContractStatus"),
                                               xmlWriter);
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
                                } if (localHierarchyAccountExternalIdTracker){
                                            if (localHierarchyAccountExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hierarchyAccountExternalId cannot be null!!");
                                            }
                                           localHierarchyAccountExternalId.serialize(new javax.xml.namespace.QName("","hierarchyAccountExternalId"),
                                               xmlWriter);
                                        } if (localHierarchyAccountExternalIdTypeTracker){
                                            if (localHierarchyAccountExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hierarchyAccountExternalIdType cannot be null!!");
                                            }
                                           localHierarchyAccountExternalIdType.serialize(new javax.xml.namespace.QName("","hierarchyAccountExternalIdType"),
                                               xmlWriter);
                                        } if (localHierarchyAccountInternalIdTracker){
                                            if (localHierarchyAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("hierarchyAccountInternalId cannot be null!!");
                                            }
                                           localHierarchyAccountInternalId.serialize(new javax.xml.namespace.QName("","hierarchyAccountInternalId"),
                                               xmlWriter);
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
                                        } if (localInUseTracker){
                                    if (localInUse==null){

                                        writeStartElement(null, "", "inUse", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInUse.serialize(new javax.xml.namespace.QName("","inUse"),
                                        xmlWriter);
                                    }
                                } if (localInsertGrpIdTracker){
                                    if (localInsertGrpId==null){

                                        writeStartElement(null, "", "insertGrpId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInsertGrpId.serialize(new javax.xml.namespace.QName("","insertGrpId"),
                                        xmlWriter);
                                    }
                                } if (localIs1SaTracker){
                                            if (localIs1Sa==null){
                                                 throw new org.apache.axis2.databinding.ADBException("is1sa cannot be null!!");
                                            }
                                           localIs1Sa.serialize(new javax.xml.namespace.QName("","is1sa"),
                                               xmlWriter);
                                        } if (localIsActivatedTracker){
                                            if (localIsActivated==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isActivated cannot be null!!");
                                            }
                                           localIsActivated.serialize(new javax.xml.namespace.QName("","isActivated"),
                                               xmlWriter);
                                        } if (localIsCssRegisteredTracker){
                                            if (localIsCssRegistered==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isCssRegistered cannot be null!!");
                                            }
                                           localIsCssRegistered.serialize(new javax.xml.namespace.QName("","isCssRegistered"),
                                               xmlWriter);
                                        } if (localIsTmlEnabledTracker){
                                            if (localIsTmlEnabled==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isTmlEnabled cannot be null!!");
                                            }
                                           localIsTmlEnabled.serialize(new javax.xml.namespace.QName("","isTmlEnabled"),
                                               xmlWriter);
                                        } if (localLanguageCodeTracker){
                                            if (localLanguageCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("languageCode cannot be null!!");
                                            }
                                           localLanguageCode.serialize(new javax.xml.namespace.QName("","languageCode"),
                                               xmlWriter);
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
                                } if (localLatestQuoteImageTracker){
                                    if (localLatestQuoteImage==null){

                                        writeStartElement(null, "", "latestQuoteImage", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLatestQuoteImage.serialize(new javax.xml.namespace.QName("","latestQuoteImage"),
                                        xmlWriter);
                                    }
                                } if (localLiabilityRedirectFlagTracker){
                                            if (localLiabilityRedirectFlag==null){
                                                 throw new org.apache.axis2.databinding.ADBException("liabilityRedirectFlag cannot be null!!");
                                            }
                                           localLiabilityRedirectFlag.serialize(new javax.xml.namespace.QName("","liabilityRedirectFlag"),
                                               xmlWriter);
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
                                } if (localMktCodeTracker){
                                    if (localMktCode==null){

                                        writeStartElement(null, "", "mktCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMktCode.serialize(new javax.xml.namespace.QName("","mktCode"),
                                        xmlWriter);
                                    }
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
                                } if (localMsgGrpIdTracker){
                                    if (localMsgGrpId==null){

                                        writeStartElement(null, "", "msgGrpId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMsgGrpId.serialize(new javax.xml.namespace.QName("","msgGrpId"),
                                        xmlWriter);
                                    }
                                } if (localNextBillDateTracker){
                                    if (localNextBillDate==null){

                                        writeStartElement(null, "", "nextBillDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextBillDate.serialize(new javax.xml.namespace.QName("","nextBillDate"),
                                        xmlWriter);
                                    }
                                } if (localNoBillTracker){
                                            if (localNoBill==null){
                                                 throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                            }
                                           localNoBill.serialize(new javax.xml.namespace.QName("","noBill"),
                                               xmlWriter);
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
                                        } if (localNotificationLanguageIdTracker){
                                    if (localNotificationLanguageId==null){

                                        writeStartElement(null, "", "notificationLanguageId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNotificationLanguageId.serialize(new javax.xml.namespace.QName("","notificationLanguageId"),
                                        xmlWriter);
                                    }
                                } if (localNotificationLevelTracker){
                                    if (localNotificationLevel==null){

                                        writeStartElement(null, "", "notificationLevel", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNotificationLevel.serialize(new javax.xml.namespace.QName("","notificationLevel"),
                                        xmlWriter);
                                    }
                                } if (localOwningCostCtrTracker){
                                            if (localOwningCostCtr==null){
                                                 throw new org.apache.axis2.databinding.ADBException("owningCostCtr cannot be null!!");
                                            }
                                           localOwningCostCtr.serialize(new javax.xml.namespace.QName("","owningCostCtr"),
                                               xmlWriter);
                                        } if (localParentAccountExternalIdTracker){
                                            if (localParentAccountExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("parentAccountExternalId cannot be null!!");
                                            }
                                           localParentAccountExternalId.serialize(new javax.xml.namespace.QName("","parentAccountExternalId"),
                                               xmlWriter);
                                        } if (localParentAccountExternalIdTypeTracker){
                                            if (localParentAccountExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("parentAccountExternalIdType cannot be null!!");
                                            }
                                           localParentAccountExternalIdType.serialize(new javax.xml.namespace.QName("","parentAccountExternalIdType"),
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
                                } if (localPaymentProfileIdTracker){
                                            if (localPaymentProfileId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("paymentProfileId cannot be null!!");
                                            }
                                           localPaymentProfileId.serialize(new javax.xml.namespace.QName("","paymentProfileId"),
                                               xmlWriter);
                                        } if (localPendingChargesTracker){
                                            if (localPendingCharges==null){
                                                 throw new org.apache.axis2.databinding.ADBException("pendingCharges cannot be null!!");
                                            }
                                           localPendingCharges.serialize(new javax.xml.namespace.QName("","pendingCharges"),
                                               xmlWriter);
                                        } if (localPrevBalanceRefResetsTracker){
                                            if (localPrevBalanceRefResets==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prevBalanceRefResets cannot be null!!");
                                            }
                                           localPrevBalanceRefResets.serialize(new javax.xml.namespace.QName("","prevBalanceRefResets"),
                                               xmlWriter);
                                        } if (localPrevBalanceRefnoTracker){
                                            if (localPrevBalanceRefno==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prevBalanceRefno cannot be null!!");
                                            }
                                           localPrevBalanceRefno.serialize(new javax.xml.namespace.QName("","prevBalanceRefno"),
                                               xmlWriter);
                                        } if (localPrevBillDateTracker){
                                    if (localPrevBillDate==null){

                                        writeStartElement(null, "", "prevBillDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrevBillDate.serialize(new javax.xml.namespace.QName("","prevBillDate"),
                                        xmlWriter);
                                    }
                                } if (localPrevBillRefResetsTracker){
                                            if (localPrevBillRefResets==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prevBillRefResets cannot be null!!");
                                            }
                                           localPrevBillRefResets.serialize(new javax.xml.namespace.QName("","prevBillRefResets"),
                                               xmlWriter);
                                        } if (localPrevBillRefnoTracker){
                                            if (localPrevBillRefno==null){
                                                 throw new org.apache.axis2.databinding.ADBException("prevBillRefno cannot be null!!");
                                            }
                                           localPrevBillRefno.serialize(new javax.xml.namespace.QName("","prevBillRefno"),
                                               xmlWriter);
                                        } if (localPrevCutoffDateTracker){
                                    if (localPrevCutoffDate==null){

                                        writeStartElement(null, "", "prevCutoffDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrevCutoffDate.serialize(new javax.xml.namespace.QName("","prevCutoffDate"),
                                        xmlWriter);
                                    }
                                } if (localPrimarySubscrNoTracker){
                                    if (localPrimarySubscrNo==null){

                                        writeStartElement(null, "", "primarySubscrNo", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrimarySubscrNo.serialize(new javax.xml.namespace.QName("","primarySubscrNo"),
                                        xmlWriter);
                                    }
                                } if (localPrimarySubscrNoResetsTracker){
                                    if (localPrimarySubscrNoResets==null){

                                        writeStartElement(null, "", "primarySubscrNoResets", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrimarySubscrNoResets.serialize(new javax.xml.namespace.QName("","primarySubscrNoResets"),
                                        xmlWriter);
                                    }
                                } if (localPrintServiceCenterTracker){
                                    if (localPrintServiceCenter==null){

                                        writeStartElement(null, "", "printServiceCenter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPrintServiceCenter.serialize(new javax.xml.namespace.QName("","printServiceCenter"),
                                        xmlWriter);
                                    }
                                } if (localPurchaseOrderTracker){
                                    if (localPurchaseOrder==null){

                                        writeStartElement(null, "", "purchaseOrder", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPurchaseOrder.serialize(new javax.xml.namespace.QName("","purchaseOrder"),
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
                                } if (localRateClassDefaultTracker){
                                    if (localRateClassDefault==null){

                                        writeStartElement(null, "", "rateClassDefault", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRateClassDefault.serialize(new javax.xml.namespace.QName("","rateClassDefault"),
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
                                } if (localRegulatoryIdTracker){
                                            if (localRegulatoryId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("regulatoryId cannot be null!!");
                                            }
                                           localRegulatoryId.serialize(new javax.xml.namespace.QName("","regulatoryId"),
                                               xmlWriter);
                                        } if (localRemarkTracker){
                                    if (localRemark==null){

                                        writeStartElement(null, "", "remark", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRemark.serialize(new javax.xml.namespace.QName("","remark"),
                                        xmlWriter);
                                    }
                                } if (localRemittanceServiceCenterTracker){
                                    if (localRemittanceServiceCenter==null){

                                        writeStartElement(null, "", "remittanceServiceCenter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRemittanceServiceCenter.serialize(new javax.xml.namespace.QName("","remittanceServiceCenter"),
                                        xmlWriter);
                                    }
                                } if (localRerateLockTracker){
                                            if (localRerateLock==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rerateLock cannot be null!!");
                                            }
                                           localRerateLock.serialize(new javax.xml.namespace.QName("","rerateLock"),
                                               xmlWriter);
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
                                        } if (localSalesCodeTracker){
                                    if (localSalesCode==null){

                                        writeStartElement(null, "", "salesCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSalesCode.serialize(new javax.xml.namespace.QName("","salesCode"),
                                        xmlWriter);
                                    }
                                } if (localServiceInquiryServiceCenterTracker){
                                    if (localServiceInquiryServiceCenter==null){

                                        writeStartElement(null, "", "serviceInquiryServiceCenter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServiceInquiryServiceCenter.serialize(new javax.xml.namespace.QName("","serviceInquiryServiceCenter"),
                                        xmlWriter);
                                    }
                                } if (localSicCodeTracker){
                                    if (localSicCode==null){

                                        writeStartElement(null, "", "sicCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSicCode.serialize(new javax.xml.namespace.QName("","sicCode"),
                                        xmlWriter);
                                    }
                                } if (localSsnTracker){
                                    if (localSsn==null){

                                        writeStartElement(null, "", "ssn", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSsn.serialize(new javax.xml.namespace.QName("","ssn"),
                                        xmlWriter);
                                    }
                                } if (localStatementToEmailTracker){
                                    if (localStatementToEmail==null){

                                        writeStartElement(null, "", "statementToEmail", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStatementToEmail.serialize(new javax.xml.namespace.QName("","statementToEmail"),
                                        xmlWriter);
                                    }
                                } if (localStatementToFaxnoTracker){
                                    if (localStatementToFaxno==null){

                                        writeStartElement(null, "", "statementToFaxno", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStatementToFaxno.serialize(new javax.xml.namespace.QName("","statementToFaxno"),
                                        xmlWriter);
                                    }
                                } if (localSubbalcoreToAcctbalTransferTracker){
                                            if (localSubbalcoreToAcctbalTransfer==null){
                                                 throw new org.apache.axis2.databinding.ADBException("subbalcoreToAcctbalTransfer cannot be null!!");
                                            }
                                           localSubbalcoreToAcctbalTransfer.serialize(new javax.xml.namespace.QName("","subbalcoreToAcctbalTransfer"),
                                               xmlWriter);
                                        } if (localSuppressAccountNotificationTracker){
                                            if (localSuppressAccountNotification==null){
                                                 throw new org.apache.axis2.databinding.ADBException("suppressAccountNotification cannot be null!!");
                                            }
                                           localSuppressAccountNotification.serialize(new javax.xml.namespace.QName("","suppressAccountNotification"),
                                               xmlWriter);
                                        } if (localThreshRefTracker){
                                    if (localThreshRef==null){

                                        writeStartElement(null, "", "threshRef", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localThreshRef.serialize(new javax.xml.namespace.QName("","threshRef"),
                                        xmlWriter);
                                    }
                                } if (localThresholdTracker){
                                            if (localThreshold==null){
                                                 throw new org.apache.axis2.databinding.ADBException("threshold cannot be null!!");
                                            }
                                           localThreshold.serialize(new javax.xml.namespace.QName("","threshold"),
                                               xmlWriter);
                                        } if (localTieCodeTracker){
                                    if (localTieCode==null){

                                        writeStartElement(null, "", "tieCode", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTieCode.serialize(new javax.xml.namespace.QName("","tieCode"),
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
                                } if (localTitleTracker){
                                    if (localTitle==null){

                                        writeStartElement(null, "", "title", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTitle.serialize(new javax.xml.namespace.QName("","title"),
                                        xmlWriter);
                                    }
                                } if (localTmlAmountTracker){
                                    if (localTmlAmount==null){

                                        writeStartElement(null, "", "tmlAmount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTmlAmount.serialize(new javax.xml.namespace.QName("","tmlAmount"),
                                        xmlWriter);
                                    }
                                } if (localTmlLimitTracker){
                                    if (localTmlLimit==null){

                                        writeStartElement(null, "", "tmlLimit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTmlLimit.serialize(new javax.xml.namespace.QName("","tmlLimit"),
                                        xmlWriter);
                                    }
                                } if (localUpsellTemplateIdTracker){
                                    if (localUpsellTemplateId==null){

                                        writeStartElement(null, "", "upsellTemplateId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUpsellTemplateId.serialize(new javax.xml.namespace.QName("","upsellTemplateId"),
                                        xmlWriter);
                                    }
                                } if (localUsgAmtLimitTracker){
                                    if (localUsgAmtLimit==null){

                                        writeStartElement(null, "", "usgAmtLimit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUsgAmtLimit.serialize(new javax.xml.namespace.QName("","usgAmtLimit"),
                                        xmlWriter);
                                    }
                                } if (localUsgUnitsLimitTracker){
                                    if (localUsgUnitsLimit==null){

                                        writeStartElement(null, "", "usgUnitsLimit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUsgUnitsLimit.serialize(new javax.xml.namespace.QName("","usgUnitsLimit"),
                                        xmlWriter);
                                    }
                                } if (localVipCodeTracker){
                                            if (localVipCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("vipCode cannot be null!!");
                                            }
                                           localVipCode.serialize(new javax.xml.namespace.QName("","vipCode"),
                                               xmlWriter);
                                        } if (localAdvtAllowedTracker){
                                            if (localAdvtAllowed==null){
                                                 throw new org.apache.axis2.databinding.ADBException("advtAllowed cannot be null!!");
                                            }
                                           localAdvtAllowed.serialize(new javax.xml.namespace.QName("","advtAllowed"),
                                               xmlWriter);
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
                                        } if (localSubscribersTracker){
                                       if (localSubscribers!=null){
                                            for (int i = 0;i < localSubscribers.length;i++){
                                                if (localSubscribers[i] != null){
                                                 localSubscribers[i].serialize(new javax.xml.namespace.QName("","subscribers"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "subscribers", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "subscribers", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBundleInstanceTracker){
                                            if (localBundleInstance==null){
                                                 throw new org.apache.axis2.databinding.ADBException("bundleInstance cannot be null!!");
                                            }
                                           localBundleInstance.serialize(new javax.xml.namespace.QName("","bundleInstance"),
                                               xmlWriter);
                                        } if (localOfferInstancesTracker){
                                       if (localOfferInstances!=null){
                                            for (int i = 0;i < localOfferInstances.length;i++){
                                                if (localOfferInstances[i] != null){
                                                 localOfferInstances[i].serialize(new javax.xml.namespace.QName("","offerInstances"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "offerInstances", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "offerInstances", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBtPromotionPlanInstancesTracker){
                                       if (localBtPromotionPlanInstances!=null){
                                            for (int i = 0;i < localBtPromotionPlanInstances.length;i++){
                                                if (localBtPromotionPlanInstances[i] != null){
                                                 localBtPromotionPlanInstances[i].serialize(new javax.xml.namespace.QName("","btPromotionPlanInstances"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "btPromotionPlanInstances", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "btPromotionPlanInstances", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBalanceInstancesTracker){
                                       if (localBalanceInstances!=null){
                                            for (int i = 0;i < localBalanceInstances.length;i++){
                                                if (localBalanceInstances[i] != null){
                                                 localBalanceInstances[i].serialize(new javax.xml.namespace.QName("","balanceInstances"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "balanceInstances", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "balanceInstances", xmlWriter);

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
                                 } if (localNrcTermInstancesTracker){
                                       if (localNrcTermInstances!=null){
                                            for (int i = 0;i < localNrcTermInstances.length;i++){
                                                if (localNrcTermInstances[i] != null){
                                                 localNrcTermInstances[i].serialize(new javax.xml.namespace.QName("","nrcTermInstances"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "nrcTermInstances", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "nrcTermInstances", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRcTermInstancesTracker){
                                       if (localRcTermInstances!=null){
                                            for (int i = 0;i < localRcTermInstances.length;i++){
                                                if (localRcTermInstances[i] != null){
                                                 localRcTermInstances[i].serialize(new javax.xml.namespace.QName("","rcTermInstances"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "rcTermInstances", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "rcTermInstances", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRcTermInstanceRateKeyListTracker){
                                       if (localRcTermInstanceRateKeyList!=null){
                                            for (int i = 0;i < localRcTermInstanceRateKeyList.length;i++){
                                                if (localRcTermInstanceRateKeyList[i] != null){
                                                 localRcTermInstanceRateKeyList[i].serialize(new javax.xml.namespace.QName("","rcTermInstanceRateKeyList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "rcTermInstanceRateKeyList", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "rcTermInstanceRateKeyList", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRcTermInstanceRateOverrideListTracker){
                                       if (localRcTermInstanceRateOverrideList!=null){
                                            for (int i = 0;i < localRcTermInstanceRateOverrideList.length;i++){
                                                if (localRcTermInstanceRateOverrideList[i] != null){
                                                 localRcTermInstanceRateOverrideList[i].serialize(new javax.xml.namespace.QName("","rcTermInstanceRateOverrideList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "rcTermInstanceRateOverrideList", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "rcTermInstanceRateOverrideList", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localReservationsTracker){
                                       if (localReservations!=null){
                                            for (int i = 0;i < localReservations.length;i++){
                                                if (localReservations[i] != null){
                                                 localReservations[i].serialize(new javax.xml.namespace.QName("","reservations"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "reservations", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "reservations", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBalanceGrantsTracker){
                                       if (localBalanceGrants!=null){
                                            for (int i = 0;i < localBalanceGrants.length;i++){
                                                if (localBalanceGrants[i] != null){
                                                 localBalanceGrants[i].serialize(new javax.xml.namespace.QName("","balanceGrants"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "balanceGrants", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "balanceGrants", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localPaymentProfileTracker){
                                            if (localPaymentProfile==null){
                                                 throw new org.apache.axis2.databinding.ADBException("paymentProfile cannot be null!!");
                                            }
                                           localPaymentProfile.serialize(new javax.xml.namespace.QName("","paymentProfile"),
                                               xmlWriter);
                                        } if (localLiabilityRedirectionsSourceTracker){
                                       if (localLiabilityRedirectionsSource!=null){
                                            for (int i = 0;i < localLiabilityRedirectionsSource.length;i++){
                                                if (localLiabilityRedirectionsSource[i] != null){
                                                 localLiabilityRedirectionsSource[i].serialize(new javax.xml.namespace.QName("","liabilityRedirectionsSource"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "liabilityRedirectionsSource", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "liabilityRedirectionsSource", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localLiabilityRedirectionsTargetTracker){
                                       if (localLiabilityRedirectionsTarget!=null){
                                            for (int i = 0;i < localLiabilityRedirectionsTarget.length;i++){
                                                if (localLiabilityRedirectionsTarget[i] != null){
                                                 localLiabilityRedirectionsTarget[i].serialize(new javax.xml.namespace.QName("","liabilityRedirectionsTarget"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "liabilityRedirectionsTarget", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "liabilityRedirectionsTarget", xmlWriter);

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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","accountObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountInternalId"));
                            
                            
                                    if (localAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                    }
                                    elementList.add(localAccountInternalId);
                                } if (localInforCustomerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inforCustomerId"));
                            
                            
                                    elementList.add(localInforCustomerId==null?null:
                                    localInforCustomerId);
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
                                } if (localAccountCategoryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountCategory"));
                            
                            
                                    if (localAccountCategory==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountCategory cannot be null!!");
                                    }
                                    elementList.add(localAccountCategory);
                                } if (localAccountRatingStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountRatingStatus"));
                            
                            
                                    elementList.add(localAccountRatingStatus==null?null:
                                    localAccountRatingStatus);
                                } if (localAccountStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountStatus"));
                            
                            
                                    if (localAccountStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountStatus cannot be null!!");
                                    }
                                    elementList.add(localAccountStatus);
                                } if (localAccountStatusDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountStatusDt"));
                            
                            
                                    if (localAccountStatusDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountStatusDt cannot be null!!");
                                    }
                                    elementList.add(localAccountStatusDt);
                                } if (localAccountTemplateIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountTemplateId"));
                            
                            
                                    elementList.add(localAccountTemplateId==null?null:
                                    localAccountTemplateId);
                                } if (localAccountTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountType"));
                            
                            
                                    if (localAccountType==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountType cannot be null!!");
                                    }
                                    elementList.add(localAccountType);
                                } if (localAcctExpireDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "acctExpireDate"));
                            
                            
                                    elementList.add(localAcctExpireDate==null?null:
                                    localAcctExpireDate);
                                } if (localAcctSegIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "acctSegId"));
                            
                            
                                    if (localAcctSegId==null){
                                         throw new org.apache.axis2.databinding.ADBException("acctSegId cannot be null!!");
                                    }
                                    elementList.add(localAcctSegId);
                                } if (localAcctbalToSubbalcoreTransferTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "acctbalToSubbalcoreTransfer"));
                            
                            
                                    if (localAcctbalToSubbalcoreTransfer==null){
                                         throw new org.apache.axis2.databinding.ADBException("acctbalToSubbalcoreTransfer cannot be null!!");
                                    }
                                    elementList.add(localAcctbalToSubbalcoreTransfer);
                                } if (localAgentIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "agentId"));
                            
                            
                                    elementList.add(localAgentId==null?null:
                                    localAgentId);
                                } if (localAllowIntraGroupOnlyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "allowIntraGroupOnly"));
                            
                            
                                    elementList.add(localAllowIntraGroupOnly==null?null:
                                    localAllowIntraGroupOnly);
                                } if (localAltCompanyNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "altCompanyName"));
                            
                            
                                    elementList.add(localAltCompanyName==null?null:
                                    localAltCompanyName);
                                } if (localAltFnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "altFname"));
                            
                            
                                    elementList.add(localAltFname==null?null:
                                    localAltFname);
                                } if (localAltLnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "altLname"));
                            
                            
                                    elementList.add(localAltLname==null?null:
                                    localAltLname);
                                } if (localApplyDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDay"));
                            
                            
                                    elementList.add(localApplyDay==null?null:
                                    localApplyDay);
                                } if (localApplyDayAcrossSubscribersTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "applyDayAcrossSubscribers"));
                            
                            
                                    if (localApplyDayAcrossSubscribers==null){
                                         throw new org.apache.axis2.databinding.ADBException("applyDayAcrossSubscribers cannot be null!!");
                                    }
                                    elementList.add(localApplyDayAcrossSubscribers);
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
                                } if (localBillAddress1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billAddress1"));
                            
                            
                                    elementList.add(localBillAddress1==null?null:
                                    localBillAddress1);
                                } if (localBillAddress2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billAddress2"));
                            
                            
                                    elementList.add(localBillAddress2==null?null:
                                    localBillAddress2);
                                } if (localBillAddress3Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billAddress3"));
                            
                            
                                    elementList.add(localBillAddress3==null?null:
                                    localBillAddress3);
                                } if (localBillAddress4Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billAddress4"));
                            
                            
                                    elementList.add(localBillAddress4==null?null:
                                    localBillAddress4);
                                } if (localBillCityTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billCity"));
                            
                            
                                    elementList.add(localBillCity==null?null:
                                    localBillCity);
                                } if (localBillCompanyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billCompany"));
                            
                            
                                    elementList.add(localBillCompany==null?null:
                                    localBillCompany);
                                } if (localBillCountryCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billCountryCode"));
                            
                            
                                    elementList.add(localBillCountryCode==null?null:
                                    localBillCountryCode);
                                } if (localBillCountyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billCounty"));
                            
                            
                                    elementList.add(localBillCounty==null?null:
                                    localBillCounty);
                                } if (localBillDispMethTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billDispMeth"));
                            
                            
                                    elementList.add(localBillDispMeth==null?null:
                                    localBillDispMeth);
                                } if (localBillFmtOptTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billFmtOpt"));
                            
                            
                                    elementList.add(localBillFmtOpt==null?null:
                                    localBillFmtOpt);
                                } if (localBillFnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billFname"));
                            
                            
                                    elementList.add(localBillFname==null?null:
                                    localBillFname);
                                } if (localBillFranchiseTaxCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billFranchiseTaxCode"));
                            
                            
                                    elementList.add(localBillFranchiseTaxCode==null?null:
                                    localBillFranchiseTaxCode);
                                } if (localBillGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billGeocode"));
                            
                            
                                    elementList.add(localBillGeocode==null?null:
                                    localBillGeocode);
                                } if (localBillHoldCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billHoldCode"));
                            
                            
                                    elementList.add(localBillHoldCode==null?null:
                                    localBillHoldCode);
                                } if (localBillLnameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billLname"));
                            
                            
                                    elementList.add(localBillLname==null?null:
                                    localBillLname);
                                } if (localBillMinitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billMinit"));
                            
                            
                                    elementList.add(localBillMinit==null?null:
                                    localBillMinit);
                                } if (localBillNameGenerationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billNameGeneration"));
                            
                            
                                    elementList.add(localBillNameGeneration==null?null:
                                    localBillNameGeneration);
                                } if (localBillNamePreTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billNamePre"));
                            
                            
                                    elementList.add(localBillNamePre==null?null:
                                    localBillNamePre);
                                } if (localBillPeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billPeriod"));
                            
                            
                                    elementList.add(localBillPeriod==null?null:
                                    localBillPeriod);
                                } if (localBillSequenceNumTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billSequenceNum"));
                            
                            
                                    if (localBillSequenceNum==null){
                                         throw new org.apache.axis2.databinding.ADBException("billSequenceNum cannot be null!!");
                                    }
                                    elementList.add(localBillSequenceNum);
                                } if (localBillStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billState"));
                            
                            
                                    elementList.add(localBillState==null?null:
                                    localBillState);
                                } if (localBillTitleTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billTitle"));
                            
                            
                                    elementList.add(localBillTitle==null?null:
                                    localBillTitle);
                                } if (localBillZipTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billZip"));
                            
                            
                                    elementList.add(localBillZip==null?null:
                                    localBillZip);
                                } if (localBilledFromDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billedFromDt"));
                            
                            
                                    elementList.add(localBilledFromDt==null?null:
                                    localBilledFromDt);
                                } if (localBillingFrequencyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billingFrequency"));
                            
                            
                                    elementList.add(localBillingFrequency==null?null:
                                    localBillingFrequency);
                                } if (localBillingServiceCenterTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "billingServiceCenter"));
                            
                            
                                    elementList.add(localBillingServiceCenter==null?null:
                                    localBillingServiceCenter);
                                } if (localChargeThresholdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chargeThreshold"));
                            
                            
                                    if (localChargeThreshold==null){
                                         throw new org.apache.axis2.databinding.ADBException("chargeThreshold cannot be null!!");
                                    }
                                    elementList.add(localChargeThreshold);
                                } if (localChgDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chgDate"));
                            
                            
                                    elementList.add(localChgDate==null?null:
                                    localChgDate);
                                } if (localChgWhoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chgWho"));
                            
                            
                                    if (localChgWho==null){
                                         throw new org.apache.axis2.databinding.ADBException("chgWho cannot be null!!");
                                    }
                                    elementList.add(localChgWho);
                                } if (localChildCountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "childCount"));
                            
                            
                                    elementList.add(localChildCount==null?null:
                                    localChildCount);
                                } if (localCodewordTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "codeword"));
                            
                            
                                    elementList.add(localCodeword==null?null:
                                    localCodeword);
                                } if (localCollectionHistoryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "collectionHistory"));
                            
                            
                                    elementList.add(localCollectionHistory==null?null:
                                    localCollectionHistory);
                                } if (localCollectionIndicatorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "collectionIndicator"));
                            
                            
                                    if (localCollectionIndicator==null){
                                         throw new org.apache.axis2.databinding.ADBException("collectionIndicator cannot be null!!");
                                    }
                                    elementList.add(localCollectionIndicator);
                                } if (localCollectionStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "collectionStatus"));
                            
                            
                                    if (localCollectionStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("collectionStatus cannot be null!!");
                                    }
                                    elementList.add(localCollectionStatus);
                                } if (localCollectionsServiceCenterTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "collectionsServiceCenter"));
                            
                            
                                    elementList.add(localCollectionsServiceCenter==null?null:
                                    localCollectionsServiceCenter);
                                } if (localContact1NameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "contact1Name"));
                            
                            
                                    elementList.add(localContact1Name==null?null:
                                    localContact1Name);
                                } if (localContact1PhoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "contact1Phone"));
                            
                            
                                    elementList.add(localContact1Phone==null?null:
                                    localContact1Phone);
                                } if (localContact2NameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "contact2Name"));
                            
                            
                                    elementList.add(localContact2Name==null?null:
                                    localContact2Name);
                                } if (localContact2PhoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "contact2Phone"));
                            
                            
                                    elementList.add(localContact2Phone==null?null:
                                    localContact2Phone);
                                } if (localConvertedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "converted"));
                            
                            
                                    if (localConverted==null){
                                         throw new org.apache.axis2.databinding.ADBException("converted cannot be null!!");
                                    }
                                    elementList.add(localConverted);
                                } if (localCredStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "credStatus"));
                            
                            
                                    elementList.add(localCredStatus==null?null:
                                    localCredStatus);
                                } if (localCreditRatingTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "creditRating"));
                            
                            
                                    if (localCreditRating==null){
                                         throw new org.apache.axis2.databinding.ADBException("creditRating cannot be null!!");
                                    }
                                    elementList.add(localCreditRating);
                                } if (localCreditThreshTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "creditThresh"));
                            
                            
                                    elementList.add(localCreditThresh==null?null:
                                    localCreditThresh);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    if (localCurrencyCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                    }
                                    elementList.add(localCurrencyCode);
                                } if (localCurrentStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currentState"));
                            
                            
                                    if (localCurrentState==null){
                                         throw new org.apache.axis2.databinding.ADBException("currentState cannot be null!!");
                                    }
                                    elementList.add(localCurrentState);
                                } if (localCustAddress1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custAddress1"));
                            
                            
                                    elementList.add(localCustAddress1==null?null:
                                    localCustAddress1);
                                } if (localCustAddress2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custAddress2"));
                            
                            
                                    elementList.add(localCustAddress2==null?null:
                                    localCustAddress2);
                                } if (localCustAddress3Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custAddress3"));
                            
                            
                                    elementList.add(localCustAddress3==null?null:
                                    localCustAddress3);
                                } if (localCustAddress4Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custAddress4"));
                            
                            
                                    elementList.add(localCustAddress4==null?null:
                                    localCustAddress4);
                                } if (localCustCityTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custCity"));
                            
                            
                                    elementList.add(localCustCity==null?null:
                                    localCustCity);
                                } if (localCustCountryCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custCountryCode"));
                            
                            
                                    elementList.add(localCustCountryCode==null?null:
                                    localCustCountryCode);
                                } if (localCustCountyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custCounty"));
                            
                            
                                    elementList.add(localCustCounty==null?null:
                                    localCustCounty);
                                } if (localCustEmailTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custEmail"));
                            
                            
                                    elementList.add(localCustEmail==null?null:
                                    localCustEmail);
                                } if (localCustFaxnoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custFaxno"));
                            
                            
                                    elementList.add(localCustFaxno==null?null:
                                    localCustFaxno);
                                } if (localCustFranchiseTaxCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custFranchiseTaxCode"));
                            
                            
                                    elementList.add(localCustFranchiseTaxCode==null?null:
                                    localCustFranchiseTaxCode);
                                } if (localCustGeocodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custGeocode"));
                            
                            
                                    elementList.add(localCustGeocode==null?null:
                                    localCustGeocode);
                                } if (localCustPhone1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custPhone1"));
                            
                            
                                    elementList.add(localCustPhone1==null?null:
                                    localCustPhone1);
                                } if (localCustPhone2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custPhone2"));
                            
                            
                                    elementList.add(localCustPhone2==null?null:
                                    localCustPhone2);
                                } if (localCustStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custState"));
                            
                            
                                    elementList.add(localCustState==null?null:
                                    localCustState);
                                } if (localCustZipTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "custZip"));
                            
                            
                                    elementList.add(localCustZip==null?null:
                                    localCustZip);
                                } if (localCyclicalThresholdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cyclicalThreshold"));
                            
                            
                                    if (localCyclicalThreshold==null){
                                         throw new org.apache.axis2.databinding.ADBException("cyclicalThreshold cannot be null!!");
                                    }
                                    elementList.add(localCyclicalThreshold);
                                } if (localDateActiveTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateActive"));
                            
                            
                                    elementList.add(localDateActive==null?null:
                                    localDateActive);
                                } if (localDateCreatedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateCreated"));
                            
                            
                                    if (localDateCreated==null){
                                         throw new org.apache.axis2.databinding.ADBException("dateCreated cannot be null!!");
                                    }
                                    elementList.add(localDateCreated);
                                } if (localDateEnterActiveTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateEnterActive"));
                            
                            
                                    elementList.add(localDateEnterActive==null?null:
                                    localDateEnterActive);
                                } if (localDateInactiveTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dateInactive"));
                            
                            
                                    elementList.add(localDateInactive==null?null:
                                    localDateInactive);
                                } if (localDealerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dealerId"));
                            
                            
                                    elementList.add(localDealerId==null?null:
                                    localDealerId);
                                } if (localDeptTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "dept"));
                            
                            
                                    elementList.add(localDept==null?null:
                                    localDept);
                                } if (localDiscRcvOptTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "discRcvOpt"));
                            
                            
                                    elementList.add(localDiscRcvOpt==null?null:
                                    localDiscRcvOpt);
                                } if (localDisconnectReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "disconnectReason"));
                            
                            
                                    elementList.add(localDisconnectReason==null?null:
                                    localDisconnectReason);
                                } if (localDistrChanTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "distrChan"));
                            
                            
                                    elementList.add(localDistrChan==null?null:
                                    localDistrChan);
                                } if (localEnableCdrTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "enableCdr"));
                            
                            
                                    if (localEnableCdr==null){
                                         throw new org.apache.axis2.databinding.ADBException("enableCdr cannot be null!!");
                                    }
                                    elementList.add(localEnableCdr);
                                } if (localExrateClassTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "exrateClass"));
                            
                            
                                    elementList.add(localExrateClass==null?null:
                                    localExrateClass);
                                } if (localExtendedDataTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "extendedData"));
                            
                            
                                    if (localExtendedData==null){
                                         throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                    }
                                    elementList.add(localExtendedData);
                                } if (localGenderTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "gender"));
                            
                            
                                    elementList.add(localGender==null?null:
                                    localGender);
                                } if (localGlobalContractStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "globalContractStatus"));
                            
                            
                                    if (localGlobalContractStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("globalContractStatus cannot be null!!");
                                    }
                                    elementList.add(localGlobalContractStatus);
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
                                } if (localHierarchyAccountExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hierarchyAccountExternalId"));
                            
                            
                                    if (localHierarchyAccountExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("hierarchyAccountExternalId cannot be null!!");
                                    }
                                    elementList.add(localHierarchyAccountExternalId);
                                } if (localHierarchyAccountExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hierarchyAccountExternalIdType"));
                            
                            
                                    if (localHierarchyAccountExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("hierarchyAccountExternalIdType cannot be null!!");
                                    }
                                    elementList.add(localHierarchyAccountExternalIdType);
                                } if (localHierarchyAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "hierarchyAccountInternalId"));
                            
                            
                                    if (localHierarchyAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("hierarchyAccountInternalId cannot be null!!");
                                    }
                                    elementList.add(localHierarchyAccountInternalId);
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
                                } if (localInUseTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inUse"));
                            
                            
                                    elementList.add(localInUse==null?null:
                                    localInUse);
                                } if (localInsertGrpIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "insertGrpId"));
                            
                            
                                    elementList.add(localInsertGrpId==null?null:
                                    localInsertGrpId);
                                } if (localIs1SaTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "is1sa"));
                            
                            
                                    if (localIs1Sa==null){
                                         throw new org.apache.axis2.databinding.ADBException("is1sa cannot be null!!");
                                    }
                                    elementList.add(localIs1Sa);
                                } if (localIsActivatedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isActivated"));
                            
                            
                                    if (localIsActivated==null){
                                         throw new org.apache.axis2.databinding.ADBException("isActivated cannot be null!!");
                                    }
                                    elementList.add(localIsActivated);
                                } if (localIsCssRegisteredTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isCssRegistered"));
                            
                            
                                    if (localIsCssRegistered==null){
                                         throw new org.apache.axis2.databinding.ADBException("isCssRegistered cannot be null!!");
                                    }
                                    elementList.add(localIsCssRegistered);
                                } if (localIsTmlEnabledTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isTmlEnabled"));
                            
                            
                                    if (localIsTmlEnabled==null){
                                         throw new org.apache.axis2.databinding.ADBException("isTmlEnabled cannot be null!!");
                                    }
                                    elementList.add(localIsTmlEnabled);
                                } if (localLanguageCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "languageCode"));
                            
                            
                                    if (localLanguageCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("languageCode cannot be null!!");
                                    }
                                    elementList.add(localLanguageCode);
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
                                } if (localLatestQuoteImageTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "latestQuoteImage"));
                            
                            
                                    elementList.add(localLatestQuoteImage==null?null:
                                    localLatestQuoteImage);
                                } if (localLiabilityRedirectFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "liabilityRedirectFlag"));
                            
                            
                                    if (localLiabilityRedirectFlag==null){
                                         throw new org.apache.axis2.databinding.ADBException("liabilityRedirectFlag cannot be null!!");
                                    }
                                    elementList.add(localLiabilityRedirectFlag);
                                } if (localMarketingContactProfileIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "marketingContactProfileId"));
                            
                            
                                    elementList.add(localMarketingContactProfileId==null?null:
                                    localMarketingContactProfileId);
                                } if (localMembersAllowedDiffPoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "membersAllowedDiffPo"));
                            
                            
                                    elementList.add(localMembersAllowedDiffPo==null?null:
                                    localMembersAllowedDiffPo);
                                } if (localMigrationSeqTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "migrationSeq"));
                            
                            
                                    elementList.add(localMigrationSeq==null?null:
                                    localMigrationSeq);
                                } if (localMktCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "mktCode"));
                            
                            
                                    elementList.add(localMktCode==null?null:
                                    localMktCode);
                                } if (localMogIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "mogId"));
                            
                            
                                    elementList.add(localMogId==null?null:
                                    localMogId);
                                } if (localMsgGrpIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "msgGrpId"));
                            
                            
                                    elementList.add(localMsgGrpId==null?null:
                                    localMsgGrpId);
                                } if (localNextBillDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextBillDate"));
                            
                            
                                    elementList.add(localNextBillDate==null?null:
                                    localNextBillDate);
                                } if (localNoBillTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "noBill"));
                            
                            
                                    if (localNoBill==null){
                                         throw new org.apache.axis2.databinding.ADBException("noBill cannot be null!!");
                                    }
                                    elementList.add(localNoBill);
                                } if (localNotificationHandlingTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "notificationHandling"));
                            
                            
                                    elementList.add(localNotificationHandling==null?null:
                                    localNotificationHandling);
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
                                } if (localNotificationLanguageIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "notificationLanguageId"));
                            
                            
                                    elementList.add(localNotificationLanguageId==null?null:
                                    localNotificationLanguageId);
                                } if (localNotificationLevelTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "notificationLevel"));
                            
                            
                                    elementList.add(localNotificationLevel==null?null:
                                    localNotificationLevel);
                                } if (localOwningCostCtrTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "owningCostCtr"));
                            
                            
                                    if (localOwningCostCtr==null){
                                         throw new org.apache.axis2.databinding.ADBException("owningCostCtr cannot be null!!");
                                    }
                                    elementList.add(localOwningCostCtr);
                                } if (localParentAccountExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountExternalId"));
                            
                            
                                    if (localParentAccountExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("parentAccountExternalId cannot be null!!");
                                    }
                                    elementList.add(localParentAccountExternalId);
                                } if (localParentAccountExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountExternalIdType"));
                            
                            
                                    if (localParentAccountExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("parentAccountExternalIdType cannot be null!!");
                                    }
                                    elementList.add(localParentAccountExternalIdType);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    elementList.add(localParentAccountInternalId==null?null:
                                    localParentAccountInternalId);
                                } if (localPaymentProfileIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "paymentProfileId"));
                            
                            
                                    if (localPaymentProfileId==null){
                                         throw new org.apache.axis2.databinding.ADBException("paymentProfileId cannot be null!!");
                                    }
                                    elementList.add(localPaymentProfileId);
                                } if (localPendingChargesTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "pendingCharges"));
                            
                            
                                    if (localPendingCharges==null){
                                         throw new org.apache.axis2.databinding.ADBException("pendingCharges cannot be null!!");
                                    }
                                    elementList.add(localPendingCharges);
                                } if (localPrevBalanceRefResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevBalanceRefResets"));
                            
                            
                                    if (localPrevBalanceRefResets==null){
                                         throw new org.apache.axis2.databinding.ADBException("prevBalanceRefResets cannot be null!!");
                                    }
                                    elementList.add(localPrevBalanceRefResets);
                                } if (localPrevBalanceRefnoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevBalanceRefno"));
                            
                            
                                    if (localPrevBalanceRefno==null){
                                         throw new org.apache.axis2.databinding.ADBException("prevBalanceRefno cannot be null!!");
                                    }
                                    elementList.add(localPrevBalanceRefno);
                                } if (localPrevBillDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevBillDate"));
                            
                            
                                    elementList.add(localPrevBillDate==null?null:
                                    localPrevBillDate);
                                } if (localPrevBillRefResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevBillRefResets"));
                            
                            
                                    if (localPrevBillRefResets==null){
                                         throw new org.apache.axis2.databinding.ADBException("prevBillRefResets cannot be null!!");
                                    }
                                    elementList.add(localPrevBillRefResets);
                                } if (localPrevBillRefnoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevBillRefno"));
                            
                            
                                    if (localPrevBillRefno==null){
                                         throw new org.apache.axis2.databinding.ADBException("prevBillRefno cannot be null!!");
                                    }
                                    elementList.add(localPrevBillRefno);
                                } if (localPrevCutoffDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevCutoffDate"));
                            
                            
                                    elementList.add(localPrevCutoffDate==null?null:
                                    localPrevCutoffDate);
                                } if (localPrimarySubscrNoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "primarySubscrNo"));
                            
                            
                                    elementList.add(localPrimarySubscrNo==null?null:
                                    localPrimarySubscrNo);
                                } if (localPrimarySubscrNoResetsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "primarySubscrNoResets"));
                            
                            
                                    elementList.add(localPrimarySubscrNoResets==null?null:
                                    localPrimarySubscrNoResets);
                                } if (localPrintServiceCenterTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "printServiceCenter"));
                            
                            
                                    elementList.add(localPrintServiceCenter==null?null:
                                    localPrintServiceCenter);
                                } if (localPurchaseOrderTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "purchaseOrder"));
                            
                            
                                    elementList.add(localPurchaseOrder==null?null:
                                    localPurchaseOrder);
                                } if (localRangeMapExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rangeMapExternalId"));
                            
                            
                                    elementList.add(localRangeMapExternalId==null?null:
                                    localRangeMapExternalId);
                                } if (localRateClassDefaultTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rateClassDefault"));
                            
                            
                                    elementList.add(localRateClassDefault==null?null:
                                    localRateClassDefault);
                                } if (localRcApplicabilityTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rcApplicability"));
                            
                            
                                    elementList.add(localRcApplicability==null?null:
                                    localRcApplicability);
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
                                } if (localRegulatoryIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "regulatoryId"));
                            
                            
                                    if (localRegulatoryId==null){
                                         throw new org.apache.axis2.databinding.ADBException("regulatoryId cannot be null!!");
                                    }
                                    elementList.add(localRegulatoryId);
                                } if (localRemarkTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "remark"));
                            
                            
                                    elementList.add(localRemark==null?null:
                                    localRemark);
                                } if (localRemittanceServiceCenterTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "remittanceServiceCenter"));
                            
                            
                                    elementList.add(localRemittanceServiceCenter==null?null:
                                    localRemittanceServiceCenter);
                                } if (localRerateLockTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rerateLock"));
                            
                            
                                    if (localRerateLock==null){
                                         throw new org.apache.axis2.databinding.ADBException("rerateLock cannot be null!!");
                                    }
                                    elementList.add(localRerateLock);
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
                                } if (localSalesCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "salesCode"));
                            
                            
                                    elementList.add(localSalesCode==null?null:
                                    localSalesCode);
                                } if (localServiceInquiryServiceCenterTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceInquiryServiceCenter"));
                            
                            
                                    elementList.add(localServiceInquiryServiceCenter==null?null:
                                    localServiceInquiryServiceCenter);
                                } if (localSicCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "sicCode"));
                            
                            
                                    elementList.add(localSicCode==null?null:
                                    localSicCode);
                                } if (localSsnTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ssn"));
                            
                            
                                    elementList.add(localSsn==null?null:
                                    localSsn);
                                } if (localStatementToEmailTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "statementToEmail"));
                            
                            
                                    elementList.add(localStatementToEmail==null?null:
                                    localStatementToEmail);
                                } if (localStatementToFaxnoTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "statementToFaxno"));
                            
                            
                                    elementList.add(localStatementToFaxno==null?null:
                                    localStatementToFaxno);
                                } if (localSubbalcoreToAcctbalTransferTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subbalcoreToAcctbalTransfer"));
                            
                            
                                    if (localSubbalcoreToAcctbalTransfer==null){
                                         throw new org.apache.axis2.databinding.ADBException("subbalcoreToAcctbalTransfer cannot be null!!");
                                    }
                                    elementList.add(localSubbalcoreToAcctbalTransfer);
                                } if (localSuppressAccountNotificationTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "suppressAccountNotification"));
                            
                            
                                    if (localSuppressAccountNotification==null){
                                         throw new org.apache.axis2.databinding.ADBException("suppressAccountNotification cannot be null!!");
                                    }
                                    elementList.add(localSuppressAccountNotification);
                                } if (localThreshRefTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "threshRef"));
                            
                            
                                    elementList.add(localThreshRef==null?null:
                                    localThreshRef);
                                } if (localThresholdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "threshold"));
                            
                            
                                    if (localThreshold==null){
                                         throw new org.apache.axis2.databinding.ADBException("threshold cannot be null!!");
                                    }
                                    elementList.add(localThreshold);
                                } if (localTieCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "tieCode"));
                            
                            
                                    elementList.add(localTieCode==null?null:
                                    localTieCode);
                                } if (localTimezoneTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "timezone"));
                            
                            
                                    elementList.add(localTimezone==null?null:
                                    localTimezone);
                                } if (localTitleTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "title"));
                            
                            
                                    elementList.add(localTitle==null?null:
                                    localTitle);
                                } if (localTmlAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "tmlAmount"));
                            
                            
                                    elementList.add(localTmlAmount==null?null:
                                    localTmlAmount);
                                } if (localTmlLimitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "tmlLimit"));
                            
                            
                                    elementList.add(localTmlLimit==null?null:
                                    localTmlLimit);
                                } if (localUpsellTemplateIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "upsellTemplateId"));
                            
                            
                                    elementList.add(localUpsellTemplateId==null?null:
                                    localUpsellTemplateId);
                                } if (localUsgAmtLimitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "usgAmtLimit"));
                            
                            
                                    elementList.add(localUsgAmtLimit==null?null:
                                    localUsgAmtLimit);
                                } if (localUsgUnitsLimitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "usgUnitsLimit"));
                            
                            
                                    elementList.add(localUsgUnitsLimit==null?null:
                                    localUsgUnitsLimit);
                                } if (localVipCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "vipCode"));
                            
                            
                                    if (localVipCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("vipCode cannot be null!!");
                                    }
                                    elementList.add(localVipCode);
                                } if (localAdvtAllowedTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "advtAllowed"));
                            
                            
                                    if (localAdvtAllowed==null){
                                         throw new org.apache.axis2.databinding.ADBException("advtAllowed cannot be null!!");
                                    }
                                    elementList.add(localAdvtAllowed);
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
                                } if (localSubscribersTracker){
                             if (localSubscribers!=null) {
                                 for (int i = 0;i < localSubscribers.length;i++){

                                    if (localSubscribers[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "subscribers"));
                                         elementList.add(localSubscribers[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "subscribers"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "subscribers"));
                                        elementList.add(localSubscribers);
                                    
                             }

                        } if (localBundleInstanceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleInstance"));
                            
                            
                                    if (localBundleInstance==null){
                                         throw new org.apache.axis2.databinding.ADBException("bundleInstance cannot be null!!");
                                    }
                                    elementList.add(localBundleInstance);
                                } if (localOfferInstancesTracker){
                             if (localOfferInstances!=null) {
                                 for (int i = 0;i < localOfferInstances.length;i++){

                                    if (localOfferInstances[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "offerInstances"));
                                         elementList.add(localOfferInstances[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "offerInstances"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "offerInstances"));
                                        elementList.add(localOfferInstances);
                                    
                             }

                        } if (localBtPromotionPlanInstancesTracker){
                             if (localBtPromotionPlanInstances!=null) {
                                 for (int i = 0;i < localBtPromotionPlanInstances.length;i++){

                                    if (localBtPromotionPlanInstances[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "btPromotionPlanInstances"));
                                         elementList.add(localBtPromotionPlanInstances[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "btPromotionPlanInstances"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "btPromotionPlanInstances"));
                                        elementList.add(localBtPromotionPlanInstances);
                                    
                             }

                        } if (localBalanceInstancesTracker){
                             if (localBalanceInstances!=null) {
                                 for (int i = 0;i < localBalanceInstances.length;i++){

                                    if (localBalanceInstances[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "balanceInstances"));
                                         elementList.add(localBalanceInstances[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "balanceInstances"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "balanceInstances"));
                                        elementList.add(localBalanceInstances);
                                    
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

                        } if (localNrcTermInstancesTracker){
                             if (localNrcTermInstances!=null) {
                                 for (int i = 0;i < localNrcTermInstances.length;i++){

                                    if (localNrcTermInstances[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "nrcTermInstances"));
                                         elementList.add(localNrcTermInstances[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "nrcTermInstances"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "nrcTermInstances"));
                                        elementList.add(localNrcTermInstances);
                                    
                             }

                        } if (localRcTermInstancesTracker){
                             if (localRcTermInstances!=null) {
                                 for (int i = 0;i < localRcTermInstances.length;i++){

                                    if (localRcTermInstances[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstances"));
                                         elementList.add(localRcTermInstances[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstances"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstances"));
                                        elementList.add(localRcTermInstances);
                                    
                             }

                        } if (localRcTermInstanceRateKeyListTracker){
                             if (localRcTermInstanceRateKeyList!=null) {
                                 for (int i = 0;i < localRcTermInstanceRateKeyList.length;i++){

                                    if (localRcTermInstanceRateKeyList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstanceRateKeyList"));
                                         elementList.add(localRcTermInstanceRateKeyList[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstanceRateKeyList"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstanceRateKeyList"));
                                        elementList.add(localRcTermInstanceRateKeyList);
                                    
                             }

                        } if (localRcTermInstanceRateOverrideListTracker){
                             if (localRcTermInstanceRateOverrideList!=null) {
                                 for (int i = 0;i < localRcTermInstanceRateOverrideList.length;i++){

                                    if (localRcTermInstanceRateOverrideList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstanceRateOverrideList"));
                                         elementList.add(localRcTermInstanceRateOverrideList[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstanceRateOverrideList"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermInstanceRateOverrideList"));
                                        elementList.add(localRcTermInstanceRateOverrideList);
                                    
                             }

                        } if (localReservationsTracker){
                             if (localReservations!=null) {
                                 for (int i = 0;i < localReservations.length;i++){

                                    if (localReservations[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "reservations"));
                                         elementList.add(localReservations[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "reservations"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "reservations"));
                                        elementList.add(localReservations);
                                    
                             }

                        } if (localBalanceGrantsTracker){
                             if (localBalanceGrants!=null) {
                                 for (int i = 0;i < localBalanceGrants.length;i++){

                                    if (localBalanceGrants[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "balanceGrants"));
                                         elementList.add(localBalanceGrants[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "balanceGrants"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "balanceGrants"));
                                        elementList.add(localBalanceGrants);
                                    
                             }

                        } if (localPaymentProfileTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "paymentProfile"));
                            
                            
                                    if (localPaymentProfile==null){
                                         throw new org.apache.axis2.databinding.ADBException("paymentProfile cannot be null!!");
                                    }
                                    elementList.add(localPaymentProfile);
                                } if (localLiabilityRedirectionsSourceTracker){
                             if (localLiabilityRedirectionsSource!=null) {
                                 for (int i = 0;i < localLiabilityRedirectionsSource.length;i++){

                                    if (localLiabilityRedirectionsSource[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "liabilityRedirectionsSource"));
                                         elementList.add(localLiabilityRedirectionsSource[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "liabilityRedirectionsSource"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "liabilityRedirectionsSource"));
                                        elementList.add(localLiabilityRedirectionsSource);
                                    
                             }

                        } if (localLiabilityRedirectionsTargetTracker){
                             if (localLiabilityRedirectionsTarget!=null) {
                                 for (int i = 0;i < localLiabilityRedirectionsTarget.length;i++){

                                    if (localLiabilityRedirectionsTarget[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "liabilityRedirectionsTarget"));
                                         elementList.add(localLiabilityRedirectionsTarget[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "liabilityRedirectionsTarget"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "liabilityRedirectionsTarget"));
                                        elementList.add(localLiabilityRedirectionsTarget);
                                    
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
        public static AccountObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AccountObject object =
                new AccountObject();

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
                    
                            if (!"accountObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AccountObject)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list185 = new java.util.ArrayList();
                    
                        java.util.ArrayList list187 = new java.util.ArrayList();
                    
                        java.util.ArrayList list188 = new java.util.ArrayList();
                    
                        java.util.ArrayList list189 = new java.util.ArrayList();
                    
                        java.util.ArrayList list190 = new java.util.ArrayList();
                    
                        java.util.ArrayList list191 = new java.util.ArrayList();
                    
                        java.util.ArrayList list192 = new java.util.ArrayList();
                    
                        java.util.ArrayList list193 = new java.util.ArrayList();
                    
                        java.util.ArrayList list194 = new java.util.ArrayList();
                    
                        java.util.ArrayList list195 = new java.util.ArrayList();
                    
                        java.util.ArrayList list196 = new java.util.ArrayList();
                    
                        java.util.ArrayList list198 = new java.util.ArrayList();
                    
                        java.util.ArrayList list199 = new java.util.ArrayList();
                    
                                    
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
                                
                                                object.setAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inforCustomerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInforCustomerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInforCustomerId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountCategory").equals(reader.getName())){
                                
                                                object.setAccountCategory(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountRatingStatus").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccountRatingStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccountRatingStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountStatus").equals(reader.getName())){
                                
                                                object.setAccountStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountStatusDt").equals(reader.getName())){
                                
                                                object.setAccountStatusDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountTemplateId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccountTemplateId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccountTemplateId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountType").equals(reader.getName())){
                                
                                                object.setAccountType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","acctExpireDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAcctExpireDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAcctExpireDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","acctSegId").equals(reader.getName())){
                                
                                                object.setAcctSegId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","altCompanyName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAltCompanyName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAltCompanyName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","altFname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAltFname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAltFname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","altLname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAltLname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAltLname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","applyDayAcrossSubscribers").equals(reader.getName())){
                                
                                                object.setApplyDayAcrossSubscribers(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billAddress1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillAddress1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillAddress1(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billAddress2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillAddress2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillAddress2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billAddress3").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillAddress3(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillAddress3(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billAddress4").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillAddress4(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillAddress4(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billCity").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillCity(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillCity(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billCompany").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillCompany(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillCompany(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billCountryCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillCountryCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillCountryCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billCounty").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillCounty(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillCounty(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billDispMeth").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillDispMeth(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillDispMeth(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billFmtOpt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillFmtOpt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillFmtOpt(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billFname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillFname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillFname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billFranchiseTaxCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillFranchiseTaxCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billHoldCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillHoldCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillHoldCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billLname").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillLname(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillLname(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billMinit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillMinit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillMinit(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billNameGeneration").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillNameGeneration(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillNameGeneration(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billNamePre").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillNamePre(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillNamePre(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billSequenceNum").equals(reader.getName())){
                                
                                                object.setBillSequenceNum(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billState").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillState(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillState(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billTitle").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillTitle(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillTitle(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billZip").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillZip(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillZip(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billedFromDt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBilledFromDt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBilledFromDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billingFrequency").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillingFrequency(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillingFrequency(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","billingServiceCenter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBillingServiceCenter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBillingServiceCenter(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chargeThreshold").equals(reader.getName())){
                                
                                                object.setChargeThreshold(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chgDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChgDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChgDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","childCount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChildCount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChildCount(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","collectionHistory").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCollectionHistory(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCollectionHistory(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","collectionIndicator").equals(reader.getName())){
                                
                                                object.setCollectionIndicator(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","collectionStatus").equals(reader.getName())){
                                
                                                object.setCollectionStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","collectionsServiceCenter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCollectionsServiceCenter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCollectionsServiceCenter(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","contact1Name").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setContact1Name(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setContact1Name(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","contact1Phone").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setContact1Phone(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setContact1Phone(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","contact2Name").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setContact2Name(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setContact2Name(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","contact2Phone").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setContact2Phone(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setContact2Phone(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","credStatus").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCredStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCredStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","creditRating").equals(reader.getName())){
                                
                                                object.setCreditRating(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","creditThresh").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCreditThresh(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCreditThresh(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currencyCode").equals(reader.getName())){
                                
                                                object.setCurrencyCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currentState").equals(reader.getName())){
                                
                                                object.setCurrentState(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custAddress1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustAddress1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustAddress1(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custAddress2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustAddress2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustAddress2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custAddress3").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustAddress3(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustAddress3(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custAddress4").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustAddress4(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustAddress4(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custCity").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustCity(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustCity(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custCountryCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustCountryCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustCountryCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custCounty").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustCounty(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustCounty(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custFaxno").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustFaxno(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustFaxno(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custFranchiseTaxCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustFranchiseTaxCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustFranchiseTaxCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custGeocode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustGeocode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustGeocode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custPhone1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustPhone1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustPhone1(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custPhone2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustPhone2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustPhone2(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custState").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustState(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustState(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","custZip").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustZip(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustZip(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cyclicalThreshold").equals(reader.getName())){
                                
                                                object.setCyclicalThreshold(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateActive").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDateActive(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDateActive(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateCreated").equals(reader.getName())){
                                
                                                object.setDateCreated(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dateInactive").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDateInactive(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDateInactive(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","dept").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDept(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDept(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","discRcvOpt").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDiscRcvOpt(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDiscRcvOpt(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","distrChan").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDistrChan(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDistrChan(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","extendedData").equals(reader.getName())){
                                
                                                object.setExtendedData(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","gender").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGender(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGender(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","globalContractStatus").equals(reader.getName())){
                                
                                                object.setGlobalContractStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hierarchyAccountExternalId").equals(reader.getName())){
                                
                                                object.setHierarchyAccountExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","hierarchyAccountExternalIdType").equals(reader.getName())){
                                
                                                object.setHierarchyAccountExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inUse").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInUse(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInUse(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","insertGrpId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInsertGrpId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInsertGrpId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isActivated").equals(reader.getName())){
                                
                                                object.setIsActivated(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isCssRegistered").equals(reader.getName())){
                                
                                                object.setIsCssRegistered(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isTmlEnabled").equals(reader.getName())){
                                
                                                object.setIsTmlEnabled(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","languageCode").equals(reader.getName())){
                                
                                                object.setLanguageCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","latestQuoteImage").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLatestQuoteImage(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLatestQuoteImage(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","mktCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMktCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMktCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","msgGrpId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMsgGrpId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMsgGrpId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextBillDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextBillDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextBillDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","notificationLanguageId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNotificationLanguageId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNotificationLanguageId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","notificationLevel").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNotificationLevel(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNotificationLevel(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","owningCostCtr").equals(reader.getName())){
                                
                                                object.setOwningCostCtr(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountExternalId").equals(reader.getName())){
                                
                                                object.setParentAccountExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentAccountExternalIdType").equals(reader.getName())){
                                
                                                object.setParentAccountExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","paymentProfileId").equals(reader.getName())){
                                
                                                object.setPaymentProfileId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevBalanceRefResets").equals(reader.getName())){
                                
                                                object.setPrevBalanceRefResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevBalanceRefno").equals(reader.getName())){
                                
                                                object.setPrevBalanceRefno(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevBillDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrevBillDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrevBillDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevBillRefResets").equals(reader.getName())){
                                
                                                object.setPrevBillRefResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevBillRefno").equals(reader.getName())){
                                
                                                object.setPrevBillRefno(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prevCutoffDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrevCutoffDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrevCutoffDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","primarySubscrNo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrimarySubscrNo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrimarySubscrNo(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","primarySubscrNoResets").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrimarySubscrNoResets(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrimarySubscrNoResets(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","printServiceCenter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPrintServiceCenter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPrintServiceCenter(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","purchaseOrder").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPurchaseOrder(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPurchaseOrder(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rateClassDefault").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRateClassDefault(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRateClassDefault(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","regulatoryId").equals(reader.getName())){
                                
                                                object.setRegulatoryId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","remark").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRemark(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRemark(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","remittanceServiceCenter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRemittanceServiceCenter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRemittanceServiceCenter(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rerateLock").equals(reader.getName())){
                                
                                                object.setRerateLock(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","salesCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSalesCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSalesCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceInquiryServiceCenter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServiceInquiryServiceCenter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServiceInquiryServiceCenter(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","sicCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSicCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSicCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ssn").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSsn(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSsn(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","statementToEmail").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStatementToEmail(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStatementToEmail(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","statementToFaxno").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStatementToFaxno(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStatementToFaxno(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","suppressAccountNotification").equals(reader.getName())){
                                
                                                object.setSuppressAccountNotification(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","threshRef").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setThreshRef(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setThreshRef(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","threshold").equals(reader.getName())){
                                
                                                object.setThreshold(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tieCode").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTieCode(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTieCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","title").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTitle(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTitle(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tmlAmount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTmlAmount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTmlAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","tmlLimit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTmlLimit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTmlLimit(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","upsellTemplateId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUpsellTemplateId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUpsellTemplateId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","usgAmtLimit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUsgAmtLimit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUsgAmtLimit(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","usgUnitsLimit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUsgUnitsLimit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUsgUnitsLimit(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","vipCode").equals(reader.getName())){
                                
                                                object.setVipCode(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","advtAllowed").equals(reader.getName())){
                                
                                                object.setAdvtAllowed(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscribers").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list185.add(null);
                                                              reader.next();
                                                          } else {
                                                        list185.add(com.comverse.www.SubscriberObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone185 = false;
                                                        while(!loopDone185){
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
                                                                loopDone185 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","subscribers").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list185.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list185.add(com.comverse.www.SubscriberObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone185 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSubscribers((com.comverse.www.SubscriberObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.SubscriberObject.class,
                                                                list185));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundleInstance").equals(reader.getName())){
                                
                                                object.setBundleInstance(com.comverse.www.BundleInstanceObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerInstances").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list187.add(null);
                                                              reader.next();
                                                          } else {
                                                        list187.add(com.comverse.www.OfferInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone187 = false;
                                                        while(!loopDone187){
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
                                                                loopDone187 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","offerInstances").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list187.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list187.add(com.comverse.www.OfferInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone187 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setOfferInstances((com.comverse.www.OfferInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.OfferInstanceObject.class,
                                                                list187));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","btPromotionPlanInstances").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list188.add(null);
                                                              reader.next();
                                                          } else {
                                                        list188.add(com.comverse.www.BtPromotionPlanInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone188 = false;
                                                        while(!loopDone188){
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
                                                                loopDone188 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","btPromotionPlanInstances").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list188.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list188.add(com.comverse.www.BtPromotionPlanInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone188 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBtPromotionPlanInstances((com.comverse.www.BtPromotionPlanInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.BtPromotionPlanInstanceObject.class,
                                                                list188));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceInstances").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list189.add(null);
                                                              reader.next();
                                                          } else {
                                                        list189.add(com.comverse.www.BalanceInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone189 = false;
                                                        while(!loopDone189){
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
                                                                loopDone189 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","balanceInstances").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list189.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list189.add(com.comverse.www.BalanceInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone189 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBalanceInstances((com.comverse.www.BalanceInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.BalanceInstanceObject.class,
                                                                list189));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accumulators").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list190.add(null);
                                                              reader.next();
                                                          } else {
                                                        list190.add(com.comverse.www.AccumulatorInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone190 = false;
                                                        while(!loopDone190){
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
                                                                loopDone190 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","accumulators").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list190.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list190.add(com.comverse.www.AccumulatorInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone190 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAccumulators((com.comverse.www.AccumulatorInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.AccumulatorInstanceObject.class,
                                                                list190));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nrcTermInstances").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list191.add(null);
                                                              reader.next();
                                                          } else {
                                                        list191.add(com.comverse.www.NrcTermInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone191 = false;
                                                        while(!loopDone191){
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
                                                                loopDone191 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","nrcTermInstances").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list191.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list191.add(com.comverse.www.NrcTermInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone191 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setNrcTermInstances((com.comverse.www.NrcTermInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.NrcTermInstanceObject.class,
                                                                list191));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermInstances").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list192.add(null);
                                                              reader.next();
                                                          } else {
                                                        list192.add(com.comverse.www.RcTermInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone192 = false;
                                                        while(!loopDone192){
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
                                                                loopDone192 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","rcTermInstances").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list192.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list192.add(com.comverse.www.RcTermInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone192 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRcTermInstances((com.comverse.www.RcTermInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.RcTermInstanceObject.class,
                                                                list192));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermInstanceRateKeyList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list193.add(null);
                                                              reader.next();
                                                          } else {
                                                        list193.add(com.comverse.www.RcTermInstanceRateKeyObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone193 = false;
                                                        while(!loopDone193){
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
                                                                loopDone193 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","rcTermInstanceRateKeyList").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list193.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list193.add(com.comverse.www.RcTermInstanceRateKeyObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone193 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRcTermInstanceRateKeyList((com.comverse.www.RcTermInstanceRateKeyObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.RcTermInstanceRateKeyObject.class,
                                                                list193));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermInstanceRateOverrideList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list194.add(null);
                                                              reader.next();
                                                          } else {
                                                        list194.add(com.comverse.www.RcTermInstanceRateOverrideObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone194 = false;
                                                        while(!loopDone194){
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
                                                                loopDone194 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","rcTermInstanceRateOverrideList").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list194.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list194.add(com.comverse.www.RcTermInstanceRateOverrideObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone194 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRcTermInstanceRateOverrideList((com.comverse.www.RcTermInstanceRateOverrideObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.RcTermInstanceRateOverrideObject.class,
                                                                list194));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","reservations").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list195.add(null);
                                                              reader.next();
                                                          } else {
                                                        list195.add(com.comverse.www.ReservationObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone195 = false;
                                                        while(!loopDone195){
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
                                                                loopDone195 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","reservations").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list195.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list195.add(com.comverse.www.ReservationObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone195 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setReservations((com.comverse.www.ReservationObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.ReservationObject.class,
                                                                list195));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceGrants").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list196.add(null);
                                                              reader.next();
                                                          } else {
                                                        list196.add(com.comverse.www.BalanceGrantObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone196 = false;
                                                        while(!loopDone196){
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
                                                                loopDone196 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","balanceGrants").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list196.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list196.add(com.comverse.www.BalanceGrantObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone196 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBalanceGrants((com.comverse.www.BalanceGrantObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.BalanceGrantObject.class,
                                                                list196));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","paymentProfile").equals(reader.getName())){
                                
                                                object.setPaymentProfile(com.comverse.www.PaymentProfileObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","liabilityRedirectionsSource").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list198.add(null);
                                                              reader.next();
                                                          } else {
                                                        list198.add(com.comverse.www.LiabilityRedirectionInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone198 = false;
                                                        while(!loopDone198){
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
                                                                loopDone198 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","liabilityRedirectionsSource").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list198.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list198.add(com.comverse.www.LiabilityRedirectionInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone198 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLiabilityRedirectionsSource((com.comverse.www.LiabilityRedirectionInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.LiabilityRedirectionInstanceObject.class,
                                                                list198));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","liabilityRedirectionsTarget").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list199.add(null);
                                                              reader.next();
                                                          } else {
                                                        list199.add(com.comverse.www.LiabilityRedirectionInstanceObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone199 = false;
                                                        while(!loopDone199){
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
                                                                loopDone199 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","liabilityRedirectionsTarget").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list199.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list199.add(com.comverse.www.LiabilityRedirectionInstanceObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone199 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLiabilityRedirectionsTarget((com.comverse.www.LiabilityRedirectionInstanceObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.LiabilityRedirectionInstanceObject.class,
                                                                list199));
                                                            
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
           
    