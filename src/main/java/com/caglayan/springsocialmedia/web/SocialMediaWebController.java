package com.caglayan.springsocialmedia.web;

import com.caglayan.springsocialmedia.entity.SocialMedia;
import com.caglayan.springsocialmedia.entity.Subscriber;
import com.caglayan.springsocialmedia.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/socials")
public class SocialMediaWebController {
    private final SocialMediaService socialMediaService;

    @Autowired
    public SocialMediaWebController(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    @GetMapping
    public String getAllSocials(Model model){
        List<SocialMedia> socials = socialMediaService.getAllSocialMedias();
        model.addAttribute("socials", socials);
        return "socials";
    }

    @PostMapping("/create")
    public String createSocial(@ModelAttribute SocialMedia socialMedia, Model model ) {
        socialMediaService.insertSocialMedia(socialMedia);
        return "redirect:/";
    }

    @GetMapping("/create")
    public String registerSocial(Model model){
        model.addAttribute("social", new SocialMedia());
        return "registersocial";
    }
}
