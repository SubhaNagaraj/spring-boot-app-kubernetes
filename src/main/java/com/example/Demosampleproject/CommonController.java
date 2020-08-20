package com.example.Demosampleproject;

import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/")
public class CommonController {

	@GetMapping
	public Map<String, String> sayHello(HttpServletRequest request, HttpServletResponse response) throws UnknownHostException {
		String hostname;
		InetAddress ip;
		HashMap<String, String> map = new HashMap<>();
		String clintHost = request.getRemoteHost();
		String clintHostName = request.getServerName();
		ip = InetAddress.getLocalHost();
		hostname = ip.getHostName();
		map.put("IpAddress", clintHost);
		map.put("hostname", hostname);
		return map;
	}
	@GetMapping(value = "/api")
	public HashMap<String, String> mutipleTwoNumbers(@RequestParam(required = true) String orderNo,
			@RequestParam(required = true) String itemCount,
			@RequestParam(required = true) String itemPrice) 
					throws UnknownHostException {
		String returnValue;
		HashMap<String, String> map = new HashMap<>();

		int i = Integer.parseInt(itemCount);
		int j = Integer.parseInt(itemPrice);
		int k= i*j;
		System.out.println("orderNo :" + orderNo);		
		System.out.println("itemCount :" + itemCount);
		System.out.println("itemPrice :" + itemPrice);
		System.out.println("Result is :" + k);
		
		String iC = "itemCount";
		String iP = "itemPrice";
		String Result = ""+ k;
		map.put("orderNo", orderNo);
		map.put(iC, itemCount);
		map.put(iP,itemPrice);
		map.put("orderValue",Result);
		map.put("Remarks", "This order should include ONE gift! in the Delivery Remark section");
//		map.put("IpAddress", clintHost);
		return map; 
		}
		}

















