package zb.com.websocket;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
/*@Component */ 
public class MyWebSocketHandler   extends TextWebSocketHandler{

	// private static final Logger log =
	// Logger.getLogger(MyWebSocketHandler.class);

	// 保存�?有的用户session
	private static final ArrayList<WebSocketSession> users = new ArrayList<WebSocketSession>();

	// 连接 就绪�?
	@Override
	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {

		// log.info("connect websocket success.......");
         System.out.println("链接就绪.......");   
		users.add(session);

	}

	// 处理信息
	@Override
	public void handleMessage(WebSocketSession session,
			WebSocketMessage<?> message) throws Exception {

		Gson gson = new Gson();

		// 将消息JSON格式通过Gson转换成Map
		// message.getPayload().toString() 获取消息具体内容
		Map<String, Object> msg = gson.fromJson(
				message.getPayload().toString(),
				new TypeToken<Map<String, Object>>() {
				}.getType());

		// log.info("handleMessage......."+message.getPayload()+"..........."+msg);
            System.out.println("处理消息......."+message.getPayload()+"..........."+msg);
		// session.sendMessage(message);

		// 处理消息 msgContent消息内容
		TextMessage textMessage = new TextMessage(msg.get("msgContent")
				.toString(), true);
		// 调用方法（发送消息给�?有人�?
		sendMsgToAllUsers(textMessage);

	}

	// 处理传输时异�?
	@Override
	public void handleTransportError(WebSocketSession session,
			Throwable exception) throws Exception {
		  if(session.isOpen()){  
			  session.close();  
	        }  
	       System.out.println("websocket connection closed......");

	}

	// 关闭 连接�?
	@Override
	public void afterConnectionClosed(WebSocketSession session,
			CloseStatus closeStatus) throws Exception {

		// log.info("connect websocket closed.......");
System.out.println("关闭会话");
		users.remove(session);

	}

	@Override
	public boolean supportsPartialMessages() {
		// TODO Auto-generated method stub
		return false;
	}

	// 给所有用户发�? 信息
	public void sendMsgToAllUsers(WebSocketMessage<?> message) throws Exception {

		for (WebSocketSession user : users) {
			user.sendMessage(message);
		}

	}

	/**
	 * 给所有在线用户的实时工程�?测页面发送消�?
	 * 
	 * @param message
	 * @throws IOException
	 */
	/*
	 * public void sendMessageToJsp(final TextMessage message, String type)
	 * throws IOException { Iterator<Entry<String, WebSocketSession>> it =
	 * users.entrySet() .iterator();
	 * 
	 * // 多线程群�? while (it.hasNext()) {
	 * 
	 * final Entry<String, WebSocketSession> entry = it.next(); if
	 * (entry.getValue().isOpen() && entry.getKey().contains(type)) { new
	 * Thread(new Runnable() {
	 * 
	 * public void run() { try { if (entry.getValue().isOpen()) {
	 * entry.getValue().sendMessage(message); } } catch (IOException e) {
	 * e.printStackTrace(); } }
	 * 
	 * }).start(); }
	 * 
	 * } }
	 */
	// http://blog.csdn.net/mybook201314/article/details/70173674

}