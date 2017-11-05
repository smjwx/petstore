package com.newer.petstore.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.newer.petstore.domain.Cart;

/**
 * Application Lifecycle Listener implementation class CartListener
 *
 */
@WebListener
public class CartListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public CartListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	
    	//创建会话时，创建一个购物车
    	Cart cart = new Cart();
    	se.getSession().setAttribute("cart",cart);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    }
	
}
