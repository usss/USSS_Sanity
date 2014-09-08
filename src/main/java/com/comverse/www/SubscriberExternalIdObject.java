
/**
 * SubscriberExternalIdObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  SubscriberExternalIdObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SubscriberExternalIdObject extends com.comverse.www.SubscriberExternalIdIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = subscriberExternalIdObject
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
                        * field for ActiveDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localActiveDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localActiveDateTracker = false ;

                           public boolean isActiveDateSpecified(){
                               return localActiveDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getActiveDate(){
                               return localActiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActiveDate
                               */
                               public void setActiveDate(com.comverse.www.DateAttributeJAXBElement param){
                            localActiveDateTracker = param != null;
                                   
                                            this.localActiveDate=param;
                                    

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
                        * field for InactiveDate
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localInactiveDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInactiveDateTracker = false ;

                           public boolean isInactiveDateSpecified(){
                               return localInactiveDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getInactiveDate(){
                               return localInactiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactiveDate
                               */
                               public void setInactiveDate(com.comverse.www.DateAttributeJAXBElement param){
                            localInactiveDateTracker = true;
                                   
                                            this.localInactiveDate=param;
                                    

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
                            localIntendedViewEffectiveDtTracker = param != null;
                                   
                                            this.localIntendedViewEffectiveDt=param;
                                    

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
                        * field for IsCurrent
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsCurrent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsCurrentTracker = false ;

                           public boolean isIsCurrentSpecified(){
                               return localIsCurrentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsCurrent(){
                               return localIsCurrent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsCurrent
                               */
                               public void setIsCurrent(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsCurrentTracker = param != null;
                                   
                                            this.localIsCurrent=param;
                                    

                               }
                            

                        /**
                        * field for IsFromInventory
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localIsFromInventory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsFromInventoryTracker = false ;

                           public boolean isIsFromInventorySpecified(){
                               return localIsFromInventoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getIsFromInventory(){
                               return localIsFromInventory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsFromInventory
                               */
                               public void setIsFromInventory(com.comverse.www.BooleanAttributeJAXBElement param){
                            localIsFromInventoryTracker = param != null;
                                   
                                            this.localIsFromInventory=param;
                                    

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
                        * field for RatingDbId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localRatingDbId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingDbIdTracker = false ;

                           public boolean isRatingDbIdSpecified(){
                               return localRatingDbIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getRatingDbId(){
                               return localRatingDbId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RatingDbId
                               */
                               public void setRatingDbId(com.comverse.www.ShortAttributeJAXBElement param){
                            localRatingDbIdTracker = param != null;
                                   
                                            this.localRatingDbId=param;
                                    

                               }
                            

                        /**
                        * field for ServerId
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localServerId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerIdTracker = false ;

                           public boolean isServerIdSpecified(){
                               return localServerIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getServerId(){
                               return localServerId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerId
                               */
                               public void setServerId(com.comverse.www.ShortAttributeJAXBElement param){
                            localServerIdTracker = param != null;
                                   
                                            this.localServerId=param;
                                    

                               }
                            

                        /**
                        * field for ServiceExternalId
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localServiceExternalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceExternalIdTracker = false ;

                           public boolean isServiceExternalIdSpecified(){
                               return localServiceExternalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getServiceExternalId(){
                               return localServiceExternalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceExternalId
                               */
                               public void setServiceExternalId(com.comverse.www.StringAttributeJAXBElement param){
                            localServiceExternalIdTracker = param != null;
                                   
                                            this.localServiceExternalId=param;
                                    

                               }
                            

                        /**
                        * field for ServiceExternalIdType
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localServiceExternalIdType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceExternalIdTypeTracker = false ;

                           public boolean isServiceExternalIdTypeSpecified(){
                               return localServiceExternalIdTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getServiceExternalIdType(){
                               return localServiceExternalIdType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceExternalIdType
                               */
                               public void setServiceExternalIdType(com.comverse.www.ShortAttributeJAXBElement param){
                            localServiceExternalIdTypeTracker = param != null;
                                   
                                            this.localServiceExternalIdType=param;
                                    

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
                            localServiceInternalIdTracker = param != null;
                                   
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
                            localServiceInternalIdResetsTracker = param != null;
                                   
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
                           namespacePrefix+":subscriberExternalIdObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "subscriberExternalIdObject",
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
                                        } if (localAccountInternalIdTracker){
                                            if (localAccountInternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                            }
                                           localAccountInternalId.serialize(new javax.xml.namespace.QName("","accountInternalId"),
                                               xmlWriter);
                                        } if (localActiveDateTracker){
                                            if (localActiveDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("activeDate cannot be null!!");
                                            }
                                           localActiveDate.serialize(new javax.xml.namespace.QName("","activeDate"),
                                               xmlWriter);
                                        } if (localCreateDtTracker){
                                            if (localCreateDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("createDt cannot be null!!");
                                            }
                                           localCreateDt.serialize(new javax.xml.namespace.QName("","createDt"),
                                               xmlWriter);
                                        } if (localInactiveDateTracker){
                                    if (localInactiveDate==null){

                                        writeStartElement(null, "", "inactiveDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInactiveDate.serialize(new javax.xml.namespace.QName("","inactiveDate"),
                                        xmlWriter);
                                    }
                                } if (localIntendedViewEffectiveDtTracker){
                                            if (localIntendedViewEffectiveDt==null){
                                                 throw new org.apache.axis2.databinding.ADBException("intendedViewEffectiveDt cannot be null!!");
                                            }
                                           localIntendedViewEffectiveDt.serialize(new javax.xml.namespace.QName("","intendedViewEffectiveDt"),
                                               xmlWriter);
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
                                } if (localIsCurrentTracker){
                                            if (localIsCurrent==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isCurrent cannot be null!!");
                                            }
                                           localIsCurrent.serialize(new javax.xml.namespace.QName("","isCurrent"),
                                               xmlWriter);
                                        } if (localIsFromInventoryTracker){
                                            if (localIsFromInventory==null){
                                                 throw new org.apache.axis2.databinding.ADBException("isFromInventory cannot be null!!");
                                            }
                                           localIsFromInventory.serialize(new javax.xml.namespace.QName("","isFromInventory"),
                                               xmlWriter);
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
                                } if (localRatingDbIdTracker){
                                            if (localRatingDbId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ratingDbId cannot be null!!");
                                            }
                                           localRatingDbId.serialize(new javax.xml.namespace.QName("","ratingDbId"),
                                               xmlWriter);
                                        } if (localServerIdTracker){
                                            if (localServerId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serverId cannot be null!!");
                                            }
                                           localServerId.serialize(new javax.xml.namespace.QName("","serverId"),
                                               xmlWriter);
                                        } if (localServiceExternalIdTracker){
                                            if (localServiceExternalId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceExternalId cannot be null!!");
                                            }
                                           localServiceExternalId.serialize(new javax.xml.namespace.QName("","serviceExternalId"),
                                               xmlWriter);
                                        } if (localServiceExternalIdTypeTracker){
                                            if (localServiceExternalIdType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serviceExternalIdType cannot be null!!");
                                            }
                                           localServiceExternalIdType.serialize(new javax.xml.namespace.QName("","serviceExternalIdType"),
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
                                        } if (localExtendedDataTracker){
                                            if (localExtendedData==null){
                                                 throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                            }
                                           localExtendedData.serialize(new javax.xml.namespace.QName("","extendedData"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","subscriberExternalIdObject"));
                
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
                                } if (localAccountInternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accountInternalId"));
                            
                            
                                    if (localAccountInternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("accountInternalId cannot be null!!");
                                    }
                                    elementList.add(localAccountInternalId);
                                } if (localActiveDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "activeDate"));
                            
                            
                                    if (localActiveDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("activeDate cannot be null!!");
                                    }
                                    elementList.add(localActiveDate);
                                } if (localCreateDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "createDt"));
                            
                            
                                    if (localCreateDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("createDt cannot be null!!");
                                    }
                                    elementList.add(localCreateDt);
                                } if (localInactiveDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inactiveDate"));
                            
                            
                                    elementList.add(localInactiveDate==null?null:
                                    localInactiveDate);
                                } if (localIntendedViewEffectiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "intendedViewEffectiveDt"));
                            
                            
                                    if (localIntendedViewEffectiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("intendedViewEffectiveDt cannot be null!!");
                                    }
                                    elementList.add(localIntendedViewEffectiveDt);
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
                                } if (localIsCurrentTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isCurrent"));
                            
                            
                                    if (localIsCurrent==null){
                                         throw new org.apache.axis2.databinding.ADBException("isCurrent cannot be null!!");
                                    }
                                    elementList.add(localIsCurrent);
                                } if (localIsFromInventoryTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "isFromInventory"));
                            
                            
                                    if (localIsFromInventory==null){
                                         throw new org.apache.axis2.databinding.ADBException("isFromInventory cannot be null!!");
                                    }
                                    elementList.add(localIsFromInventory);
                                } if (localPrevViewIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevViewId"));
                            
                            
                                    elementList.add(localPrevViewId==null?null:
                                    localPrevViewId);
                                } if (localRatingDbIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ratingDbId"));
                            
                            
                                    if (localRatingDbId==null){
                                         throw new org.apache.axis2.databinding.ADBException("ratingDbId cannot be null!!");
                                    }
                                    elementList.add(localRatingDbId);
                                } if (localServerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serverId"));
                            
                            
                                    if (localServerId==null){
                                         throw new org.apache.axis2.databinding.ADBException("serverId cannot be null!!");
                                    }
                                    elementList.add(localServerId);
                                } if (localServiceExternalIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceExternalId"));
                            
                            
                                    if (localServiceExternalId==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceExternalId cannot be null!!");
                                    }
                                    elementList.add(localServiceExternalId);
                                } if (localServiceExternalIdTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serviceExternalIdType"));
                            
                            
                                    if (localServiceExternalIdType==null){
                                         throw new org.apache.axis2.databinding.ADBException("serviceExternalIdType cannot be null!!");
                                    }
                                    elementList.add(localServiceExternalIdType);
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
                                } if (localExtendedDataTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "extendedData"));
                            
                            
                                    if (localExtendedData==null){
                                         throw new org.apache.axis2.databinding.ADBException("extendedData cannot be null!!");
                                    }
                                    elementList.add(localExtendedData);
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
        public static SubscriberExternalIdObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SubscriberExternalIdObject object =
                new SubscriberExternalIdObject();

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
                    
                            if (!"subscriberExternalIdObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SubscriberExternalIdObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accountInternalId").equals(reader.getName())){
                                
                                                object.setAccountInternalId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","activeDate").equals(reader.getName())){
                                
                                                object.setActiveDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","inactiveDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInactiveDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInactiveDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","intendedViewEffectiveDt").equals(reader.getName())){
                                
                                                object.setIntendedViewEffectiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isCurrent").equals(reader.getName())){
                                
                                                object.setIsCurrent(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","isFromInventory").equals(reader.getName())){
                                
                                                object.setIsFromInventory(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ratingDbId").equals(reader.getName())){
                                
                                                object.setRatingDbId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serverId").equals(reader.getName())){
                                
                                                object.setServerId(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceExternalId").equals(reader.getName())){
                                
                                                object.setServiceExternalId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serviceExternalIdType").equals(reader.getName())){
                                
                                                object.setServiceExternalIdType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","extendedData").equals(reader.getName())){
                                
                                                object.setExtendedData(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    