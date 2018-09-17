package com.alibaba.edas.carshop.detail;

import com.alibaba.edas.carshop.itemcenter.model.User;
import com.alibaba.edas.carshop.itemcenter.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
public class StartListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
//		final ItemService itemService = ( ItemService ) ctx.getBean( "item" );
//		Thread thread = new Thread( new Runnable() {
//			@Override
//			public void run() {
//				while ( true ) {
//					try {
//						Thread.sleep( 500l );
//						System.out.println( itemService.getItemById( 1111 ) );
//						System.out.println( itemService.getItemByName( "myname is le" ) );
//					} catch ( Throwable e ) {
//						e.printStackTrace();
//					}
//				}
//			}
//		} );
        final UserService userService = (UserService) ctx.getBean("user");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500l);
                    User user = userService.getUserById(1);
                    System.out.println(user);
                    System.out.println("--------------------------------------------------------");
//                        userService.setUserName(user, "ZL");
                    user.setName("ZZZ");
                    System.out.println("a:" + user);
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    }

}
