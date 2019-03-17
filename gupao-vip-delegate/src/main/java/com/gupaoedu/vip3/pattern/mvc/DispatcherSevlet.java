package com.gupaoedu.vip3.pattern.mvc;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherSevlet extends HttpServlet{

	private List<Hander> handleMapping = new ArrayList<Hander>();
	
	
	@Override
	public void init() throws ServletException {
		try {
		Class<?> memberControllerClazz = MemberController.class;
		handleMapping.add(new Hander()
				.setController(memberControllerClazz.newInstance())
				.setMethod(memberControllerClazz.getMethod("getMemberById", new Class[] {String.class}))
				.setUri("getMemberById"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dpDepatch(req,resp);
	}

	private void dpDepatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String uri = req.getRequestURI();
		uri = uri.split("/")[2];
		String id = req.getParameter("id");
		
		//找出对应的请求
		Hander hander = null;
		for(Hander h:handleMapping) {
			if(uri.equals(h.getUri())) {
				hander = h;
				break;
			}
		}
		//通过反射调用方法
		try {
			hander.getMethod().invoke(hander.getController(), req.getParameter("id"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		if("getMemberById".equals(url)) {
//			new MemberController().getMemberById(id);
//		}else if("getOrderById".equals(url)) {
//			new OrderController().getOrderById(id);
//		}else if("loginOut".equals(url)){
//			new SystemController().loginOut();
//		}else {
//			resp.getWriter().write("404 Not Found!!!");
//		}
	}
	class Hander{
		private Object controller;
		private Method method;
		private String uri;
		public Object getController() {
			return controller;
		}
		public Hander setController(Object controller) {
			this.controller = controller;
			return this;
		}
		public Method getMethod() {
			return method;
		}
		public Hander setMethod(Method method) {
			this.method = method;
			return this;
		}
		public String getUri() {
			return uri;
		}
		public Hander setUri(String uri) {
			this.uri = uri;
			return this;
		}
	}
}
