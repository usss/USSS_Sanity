
/**
 * AbstractRequestMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  AbstractRequestMessage bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public abstract class AbstractRequestMessage extends com.comverse.www.MessageBase
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = abstractRequestMessage
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for BatchId
                        */

                        
                                    protected long localBatchId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBatchIdTracker = false ;

                           public boolean isBatchIdSpecified(){
                               return localBatchIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBatchId(){
                               return localBatchId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BatchId
                               */
                               public void setBatchId(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localBatchIdTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localBatchId=param;
                                    

                               }
                            

                        /**
                        * field for BlockSize
                        */

                        
                                    protected int localBlockSize ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBlockSizeTracker = false ;

                           public boolean isBlockSizeSpecified(){
                               return localBlockSizeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBlockSize(){
                               return localBlockSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockSize
                               */
                               public void setBlockSize(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localBlockSizeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localBlockSize=param;
                                    

                               }
                            

                        /**
                        * field for CaseInteractionId
                        */

                        
                                    protected java.lang.String localCaseInteractionId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCaseInteractionIdTracker = false ;

                           public boolean isCaseInteractionIdSpecified(){
                               return localCaseInteractionIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCaseInteractionId(){
                               return localCaseInteractionId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CaseInteractionId
                               */
                               public void setCaseInteractionId(java.lang.String param){
                            localCaseInteractionIdTracker = param != null;
                                   
                                            this.localCaseInteractionId=param;
                                    

                               }
                            

                        /**
                        * field for CentralLog
                        */

                        
                                    protected boolean localCentralLog ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCentralLogTracker = false ;

                           public boolean isCentralLogSpecified(){
                               return localCentralLogTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCentralLog(){
                               return localCentralLog;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CentralLog
                               */
                               public void setCentralLog(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localCentralLogTracker =
                                       true;
                                   
                                            this.localCentralLog=param;
                                    

                               }
                            

                        /**
                        * field for ChunkingIndex
                        */

                        
                                    protected int localChunkingIndex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChunkingIndexTracker = false ;

                           public boolean isChunkingIndexSpecified(){
                               return localChunkingIndexTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getChunkingIndex(){
                               return localChunkingIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChunkingIndex
                               */
                               public void setChunkingIndex(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localChunkingIndexTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localChunkingIndex=param;
                                    

                               }
                            

                        /**
                        * field for ChunkingPolicy
                        */

                        
                                    protected com.comverse.www.ChunkingPolicy localChunkingPolicy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChunkingPolicyTracker = false ;

                           public boolean isChunkingPolicySpecified(){
                               return localChunkingPolicyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ChunkingPolicy
                           */
                           public  com.comverse.www.ChunkingPolicy getChunkingPolicy(){
                               return localChunkingPolicy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChunkingPolicy
                               */
                               public void setChunkingPolicy(com.comverse.www.ChunkingPolicy param){
                            localChunkingPolicyTracker = param != null;
                                   
                                            this.localChunkingPolicy=param;
                                    

                               }
                            

                        /**
                        * field for ClientBusinessLogicApplied
                        */

                        
                                    protected boolean localClientBusinessLogicApplied ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientBusinessLogicAppliedTracker = false ;

                           public boolean isClientBusinessLogicAppliedSpecified(){
                               return localClientBusinessLogicAppliedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getClientBusinessLogicApplied(){
                               return localClientBusinessLogicApplied;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientBusinessLogicApplied
                               */
                               public void setClientBusinessLogicApplied(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientBusinessLogicAppliedTracker =
                                       true;
                                   
                                            this.localClientBusinessLogicApplied=param;
                                    

                               }
                            

                        /**
                        * field for EpnySessionToken
                        */

                        
                                    protected java.lang.String localEpnySessionToken ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEpnySessionTokenTracker = false ;

                           public boolean isEpnySessionTokenSpecified(){
                               return localEpnySessionTokenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEpnySessionToken(){
                               return localEpnySessionToken;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EpnySessionToken
                               */
                               public void setEpnySessionToken(java.lang.String param){
                            localEpnySessionTokenTracker = param != null;
                                   
                                            this.localEpnySessionToken=param;
                                    

                               }
                            

                        /**
                        * field for Locale
                        */

                        
                                    protected java.lang.String localLocale ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocaleTracker = false ;

                           public boolean isLocaleSpecified(){
                               return localLocaleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLocale(){
                               return localLocale;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Locale
                               */
                               public void setLocale(java.lang.String param){
                            localLocaleTracker = param != null;
                                   
                                            this.localLocale=param;
                                    

                               }
                            

                        /**
                        * field for MaxCount
                        */

                        
                                    protected int localMaxCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxCountTracker = false ;

                           public boolean isMaxCountSpecified(){
                               return localMaxCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaxCount(){
                               return localMaxCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxCount
                               */
                               public void setMaxCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMaxCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMaxCount=param;
                                    

                               }
                            

                        /**
                        * field for RequestLanguageCode
                        */

                        
                                    protected short localRequestLanguageCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestLanguageCodeTracker = false ;

                           public boolean isRequestLanguageCodeSpecified(){
                               return localRequestLanguageCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return short
                           */
                           public  short getRequestLanguageCode(){
                               return localRequestLanguageCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestLanguageCode
                               */
                               public void setRequestLanguageCode(short param){
                            
                                       // setting primitive attribute tracker to true
                                       localRequestLanguageCodeTracker =
                                       param != java.lang.Short.MIN_VALUE;
                                   
                                            this.localRequestLanguageCode=param;
                                    

                               }
                            

                        /**
                        * field for RequestResellerVersionId
                        */

                        
                                    protected long localRequestResellerVersionId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestResellerVersionIdTracker = false ;

                           public boolean isRequestResellerVersionIdSpecified(){
                               return localRequestResellerVersionIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRequestResellerVersionId(){
                               return localRequestResellerVersionId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestResellerVersionId
                               */
                               public void setRequestResellerVersionId(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localRequestResellerVersionIdTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localRequestResellerVersionId=param;
                                    

                               }
                            

                        /**
                        * field for RequestServiceVersionId
                        */

                        
                                    protected long localRequestServiceVersionId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestServiceVersionIdTracker = false ;

                           public boolean isRequestServiceVersionIdSpecified(){
                               return localRequestServiceVersionIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRequestServiceVersionId(){
                               return localRequestServiceVersionId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestServiceVersionId
                               */
                               public void setRequestServiceVersionId(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localRequestServiceVersionIdTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localRequestServiceVersionId=param;
                                    

                               }
                            

                        /**
                        * field for ResponseLogEnabled
                        */

                        
                                    protected boolean localResponseLogEnabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseLogEnabledTracker = false ;

                           public boolean isResponseLogEnabledSpecified(){
                               return localResponseLogEnabledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getResponseLogEnabled(){
                               return localResponseLogEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseLogEnabled
                               */
                               public void setResponseLogEnabled(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localResponseLogEnabledTracker =
                                       true;
                                   
                                            this.localResponseLogEnabled=param;
                                    

                               }
                            

                        /**
                        * field for ResponseLogLevel
                        */

                        
                                    protected int localResponseLogLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseLogLevelTracker = false ;

                           public boolean isResponseLogLevelSpecified(){
                               return localResponseLogLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResponseLogLevel(){
                               return localResponseLogLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseLogLevel
                               */
                               public void setResponseLogLevel(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localResponseLogLevelTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localResponseLogLevel=param;
                                    

                               }
                            

                        /**
                        * field for SecurityToken
                        */

                        
                                    protected java.lang.String localSecurityToken ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecurityTokenTracker = false ;

                           public boolean isSecurityTokenSpecified(){
                               return localSecurityTokenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecurityToken(){
                               return localSecurityToken;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecurityToken
                               */
                               public void setSecurityToken(java.lang.String param){
                            localSecurityTokenTracker = param != null;
                                   
                                            this.localSecurityToken=param;
                                    

                               }
                            

                        /**
                        * field for UniqueClientID
                        */

                        
                                    protected java.lang.String localUniqueClientID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUniqueClientIDTracker = false ;

                           public boolean isUniqueClientIDSpecified(){
                               return localUniqueClientIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUniqueClientID(){
                               return localUniqueClientID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UniqueClientID
                               */
                               public void setUniqueClientID(java.lang.String param){
                            localUniqueClientIDTracker = param != null;
                                   
                                            this.localUniqueClientID=param;
                                    

                               }
                            

                        /**
                        * field for UnmaskValueSelected
                        */

                        
                                    protected boolean localUnmaskValueSelected ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUnmaskValueSelected(){
                               return localUnmaskValueSelected;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnmaskValueSelected
                               */
                               public void setUnmaskValueSelected(boolean param){
                            
                                            this.localUnmaskValueSelected=param;
                                    

                               }
                            

                        /**
                        * field for UserIdName
                        */

                        
                                    protected java.lang.String localUserIdName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserIdName(){
                               return localUserIdName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserIdName
                               */
                               public void setUserIdName(java.lang.String param){
                            
                                            this.localUserIdName=param;
                                    

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
                           namespacePrefix+":abstractRequestMessage",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "abstractRequestMessage",
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","abstractRequestMessage"));
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
        public static AbstractRequestMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AbstractRequestMessage object =
                null;

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
                    
                            if (!"abstractRequestMessage".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AbstractRequestMessage)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        
                        throw new org.apache.axis2.databinding.ADBException("The an abstract class can not be instantiated !!!");
                    

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
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
           
    