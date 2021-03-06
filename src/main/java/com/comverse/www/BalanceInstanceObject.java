
/**
 * BalanceInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  BalanceInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BalanceInstanceObject extends com.comverse.www.BalanceInstanceIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = balanceInstanceObject
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
                        * field for AvailableBalance
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localAvailableBalance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvailableBalanceTracker = false ;

                           public boolean isAvailableBalanceSpecified(){
                               return localAvailableBalanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getAvailableBalance(){
                               return localAvailableBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvailableBalance
                               */
                               public void setAvailableBalance(com.comverse.www.NumericAttributeJAXBElement param){
                            localAvailableBalanceTracker = true;
                                   
                                            this.localAvailableBalance=param;
                                    

                               }
                            

                        /**
                        * field for BalanceStatus
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localBalanceStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceStatusTracker = false ;

                           public boolean isBalanceStatusSpecified(){
                               return localBalanceStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getBalanceStatus(){
                               return localBalanceStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceStatus
                               */
                               public void setBalanceStatus(com.comverse.www.ShortAttributeJAXBElement param){
                            localBalanceStatusTracker = param != null;
                                   
                                            this.localBalanceStatus=param;
                                    

                               }
                            

                        /**
                        * field for BalanceType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localBalanceType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceTypeTracker = false ;

                           public boolean isBalanceTypeSpecified(){
                               return localBalanceTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getBalanceType(){
                               return localBalanceType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceType
                               */
                               public void setBalanceType(com.comverse.www.ShortAttributeJAXBElement param){
                            localBalanceTypeTracker = param != null;
                                   
                                            this.localBalanceType=param;
                                    

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
                        * field for CyclicBillingDay
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localCyclicBillingDay ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCyclicBillingDayTracker = false ;

                           public boolean isCyclicBillingDaySpecified(){
                               return localCyclicBillingDayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getCyclicBillingDay(){
                               return localCyclicBillingDay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CyclicBillingDay
                               */
                               public void setCyclicBillingDay(com.comverse.www.ShortAttributeJAXBElement param){
                            localCyclicBillingDayTracker = true;
                                   
                                            this.localCyclicBillingDay=param;
                                    

                               }
                            

                        /**
                        * field for ExpirationDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localExpirationDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpirationDateTracker = false ;

                           public boolean isExpirationDateSpecified(){
                               return localExpirationDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getExpirationDate(){
                               return localExpirationDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpirationDate
                               */
                               public void setExpirationDate(com.comverse.www.DateAttributeJAXBElement param){
                            localExpirationDateTracker = true;
                                   
                                            this.localExpirationDate=param;
                                    

                               }
                            

                        /**
                        * field for IsCore
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsCore ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsCoreTracker = false ;

                           public boolean isIsCoreSpecified(){
                               return localIsCoreTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsCore(){
                               return localIsCore;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsCore
                               */
                               public void setIsCore(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsCoreTracker = param != null;
                                   
                                            this.localIsCore=param;
                                    

                               }
                            

                        /**
                        * field for IsShareable
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsShareable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsShareableTracker = false ;

                           public boolean isIsShareableSpecified(){
                               return localIsShareableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsShareable(){
                               return localIsShareable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsShareable
                               */
                               public void setIsShareable(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsShareableTracker = param != null;
                                   
                                            this.localIsShareable=param;
                                    

                               }
                            

                        /**
                        * field for LimitType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localLimitType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLimitTypeTracker = false ;

                           public boolean isLimitTypeSpecified(){
                               return localLimitTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getLimitType(){
                               return localLimitType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LimitType
                               */
                               public void setLimitType(com.comverse.www.ShortAttributeJAXBElement param){
                            localLimitTypeTracker = true;
                                   
                                            this.localLimitType=param;
                                    

                               }
                            

                        /**
                        * field for MaxLimit
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localMaxLimit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxLimitTracker = false ;

                           public boolean isMaxLimitSpecified(){
                               return localMaxLimitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getMaxLimit(){
                               return localMaxLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxLimit
                               */
                               public void setMaxLimit(com.comverse.www.NumericAttributeJAXBElement param){
                            localMaxLimitTracker = true;
                                   
                                            this.localMaxLimit=param;
                                    

                               }
                            

                        /**
                        * field for NextResetDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextResetDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextResetDateTracker = false ;

                           public boolean isNextResetDateSpecified(){
                               return localNextResetDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextResetDate(){
                               return localNextResetDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextResetDate
                               */
                               public void setNextResetDate(com.comverse.www.DateAttributeJAXBElement param){
                            localNextResetDateTracker = true;
                                   
                                            this.localNextResetDate=param;
                                    

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
                        * field for ResetPeriod
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localResetPeriod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResetPeriodTracker = false ;

                           public boolean isResetPeriodSpecified(){
                               return localResetPeriodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getResetPeriod(){
                               return localResetPeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResetPeriod
                               */
                               public void setResetPeriod(com.comverse.www.ShortAttributeJAXBElement param){
                            localResetPeriodTracker = true;
                                   
                                            this.localResetPeriod=param;
                                    

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
                        * field for TargetBalId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localTargetBalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetBalIdTracker = false ;

                           public boolean isTargetBalIdSpecified(){
                               return localTargetBalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getTargetBalId(){
                               return localTargetBalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetBalId
                               */
                               public void setTargetBalId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localTargetBalIdTracker = true;
                                   
                                            this.localTargetBalId=param;
                                    

                               }
                            

                        /**
                        * field for TotalBalance
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localTotalBalance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalBalanceTracker = false ;

                           public boolean isTotalBalanceSpecified(){
                               return localTotalBalanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getTotalBalance(){
                               return localTotalBalance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalBalance
                               */
                               public void setTotalBalance(com.comverse.www.NumericAttributeJAXBElement param){
                            localTotalBalanceTracker = true;
                                   
                                            this.localTotalBalance=param;
                                    

                               }
                            

                        /**
                        * field for UnitType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localUnitType ;
                                
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
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getUnitType(){
                               return localUnitType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnitType
                               */
                               public void setUnitType(com.comverse.www.ShortAttributeJAXBElement param){
                            localUnitTypeTracker = param != null;
                                   
                                            this.localUnitType=param;
                                    

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
                           namespacePrefix+":balanceInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "balanceInstanceObject",
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
                              if (localBalanceIdTracker){
                                            if (localBalanceId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceId cannot be null!!");
                                            }
                                           localBalanceId.serialize(new javax.xml.namespace.QName("","balanceId"),
                                               xmlWriter);
                                        } if (localBalanceInstIdTracker){
                                            if (localBalanceInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceInstId cannot be null!!");
                                            }
                                           localBalanceInstId.serialize(new javax.xml.namespace.QName("","balanceInstId"),
                                               xmlWriter);
                                        } if (localAccountInternalIdTracker){
                                            if (localAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                            }
                                           localAccountInternalId.serialize(new javax.xml.namespace.QName("","accountInternalId"),
                                               xmlWriter);
                                        } if (localAvailableBalanceTracker){
                                    if (localAvailableBalance==null){

                                        writeStartElement(null, "", "availableBalance", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAvailableBalance.serialize(new javax.xml.namespace.QName("","availableBalance"),
                                        xmlWriter);
                                    }
                                } if (localBalanceStatusTracker){
                                            if (localBalanceStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceStatus cannot be null!!");
                                            }
                                           localBalanceStatus.serialize(new javax.xml.namespace.QName("","balanceStatus"),
                                               xmlWriter);
                                        } if (localBalanceTypeTracker){
                                            if (localBalanceType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceType cannot be null!!");
                                            }
                                           localBalanceType.serialize(new javax.xml.namespace.QName("","balanceType"),
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
                                } if (localCyclicBillingDayTracker){
                                    if (localCyclicBillingDay==null){

                                        writeStartElement(null, "", "cyclicBillingDay", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCyclicBillingDay.serialize(new javax.xml.namespace.QName("","cyclicBillingDay"),
                                        xmlWriter);
                                    }
                                } if (localExpirationDateTracker){
                                    if (localExpirationDate==null){

                                        writeStartElement(null, "", "expirationDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localExpirationDate.serialize(new javax.xml.namespace.QName("","expirationDate"),
                                        xmlWriter);
                                    }
                                } if (localIsCoreTracker){
                                            if (localIsCore==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isCore cannot be null!!");
                                            }
                                           localIsCore.serialize(new javax.xml.namespace.QName("","isCore"),
                                               xmlWriter);
                                        } if (localIsShareableTracker){
                                            if (localIsShareable==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isShareable cannot be null!!");
                                            }
                                           localIsShareable.serialize(new javax.xml.namespace.QName("","isShareable"),
                                               xmlWriter);
                                        } if (localLimitTypeTracker){
                                    if (localLimitType==null){

                                        writeStartElement(null, "", "limitType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLimitType.serialize(new javax.xml.namespace.QName("","limitType"),
                                        xmlWriter);
                                    }
                                } if (localMaxLimitTracker){
                                    if (localMaxLimit==null){

                                        writeStartElement(null, "", "maxLimit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMaxLimit.serialize(new javax.xml.namespace.QName("","maxLimit"),
                                        xmlWriter);
                                    }
                                } if (localNextResetDateTracker){
                                    if (localNextResetDate==null){

                                        writeStartElement(null, "", "nextResetDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextResetDate.serialize(new javax.xml.namespace.QName("","nextResetDate"),
                                        xmlWriter);
                                    }
                                } if (localPaymentModeTracker){
                                            if (localPaymentMode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("paymentMode cannot be null!!");
                                            }
                                           localPaymentMode.serialize(new javax.xml.namespace.QName("","paymentMode"),
                                               xmlWriter);
                                        } if (localResetPeriodTracker){
                                    if (localResetPeriod==null){

                                        writeStartElement(null, "", "resetPeriod", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localResetPeriod.serialize(new javax.xml.namespace.QName("","resetPeriod"),
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
                                } if (localTargetBalIdTracker){
                                    if (localTargetBalId==null){

                                        writeStartElement(null, "", "targetBalId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetBalId.serialize(new javax.xml.namespace.QName("","targetBalId"),
                                        xmlWriter);
                                    }
                                } if (localTotalBalanceTracker){
                                    if (localTotalBalance==null){

                                        writeStartElement(null, "", "totalBalance", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalBalance.serialize(new javax.xml.namespace.QName("","totalBalance"),
                                        xmlWriter);
                                    }
                                } if (localUnitTypeTracker){
                                            if (localUnitType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("unitType cannot be null!!");
                                            }
                                           localUnitType.serialize(new javax.xml.namespace.QName("","unitType"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","balanceInstanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localBalanceIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceId"));
                            
                            
                                    if (localBalanceId==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceId cannot be null!!");
                                    }
                                    elementList.add(localBalanceId);
                                } if (localBalanceInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceInstId"));
                            
                            
                                    if (localBalanceInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceInstId cannot be null!!");
                                    }
                                    elementList.add(localBalanceInstId);
                                } if (localAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountInternalId"));
                            
                            
                                    if (localAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                    }
                                    elementList.add(localAccountInternalId);
                                } if (localAvailableBalanceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "availableBalance"));
                            
                            
                                    elementList.add(localAvailableBalance==null?null:
                                    localAvailableBalance);
                                } if (localBalanceStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceStatus"));
                            
                            
                                    if (localBalanceStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceStatus cannot be null!!");
                                    }
                                    elementList.add(localBalanceStatus);
                                } if (localBalanceTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceType"));
                            
                            
                                    if (localBalanceType==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceType cannot be null!!");
                                    }
                                    elementList.add(localBalanceType);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    elementList.add(localCurrencyCode==null?null:
                                    localCurrencyCode);
                                } if (localCyclicBillingDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cyclicBillingDay"));
                            
                            
                                    elementList.add(localCyclicBillingDay==null?null:
                                    localCyclicBillingDay);
                                } if (localExpirationDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "expirationDate"));
                            
                            
                                    elementList.add(localExpirationDate==null?null:
                                    localExpirationDate);
                                } if (localIsCoreTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isCore"));
                            
                            
                                    if (localIsCore==null){
                                         throw new org.apache.axis2.databinding.ADBException("isCore cannot be null!!");
                                    }
                                    elementList.add(localIsCore);
                                } if (localIsShareableTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isShareable"));
                            
                            
                                    if (localIsShareable==null){
                                         throw new org.apache.axis2.databinding.ADBException("isShareable cannot be null!!");
                                    }
                                    elementList.add(localIsShareable);
                                } if (localLimitTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "limitType"));
                            
                            
                                    elementList.add(localLimitType==null?null:
                                    localLimitType);
                                } if (localMaxLimitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "maxLimit"));
                            
                            
                                    elementList.add(localMaxLimit==null?null:
                                    localMaxLimit);
                                } if (localNextResetDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextResetDate"));
                            
                            
                                    elementList.add(localNextResetDate==null?null:
                                    localNextResetDate);
                                } if (localPaymentModeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "paymentMode"));
                            
                            
                                    if (localPaymentMode==null){
                                         throw new org.apache.axis2.databinding.ADBException("paymentMode cannot be null!!");
                                    }
                                    elementList.add(localPaymentMode);
                                } if (localResetPeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "resetPeriod"));
                            
                            
                                    elementList.add(localResetPeriod==null?null:
                                    localResetPeriod);
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
                                } if (localTargetBalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetBalId"));
                            
                            
                                    elementList.add(localTargetBalId==null?null:
                                    localTargetBalId);
                                } if (localTotalBalanceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "totalBalance"));
                            
                            
                                    elementList.add(localTotalBalance==null?null:
                                    localTotalBalance);
                                } if (localUnitTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "unitType"));
                            
                            
                                    if (localUnitType==null){
                                         throw new org.apache.axis2.databinding.ADBException("unitType cannot be null!!");
                                    }
                                    elementList.add(localUnitType);
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
        public static BalanceInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BalanceInstanceObject object =
                new BalanceInstanceObject();

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
                    
                            if (!"balanceInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BalanceInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceId").equals(reader.getName())){
                                
                                                object.setBalanceId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceInstId").equals(reader.getName())){
                                
                                                object.setBalanceInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","availableBalance").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAvailableBalance(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAvailableBalance(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceStatus").equals(reader.getName())){
                                
                                                object.setBalanceStatus(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceType").equals(reader.getName())){
                                
                                                object.setBalanceType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cyclicBillingDay").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCyclicBillingDay(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCyclicBillingDay(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","expirationDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setExpirationDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setExpirationDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isCore").equals(reader.getName())){
                                
                                                object.setIsCore(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isShareable").equals(reader.getName())){
                                
                                                object.setIsShareable(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","limitType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLimitType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLimitType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","maxLimit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMaxLimit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMaxLimit(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextResetDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextResetDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextResetDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","resetPeriod").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setResetPeriod(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setResetPeriod(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetBalId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetBalId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetBalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","totalBalance").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalBalance(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalBalance(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","unitType").equals(reader.getName())){
                                
                                                object.setUnitType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    