package com.example.day3.IPLService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.Model.IPL;
import com.example.day3.Repository.IPLrepo;
@Service
public class IPLservice {
@Autowired
	public IPLrepo irepo;
	
	public IPL saveInfo(IPL im)
	{
		return irepo.save(im);
	}
}
