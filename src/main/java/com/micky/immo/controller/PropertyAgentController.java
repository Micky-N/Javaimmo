package com.micky.immo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micky.immo.model.PropertyAgent;
import com.micky.immo.service.AgentService;
import com.micky.immo.service.PropertyAgentService;
import com.micky.immo.service.PropertyService;

@Controller
@RequestMapping("/property-agent")
public class PropertyAgentController {
    @Autowired
    private PropertyAgentService propertyAgentService;

    @Autowired
    private AgentService agentService;

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("propertyAgents", propertyAgentService.getAll());
        return "propertyAgent/list";
    }

    @GetMapping("/add")
    public String displayAddForm(PropertyAgent propertyAgent, Model model) {
        model.addAttribute("agents", agentService.getAll());
        model.addAttribute("properties", propertyService.getAll());
        return "propertyAgent/add";
    }

    @PostMapping("/add")
    public String processAdd(PropertyAgent propertyAgent) {
        propertyAgentService.add(propertyAgent);
        return "redirect:/propertyAgent/list";
    }

    @GetMapping("/update/{agentId}/{propertyId}")
    public String displayUpdateForm(@PathVariable("agentId") Long agentId, @PathVariable("propertyId") Long propertyId,
            Model model) {
        PropertyAgent propertyAgent = propertyAgentService.findById(agentId, propertyId);
        model.addAttribute("propertyAgent", propertyAgent);
        model.addAttribute("agents", agentService.getAll());
        model.addAttribute("properties", propertyService.getAll());
        return "propertyAgent/update";
    }

    @PostMapping("/update")
    public String processUpdate(PropertyAgent propertyAgent) {
        propertyAgentService.update(propertyAgent);
        return "redirect:/propertyAgent/list";
    }

    @GetMapping("/delete/{agentId}/{propertyId}")
    public String delete(@PathVariable("agentId") Long agentId, @PathVariable("propertyId") Long propertyId) {
        propertyAgentService.delete(agentId, propertyId);
        return "redirect:/propertyAgent/list";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/propertyAgent/list";
    }
}
