
/**
 * VoucherObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.comverse.www;
            

            /**
            *  VoucherObject bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class VoucherObject extends com.comverse.www.VoucherBaseObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = voucherObject
                Namespace URI = http://www.comverse.com
                Namespace Prefix = ns1
                */
            

     
     
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
                           namespacePrefix+":voucherObject",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "voucherObject",
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
                              if (localBatchNumberTracker){
                                            if (localBatchNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("batchNumber cannot be null!!");
                                            }
                                           localBatchNumber.serialize(new javax.xml.namespace.QName("","batchNumber"),
                                               xmlWriter);
                                        } if (localSerialNumberTracker){
                                            if (localSerialNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("serialNumber cannot be null!!");
                                            }
                                           localSerialNumber.serialize(new javax.xml.namespace.QName("","serialNumber"),
                                               xmlWriter);
                                        } if (localCodeNumberTracker){
                                            if (localCodeNumber==null){
                                                 throw new org.apache.axis2.databinding.ADBException("codeNumber cannot be null!!");
                                            }
                                           localCodeNumber.serialize(new javax.xml.namespace.QName("","codeNumber"),
                                               xmlWriter);
                                        } if (localVoucherKeyTracker){
                                            if (localVoucherKey==null){
                                                 throw new org.apache.axis2.databinding.ADBException("voucherKey cannot be null!!");
                                            }
                                           localVoucherKey.serialize(new javax.xml.namespace.QName("","voucherKey"),
                                               xmlWriter);
                                        } if (localAcctExpOffsetTracker){
                                            if (localAcctExpOffset==null){
                                                 throw new org.apache.axis2.databinding.ADBException("acctExpOffset cannot be null!!");
                                            }
                                           localAcctExpOffset.serialize(new javax.xml.namespace.QName("","acctExpOffset"),
                                               xmlWriter);
                                        } if (localCardIdTracker){
                                            if (localCardId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("cardId cannot be null!!");
                                            }
                                           localCardId.serialize(new javax.xml.namespace.QName("","cardId"),
                                               xmlWriter);
                                        } if (localChangePhonebookTracker){
                                            if (localChangePhonebook==null){
                                                 throw new org.apache.axis2.databinding.ADBException("changePhonebook cannot be null!!");
                                            }
                                           localChangePhonebook.serialize(new javax.xml.namespace.QName("","changePhonebook"),
                                               xmlWriter);
                                        } if (localCurrencyCodeTracker){
                                            if (localCurrencyCode==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                            }
                                           localCurrencyCode.serialize(new javax.xml.namespace.QName("","currencyCode"),
                                               xmlWriter);
                                        } if (localCurrencyUnitTracker){
                                    if (localCurrencyUnit==null){

                                        writeStartElement(null, "", "currencyUnit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCurrencyUnit.serialize(new javax.xml.namespace.QName("","currencyUnit"),
                                        xmlWriter);
                                    }
                                } if (localDistributorTracker){
                                    if (localDistributor==null){

                                        writeStartElement(null, "", "distributor", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDistributor.serialize(new javax.xml.namespace.QName("","distributor"),
                                        xmlWriter);
                                    }
                                } if (localExpirationDateTracker){
                                            if (localExpirationDate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("expirationDate cannot be null!!");
                                            }
                                           localExpirationDate.serialize(new javax.xml.namespace.QName("","expirationDate"),
                                               xmlWriter);
                                        } if (localExpireOffsetTracker){
                                    if (localExpireOffset==null){

                                        writeStartElement(null, "", "expireOffset", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localExpireOffset.serialize(new javax.xml.namespace.QName("","expireOffset"),
                                        xmlWriter);
                                    }
                                } if (localFaceValueTracker){
                                    if (localFaceValue==null){

                                        writeStartElement(null, "", "faceValue", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFaceValue.serialize(new javax.xml.namespace.QName("","faceValue"),
                                        xmlWriter);
                                    }
                                } if (localIdentityIdTracker){
                                    if (localIdentityId==null){

                                        writeStartElement(null, "", "identityId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localIdentityId.serialize(new javax.xml.namespace.QName("","identityId"),
                                        xmlWriter);
                                    }
                                } if (localMarketGroupIdTracker){
                                    if (localMarketGroupId==null){

                                        writeStartElement(null, "", "marketGroupId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMarketGroupId.serialize(new javax.xml.namespace.QName("","marketGroupId"),
                                        xmlWriter);
                                    }
                                } if (localMogNameTracker){
                                    if (localMogName==null){

                                        writeStartElement(null, "", "mogName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMogName.serialize(new javax.xml.namespace.QName("","mogName"),
                                        xmlWriter);
                                    }
                                } if (localOrderNumberTracker){
                                    if (localOrderNumber==null){

                                        writeStartElement(null, "", "orderNumber", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOrderNumber.serialize(new javax.xml.namespace.QName("","orderNumber"),
                                        xmlWriter);
                                    }
                                } if (localProminExpOffset1Tracker){
                                    if (localProminExpOffset1==null){

                                        writeStartElement(null, "", "prominExpOffset1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProminExpOffset1.serialize(new javax.xml.namespace.QName("","prominExpOffset1"),
                                        xmlWriter);
                                    }
                                } if (localProminExpOffset2Tracker){
                                    if (localProminExpOffset2==null){

                                        writeStartElement(null, "", "prominExpOffset2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProminExpOffset2.serialize(new javax.xml.namespace.QName("","prominExpOffset2"),
                                        xmlWriter);
                                    }
                                } if (localProminValue1Tracker){
                                    if (localProminValue1==null){

                                        writeStartElement(null, "", "prominValue1", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProminValue1.serialize(new javax.xml.namespace.QName("","prominValue1"),
                                        xmlWriter);
                                    }
                                } if (localProminValue2Tracker){
                                    if (localProminValue2==null){

                                        writeStartElement(null, "", "prominValue2", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProminValue2.serialize(new javax.xml.namespace.QName("","prominValue2"),
                                        xmlWriter);
                                    }
                                } if (localRechargeServerIdTracker){
                                    if (localRechargeServerId==null){

                                        writeStartElement(null, "", "rechargeServerId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRechargeServerId.serialize(new javax.xml.namespace.QName("","rechargeServerId"),
                                        xmlWriter);
                                    }
                                } if (localResellerIdTracker){
                                            if (localResellerId==null){
                                                 throw new org.apache.axis2.databinding.ADBException("resellerId cannot be null!!");
                                            }
                                           localResellerId.serialize(new javax.xml.namespace.QName("","resellerId"),
                                               xmlWriter);
                                        } if (localShipDateTracker){
                                    if (localShipDate==null){

                                        writeStartElement(null, "", "shipDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localShipDate.serialize(new javax.xml.namespace.QName("","shipDate"),
                                        xmlWriter);
                                    }
                                } if (localSpNameTracker){
                                    if (localSpName==null){

                                        writeStartElement(null, "", "spName", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSpName.serialize(new javax.xml.namespace.QName("","spName"),
                                        xmlWriter);
                                    }
                                } if (localStateTracker){
                                            if (localState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("state cannot be null!!");
                                            }
                                           localState.serialize(new javax.xml.namespace.QName("","state"),
                                               xmlWriter);
                                        } if (localSubscriberIdTracker){
                                    if (localSubscriberId==null){

                                        writeStartElement(null, "", "subscriberId", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSubscriberId.serialize(new javax.xml.namespace.QName("","subscriberId"),
                                        xmlWriter);
                                    }
                                } if (localUcardCosTracker){
                                    if (localUcardCos==null){

                                        writeStartElement(null, "", "ucardCos", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUcardCos.serialize(new javax.xml.namespace.QName("","ucardCos"),
                                        xmlWriter);
                                    }
                                } if (localUcardSpTracker){
                                    if (localUcardSp==null){

                                        writeStartElement(null, "", "ucardSp", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUcardSp.serialize(new javax.xml.namespace.QName("","ucardSp"),
                                        xmlWriter);
                                    }
                                } if (localUseDateTracker){
                                    if (localUseDate==null){

                                        writeStartElement(null, "", "useDate", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUseDate.serialize(new javax.xml.namespace.QName("","useDate"),
                                        xmlWriter);
                                    }
                                } if (localVoucherTypeTracker){
                                            if (localVoucherType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("voucherType cannot be null!!");
                                            }
                                           localVoucherType.serialize(new javax.xml.namespace.QName("","voucherType"),
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
                    attribList.add(new javax.xml.namespace.QName("http://www.comverse.com","voucherObject"));
                
                                      elementList.add(new javax.xml.namespace.QName("",
                                                                      "attribs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAttribs));
                             if (localBatchNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "batchNumber"));
                            
                            
                                    if (localBatchNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("batchNumber cannot be null!!");
                                    }
                                    elementList.add(localBatchNumber);
                                } if (localSerialNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "serialNumber"));
                            
                            
                                    if (localSerialNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("serialNumber cannot be null!!");
                                    }
                                    elementList.add(localSerialNumber);
                                } if (localCodeNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "codeNumber"));
                            
                            
                                    if (localCodeNumber==null){
                                         throw new org.apache.axis2.databinding.ADBException("codeNumber cannot be null!!");
                                    }
                                    elementList.add(localCodeNumber);
                                } if (localVoucherKeyTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "voucherKey"));
                            
                            
                                    if (localVoucherKey==null){
                                         throw new org.apache.axis2.databinding.ADBException("voucherKey cannot be null!!");
                                    }
                                    elementList.add(localVoucherKey);
                                } if (localAcctExpOffsetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "acctExpOffset"));
                            
                            
                                    if (localAcctExpOffset==null){
                                         throw new org.apache.axis2.databinding.ADBException("acctExpOffset cannot be null!!");
                                    }
                                    elementList.add(localAcctExpOffset);
                                } if (localCardIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "cardId"));
                            
                            
                                    if (localCardId==null){
                                         throw new org.apache.axis2.databinding.ADBException("cardId cannot be null!!");
                                    }
                                    elementList.add(localCardId);
                                } if (localChangePhonebookTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "changePhonebook"));
                            
                            
                                    if (localChangePhonebook==null){
                                         throw new org.apache.axis2.databinding.ADBException("changePhonebook cannot be null!!");
                                    }
                                    elementList.add(localChangePhonebook);
                                } if (localCurrencyCodeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyCode"));
                            
                            
                                    if (localCurrencyCode==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyCode cannot be null!!");
                                    }
                                    elementList.add(localCurrencyCode);
                                } if (localCurrencyUnitTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "currencyUnit"));
                            
                            
                                    elementList.add(localCurrencyUnit==null?null:
                                    localCurrencyUnit);
                                } if (localDistributorTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "distributor"));
                            
                            
                                    elementList.add(localDistributor==null?null:
                                    localDistributor);
                                } if (localExpirationDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "expirationDate"));
                            
                            
                                    if (localExpirationDate==null){
                                         throw new org.apache.axis2.databinding.ADBException("expirationDate cannot be null!!");
                                    }
                                    elementList.add(localExpirationDate);
                                } if (localExpireOffsetTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "expireOffset"));
                            
                            
                                    elementList.add(localExpireOffset==null?null:
                                    localExpireOffset);
                                } if (localFaceValueTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "faceValue"));
                            
                            
                                    elementList.add(localFaceValue==null?null:
                                    localFaceValue);
                                } if (localIdentityIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "identityId"));
                            
                            
                                    elementList.add(localIdentityId==null?null:
                                    localIdentityId);
                                } if (localMarketGroupIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "marketGroupId"));
                            
                            
                                    elementList.add(localMarketGroupId==null?null:
                                    localMarketGroupId);
                                } if (localMogNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "mogName"));
                            
                            
                                    elementList.add(localMogName==null?null:
                                    localMogName);
                                } if (localOrderNumberTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "orderNumber"));
                            
                            
                                    elementList.add(localOrderNumber==null?null:
                                    localOrderNumber);
                                } if (localProminExpOffset1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prominExpOffset1"));
                            
                            
                                    elementList.add(localProminExpOffset1==null?null:
                                    localProminExpOffset1);
                                } if (localProminExpOffset2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prominExpOffset2"));
                            
                            
                                    elementList.add(localProminExpOffset2==null?null:
                                    localProminExpOffset2);
                                } if (localProminValue1Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prominValue1"));
                            
                            
                                    elementList.add(localProminValue1==null?null:
                                    localProminValue1);
                                } if (localProminValue2Tracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "prominValue2"));
                            
                            
                                    elementList.add(localProminValue2==null?null:
                                    localProminValue2);
                                } if (localRechargeServerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "rechargeServerId"));
                            
                            
                                    elementList.add(localRechargeServerId==null?null:
                                    localRechargeServerId);
                                } if (localResellerIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "resellerId"));
                            
                            
                                    if (localResellerId==null){
                                         throw new org.apache.axis2.databinding.ADBException("resellerId cannot be null!!");
                                    }
                                    elementList.add(localResellerId);
                                } if (localShipDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "shipDate"));
                            
                            
                                    elementList.add(localShipDate==null?null:
                                    localShipDate);
                                } if (localSpNameTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "spName"));
                            
                            
                                    elementList.add(localSpName==null?null:
                                    localSpName);
                                } if (localStateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "state"));
                            
                            
                                    if (localState==null){
                                         throw new org.apache.axis2.databinding.ADBException("state cannot be null!!");
                                    }
                                    elementList.add(localState);
                                } if (localSubscriberIdTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "subscriberId"));
                            
                            
                                    elementList.add(localSubscriberId==null?null:
                                    localSubscriberId);
                                } if (localUcardCosTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ucardCos"));
                            
                            
                                    elementList.add(localUcardCos==null?null:
                                    localUcardCos);
                                } if (localUcardSpTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "ucardSp"));
                            
                            
                                    elementList.add(localUcardSp==null?null:
                                    localUcardSp);
                                } if (localUseDateTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "useDate"));
                            
                            
                                    elementList.add(localUseDate==null?null:
                                    localUseDate);
                                } if (localVoucherTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("",
                                                                      "voucherType"));
                            
                            
                                    if (localVoucherType==null){
                                         throw new org.apache.axis2.databinding.ADBException("voucherType cannot be null!!");
                                    }
                                    elementList.add(localVoucherType);
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
        public static VoucherObject parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            VoucherObject object =
                new VoucherObject();

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
                    
                            if (!"voucherObject".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (VoucherObject)com.comverse.www.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","batchNumber").equals(reader.getName())){
                                
                                                object.setBatchNumber(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","serialNumber").equals(reader.getName())){
                                
                                                object.setSerialNumber(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","codeNumber").equals(reader.getName())){
                                
                                                object.setCodeNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","voucherKey").equals(reader.getName())){
                                
                                                object.setVoucherKey(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","acctExpOffset").equals(reader.getName())){
                                
                                                object.setAcctExpOffset(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","cardId").equals(reader.getName())){
                                
                                                object.setCardId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","changePhonebook").equals(reader.getName())){
                                
                                                object.setChangePhonebook(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","currencyUnit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCurrencyUnit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCurrencyUnit(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","distributor").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDistributor(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDistributor(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","expirationDate").equals(reader.getName())){
                                
                                                object.setExpirationDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","expireOffset").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setExpireOffset(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setExpireOffset(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","faceValue").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFaceValue(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFaceValue(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","identityId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setIdentityId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setIdentityId(com.comverse.www.LongAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","marketGroupId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMarketGroupId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMarketGroupId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","mogName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMogName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMogName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","orderNumber").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOrderNumber(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOrderNumber(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prominExpOffset1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProminExpOffset1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProminExpOffset1(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prominExpOffset2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProminExpOffset2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProminExpOffset2(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prominValue1").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProminValue1(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProminValue1(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","prominValue2").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProminValue2(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProminValue2(com.comverse.www.NumericAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","rechargeServerId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRechargeServerId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRechargeServerId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","resellerId").equals(reader.getName())){
                                
                                                object.setResellerId(com.comverse.www.IntegerAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","shipDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setShipDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setShipDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","spName").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSpName(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSpName(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","state").equals(reader.getName())){
                                
                                                object.setState(com.comverse.www.ByteAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","subscriberId").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSubscriberId(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSubscriberId(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ucardCos").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUcardCos(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUcardCos(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","ucardSp").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUcardSp(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUcardSp(com.comverse.www.StringAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","useDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUseDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUseDate(com.comverse.www.DateAttributeJAXBElement.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("","voucherType").equals(reader.getName())){
                                
                                                object.setVoucherType(com.comverse.www.ShortAttributeJAXBElement.Factory.parse(reader));
                                              
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
           
    