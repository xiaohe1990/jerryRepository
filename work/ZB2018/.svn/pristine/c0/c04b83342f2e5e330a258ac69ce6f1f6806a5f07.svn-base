package zb.com.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.apache.http.entity.mime.MultipartEntityBuilder;  
import org.apache.http.entity.mime.content.FileBody;  
import org.apache.http.entity.mime.content.StringBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.ContentType; 
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
/**
 * 
* @ClassName: HttpUtil 
* @Description: TODO(封装HTTP请求方法) 
* @author XW 
* @date 2017-3-15 下午5:56:55 
*
 */
public class HttpUtil {
	private static final CloseableHttpClient httpClient;
    public static final String CHARSET = "UTF-8";
 
    static {
        RequestConfig config = RequestConfig.custom().setConnectTimeout(60000).setSocketTimeout(5000)
        		  .setConnectionRequestTimeout(5000).build();
        httpClient = HttpClientBuilder.create().
        		setDefaultRequestConfig(config).
        		setRetryHandler(new DefaultHttpRequestRetryHandler()).build();
                 ////默认失败后重发3次，可用别的构造方法指定重发次数
        
    }
	
    /**
     * 发送请求
     * @param url请求地址
     * @param params请求参数
     * @param method 方法类型为空则是get
     * @param CHARSETs编码格式 为空则是UTF-8
     * @return
     */
     public static String doHttp(String url,Map<String, Object> params,String method,String CHARSETs){
     	if(HelpUtil.isNull(method)){
     		method="get";
     	}
     	if(HelpUtil.isNull(CHARSETs)){
     		CHARSETs="UTF-8";
     	}
     	if(method.toLowerCase().equals("post")){
     		 return doHttpPost(url, params,CHARSETs);
     	}else{
     		  return doHttpGet(url, params,CHARSETs);
     	}
     	
     }
     public static String doGet(String url, Map<String, Object> params){
         return doHttpGet(url, params,CHARSET);
     }
     public static String doHttpPost(String url, Map<String, Object> params){
         return doHttpPost(url, params,CHARSET);
     }
     /**
      * HTTP Get 获取内容
      * @param url  请求的url地址 ?之前的地址
      * @param params 请求的参数
      * @param charset    编码格式
      * @return    页面内容
      */
     public static String doHttpGet(String url,Map<String,Object> params,String charset){
         if(null==url){
             return null;
         }
         try {
             if(params != null && !params.isEmpty()){
                 List<NameValuePair> pairs = new ArrayList<NameValuePair>(params.size());
                 for(Map.Entry<String,Object> entry : params.entrySet()){
                     String value = (String) entry.getValue();
                     if(value != null){
                         pairs.add(new BasicNameValuePair(entry.getKey(),value));
                     }
                 }
                 url+="?"+EntityUtils.toString(new UrlEncodedFormEntity(pairs, charset));
             }
            // url=java.net.URLEncoder.encode(url, "UTF-8").replace("+", "%20");
             HttpGet httpGet = new HttpGet(url);
             CloseableHttpResponse response = httpClient.execute(httpGet);
             int statusCode = response.getStatusLine().getStatusCode();
             if (statusCode != 200) {
                 httpGet.abort();
                 throw new RuntimeException("HttpClient,error status code :" + statusCode);
             }
             HttpEntity entity = response.getEntity();
             String result = null;
             if (entity != null){
                 result = EntityUtils.toString(entity, "utf-8");
             }
             EntityUtils.consume(entity);
             response.close();
             return result;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return null;
     }
     
     /**
      * HTTP Post 获取内容
      * @param url  请求的url地址 ?之前的地址
      * @param params 请求的参数
      * @param charset    编码格式
      * @return    页面内容
      */
     public static String doHttpPost(String url,Map<String,Object> params,String charset){
         if(null==url){
             return null;
         }
         try {
             List<NameValuePair> pairs = null;
             if(params != null && !params.isEmpty()){
                 pairs = new ArrayList<NameValuePair>(params.size());
                 for(Map.Entry<String,Object> entry : params.entrySet()){
                     String value = (String) entry.getValue();
                     if(value != null){
                         pairs.add(new BasicNameValuePair(entry.getKey(),value));
                     }
                 }
             }
             HttpPost httpPost = new HttpPost(url);
             if(pairs != null && pairs.size() > 0){
                 httpPost.setEntity(new UrlEncodedFormEntity(pairs,CHARSET));
             }
             CloseableHttpResponse response = httpClient.execute(httpPost);
             int statusCode = response.getStatusLine().getStatusCode();
             if (statusCode != 200) {
                 httpPost.abort();
                 throw new RuntimeException("HttpClient,error status code :" + statusCode);
             }
             HttpEntity entity = response.getEntity();
             String result = null;
             if (entity != null){
                 result = EntityUtils.toString(entity, "utf-8");
             }
             EntityUtils.consume(entity);
             response.close();
             return result;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return null;
     }
     
     
     
     public static String httpsPost(String url, Map<String,String> map,String encoding) throws KeyManagementException, NoSuchAlgorithmException, ClientProtocolException, IOException {
         String body = "";
         //采用绕过验证的方式处理https请求
         SSLContext sslcontext = createIgnoreVerifySSL();
         
         // 设置协议http和https对应的处理socket链接工厂的对象
         Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
             .register("http", PlainConnectionSocketFactory.INSTANCE)
             .register("https", new SSLConnectionSocketFactory(sslcontext))
             .build();
         PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
         HttpClients.custom().setConnectionManager(connManager);

         //创建自定义的httpclient对象
         CloseableHttpClient client = HttpClients.custom().setConnectionManager(connManager).build();
//         CloseableHttpClient client = HttpClients.createDefault();
         
         //创建post方式请求对象
         HttpPost httpPost = new HttpPost(url);
         
         //装填参数
         List<NameValuePair> nvps = new ArrayList<NameValuePair>();
         if(map!=null){
             for (Entry<String, String> entry : map.entrySet()) {
                 nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
             }
         }
         //设置参数到请求对象中
         httpPost.setEntity(new UrlEncodedFormEntity(nvps, encoding));

         System.out.println("请求地址："+url);
         System.out.println("请求参数："+nvps.toString());
         
         //设置header信息
         //指定报文头【Content-type】、【User-Agent】
         httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
         httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
         
         //执行请求操作，并拿到结果（同步阻塞）
         CloseableHttpResponse response = client.execute(httpPost);
         //获取结果实体
         HttpEntity entity = response.getEntity();
         if (entity != null) {
             //按指定编码转换结果实体为String类型
             body = EntityUtils.toString(entity, encoding);
         }
         EntityUtils.consume(entity);
         //释放链接
         response.close();
         return body;
     }
     
     
     public static String httpsGet(String url, Map<String,String> map,String encoding) throws KeyManagementException, NoSuchAlgorithmException, ClientProtocolException, IOException {
         String body = "";
         //采用绕过验证的方式处理https请求
         SSLContext sslcontext = createIgnoreVerifySSL();
         
         // 设置协议http和https对应的处理socket链接工厂的对象
         Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
             .register("http", PlainConnectionSocketFactory.INSTANCE)
             .register("https", new SSLConnectionSocketFactory(sslcontext))
             .build();
         PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
         HttpClients.custom().setConnectionManager(connManager);

         //创建自定义的httpclient对象
         CloseableHttpClient client = HttpClients.custom().setConnectionManager(connManager).build();
//         CloseableHttpClient client = HttpClients.createDefault();
         
         //创建post方式请求对象
        // HttpPost httpPost = new HttpPost(url);
         HttpGet httpGet = new HttpGet(url);
         //装填参数
         List<NameValuePair> nvps = new ArrayList<NameValuePair>();
         if(map!=null){
             for (Entry<String, String> entry : map.entrySet()) {
                 nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
             }
             url+="?"+EntityUtils.toString(new UrlEncodedFormEntity(nvps, encoding));
         }
         //设置参数到请求对象中
        // httpGet.setEntity(new UrlEncodedFormEntity(nvps, encoding));

         System.out.println("请求地址："+url);
         System.out.println("请求参数："+nvps.toString());
         
         //设置header信息
         //指定报文头【Content-type】、【User-Agent】
         httpGet.setHeader("Content-type", "application/x-www-form-urlencoded");
         httpGet.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
         
         //执行请求操作，并拿到结果（同步阻塞）
         CloseableHttpResponse response = client.execute(httpGet);
         //获取结果实体
         HttpEntity entity = response.getEntity();
         if (entity != null) {
             //按指定编码转换结果实体为String类型
             body = EntityUtils.toString(entity, encoding);
         }
         EntityUtils.consume(entity);
         //释放链接
         response.close();
         return body;
     }
     /**
      * 绕过验证
      *     
      * @return
      * @throws NoSuchAlgorithmException 
      * @throws KeyManagementException 
      */
     public static SSLContext createIgnoreVerifySSL() throws NoSuchAlgorithmException, KeyManagementException {
         SSLContext sc = SSLContext.getInstance("SSLv3");

         // 实现一个X509TrustManager接口，用于绕过验证，不用修改里面的方法
         X509TrustManager trustManager = new X509TrustManager() {
             @Override
             public void checkClientTrusted(
                     java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                     String paramString) throws CertificateException {
             }

             @Override
             public void checkServerTrusted(
                     java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                     String paramString) throws CertificateException {
             }

             @Override
             public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                 return null;
             }
         };

         sc.init(null, new TrustManager[] { trustManager }, null);
         return sc;
     }
     
     
    
   

}
