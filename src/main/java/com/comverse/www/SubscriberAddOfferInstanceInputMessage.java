
/**
 * SubscriberAddOfferInstanceInputMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  SubscriberAddOfferInstanceInputMessage bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SubscriberAddOfferInstanceInputMessage extends com.comverse.www.AbstractRequestMessage
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SubscriberAddOfferInstanceInputMessage
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SubscriberId
                        */

                        
                                    protected com.comverse.www.SubscriberIdentifier localSubscriberId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberIdTracker = false ;

                           public boolean isSubscriberIdSpecified(){
                               return localSubscriberIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SubscriberIdentifier
                           */
                           public  com.comverse.www.SubscriberIdentifier getSubscriberId(){
                               return localSubscriberId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubscriberId
                               */
                               public void setSubscriberId(com.comverse.www.SubscriberIdentifier param){
                            localSubscriberIdTracker = param != null;
                                   
                                            this.localSubscriberId=param;
                                    

                               }
                            

                        /**
                        * field for NewSelectiveOfferIdList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localNewSelectiveOfferIdList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNewSelectiveOfferIdListTracker = false ;

                           public boolean isNewSelectiveOfferIdListSpecified(){
                               return localNewSelectiveOfferIdListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getNewSelectiveOfferIdList(){
                               return localNewSelectiveOfferIdList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NewSelectiveOfferIdList
                               */
                              protected void validateNewSelectiveOfferIdList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NewSelectiveOfferIdList
                              */
                              public void setNewSelectiveOfferIdList(java.lang.String[] param){
                              
                                   validateNewSelectiveOfferIdList(param);

                               localNewSelectiveOfferIdListTracker = true;
                                      
                                      this.localNewSelectiveOfferIdList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addNewSelectiveOfferIdList(java.lang.String param){
                                   if (localNewSelectiveOfferIdList == null){
                                   localNewSelectiveOfferIdList = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localNewSelectiveOfferIdListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNewSelectiveOfferIdList);
                               list.add(param);
                               this.localNewSelectiveOfferIdList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for NewOptionalOfferIdList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localNewOptionalOfferIdList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNewOptionalOfferIdListTracker = false ;

                           public boolean isNewOptionalOfferIdListSpecified(){
                               return localNewOptionalOfferIdListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getNewOptionalOfferIdList(){
                               return localNewOptionalOfferIdList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NewOptionalOfferIdList
                               */
                              protected void validateNewOptionalOfferIdList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NewOptionalOfferIdList
                              */
                              public void setNewOptionalOfferIdList(java.lang.String[] param){
                              
                                   validateNewOptionalOfferIdList(param);

                               localNewOptionalOfferIdListTracker = true;
                                      
                                      this.localNewOptionalOfferIdList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addNewOptionalOfferIdList(java.lang.String param){
                                   if (localNewOptionalOfferIdList == null){
                                   localNewOptionalOfferIdList = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localNewOptionalOfferIdListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNewOptionalOfferIdList);
                               list.add(param);
                               this.localNewOptionalOfferIdList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for NewSupplementaryOfferIdList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localNewSupplementaryOfferIdList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNewSupplementaryOfferIdListTracker = false ;

                           public boolean isNewSupplementaryOfferIdListSpecified(){
                               return localNewSupplementaryOfferIdListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getNewSupplementaryOfferIdList(){
                               return localNewSupplementaryOfferIdList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NewSupplementaryOfferIdList
                               */
                              protected void validateNewSupplementaryOfferIdList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NewSupplementaryOfferIdList
                              */
                              public void setNewSupplementaryOfferIdList(java.lang.String[] param){
                              
                                   validateNewSupplementaryOfferIdList(param);

                               localNewSupplementaryOfferIdListTracker = true;
                                      
                                      this.localNewSupplementaryOfferIdList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addNewSupplementaryOfferIdList(java.lang.String param){
                                   if (localNewSupplementaryOfferIdList == null){
                                   localNewSupplementaryOfferIdList = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localNewSupplementaryOfferIdListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNewSupplementaryOfferIdList);
                               list.add(param);
                               this.localNewSupplementaryOfferIdList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for SubscriberExternalIdList
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.SubscriberExternalIdObject[] localSubscriberExternalIdList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriberExternalIdListTracker = false ;

                           public boolean isSubscriberExternalIdListSpecified(){
                               return localSubscriberExternalIdListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.SubscriberExternalIdObject[]
                           */
                           public  com.comverse.www.SubscriberExternalIdObject[] getSubscriberExternalIdList(){
                               return localSubscriberExternalIdList;
                           }

                           
                        


                               
                              /**
                               * validate the array for SubscriberExternalIdList
                               */
                              protected void validateSubscriberExternalIdList(com.comverse.www.SubscriberExternalIdObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SubscriberExternalIdList
                              */
                              public void setSubscriberExternalIdList(com.comverse.www.SubscriberExternalIdObject[] param){
                              
                                   validateSubscriberExternalIdList(param);

                               localSubscriberExternalIdListTracker = true;
                                      
                                      this.localSubscriberExternalIdList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.SubscriberExternalIdObject
                             */
                             public void addSubscriberExternalIdList(com.comverse.www.SubscriberExternalIdObject param){
                                   if (localSubscriberExternalIdList == null){
                                   localSubscriberExternalIdList = new com.comverse.www.SubscriberExternalIdObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localSubscriberExternalIdListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSubscriberExternalIdList);
                               list.add(param);
                               this.localSubscriberExternalIdList =
                             (com.comverse.www.SubscriberExternalIdObject[])list.toArray(
                            new com.comverse.www.SubscriberExternalIdObject[list.size()]);

                             }
                             

                        /**
                        * field for EffectiveDate
                        */

                        
                                    protected java.util.Calendar localEffectiveDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEffectiveDateTracker = false ;

                           public boolean isEffectiveDateSpecified(){
                               return localEffectiveDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getEffectiveDate(){
                               return localEffectiveDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EffectiveDate
                               */
                               public void setEffectiveDate(java.util.Calendar param){
                            localEffectiveDateTracker = param != null;
                                   
                                            this.localEffectiveDate=param;
                                    

                               }
                            

                        /**
                        * field for WaiveActivation
                        */

                        
                                    protected boolean localWaiveActivation ;
                                
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
                           * @return boolean
                           */
                           public  boolean getWaiveActivation(){
                               return localWaiveActivation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WaiveActivation
                               */
                               public void setWaiveActivation(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localWaiveActivationTracker =
                                       true;
                                   
                                            this.localWaiveActivation=param;
                                    

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
                           namespacePrefix+":SubscriberAddOfferInstanceInputMessage",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SubscriberAddOfferInstanceInputMessage",
                           xmlWriter);
                   }

                if (localCustomerVersionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "customerVersion", xmlWriter);
                             

                                          if (localCustomerVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("customerVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCustomerVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMessageIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "messageId", xmlWriter);
                             

                                          if (localMessageId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("messageId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMessageId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductVersionTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "productVersion", xmlWriter);
                             

                                          if (localProductVersion==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("productVersion cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProductVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "serverId", xmlWriter);
                             
                                               if (localServerId==java.lang.Short.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMessageBaseChoice_type0Tracker){
                                            if (localMessageBaseChoice_type0==null){
                                                 throw new org.apache.axis2.databinding.ADBException("messageBaseChoice_type0 cannot be null!!");
                                            }
                                           localMessageBaseChoice_type0.serialize(null,xmlWriter);
                                        } if (localBatchIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "batchId", xmlWriter);
                             
                                               if (localBatchId==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("batchId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBatchId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBlockSizeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "blockSize", xmlWriter);
                             
                                               if (localBlockSize==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("blockSize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCaseInteractionIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "caseInteractionId", xmlWriter);
                             

                                          if (localCaseInteractionId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("caseInteractionId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCaseInteractionId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCentralLogTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "centralLog", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("centralLog cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCentralLog));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChunkingIndexTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "chunkingIndex", xmlWriter);
                             
                                               if (localChunkingIndex==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("chunkingIndex cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChunkingIndex));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChunkingPolicyTracker){
                                            if (localChunkingPolicy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("chunkingPolicy cannot be null!!");
                                            }
                                           localChunkingPolicy.serialize(new javax.xml.namespace.QName("","chunkingPolicy"),
                                               xmlWriter);
                                        } if (localClientBusinessLogicAppliedTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "clientBusinessLogicApplied", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientBusinessLogicApplied cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientBusinessLogicApplied));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEpnySessionTokenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "epnySessionToken", xmlWriter);
                             

                                          if (localEpnySessionToken==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("epnySessionToken cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEpnySessionToken);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLocaleTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "locale", xmlWriter);
                             

                                          if (localLocale==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLocale);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxCountTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "maxCount", xmlWriter);
                             
                                               if (localMaxCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("maxCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestLanguageCodeTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "requestLanguageCode", xmlWriter);
                             
                                               if (localRequestLanguageCode==java.lang.Short.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("requestLanguageCode cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestLanguageCode));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestResellerVersionIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "requestResellerVersionId", xmlWriter);
                             
                                               if (localRequestResellerVersionId==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("requestResellerVersionId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestResellerVersionId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestServiceVersionIdTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "requestServiceVersionId", xmlWriter);
                             
                                               if (localRequestServiceVersionId==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("requestServiceVersionId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestServiceVersionId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResponseLogEnabledTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "responseLogEnabled", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("responseLogEnabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseLogEnabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResponseLogLevelTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "responseLogLevel", xmlWriter);
                             
                                               if (localResponseLogLevel==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("responseLogLevel cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseLogLevel));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecurityTokenTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "securityToken", xmlWriter);
                             

                                          if (localSecurityToken==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("securityToken cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecurityToken);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUniqueClientIDTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "uniqueClientID", xmlWriter);
                             

                                          if (localUniqueClientID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("uniqueClientID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUniqueClientID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "";
                                    writeStartElement(null, namespace, "unmaskValueSelected", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("unmaskValueSelected cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUnmaskValueSelected));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "";
                                    writeStartElement(null, namespace, "userIdName", xmlWriter);
                             

                                          if (localUserIdName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("userIdName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserIdName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localSubscriberIdTracker){
                                            if (localSubscriberId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("subscriberId cannot be null!!");
                                            }
                                           localSubscriberId.serialize(new javax.xml.namespace.QName("","subscriberId"),
                                               xmlWriter);
                                        } if (localNewSelectiveOfferIdListTracker){
                             if (localNewSelectiveOfferIdList!=null) {
                                   namespace = "";
                                   for (int i = 0;i < localNewSelectiveOfferIdList.length;i++){
                                        
                                            if (localNewSelectiveOfferIdList[i] != null){
                                        
                                                writeStartElement(null, namespace, "newSelectiveOfferIdList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewSelectiveOfferIdList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "";
                                                            writeStartElement(null, namespace, "newSelectiveOfferIdList", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "", "newSelectiveOfferIdList", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localNewOptionalOfferIdListTracker){
                             if (localNewOptionalOfferIdList!=null) {
                                   namespace = "";
                                   for (int i = 0;i < localNewOptionalOfferIdList.length;i++){
                                        
                                            if (localNewOptionalOfferIdList[i] != null){
                                        
                                                writeStartElement(null, namespace, "newOptionalOfferIdList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewOptionalOfferIdList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "";
                                                            writeStartElement(null, namespace, "newOptionalOfferIdList", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "", "newOptionalOfferIdList", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localNewSupplementaryOfferIdListTracker){
                             if (localNewSupplementaryOfferIdList!=null) {
                                   namespace = "";
                                   for (int i = 0;i < localNewSupplementaryOfferIdList.length;i++){
                                        
                                            if (localNewSupplementaryOfferIdList[i] != null){
                                        
                                                writeStartElement(null, namespace, "newSupplementaryOfferIdList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewSupplementaryOfferIdList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "";
                                                            writeStartElement(null, namespace, "newSupplementaryOfferIdList", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "", "newSupplementaryOfferIdList", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localSubscriberExternalIdListTracker){
                                       if (localSubscriberExternalIdList!=null){
                                            for (int i = 0;i < localSubscriberExternalIdList.length;i++){
                                                if (localSubscriberExternalIdList[i] != null){
                                                 localSubscriberExternalIdList[i].serialize(new javax.xml.namespace.QName("","subscriberExternalIdList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "subscriberExternalIdList", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "subscriberExternalIdList", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localEffectiveDateTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "effectiveDate", xmlWriter);
                             

                                          if (localEffectiveDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("effectiveDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWaiveActivationTracker){
                                    namespace = "";
                                    writeStartElement(null, namespace, "waiveActivation", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("waiveActivation cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWaiveActivation));
                                               }
                                    
                                   xmlWriter.writeEndElement();
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","SubscriberAddOfferInstanceInputMessage"));
                 if (localCustomerVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "customerVersion"));
                                 
                                        if (localCustomerVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustomerVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("customerVersion cannot be null!!");
                                        }
                                    } if (localMessageIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "messageId"));
                                 
                                        if (localMessageId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("messageId cannot be null!!");
                                        }
                                    } if (localProductVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "productVersion"));
                                 
                                        if (localProductVersion != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProductVersion));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("productVersion cannot be null!!");
                                        }
                                    } if (localServerIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "serverId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerId));
                            } if (localMessageBaseChoice_type0Tracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.comverse.com",
                                                                      "messageBaseChoice_type0"));
                            
                            
                                    if (localMessageBaseChoice_type0==null){
                                         throw new org.apache.axis2.databinding.ADBException("messageBaseChoice_type0 cannot be null!!");
                                    }
                                    elementList.add(localMessageBaseChoice_type0);
                                } if (localBatchIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "batchId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBatchId));
                            } if (localBlockSizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "blockSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBlockSize));
                            } if (localCaseInteractionIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "caseInteractionId"));
                                 
                                        if (localCaseInteractionId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCaseInteractionId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("caseInteractionId cannot be null!!");
                                        }
                                    } if (localCentralLogTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "centralLog"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCentralLog));
                            } if (localChunkingIndexTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "chunkingIndex"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChunkingIndex));
                            } if (localChunkingPolicyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "chunkingPolicy"));
                            
                            
                                    if (localChunkingPolicy==null){
                                         throw new org.apache.axis2.databinding.ADBException("chunkingPolicy cannot be null!!");
                                    }
                                    elementList.add(localChunkingPolicy);
                                } if (localClientBusinessLogicAppliedTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "clientBusinessLogicApplied"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientBusinessLogicApplied));
                            } if (localEpnySessionTokenTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "epnySessionToken"));
                                 
                                        if (localEpnySessionToken != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEpnySessionToken));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("epnySessionToken cannot be null!!");
                                        }
                                    } if (localLocaleTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "locale"));
                                 
                                        if (localLocale != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
                                        }
                                    } if (localMaxCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "maxCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxCount));
                            } if (localRequestLanguageCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "requestLanguageCode"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestLanguageCode));
                            } if (localRequestResellerVersionIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "requestResellerVersionId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestResellerVersionId));
                            } if (localRequestServiceVersionIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "requestServiceVersionId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestServiceVersionId));
                            } if (localResponseLogEnabledTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "responseLogEnabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseLogEnabled));
                            } if (localResponseLogLevelTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "responseLogLevel"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseLogLevel));
                            } if (localSecurityTokenTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "securityToken"));
                                 
                                        if (localSecurityToken != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecurityToken));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("securityToken cannot be null!!");
                                        }
                                    } if (localUniqueClientIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "uniqueClientID"));
                                 
                                        if (localUniqueClientID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUniqueClientID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("uniqueClientID cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "unmaskValueSelected"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUnmaskValueSelected));
                            
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "userIdName"));
                                 
                                        if (localUserIdName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserIdName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("userIdName cannot be null!!");
                                        }
                                     if (localSubscriberIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subscriberId"));
                            
                            
                                    if (localSubscriberId==null){
                                         throw new org.apache.axis2.databinding.ADBException("subscriberId cannot be null!!");
                                    }
                                    elementList.add(localSubscriberId);
                                } if (localNewSelectiveOfferIdListTracker){
                            if (localNewSelectiveOfferIdList!=null){
                                  for (int i = 0;i < localNewSelectiveOfferIdList.length;i++){
                                      
                                         if (localNewSelectiveOfferIdList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("",
                                                                              "newSelectiveOfferIdList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewSelectiveOfferIdList[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("",
                                                                              "newSelectiveOfferIdList"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("",
                                                                              "newSelectiveOfferIdList"));
                                    elementList.add(null);
                                
                            }

                        } if (localNewOptionalOfferIdListTracker){
                            if (localNewOptionalOfferIdList!=null){
                                  for (int i = 0;i < localNewOptionalOfferIdList.length;i++){
                                      
                                         if (localNewOptionalOfferIdList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("",
                                                                              "newOptionalOfferIdList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewOptionalOfferIdList[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("",
                                                                              "newOptionalOfferIdList"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("",
                                                                              "newOptionalOfferIdList"));
                                    elementList.add(null);
                                
                            }

                        } if (localNewSupplementaryOfferIdListTracker){
                            if (localNewSupplementaryOfferIdList!=null){
                                  for (int i = 0;i < localNewSupplementaryOfferIdList.length;i++){
                                      
                                         if (localNewSupplementaryOfferIdList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("",
                                                                              "newSupplementaryOfferIdList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNewSupplementaryOfferIdList[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("",
                                                                              "newSupplementaryOfferIdList"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("",
                                                                              "newSupplementaryOfferIdList"));
                                    elementList.add(null);
                                
                            }

                        } if (localSubscriberExternalIdListTracker){
                             if (localSubscriberExternalIdList!=null) {
                                 for (int i = 0;i < localSubscriberExternalIdList.length;i++){

                                    if (localSubscriberExternalIdList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "subscriberExternalIdList"));
                                         elementList.add(localSubscriberExternalIdList[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "subscriberExternalIdList"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "subscriberExternalIdList"));
                                        elementList.add(localSubscriberExternalIdList);
                                    
                             }

                        } if (localEffectiveDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "effectiveDate"));
                                 
                                        if (localEffectiveDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEffectiveDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("effectiveDate cannot be null!!");
                                        }
                                    } if (localWaiveActivationTracker){
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "waiveActivation"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWaiveActivation));
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
        public static SubscriberAddOfferInstanceInputMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SubscriberAddOfferInstanceInputMessage object =
                new SubscriberAddOfferInstanceInputMessage();

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
                    
                            if (!"SubscriberAddOfferInstanceInputMessage".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SubscriberAddOfferInstanceInputMessage)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list26 = new java.util.ArrayList();
                    
                        java.util.ArrayList list27 = new java.util.ArrayList();
                    
                        java.util.ArrayList list28 = new java.util.ArrayList();
                    
                        java.util.ArrayList list29 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","customerVersion").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"customerVersion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCustomerVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","messageId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"messageId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMessageId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","productVersion").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"productVersion" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProductVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serverId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerId(java.lang.Short.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                        
                                         try{
                                    
                                    if (reader.isStartElement() ){
                                
                                                object.setMessageBaseChoice_type0(com.comverse.www.MessageBaseChoice_type0.Factory.parse(reader));
                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                
                                 } catch (java.lang.Exception e) {}
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","batchId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"batchId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBatchId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBatchId(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","blockSize").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"blockSize" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBlockSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBlockSize(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","caseInteractionId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"caseInteractionId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCaseInteractionId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","centralLog").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"centralLog" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCentralLog(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chunkingIndex").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"chunkingIndex" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChunkingIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setChunkingIndex(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","chunkingPolicy").equals(reader.getName())){
                                
                                                object.setChunkingPolicy(com.comverse.www.ChunkingPolicy.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","clientBusinessLogicApplied").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientBusinessLogicApplied" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientBusinessLogicApplied(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","epnySessionToken").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"epnySessionToken" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEpnySessionToken(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","locale").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"locale" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLocale(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","maxCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"maxCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requestLanguageCode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestLanguageCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestLanguageCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToShort(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRequestLanguageCode(java.lang.Short.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requestResellerVersionId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestResellerVersionId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestResellerVersionId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRequestResellerVersionId(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","requestServiceVersionId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"requestServiceVersionId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestServiceVersionId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRequestServiceVersionId(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","responseLogEnabled").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"responseLogEnabled" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponseLogEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","responseLogLevel").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"responseLogLevel" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponseLogLevel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setResponseLogLevel(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","securityToken").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"securityToken" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecurityToken(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","uniqueClientID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"uniqueClientID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUniqueClientID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","unmaskValueSelected").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"unmaskValueSelected" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUnmaskValueSelected(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","userIdName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"userIdName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserIdName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberId").equals(reader.getName())){
                                
                                                object.setSubscriberId(com.comverse.www.SubscriberIdentifier.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","newSelectiveOfferIdList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list26.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list26.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone26 = false;
                                            while(!loopDone26){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone26 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("","newSelectiveOfferIdList").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list26.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list26.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone26 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setNewSelectiveOfferIdList((java.lang.String[])
                                                        list26.toArray(new java.lang.String[list26.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","newOptionalOfferIdList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list27.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list27.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone27 = false;
                                            while(!loopDone27){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone27 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("","newOptionalOfferIdList").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list27.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list27.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone27 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setNewOptionalOfferIdList((java.lang.String[])
                                                        list27.toArray(new java.lang.String[list27.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","newSupplementaryOfferIdList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list28.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list28.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone28 = false;
                                            while(!loopDone28){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone28 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("","newSupplementaryOfferIdList").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list28.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list28.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone28 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setNewSupplementaryOfferIdList((java.lang.String[])
                                                        list28.toArray(new java.lang.String[list28.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberExternalIdList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list29.add(null);
                                                              reader.next();
                                                          } else {
                                                        list29.add(com.comverse.www.SubscriberExternalIdObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone29 = false;
                                                        while(!loopDone29){
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
                                                                loopDone29 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","subscriberExternalIdList").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list29.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list29.add(com.comverse.www.SubscriberExternalIdObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone29 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSubscriberExternalIdList((com.comverse.www.SubscriberExternalIdObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.SubscriberExternalIdObject.class,
                                                                list29));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","effectiveDate").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"effectiveDate" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEffectiveDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","waiveActivation").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"waiveActivation" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWaiveActivation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
    