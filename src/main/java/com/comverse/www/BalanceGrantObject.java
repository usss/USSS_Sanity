
/**
 * BalanceGrantObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  BalanceGrantObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BalanceGrantObject extends com.comverse.www.BalanceGrantIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = balanceGrantObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AwardedAmount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localAwardedAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAwardedAmountTracker = false ;

                           public boolean isAwardedAmountSpecified(){
                               return localAwardedAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getAwardedAmount(){
                               return localAwardedAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AwardedAmount
                               */
                               public void setAwardedAmount(com.comverse.www.NumericAttributeJAXBElement param){
                            localAwardedAmountTracker = true;
                                   
                                            this.localAwardedAmount=param;
                                    

                               }
                            

                        /**
                        * field for BalanceId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localBalanceId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceIdTracker = false ;

                           public boolean isBalanceIdSpecified(){
                               return localBalanceIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getBalanceId(){
                               return localBalanceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceId
                               */
                               public void setBalanceId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localBalanceIdTracker = param != null;
                                   
                                            this.localBalanceId=param;
                                    

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
                            localCurrencyCodeTracker = param != null;
                                   
                                            this.localCurrencyCode=param;
                                    

                               }
                            

                        /**
                        * field for CycleFromDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localCycleFromDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCycleFromDateTracker = false ;

                           public boolean isCycleFromDateSpecified(){
                               return localCycleFromDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getCycleFromDate(){
                               return localCycleFromDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CycleFromDate
                               */
                               public void setCycleFromDate(com.comverse.www.DateAttributeJAXBElement param){
                            localCycleFromDateTracker = true;
                                   
                                            this.localCycleFromDate=param;
                                    

                               }
                            

                        /**
                        * field for GrantActiveDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localGrantActiveDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGrantActiveDateTracker = false ;

                           public boolean isGrantActiveDateSpecified(){
                               return localGrantActiveDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getGrantActiveDate(){
                               return localGrantActiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GrantActiveDate
                               */
                               public void setGrantActiveDate(com.comverse.www.DateAttributeJAXBElement param){
                            localGrantActiveDateTracker = param != null;
                                   
                                            this.localGrantActiveDate=param;
                                    

                               }
                            

                        /**
                        * field for GrantAmount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localGrantAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGrantAmountTracker = false ;

                           public boolean isGrantAmountSpecified(){
                               return localGrantAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getGrantAmount(){
                               return localGrantAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GrantAmount
                               */
                               public void setGrantAmount(com.comverse.www.NumericAttributeJAXBElement param){
                            localGrantAmountTracker = param != null;
                                   
                                            this.localGrantAmount=param;
                                    

                               }
                            

                        /**
                        * field for GrantExpirationType
                        */

                        
                                    protected com.comverse.www.ByteAttributeJAXBElement localGrantExpirationType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGrantExpirationTypeTracker = false ;

                           public boolean isGrantExpirationTypeSpecified(){
                               return localGrantExpirationTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ByteAttributeJAXBElement
                           */
                           public  com.comverse.www.ByteAttributeJAXBElement getGrantExpirationType(){
                               return localGrantExpirationType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GrantExpirationType
                               */
                               public void setGrantExpirationType(com.comverse.www.ByteAttributeJAXBElement param){
                            localGrantExpirationTypeTracker = param != null;
                                   
                                            this.localGrantExpirationType=param;
                                    

                               }
                            

                        /**
                        * field for GrantExpiryDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localGrantExpiryDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGrantExpiryDateTracker = false ;

                           public boolean isGrantExpiryDateSpecified(){
                               return localGrantExpiryDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getGrantExpiryDate(){
                               return localGrantExpiryDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GrantExpiryDate
                               */
                               public void setGrantExpiryDate(com.comverse.www.DateAttributeJAXBElement param){
                            localGrantExpiryDateTracker = true;
                                   
                                            this.localGrantExpiryDate=param;
                                    

                               }
                            

                        /**
                        * field for GrantSource
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localGrantSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGrantSourceTracker = false ;

                           public boolean isGrantSourceSpecified(){
                               return localGrantSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getGrantSource(){
                               return localGrantSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GrantSource
                               */
                               public void setGrantSource(com.comverse.www.StringAttributeJAXBElement param){
                            localGrantSourceTracker = param != null;
                                   
                                            this.localGrantSource=param;
                                    

                               }
                            

                        /**
                        * field for GrantStatus
                        */

                        
                                    protected com.comverse.www.ByteAttributeJAXBElement localGrantStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGrantStatusTracker = false ;

                           public boolean isGrantStatusSpecified(){
                               return localGrantStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ByteAttributeJAXBElement
                           */
                           public  com.comverse.www.ByteAttributeJAXBElement getGrantStatus(){
                               return localGrantStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GrantStatus
                               */
                               public void setGrantStatus(com.comverse.www.ByteAttributeJAXBElement param){
                            localGrantStatusTracker = param != null;
                                   
                                            this.localGrantStatus=param;
                                    

                               }
                            

                        /**
                        * field for MaximumGrantRollover
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localMaximumGrantRollover ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaximumGrantRolloverTracker = false ;

                           public boolean isMaximumGrantRolloverSpecified(){
                               return localMaximumGrantRolloverTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getMaximumGrantRollover(){
                               return localMaximumGrantRollover;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaximumGrantRollover
                               */
                               public void setMaximumGrantRollover(com.comverse.www.NumericAttributeJAXBElement param){
                            localMaximumGrantRolloverTracker = true;
                                   
                                            this.localMaximumGrantRollover=param;
                                    

                               }
                            

                        /**
                        * field for MaximumTotalRollover
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localMaximumTotalRollover ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaximumTotalRolloverTracker = false ;

                           public boolean isMaximumTotalRolloverSpecified(){
                               return localMaximumTotalRolloverTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getMaximumTotalRollover(){
                               return localMaximumTotalRollover;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaximumTotalRollover
                               */
                               public void setMaximumTotalRollover(com.comverse.www.NumericAttributeJAXBElement param){
                            localMaximumTotalRolloverTracker = true;
                                   
                                            this.localMaximumTotalRollover=param;
                                    

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
                        * field for PpBalExpiryOffset
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localPpBalExpiryOffset ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPpBalExpiryOffsetTracker = false ;

                           public boolean isPpBalExpiryOffsetSpecified(){
                               return localPpBalExpiryOffsetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getPpBalExpiryOffset(){
                               return localPpBalExpiryOffset;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PpBalExpiryOffset
                               */
                               public void setPpBalExpiryOffset(com.comverse.www.IntegerAttributeJAXBElement param){
                            localPpBalExpiryOffsetTracker = param != null;
                                   
                                            this.localPpBalExpiryOffset=param;
                                    

                               }
                            

                        /**
                        * field for PpNotifSent
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localPpNotifSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPpNotifSentTracker = false ;

                           public boolean isPpNotifSentSpecified(){
                               return localPpNotifSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getPpNotifSent(){
                               return localPpNotifSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PpNotifSent
                               */
                               public void setPpNotifSent(com.comverse.www.BooleanAttributeJAXBElement param){
                            localPpNotifSentTracker = param != null;
                                   
                                            this.localPpNotifSent=param;
                                    

                               }
                            

                        /**
                        * field for PpServiceFee
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localPpServiceFee ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPpServiceFeeTracker = false ;

                           public boolean isPpServiceFeeSpecified(){
                               return localPpServiceFeeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getPpServiceFee(){
                               return localPpServiceFee;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PpServiceFee
                               */
                               public void setPpServiceFee(com.comverse.www.NumericAttributeJAXBElement param){
                            localPpServiceFeeTracker = param != null;
                                   
                                            this.localPpServiceFee=param;
                                    

                               }
                            

                        /**
                        * field for RolloverDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localRolloverDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverDateTracker = false ;

                           public boolean isRolloverDateSpecified(){
                               return localRolloverDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getRolloverDate(){
                               return localRolloverDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverDate
                               */
                               public void setRolloverDate(com.comverse.www.DateAttributeJAXBElement param){
                            localRolloverDateTracker = true;
                                   
                                            this.localRolloverDate=param;
                                    

                               }
                            

                        /**
                        * field for RolloverGroup
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRolloverGroup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverGroupTracker = false ;

                           public boolean isRolloverGroupSpecified(){
                               return localRolloverGroupTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRolloverGroup(){
                               return localRolloverGroup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverGroup
                               */
                               public void setRolloverGroup(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRolloverGroupTracker = true;
                                   
                                            this.localRolloverGroup=param;
                                    

                               }
                            

                        /**
                        * field for RolloverOrder
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRolloverOrder ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRolloverOrderTracker = false ;

                           public boolean isRolloverOrderSpecified(){
                               return localRolloverOrderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRolloverOrder(){
                               return localRolloverOrder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RolloverOrder
                               */
                               public void setRolloverOrder(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRolloverOrderTracker = true;
                                   
                                            this.localRolloverOrder=param;
                                    

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
                           namespacePrefix+":balanceGrantObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "balanceGrantObject",
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
                                        } if (localGrantIdTracker){
                                            if (localGrantId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("grantId cannot be null!!");
                                            }
                                           localGrantId.serialize(new javax.xml.namespace.QName("","grantId"),
                                               xmlWriter);
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
                                        } if (localAwardedAmountTracker){
                                    if (localAwardedAmount==null){

                                        writeStartElement(null, "", "awardedAmount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAwardedAmount.serialize(new javax.xml.namespace.QName("","awardedAmount"),
                                        xmlWriter);
                                    }
                                } if (localBalanceIdTracker){
                                            if (localBalanceId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceId cannot be null!!");
                                            }
                                           localBalanceId.serialize(new javax.xml.namespace.QName("","balanceId"),
                                               xmlWriter);
                                        } if (localCurrencyCodeTracker){
                                            if (localCurrencyCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                            }
                                           localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                               xmlWriter);
                                        } if (localCycleFromDateTracker){
                                    if (localCycleFromDate==null){

                                        writeStartElement(null, "", "cycleFromDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCycleFromDate.serialize(new javax.xml.namespace.QName("","cycleFromDate"),
                                        xmlWriter);
                                    }
                                } if (localGrantActiveDateTracker){
                                            if (localGrantActiveDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("grantActiveDate cannot be null!!");
                                            }
                                           localGrantActiveDate.serialize(new javax.xml.namespace.QName("","grantActiveDate"),
                                               xmlWriter);
                                        } if (localGrantAmountTracker){
                                            if (localGrantAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("grantAmount cannot be null!!");
                                            }
                                           localGrantAmount.serialize(new javax.xml.namespace.QName("","grantAmount"),
                                               xmlWriter);
                                        } if (localGrantExpirationTypeTracker){
                                            if (localGrantExpirationType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("grantExpirationType cannot be null!!");
                                            }
                                           localGrantExpirationType.serialize(new javax.xml.namespace.QName("","grantExpirationType"),
                                               xmlWriter);
                                        } if (localGrantExpiryDateTracker){
                                    if (localGrantExpiryDate==null){

                                        writeStartElement(null, "", "grantExpiryDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGrantExpiryDate.serialize(new javax.xml.namespace.QName("","grantExpiryDate"),
                                        xmlWriter);
                                    }
                                } if (localGrantSourceTracker){
                                            if (localGrantSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("grantSource cannot be null!!");
                                            }
                                           localGrantSource.serialize(new javax.xml.namespace.QName("","grantSource"),
                                               xmlWriter);
                                        } if (localGrantStatusTracker){
                                            if (localGrantStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("grantStatus cannot be null!!");
                                            }
                                           localGrantStatus.serialize(new javax.xml.namespace.QName("","grantStatus"),
                                               xmlWriter);
                                        } if (localMaximumGrantRolloverTracker){
                                    if (localMaximumGrantRollover==null){

                                        writeStartElement(null, "", "maximumGrantRollover", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMaximumGrantRollover.serialize(new javax.xml.namespace.QName("","maximumGrantRollover"),
                                        xmlWriter);
                                    }
                                } if (localMaximumTotalRolloverTracker){
                                    if (localMaximumTotalRollover==null){

                                        writeStartElement(null, "", "maximumTotalRollover", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMaximumTotalRollover.serialize(new javax.xml.namespace.QName("","maximumTotalRollover"),
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
                                } if (localPpBalExpiryOffsetTracker){
                                            if (localPpBalExpiryOffset==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ppBalExpiryOffset cannot be null!!");
                                            }
                                           localPpBalExpiryOffset.serialize(new javax.xml.namespace.QName("","ppBalExpiryOffset"),
                                               xmlWriter);
                                        } if (localPpNotifSentTracker){
                                            if (localPpNotifSent==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ppNotifSent cannot be null!!");
                                            }
                                           localPpNotifSent.serialize(new javax.xml.namespace.QName("","ppNotifSent"),
                                               xmlWriter);
                                        } if (localPpServiceFeeTracker){
                                            if (localPpServiceFee==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ppServiceFee cannot be null!!");
                                            }
                                           localPpServiceFee.serialize(new javax.xml.namespace.QName("","ppServiceFee"),
                                               xmlWriter);
                                        } if (localRolloverDateTracker){
                                    if (localRolloverDate==null){

                                        writeStartElement(null, "", "rolloverDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRolloverDate.serialize(new javax.xml.namespace.QName("","rolloverDate"),
                                        xmlWriter);
                                    }
                                } if (localRolloverGroupTracker){
                                    if (localRolloverGroup==null){

                                        writeStartElement(null, "", "rolloverGroup", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRolloverGroup.serialize(new javax.xml.namespace.QName("","rolloverGroup"),
                                        xmlWriter);
                                    }
                                } if (localRolloverOrderTracker){
                                    if (localRolloverOrder==null){

                                        writeStartElement(null, "", "rolloverOrder", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRolloverOrder.serialize(new javax.xml.namespace.QName("","rolloverOrder"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","balanceGrantObject"));
                
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
                                } if (localGrantIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "grantId"));
                            
                            
                                    if (localGrantId==null){
                                         throw new org.apache.axis2.databinding.ADBException("grantId cannot be null!!");
                                    }
                                    elementList.add(localGrantId);
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
                                } if (localAwardedAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "awardedAmount"));
                            
                            
                                    elementList.add(localAwardedAmount==null?null:
                                    localAwardedAmount);
                                } if (localBalanceIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceId"));
                            
                            
                                    if (localBalanceId==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceId cannot be null!!");
                                    }
                                    elementList.add(localBalanceId);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    if (localCurrencyCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                    }
                                    elementList.add(localCurrencyCode);
                                } if (localCycleFromDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cycleFromDate"));
                            
                            
                                    elementList.add(localCycleFromDate==null?null:
                                    localCycleFromDate);
                                } if (localGrantActiveDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "grantActiveDate"));
                            
                            
                                    if (localGrantActiveDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("grantActiveDate cannot be null!!");
                                    }
                                    elementList.add(localGrantActiveDate);
                                } if (localGrantAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "grantAmount"));
                            
                            
                                    if (localGrantAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("grantAmount cannot be null!!");
                                    }
                                    elementList.add(localGrantAmount);
                                } if (localGrantExpirationTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "grantExpirationType"));
                            
                            
                                    if (localGrantExpirationType==null){
                                         throw new org.apache.axis2.databinding.ADBException("grantExpirationType cannot be null!!");
                                    }
                                    elementList.add(localGrantExpirationType);
                                } if (localGrantExpiryDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "grantExpiryDate"));
                            
                            
                                    elementList.add(localGrantExpiryDate==null?null:
                                    localGrantExpiryDate);
                                } if (localGrantSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "grantSource"));
                            
                            
                                    if (localGrantSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("grantSource cannot be null!!");
                                    }
                                    elementList.add(localGrantSource);
                                } if (localGrantStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "grantStatus"));
                            
                            
                                    if (localGrantStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("grantStatus cannot be null!!");
                                    }
                                    elementList.add(localGrantStatus);
                                } if (localMaximumGrantRolloverTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "maximumGrantRollover"));
                            
                            
                                    elementList.add(localMaximumGrantRollover==null?null:
                                    localMaximumGrantRollover);
                                } if (localMaximumTotalRolloverTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "maximumTotalRollover"));
                            
                            
                                    elementList.add(localMaximumTotalRollover==null?null:
                                    localMaximumTotalRollover);
                                } if (localParentAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentAccountInternalId"));
                            
                            
                                    elementList.add(localParentAccountInternalId==null?null:
                                    localParentAccountInternalId);
                                } if (localPpBalExpiryOffsetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ppBalExpiryOffset"));
                            
                            
                                    if (localPpBalExpiryOffset==null){
                                         throw new org.apache.axis2.databinding.ADBException("ppBalExpiryOffset cannot be null!!");
                                    }
                                    elementList.add(localPpBalExpiryOffset);
                                } if (localPpNotifSentTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ppNotifSent"));
                            
                            
                                    if (localPpNotifSent==null){
                                         throw new org.apache.axis2.databinding.ADBException("ppNotifSent cannot be null!!");
                                    }
                                    elementList.add(localPpNotifSent);
                                } if (localPpServiceFeeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ppServiceFee"));
                            
                            
                                    if (localPpServiceFee==null){
                                         throw new org.apache.axis2.databinding.ADBException("ppServiceFee cannot be null!!");
                                    }
                                    elementList.add(localPpServiceFee);
                                } if (localRolloverDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rolloverDate"));
                            
                            
                                    elementList.add(localRolloverDate==null?null:
                                    localRolloverDate);
                                } if (localRolloverGroupTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rolloverGroup"));
                            
                            
                                    elementList.add(localRolloverGroup==null?null:
                                    localRolloverGroup);
                                } if (localRolloverOrderTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rolloverOrder"));
                            
                            
                                    elementList.add(localRolloverOrder==null?null:
                                    localRolloverOrder);
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
        public static BalanceGrantObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BalanceGrantObject object =
                new BalanceGrantObject();

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
                    
                            if (!"balanceGrantObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BalanceGrantObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountInternalId").equals(reader.getName())){
                                
                                                object.setAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","grantId").equals(reader.getName())){
                                
                                                object.setGrantId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","awardedAmount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAwardedAmount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAwardedAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceId").equals(reader.getName())){
                                
                                                object.setBalanceId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cycleFromDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCycleFromDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCycleFromDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","grantActiveDate").equals(reader.getName())){
                                
                                                object.setGrantActiveDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","grantAmount").equals(reader.getName())){
                                
                                                object.setGrantAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","grantExpirationType").equals(reader.getName())){
                                
                                                object.setGrantExpirationType(com.comverse.www.ByteAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","grantExpiryDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGrantExpiryDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGrantExpiryDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","grantSource").equals(reader.getName())){
                                
                                                object.setGrantSource(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","grantStatus").equals(reader.getName())){
                                
                                                object.setGrantStatus(com.comverse.www.ByteAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","maximumGrantRollover").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMaximumGrantRollover(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMaximumGrantRollover(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","maximumTotalRollover").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMaximumTotalRollover(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMaximumTotalRollover(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ppBalExpiryOffset").equals(reader.getName())){
                                
                                                object.setPpBalExpiryOffset(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ppNotifSent").equals(reader.getName())){
                                
                                                object.setPpNotifSent(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ppServiceFee").equals(reader.getName())){
                                
                                                object.setPpServiceFee(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rolloverDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRolloverDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRolloverDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rolloverGroup").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRolloverGroup(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRolloverGroup(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rolloverOrder").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRolloverOrder(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRolloverOrder(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    