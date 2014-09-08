
/**
 * SortCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  SortCriteria bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SortCriteria
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = sortCriteria
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AccentInsensitive
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAccentInsensitive ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAccentInsensitive(){
                               return localAccentInsensitive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccentInsensitive
                               */
                               public void setAccentInsensitive(boolean param){
                            
                                            this.localAccentInsensitive=param;
                                    

                               }
                            

                        /**
                        * field for Ascending
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAscending ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAscending(){
                               return localAscending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Ascending
                               */
                               public void setAscending(boolean param){
                            
                                            this.localAscending=param;
                                    

                               }
                            

                        /**
                        * field for CaseInsensitive
                        * This was an Attribute!
                        */

                        
                                    protected boolean localCaseInsensitive ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getCaseInsensitive(){
                               return localCaseInsensitive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CaseInsensitive
                               */
                               public void setCaseInsensitive(boolean param){
                            
                                            this.localCaseInsensitive=param;
                                    

                               }
                            

                        /**
                        * field for FieldName
                        * This was an Attribute!
                        */

                        
                                    protected java.lang.String localFieldName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFieldName(){
                               return localFieldName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FieldName
                               */
                               public void setFieldName(java.lang.String param){
                            
                                            this.localFieldName=param;
                                    

                               }
                            

                        /**
                        * field for Numeric
                        * This was an Attribute!
                        */

                        
                                    protected boolean localNumeric ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNumeric(){
                               return localNumeric;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Numeric
                               */
                               public void setNumeric(boolean param){
                            
                                            this.localNumeric=param;
                                    

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
                           namespacePrefix+":sortCriteria",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "sortCriteria",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "accentInsensitive",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccentInsensitive), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localAccentInsensitive is null");
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "ascending",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAscending), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localAscending is null");
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "caseInsensitive",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCaseInsensitive), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localCaseInsensitive is null");
                                      }
                                    
                                            if (localFieldName != null){
                                        
                                                writeAttribute("",
                                                         "fieldName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFieldName), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localFieldName is null");
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "numeric",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeric), xmlWriter);

                                            
                                      }
                                    
                                      else {
                                          throw new org.apache.axis2.databinding.ADBException("required attribute localNumeric is null");
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","accentInsensitive"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccentInsensitive));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ascending"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAscending));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","caseInsensitive"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCaseInsensitive));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","fieldName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFieldName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","numeric"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeric));
                                

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
        public static SortCriteria parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SortCriteria object =
                new SortCriteria();

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
                    
                            if (!"sortCriteria".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SortCriteria)com.comverse.www.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "accentInsensitive"
                    java.lang.String tempAttribAccentInsensitive =
                        
                                reader.getAttributeValue(null,"accentInsensitive");
                            
                   if (tempAttribAccentInsensitive!=null){
                         java.lang.String content = tempAttribAccentInsensitive;
                        
                                                 object.setAccentInsensitive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAccentInsensitive));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute accentInsensitive is missing");
                           
                    }
                    handledAttributes.add("accentInsensitive");
                    
                    // handle attribute "ascending"
                    java.lang.String tempAttribAscending =
                        
                                reader.getAttributeValue(null,"ascending");
                            
                   if (tempAttribAscending!=null){
                         java.lang.String content = tempAttribAscending;
                        
                                                 object.setAscending(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAscending));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute ascending is missing");
                           
                    }
                    handledAttributes.add("ascending");
                    
                    // handle attribute "caseInsensitive"
                    java.lang.String tempAttribCaseInsensitive =
                        
                                reader.getAttributeValue(null,"caseInsensitive");
                            
                   if (tempAttribCaseInsensitive!=null){
                         java.lang.String content = tempAttribCaseInsensitive;
                        
                                                 object.setCaseInsensitive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribCaseInsensitive));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute caseInsensitive is missing");
                           
                    }
                    handledAttributes.add("caseInsensitive");
                    
                    // handle attribute "fieldName"
                    java.lang.String tempAttribFieldName =
                        
                                reader.getAttributeValue(null,"fieldName");
                            
                   if (tempAttribFieldName!=null){
                         java.lang.String content = tempAttribFieldName;
                        
                                                 object.setFieldName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(tempAttribFieldName));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute fieldName is missing");
                           
                    }
                    handledAttributes.add("fieldName");
                    
                    // handle attribute "numeric"
                    java.lang.String tempAttribNumeric =
                        
                                reader.getAttributeValue(null,"numeric");
                            
                   if (tempAttribNumeric!=null){
                         java.lang.String content = tempAttribNumeric;
                        
                                                 object.setNumeric(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribNumeric));
                                            
                    } else {
                       
                               throw new org.apache.axis2.databinding.ADBException("Required attribute numeric is missing");
                           
                    }
                    handledAttributes.add("numeric");
                    
                    
                    reader.next();
                  
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
           
    