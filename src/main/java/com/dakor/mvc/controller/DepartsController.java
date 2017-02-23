package com.dakor.mvc.controller;

import com.dakor.service.IDepartmentService;
import com.dakor.service.dto.DepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * .
 *
 * @author dkor
 */
@Controller
@RequestMapping("app/departs")
public class DepartsController {
	private IDepartmentService departmentService;

	@Autowired
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@GetMapping
	public String getDepartments(Model model) {
		model.addAttribute("departs", departmentService.getAll());

		return "fragments/departs-table :: table";
	}

	@GetMapping("form")
	public String showDialog(@ModelAttribute("depart") DepartmentDto department, Model model) {
		return "fragments/depart-dialog :: depart-dialog";
	}
}
