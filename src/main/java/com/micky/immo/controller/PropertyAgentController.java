package com.micky.immo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micky.immo.key.PropertyAgentKey;
import com.micky.immo.model.PropertyAgent;
import com.micky.immo.service.AgentService;
import com.micky.immo.service.PropertyAgentService;

@Controller
@RequestMapping("/property-agent")
public class PropertyAgentController {
    @Autowired
    private PropertyAgentService propertyAgentService;

    @GetMapping("/{agentId}/list")
    public String list(@PathVariable("agentId") Long agentId, Model model, AgentService agentService) {
        model.addAttribute("propertyAgents", propertyAgentService.findByAgentId(agentId));
        model.addAttribute("agent", agentService.findById(agentId));
        return "propertyAgent/list";
    }

    @GetMapping("/add")
    public String displayAddForm(PropertyAgent propertyAgent) {
        return "propertyAgent/add";
    }

    @PostMapping("/add")
    public String processAdd(PropertyAgent propertyAgent) {
        propertyAgentService.add(propertyAgent);
        return "redirect:/propertyAgent/list";
    }

    @GetMapping("/update/{id}")
    public String displayUpdateForm(@PathVariable("id") PropertyAgentKey id, Model model) {
        PropertyAgent propertyAgent = propertyAgentService.findById(id);
        model.addAttribute("propertyAgent", propertyAgent);
        return "propertyAgent/update";
    }

    @PostMapping("/update")
    public String processUpdate(PropertyAgent propertyAgent) {
        propertyAgentService.update(propertyAgent);
        return "redirect:/propertyAgent/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") PropertyAgentKey id) {
        propertyAgentService.delete(id);
        return "redirect:/propertyAgent/list";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/propertyAgent/list";
    }
}
