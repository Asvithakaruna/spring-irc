package com.example.project1.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.JeeApplication.JeeModel;
import com.example.project1.Repository.JeeRepository;
import com.example.project1.Service.JeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class JeeController {

	@Autowired
	public JeeService jser;
	
	//Post
	@Tag(name="Posting",description="Posting the given details")
	@PostMapping("/saveJee")
	public JeeModel addDetails(@RequestBody JeeModel jm)
	{
		return jser.saveinfo(jm);
	}
	
	//Get
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/saveJee/{id}")
	public Optional<JeeModel>getdetails(@PathVariable("id") int id)
{
	return jser.getdetails(id);
}
	//update
	@Tag(name="Updating",description="Update the given details")
	@PutMapping("/update")
	public JeeModel updatedetails(@RequestBody JeeModel id)
	{
		return jser.updatedetails(id);
	}
	
	//delete
	@Tag(name="Deleting",description="To delete the detail")
	@DeleteMapping("/saveJee/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		jser.deletedetails(id);
		return "deleted successfully";
	}
	//sort by descending order
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/sortAsc/{canditatename}")
	public List<JeeModel> sortcanditate(@PathVariable("canditatename") String canditatename)
	{
		return jser.sortAsc(canditatename);
	}
	//sort by ascending order
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/sortDesc/{canditatename}")
	public List<JeeModel>sortcanditates(@PathVariable("canditatename")String canditatename)
	{
		return jser.sortDesc(canditatename);
	}
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/pagination/{pgn}/{pgs}")
	public List<JeeModel>paginationData(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
	{
		return jser.paginationData(pgn,pgs);
	}
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/paginationsorting/{pgn}/{pgs}/{canditatename}")
	public List<JeeModel>paginationSorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("canditatename")String canditatename)
	{
		return jser.paginationAndSorting(pgn,pgs,canditatename);
	}
	@Autowired
	public JeeRepository jsr;
	//Query
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/Jee")
	public List<JeeModel> getD()
	{
		return jsr.getAllData();
	}
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/byName/{id}")
	public List<JeeModel>getName(@PathVariable("id") int id)
	{
		return jsr.bycanditatename(id);
	}
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/startend/{start}/{end}")
	public List<JeeModel>startendId(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return jsr.startEnd(start,end);
	}
	
	@Tag(name="Deleting",description="To delete the detail")
	@DeleteMapping("/deletebyid/{id}/{name}")
	public String deletePerson(@PathVariable("id")int id,@PathVariable("name")String name)
	{
		jsr.deleteId(id,name);
		return "deleted";
	}
	
	@Tag(name="Updating",description="Update the given details")
	@PutMapping("/updatequery/{id}/{name}")
	public void updateByQuery(@PathVariable("id")int id,@PathVariable("name")String name)
	{
		jsr.updateByQuery(id, name);
	}
	
	//jpql query
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/jpqlget/{name}")
	public List<JeeModel>getdetailname(@PathVariable("name")String name)
	{
		return jsr.getjpqlname(name);
	}
	
	@Tag(name="Get details",description="To get the required detail")
	@GetMapping("/getbtw/{start}/{end}")
	public List<JeeModel>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return jsr.getbtw(start, end);
	}
	
	@Tag(name="Deleting",description="To delete the detail")
	@DeleteMapping("/deletejpql/{id}")
	public String deletejpqlid(@PathVariable("id")int id)
	{
		jsr.deletejpqlid(id);
		return "Deleted successfully";
	}
	
	@Tag(name="Updating",description="Update the given details")
	public void updatejpql(@PathVariable("a")String a,@PathVariable("b")int b)
	{
		jsr.updatejpql(a,b);
	}
	
	//login
	@Tag(name="Posting",description="Posting the given details")
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> logindata)
	{
		String uname=logindata.get("uname");
		String password=logindata.get("password");
		String result=jser.checklogin(uname,password);
		return result;
		
	}
}
