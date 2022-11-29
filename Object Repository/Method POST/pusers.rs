<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>pusers</name>
   <tag></tag>
   <elementGuidId>fa3c5685-def8-4ff5-89a1-ce28a65e92b4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;id\&quot;: \&quot;1\&quot;,\n   \&quot;name\&quot;: \&quot;${GlobalVariable.name}\&quot;,\n   \&quot;username\&quot;: \&quot;${GlobalVariable.username}\&quot;,\n   \&quot;email\&quot;: \&quot;${GlobalVariable.email}\&quot;,\n   \&quot;street\&quot;: \&quot;${GlobalVariable.street}\&quot;,\n   \&quot;suite\&quot;: \&quot;${GlobalVariable.suite}\&quot;,\n   \&quot;city\&quot;: \&quot;${GlobalVariable.city}\&quot;,\n   \&quot;zipcode\&quot;: \&quot;${GlobalVariable.zipcode}\&quot;,\n   \&quot;lat\&quot;: \&quot;${GlobalVariable.lat}\&quot;,\n   \&quot;lng\&quot;: \&quot;${GlobalVariable.lng}\&quot;,\n   \&quot;phone\&quot;: \&quot;${GlobalVariable.phone}\&quot;,\n   \&quot;website\&quot;: \&quot;${GlobalVariable.website}\&quot;,\n   \&quot;company\&quot;: \&quot;${GlobalVariable.company}\&quot;,\n   \&quot;catchPhrase\&quot;: \&quot;${GlobalVariable.catchPhrase}\&quot;,\n   \&quot;bs\&quot;: \&quot;${GlobalVariable.bs}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'id', '11')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
