package cn.itcast.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//测试拦截器1
public class HandlerInterceptor1 implements HandlerInterceptor{

	//进入Handler方法之前
	//用于身份认证、身份授权
	//比如身份认证,如果认证通过表示当前用户没有登陆,需要此方法拦截不在执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		//return false表示拦截,不向下执行,true表示执行
		System.out.println("HandlerInterceptor1......preHandle");
		return true;
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
