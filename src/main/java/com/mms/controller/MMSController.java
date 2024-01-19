package com.mms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mms.bean.Movie;
import com.mms.dao.MovieDAO;

@RestController
@CrossOrigin("http://localhost:4200")
public class MMSController {
	@Autowired
	MovieDAO dao;

	@PostMapping("PerformInsert")
	public String performInsert(@RequestBody Movie mov) {
		dao.save(mov);
		return "Inserted";
	}

	@PutMapping("PerformUpdate")
	public String performUpdate(@RequestBody Movie mov) {
		dao.save(mov);
		return "Updated";
	}

	@DeleteMapping("PerformDelete/{id}")
	public String performDelete(@PathVariable int id) {
		dao.deleteById(id);
		return "Deleted";
	}

	@GetMapping("FindAllMovie")
	public List<Movie> getAllMovies() {
		Iterator<Movie> it = dao.findAll().iterator();
		ArrayList<Movie> list = new ArrayList<Movie>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
