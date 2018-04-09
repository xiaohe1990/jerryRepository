package zb.com.controls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.jetty.JettyRequestUpgradeStrategy;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import zb.com.websocket.HandshakeInterceptor;
import zb.com.websocket.MyWebSocketHandler;

//注解模式加载websocket
@Configuration
@EnableWebMvc
@EnableWebSocket
public class MyWebSocketConfigs extends WebMvcConfigurerAdapter implements WebSocketConfigurer {
  /*  @Autowired
	public WebSocketHandler webSocketHandler;*/
        @Override
        public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

            //前台 可以使用websocket环境
            registry.addHandler(myWebSocketHandler(),"/websocket").addInterceptors(new HandshakeInterceptor());
           // .setAllowedOrigins("*");/*不加AllowedOrigins，有可能会全拒绝*/


          //前台 不可以使用websocket环境，则使用sockjs进行模拟连接
            registry.addHandler(myWebSocketHandler(), "/sockjs/websocket").addInterceptors(new HandshakeInterceptor())
                    .withSockJS();
        }


        // websocket 处理�?
        @Bean
        public WebSocketHandler myWebSocketHandler(){
        	
            return new MyWebSocketHandler();
        }

   
}
