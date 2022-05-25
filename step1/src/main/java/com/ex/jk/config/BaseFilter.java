package com.ex.jk.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class BaseFilter implements Filter {

    @Override
    public void init(FilterConfig config) throws ServletException {
        log.debug("[BaseFilter]init ----------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException{
        log.debug("[BaseFilter]doFilter() begin -----------------------");
        filterChain.doFilter(request, response);
        log.debug("[BaseFilter]doFilter() end -----------------------");
    }

    @Override
    public void destroy(){

    }
}
