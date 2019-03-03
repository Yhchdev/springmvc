package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();

        //login或登陆请求放行,不拦截
        if(url.indexOf("/tologin")>0 || url.indexOf("/login")>0){
            return true;
        }
        //获取session
        HttpSession session = request.getSession();
        Object obj =session.getAttribute("user");
        //已经登陆,放行
        if(obj!=null){
            return true;
        }else {
            //未登陆,且不是登陆请求和去往登陆页面
            request.setAttribute("msg","还没登陆，请先登陆");
            request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
    }
}
