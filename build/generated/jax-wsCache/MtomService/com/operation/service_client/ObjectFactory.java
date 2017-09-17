
package com.operation.service_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.operation.service_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://service.operation.com/", "helloResponse");
    private final static QName _SumNumbersResponse_QNAME = new QName("http://service.operation.com/", "sumNumbersResponse");
    private final static QName _SumNumbers_QNAME = new QName("http://service.operation.com/", "sumNumbers");
    private final static QName _UploadFile_QNAME = new QName("http://service.operation.com/", "uploadFile");
    private final static QName _UploadFileResponse_QNAME = new QName("http://service.operation.com/", "uploadFileResponse");
    private final static QName _IOException_QNAME = new QName("http://service.operation.com/", "IOException");
    private final static QName _Hello_QNAME = new QName("http://service.operation.com/", "hello");
    private final static QName _UploadFileImage_QNAME = new QName("", "image");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.operation.service_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SumNumbers }
     * 
     */
    public SumNumbers createSumNumbers() {
        return new SumNumbers();
    }

    /**
     * Create an instance of {@link UploadFile }
     * 
     */
    public UploadFile createUploadFile() {
        return new UploadFile();
    }

    /**
     * Create an instance of {@link UploadFileResponse }
     * 
     */
    public UploadFileResponse createUploadFileResponse() {
        return new UploadFileResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SumNumbersResponse }
     * 
     */
    public SumNumbersResponse createSumNumbersResponse() {
        return new SumNumbersResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.operation.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.operation.com/", name = "sumNumbersResponse")
    public JAXBElement<SumNumbersResponse> createSumNumbersResponse(SumNumbersResponse value) {
        return new JAXBElement<SumNumbersResponse>(_SumNumbersResponse_QNAME, SumNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.operation.com/", name = "sumNumbers")
    public JAXBElement<SumNumbers> createSumNumbers(SumNumbers value) {
        return new JAXBElement<SumNumbers>(_SumNumbers_QNAME, SumNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.operation.com/", name = "uploadFile")
    public JAXBElement<UploadFile> createUploadFile(UploadFile value) {
        return new JAXBElement<UploadFile>(_UploadFile_QNAME, UploadFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.operation.com/", name = "uploadFileResponse")
    public JAXBElement<UploadFileResponse> createUploadFileResponse(UploadFileResponse value) {
        return new JAXBElement<UploadFileResponse>(_UploadFileResponse_QNAME, UploadFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.operation.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.operation.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "image", scope = UploadFile.class)
    public JAXBElement<byte[]> createUploadFileImage(byte[] value) {
        return new JAXBElement<byte[]>(_UploadFileImage_QNAME, byte[].class, UploadFile.class, ((byte[]) value));
    }

}
