package cn.fanstar.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * Created by fanjun on 2018/2/25.
 */
public class PreRequestLogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext request = RequestContext.getCurrentContext();

        System.out.println(String.format("send %s request to %s ", request.getRequest().getMethod(),  request.getRequest().getRequestURL()));

        return null;
    }
}
