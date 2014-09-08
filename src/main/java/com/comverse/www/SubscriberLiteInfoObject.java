
/**
 * SubscriberLiteInfoObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  SubscriberLiteInfoObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SubscriberLiteInfoObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = subscriberLiteInfoObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AccumulatorInfoLiteObject
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.AccumulatorLiteInfoObject[] localAccumulatorInfoLiteObject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccumulatorInfoLiteObjectTracker = false ;

                           public boolean isAccumulatorInfoLiteObjectSpecified(){
                               return localAccumulatorInfoLiteObjectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.AccumulatorLiteInfoObject[]
                           */
                           public  com.comverse.www.AccumulatorLiteInfoObject[] getAccumulatorInfoLiteObject(){
                               return localAccumulatorInfoLiteObject;
                           }

                           
                        


                               
                              /**
                               * validate the array for AccumulatorInfoLiteObject
                               */
                              protected void validateAccumulatorInfoLiteObject(com.comverse.www.AccumulatorLiteInfoObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AccumulatorInfoLiteObject
                              */
                              public void setAccumulatorInfoLiteObject(com.comverse.www.AccumulatorLiteInfoObject[] param){
                              
                                   validateAccumulatorInfoLiteObject(param);

                               localAccumulatorInfoLiteObjectTracker = true;
                                      
                                      this.localAccumulatorInfoLiteObject=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.AccumulatorLiteInfoObject
                             */
                             public void addAccumulatorInfoLiteObject(com.comverse.www.AccumulatorLiteInfoObject param){
                                   if (localAccumulatorInfoLiteObject == null){
                                   localAccumulatorInfoLiteObject = new com.comverse.www.AccumulatorLiteInfoObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localAccumulatorInfoLiteObjectTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAccumulatorInfoLiteObject);
                               list.add(param);
                               this.localAccumulatorInfoLiteObject =
                             (com.comverse.www.AccumulatorLiteInfoObject[])list.toArray(
                            new com.comverse.www.AccumulatorLiteInfoObject[list.size()]);

                             }
                             

                        /**
                        * field for OfferLiteInfoObject
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.OfferLiteInfoObject[] localOfferLiteInfoObject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOfferLiteInfoObjectTracker = false ;

                           public boolean isOfferLiteInfoObjectSpecified(){
                               return localOfferLiteInfoObjectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.OfferLiteInfoObject[]
                           */
                           public  com.comverse.www.OfferLiteInfoObject[] getOfferLiteInfoObject(){
                               return localOfferLiteInfoObject;
                           }

                           
                        


                               
                              /**
                               * validate the array for OfferLiteInfoObject
                               */
                              protected void validateOfferLiteInfoObject(com.comverse.www.OfferLiteInfoObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param OfferLiteInfoObject
                              */
                              public void setOfferLiteInfoObject(com.comverse.www.OfferLiteInfoObject[] param){
                              
                                   validateOfferLiteInfoObject(param);

                               localOfferLiteInfoObjectTracker = true;
                                      
                                      this.localOfferLiteInfoObject=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.OfferLiteInfoObject
                             */
                             public void addOfferLiteInfoObject(com.comverse.www.OfferLiteInfoObject param){
                                   if (localOfferLiteInfoObject == null){
                                   localOfferLiteInfoObject = new com.comverse.www.OfferLiteInfoObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localOfferLiteInfoObjectTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localOfferLiteInfoObject);
                               list.add(param);
                               this.localOfferLiteInfoObject =
                             (com.comverse.www.OfferLiteInfoObject[])list.toArray(
                            new com.comverse.www.OfferLiteInfoObject[list.size()]);

                             }
                             

                        /**
                        * field for RcTermLiteInfoObject
                        * This was an Array!
                        */

                        
                                    protected com.comverse.www.RcTermLiteInfoObject[] localRcTermLiteInfoObject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRcTermLiteInfoObjectTracker = false ;

                           public boolean isRcTermLiteInfoObjectSpecified(){
                               return localRcTermLiteInfoObjectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.comverse.www.RcTermLiteInfoObject[]
                           */
                           public  com.comverse.www.RcTermLiteInfoObject[] getRcTermLiteInfoObject(){
                               return localRcTermLiteInfoObject;
                           }

                           
                        


                               
                              /**
                               * validate the array for RcTermLiteInfoObject
                               */
                              protected void validateRcTermLiteInfoObject(com.comverse.www.RcTermLiteInfoObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RcTermLiteInfoObject
                              */
                              public void setRcTermLiteInfoObject(com.comverse.www.RcTermLiteInfoObject[] param){
                              
                                   validateRcTermLiteInfoObject(param);

                               localRcTermLiteInfoObjectTracker = true;
                                      
                                      this.localRcTermLiteInfoObject=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.comverse.www.RcTermLiteInfoObject
                             */
                             public void addRcTermLiteInfoObject(com.comverse.www.RcTermLiteInfoObject param){
                                   if (localRcTermLiteInfoObject == null){
                                   localRcTermLiteInfoObject = new com.comverse.www.RcTermLiteInfoObject[]{};
                                   }

                            
                                 //update the setting tracker
                                localRcTermLiteInfoObjectTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRcTermLiteInfoObject);
                               list.add(param);
                               this.localRcTermLiteInfoObject =
                             (com.comverse.www.RcTermLiteInfoObject[])list.toArray(
                            new com.comverse.www.RcTermLiteInfoObject[list.size()]);

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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.comverse.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":subscriberLiteInfoObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "subscriberLiteInfoObject",
                           xmlWriter);
                   }

               
                   }
                if (localAccumulatorInfoLiteObjectTracker){
                                       if (localAccumulatorInfoLiteObject!=null){
                                            for (int i = 0;i < localAccumulatorInfoLiteObject.length;i++){
                                                if (localAccumulatorInfoLiteObject[i] != null){
                                                 localAccumulatorInfoLiteObject[i].serialize(new javax.xml.namespace.QName("","accumulatorInfoLiteObject"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "accumulatorInfoLiteObject", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "accumulatorInfoLiteObject", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localOfferLiteInfoObjectTracker){
                                       if (localOfferLiteInfoObject!=null){
                                            for (int i = 0;i < localOfferLiteInfoObject.length;i++){
                                                if (localOfferLiteInfoObject[i] != null){
                                                 localOfferLiteInfoObject[i].serialize(new javax.xml.namespace.QName("","offerLiteInfoObject"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "offerLiteInfoObject", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "offerLiteInfoObject", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRcTermLiteInfoObjectTracker){
                                       if (localRcTermLiteInfoObject!=null){
                                            for (int i = 0;i < localRcTermLiteInfoObject.length;i++){
                                                if (localRcTermLiteInfoObject[i] != null){
                                                 localRcTermLiteInfoObject[i].serialize(new javax.xml.namespace.QName("","rcTermLiteInfoObject"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "", "rcTermLiteInfoObject", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "", "rcTermLiteInfoObject", xmlWriter);

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

                 if (localAccumulatorInfoLiteObjectTracker){
                             if (localAccumulatorInfoLiteObject!=null) {
                                 for (int i = 0;i < localAccumulatorInfoLiteObject.length;i++){

                                    if (localAccumulatorInfoLiteObject[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulatorInfoLiteObject"));
                                         elementList.add(localAccumulatorInfoLiteObject[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulatorInfoLiteObject"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "accumulatorInfoLiteObject"));
                                        elementList.add(localAccumulatorInfoLiteObject);
                                    
                             }

                        } if (localOfferLiteInfoObjectTracker){
                             if (localOfferLiteInfoObject!=null) {
                                 for (int i = 0;i < localOfferLiteInfoObject.length;i++){

                                    if (localOfferLiteInfoObject[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "offerLiteInfoObject"));
                                         elementList.add(localOfferLiteInfoObject[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "offerLiteInfoObject"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "offerLiteInfoObject"));
                                        elementList.add(localOfferLiteInfoObject);
                                    
                             }

                        } if (localRcTermLiteInfoObjectTracker){
                             if (localRcTermLiteInfoObject!=null) {
                                 for (int i = 0;i < localRcTermLiteInfoObject.length;i++){

                                    if (localRcTermLiteInfoObject[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermLiteInfoObject"));
                                         elementList.add(localRcTermLiteInfoObject[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermLiteInfoObject"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("",
                                                                          "rcTermLiteInfoObject"));
                                        elementList.add(localRcTermLiteInfoObject);
                                    
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
        public static SubscriberLiteInfoObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SubscriberLiteInfoObject object =
                new SubscriberLiteInfoObject();

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
                    
                            if (!"subscriberLiteInfoObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SubscriberLiteInfoObject)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","accumulatorInfoLiteObject").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(com.comverse.www.AccumulatorLiteInfoObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
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
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","accumulatorInfoLiteObject").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(com.comverse.www.AccumulatorLiteInfoObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAccumulatorInfoLiteObject((com.comverse.www.AccumulatorLiteInfoObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.AccumulatorLiteInfoObject.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","offerLiteInfoObject").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(null);
                                                              reader.next();
                                                          } else {
                                                        list2.add(com.comverse.www.OfferLiteInfoObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","offerLiteInfoObject").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list2.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list2.add(com.comverse.www.OfferLiteInfoObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setOfferLiteInfoObject((com.comverse.www.OfferLiteInfoObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.OfferLiteInfoObject.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rcTermLiteInfoObject").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(com.comverse.www.RcTermLiteInfoObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
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
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("","rcTermLiteInfoObject").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(com.comverse.www.RcTermLiteInfoObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRcTermLiteInfoObject((com.comverse.www.RcTermLiteInfoObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.comverse.www.RcTermLiteInfoObject.class,
                                                                list3));
                                                            
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
           
    