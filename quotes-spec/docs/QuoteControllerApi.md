# QuoteControllerApi

All URIs are relative to *https://localhost:9090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addQuoteUsingPOST**](QuoteControllerApi.md#addQuoteUsingPOST) | **POST** /quotes | addQuote
[**listQuoteUsingGET**](QuoteControllerApi.md#listQuoteUsingGET) | **GET** /quotes/{id} | ListQuote
[**listQuotesUsingGET**](QuoteControllerApi.md#listQuotesUsingGET) | **GET** /quotes | Liste toutes les quotes


<a name="addQuoteUsingPOST"></a>
# **addQuoteUsingPOST**
> addQuoteUsingPOST(quote)

addQuote

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteControllerApi;


QuoteControllerApi apiInstance = new QuoteControllerApi();
Quote quote = new Quote(); // Quote | quote
try {
    apiInstance.addQuoteUsingPOST(quote);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteControllerApi#addQuoteUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote** | [**Quote**](Quote.md)| quote |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listQuoteUsingGET"></a>
# **listQuoteUsingGET**
> Quote listQuoteUsingGET(id)

ListQuote

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteControllerApi;


QuoteControllerApi apiInstance = new QuoteControllerApi();
Integer id = 56; // Integer | id
try {
    Quote result = apiInstance.listQuoteUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteControllerApi#listQuoteUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**Quote**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listQuotesUsingGET"></a>
# **listQuotesUsingGET**
> List&lt;Quote&gt; listQuotesUsingGET()

Liste toutes les quotes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuoteControllerApi;


QuoteControllerApi apiInstance = new QuoteControllerApi();
try {
    List<Quote> result = apiInstance.listQuotesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteControllerApi#listQuotesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Quote&gt;**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

