
/**
 * AccumulatorInstanceObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  AccumulatorInstanceObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AccumulatorInstanceObject extends com.comverse.www.AccumulatorInstanceIdentifier
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = accumulatorInstanceObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Amount
                        */

                        
                                    protected com.comverse.www.NumericAttributeJAXBElement localAmount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmountTracker = false ;

                           public boolean isAmountSpecified(){
                               return localAmountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.NumericAttributeJAXBElement
                           */
                           public  com.comverse.www.NumericAttributeJAXBElement getAmount(){
                               return localAmount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Amount
                               */
                               public void setAmount(com.comverse.www.NumericAttributeJAXBElement param){
                            localAmountTracker = true;
                                   
                                            this.localAmount=param;
                                    

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
                        * field for NextReset
                        */

                        
                                    protected com.comverse.www.DateAttributeJAXBElement localNextReset ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextResetTracker = false ;

                           public boolean isNextResetSpecified(){
                               return localNextResetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.DateAttributeJAXBElement
                           */
                           public  com.comverse.www.DateAttributeJAXBElement getNextReset(){
                               return localNextReset;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextReset
                               */
                               public void setNextReset(com.comverse.www.DateAttributeJAXBElement param){
                            localNextResetTracker = true;
                                   
                                            this.localNextReset=param;
                                    

                               }
                            

                        /**
                        * field for Period
                        */

                        
                                    protected com.comverse.www.BigIntegerAttributeJAXBElement localPeriod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPeriodTracker = false ;

                           public boolean isPeriodSpecified(){
                               return localPeriodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.BigIntegerAttributeJAXBElement
                           */
                           public  com.comverse.www.BigIntegerAttributeJAXBElement getPeriod(){
                               return localPeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Period
                               */
                               public void setPeriod(com.comverse.www.BigIntegerAttributeJAXBElement param){
                            localPeriodTracker = true;
                                   
                                            this.localPeriod=param;
                                    

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
                        * field for ZeroDay
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localZeroDay ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localZeroDayTracker = false ;

                           public boolean isZeroDaySpecified(){
                               return localZeroDayTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getZeroDay(){
                               return localZeroDay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ZeroDay
                               */
                               public void setZeroDay(com.comverse.www.ShortAttributeJAXBElement param){
                            localZeroDayTracker = param != null;
                                   
                                            this.localZeroDay=param;
                                    

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
                           namespacePrefix+":accumulatorInstanceObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "accumulatorInstanceObject",
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
                                        } if (localAccumulatorIDTracker){
                                    if (localAccumulatorID==null){

                                        writeStartElement(null, "", "accumulatorID", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccumulatorID.serialize(new javax.xml.namespace.QName("","accumulatorID"),
                                        xmlWriter);
                                    }
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
                                        } if (localAmountTracker){
                                    if (localAmount==null){

                                        writeStartElement(null, "", "amount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAmount.serialize(new javax.xml.namespace.QName("","amount"),
                                        xmlWriter);
                                    }
                                } if (localCurrencyCodeTracker){
                                            if (localCurrencyCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                            }
                                           localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                               xmlWriter);
                                        } if (localNextResetTracker){
                                    if (localNextReset==null){

                                        writeStartElement(null, "", "nextReset", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNextReset.serialize(new javax.xml.namespace.QName("","nextReset"),
                                        xmlWriter);
                                    }
                                } if (localPeriodTracker){
                                    if (localPeriod==null){

                                        writeStartElement(null, "", "period", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPeriod.serialize(new javax.xml.namespace.QName("","period"),
                                        xmlWriter);
                                    }
                                } if (localUnitTypeTracker){
                                            if (localUnitType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("unitType cannot be null!!");
                                            }
                                           localUnitType.serialize(new javax.xml.namespace.QName("","unitType"),
                                               xmlWriter);
                                        } if (localZeroDayTracker){
                                            if (localZeroDay==null){
                                                 throw new org.apache.axis2.databinding.ADBException("zeroDay cannot be null!!");
                                            }
                                           localZeroDay.serialize(new javax.xml.namespace.QName("","zeroDay"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","accumulatorInstanceObject"));
                
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
                                } if (localAccumulatorIDTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "accumulatorID"));
                            
                            
                                    elementList.add(localAccumulatorID==null?null:
                                    localAccumulatorID);
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
                                } if (localAmountTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "amount"));
                            
                            
                                    elementList.add(localAmount==null?null:
                                    localAmount);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    if (localCurrencyCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                    }
                                    elementList.add(localCurrencyCode);
                                } if (localNextResetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextReset"));
                            
                            
                                    elementList.add(localNextReset==null?null:
                                    localNextReset);
                                } if (localPeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "period"));
                            
                            
                                    elementList.add(localPeriod==null?null:
                                    localPeriod);
                                } if (localUnitTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "unitType"));
                            
                            
                                    if (localUnitType==null){
                                         throw new org.apache.axis2.databinding.ADBException("unitType cannot be null!!");
                                    }
                                    elementList.add(localUnitType);
                                } if (localZeroDayTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "zeroDay"));
                            
                            
                                    if (localZeroDay==null){
                                         throw new org.apache.axis2.databinding.ADBException("zeroDay cannot be null!!");
                                    }
                                    elementList.add(localZeroDay);
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
        public static AccumulatorInstanceObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AccumulatorInstanceObject object =
                new AccumulatorInstanceObject();

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
                    
                            if (!"accumulatorInstanceObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AccumulatorInstanceObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accumulatorID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccumulatorID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccumulatorID(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","amount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAmount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAmount(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","nextReset").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNextReset(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNextReset(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","period").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPeriod(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPeriod(com.comverse.www.BigIntegerAttributeJAXBElement.Factory.parse(reader));
                                              
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
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","zeroDay").equals(reader.getName())){
                                
                                                object.setZeroDay(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    