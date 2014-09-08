
/**
 * ReservationBalanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  ReservationBalanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ReservationBalanceObject extends com.comverse.www.ObjectBase
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = reservationBalanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for BalanceConsumedAmount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalanceConsumedAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceConsumedAmountTracker = false ;

                           public boolean isBalanceConsumedAmountSpecified(){
                               return localBalanceConsumedAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalanceConsumedAmount(){
                               return localBalanceConsumedAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceConsumedAmount
                               */
                               public void setBalanceConsumedAmount(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalanceConsumedAmountTracker = param != null;
                                   
                                            this.localBalanceConsumedAmount=param;
                                    

                               }
                            

                        /**
                        * field for BalanceConsumedDiscount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalanceConsumedDiscount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceConsumedDiscountTracker = false ;

                           public boolean isBalanceConsumedDiscountSpecified(){
                               return localBalanceConsumedDiscountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalanceConsumedDiscount(){
                               return localBalanceConsumedDiscount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceConsumedDiscount
                               */
                               public void setBalanceConsumedDiscount(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalanceConsumedDiscountTracker = param != null;
                                   
                                            this.localBalanceConsumedDiscount=param;
                                    

                               }
                            

                        /**
                        * field for BalanceConsumedTax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalanceConsumedTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceConsumedTaxTracker = false ;

                           public boolean isBalanceConsumedTaxSpecified(){
                               return localBalanceConsumedTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalanceConsumedTax(){
                               return localBalanceConsumedTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceConsumedTax
                               */
                               public void setBalanceConsumedTax(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalanceConsumedTaxTracker = param != null;
                                   
                                            this.localBalanceConsumedTax=param;
                                    

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
                        * field for BalanceReservedAmount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalanceReservedAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceReservedAmountTracker = false ;

                           public boolean isBalanceReservedAmountSpecified(){
                               return localBalanceReservedAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalanceReservedAmount(){
                               return localBalanceReservedAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceReservedAmount
                               */
                               public void setBalanceReservedAmount(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalanceReservedAmountTracker = param != null;
                                   
                                            this.localBalanceReservedAmount=param;
                                    

                               }
                            

                        /**
                        * field for BalanceReservedDiscount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalanceReservedDiscount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceReservedDiscountTracker = false ;

                           public boolean isBalanceReservedDiscountSpecified(){
                               return localBalanceReservedDiscountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalanceReservedDiscount(){
                               return localBalanceReservedDiscount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceReservedDiscount
                               */
                               public void setBalanceReservedDiscount(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalanceReservedDiscountTracker = param != null;
                                   
                                            this.localBalanceReservedDiscount=param;
                                    

                               }
                            

                        /**
                        * field for BalanceReservedTax
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localBalanceReservedTax ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceReservedTaxTracker = false ;

                           public boolean isBalanceReservedTaxSpecified(){
                               return localBalanceReservedTaxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getBalanceReservedTax(){
                               return localBalanceReservedTax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceReservedTax
                               */
                               public void setBalanceReservedTax(com.comverse.www.NumericAttributeJAXBElement param){
                            localBalanceReservedTaxTracker = param != null;
                                   
                                            this.localBalanceReservedTax=param;
                                    

                               }
                            

                        /**
                        * field for TargetAccountBalanceId
                        */

                        
                                    protected com.comverse.www.IntegerAttributeJAXBElement localTargetAccountBalanceId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetAccountBalanceIdTracker = false ;

                           public boolean isTargetAccountBalanceIdSpecified(){
                               return localTargetAccountBalanceIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.IntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.IntegerAttributeJAXBElement getTargetAccountBalanceId(){
                               return localTargetAccountBalanceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetAccountBalanceId
                               */
                               public void setTargetAccountBalanceId(com.comverse.www.IntegerAttributeJAXBElement param){
                            localTargetAccountBalanceIdTracker = true;
                                   
                                            this.localTargetAccountBalanceId=param;
                                    

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
                           namespacePrefix+":reservationBalanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "reservationBalanceObject",
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
                              if (localBalanceConsumedAmountTracker){
                                            if (localBalanceConsumedAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceConsumedAmount cannot be null!!");
                                            }
                                           localBalanceConsumedAmount.serialize(new javax.xml.namespace.QName("","balanceConsumedAmount"),
                                               xmlWriter);
                                        } if (localBalanceConsumedDiscountTracker){
                                            if (localBalanceConsumedDiscount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceConsumedDiscount cannot be null!!");
                                            }
                                           localBalanceConsumedDiscount.serialize(new javax.xml.namespace.QName("","balanceConsumedDiscount"),
                                               xmlWriter);
                                        } if (localBalanceConsumedTaxTracker){
                                            if (localBalanceConsumedTax==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceConsumedTax cannot be null!!");
                                            }
                                           localBalanceConsumedTax.serialize(new javax.xml.namespace.QName("","balanceConsumedTax"),
                                               xmlWriter);
                                        } if (localBalanceIdTracker){
                                            if (localBalanceId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceId cannot be null!!");
                                            }
                                           localBalanceId.serialize(new javax.xml.namespace.QName("","balanceId"),
                                               xmlWriter);
                                        } if (localBalanceReservedAmountTracker){
                                            if (localBalanceReservedAmount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceReservedAmount cannot be null!!");
                                            }
                                           localBalanceReservedAmount.serialize(new javax.xml.namespace.QName("","balanceReservedAmount"),
                                               xmlWriter);
                                        } if (localBalanceReservedDiscountTracker){
                                            if (localBalanceReservedDiscount==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceReservedDiscount cannot be null!!");
                                            }
                                           localBalanceReservedDiscount.serialize(new javax.xml.namespace.QName("","balanceReservedDiscount"),
                                               xmlWriter);
                                        } if (localBalanceReservedTaxTracker){
                                            if (localBalanceReservedTax==null){
                                                 throw new org.apache.axis2.databinding.ADBException("balanceReservedTax cannot be null!!");
                                            }
                                           localBalanceReservedTax.serialize(new javax.xml.namespace.QName("","balanceReservedTax"),
                                               xmlWriter);
                                        } if (localTargetAccountBalanceIdTracker){
                                    if (localTargetAccountBalanceId==null){

                                        writeStartElement(null, "", "targetAccountBalanceId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetAccountBalanceId.serialize(new javax.xml.namespace.QName("","targetAccountBalanceId"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","reservationBalanceObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localBalanceConsumedAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceConsumedAmount"));
                            
                            
                                    if (localBalanceConsumedAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceConsumedAmount cannot be null!!");
                                    }
                                    elementList.add(localBalanceConsumedAmount);
                                } if (localBalanceConsumedDiscountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceConsumedDiscount"));
                            
                            
                                    if (localBalanceConsumedDiscount==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceConsumedDiscount cannot be null!!");
                                    }
                                    elementList.add(localBalanceConsumedDiscount);
                                } if (localBalanceConsumedTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceConsumedTax"));
                            
                            
                                    if (localBalanceConsumedTax==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceConsumedTax cannot be null!!");
                                    }
                                    elementList.add(localBalanceConsumedTax);
                                } if (localBalanceIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceId"));
                            
                            
                                    if (localBalanceId==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceId cannot be null!!");
                                    }
                                    elementList.add(localBalanceId);
                                } if (localBalanceReservedAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceReservedAmount"));
                            
                            
                                    if (localBalanceReservedAmount==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceReservedAmount cannot be null!!");
                                    }
                                    elementList.add(localBalanceReservedAmount);
                                } if (localBalanceReservedDiscountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceReservedDiscount"));
                            
                            
                                    if (localBalanceReservedDiscount==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceReservedDiscount cannot be null!!");
                                    }
                                    elementList.add(localBalanceReservedDiscount);
                                } if (localBalanceReservedTaxTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "balanceReservedTax"));
                            
                            
                                    if (localBalanceReservedTax==null){
                                         throw new org.apache.axis2.databinding.ADBException("balanceReservedTax cannot be null!!");
                                    }
                                    elementList.add(localBalanceReservedTax);
                                } if (localTargetAccountBalanceIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "targetAccountBalanceId"));
                            
                            
                                    elementList.add(localTargetAccountBalanceId==null?null:
                                    localTargetAccountBalanceId);
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
        public static ReservationBalanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ReservationBalanceObject object =
                new ReservationBalanceObject();

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
                    
                            if (!"reservationBalanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ReservationBalanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceConsumedAmount").equals(reader.getName())){
                                
                                                object.setBalanceConsumedAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceConsumedDiscount").equals(reader.getName())){
                                
                                                object.setBalanceConsumedDiscount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceConsumedTax").equals(reader.getName())){
                                
                                                object.setBalanceConsumedTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceReservedAmount").equals(reader.getName())){
                                
                                                object.setBalanceReservedAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceReservedDiscount").equals(reader.getName())){
                                
                                                object.setBalanceReservedDiscount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","balanceReservedTax").equals(reader.getName())){
                                
                                                object.setBalanceReservedTax(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","targetAccountBalanceId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetAccountBalanceId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetAccountBalanceId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    