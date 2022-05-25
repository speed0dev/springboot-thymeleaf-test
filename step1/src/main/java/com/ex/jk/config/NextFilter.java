package com.ex.jk.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;

import java.io.IOException;

@Slf4j
public class NextFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.debug("[NextFilter] init() ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.debug("[NextFilter]doFilter() begin -----------------------");
        chain.doFilter(request, response);
        log.debug("[NextFilter]doFilter() end -----------------------");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
