
/**
 * BundleInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  BundleInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BundleInstanceObject extends com.comverse.www.BundleInstanceIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = bundleInstanceObject
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
                            localBundleIdTracker = param != null;
                                   
                                            this.localBundleId=param;
                                    

                               }
                            

                        /**
                        * field for BundleState
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localBundleState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleStateTracker = false ;

                           public boolean isBundleStateSpecified(){
                               return localBundleStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getBundleState(){
                               return localBundleState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleState
                               */
                               public void setBundleState(com.comverse.www.ShortAttributeJAXBElement param){
                            localBundleStateTracker = param != null;
                                   
                                            this.localBundleState=param;
                                    

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
                            localIntendedViewEffectiveDtTracker = param != null;
                                   
                                            this.localIntendedViewEffectiveDt=param;
                                    

                               }
                            

                        /**
                        * field for ParentBundleInstId
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localParentBundleInstId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentBundleInstIdTracker = false ;

                           public boolean isParentBundleInstIdSpecified(){
                               return localParentBundleInstIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getParentBundleInstId(){
                               return localParentBundleInstId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParentBundleInstId
                               */
                               public void setParentBundleInstId(com.comverse.www.LongAttributeJAXBElement param){
                            localParentBundleInstIdTracker = true;
                                   
                                            this.localParentBundleInstId=param;
                                    

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
                           namespacePrefix+":bundleInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "bundleInstanceObject",
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
                                        } if (localBundleInstIdTracker){
                                            if (localBundleInstId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("bundleInstId cannot be null!!");
                                            }
                                           localBundleInstId.serialize(new javax.xml.namespace.QName("","bundleInstId"),
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
                                        } if (localBundleIdTracker){
                                            if (localBundleId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("bundleId cannot be null!!");
                                            }
                                           localBundleId.serialize(new javax.xml.namespace.QName("","bundleId"),
                                               xmlWriter);
                                        } if (localBundleStateTracker){
                                            if (localBundleState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("bundleState cannot be null!!");
                                            }
                                           localBundleState.serialize(new javax.xml.namespace.QName("","bundleState"),
                                               xmlWriter);
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
                                                 throw new org.apache.axis2.databinding.ADBException("intendedViewEffectiveDt cannot be null!!");
                                            }
                                           localIntendedViewEffectiveDt.serialize(new javax.xml.namespace.QName("","intendedViewEffectiveDt"),
                                               xmlWriter);
                                        } if (localParentBundleInstIdTracker){
                                    if (localParentBundleInstId==null){

                                        writeStartElement(null, "", "parentBundleInstId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParentBundleInstId.serialize(new javax.xml.namespace.QName("","parentBundleInstId"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","bundleInstanceObject"));
                
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
                                } if (localBundleInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleInstId"));
                            
                            
                                    if (localBundleInstId==null){
                                         throw new org.apache.axis2.databinding.ADBException("bundleInstId cannot be null!!");
                                    }
                                    elementList.add(localBundleInstId);
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
                                } if (localBundleIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleId"));
                            
                            
                                    if (localBundleId==null){
                                         throw new org.apache.axis2.databinding.ADBException("bundleId cannot be null!!");
                                    }
                                    elementList.add(localBundleId);
                                } if (localBundleStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "bundleState"));
                            
                            
                                    if (localBundleState==null){
                                         throw new org.apache.axis2.databinding.ADBException("bundleState cannot be null!!");
                                    }
                                    elementList.add(localBundleState);
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
                                } if (localDisconnectReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "disconnectReason"));
                            
                            
                                    elementList.add(localDisconnectReason==null?null:
                                    localDisconnectReason);
                                } if (localInactiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "inactiveDt"));
                            
                            
                                    elementList.add(localInactiveDt==null?null:
                                    localInactiveDt);
                                } if (localIntendedViewEffectiveDtTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "intendedViewEffectiveDt"));
                            
                            
                                    if (localIntendedViewEffectiveDt==null){
                                         throw new org.apache.axis2.databinding.ADBException("intendedViewEffectiveDt cannot be null!!");
                                    }
                                    elementList.add(localIntendedViewEffectiveDt);
                                } if (localParentBundleInstIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "parentBundleInstId"));
                            
                            
                                    elementList.add(localParentBundleInstId==null?null:
                                    localParentBundleInstId);
                                } if (localPrevViewIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prevViewId"));
                            
                            
                                    elementList.add(localPrevViewId==null?null:
                                    localPrevViewId);
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
        public static BundleInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BundleInstanceObject object =
                new BundleInstanceObject();

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
                    
                            if (!"bundleInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BundleInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundleInstId").equals(reader.getName())){
                                
                                                object.setBundleInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundleId").equals(reader.getName())){
                                
                                                object.setBundleId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","bundleState").equals(reader.getName())){
                                
                                                object.setBundleState(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                                object.setIntendedViewEffectiveDt(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","parentBundleInstId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParentBundleInstId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParentBundleInstId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    