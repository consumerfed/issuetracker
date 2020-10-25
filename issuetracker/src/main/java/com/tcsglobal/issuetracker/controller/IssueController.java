/**
 * 
 */
package com.tcsglobal.issuetracker.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.tcsglobal.issuetracker.model.Issue;

/**
 * @author Apple
 *
 */
public class IssueController {

	@PostMapping("/issue")
	public String createIssue(@ModelAttribute Issue issue, Model model) {
		model.addAttribute("issue", issue);
		return "result";
	}

	@GetMapping("/issue")
	public String getIssue(Model model) {
		model.addAttribute("issue", new Issue());
		return "issue";
	}
}
