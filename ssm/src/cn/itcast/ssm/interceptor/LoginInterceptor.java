package cn.itcast.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//登陆认证拦截器
public class LoginInterceptor implements HandlerInterceptor{

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		//获取请求的url
		String url = request.getRequestURI();
		
		//判断url是否是公开地址(实际使用时将公开地址配置到配置文件中)
		//这里公开地址是登陆提交的地址
		if(url.indexOf("login.action") >= 0) {
			//表示在进行登陆提交,放行
			return true;
		}
		
		//判断session
		HttpSession session = request.getSession();
		
		//从session中取出用户身份信息
		String username = (String) session.getAttribute("username");
		if(username != null) {
			//身份存在,放行
			return true;
		}
		
		//执行到这里表示用户身份需要认证,跳转登陆页面
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}
	
	//进入Handler方法之后,返回mv之前执行
	//应用场景从mv出发:将公用的模型数据在这里传到视图(比如菜单导航栏),也可以在这里统一指定视图
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("HandlerInterceptor1......postHandle");
	}
	
	//执行Handler完成执行此方法
	//应用场景:统一异常处理,统一日志处理
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptor1......afterCompletion");
	}

	

	

}
