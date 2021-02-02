package com.study.demo.common;

import com.google.gson.Gson;
import com.study.demo.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    private final static Log logger = LogFactory.getLog(TokenInterceptor.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        try {
            logger.info("进入拦截器喽！");
            String authorization = request.getHeader("Authorization");
            String token = authorization.replace("Bearer ","");
            Object o = redisTemplate.opsForValue().get(token);
            if(Objects.nonNull(o)){
                Gson gson = new Gson();
                User user = gson.fromJson(o.toString(), User.class);
                UserContext.setUser(user);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub

    }

}
