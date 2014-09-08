
/**
 * AccumulatorLiteInfoObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  AccumulatorLiteInfoObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AccumulatorLiteInfoObject extends com.comverse.www.ObjectBase
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = accumulatorLiteInfoObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for DisplayValue
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localDisplayValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDisplayValueTracker = false ;

                           public boolean isDisplayValueSpecified(){
                               return localDisplayValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getDisplayValue(){
                               return localDisplayValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayValue
                               */
                               public void setDisplayValue(com.comverse.www.StringAttributeJAXBElement param){
                            localDisplayValueTracker = param != null;
                                   
                                            this.localDisplayValue=param;
                                    

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
                        * field for Period
                        */

                        
                                    protected com.comverse.www.ShortAttributeJAXBElement localPeriod ;
                                
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
                           * @return com.comverse.www.ShortAttributeJAXBElement
                           */
                           public  com.comverse.www.ShortAttributeJAXBElement getPeriod(){
                               return localPeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Period
                               */
                               public void setPeriod(com.comverse.www.ShortAttributeJAXBElement param){
                            localPeriodTracker = param != null;
                                   
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
                        * field for UnitTypeDisplayValue
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localUnitTypeDisplayValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUnitTypeDisplayValueTracker = false ;

                           public boolean isUnitTypeDisplayValueSpecified(){
                               return localUnitTypeDisplayValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getUnitTypeDisplayValue(){
                               return localUnitTypeDisplayValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnitTypeDisplayValue
                               */
                               public void setUnitTypeDisplayValue(com.comverse.www.StringAttributeJAXBElement param){
                            localUnitTypeDisplayValueTracker = param != null;
                                   
                                            this.localUnitTypeDisplayValue=param;
                                    

                               }
                            

                        /**
                        * field for PeriodDisplayValue
                        */

                        
                                    protected com.comverse.www.StringAttributeJAXBElement localPeriodDisplayValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPeriodDisplayValueTracker = false ;

                           public boolean isPeriodDisplayValueSpecified(){
                               return localPeriodDisplayValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.StringAttributeJAXBElement
                           */
                           public  com.comverse.www.StringAttributeJAXBElement getPeriodDisplayValue(){
                               return localPeriodDisplayValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PeriodDisplayValue
                               */
                               public void setPeriodDisplayValue(com.comverse.www.StringAttributeJAXBElement param){
                            localPeriodDisplayValueTracker = param != null;
                                   
                                            this.localPeriodDisplayValue=param;
                                    

                               }
                            

                        /**
                        * field for AccumulatorDiscountInfoList
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.AccumulatorDiscountInfoObject[] localAccumulatorDiscountInfoList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccumulatorDiscountInfoListTracker = false ;

                           public boolean isAccumulatorDiscountInfoListSpecified(){
                               return localAccumulatorDiscountInfoListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.AccumulatorDiscountInfoObject[]
                           */
                           public  com.comverse.www.AccumulatorDiscountInfoObject[] getAccumulatorDiscountInfoList(){
                               return localAccumulatorDiscountInfoList;
                           }

                           
                        


                               
                              /**
                               * validate the array for AccumulatorDiscountInfoList
                               */
                              protected void validateAccumulatorDiscountInfoList(com.comverse.www.AccumulatorDiscountInfoObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AccumulatorDiscountInfoList
                              */
                              public void setAccumulatorDiscountInfoList(com.comverse.www.AccumulatorDiscountInfoObject[] param){
                              
                                   validateAccumulatorDiscountInfoList(param);

                               localAccumulatorDiscountInfoListTracker = true;
                                      
                                      this.localAccumulatorDiscountInfoList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.AccumulatorDiscountInfoObject
                             */
                             public void addAccumulatorDiscountInfoList(com.comverse.www.AccumulatorDiscountInfoObject param){
                                   if (localAccumulatorDiscountInfoList == null){
                                   localAccumulatorDiscountInfoList = new com.comverse.www.AccumulatorDiscountInfoObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localAccumulatorDiscountInfoListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAccumulatorDiscountInfoList);
                               list.add(param);
                               this.localAccumulatorDiscountInfoList =
                             (com.comverse.www.AccumulatorDiscountInfoObject[])list.toArray(
                            new com.comverse.www.AccumulatorDiscountInfoObject[list.size()]);

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
                           namespacePrefix+":accumulatorLiteInfoObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "accumulatorLiteInfoObject",
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
                              if (localDisplayValueTracker){
                                            if (localDisplayValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("displayValue cannot be null!!");
                                            }
                                           localDisplayValue.serialize(new javax.xml.namespace.QName("","displayValue"),
                                               xmlWriter);
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
                                } if (localPeriodTracker){
                                            if (localPeriod==null){
                                                 throw new org.apache.axis2.databinding.ADBException("period cannot be null!!");
                                            }
                                           localPeriod.serialize(new javax.xml.namespace.QName("","period"),
                                               xmlWriter);
                                        } if (localUnitTypeTracker){
                                            if (localUnitType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("unitType cannot be null!!");
                                            }
                                           localUnitType.serialize(new javax.xml.namespace.QName("","unitType"),
                                               xmlWriter);
                                        } if (localUnitTypeDisplayValueTracker){
                                            if (localUnitTypeDisplayValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("unitTypeDisplayValue cannot be null!!");
                                            }
                                           localUnitTypeDisplayValue.serialize(new javax.xml.namespace.QName("","unitTypeDisplayValue"),
                                               xmlWriter);
                                        } if (localPeriodDisplayValueTracker){
                                            if (localPeriodDisplayValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("periodDisplayValue cannot be null!!");
                                            }
                                           localPeriodDisplayValue.serialize(new javax.xml.namespace.QName("","periodDisplayValue"),
                                               xmlWriter);
                                        } if (localAccumulatorDiscountInfoListTracker){
                                       if (localAccumulatorDiscountInfoList!=null){
                                            for (int i = 0;i < localAccumulatorDiscountInfoList.length;i++){
                                                if (localAccumulatorDiscountInfoList[i] != null){
                                                 localAccumulatorDiscountInfoList[i].serialize(new javax.xml.namespace.QName("","accumulatorDiscountInfoList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "accumulatorDiscountInfoList", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "accumulatorDiscountInfoList", xmlWriter);

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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","accumulatorLiteInfoObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localDisplayValueTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "displayValue"));
                            
                            
                                    if (localDisplayValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("displayValue cannot be null!!");
                                    }
                                    elementList.add(localDisplayValue);
                                } if (localNextResetDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "nextResetDate"));
                            
                            
                                    elementList.add(localNextResetDate==null?null:
                                    localNextResetDate);
                                } if (localPeriodTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "period"));
                            
                            
                                    if (localPeriod==null){
                                         throw new org.apache.axis2.databinding.ADBException("period cannot be null!!");
                                    }
                                    elementList.add(localPeriod);
                                } if (localUnitTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "unitType"));
                            
                            
                                    if (localUnitType==null){
                                         throw new org.apache.axis2.databinding.ADBException("unitType cannot be null!!");
                                    }
                                    elementList.add(localUnitType);
                                } if (localUnitTypeDisplayValueTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "unitTypeDisplayValue"));
                            
                            
                                    if (localUnitTypeDisplayValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("unitTypeDisplayValue cannot be null!!");
                                    }
                                    elementList.add(localUnitTypeDisplayValue);
                                } if (localPeriodDisplayValueTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "periodDisplayValue"));
                            
                            
                                    if (localPeriodDisplayValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("periodDisplayValue cannot be null!!");
                                    }
                                    elementList.add(localPeriodDisplayValue);
                                } if (localAccumulatorDiscountInfoListTracker){
                             if (localAccumulatorDiscountInfoList!=null) {
                                 for (int i = 0;i < localAccumulatorDiscountInfoList.length;i++){

                                    if (localAccumulatorDiscountInfoList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulatorDiscountInfoList"));
                                         elementList.add(localAccumulatorDiscountInfoList[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulatorDiscountInfoList"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulatorDiscountInfoList"));
                                        elementList.add(localAccumulatorDiscountInfoList);
                                    
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
        public static AccumulatorLiteInfoObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AccumulatorLiteInfoObject object =
                new AccumulatorLiteInfoObject();

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
                    
                            if (!"accumulatorLiteInfoObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AccumulatorLiteInfoObject)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","displayValue").equals(reader.getName())){
                                
                                                object.setDisplayValue(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","period").equals(reader.getName())){
                                
                                                object.setPeriod(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","unitTypeDisplayValue").equals(reader.getName())){
                                
                                                object.setUnitTypeDisplayValue(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","periodDisplayValue").equals(reader.getName())){
                                
                                                object.setPeriodDisplayValue(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accumulatorDiscountInfoList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(com.comverse.www.AccumulatorDiscountInfoObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
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
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","accumulatorDiscountInfoList").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(com.comverse.www.AccumulatorDiscountInfoObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAccumulatorDiscountInfoList((com.comverse.www.AccumulatorDiscountInfoObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.AccumulatorDiscountInfoObject.class,
                                                                list8));
                                                            
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
           
    