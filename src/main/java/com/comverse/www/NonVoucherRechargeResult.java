
/**
 * NonVoucherRechargeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  NonVoucherRechargeResult bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class NonVoucherRechargeResult extends com.comverse.www.ObjectBase
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = nonVoucherRechargeResult
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;

                           public boolean isErrorCodeSpecified(){
                               return localErrorCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(com.comverse.www.IntegerAttributeJAXBElement param){
                            localErrorCodeTracker = param != null;
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorDescription
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localErrorDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorDescriptionTracker = false ;

                           public boolean isErrorDescriptionSpecified(){
                               return localErrorDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getErrorDescription(){
                               return localErrorDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorDescription
                               */
                               public void setErrorDescription(com.comverse.www.StringAttributeJAXBElement param){
                            localErrorDescriptionTracker = param != null;
                                   
                                            this.localErrorDescription=param;
                                    

                               }
                            

                        /**
                        * field for ChangePrimaryOfferFlag
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localChangePrimaryOfferFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChangePrimaryOfferFlagTracker = false ;

                           public boolean isChangePrimaryOfferFlagSpecified(){
                               return localChangePrimaryOfferFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getChangePrimaryOfferFlag(){
                               return localChangePrimaryOfferFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChangePrimaryOfferFlag
                               */
                               public void setChangePrimaryOfferFlag(com.comverse.www.BooleanAttributeJAXBElement param){
                            localChangePrimaryOfferFlagTracker = param != null;
                                   
                                            this.localChangePrimaryOfferFlag=param;
                                    

                               }
                            

                        /**
                        * field for ChangePrimaryOffer
                        */

                        
                                    protected com.comverse.www.LongAttributeJAXBElement localChangePrimaryOffer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChangePrimaryOfferTracker = false ;

                           public boolean isChangePrimaryOfferSpecified(){
                               return localChangePrimaryOfferTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.LongAttributeJAXBElement
                           */
                           public  com.comverse.www.LongAttributeJAXBElement getChangePrimaryOffer(){
                               return localChangePrimaryOffer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChangePrimaryOffer
                               */
                               public void setChangePrimaryOffer(com.comverse.www.LongAttributeJAXBElement param){
                            localChangePrimaryOfferTracker = param != null;
                                   
                                            this.localChangePrimaryOffer=param;
                                    

                               }
                            

                        /**
                        * field for OrigFaceValue
                        */

                        
                                    protected com.comverse.www.DoubleAttributeJAXBElement localOrigFaceValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrigFaceValueTracker = false ;

                           public boolean isOrigFaceValueSpecified(){
                               return localOrigFaceValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DoubleAttributeJAXBElement
                           */
                           public  com.comverse.www.DoubleAttributeJAXBElement getOrigFaceValue(){
                               return localOrigFaceValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OrigFaceValue
                               */
                               public void setOrigFaceValue(com.comverse.www.DoubleAttributeJAXBElement param){
                            localOrigFaceValueTracker = param != null;
                                   
                                            this.localOrigFaceValue=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyConversionRate
                        */

                        
                                    protected com.comverse.www.DoubleAttributeJAXBElement localCurrencyConversionRate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrencyConversionRateTracker = false ;

                           public boolean isCurrencyConversionRateSpecified(){
                               return localCurrencyConversionRateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DoubleAttributeJAXBElement
                           */
                           public  com.comverse.www.DoubleAttributeJAXBElement getCurrencyConversionRate(){
                               return localCurrencyConversionRate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyConversionRate
                               */
                               public void setCurrencyConversionRate(com.comverse.www.DoubleAttributeJAXBElement param){
                            localCurrencyConversionRateTracker = param != null;
                                   
                                            this.localCurrencyConversionRate=param;
                                    

                               }
                            

                        /**
                        * field for ConvertedFaceValue
                        */

                        
                                    protected com.comverse.www.DoubleAttributeJAXBElement localConvertedFaceValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConvertedFaceValueTracker = false ;

                           public boolean isConvertedFaceValueSpecified(){
                               return localConvertedFaceValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DoubleAttributeJAXBElement
                           */
                           public  com.comverse.www.DoubleAttributeJAXBElement getConvertedFaceValue(){
                               return localConvertedFaceValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConvertedFaceValue
                               */
                               public void setConvertedFaceValue(com.comverse.www.DoubleAttributeJAXBElement param){
                            localConvertedFaceValueTracker = param != null;
                                   
                                            this.localConvertedFaceValue=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryOfferChangeStatus
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localPrimaryOfferChangeStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryOfferChangeStatusTracker = false ;

                           public boolean isPrimaryOfferChangeStatusSpecified(){
                               return localPrimaryOfferChangeStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getPrimaryOfferChangeStatus(){
                               return localPrimaryOfferChangeStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryOfferChangeStatus
                               */
                               public void setPrimaryOfferChangeStatus(com.comverse.www.IntegerAttributeJAXBElement param){
                            localPrimaryOfferChangeStatusTracker = param != null;
                                   
                                            this.localPrimaryOfferChangeStatus=param;
                                    

                               }
                            

                        /**
                        * field for AlcoChangeStatus
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localAlcoChangeStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAlcoChangeStatusTracker = false ;

                           public boolean isAlcoChangeStatusSpecified(){
                               return localAlcoChangeStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getAlcoChangeStatus(){
                               return localAlcoChangeStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AlcoChangeStatus
                               */
                               public void setAlcoChangeStatus(com.comverse.www.IntegerAttributeJAXBElement param){
                            localAlcoChangeStatusTracker = param != null;
                                   
                                            this.localAlcoChangeStatus=param;
                                    

                               }
                            

                        /**
                        * field for VoucherIsoCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localVoucherIsoCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVoucherIsoCodeTracker = false ;

                           public boolean isVoucherIsoCodeSpecified(){
                               return localVoucherIsoCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getVoucherIsoCode(){
                               return localVoucherIsoCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VoucherIsoCode
                               */
                               public void setVoucherIsoCode(com.comverse.www.StringAttributeJAXBElement param){
                            localVoucherIsoCodeTracker = param != null;
                                   
                                            this.localVoucherIsoCode=param;
                                    

                               }
                            

                        /**
                        * field for RechargeSucceededWithErrors
                        */

                        
                                    protected com.comverse.www.BooleanAttributeJAXBElement localRechargeSucceededWithErrors ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRechargeSucceededWithErrorsTracker = false ;

                           public boolean isRechargeSucceededWithErrorsSpecified(){
                               return localRechargeSucceededWithErrorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BooleanAttributeJAXBElement
                           */
                           public  com.comverse.www.BooleanAttributeJAXBElement getRechargeSucceededWithErrors(){
                               return localRechargeSucceededWithErrors;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RechargeSucceededWithErrors
                               */
                               public void setRechargeSucceededWithErrors(com.comverse.www.BooleanAttributeJAXBElement param){
                            localRechargeSucceededWithErrorsTracker = param != null;
                                   
                                            this.localRechargeSucceededWithErrors=param;
                                    

                               }
                            

                        /**
                        * field for RechargeSucceededWithErrorsCode
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localRechargeSucceededWithErrorsCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRechargeSucceededWithErrorsCodeTracker = false ;

                           public boolean isRechargeSucceededWithErrorsCodeSpecified(){
                               return localRechargeSucceededWithErrorsCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getRechargeSucceededWithErrorsCode(){
                               return localRechargeSucceededWithErrorsCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RechargeSucceededWithErrorsCode
                               */
                               public void setRechargeSucceededWithErrorsCode(com.comverse.www.IntegerAttributeJAXBElement param){
                            localRechargeSucceededWithErrorsCodeTracker = param != null;
                                   
                                            this.localRechargeSucceededWithErrorsCode=param;
                                    

                               }
                            

                        /**
                        * field for RechargeSucceededWithErrorsMessage
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localRechargeSucceededWithErrorsMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRechargeSucceededWithErrorsMessageTracker = false ;

                           public boolean isRechargeSucceededWithErrorsMessageSpecified(){
                               return localRechargeSucceededWithErrorsMessageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getRechargeSucceededWithErrorsMessage(){
                               return localRechargeSucceededWithErrorsMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RechargeSucceededWithErrorsMessage
                               */
                               public void setRechargeSucceededWithErrorsMessage(com.comverse.www.StringAttributeJAXBElement param){
                            localRechargeSucceededWithErrorsMessageTracker = param != null;
                                   
                                            this.localRechargeSucceededWithErrorsMessage=param;
                                    

                               }
                            

                        /**
                        * field for TransactionCode
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localTransactionCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionCodeTracker = false ;

                           public boolean isTransactionCodeSpecified(){
                               return localTransactionCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getTransactionCode(){
                               return localTransactionCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionCode
                               */
                               public void setTransactionCode(com.comverse.www.StringAttributeJAXBElement param){
                            localTransactionCodeTracker = param != null;
                                   
                                            this.localTransactionCode=param;
                                    

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
                           namespacePrefix+":nonVoucherRechargeResult",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "nonVoucherRechargeResult",
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
                              if (localErrorCodeTracker){
                                            if (localErrorCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("errorCode cannot be null!!");
                                            }
                                           localErrorCode.serialize(new javax.xml.namespace.QName("","errorCode"),
                                               xmlWriter);
                                        } if (localErrorDescriptionTracker){
                                            if (localErrorDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("errorDescription cannot be null!!");
                                            }
                                           localErrorDescription.serialize(new javax.xml.namespace.QName("","errorDescription"),
                                               xmlWriter);
                                        } if (localChangePrimaryOfferFlagTracker){
                                            if (localChangePrimaryOfferFlag==null){
                                                 throw new org.apache.axis2.databinding.ADBException("changePrimaryOfferFlag cannot be null!!");
                                            }
                                           localChangePrimaryOfferFlag.serialize(new javax.xml.namespace.QName("","changePrimaryOfferFlag"),
                                               xmlWriter);
                                        } if (localChangePrimaryOfferTracker){
                                            if (localChangePrimaryOffer==null){
                                                 throw new org.apache.axis2.databinding.ADBException("changePrimaryOffer cannot be null!!");
                                            }
                                           localChangePrimaryOffer.serialize(new javax.xml.namespace.QName("","changePrimaryOffer"),
                                               xmlWriter);
                                        } if (localOrigFaceValueTracker){
                                            if (localOrigFaceValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("origFaceValue cannot be null!!");
                                            }
                                           localOrigFaceValue.serialize(new javax.xml.namespace.QName("","origFaceValue"),
                                               xmlWriter);
                                        } if (localCurrencyConversionRateTracker){
                                            if (localCurrencyConversionRate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyConversionRate cannot be null!!");
                                            }
                                           localCurrencyConversionRate.serialize(new javax.xml.namespace.QName("","currencyConversionRate"),
                                               xmlWriter);
                                        } if (localConvertedFaceValueTracker){
                                            if (localConvertedFaceValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("convertedFaceValue cannot be null!!");
                                            }
                                           localConvertedFaceValue.serialize(new javax.xml.namespace.QName("","convertedFaceValue"),
                                               xmlWriter);
                                        } if (localPrimaryOfferChangeStatusTracker){
                                            if (localPrimaryOfferChangeStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("primaryOfferChangeStatus cannot be null!!");
                                            }
                                           localPrimaryOfferChangeStatus.serialize(new javax.xml.namespace.QName("","primaryOfferChangeStatus"),
                                               xmlWriter);
                                        } if (localAlcoChangeStatusTracker){
                                            if (localAlcoChangeStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("alcoChangeStatus cannot be null!!");
                                            }
                                           localAlcoChangeStatus.serialize(new javax.xml.namespace.QName("","alcoChangeStatus"),
                                               xmlWriter);
                                        } if (localVoucherIsoCodeTracker){
                                            if (localVoucherIsoCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("voucherIsoCode cannot be null!!");
                                            }
                                           localVoucherIsoCode.serialize(new javax.xml.namespace.QName("","voucherIsoCode"),
                                               xmlWriter);
                                        } if (localRechargeSucceededWithErrorsTracker){
                                            if (localRechargeSucceededWithErrors==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rechargeSucceededWithErrors cannot be null!!");
                                            }
                                           localRechargeSucceededWithErrors.serialize(new javax.xml.namespace.QName("","rechargeSucceededWithErrors"),
                                               xmlWriter);
                                        } if (localRechargeSucceededWithErrorsCodeTracker){
                                            if (localRechargeSucceededWithErrorsCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rechargeSucceededWithErrorsCode cannot be null!!");
                                            }
                                           localRechargeSucceededWithErrorsCode.serialize(new javax.xml.namespace.QName("","rechargeSucceededWithErrorsCode"),
                                               xmlWriter);
                                        } if (localRechargeSucceededWithErrorsMessageTracker){
                                            if (localRechargeSucceededWithErrorsMessage==null){
                                                 throw new org.apache.axis2.databinding.ADBException("rechargeSucceededWithErrorsMessage cannot be null!!");
                                            }
                                           localRechargeSucceededWithErrorsMessage.serialize(new javax.xml.namespace.QName("","rechargeSucceededWithErrorsMessage"),
                                               xmlWriter);
                                        } if (localTransactionCodeTracker){
                                            if (localTransactionCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("transactionCode cannot be null!!");
                                            }
                                           localTransactionCode.serialize(new javax.xml.namespace.QName("","transactionCode"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","nonVoucherRechargeResult"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localErrorCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "errorCode"));
                            
                            
                                    if (localErrorCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("errorCode cannot be null!!");
                                    }
                                    elementList.add(localErrorCode);
                                } if (localErrorDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "errorDescription"));
                            
                            
                                    if (localErrorDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("errorDescription cannot be null!!");
                                    }
                                    elementList.add(localErrorDescription);
                                } if (localChangePrimaryOfferFlagTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "changePrimaryOfferFlag"));
                            
                            
                                    if (localChangePrimaryOfferFlag==null){
                                         throw new org.apache.axis2.databinding.ADBException("changePrimaryOfferFlag cannot be null!!");
                                    }
                                    elementList.add(localChangePrimaryOfferFlag);
                                } if (localChangePrimaryOfferTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "changePrimaryOffer"));
                            
                            
                                    if (localChangePrimaryOffer==null){
                                         throw new org.apache.axis2.databinding.ADBException("changePrimaryOffer cannot be null!!");
                                    }
                                    elementList.add(localChangePrimaryOffer);
                                } if (localOrigFaceValueTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "origFaceValue"));
                            
                            
                                    if (localOrigFaceValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("origFaceValue cannot be null!!");
                                    }
                                    elementList.add(localOrigFaceValue);
                                } if (localCurrencyConversionRateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyConversionRate"));
                            
                            
                                    if (localCurrencyConversionRate==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyConversionRate cannot be null!!");
                                    }
                                    elementList.add(localCurrencyConversionRate);
                                } if (localConvertedFaceValueTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "convertedFaceValue"));
                            
                            
                                    if (localConvertedFaceValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("convertedFaceValue cannot be null!!");
                                    }
                                    elementList.add(localConvertedFaceValue);
                                } if (localPrimaryOfferChangeStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "primaryOfferChangeStatus"));
                            
                            
                                    if (localPrimaryOfferChangeStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("primaryOfferChangeStatus cannot be null!!");
                                    }
                                    elementList.add(localPrimaryOfferChangeStatus);
                                } if (localAlcoChangeStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "alcoChangeStatus"));
                            
                            
                                    if (localAlcoChangeStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("alcoChangeStatus cannot be null!!");
                                    }
                                    elementList.add(localAlcoChangeStatus);
                                } if (localVoucherIsoCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "voucherIsoCode"));
                            
                            
                                    if (localVoucherIsoCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("voucherIsoCode cannot be null!!");
                                    }
                                    elementList.add(localVoucherIsoCode);
                                } if (localRechargeSucceededWithErrorsTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rechargeSucceededWithErrors"));
                            
                            
                                    if (localRechargeSucceededWithErrors==null){
                                         throw new org.apache.axis2.databinding.ADBException("rechargeSucceededWithErrors cannot be null!!");
                                    }
                                    elementList.add(localRechargeSucceededWithErrors);
                                } if (localRechargeSucceededWithErrorsCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rechargeSucceededWithErrorsCode"));
                            
                            
                                    if (localRechargeSucceededWithErrorsCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("rechargeSucceededWithErrorsCode cannot be null!!");
                                    }
                                    elementList.add(localRechargeSucceededWithErrorsCode);
                                } if (localRechargeSucceededWithErrorsMessageTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rechargeSucceededWithErrorsMessage"));
                            
                            
                                    if (localRechargeSucceededWithErrorsMessage==null){
                                         throw new org.apache.axis2.databinding.ADBException("rechargeSucceededWithErrorsMessage cannot be null!!");
                                    }
                                    elementList.add(localRechargeSucceededWithErrorsMessage);
                                } if (localTransactionCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "transactionCode"));
                            
                            
                                    if (localTransactionCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("transactionCode cannot be null!!");
                                    }
                                    elementList.add(localTransactionCode);
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
        public static NonVoucherRechargeResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            NonVoucherRechargeResult object =
                new NonVoucherRechargeResult();

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
                    
                            if (!"nonVoucherRechargeResult".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (NonVoucherRechargeResult)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","errorCode").equals(reader.getName())){
                                
                                                object.setErrorCode(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","errorDescription").equals(reader.getName())){
                                
                                                object.setErrorDescription(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","changePrimaryOfferFlag").equals(reader.getName())){
                                
                                                object.setChangePrimaryOfferFlag(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","changePrimaryOffer").equals(reader.getName())){
                                
                                                object.setChangePrimaryOffer(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","origFaceValue").equals(reader.getName())){
                                
                                                object.setOrigFaceValue(com.comverse.www.DoubleAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currencyConversionRate").equals(reader.getName())){
                                
                                                object.setCurrencyConversionRate(com.comverse.www.DoubleAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","convertedFaceValue").equals(reader.getName())){
                                
                                                object.setConvertedFaceValue(com.comverse.www.DoubleAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","primaryOfferChangeStatus").equals(reader.getName())){
                                
                                                object.setPrimaryOfferChangeStatus(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","alcoChangeStatus").equals(reader.getName())){
                                
                                                object.setAlcoChangeStatus(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","voucherIsoCode").equals(reader.getName())){
                                
                                                object.setVoucherIsoCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rechargeSucceededWithErrors").equals(reader.getName())){
                                
                                                object.setRechargeSucceededWithErrors(com.comverse.www.BooleanAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rechargeSucceededWithErrorsCode").equals(reader.getName())){
                                
                                                object.setRechargeSucceededWithErrorsCode(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rechargeSucceededWithErrorsMessage").equals(reader.getName())){
                                
                                                object.setRechargeSucceededWithErrorsMessage(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","transactionCode").equals(reader.getName())){
                                
                                                object.setTransactionCode(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    